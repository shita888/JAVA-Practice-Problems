public class CheckAlphabet{
public static void main(String args[]){

char C = 'S';
int ch = (int)C;

System.out.println(ch);

if((96 < ch || ch < 123) || (64 < ch || ch < 91) )
{
System.out.println("Alphabet");
}
else
{
System.out.println("Not Alphabet");
}

}
}