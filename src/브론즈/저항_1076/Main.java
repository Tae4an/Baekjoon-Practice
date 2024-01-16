package 브론즈.저항_1076;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> valueMap = new HashMap<>();
        valueMap.put("black", 0);
        valueMap.put("brown", 1);
        valueMap.put("red", 2);
        valueMap.put("orange", 3);
        valueMap.put("yellow", 4);
        valueMap.put("green", 5);
        valueMap.put("blue", 6);
        valueMap.put("violet", 7);
        valueMap.put("grey", 8);
        valueMap.put("white", 9);

        String firstColor = scanner.nextLine();
        String secondColor = scanner.nextLine();
        String thirdColor = scanner.nextLine();

        long resistance = (valueMap.get(firstColor) * 10L + valueMap.get(secondColor)) * (long)Math.pow(10, valueMap.get(thirdColor));

        System.out.println(resistance);
    }
}
