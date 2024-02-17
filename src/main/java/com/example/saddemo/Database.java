package com.example.saddemo;
import java.sql.*;



public class Database {

    private static Database instance;
    private static Connection connection;
    private static  boolean flag ;

    public static boolean isFlag() {
        return flag;
    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public Connection connectDB() {
        try {
            if (connection == null || connection.isClosed()) {

                connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mydatabase", "root", "root");
            }
            return connection;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /*Methods of usage */


    public static boolean user_login_check_info(int id, String password) throws SQLException {
        try {

            PreparedStatement ps = connection.prepareStatement("SELECT * FROM librarian WHERE id = ? AND password = ?");
            ps.setInt(1, id);
            ps.setString(2, password);
            ResultSet resultSet = ps.executeQuery();
            if (resultSet.next()) {
                flag=true ;
                return true;
            } else {
                ps = connection.prepareStatement("SELECT * FROM user WHERE userid = ? AND password = ?");
                ps.setInt(1, id);
                ps.setString(2, password);
                 resultSet = ps.executeQuery();
                 if (resultSet.next()){
                     flag=false;
                     return true;
                 }
                 else {
                     return false;
                 }

            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


    public static boolean register(int id, String password,String firstname , String lastname  , String email, String streetName, String countryName, String governName, String cityName, int blockNumber ) throws Exception {
        try {

            PreparedStatement ps = connection.prepareStatement("SELECT * FROM user WHERE userid = ? "); // check for if the  id is already in database
            ps.setInt(1, id);
            ResultSet resultSet = ps.executeQuery();
            if (resultSet.isBeforeFirst()) {
                return false;
            } else {
                ps = connection.prepareStatement("INSERT INTO user (userid, password,firstname,lastname,email,addressBlockNumber,govermentName,countryNAME,cityNAME,streetName) VALUES (?,?,?,?,?,?,?,?,?,?)");
                ps.setInt(1, id);
                ps.setString(2, password);
                ps.setString(3,firstname);
                ps.setString(4,lastname);
                ps.setString(5,email);
                ps.setInt(6,blockNumber);
                ps.setString(7,governName);
                ps.setString(8,countryName);
                ps.setString(9,cityName);
                ps.setString(10,streetName);
                ps.executeUpdate();
                return true;

            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void addBook(int book_id, boolean Isavailable, String title, String Auhtor) {
        try {
            PreparedStatement ps = connection.prepareStatement("INSERT INTO book (bookId, isAvailable, title, author) VALUES (?, ?, ?, ?)");
            ps.setInt(1, book_id);
            ps.setBoolean(2, Isavailable);
            ps.setString(3, title);
            ps.setString(4, Auhtor);
            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Book added successfully.");
            } else {
                System.out.println("Failed to add the book.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    public static void deleteBook(int bookId) {
        try {
            PreparedStatement ps = connection.prepareStatement("DELETE FROM book WHERE bookId = ?");

            ps.setInt(1, bookId);

            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Book deleted successfully.");
            } else {
                System.out.println("No book found with the given ID or deletion failed.");
            }

        } catch (SQLException e) {
            e.printStackTrace(); // Handle the exception appropriately in your application
        }
    }


    public static void updateBook_availability(int book_id, boolean Isavailable) {

        try {
            PreparedStatement ps = connection.prepareStatement("UPDATE book SET isAvailable = ? WHERE bookId = ?");
            ps.setBoolean(1, Isavailable);
            ps.setInt(2, book_id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(); // Handle the exception appropriately in your application
        }
    }

    public static void updateBook_title(int book_id, String title) {

        try {
            PreparedStatement ps = connection.prepareStatement("UPDATE book SET title = ? WHERE bookId = ?");
            ps.setString(1, title);
            ps.setInt(2, book_id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(); // Handle the exception appropriately in your application
        }
    }

    public static void updateBook_author(int book_id, String author) {
        try {
            System.out.println("done");
            PreparedStatement ps = connection.prepareStatement("UPDATE book SET author = ? WHERE bookId = ?");
            ps.setString(1, author);
            ps.setInt(2, book_id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(); // Handle the exception appropriately in your application
        }
    }


    public static Boolean searchBookbyauthor(String author) {
        try {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM book WHERE author = ? ");
            ps.setString(1, author);
            ResultSet resultSet = ps.executeQuery();
            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }

    public static Boolean searchBookbyID(int id) {
        try {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM book WHERE bookId  = ? ");
            ps.setInt(1, id);
            ResultSet resultSet = ps.executeQuery();
            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }
    public static Boolean searchBookbyStatus(Boolean status) {
        try {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM book WHERE isAvailable  = ? ");
            ps.setBoolean(1, status);
            ResultSet resultSet = ps.executeQuery();
            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }
    public static Boolean searchBookbyTitle(String title) {
        try {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM book WHERE title = ? ");
            ps.setString(1, title);
            ResultSet resultSet = ps.executeQuery();
            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }


    public static boolean reserveBook(int userId , int bookid , int count ) {
        if(Boolean.TRUE.equals(searchBookbyID(bookid))) {
            updateBook_availability( bookid, false);
            try {
                // Update the numberofborrowedBooks in the user table
                PreparedStatement ps = connection.prepareStatement("UPDATE user SET numberofborrowedBooks = ? WHERE userid = ?");
                ps.setInt(1, count);
                ps.setInt(2, userId);
                ps.executeUpdate();
                return true;

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }
        else return false;
    }

    public static void setEndDate(Date endDate){

    }

    public static int getNumberOfBorrowedBooks(int userId) {
        int numberOfBorrowedBooks = 0;

        try {



            try (PreparedStatement preparedStatement = connection.prepareStatement("SELECT COUNT(*) FROM user WHERE userid = ?")) {
                preparedStatement.setInt(1, userId);
                // Execute the query
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    if (resultSet.next()) {
                        // Retrieve the count of borrowed books
                        numberOfBorrowedBooks = resultSet.getInt(1);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return numberOfBorrowedBooks;
    }


}

//






