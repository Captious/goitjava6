package ua.goit.module.first.homework.second;

import java.math.BigDecimal;
import java.math.BigInteger;

public class ArrayCalculationUtil {
    private static int MODULUS_ARRAY_SIZE = 2;

    private ArrayCalculationUtil() {

    }

    public static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; ++i) {
            for (int j = 1; j < array.length - i; ++j) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static double[] bubbleSort(double[] array) {
        for (int i = 0; i < array.length - 1; ++i) {
            for (int j = 1; j < array.length - i; ++j) {
                if (array[j - 1] > array[j]) {
                    double temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static boolean isArraySorted(int[] array) {
        for (int i = 0; i < array.length - 1; ++i) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isArraySorted(double[] array) {
        for (int i = 0; i < array.length - 1; ++i) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static int sum(int[] array) {
        int result = 0;
        for (int value : array) {
            result += value;
        }
        return result;
    }

    public static double sum(double[] array) {
        double result = 0D;
        for (double value : array) {
            result += value;
        }
        return result;
    }

    public static int min(int[] array) {
        if (isArraySorted(array)) {
            return array[0];
        }
        return bubbleSort(array)[0];
    }

    public static double min(double[] array) {
        if (isArraySorted(array)) {
            return array[0];
        }
        return bubbleSort(array)[0];
    }

    public static int max(int[] array) {
        if (isArraySorted(array)) {
            return array[array.length - 1];
        }
        return bubbleSort(array)[array.length - 1];
    }

    public static double max(double[] array) {
        if (isArraySorted(array)) {
            return array[array.length - 1];
        }
        return bubbleSort(array)[array.length - 1];
    }

    public static int maxPositive(int[] array) {
        if (isArraySorted(array)) {
            return array[array.length - 1] > 0 ? array[array.length - 1] : 0;
        }
        return bubbleSort(array)[array.length - 1] > 0 ? array[array.length - 1] : 0;
    }

    public static double maxPositive(double[] array) {
        if (isArraySorted(array)) {
            return array[array.length - 1] > 0 ? array[array.length - 1] : 0;
        }
        return bubbleSort(array)[array.length - 1] > 0 ? array[array.length - 1] : 0;
    }

    public static String multiplication(int[] array) {
        BigInteger result = BigInteger.ONE;
        for (int value : array) {
            result = result.multiply(BigInteger.valueOf(value));
        }
        return result.toString();
    }

    public static String multiplication(double[] array) {
        BigDecimal result = BigDecimal.ONE;
        for (double value : array) {
            result = result.multiply(BigDecimal.valueOf(value));
        }
        result = result.setScale(2, 2);
        return result.toString();
    }

    public static int[] modulus(int[] array) {
        int[] modulus = new int[MODULUS_ARRAY_SIZE];
        modulus[0] = Math.abs(array[0]);
        modulus[1] = Math.abs(array[array.length - 1]);
        return modulus;
    }

    public static double[] modulus(double[] array) {
        double[] modulus = new double[MODULUS_ARRAY_SIZE];
        modulus[0] = Math.abs(array[0]);
        modulus[1] = Math.abs(array[array.length - 1]);
        return modulus;
    }

    public static int secondLargest(int[] array) {
        if (isArraySorted(array)) {
            return array[array.length - 2];
        }
        return bubbleSort(array)[array.length - 2];
    }

    public static double secondLargest(double[] array) {
        if (isArraySorted(array)) {
            return array[array.length - 2];
        }
        return bubbleSort(array)[array.length - 2];
    }
}
