import java.util.Scanner;
public class multipleof4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the n number::");
        int n = scanner.nextInt();

        for(int i=1; i<=n; i++ ){
            if(i%4==0){
                continue;
            }
            else{
                System.out.print(i +" ");
            }
        }
        
    }
}

