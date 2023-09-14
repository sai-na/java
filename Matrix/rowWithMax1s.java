public class rowWithMax1s {

  int rowWithMax1sFun(int arr[][], int n, int m) {
    int index = -1;
    int max = 0;

    for (int i = 0; i < arr.length; i++) {
      int count = 0;
      for (int j = 0; j < arr[i].length; j++) {
        if (arr[i][j] == 1) count++;
      }
      if (count > max) {
        max = count;
        index = i;
      }
    }

    return index;
  }
}
