import java.util.Scanner;
public class FirstProg {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the student's final letter grade? ");
        var num = scan.nextLine();

        switch (num){

            case "A+":
                System.out.println("The student receives a grade point of 4.33");
                break;
            case "A":
                System.out.println("The student receives a grade point of 4.0" );
                break;
            case "A-":
                System.out.println("The student receives a grade point of 3.67" );
                break;
            case "B+":
                System.out.println("The student receives a grade point of 3.33");
                break;
            case "B":
                System.out.println("The student receives a grade point of 3.00");
                break;
            case "B-":
                System.out.println("The student receives a grade point of 2.67");
                break;
            case "C+":
                System.out.println("The student receives a grade point of 2.33");
                break;
            case "C":
                System.out.println("The student receives a grade point of 2.00" );
                break;
            case "C-":
                System.out.println("The student receives a grade point of 1.67");
                break;
            case "D":
                System.out.println("The student receives a grade point of 1.00");
                break;
            case "F":
                System.out.println("The student receives a grade point of 0.00" );
                break;
            case "DNC":
                System.out.println("The student receives a grade point of 0.00");
                break;
        }

        scan.close();
    }
}
