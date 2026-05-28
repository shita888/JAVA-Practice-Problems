public class Student{
	int rollno=12;
	String name="Sheetal";
	int marks=85;

void print(){
System.out.println("Details: "+rollno+" "+name+" "+marks);
}
     
}
class reb{
public static void main(String args[]){
	Student obj=new Student();
	obj.print();
}
}