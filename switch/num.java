import java.util.*;
public class loops {
    public void display() {
        Scanner sc = new Scanner(System.in);
        int ch;
        int no;
        System.out.println("Enter the value for number");
        no = sc.nextInt();
        System.out.println("Enter 1 For Perfect number");
        System.out.println("Enter 2 For sum of digits");
        System.out.println("Enter your choice");
        ch = sc.nextInt();
        switch (ch) {
            case 1:
                {
                    int sum = 0;
                    for (int i = 1; i < no; i++) {
                        if (no % i == 0)
                            sum = sum + i;
                    }
                    if (sum == no)
                        System.out.println(no + " is a perfect number");
                    else
                        System.out.println(no + " is not a perfect number");
                }
                break;
            case 2:
                {
                    int sum = 0,
                    d;
                    while (no > 0) {
                        d = no % 10;
                        sum = sum + d;
                        no = no / d;
                    }
                    System.out.println("Sum of digits is" + sum);
                }
                break;
            default:
                System.out.println("Wrong choice");
        }
    }
}