public class Random {
    public static void main(String[] args) {
        for(int i=1;i<=30;i++){
            if (i==15) {
                System.out.println("skip");
            }
            if(i%4==0){
                System.out.println(i*i);
            }
            if(i==30){
                System.out.println("done");
            }
            else{
                System.out.println(i);
            }
        }
    }
}
