import java.util.Scanner;
public class PincodeWl{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String password = "1234";
        String pass;
        Integer attempts = 5;

        while( attempts > 0){
        System.out.print("Enter your passsword::");
        pass = scanner.nextLine();
           if(pass.equals(password)){
            System.out.println("Access granted!");
            break;
           }

            else{
                attempts--;
                if(attempts>0){
                    System.out.println("Incorrect password, remaining attempts::"+ attempts);
                }
                else{
                    System.out.println("Access denied you are out of attempts!");
                }
            }    
        
        }

    }
}