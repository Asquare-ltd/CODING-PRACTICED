import java.util.Scanner;

class SearchArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter the elements in the array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("The array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        System.out.println("Enter the element to be searched:");
        int key = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (a[i] == key) {
                System.out.println(key + " found in location " + (i + 1));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println(key + " not found in the array.");
        }

        sc.close();
    }
}
