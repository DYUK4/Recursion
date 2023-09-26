import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.print("Hello world!");
//main(null);
        Scanner kb = new Scanner(System.in);

        /*System.out.print(" Введите номер этажа: ");
        int floor = kb.nextInt();
        Elevator(floor);*/
        System.out.print("Введите число: ");
        double fact = kb.nextInt();
        System.out.println("%.0f! = %.0f".formatted(fact, Factorial(fact)));
        //Fractorial(fact);

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.print("Введите основание степени: ");
        int a = kb.nextInt();
        System.out.print("Введите показатель степени: ");
        int n = kb.nextInt();
        System.out.println("%d^%d = %.0f".formatted(a,n, Power(a,n)));

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.print("Введите предельное число: ");
        long fib = kb.nextLong();
        //System.out.println(Fibonacci(fib));
        Fibonacci(fib,0,1);
    }
    /*static void Elevator(int floor) {
        if (floor == 0) {
            System.out.println("Вы в подвале");
            return;
        }
        System.out.println("Вы на " + floor + " этаже");
        Elevator(floor - 1);
        System.out.println("Вы на " + floor + " этаже");

    }*/

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    static double Factorial(double fact) {
        /*if(fact < 0) return 0;
        if (fact == 1)
        return 1;
        return fact * Fractorial(fact - 1);
        */
        return fact < 0 ? 0 : fact == 1 ? 1 : fact * Factorial(fact - 1);

    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    static double Power(double a, int n) {
        //if(degre == 0) return 1;
        //return number * Power(number,degre - 1 );
        //return degre == 0 ? 1 : degre > 0 ? number * Power( number,degre - 1 ) : 1/ number * Power( number,degre +1 );
        //return n == 0 ? 1 : n > 0 ? a * Power(a,n - 1) : 1 / a * Power(a,n + 1);
        return n == 0 ? 1 : n > 0 ? a * Power(a,n - 1) : 1 / Power(a,-n);
        //return n == 0 ? 1 : n > 0 ? a * Power(a,n - 1) : 1 / Power(a,Math.abs(n));

    }

 ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //static int Fibonacci(int fib){
       /* if(fib == 0 || fib == 1) return fib;
        return Fibonacci(fib - 1) + Fibonacci(fib - 2);*/
        static void Fibonacci(long fib, long a, long b ){
            if (a > fib) return;
            System.out.print(a + "\t");
            Fibonacci(fib, b, a + b);
        }
    }

//stack
//stack overflow exception