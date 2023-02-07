import java.util.*;;

public class name_age_class {
    public static void main(String[] args){


        Scanner obj = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name=obj.nextLine();
        System.out.print("enter ur age: ");
        int age =Integer.parseInt(obj.nextLine());
        System.out.print("Enter your class : ");
        String clas=obj.nextLine();
        
        System.out.println("Name:" +name);
        System.out.println("age:" + age);
        System.out.println("class:" +clas);
    } 
    
}



class Switchex {
    public static void main(String[] args){


        Scanner obj = new Scanner(System.in);

        System.out.print("Enter a number :");
        int day=obj.nextInt();
        if (day==1){
            System.out.println("Monday");

        }
        else if (day==2){
            System.out.println("Tuesday");

        }
        else if (day==3){
            System.out.println("Wednseday");

        }
        else if (day==4){
            System.out.println("Tursday");

        }
        else if (day==5){
            System.out.println("Friday");

        }
        else if (day==6){
            System.out.println("Saturday");

        }
        else if (day==7){
            System.out.println("Sunday");

        }
        else{
            System.out.println("No more days available");

        }

    } 
    
}

class withswitch {
    public static void main(String[] args){


        Scanner obj = new Scanner(System.in);

        System.out.print("Enter a number :");
        int day=obj.nextInt();
        switch(day){
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 13:
            System.out.println("Thursday");
            break;
        }

    } 
    
}

