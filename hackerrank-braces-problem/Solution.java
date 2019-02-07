package Braces;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Solution {


  // Complete the braces function below.
  static String[] braces(String[] values) {
    String[] solution = new String[values.length];

    for (int i = 0; i < values.length; i++) {
      Stack<Character> brackets = new Stack<>();
      boolean result = true;
      String chainOfBrackets = values[i];
      for (int j = 0; j < chainOfBrackets.length(); j++) {
        if (chainOfBrackets.charAt(j) == '{') {
          brackets.push('{');
        } else if (chainOfBrackets.charAt(j) == '[') {
          brackets.push('[');
        } else if (chainOfBrackets.charAt(j) == '(') {
          brackets.push('(');
        } else if (chainOfBrackets.charAt(j) == '}') {
          if (brackets.empty()) {
            result = false;
            break;
          } else {
            if (brackets.peek() == '{') {
              brackets.pop();
            } else {
              result = false;
              break;
            }
          }
        } else if (chainOfBrackets.charAt(j) == ']') {
          if (brackets.empty()) {
            result = false;
            break;
          } else {
            if (brackets.peek() == '[') {
              brackets.pop();
            } else {
              result = false;
              break;
            }
          }
        } else if (chainOfBrackets.charAt(j) == ')') {
          if (brackets.empty()) {
            result = false;
            break;
          } else {
            if (brackets.peek() == '(') {
              brackets.pop();
            } else {
              result = false;
              break;
            }
          }
        }
      }
      if (result) {
        solution[i] = "YES";
      } else {
        solution[i] = "NO";
      }
    }

    return solution;
  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException {
    /**
     BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

     int valuesCount = scanner.nextInt();
     scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

     String[] values = new String[valuesCount];

     for (int i = 0; i < valuesCount; i++) {
     String valuesItem = scanner.nextLine();
     values[i] = valuesItem;
     }

     String[] res = braces(values);

     for (int i = 0; i < res.length; i++) {
     bufferedWriter.write(res[i]);

     if (i != res.length - 1) {
     bufferedWriter.write("\n");
     }
     }

     bufferedWriter.newLine();

     bufferedWriter.close();

     scanner.close();
     */

    String[] values = new String[1];
    values[0] = "{}[]()";
//    values[1] = "{[}]}";
    Solution solution = new Solution();
    solution.braces(values);
  }
}

