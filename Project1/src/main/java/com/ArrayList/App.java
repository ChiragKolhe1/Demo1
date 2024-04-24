package com.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        List<Integer> l = new ArrayList<Integer>();
        l.add(20);
        l.add(52);
        l.add(23);
        l.add(59);
        
        l.forEach(e->System.out.println(e));
        System.out.println(l.contains(56));
        System.out.println(l.indexOf(20));
        	
        
        
        for(int i=0; i<l.size()/2; i++) {
        	int temp=l.get(i);
        	l.set(i, l.get(l.size()-1));
        	l.set(l.size()-1, temp);
        }
        
        System.out.println(l);
    }
}
