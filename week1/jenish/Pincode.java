import java.util.Scanner;

public class Pincode{

    public static void main(String[] args) {
        String password = "1234";
        String pass;
        int attempts = 3;

        Scanner scanner = new Scanner(System.in);

        for(int i=1; i<=attempts; i++){
            System.out.print("Enter the password::");
            pass = scanner.nextLine();

            if(pass.equals(password)){
                System.out.println("access granted!");
                break;
            }
            else{
                int remaning = attempts - i;
                if(remaning>0){
                    System.out.println("Incorrect password, remaining attempts::"+ remaning);
                }
                else{
                    System.out.println("Access denied you are out of attempts");
                }
                
            }
        }
    }
}
