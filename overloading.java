public class overloading {
    int a=10,b=20;
    void add()
    {
        int c=a+b;
        System.out.println(c);
    }
    void add(int a,int b)
    {
        int p=50+50;
        System.out.println(p);
    }
    int add()
    {
        int f=a+b;
        return f;
    }
    public static void main(String[] args) {
        overloading o1=new overloading();
        
        o1.add(20,30);
        System.out.println(o1.add());
    }
}
