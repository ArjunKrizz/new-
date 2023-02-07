import java.util.*;
public class whileLoop {
    public static void main(String[] args){
        int a =0;
        while(a<=5){
            System.out.println(a);
            a+=1;
        }






    }
    
}

class Dowhile {
    public static void main(String[] args){
        int a =0;
        Scanner scan=new Scanner(System.in);
        char ch;
        do{
            System.out.println("Executing.");
            System.out.println("to continue y :.");
            ch=scan.nextLine().charAt(0);
            

        }while(ch=='y'|| ch=='Y');
        System.out.print("programm end");






    }
    
}



class loopquestion{
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        int a;
        int b;
        int c;
        char f;

        do{ 
            System.out.print("choose the operation you want to perfom add(1),sub(2),div(3),mul(4)  :");
            a=scan.nextInt();
            System.out.print("Enter 1st integer :");
            b=scan.nextInt();
            System.out.print("Enter 2nd integer :");
            c =scan.nextInt();
            if(a==1){
                System.out.println(b+c);
            }
            else if(a==2){
                System.out.println(b-c);
            }
            else if(a==3){
                System.out.println(b/c);
            }
            else if(a==4){
                System.out.println(b*c);
            }
            else{
                System.out.println("this operation not available");
            }
            System.out.print("do you want to conitue y or n");
            scan.nextLine();
            f=scan.nextLine().charAt(0);






        }while(f=='Y' || f=='y');
        System.out.print("fuck");


        

    }

}








