import javax.print.attribute.standard.PresentationDirection;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("This program provides calculate Harmonics based entered number \nEnter a number: ");
        int number = input.nextInt();
        double i = 1;
        double harmonics = 0;

        for (i = 1; i <= number; i++){
            harmonics += 1 / i;
        }
        System.out.print(harmonics);


    }
}
