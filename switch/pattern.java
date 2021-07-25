import java.util.*;
class Main {
    public void display() {
        Scanner sc = new Scanner(System.in);
        int ch;
        System.out.println("Enter 1.For Triangle");
        System.out.println("Enter 2.For Inverted Triangle");
        System.out.println("Enter 3.For Special Triangle ");
        System.out.println("Enter your choice");
        ch = sc.nextInt();
        switch (ch) {
            case 1:
                {
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(i + " ");
                        }
                        System.out.println();
                    }
                }
                break;
            case 2:
                {
                    for (int i = 5; i >= 0; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(i + " ");
                        }
                        System.out.println();
                    }
                }
                break;
            case 5:
                {
                    for (int i = 1; i <= 0; i++) {
                        for (int j = 1; j <= i; j++) {
                            if (j % 2 == 0)
                                System.out.print("#" + " ");
                            else
                                System.out.print("@" + " ");
                        }
                        System.out.println();
                    }
                }
                break;
            default:
                System.out.println("Wrong choice");
        }

    }
    public static void main(String[] args) {
        Main Obj = new Main();
        Obj.display();
    }

}
