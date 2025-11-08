// Write a Java program using a for loop and if statements to print “Fizz” for numbers divisible by 3, 
// “Buzz” for numbers divisible by 5, and “FizzBuzz” for numbers divisible by both, between 1 and 30.
public class FizzBuzz {
    public static void main(String[] args){
        for (int i = 1; i <= 30; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }else if (i % 3 == 0){
                System.out.println("Fizz");
            }else if (i % 5 == 0){
                System.out.println("Buzz");
            }else {
                System.out.print(i);
            }
        }
    }
}
