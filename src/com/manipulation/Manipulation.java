package com.manipulation;

import java.io.*;
import java.util.*;

public class Manipulation {
    public static void main(String[] args) {
        int i;
        int a;
        String s;
        ArrayList<String> arr = new ArrayList<String>();
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        Comp comp = new Comp(map);
        TreeMap<String, Integer> tmap = new TreeMap<String, Integer>(comp);
        File file = new File("C:\\Users\\Misha\\Desktop\\Test.txt");
        try (
                FileInputStream f = new FileInputStream(file);
                BufferedReader br = new BufferedReader(new InputStreamReader(f));) {

            while ((s = br.readLine()) != null) {
                arr.add(s);
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        for (i = 0; i < arr.size(); i++) {
            s = arr.get(i);
            Integer povtor = map.get(s);
            map.put(s, povtor == null ? 1 : povtor + 1);
        }
        tmap.putAll(map);
        for (Map.Entry e : tmap.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}

class Comp implements Comparator<String> {

    Map<String, Integer> base;

    public Comp(HashMap<String, Integer> map) {
        this.base = map;
    }

    public int compare(String a, String b) {
        if (base.get(a) >= base.get(b)) {
            return -1;
        } else {
            return 1;
        }
    }

}





