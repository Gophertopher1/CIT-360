package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;


public class Collections1 {


    public static void main(String[] args) {
        
    
    
        ArrayList<String> letter = new ArrayList<String>();
        letter.add("a");
        letter.add("b");
        letter.add("c");
        letter.add("d");
        
        letter.remove("e");

        System.out.println(letter);



        LinkedList<String> c1 = new LinkedList<String>();
        c1.add("Alpha One");
        c1.add("Brovo One");
        c1.add("Charlie One");
        c1.add("Delta One");
        
        c1.remove("Brovo one");

        for(String s: c1) {
          System.out.println(s);
        }

        HashMap<String, Integer> points = new HashMap<String, Integer>();
        points.put("Me", 154);
        points.put("Cat", 42);
        points.put("Mom", 733);
        System.out.println(points.get("Cat")); 


        HashSet<String> set = new HashSet<String>();
        set.add("123");
        set.add("456");
        set.add("789");
        System.out.println(set);

        ArrayList<String> names = new ArrayList<String>();
        names.add("Christopher");
        names.add("Keven");
        names.add("Bryan");
        names.add("Matthew");

        Collections.sort(names);

        System.out.println(names);


        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(31);
        nums.add(3);
        nums.add(3);
        nums.add(14);
        nums.add(11);

        Collections.sort(nums);
        System.out.println(nums);

        LinkedList<String> Citys = new LinkedList<String>();
        Citys.add("Idaho Falls");
        Citys.add("Rigby");
        Citys.add("Rexburg");
        Citys.add("Augsburg");

        Iterator<String> ci = Citys.iterator();
        String value = ci.next();
        System.out.println(value);
    
    
    }
    
}
