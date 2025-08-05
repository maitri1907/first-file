   class parent {
    void print()
    {
        System.out.println("hello");
    }
    
}
 class c extends parent
 {
    void demo()
    {
        System.out.println("world");
    }
 }
 public class myprogram{
 public static void main(String[]args)
 {
    c c1=new c();
    c1.print();
    c1.demo();
 }
 }