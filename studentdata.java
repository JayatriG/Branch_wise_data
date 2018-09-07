package BWD;

import java.awt.List;
import java.util.ArrayList;

public class studentdata {
	
	public ArrayList<studentpro> data() {
		ArrayList<studentpro> list=new ArrayList<>();
		
		studentpro s1=new studentpro();
		studentpro s2=new studentpro();
		studentpro s3=new studentpro();
		studentpro s4=new studentpro();
		studentpro s5=new studentpro();
		studentpro s6=new studentpro();
		
		s1.setAge(20);
		s1.setBranch("cse");
		s1.setGender('f');
		s1.setId(1001);
		s1.setName("Priya");
		
		s2.setAge(20);
		s2.setBranch("ece");
		s2.setGender('m');
		s2.setId(2001);
		s2.setName("Rahul");
		
		s3.setAge(20);
		s3.setBranch("mech");
		s3.setGender('f');
		s3.setId(3001);
		s3.setName("Tina");
		
		s4.setAge(21);
		s4.setBranch("cse");
		s4.setGender('m');
		s4.setId(1002);
		s4.setName("Rohan");
		
		s5.setAge(21);
		s5.setBranch("ece");
		s5.setGender('f');
		s5.setId(2002);
		s5.setName("Tania");
		
		s6.setAge(21);
		s6.setBranch("mech");
		s6.setGender('m');
		s6.setId(3002);
		s6.setName("Rishi");
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);
		
		return list;
		
	}
	

}
