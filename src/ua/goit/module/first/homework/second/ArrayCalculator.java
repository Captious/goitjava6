package ua.goit.module.first.homework.second;

import java.util.Arrays;
import java.util.Random;

public class ArrayCalculator {
    private static final int ARRAY_SIZE = 10;
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        int[] intArray = fillIntArray(ARRAY_SIZE);
        double[] doubleArray = fillDoubleArray(ARRAY_SIZE);
        System.out.println(String.format("Int array: %s", Arrays.toString(intArray)));
        System.out.println(String.format("Double array: %s", Arrays.toString(doubleArray)));
        System.out.println(String.format("Int array sum = %d", ArrayCalculationUtil.sum(intArray)));
        System.out.println(String.format("Double array sum = %.2f", ArrayCalculationUtil.sum(doubleArray)));
        System.out.println(String.format("Int array min = %d", ArrayCalculationUtil.min(intArray)));
        System.out.println(String.format("Double array min = %.2f", ArrayCalculationUtil.min(doubleArray)));
        System.out.println(String.format("Int array max = %d", ArrayCalculationUtil.max(intArray)));
        System.out.println(String.format("Double array max = %.2f", ArrayCalculationUtil.max(doubleArray)));
        System.out.println(String.format("Int array max positive = %d", ArrayCalculationUtil.maxPositive(intArray)));
        System.out.println(String.format("Double array max positive = %.2f", ArrayCalculationUtil.maxPositive(doubleArray)));
        System.out.println(String.format("Int array multiplication = %s", ArrayCalculationUtil.multiplication(intArray)));
        System.out.println(String.format("Double array multiplication = %s", ArrayCalculationUtil.multiplication(doubleArray)));
        System.out.println(String.format("Int array modulus = %s", Arrays.toString(ArrayCalculationUtil.modulus(intArray))));
        System.out.println(String.format("Double array modulus = %s", Arrays.toString(ArrayCalculationUtil.modulus(doubleArray))));
        System.out.println(String.format("Int array second largest = %d", ArrayCalculationUtil.secondLargest(intArray)));
        System.out.println(String.format("Double array second largest = %.2f", ArrayCalculationUtil.secondLargest(doubleArray)));
    }

    private static int[] fillIntArray(int arraySize) {
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; ++i) {
            array[i] = RANDOM.nextInt(100) - 50;
        }
        return array;
    }

    private static double[] fillDoubleArray(int arraySize) {
        double[] array = new double[arraySize];
        for (int i = 0; i < arraySize; ++i) {
            array[i] = Math.round((RANDOM.nextDouble() * 100D - 50D) * 100D) / 100D;
        }
        return array;
    }
}
