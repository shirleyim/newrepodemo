import java.util.Scanner;

class Switchcase{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*
        System.out.println("Enter your name: ");
        String name = sc.next();

        switch(name){
            case "abc":
                System.out.println("your starts with a");
                break;
            case "def":
                System.out.println("your name starts with d");
                break;
            case "ghi":
                System.out.println("your name starts with g");
                break;
            default:
                System.out.println("your name starts with something else");
        }
*/
        System.out.println("enter marks of phy: ");
        float m1 = sc.nextFloat();
        System.out.println("enter marks of bio: ");
        float m2 = sc.nextFloat();
        System.out.println("enter marks of maths: ");
        float m3 = sc.nextFloat();

        float avg = (m1 + m2 + m3)/3;
        if(avg> 40 && m1> 33 && m2>33 && m3>33){
            System.out.println("passed");
        }
        else{
            System.out.println("not passed");
        }
 }
}





