import java.util.Scanner;

public class findMinMax {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int choice = 1;
        while (choice != 3) {
            System.out.println("1:Find the biggest number");
            System.out.println("2:Find the smallest number");
            System.out.println("3:Exit");

            choice = input.nextInt();

            if (choice == 1) {
                findMax(input);
            }

            if (choice == 2) {
                findMin(input);
            }
        }
        input.close();
    }


    public static void findMax(Scanner input) {
        int[] numbers = new int[3];
        System.out.println("Enter number:");
        numbers[0] = input.nextInt();

        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            System.out.println("Enter number:");
            numbers[i] = input.nextInt();

            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        System.out.println("Highest number: " + max);
    }


    public static void findMin(Scanner input) {
        int[] numbers = new int[3];
        System.out.println("Enter number:");
        numbers[0] = input.nextInt();

        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            System.out.println("Enter number:");
            numbers[i] = input.nextInt();

            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        System.out.println("Lowest number is:" + min);
    }
}



