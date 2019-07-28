package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class saheed {
	
	static void validate(int a){
		
		if(a>10)
		
			throw new ArithmeticException("saheed inside");
		
		else
		
			System.out.println("Good");
		
		
	}

	public static void main(String[] args) {
		System.out.println("Jaiguru");
		//validate(12);
//		int b[]=new int[4];
//		
//		try {
//			int i = 100 / 0;
//		} 
//		
//		catch (ArithmeticException ae) {
//			System.out.println("Arithmetic Exception name : - > " + ae);
//		} 
		
		
		ArrayList al = new ArrayList();
		al.add(1);
		al.add("saheed");
		al.add("12.45");
		
		Iterator it=al.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		for(Object s:al)
			System.out.println(s);
		
		String s="sah kum sahoo sah";
		char[] sah=s.toCharArray();
		String[] ar=s.split(" ");
		
		HashMap<String,Integer> obj_hm=new HashMap<String,Integer>();
		for(String d:ar)
		{
			System.out.println(d);
		if(obj_hm.containsKey(d))
		{
			obj_hm.put(d, obj_hm.get(d)+1);
		}
		else
		{
			obj_hm.put(d,1);
		}
		}
		System.out.println(obj_hm);
		
		String str ="saheed kumar sahoo",str2="";
		ArrayList al1=new ArrayList();
		char[] a=str.toCharArray();
		
		char[] b;

			for(int j=a.length-1;j>=0;j--)
			{
				al1.add(a[j]);
			}
		
			System.out.println(al1);
//		for(int i=str.length()-1;i>=0;i--)
//		{
//			str2=str2+str.charAt(i);
//			//System.out.println(str2);
//		}
//		System.out.println(str2);
		//ar.foreach((n) -> system.out.println(n));
			
//		al.forEach((n) -> System.out.println(n));
//
//		for (int i = 0; i < al.size(); i++) {
//			System.out.println(al.get(i).toString());
//		}
		
	}

}
