public class ThisKeyword {
    String name;
    int age;
    int roll;
    String cllg; 

    ThisKeyword(String name){ 
         this.name =  name;
        }

     ThisKeyword(String name, int age){ 
         this.name = name;
         this.age = age; 
        }

    ThisKeyword(String name,int age,int roll,String cllg){
         this.name = name;
         this.age = age;
         this.roll = roll;
         this.cllg = cllg;
        }
    
    public static void main(String[] args) { 

        
    ThisKeyword obj = new  ThisKeyword("Shital");
    ThisKeyword obj1 = new  ThisKeyword ("Shital",19);
    ThisKeyword obj2 = new ThisKeyword("Shital",19,15090,"Svvv");

        System.out.println(obj.name);
        System.out.println(obj.age);
        System.out.println(obj.roll);
        System.out.println(obj.cllg);

        System.out.println(obj1.name);
        System.out.println(obj1.age);
        System.out.println(obj1.roll);
        System.out.println(obj1.cllg);

        System.out.println(obj2.name);
        System.out.println(obj2.age);
        System.out.println(obj2.roll);
        System.out.println(obj2.cllg);

    }
}
