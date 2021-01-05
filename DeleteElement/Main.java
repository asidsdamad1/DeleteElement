package DeleteElement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int array[] = {1, 4 , 7, -2, 6, 8};
        Scanner sc = new Scanner(System.in);
//        System.out.println("Property Array:");
//        printArray(array);
        System.out.print("Nhập vị trí muốn xóa: ");
        int index = sc.nextInt();
        if(index > array.length || index < 0) System.out.printf("Vị trí không có trong mảng!");
        else {
            printArray(deleteElement(array, index));
        }
    }

    private static void printArray(int array[]) {
        for (int i = 0; i < array.length-2; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static int[] deleteElement(int oldArray[], int index) {
        int length = oldArray.length;
        int newArray[] = new int[length+1];
        for(int i = 0; i <  index; i++) {
            newArray[i] = oldArray[i];
        }
        for(int i = index+1; i < length; i++) {
            newArray[i-1] = oldArray[i];
        }
        return newArray;
    }

}
