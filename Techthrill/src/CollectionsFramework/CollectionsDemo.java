package CollectionsFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

import Healthcare.*;
public class CollectionsDemo {

	public static void arrayListDemo() {
		ArrayList<Integer> arrls = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		long i = 0;
		while(i<=100000) {
			System.out.print("Do you want to add an element (Y/N): ");
			String c = sc.next();
			
			if(c.equalsIgnoreCase("y")) {
				System.out.println("Enter the number to be added");
				int n =sc.nextInt();
				arrls.add(n);
			}
			else {
				break;
			}
			
		}
		
		for (int elements: arrls) {
			System.out.println(elements);		}
		
		ListIterator i2 = arrls.listIterator();
		while(i2.hasPrevious()) {
			System.out.println(i2.previous());
		}
		System.out.println();
		sc.close();
		
		
	}
	
	public static void arrayListDemo1() {
		ArrayList<Doctor> doctor = new ArrayList<Doctor>();
		Scanner sc =new Scanner(System.in);
		int i=0;
		while(i<=10000) {
			
			
			System.out.println("Do you want to enter the doctor details(Y/N): ");
			String arg = sc.next();
			
			if(arg.equalsIgnoreCase("y")) {
				System.out.println("Enter the Doctor Name: ");
				String dname = sc.next();
				System.out.println("Enter the Doctor ID: ");
				int did = sc.nextInt();
				System.out.println("Enter the doctor specialization: ");
				String spec = sc.next();
				System.out.println("Enter the Out Patient Timings of the Doctor");
				String t = sc.next();
				
				Doctor x = new Doctor(dname, did, spec, t);
				doctor.add(x);
			}
			else {
				break;
			}
			
			
		}
		for(Doctor d: doctor) {
			System.out.printf("%s \n",d.name);
			System.out.printf("%s \n", d.id);
			System.out.printf("%s \n", d.specialization);
			System.out.printf("%s \n", d.timings);
		}
		
		
		sc.close();
		
	}
	
	public static void displayDemoArrayList1() {
		
	}
	
	public static void demoPriorityQueue() {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		for(int i=10; i>0; i--) {
			pq.add(i);
		}
		//for normal queue- [tail]1 2 3 4 5 6 7 8 9 10[head]
		//for priority queue - [tail]10 9 8 7 6 5 4 3 2 1[head]
		System.out.println("Elements in Priority Queue"+pq);
		
		System.out.println("Element at head: "+pq.peek());
		//pq.poll();
		//System.out.println("Element at head after removal operation: "+pq.peek());
		//System.out.println("Elements in queue after removal operation: "+pq);
		
		int s = pq.size();
		for(int i=0;i<=s-1;i++) {
			System.out.println(pq.peek());
			pq.poll();
		}
	}
	public static void priorityQueuedemo(){
		PriorityQueue<String> priorityQueue = new PriorityQueue<String>();
		priorityQueue.add("Mumbai");
		priorityQueue.add("Bangalore");
		priorityQueue.add("Hyderabad");
		priorityQueue.add("Cheenai");
		System.out.println("Elements in priorityQueue: "+priorityQueue);
		
		while(!priorityQueue.isEmpty()) {
			System.out.println("Polling Elements: "+priorityQueue.poll());
			System.out.println("Elements in the Priority Queue: "+priorityQueue);
		}
	}
	
	public static void demoVector() {
		Vector a = new Vector();
		System.out.println("Vector size: "+a.size());
		Scanner sc = new Scanner(System.in);
		sc.close();
		a.add(3);
		a.add("Harshith");
		a.add(1000);
		a.add("Business Analyst");
		a.add(1000000);
		a.add("Full stack java web developer");
		a.add(6, "Strength");
		//a.add(8, "Bose");- can add elements to index only after filling the previous index i.e., cannot jump
		
		System.out.println("Vector size after entering elements: "+a.size());
		System.out.println("Vector at 6th position: "+a.get(5));
		System.out.println("Elements in vector: "+a);
		
		a.remove(0);
		System.out.println("Elements in vector after removal operation: "+a);
		//a.remove(0);
		//System.out.println("Vector after 2nd removal:"+a);
		
		//a.remove(0);
		//System.out.println("Vector after 3rd removal:"+a);
		
		//a.add(1, 100000000);
		a.set(3, 100000000);
		System.out.println("Vector after index specific alteration using set(index, value) : "+a);
		
		for(Object elements: a) {
			System.out.println(elements);
		}
		
		
		
		/* Default arraylist also exists just like vectors
		 * ArrayList ar = new ArrayList();
		ar.add(3);
		ar.add("Harshith");
		ar.add(1000);
		ar.add("Business Analyst");
		ar.add(1000000);
		ar.add("Full stack java web developer");
		
		System.out.println("Elements in default arraylist: "+ar);
		ar.remove(0);
		System.out.println("Elements in default arraylist after removal operation: "+ar);*/
	}
	
