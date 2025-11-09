public class SumProduct {
    public static void main(String[] args) {
        int sum = 0;
        int product = 1;
        for(int i=1;i<=10;i++){
            if (i%2==0) {
                sum = sum + i;
            }
            else if(i%2!=0){
                product = product * i;
            }
        }
        System.out.println("sum of even no is " + sum);
        System.out.println("product of even no is " + product);
    }
}
