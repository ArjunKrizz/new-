import java.util.*;

public class arrays {
    public static void main(String[] args) {
        String[] name = { "arjun", "roy", "sam" };
        int[] num = { 1, 56, 7, 8 };
        int arr[] = new int[10];

        /*
         * for (int i=0;i<num.length;i++){
         * System.out.println(num[i]);
         * }
         */

        for (String a : name) {
            System.out.println(a);
        }

    }

}

class array_2 {
    public static void main(String[] args) {
        int[] num = new int[5];
        num[0] = 34;
        num[1] = 55;
        num[2] = 55;
        num[3] = 89;

        for (int i : num) {
            System.out.print(i + " ");

        }
        num[7] = 80; // will give error and program exists
        // if we r not filling the values for all indexes with values then that index is
        // filled with garbage or zero because that meor doesnt effect
    }

}

class arr3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] num = new int[4];
        System.out.println(num.length);
        for (int i = 0; i < num.length; i++) {
            System.out.print("Enter ur " + (i + 1) + "st number ");
            num[i] = scan.nextInt();
            // or u can use num[i]=Integer.parseInt(scan.nextLine())
            // compile time error=only for syntax error
            // run time error=if its memory is not located like index out of range
        }

        for (int i : num) {
            System.out.print(i + " ");
        }
    }

}

class arrtask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter length of array you want to create ");
        int n = scan.nextInt();
        int[] num = new int[n];
        int a;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter ur " + (i + 1) + "st number ");
            num[i] = scan.nextInt();
            System.out.print("do you want to continue(enter 1) ");
            a = scan.nextInt();
            if (a != 1) {
                break;

            } else {
                continue;
            }
        }

        for (int i : num) {
            if (i != 0) {
                System.out.print(i + " ");
            }
        }

    }

}

class arrtask1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter length of array you want to create ");
        int n = scan.nextInt();
        int[] num = new int[n];
        int a;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter ur " + (i + 1) + "st number ");
            num[i] = scan.nextInt();
            System.out.print("do you want to continue(enter 1) ");
            a = scan.nextInt();
            if (a != 1) {
                break;
            } else {
                continue;
            }
        }

        System.out.println("Elements in array with size "+n);
        System.out.println(Arrays.toString(num));

    }

}