 class keyword {
    int a,b;
    void set(int a,int b)
    {
        this.a=a;
        this.b=b;

    }   
    void get()
    {
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[]args)
    {
        keyword k1=new keyword();
        k1.set(10,20);
        k1.get();
    }
}
