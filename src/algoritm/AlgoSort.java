package algoritm;

import java.util.Arrays;

public class AlgoSort {
    public static void main(String[] args) {
//        int[] ex = {43, 34, 2,67,8,886,654,43,32,3,4,56,7};
//        int[] ex1 = {};
//        bubbleSort(ex);
//        bubbleSort(ex1);
//        System.out.println("--------------------------------------------------------------------------");
//        int[] ex2 = {43, 34, 2,67,8,886,654,43,32,3,4,56,7};
//        shakerSort(ex2);
//        System.out.println("--------------------------------------------------------------------------");
//        int[] ex2 = {43, 34, 2,67,8,886,654,43,32,3,4,56,7};
//        combSort(ex2);
        System.out.println("--------------------------------------------------------------------------");
        int[] ex2 = {43, 34, 2,67,8,886,654,43,32,3,4,56,7};
        quickSort(ex2);

    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void bubbleSort(int[] values) {
        for (int i = 0; i + 1 < values.length; ++i) {
            for (int j = 0; j + 1 < values.length - i; ++j) {
                if (values[j + 1] < values[j]) {
                    swap(values, j, j + 1);
                }
            }
            System.out.println(Arrays.toString(values));
        }
    }

    public static void shakerSort(int[] values) {
        if (values.length == 0) {
            return;
        }
        int left = 0;
        int right = values.length - 1;

        while (left <= right) {
            // Проход справа налево
            for (int i = right; i > left; --i) {
                if (values[i - 1] > values[i]) {
                    swap(values, i - 1, i);
                }
                System.out.println(Arrays.toString(values));
            }
            ++left;
            // Проход слева направо
            for (int i = left; i < right; ++i) {
                if (values[i] > values[i + 1]) {
                    swap(values, i, i + 1);
                }
                System.out.println(Arrays.toString(values));
            }
            --right;
        }

    }

    public static void combSort(int[] values) {
        final double factor = 1.247;
        double step = values.length - 1;

        while (step >= 1) {
            int intStep = (int) step;
            for (int i = 0; i + intStep < values.length; ++i) {
                if (values[i] > values[i + intStep]) {
                    swap(values, i, i + intStep);
                }
            }
            step /= factor;

            System.out.println(Arrays.toString(values));
        }

        System.out.println("--------------------------------------------------------------------------");

        // Финальная досортировка пузырьком (как в оригинале)
        for (int i = 0; i + 1 < values.length; ++i) {
            for (int j = 0; j + 1 < values.length - i; ++j) {
                if (values[j + 1] < values[j]) {
                    swap(values, j, j + 1);
                }
            }
            System.out.println(Arrays.toString(values));
        }
    }

    private static int partition(int[] values, int l, int r) {
        int x = values[r];
        int less = l;

        for (int i = l; i < r; ++i) {
            if (values[i] <= x) {
                swap(values, i, less);
                ++less;
            }
        }
        swap(values, less, r);
        System.out.println(Arrays.toString(values));
        return less;
    }

    private static void quickSortImpl(int[] values, int l, int r) {
        if (l < r) {
            int q = partition(values, l, r);
            quickSortImpl(values, l, q - 1);
            quickSortImpl(values, q + 1, r);
            System.out.println(Arrays.toString(values));
        }
    }

    public static void quickSort(int[] values) {
        if (values.length > 0) {
            quickSortImpl(values, 0, values.length - 1);
        }
    }

}
