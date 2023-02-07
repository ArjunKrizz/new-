import java.util.*;

public class Loops {
    public static void main(String[] args){
        boolean condition = true;
        if (condition){
            System.out.println("False condition");

        }
        else{
            System.out.println("else part");
        }
        System.out.println("program ends");
    }

    
}

class Loops1 {
    public static void main(String[] args){
        int age = 25;
        if (age >20 || age>30){
            System.out.println("IF PART");

        }
        else{
            System.out.println("else part");
        }
        
    }    
}

class Loops3 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("enter ur age: ");
        int age =obj.nextInt();
        if (age >=20 && age <30){
            System.out.println("Young");

        }
        else if(age>=30 && age <40){
            System.out.println("adult");
        }
        else if (age>= 40 && age<60){
            System.out.println("Kelvan");
        }
        else{
            System.out.println("too old");
        }
    }    
}







