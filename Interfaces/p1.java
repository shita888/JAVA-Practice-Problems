package Interfaces;

interface  GovermentGuidline{
    void policy();

    default void method1(){
        System.out.println("Default method-1 from interface");
    }
    static void method2(){
        System.out.println("Static method-2 from interface");
    }

public static void main(String[] args) {
        GovermentGuidline gg = () ->{
     System.out.println("lamda 1");
    };
    gg.policy();

    GovermentGuidline gg1 = () ->{
        System.out.println("lamda 2");
    };
    gg1.policy();

     GovermentGuidline gg2 = () ->{
        System.out.println("lamda 3");
    };
    gg2.policy();

     GovermentGuidline gg3 = () ->{
        System.out.println("lamda 4");
    };
    gg3.policy();

     GovermentGuidline gg4 = () ->{
        System.out.println("lamda 5");
    };
    gg4.policy(); 
    
}

 
}

 
 
