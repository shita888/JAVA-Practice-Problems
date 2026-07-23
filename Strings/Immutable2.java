public class Immutable2 {
        public static void main(String[] args) {
        College c = new College("SVVV", "Sawer Road Indore");
        Student s1 = new Student(123,"Shital",c); 

        System.out.println(s1.getCllg().name); 
        s1.getCllg().name = "SBBB";    
        System.out.println(s1.getCllg().name);// the name of cllg is not changed

 
        // String temp = s1.getCllg().name;  
        // System.out.println(temp);
        // temp = "New SVVV";  
        // System.out.println(temp);     

    }
}


//   Immutable class
// defensive copy
final class Student{
    private final int roll;
    private final String name;
    private final College cllg;

    Student(int roll,String name,College cllg){
        this.roll = roll;
        this.name = name;
        this.cllg= new College(cllg.name,cllg.address); // Deep copy
    }

    int getRoll(){
        return this.roll;
    }
    String getName(){
        return this.name;
    }
    College getCllg(){
        return new College(this.cllg.name,this.cllg.address);
    }
    
}

class College{
    String name;
    String address;

    College(String name,String address){
        this.name = name;
        this.address = address;
    }

    String getName(){
        return this.name;
    }
    String getAddress(){
        return this.address;
    }
}