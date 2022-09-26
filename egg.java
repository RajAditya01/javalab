public class egg {
    public static void main(String args[]){
      System.out.println("enter eggs");  
      int egg=Integer.parseInt(args[0]);
      int gross=0;
      int dozen=0;
      int rem=0;
      gross=egg/144;
      System.out.println("gross is "+gross);
      rem=egg-(gross*144);
      dozen=rem/12;
      System.out.println("dozen is "+dozen);
      rem=egg-(gross*144)-(dozen*12);
      System.out.println("rem is "+rem);

    }
}
