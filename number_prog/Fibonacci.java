import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        int n=0;
        int prev=0;
        int curr=1;
        System.out.println(0);
        System.out.println(1);
        while(n<num){
            int next=prev+curr;
            System.out.println(next);
            prev=curr;
            curr=next;
            n++;
        }
    }
}
