// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] a = new int[]{23,45,6,7,89,21};
        for(int i =0; i<a.length; i++){
            if(i%2!=0){
                System.out.println(a[i]);
            }
        }
    }
}