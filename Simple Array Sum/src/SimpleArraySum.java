import java.util.Scanner;

public class SimpleArraySum {

    public static void  main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter? ");
        int num = input.nextInt();

        int array[] = new int[num];

        System.out.println("Enter the " + num + " numbers");

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        System.out.println("These are the numbers you have entered are: \n ");
        printArray(array);

        System.out.printf("\n The sum of the elements is: ");
        sum(array);
        


        input.close();
    }

    private static void sum() {
    }

    public static void printArray(int arr[]) {

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public void sum(int[] arr){
        int n = arr.length;
        int total =0;

        for (int i=0; i< n; i++){
            total+= arr[i];
        }
        System.out.print(total);
    }
}








