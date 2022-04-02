package main.java.datastructures;

import java.util.*;
import java.util.Map.*;
/*
 * @author amarnath-nitt on 02-04-2022;
 */
public class Map {
    public static void main(String []args){
        LinkedHashMap<String,Integer> mp = new LinkedHashMap<>();
        mp.put("Name", 1);
        mp.put("Class", 7);
        mp.put("Section", 2);
        mp.put("Age", 22);
        mp.put("Height", 22);
        System.out.println("Print using entrySet: ");
        printMapUsingEntrySet(mp);
        System.out.println("Print using keySet: ");
        printMapUsingKeySet(mp);
        System.out.println("Print using iterator: ");
        printMapUsingIterator(mp);
        System.out.println("Print using Stream: ");
        printMapUsingStream(mp);
    }
    public static void printMapUsingEntrySet(HashMap<String, Integer>mp){
        for(Entry<String, Integer> entry : mp.entrySet()){
            System.out.println("Key: " + entry.getKey() + " " + "Value: " + entry.getValue());
        }
    }
    public static void printMapUsingKeySet(HashMap<String, Integer>mp){
        Set<String> keySet = mp.keySet();
        for(String key: keySet){
            System.out.println("Key: " + key + " " + "Value: " + mp.get(key));
        }
    }
    public static void printMapUsingIterator(HashMap<String, Integer>mp){
        Iterator<Entry<String, Integer>> it = mp.entrySet().iterator();
        while(it.hasNext()){
            Entry<String, Integer> entry = it.next();
            System.out.println("Key: " + entry.getKey() + " " + "Value: " + entry.getValue());
        }
    }
    public static void printMapUsingStream(HashMap<String, Integer>mp){
        mp.entrySet().stream().forEach(e -> {
            System.out.println("Key: " + e.getKey() + " " + "Value: " + e.getValue());
        });
    }
}
