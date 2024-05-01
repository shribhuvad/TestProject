import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class LIst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ArrayList patrn1 = new ArrayList();
		patrn1.add(1);
		patrn1.add(5);
		patrn1.add(3);
		patrn1.add(4);
		patrn1.add(2);
		//patrn1.remove(5);
		Collections.sort(patrn1);
		System.out.println(patrn1);
		ArrayList patrn12 = new ArrayList();
		patrn12.add(1);
		patrn12.add(2);
		patrn12.add(3);
		
		
		ArrayList patrn9 = new ArrayList();
		patrn9.add(patrn12);
		
		//compare patrn9 and patrn12
		for (int i = 0; i < patrn9.size(); i++) {
			 ArrayList temp=((ArrayList) patrn9.get(i));
			System.out.println(temp.containsAll(patrn1));
			
		}
//		for (int i = 0; i < patrn9.size(); i++) {
//			 ArrayList temp=((ArrayList) patrn9.get(i));
//			// temp.addAll( ((ArrayList) patrn9.get(i)));
//			 System.out.println("temp" +temp);
//			 if(firstuser.containsAll(temp))
//			 {
//				 System.out.println("true");
//			 }
//			
//			
//		}
	
		HashSet<String> al=new HashSet<String>();
		  
		  al.add("Vijay");
		  al.add("Ravi");
		  al.add("Ajay");
		  Iterator<String> itr=al.iterator();
		  while(itr.hasNext()){
		   System.out.println(itr.next());
		  }
		 }	

}
