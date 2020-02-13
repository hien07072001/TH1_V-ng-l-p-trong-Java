import javax.swing.*;
import java.util.Scanner;

public class checkPrime {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap vao so can kiem tra");
        int number =scanner.nextInt();

        if (number<2){
            System.out.println("k phai snt");
        }else {
            int i=2;
            boolean check=true;
            while (i <= Math.sqrt(number)){
                if (number %i==0){
                    check=false;
                    break;
                }
                i++;
            }
            if(check)
                System.out.println(number+"snt");
            else
                System.out.println(number+"ksnt");

        }

    }
}
