package com.collections;
import java.util.*;

public class TestCollectionHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hs = new HashSet<String>();
		hs.add("Ravi");
		hs.add("Anu");
		hs.add("Ravi");
		hs.add("kiran");
		//added line
		Iterator itr = hs.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
