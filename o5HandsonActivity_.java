import java.util.Scanner;

public class o5HandsonActivity_{
    public static void main(String[] args) {
        Scanner askingnInitial = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        int asking1 = askingnInitial.nextInt();
        System.out.print("Please enter the second number: ");
        int asking2 = askingnInitial.nextInt();
        
        if (asking1 == asking2) {
            System.out.println(asking1 + " and " + asking2 + " are equal ");
            
        }else{
            System.out.println(asking1 + " and " + asking2 + " not equal"); 
        }
    }
} 