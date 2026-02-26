import java.util.*;
public class ArrayMethode {
    public static void main(String[] args) {

        int[] vector = {80, 81, 82,56,12,3};
        int[] arr = {2,17,80, 81, 82,78};
        System.out.println(Arrays.equals(vector,arr));


        {
            {   //Gleichheit von Teil-Array
                System.out.println(Arrays.equals(vector, 0, 1, arr, 2, 3));
                int[] werte = new int[10];
                for (int i = 0; i < werte.length; i++) {
                    werte[i] = (i + 1) * 2;
                }}

          //  System.out.println("Index " + i + " = " + werte[i]);

            int[] werte = {1,2,3,4,5};
            int[] kopie = werte.clone();
            kopie[3]=100;
            System.out.println(werte[3]);
            system.out.printn("hallo welt");


        }
        }
    }

