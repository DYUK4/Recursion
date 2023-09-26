import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.print("Hello world!");
//main(null);
        Scanner kb = new Scanner(System.in);

        System.out.print(" Введите номер этажа: ");
        int floor = kb.nextInt();
        Elevator(floor);

        System.out.print("Введите число: ");
        double fact = kb.nextDouble();
        System.out.println("%.0f! = %.0f".formatted(fact, Fractorial(fact)));
        //Fractorial(fact);


        System.out.print("Введите целое число и степень: ");
        double number = kb.nextInt();
        double degre = kb.nextInt();
        System.out.println("число %.0f^%.0f = %.0f".formatted(number,degre,Power(number,degre)));

        /*System.out.print("Введите число предела: ");
        int fib = kb.nextInt();
        Fibonacci(fib);*/
    }

    static void Elevator(int floor) {
        if (floor == 0) {
            System.out.println("Вы в подвале");
            return;
        }
        System.out.println("Вы на " + floor + " этаже");
        Elevator(floor-1);
        System.out.println("Вы на " + floor + " этаже");

    }

    static double Fractorial(double fact){
        if (fact == 1)
        return 1;
        return fact * Fractorial(fact - 1);

    }

    static double Power(double number, double degre){
        if(degre == 1) return number;
       return number * Power(number,degre - 1 );

    }
    /*static void Fibonacci(int fib){
        if(fib == 0 || fib == 1) return fib;
        return Fibonacci(fib - 1) + Fibonacci(fib - 2);

    }
*/
}

//stack
//stack overflow exception