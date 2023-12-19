// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      sum(new int[]{10,20,30,40,50});
    }
    public static void sum(int[] a){
        int total=0;
        for (int i : a){
            total = total+i;
            System.out.println(total);
        }

    }
}