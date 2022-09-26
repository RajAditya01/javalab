public class taxes{
    public static void main(String args[]){
       
        String category= args[0];
        int income=Integer.parseInt(args[1]);
        
        int tax=0;
        System.out.println("abc");
       
        if(category==general){
            if(0<=income && income<=180000)
            {
                System.out.println("no tax");
            }
            else if(180001<=income && income<=500000)
            {
                tax=(10*income)/100;
                System.out.println("tax is "+tax);
            }   
            else if(500001<=income && income<=800000)
            {
                tax=(20*income)/100;
                System.out.println("tax is "+tax);
            }

            else if(income>800001)
            {
                tax=(30*income)/100;
                System.out.println("tax is "+tax);
            }
   		else{
		    System.out.println("invalid");
		}
        }

        if(category==women)
        {
            if(0<=income && income<=190000)
            {
                System.out.println("no tax");
            }
            else if(190001<=income && income<=500000)
            {
                tax=(10*income)/100;
                System.out.println("tax is "+tax);
            }
            else if(500001<=income && income<=800000)
            {
                tax=(20*income)/100;
                System.out.println("tax is "+tax);
            }
            else if(income>800001)
            {
                tax=(30*income)/100;
                System.out.println("tax is "+tax);
            }
		else{
		    System.out.println("invalid income");
		}
        }    

    }
}