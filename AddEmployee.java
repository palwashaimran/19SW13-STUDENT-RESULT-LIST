import java.util.ArrayList;

class Variables
{
	   String name; 
	   String rollno;
	   int phyMarks; 
	   int mathsMarks; 
	   int chemMarks; 
	   int total; 
	   float per; 
}


class Method
{
	ArrayList<Variables> addData()
	   {
			 Variables sw01 = new Variables(); 
			 sw01.name = "Ahmer"; 
			 sw01.rollno = "sw01";
			 sw01.phyMarks = 95; 
			 sw01.mathsMarks = 100; 
			 sw01.chemMarks = 90; 
			 sw01.total = 95 + 100 + 90; 
			 sw01.per = ((sw01.total)*100)/300; 
	
		     Variables sw02 = new Variables(); 
		     sw02.name = "Bisma"; 
		     sw02.rollno = "sw02";
		     sw02.phyMarks = 80; 
		     sw02.mathsMarks = 85; 
		     sw02.chemMarks = 90; 
		     sw02.total = sw02.phyMarks + sw02.mathsMarks + sw02.chemMarks;
		     sw02.per = ((sw02.total)*100)/300; 
		     
		     Variables sw03 = new Variables(); 
		     sw03.name = "Ali"; 
		     sw03.rollno = "sw03";
		     sw03.phyMarks = 90; 
		     sw03.mathsMarks = 75; 
		     sw03.chemMarks = 60; 
		     sw03.total = sw03.phyMarks + sw03.mathsMarks + sw03.chemMarks; 
		     sw03.per = ((sw03.total)*100)/300; 
		     
		     
		     Variables sw04 = new Variables(); 
		     sw04.name = "Hira"; 
		     sw04.rollno = "sw04";
		     sw04.phyMarks = 95; 
		     sw04.mathsMarks = 85; 
		     sw04.chemMarks = 100; 
		     sw04.total = sw04.phyMarks + sw04.mathsMarks + sw04.chemMarks;
		     sw04.per = ((sw04.total)*100)/300; 
		     
		     Variables sw05 = new Variables(); 
		     sw05.name = "Asma"; 
		     sw05.rollno = "sw05";
		     sw05.phyMarks = 65; 
		     sw05.mathsMarks = 55; 
		     sw05.chemMarks = 70; 
		     sw05.total = sw05.phyMarks + sw05.mathsMarks + sw05.chemMarks;
		     sw05.per = ((sw05.total)*100)/300; 
		     
		     Variables sw06 = new Variables(); 
		     sw06.name = "Areesh"; 
		     sw06.rollno = "sw06";
		     sw06.phyMarks = 65; 
		     sw06.mathsMarks = 85; 
		     sw06.chemMarks = 90; 
		     sw06.total = sw06.phyMarks + sw06.mathsMarks + sw06.chemMarks;
		     sw06.per = ((sw06.total)*100)/300; 
		     
		     Variables sw07 = new Variables(); 
		     sw07.name = "Saniya"; 
		     sw07.rollno = "sw07";
		     sw07.phyMarks = 95; 
		     sw07.mathsMarks = 95; 
		     sw07.chemMarks = 80; 
		     sw07.total = sw07.phyMarks + sw07.mathsMarks + sw07.chemMarks;
		     sw07.per = ((sw07.total)*100)/300; 
		     
		     Variables sw08 = new Variables(); 
		     sw08.name = "Memoona"; 
		     sw08.rollno = "sw08";
		     sw08.phyMarks = 59; 
		     sw08.mathsMarks = 67; 
		     sw08.chemMarks = 73; 
		     sw08.total = sw08.phyMarks + sw08.mathsMarks + sw08.chemMarks;
		     sw08.per = ((sw08.total)*100)/300; 
		     
		     Variables sw09 = new Variables(); 
		     sw09.name = "Zainab"; 
		     sw09.rollno = "sw09";
		     sw09.phyMarks = 92; 
		     sw09.mathsMarks = 94; 
		     sw09.chemMarks = 89; 
		     sw09.total = sw09.phyMarks + sw09.mathsMarks + sw09.chemMarks;
		     sw09.per = ((sw09.total)*100)/300;
		     
		     Variables sw10 = new Variables(); 
		     sw10.name = "Anus"; 
		     sw10.rollno = "sw10";
		     sw10.phyMarks = 88; 
		     sw10.mathsMarks = 86; 
		     sw10.chemMarks = 89; 
		     sw10.total = sw10.phyMarks + sw10.mathsMarks + sw10.chemMarks;
		     sw10.per = ((sw10.total)*100)/300;
		     
	
		     ArrayList<Variables> al = new ArrayList<Variables>(); 
	
		     al.add(sw01); 
		     al.add(sw02); 
		     al.add(sw03);
		     al.add(sw04);
		     al.add(sw05);
		     al.add(sw06);
		     al.add(sw07); 
		     al.add(sw08);
		     al.add(sw09);
		     al.add(sw10);
		     
		     System.out.println("Total No: of Students: " + al.size());
		     if (al.contains(sw07))
		     {
		    	 System.out.print("roll no: sw07 found at row no: ");
		    	 System.out.println(al.indexOf(sw07)+1);
		    	 
		     }
		     
		     else
		    	 {
		    	 	System.out.println("Student Not Found");
		    	 }
		     
		    // System.out.println(al.contains(sw03));
		     
		     
		     return al; 
	   }
	
	
}


class Retrive
{
	void fetchStudentData()
	{
		    Method stdata = new Method(); 
	
		    ArrayList<Variables> listst = stdata.addData(); 
	
		    for(Variables student:listst)
		    { 
			     System.out.print("Name: " +student.name + ",	"); 
			     System.out.print("Name: " +student.rollno + ",	"); 
			     System.out.print("Physics Marks: " +student.phyMarks + ",	"); 
			     System.out.print("Maths Marks: " +student.mathsMarks + ",	"); 
			     System.out.print("Chemistry Marks: " +student.chemMarks + ",	"); 
			     System.out.print("Total Marks: " +student.total + ",	"); 
			     System.out.println("Percentage:" +student.per + "%"); 
		    }
		    
	}
	
	
}


public class AddEmployee
{
	public static void main(String[] args) 
	{ 
		Method st = new Method(); 
	    st.addData(); 

	    Retrive obj = new Retrive(); 
	    obj.fetchStudentData(); 
	 } 
	
}

