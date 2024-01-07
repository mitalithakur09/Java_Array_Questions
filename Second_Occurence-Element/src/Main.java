import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        int[] a = new int[]{1,2,7,3,5,6,7};
        int key = 7;
        int count = 0;
        int i = 0;
        for ( i =0;i<=a.length; i++){
            if(a[i]==key){
                count++;
            }
            if (count==2){
                break;
            }
        }
        if(count==2){
            System.out.println("The element second occurence index is "+i);
        }
        else{
            System.out.println("No element occurs");
        }

    }
}