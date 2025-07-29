public class operator
{
 public static void main(String[]args){
    int a=10,b=120;
    System.out.println("Airthmetic operator:"+(a+b));
    System.out.println("Relational operator:"+(a==b));
    int min=(a<b)?b:a;
    System.out.println(min);


    System.out.println("Logical operator:"+(a>=5 && b>=15));
    System.out.println("Assignment operator:"+(a+=b));
    System.out.println("Increment operator:"+(a++));
 }   
}