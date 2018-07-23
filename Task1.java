import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String args[]) {
        int[] intArray = {1, 5, 5, 5, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 5, 5, 5, 5, 5};
        printMessageToConsole(intArray);
        mostSequence(intArray);
    }

    public static void printMessageToConsole(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(" arg " + i + ": " + intArray[i]);
        }
    }

    public static void mostSequence(int[] intArray) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        int maxCount = 0;
        int currentCount = 0;
        int a = 0;
        for (int i = 0; i < intArray.length; i++) {
            Integer frequency = hashMap.get(intArray[i]);
            if (frequency == null) {
                currentCount = 1;
            } else {
                currentCount = frequency + 1;
            }
            hashMap.put(intArray[i], currentCount);


            if (maxCount < currentCount) {
                maxCount = currentCount;
                a = intArray[i];
            }
        }
        System.out.println("The longest recurring sequence: " + a + ", quantity: " + maxCount + " times");
    }
}