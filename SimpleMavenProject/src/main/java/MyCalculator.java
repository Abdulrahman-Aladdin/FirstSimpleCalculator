import java.util.*;


public class MyCalculator {
    double add(double x, double y){
        return x+y;
    }

    double sub(double x, double y){
        return x-y;
    }

    double mult(double x, double y){
        return x*y;
    }

    double div(double x, double y) throws Exception {
        if (y == 0) {
            throw new Exception("can not divide by zero");
        }
        return x/y;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double x, y;
        char op;
        System.out.println("Enter the operands separated by space : ");
        x = sc.nextDouble();
        y = sc.nextDouble();
        System.out.println("Enter the operation : ");
        op = sc.next().charAt(0);
        MyCalculator c = new MyCalculator();
        switch (op) {
            case '+' -> System.out.println(x + " + " + y + " = " + c.add(x, y));
            case '-' -> System.out.println(x + " - " + y + " = " + c.sub(x, y));
            case '*' -> System.out.println(x + " * " + y + " = " + c.mult(x, y));
            case '/' -> System.out.println(x + " / " + y + " = " + c.div(x, y));
        }
    }
}
