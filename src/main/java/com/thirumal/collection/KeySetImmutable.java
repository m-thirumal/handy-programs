package com.thirumal.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class KeySetImmutable {
	public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<>();
        
        hashMap.put("Key1", "String1");
        hashMap.put("Key2", "String2");
        hashMap.put("Key3", "String3");
        hashMap.put("Key4", "String4");
        
        Set<String> keySet = hashMap.keySet();
        
        keySet.add("Key4");
        
        System.out.println(hashMap.keySet());
        System.out.println(keySet);
    }
}
