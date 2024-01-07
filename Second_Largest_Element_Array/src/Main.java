// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       int[] a = new int[]{4,5,3,1,9,8};
       int temp = 0;

       for(int i = 0; i<a.length;i++){
          for(int j = i+1;j<a.length;j++){
              if(a[j]>a[i]){
                  temp = a[i];
                  a[i] = a[j];
                  a[j] = temp;
              }
          }

       }
       for(int i = 0;i<a.length;i++){
           System.out.println(a[i]);
           System.out.println(a[1]);
       }
    }
}