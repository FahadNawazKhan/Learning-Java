import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        
        for(int i = 0 ; i<11;i++){
            System.out.println(a+" x "+i+" = "+i*a);
        }
    }
}
