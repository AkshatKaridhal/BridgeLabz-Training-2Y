import java.nio.InvalidMarkException;
import java.util.*;
public class TryandCatch {
    static void nullname(String name) throws NullPointerException{
        if(name==null){
            throw new NullPointerException("NullPointerException");
        }
    }
    static void checkmarks(int marks) throws InvalidMarkException{
        if(marks>100 || marks <0){
            throw new ArithmeticException("InvalidMarksException");
        }
    }
    static void checkage(int age) throws InvalidMarkException{
        if(age<18){
            throw new ArithmeticException("InvalidAgeException");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name : ");
        String name = sc.next();
        System.out.print("Enter your Age : ");
        int[] marks = new int[3];
        int age = sc.nextInt();
        int sum = 0;
        for(int i = 0;i<3;i++){
            System.out.print("Enter your marks["+(i+1)+"] : ");
            marks[i] = sc.nextInt();
            sum = sum + marks[i];
            try {
            checkmarks(marks[i]);
            }catch(InvalidMarkException e) {
                System.out.println(e);
            }
        int avg = sum/3;
        }
        try {
            nullname(name);
        } catch (NullPointerException e) {
            System.out.println(e);
        }
        try {
            checkage(age);
        } catch (InvalidMarkException e) {
            System.out.println(e);
        }
    }
}
