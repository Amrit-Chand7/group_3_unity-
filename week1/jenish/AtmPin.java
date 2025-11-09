import java.util.Scanner;
public class AtmPin {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int attempt = 3;
        String password ="1234";
    
        for(int i=1;i<=3;i++){
            System.out.print("Enter pin::");
            String passwd = scanner.nextLine();
            if (passwd.equals(password)) {
                System.out.print("Access Granted");
                break;
            }
            else{
                attempt--;
                if(attempt>0){
                    System.out.println("Incorrect Pin, remaining attempts, " + attempt);
                }
                else{
                    System.out.println("Account locked");
                }
                
            }
            
         }
        
    }
   
}