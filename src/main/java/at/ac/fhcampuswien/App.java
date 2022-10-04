package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){
        char a = 'Z';
        int b = 0xface;
        int c = 012;
        long d = 80L;
        float e = 5.5f;
        float f = 44e-1f;
        double g = 8.88e1;
        double h = 99.9;


        int i = (int)d;
        int j = (int)e;
        int k =(int)f;
        int l =(int)g;
        int m =(int)h;

        int sum = a+b+c+i+j+k+l+m;

        System.out.println(sum);
    }

    //todo Task 4
    public void addTwoNumbers(){
        Scanner programm = new Scanner(System.in);
        int a = programm.nextInt();
        int b = programm.nextInt();

        int summe = a+b;
        System.out.println(summe);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        Scanner programm = new Scanner(System.in);
        System.out.println("Before Swap:");
        System.out.print("x: ");
        int x = programm.nextInt();
        System.out.print("y: ");
        int y = programm.nextInt();

        x= x + y;
        y=x-y;
        x=x-y;
        System.out.println("After Swap:");
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }

    //todo Task 6
    public void compareTwoNumbers(){
        Scanner programm = new Scanner(System.in);
        System.out.print("n1: ");
        int n1 = programm.nextInt();
        System.out.print("n2: ");
        int n2 = programm.nextInt();

        if (n1 > n2)
        {
            System.out.println("n1 > n2");
        } else if (n1 < n2) {
            System.out.println("n2 > n1");
        }
        else {
            System.out.println("n1 == n2");
        }
    }

    //todo Task 7
    public void ratingSalesPerson(){
        Scanner programm = new Scanner(System.in);

        System.out.print("Enter annual Revenue: ");
        int r = programm.nextInt();


        if (r >= 0 && r < 20000) {
            System.out.println("Poor Sales Revenue");
        } else if (r >= 20000 && r < 50000 ) {
            System.out.println("Average Sales Revenue");
        } else if (r >= 50000 && r < 80000 ) {
            System.out.println("Good Sales Revenue");
        } else if (r >= 80000 && r < 100000 ) {
            System.out.println("Excellent Sales Revenue");
        }
        else
        {
            System.out.println("Invalid Revenue");
        }
    }

    //todo Task 8
    public void getCommissionRate(){
        Scanner programm = new Scanner(System.in);

        System.out.print("Enter CommissionClass: ");
        int system = programm.nextInt();
        switch (system) {
            case 1:
                System.out.println("Your Commission Rate was set to 0.01");
                break;
            case 2:
                System.out.println("Your Commission Rate was set to 0.02");
                break;
            case 3:
                System.out.println("Your Commission Rate was set to 0.03");
                break;
            case 4:
                System.out.println("Your Commission Rate was set to 0.04");
                break;
            default:
                System.out.println("Your Commission Rate was set to 0.0");
        }
    }

    //todo Task 9
    public void leapyear(){
        Scanner programm = new Scanner(System.in);
        System.out.print("Year: ");
        int jahr = programm.nextInt();

        if (jahr%4 == 0 && jahr%400 == 0)
        {
            System.out.println("Leapyear");
        }
        else
        {
            System.out.println("Not a Leapyear");
            return;
        }
        if (jahr%100 == 0 && jahr%400 != 0)
        {
            System.out.println("Not a Leapyear");
        }
    }

    //todo Task 10
    public void transposedNumbers(){
        System.out.print("Number: ");
        Scanner programm = new Scanner(System.in);
        int nummer = programm.nextInt();
        String s = String.valueOf(nummer);

        if (s.length() > 3) {
            System.out.println("Geben Sie eine gültige max. dreistellige ganze Zahl an!");
        }
        else {

            int z1 = nummer % 10;
            int z2 = nummer / 10;
            int z3 = z2 % 10;
            int z4 = z2 / 10;


            System.out.println(z1 * 100 + z3 * 10 + z4);
        }
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}