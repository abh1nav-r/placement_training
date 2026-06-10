public class prime {
    public static void main(String[] args) {
        int count=0;
        int n=4;
        for(int i=n;i>0;i--){
            if(n%i==0){
                count++;
                System.out.println(count);
            }
        }
        if(count>2){
            System.out.println("false");
        }
        else{
            System.out.println("true");
        }
    }
}
