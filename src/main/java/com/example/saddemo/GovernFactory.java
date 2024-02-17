package com.example.saddemo;

import java.util.HashMap;

public class GovernFactory {
    private String name;
    private AGovern govern;

    static HashMap<String , GovernType> governType = new HashMap();

    public GovernType getAddressType(String name ) {

        GovernType result = governType.get(name);

        if (result == null) {
            result = new GovernType(name,govern);
            governType.put(name,result);
        }
        return result;
    }

}
