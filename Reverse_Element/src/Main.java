

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      int[] n = new int[]{2,3,4,5,6,7,8};
      int temp =0;
      int i = 0;
      int j = n.length-1;
      while(i<j){
          temp = n[i];
          n[i] = n[j];
          n[j] = temp;
          i++;
          j--;
      }

     for (int k =0; k<=n.length; k++){
         System.out.println(n[k]);
     }

    }
}