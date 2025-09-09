import java.util.*;
public class fibonacci{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci terms to generate: ");
        int n = in.nextInt();
        int p=0;
        int i=1;
        int count=2;
        while(count<=n){
            int temp=i;
            i=i+p;
            p=temp;
            count ++;
        }
        System.out.println(i);
    }
}