	public static void demoHashSet() {
		HashSet h = new HashSet();
		h.add("Harshith");
		h.add("Civil Services");
		h.add(1);
		h.add("Technical Professional");
		h.add(2);
		
		System.out.println("Elements in HashSet: "+h);
		
		h.remove(2);
		System.out.println("Hashset after removal: "+h);
		
		Iterator itr = h.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()+", ");
			//System.out.println();
		}
		/*for(Object element: h) {
			System.out.println(h);
		}*/
	}
	
	public static void demoLinkedHashSet() {
		Set<String> lhs = new LinkedHashSet<String>();
		
		lhs.add("Andhra Pradesh");
		lhs.add("Gujarat");
		lhs.add("Tamilnadu");
		lhs.add("Uttar Pradesh");
		lhs.add("Tamilnadu");
		
		System.out.println(lhs);
		
		lhs.remove("Tamilnadu");
		for(String i: lhs) {
			System.out.println(i);
		}
		System.out.println();
		
		Iterator<String> li = lhs.iterator();
		while(li.hasNext()) {
			String d = li.next();
			System.out.println(d);
		}
		System.out.println();
	}
	
	public static void demoTreeSet() {
		Set<Object> ts = new TreeSet();
		ts.add("Hello");
		ts.add("Rashmika");
		ts.add("High seas");
		ts.add("Harshith");
		//ts.add(4);
		//ts.add(6);
		//ts.add(8);
		System.out.println(ts);
		
		//check if above string exists in treeset 
		System.out.println("contains Harshith: "+ts.contains("Harshith"));
		
			//find the values greater than and lessthan given value
		String val = "Harshith";
		System.out.println("Value greater than Harshith: "+((TreeSet) ts).higher("High seas"));
		System.out.println("Value less than Hello: "+((TreeSet) ts).lower("Hello"));
		
		//find the first element of the treeset
		System.out.println("First Element of the tree set: "+((TreeSet) ts).first());
		
		//find the last element of the treeset 
		System.out.println("Last Element of the treeset: "+((TreeSet) ts).last());
		
		ts.remove("Hello");
		
		System.out.println("After removing: "+ts);
		
		((TreeSet) ts).pollFirst();
		((TreeSet) ts).pollLast();
		
		System.out.println("After removing first and last elements: "+ts);
		
	}
	
	public static void priorityQueuedemo1(){
		PriorityQueue<String> priorityQueue = new PriorityQueue<String>((s1,s2) -> Integer.compare(s1.length(), s2.length()));
		priorityQueue.add("Mumbai");
		priorityQueue.add("Bangalore");
		priorityQueue.add("Hyderabad");
		priorityQueue.add("Cheenai");
		System.out.println("Elements in priorityQueue: "+priorityQueue);
		
		while(!priorityQueue.isEmpty()) {
			System.out.println("Polling Elements: "+priorityQueue.poll());
			System.out.println("Elements in the Priority Queue: "+priorityQueue);
		}
	}
	
	public static void demoHashMap1() {
		Map<String, String> statesmappedbyleaders = new HashMap<String, String>();
		
		statesmappedbyleaders.put("Jammu & Kashmir", null);
		statesmappedbyleaders.put("Uttar Pradesh", "Yogi Adithyanath");
		statesmappedbyleaders.put("Uttarakhand", "Pushkar singh dhami");
		statesmappedbyleaders.put("Gujarat", "Bhupendra Patel");
		statesmappedbyleaders.put("Harayana", "Manoharlal Khattar");
		statesmappedbyleaders.put("Madhya Pradesh", "Mohan Yadav");
		statesmappedbyleaders.put("Chattisgarh", "Vishnu kumar Deo");
		statesmappedbyleaders.put("Rajasthan", "Bajanlal Sharma");
		
		System.out.println("Enter the state name to know the details of the chief minister: ");
		Scanner sc = new Scanner(System.in);
		String sn = sc.next();
		
		String cm = statesmappedbyleaders.get(sn);
		if(sn.isBlank()) {
			System.out.println("Sorry, Something went Wrong");
		}
		else {
			System.out.printf("Chief Minister: %s \n", cm);
		}
		
		if(sn.contains("Rajasthan")) {
			System.out.println("Rjasthan in the list");
		}
		
		Set<String> state = statesmappedbyleaders.keySet();
		
		Iterator<String> itr = state.iterator();
		while(itr.hasNext()) {
			String sname = itr.next();
			String cmin = statesmappedbyleaders.get(sname);
			
			System.out.println(sname+" \t "+cmin);
		}
		
		sc.close();
	}
	
	public static void demoTreeMap() {
		TreeMap<String, String> countriesMappedByLeaders = new TreeMap<String, String>();
		countriesMappedByLeaders.put("India", "Narendra Modi");
		countriesMappedByLeaders.put("United States", "Joe Biden");
		countriesMappedByLeaders.put("United Kingdom", "Rishi Sunak");
		countriesMappedByLeaders.put("France", "Emmanuel Macron");
		countriesMappedByLeaders.put("Russia", "Vladimir Putin");
		countriesMappedByLeaders.put("Brazil", "Lula de silva");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the country name to know its leader");
		
		String key = sc.next();
		if(countriesMappedByLeaders.containsKey(key)) {
			System.out.println(countriesMappedByLeaders.get(key));
		}
		else {
			System.out.println("No data");
		}
		
		System.out.println("Enter the name to know his stature: (Y/N)");
		char q =sc.next().charAt(0);
		
		if(q == 'Y') {
			System.out.println("Enter the name");
			String n = sc.next();
			
			if(countriesMappedByLeaders.containsValue(n)) {
				System.out.println("Yes "+n+" is the leader of a country");
			}
		}
		
		Set<Entry<String, String>> dcl = countriesMappedByLeaders.entrySet();
		Iterator<Entry<String, String>> i = dcl.iterator();
		
		while(i.hasNext()) {
			Entry<String, String> e = i.next();
			System.out.println(e.getKey()+" \t "+e.getValue());
		}
	}
	
	public static void demoHashMap() {
		 Map<Integer, Doctor> doctorsmappedbyid = new HashMap<Integer, Doctor>();
		 
		 Doctor d1 = new Doctor("Yugender", 100, "Physician", "6:00 to 7:30");
		 Doctor d2 = new Doctor("Sreekanth", 1010, "Orthopaedics", "2;00PM to 5:00PM");
		 Doctor d3 = new Doctor("Prardhana", 1032, "MBBS", "6:00PM to 9:00PM");
		 Doctor d4 = new Doctor(null,0,"Neurologist", null);
		 
		 
		 doctorsmappedbyid.put(d1.id, d1);
		 doctorsmappedbyid.put(d2.id, d2);
		 doctorsmappedbyid.put(d3.id, d3);
		 doctorsmappedbyid.put(d4.id, d4);
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the id of the doctor you want to know");
		 int id = sc.nextInt();
		 
		 Doctor d = doctorsmappedbyid.get(id);
		 if(d!=null) {
			 System.out.printf("Name %s, ID %s \n", d.name, d.id);
			 
		 }
		 else {
			 System.out.printf("No such Doctor of ID %S \n exist", id);
		 }
		
		 sc.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		arrlist.add(121);
		arrlist.add(144);
		arrlist.add(64);
		arrlist.add(36);
		
		//System.out.println(arrlist.get(2));
		ListIterator<Integer> i = arrlist.listIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println();
		
		while(i.hasPrevious()) {
			System.out.println(i.previous());
		}
		System.out.println();
		//priorityQueuedemo1();
		//demoHashMap();
		
		//arrayListDemo();
		//arrayListDemo1();
		//demoVector();
		//demoHashSet();
		
		//demoTreeSet();
		//demoHashMap1();
		
		//demoLinkedHashSet();
		//demoPriorityQueue();
		
		demoTreeMap();
		
	}

}
