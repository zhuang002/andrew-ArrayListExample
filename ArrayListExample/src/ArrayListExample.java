import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add("a String");
		al.add('c');
		al.add(1.333);
		
		System.out.println(al);
		
		al.add(1,100);
		System.out.println(al);
		
		al.remove(0);
		System.out.println(al);
		
		System.out.println(al.get(1));
		
		al.set(2, 1.555);
		System.out.println(al);
		
		System.out.println(al.contains('c')+","+al.contains("c"));
		System.out.println("the size of arrylist is "+al.size());
		
		ArrayList al2=new ArrayList();
		al2.add("hey");
		al2.add("buddy");
		al2.add('A');
		al2.add(100);
		al2.add(1.555);
		System.out.println("The contents of al2 : "+al2);
		
		ArrayList al1=(ArrayList)al.clone(); // does not same as al1=al;
		System.out.println("The contents of al1 : "+al1);
		System.out.println();
		al1.addAll(al2);
		System.out.println("The content of al1 after adding al2:" +al1);
		System.out.println("The content of al is: "+al);
		
		al1=(ArrayList)al.clone();
		al1.removeAll(al2);
		System.out.println("The content of al1 after removing al2:" +al1);
		System.out.println("The content of al is: "+al);
		System.out.println();
		
		al1=al;
		System.out.println("before change: al1="+al1+",al="+al);
		al1.add(true);
		System.out.println("after change: al1="+al1+",al="+al);
		
		System.out.println(al.isEmpty());
		
		for (Object obj:al) {
			System.out.print(obj+",");
		}
		System.out.println();
		
		System.out.println("the index of 'buddy' is: "+ al2.indexOf("buddy"));
		
		al.clear();
		System.out.println(al.isEmpty());
		
		try {
			System.out.println("al2 before sorting: "+al2);
			Collections.sort(al2);
			System.out.println("al2 after sorting: "+al2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		ArrayList<String> al3=new ArrayList();
		al3.add("abc");
		al3.add("ABC");
		al3.add("123");
		
		System.out.println("al3 before sorting:"+al3);
		Collections.sort(al3);
		System.out.println("al3 after sorting:"+al3);
		Collections.sort(al3,Collections.reverseOrder());
		System.out.println("al3 after sorting:"+al3);
	}

}
