# positives
import java.util.Scanner;

public class Positive {


public static void main(String[] args) {
    int a;
    Scanner sr=new Scanner(System.in);
    a=sr.nextInt();
    if(a>0){
        System.out.println("positive");
    }
    else if(a==0){
        System.out.println("neither negative nor positive");
    }
    else
        System.out.println("negative");
}
}
