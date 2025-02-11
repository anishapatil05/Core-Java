package com.anisha.collectionfw.demo;

import java.util.*;

public class Methods {

	public static void main(String[] args) {

//		ArrayList 1
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(1);
		numbers.add(8);
		numbers.add(9);
		numbers.add(6);

//        ArrayList 2
		ArrayList<Integer> numbers2 = new ArrayList<>();
		numbers2.add(8);
		numbers2.add(9);
		numbers2.add(3);
		numbers2.add(6);
		numbers2.add(1);

		System.out.println(numbers);
		System.out.println(numbers.size());

		System.out.println(numbers2);
		System.out.println(numbers2.size());

//          Creating sublist of numbers ArrayList
		List<Integer> newList = numbers.subList(2, 7);
		System.out.println(newList); // [3,4,5,1,8]

//        Searching element is present or not 
		System.out.println(numbers.contains(1));

//        searcing all elements of numbers2 is present in numbers if 1.true 2.false

		System.out.println(numbers.containsAll(numbers2));

//        To get specific indexOf element in to ArrayList - if duplicate elemnts then it gives first occorence
		System.out.println(numbers.indexOf(1)); // 0

		System.out.println(numbers.lastIndexOf(1)); // 5

//        Removes First element in the array
		numbers.removeFirst();
		System.out.println(numbers); // [2, 3, 4, 5, 1]

//           Removes Last element in the array
		numbers2.removeLast();
		System.out.println(numbers2); // [8, 9, 3, 6]

		System.out.println("reversed");
		List<Integer> newArrayList = numbers.reversed();
		System.out.println(newArrayList); // [1, 5, 4, 3, 2]

//          retainsAll() ->  unique elements in the ArrayList
		numbers2.retainAll(numbers);
		System.out.println(numbers2); // [1,3]

		// removeAll() --> removes duplicate elemnts in the ArrayList
		numbers.removeAll(numbers2);
		System.out.println(numbers); // [2,4,5]

//        Adding elemnt to specific position 
		numbers.add(2, 9);
		System.out.println(numbers); // [2,4,9,5]

//        Merging numbers2 to numbers    
		numbers.addAll(numbers2);
		System.out.println(numbers);
		System.out.println(numbers.size());

//        numbers2 ArrayList  becoms as it is
		System.out.println(numbers2);
		System.out.println(numbers2.size());

//         Merginig numbers in to numbers2   
		numbers2.addAll(numbers);
		System.out.println(numbers2); // [8, 9, 3, 6, 1,1, 2, 9, 3, 4, 5, 1, 8, 9, 3, 6, 1]
		System.out.println(numbers2.size()); // 5 + 12 = 17

//        Remove specific elemnt in the ArrayList 
		numbers.remove(Integer.valueOf(2));
		System.out.println(numbers);

//        Creating Empty newArrayList  
		ArrayList<Integer> numbers3 = new ArrayList<>();

		if (numbers3.isEmpty()) {
			System.out.println("Your AyyaList is empty");
		}
//          
//          another way
//          if(numbers3.size() == 0)
//          {
//        	  System.out.println("Your AyyaList is empty");
//          }
	}

}
