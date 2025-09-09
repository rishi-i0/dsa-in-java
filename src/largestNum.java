import java.util.*;
public class largestNum{

public static void main(String[] args) {
Scanner in=new Scanner(System.in);

int a=in.nextInt();
int b=in.nextInt();
int c=in.nextInt();
int largest;
 if(a>b && a>c){
largest=a;
 } else if (b>a && b>c) {
largest=b;
 }
else {
largest=c;
 }
    System.out.println("Largest number is " + largest);
}
        }
