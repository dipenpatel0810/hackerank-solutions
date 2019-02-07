package HuffmanDecoder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;


class Result {

  /*
   * Complete the 'decode' function below.
   *
   * The function is expected to return a STRING.
   * The function accepts following parameters:
   *  1. STRING_ARRAY codes
   *  2. STRING encoded
   */

  public static String decode(List<String> codes, String encoded) {
    // Write your code here
    HashMap<String, String> charAndCodeMap = new HashMap<>();
    String result = "";
    for (int i = 0; i < codes.size(); i++) {
      String character = "";
      String code = "";
      if (codes.get(i).charAt(1) == '\t'){
        character = codes.get(i).substring(0, 1);
        code = codes.get(i).substring(2);
      }
      else {
        character = Character.toString('\n');
        code = codes.get(i).substring(10);
      }
      charAndCodeMap.put(code, character);
    }

    String encodedCode = "";
    for (int i = 0; i < encoded.length(); i++) {
      encodedCode = encodedCode + encoded.charAt(i);
      if (charAndCodeMap.get(encodedCode) != null) {
        result = result + charAndCodeMap.get(encodedCode);
        encodedCode = "";
      }
    }
    return result;
  }

}

public class Solution {
  public static void main(String[] args) throws IOException {
    /**
     BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
     BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

     int codesCount = Integer.parseInt(bufferedReader.readLine().trim());

     List<String> codes = IntStream.range(0, codesCount).mapToObj(i -> {
     try {
     return bufferedReader.readLine();
     } catch (IOException ex) {
     throw new RuntimeException(ex);
     }
     })
     .collect(toList());

     String encoded = bufferedReader.readLine();

     String result = Result.decode(codes, encoded);

     bufferedWriter.write(result);
     bufferedWriter.newLine();

     bufferedReader.close();
     bufferedWriter.close();
     */
    List<String> codes = new ArrayList<>();
    codes.add("a\t100100");
    codes.add("b\t100101");
    codes.add("c\t110001");
    codes.add("d\t100000");
    codes.add("[newline]\t111111");
    codes.add("p\t111110");
    codes.add("q\t000001");

    String encodedMessage = "111110000001100100111111100101110001111110";

    Result.decode(codes, encodedMessage);
  }
}
