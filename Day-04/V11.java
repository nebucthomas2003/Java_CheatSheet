import java.util.Scanner;
public class V11 {                                    //palindrome
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int reverse=0;

        while(num>0){
            int digit = num%10;
            reverse= reverse+digit;
            num=num/10;

        }
        System.out.println(reverse);

    }
    
}
