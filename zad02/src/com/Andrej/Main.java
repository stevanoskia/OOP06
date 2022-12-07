package com.Andrej;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	List <String> list = new ArrayList<String>();
	list.add("Macedonia");
	list.add("Serbia");
	list.add("Germany");
	list.add("USA");

        if(list.size()==3) {
            list.add("Qatar");
            list.add("Sweeden");
            System.out.println(list);
        }
        else System.out.println(list);

    }
}
