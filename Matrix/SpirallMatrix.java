import java.util.ArrayList;

public class SpirallMatrix {

  int[][] matrix1 = {
    { 1, 2, 3, 4 },
    { 5, 6, 7, 8 },
    { 9, 10, 11, 12 },
    { 13, 14, 15, 16 },
  };

  static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c) {
    ArrayList<Integer> arr = new ArrayList<Integer>();

    int rowStart = 0;
    int rowEnd = matrix.length;
    int colStart = 0;
    int colEnd = matrix[0].length;

    while ((rowStart <= rowEnd) && (colStart <= colEnd)) {}

    return arr;
    // code here
  }
}
