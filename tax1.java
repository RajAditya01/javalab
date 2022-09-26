public class tax1 {
    public static void main(String args[]){
        String gender = args[0];
        int income =Integer.ParseInt(args[1]);
        double tax=0;
        if(gender.equalsIgnorCase("male")){
            if (income>1800000){
                tax=tax+ 0.1*(income-1800000);   
            }
            if(income>500000){
                tax=tax+ 0.2*(income-500000); 
            }
            if(income>800000){
                tax=tax+ 0.3*(income-800000); 
            }
            System.out.println(tax);
        }
        else if(gender.equalsIgnorecase("female")){
            if(income>190000){
                tax=tax+0.1*(income-190000);
            }
            if(income>500000){
                tax=tax+ 0.2*(income-500000); 
            }
            if(income>800000){
                tax=tax+ 0.3*(income- 800000); 
            }
            System.out.println(tax);
        }
        else{
            
        }
    }
}
