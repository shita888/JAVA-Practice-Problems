public class Cons_Chaining {
    String name;
    int age;
    int roll;
    String cllg; 

      Cons_Chaining(){
         this(null,0,0,null); 
        }

     Cons_Chaining(String name){
         this(name,0,0,null); 
        }

     Cons_Chaining (String name, int age){
         this(name,age,0,null); 
        }

     Cons_Chaining (String name, int age,int roll){
         this(name,age,roll,null); 
        }

    Cons_Chaining (String name,int age,int roll,String cllg){
         this.name = name;
         this.age = age;
         this.roll = roll;
         this.cllg = cllg;
        }
    
    public static void main(String[] args) { 

        
    Cons_Chaining obj = new Cons_Chaining ("Shital" ); 

        System.out.println(obj.name);
        System.out.println(obj.age);
        System.out.println(obj.roll);
        System.out.println(obj.cllg);

    }
}
