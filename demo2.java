public class demo2 {
    void set(int a,int b)
     {
        get(a,b);

     }   
     void get(int x,int y)
     {
        System.out.println(x);
        System.out.println(y);
     }
     public static void main(String[] args) {
        demo2 d1=new demo2();
        d1.set(10,20);
        
     }
}
