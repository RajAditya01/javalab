class calculator
{
    int add(int a, int b)
    {
        return (a+b);
    }
    int add(int a, int b, int c)
    {
        return a+b+c;
    }
    float add(float a , float b)
    {
        return a+b;
    }
    float add(float a, float b, float c)
    {
        return a+b+c;
    }
}
class find
{
    public static void main(String args[])
    {
        calculator obj =new calculator();

        int a=Integer.parseInt(args[0]);

        int b=Integer.parseInt(args[1]);

        int c=Integer.parseInt(args[2]);

        System.out.println("Sum 1 "+obj.add(a,b));

        System.out.println("Sum 2 "+obj.add(a,b,c));

        System.out.println("Sum float 1 "+obj.add(a,b));

        System.out.println("Sum float 2 "+obj.add(a,b,c));
    }
}
