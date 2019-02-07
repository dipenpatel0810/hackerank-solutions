
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;


class Result {

  /*
   * Complete the 'roverMove' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts following parameters:
   *  1. INTEGER matrixSize
   *  2. STRING_ARRAY cmds
   */

  public static int roverMove(int matrixSize, List<String> cmds) {
    // Write your code here

    int size = matrixSize;
    //Starting from origin. Hence our co-ordinates would be [0][0]
    int i = 0;
    int j = 0;

    for (int k = 0; k < cmds.size(); k++) {
      if (cmds.get(k).equals("UP")) {
        if (i == 0) {
          i = 0;
        } else {
          i = i - 1;
        }
      } else if (cmds.get(k).equals("DOWN")) {
        if (i == (size - 1)) {
          i = size - 1;
        } else {
          i = i + 1;
        }
      } else if (cmds.get(k).equals("LEFT")) {
        if (j == 0) {
          j = 0;
        } else {
          j = j - 1;
        }
      } else if (cmds.get(k).equals("RIGHT")) {
        if (j == (size - 1)) {
          j = size - 1;
        } else {
          j = j + 1;
        }
      }
    }

    // value is given by (row*size)+column
    return (i * size) + j;
  }

}

public class Solution {
  public static void main(String[] args) throws IOException {
    /**
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    int matrixSize = Integer.parseInt(bufferedReader.readLine().trim());

    int cmdsCount = Integer.parseInt(bufferedReader.readLine().trim());

    List<String> cmds = IntStream.range(0, cmdsCount).mapToObj(i -> {
      try {
        return bufferedReader.readLine();
      } catch (IOException ex) {
        throw new RuntimeException(ex);
      }
    })
        .collect(toList());

    int result = Result.roverMove(matrixSize, cmds);

    bufferedWriter.write(String.valueOf(result));
    bufferedWriter.newLine();

    bufferedReader.close();
    bufferedWriter.close();
     */

    Result result = new Result();
    List<String> cmds = new ArrayList<>();

    //The custom test case
    cmds.add("RIGHT");
    cmds.add("UP");
    cmds.add("DOWN");
    cmds.add("LEFT");
    cmds.add("LEFT");
    cmds.add("DOWN");
    cmds.add("DOWN");
    result.roverMove(4, cmds);

  }
}

