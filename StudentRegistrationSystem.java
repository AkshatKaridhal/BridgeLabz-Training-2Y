import java.util.Scanner;
public class StudentRegistrationSystem {
    public static void main(String[] args){
        try(Scanner string = new Scanner(System.in)){

            String x = string.next();
            String[] arr = new String[x.length()];

            for(int i = 0 ;i<x.length();i++){
                System.out.println(arr[i]=x);
            }

        }
    }
}
