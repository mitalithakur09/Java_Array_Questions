// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       int[][][] a= new int[][][]{{{10,20},{30,40,50},{70,80}}};
       for (int i = 0;i<a.length;i++){
           for(int j = 0;j<a[i].length;j++){
               for(int k = 0;k<a[i][j].length;k++){
                   System.out.println(a[i][j][k]);
               }
           }
       }



    }
}