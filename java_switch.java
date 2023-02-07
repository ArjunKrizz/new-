import java.util.*;

public class java_switch {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("enter ur age: ");
        int age =obj.nextInt();
        switch (age){
            case 18:{
                System.out.println("Young");
                break;
            }
            case 45:{
                System.out.println("adult");
                break;

            }
            default:{
                System.out.println("old");
                break;
            }
        }
        
    } 
    
}
