package BWD;


import java.util.*;

public class studentservice {
	
	public List check(String branch) {
		
		studentdata st=new studentdata();
		
		
		
		ArrayList<studentpro> student_list=st.data();
		
		
		List<studentpro> st_b_list = new ArrayList<studentpro>();
		
		for(studentpro s:student_list)
		{
			if(s.getBranch().equals(branch)) {
				st_b_list.add(s);
			}
			
		}
		return st_b_list;
	} 

}
