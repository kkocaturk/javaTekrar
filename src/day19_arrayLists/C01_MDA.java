package day19_arrayLists;

import java.util.Arrays;

public class C01_MDA {
    public static void main(String[] args) {

        int aarrr[]={12,23,12,2,3};                     //          -1       -3        -->aarrr'de 1 ararsa -1, 5 ararsa -3 verme mantığı
        Arrays.sort(aarrr);                             //              1   2   3    4    5    -->aarrr dizinin sahip olduğu elemanların sırası
                                                        //            1       5
        System.out.println(Arrays.toString(aarrr));     //           [  2,  3,  12,  12,  23]
        System.out.println(Arrays.binarySearch(aarrr,1));       //-1
        System.out.println(Arrays.binarySearch(aarrr,5));       //-3
        System.out.println(Arrays.binarySearch(aarrr,11));      //-3  ->değer 12 'yi  geçmediği için -3 döndü !!
        System.out.println(Arrays.binarySearch(aarrr,10));      //-3


        //Soru 2- Verilen 2 katli bir array’de
        //        ayni index’e sahip elementleri toplayip,
        //        yeni olusturacagimiz tek katli bir array’e bu toplamlari atayin.
        //	input :      int[][] arr =  {{3,4,5}, {2,3,6,7}};
        //	output:                     [5, 7, 11]


        int[][] arr =  {{3,4,5}, {2,3,6,7},{2,3}};

        // ortak index kullanabilmek icin en kisa olani bulmaliyiz

        int enKisaArrayLength = arr[0].length; //3

        for (int i = 0; i <arr.length ; i++) {

            if (arr[i].length < enKisaArrayLength){
                enKisaArrayLength = arr[i].length;
            }
        }

        // toplamlari koymak icin yeni bir array olusturalim

        int[] toplamlarArrayi= new int[enKisaArrayLength];

        int indexdekiElementlerToplami=0;

        for (int i = 0; i < toplamlarArrayi.length ; i++) {

            for (int j = 0; j <arr.length ; j++) {

                indexdekiElementlerToplami += arr[j][i];
            }
            toplamlarArrayi[i]=indexdekiElementlerToplami;
            indexdekiElementlerToplami=0;
        }

        System.out.println(Arrays.toString(toplamlarArrayi));

    }
}
