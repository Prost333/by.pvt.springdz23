package by.pvt.spring;

import java.util.Arrays;


public class Ghost {

        public static int convertBinaryArrayToInt(int[] binaryArray) {
            int result = 0;
            for (int i = 0; i < binaryArray.length; i++) {
                result += binaryArray[i] * Math.pow(2, binaryArray.length - 1 - i);
            }
            return result;
        }
        public static void main(String[] args) {
            int[] binaryArray = {0, 0, 1, 0};
            int number = convertBinaryArrayToInt(binaryArray);
            System.out.println("Testing: " + Arrays.toString(binaryArray) + " ==> " + number);

}}
