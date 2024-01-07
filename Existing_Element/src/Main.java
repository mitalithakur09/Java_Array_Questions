// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    int[] a = new int[]{56,72,44,87,98};
    int element = 56;
    int count = 0;
    for (int i = 0; i<a.length; i++){
        if(a[i]==element){
           count++;
        }
    }
    if(count>0){
        System.out.println(element+" exist");
    }
    else {
        System.out.println(element+" not exist");
    }
    }
}