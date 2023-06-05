package day20_arrayLists;


import java.util.ArrayList;
import java.util.List;

/**
 * dikkat dikkat!!
 * elementyerDegistir(degisecekList, i, j)
 * methodu degisecekList List'in içindeki elementleri
 *  i ve j indislerini yerini değiştirir.
 * @params
 * list
 * i
 * j
 * @author kerim
 */
public class C11_Listenin2ElementYeriDegistir {
    public static void main(String[] args) {
        // odev : verilen bir listede, istenen 2 index'deki elementlerin yerini degistirip
        //        yeni listeyi bize donduren bir method olusturun

        List<Integer> degisecekList=new ArrayList<>();
        degisecekList.add(1);
        degisecekList.add(2);
        degisecekList.add(3);
        degisecekList.add(31);
        degisecekList.add(32);
        degisecekList.add(33);
        System.out.println("degisecekList = \n" + degisecekList);
        System.out.println("elementyerDegistir( degisecekList,0,5) = \n" + elementyerDegistir(degisecekList, 0, 5));

        int i = 0;
        while (i < 10) {
            i++;
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("---");
        for (int k = 0; k < 10; k++) {
            if (k == 5) {
                break;
            }
            System.out.println(k);
        }
    }



    public static List<Integer> elementyerDegistir(List<Integer> degList, int i, int j) {
        List<Integer> myList=degList;

        Integer temp= degList.get(i);
        myList.set(i, degList.get(j));
        myList.set(j,temp);

        return myList;

    }

}
