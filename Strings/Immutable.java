public class Immutable {
    public static void main(String[] args) {
        College c = new College("SVVV", "Sawer Road Indore");
        Student s1 = new Student(123,"Shital",c);
        // System.out.println(s1.getName());
        // System.out.println(s1.getRoll());

        System.out.println(s1.getCllg().name);

        String temp = s1.getCllg().name; 
        System.out.println(temp);

        temp = "New SVVV";
        System.out.println(temp);      // the name of cllg is changed

    }
}

// Not pure Immutable class
final class Student{
    private final int roll;
    private final String name;
    private final College cllg;

    Student(int roll,String name,College cllg){
        this.roll = roll;
        this.name = name;
        this.cllg= cllg;
    }

    int getRoll(){
        return this.roll;
    }
    String getName(){
        return this.name;
    }
    College getCllg(){
        return this.cllg;
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
