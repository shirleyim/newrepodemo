import java.util.Scanner;

public class Elseif {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you age: ");
        int age = sc.nextInt();
        if(age==0){
            System.out.println("You are a infant");

        }
        else if (age<5) {
            System.out.println("you are a baby");
        }
        else if (age<10) {
            System.out.println("you are kindergarten kid");
         }
        else if (age<15) {
            System.out.println("you are a teenager");
     }
        else {
            System.out.println("you are an adult");
        }

    }
}
