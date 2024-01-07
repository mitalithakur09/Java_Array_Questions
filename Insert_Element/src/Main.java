// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      int pos = 2;
      int element = 20;
      int[] a = new int[]{2,3,4,5,6,7,8,9};
      for(int i = a.length-1;i>pos-1;i--){
          a[i]=a[i-1];
      }
      a[pos-1]=element;
      for (int i =0;i<=a.length;i++){
          System.out.println(a[i]);
      }
    }
}