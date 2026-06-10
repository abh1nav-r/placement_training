public class amstrong {
    public static void main(String[] args) {
        int n=153;
        int temp=n;
        int rev=0;
        int len=String.valueOf(n).length();

        while(n!=0){
            int digit=n%10;
            rev+=Math.pow(digit, len);
            n=n/10;
        }
        if(temp==rev){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
