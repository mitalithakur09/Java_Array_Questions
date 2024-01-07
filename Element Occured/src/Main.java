// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] a = new int[]{3,4,5,3,6,7,3,8,9,3,};
        int count = 0;
      for (int i : a){
          if (i==3){
            count++;
          }
      }
      System.out.println(count);

    }

}