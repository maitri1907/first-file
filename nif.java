
import java.util.Scanner;
public class nif {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter all subjects marks");
        int j=sc.nextInt();
        int d=sc.nextInt();
        int p=sc.nextInt();
        float per=(j+d+p)/3;
        System.out.println(per);

    
    if(per>35)
    {
        if(per>75)
        {
            System.out.println("pass with good marks");
        }
        else
        {
            System.out.println("pass");
        }
    }

    
    else
    {
        System.out.println("fail");
    }
    }
}
