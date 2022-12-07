package com.Andrej;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	List<Integer>list=new ArrayList<Integer>();
	list.add(4);
	list.add(5);
	list.add(1);
	list.add(15);
	list.add(2);
		System.out.println("Listata pred sortiranje: " + list);
    Collections.sort(list);
		System.out.println("Listata posle sortiranje: " + list);
    }
}
