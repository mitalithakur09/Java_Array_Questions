// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,2,3,4,5,5};
        int[] temp = new int[a.length];
        int j=0;
        for(int i =0; i<a.length-1;i++){
            if(a[i]!=a[i+1]){
                temp[j]=a[i];
                j++;
            }
        }
        temp[j]=a[a.length-1];
        for(int i =0; i< temp.length;i++){
            System.out.println(temp[i]);
        }
    }
}