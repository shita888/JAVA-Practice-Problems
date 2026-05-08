import java.util.ArrayList;
import java.util.Scanner; 
 
public class Manu {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        ArrayList<User> list = new ArrayList<>();
        ArrayList<Question> questions = new ArrayList<>();


        // QUESTIONS ADD
        questions.add(new Question(
                "Java kis company ne develop ki?",
                "Microsoft",
                "Sun Microsystems",
                "Google",
                "Apple",
                2));

        questions.add(new Question(
                "Java ka founder kaun hai?",
                "James Gosling",
                "Dennis Ritchie",
                "Bjarne Stroustrup",
                "Guido van Rossum",
                1));

        questions.add(new Question(
                "JVM ka full form kya hai?",
                "Java Variable Machine",
                "Joint Virtual Machine",
                "Java Virtual Machine",
                "None",
                3));

        questions.add(new Question(
                "Java ek ___ language hai?",
                "Procedural",
                "Markup",
                "Object Oriented",
                "Machine",
                3));

        while (true) {

            System.out.println("\n* * * * * MENU * * * * *");
            System.out.println("1.Register");
            System.out.println("2.Login");
            System.out.println("3.Exit");

            System.out.print("Choose number from the given Option: ");
            int num = sc.nextInt();
            sc.nextLine();

            // REGISTER
            if (num == 1) {

                while (true) {

                    User obj = new User();

                    list.add(obj);
EmailSender.sendEmail(
    obj.getemail(),
    obj.getname()
);
                    System.out.println("\nRegistration Successful!");

                    System.out.print("Want to Register again....(y/n) => ");
                    char op = sc.next().charAt(0);
                    sc.nextLine();

                    if (op == 'y' || op == 'Y') {
                        continue;
                    } else if (op == 'n' || op == 'N') {
                        break;
                    } else {
                        System.out.println("Invalid Character");
                        break;
                    }
                }

            }

            // LOGIN
            else if (num == 2) {

                boolean found = false;

                Login obj1 = new Login();

                for (User u : list) {

                    if (u.getemail().equals(obj1.getemail1())
                            &&
                            u.getpassword().equals(obj1.getpassword1())) {

                        found = true;

                        System.out.println("\n* * * Congratulation You Are LoggedIn * * *");

                        int score = 0;

                        for (Question q : questions) {

                            System.out.println("\n" + q.getQue());

                            System.out.println("1. " + q.geto1());
                            System.out.println("2. " + q.geto2());
                            System.out.println("3. " + q.geto3());
                            System.out.println("4. " + q.geto4());

                            System.out.print("Enter your answer: ");
                            int ans = sc.nextInt();

                            if (ans == q.getcorrect()) {

                                System.out.println("Correct Answer!");
                                score++;

                            } else {

                                System.out.println("Wrong Answer!");
                            }
                        }

                        System.out.println("\nYour Final Score = " + score + "/" + questions.size());
                    }
                }

                if (found == false) {
                    System.out.println("\nInvalid Email or Password");
                }

            }

            // EXIT
            else if (num == 3) {

                System.out.println("Program Exit");
                break;

            } else {

                System.out.println("Invalid Option");
            }
        }

        sc.close();
    }
}


// USER CLASS
class User {

    Scanner scc = new Scanner(System.in);

    private String name;
    private String email;
    private String password;

    User() {

        System.out.print("Enter your name: ");
        name = scc.nextLine();

        System.out.print("Enter your email: ");
        email = scc.nextLine();

        System.out.print("Enter your password: ");
        password = scc.nextLine();
    }

    public String getname() {
        return name;
    }

    public String getemail() {
        return email;
    }

    public String getpassword() {
        return password;
    }
}


// LOGIN CLASS
class Login {

    Scanner sccc = new Scanner(System.in);

    private String email1;
    private String password1;

    Login() {

        System.out.print("Enter your email: ");
        email1 = sccc.nextLine();

        System.out.print("Enter your password: ");
        password1 = sccc.nextLine();
    }

    public String getemail1() {
        return email1;
    }

    public String getpassword1() {
        return password1;
    }
}


// QUESTION CLASS
class Question {

    private String Que;
    private String o1;
    private String o2;
    private String o3;
    private String o4;
    private int correct;

    Question(String Que, String o1, String o2, String o3, String o4, int correct) {

        this.Que = Que;
        this.o1 = o1;
        this.o2 = o2;
        this.o3 = o3;
        this.o4 = o4;
        this.correct = correct;
    }

    public String getQue() {
        return Que;
    }

    public String geto1() {
        return o1;
    }

    public String geto2() {
        return o2;
    }

    public String geto3() {
        return o3;
    }

    public String geto4() {
        return o4;
    }

    public int getcorrect() {
        return correct;
    }
}

 