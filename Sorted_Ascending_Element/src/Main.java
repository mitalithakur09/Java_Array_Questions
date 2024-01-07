// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] a = new int[]{5,7,8,9,2,1};
        System.out.println("The original array is:");
        for(int i = 0; i< a.length; i++){
            System.out.println(a[i]);
        }
        int temp = 0;
        for (int i = 0; i<a.length;i++){
            for(int j=i+1; j<a.length;j++){
                if (a[i]>a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("The sorted array in ascending order is:");
        for (int i = 0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }
}