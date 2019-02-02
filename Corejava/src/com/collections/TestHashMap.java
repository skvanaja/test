package com.collections;
import java.util.*;

public class TestHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "Ramu");
		hm.put(2, "uma");
		hm.put(3, "Anupama");
		System.out.println(hm.entrySet());
		for(Map.Entry m:hm.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
