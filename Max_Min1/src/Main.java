// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       int[] a = new int[]{90,20,150,40,200};
       int max = a[0];
       for(int i = 1; i<a.length; i++){
           if(a[i]>max){
               max = a[i];
           }
       }
       System.out.println("max is " + max);

       int min = a[0];
       for (int j = 1; j<a.length; j++){
           if(a[j]<min){
               min = a[j];
          }
       }
       System.out.println("min is  "+min);
    }
}