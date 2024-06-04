package 실버.괄호_9012;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine(); // 개행문자 처리
        
        for (int i = 0; i < T; i++) {
            String ps = scanner.nextLine();
            System.out.println(isValidParenthesisString(ps) ? "YES" : "NO");
        }
    }

    public static boolean isValidParenthesisString(String ps) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : ps.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        
        return stack.isEmpty();
    }
}
