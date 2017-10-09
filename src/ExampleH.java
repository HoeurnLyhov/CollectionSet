import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;


public class ExampleH {

	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<Integer>();
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		TreeSet<Double> ts=new TreeSet<Double>();
		
		hs.add(10);
		hs.add(20);
		hs.add(7);
		hs.add(15);
		hs.add(13);
		hs.add(2);
		
		lhs.add("ABCd");
		lhs.add("jhd");
		lhs.add("ajfS");
		
		ts.add(12.9);
		ts.add(2.5);
		ts.add(10.7);
		
		System.out.println(hs);
		System.out.println(lhs);
		System.out.println(ts);
		
		
		
		

	}

}
