import java.util.Scanner;
public class  Student{

	Private String name = null;
	Private int rollno =0; 
	Private double marks =0.0;

public static void main(String args[]){
Scanner scc = new Scanner(System.in);

 Student(){
	
	public void setname(String name){
	this.name = name;
	}
	public void setrollno(int rollno){
	this.rollno = rollno;
	}

	public void setmarks(double marks){
	this.marks = marks;
	}
	}

	public String getname(){
	return name;
	}
	public int getrollno(){
	return rollno;
	}

	public double getmarks(){
	return marks;
	}
           

}
}

class Another{
      

Student obj = new Student();
  obj.setname("shital");
  obj.setrollno(1590);
  obj.setmarks(50);

  obj.getname();
  obj.getrollno();
  obj.getmarks;



}
	
	