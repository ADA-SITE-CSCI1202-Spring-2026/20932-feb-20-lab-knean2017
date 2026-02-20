import java.util.Scanner;

public class Array2 {

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int[] findBoth(int[] array) {
        return new int[]{findMin(array), findMax(array)};
    }

    
    public static void main(String[] args) {
        // Argument implementation

        // if (args.length > 0) {
        //     int[] array = new int[args.length];
        //     for (int i = 0; i < args.length; i++) {
        //         array[i] = Integer.parseInt(args[i]);
        //     };
        //       int[] result = findBoth(array);
        //     int min = result[0];
        //     int max = result[1];
        //     System.out.println("Minimum: " + min);
        //     System.out.println("Maximum: " + max);
        // }

        // Scanner implementation
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt(); 
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        
        }
        int[] result = findBoth(array);
        int min = result[0];
        int max = result[1];
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);

        scanner.close();
    }

}
