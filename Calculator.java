import java.util.*;
import javax.swing.*;


class Number{
    int a;
    int b;
    Number(int a)
    {
        this.a = a;
        this.b = 0;
    }
    Number(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    void power(int base, int power)
    {
        double P = Math.pow(base, power);
        JOptionPane.showMessageDialog(null,base +" raise to "+ power+ " is: " +P);
    }

    long  fact(int num)
    {
        if (num==0 || num ==1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }

        return result;
    }

    boolean perf(int num)
    {
        int sqrt = (int) Math.sqrt(num);
        return sqrt*sqrt == num;
    }
}

public class Calculator {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        String choice, base, power, fact, perf;
        
        choice  = JOptionPane.showInputDialog("Enter your choice from below(a/b/c): \n a)Power Function \n b)Factorial \n c)Perfect Number Determination");
        char input = choice.charAt(0);

    
        switch (input) {
            case 'a':
                base = JOptionPane.showInputDialog("For power function enter the base: ");
                while ((Integer.parseInt(base) < 0))
                {
                    JOptionPane.showMessageDialog(null, "Enter non-negative value.");
                    base = JOptionPane.showInputDialog("For power function enter the base: ");
                }

                power = JOptionPane.showInputDialog("For power function enter the power: ");

                Number number1 = new Number(Integer.parseInt(base),Integer.parseInt(power));
                number1.power(number1.a, number1.b);  
                break;
            
            case 'b':
                fact = JOptionPane.showInputDialog("Enter the number for its factorial: ");
                while(Integer.parseInt(fact) < 0)
                {
                    JOptionPane.showMessageDialog(null, "Enter non-negative value.");
                    fact = JOptionPane.showInputDialog("Enter the number for its factorial: ");
                }

                Number number2 = new Number(Integer.parseInt(fact));
                long factorial = number2.fact(number2.a);
                JOptionPane.showMessageDialog(null,"The factorial of "+ number2.a +" is: "+factorial);

            break;

            case 'c':
                perf = JOptionPane.showInputDialog("Enter the number: ");
                while(Integer.parseInt(perf)<0)
                {
                    JOptionPane.showMessageDialog(null, "Enter non-negative value.");
                    perf = JOptionPane.showInputDialog("Enter the number: ");
                }

                Number number3 = new Number(Integer.parseInt(perf));
                boolean sqr = number3.perf(number3.a);
                if (sqr) 
                {
                    JOptionPane.showMessageDialog(null,number3.a+ " is a perfect square.");
                }
                else
                {
                    JOptionPane.showMessageDialog(null,number3.a+ " is not a perfect square.");
                }
            break;

            default:
                break;
        }

    }
}
