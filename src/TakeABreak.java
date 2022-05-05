import java.util.Scanner;

public class TakeABreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        while(true){
        System.out.println("Do you want to take a break?");
        String userInput = scanner.nextLine();

        if (userInput.equals("yes")){
            break;
        }
        scanner.close();
    }
    }
}

class StopAtFive{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("Give a number: ");
            int number = Integer.valueOf(scan.nextLine());
            if (number == 5){
            break;  
            }
        }
        scan.close();
    }
}

class PositiveNumbers{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        while(true){
        System.out.println("Give a number: ");
        int num = Integer.valueOf(scan.nextLine());
        if (num < 0){
            System.out.println("Number must be a positive number");
        }else if (num == 0){
            break;
        }
    }
    }
}

class CountToEleven{
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number less than 11");
        int numInput = Integer.valueOf(scan.nextLine());

        for(int i = 0; i < 12; i ++){
            System.out.println(i);
        }
        scan.close();
    }
}


class Multiplication{
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);

        
        System.out.println("Input a a number:");
        int num1 = Integer.valueOf(scan.nextLine());

        for(int i = 1; i < 11; i ++){
            System.out.println(num1 + " X " + i + " = " + (num1) * i );
}
scan.close();
    }
}

