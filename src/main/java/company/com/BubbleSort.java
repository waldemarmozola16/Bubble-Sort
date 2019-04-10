package company.com;

import java.util.Arrays;

public class BubbleSort {
    public static int[] bubblesortMethode(int sortMe[]) {
        int nrOfSwaps = 0;

        for (int i = 0; i < sortMe.length - 1; i++) {
            for (int j = i + 1; j < sortMe.length; j++) {
                if (sortMe[i] > sortMe[j]) {
                    int temp = sortMe[j];
                    sortMe[j] = sortMe[i];
                    sortMe[i] = temp;
                }
            }
            nrOfSwaps++;
        }
        System.out.println("Number of swaps" + " " + nrOfSwaps);
        return sortMe;
    }

    public static void main(String[] args) {
        int sortMe[] = {4, 5, 8, 1};
        System.out.println(Arrays.toString(bubblesortMethode(sortMe)));
    }
}
