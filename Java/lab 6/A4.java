import java.util.Arrays;

class A {
    int[] arr = {5, 2, 8, 1, 4};

    void sortArray() {
        Arrays.sort(arr);
        System.out.print("Sorted Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    void searchArray(int key) {
        boolean found = false;
        for (int i : arr) {
            if (i == key) {
                found = true;
                break;
            }
        }
        if (found)
            System.out.println("Element " + key + " found in array.");
        else
            System.out.println("Element " + key + " not found in array.");
    }

    void sumArray() {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Sum of Array: " + sum);
    }

    void avgArray() {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        double avg = (double) sum / arr.length;
        System.out.println("Average of Array: " + avg);
    }
}
public class A4 {
    public static void main(String[] args) {
        A obj = new A();
        obj.sortArray();
        obj.searchArray(8);
        obj.sumArray();
        obj.avgArray();
    }
}
