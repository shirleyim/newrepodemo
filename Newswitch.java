import java.util.Scanner;

public class Newswitch {
    public static void main(String[] args) {

        /*
        System.out.println("enter your salary: ");
        Scanner sc = new Scanner(System.in);
        float sal = sc.nextFloat();

        if(sal<2.5){
            System.out.println("NO TAX");
        } else if (sal<5.0) {
            System.out.println("you have to pay 5 per tax");

        } else if (sal<10.0) {
            System.out.println("you have to pay 20 per tax");

        }
        else{
            System.out.println("you have to pay 30 per tax");
        }

        */

        /*

        Scanner sc = new Scanner(System.in);
        System.out.println("enter day: ");
        int day = sc.nextInt();
        switch (day){
            case 1:
                System.out.println("it's monday");
                break;
            case 2:
                System.out.println("it's tuesday");
                break;
            case 3:
                System.out.println("it's wednesday");
                break;
            case 4:
                System.out.println("it's thursday");
                break;
            case 5:
                System.out.println("it's friday");
                break;
            case 6:
                System.out.println("it's saturday");
                break;
            case 7:
                System.out.println("it's sunday");
                break;
            default:
                System.out.println("!!note enter days from 1-7!!");
        }

         */

        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a year: ");
        int year = sc.nextInt();
        if((year%4==0 && year%100 !=0) || year%400 == 0){
            System.out.println(+year+"\n it's a leap year");
        }
        else{
            System.out.println("not a leap year");
        }

         */

        System.out.println("enter website name: ");
        Scanner sc = new Scanner(System.in);
        String website = sc.nextLine();
        if(website.endsWith(".org")){
            System.out.println("its an organizational website");
        }
        if (website.endsWith(".com")) {
            System.out.println("its an commercial website");
        } else if (website.endsWith(".in")) {
            System.out.println("its an indian website");

        }

    }
}
