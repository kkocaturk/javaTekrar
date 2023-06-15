# Gün gün java çalışmalarım 
## 1. gün
Github kullanımı tekrarı
[link ekleme google açılacak](http:/google.com)
* git init -- ilk kez proje oluşturma
* git add <file>
- git add . (all)
- git commit -m "açıklama"
- git status       --> dosyaların durumunu gösterir
- git diff        --> dosyadaki değişikliği gösterir
- git checkout branchName  --> branchler arası geçiş
- git push  -->uzak sunucuya gönderme
- git pull   --> uzak sunucudan alma
- git clone   -> clone etme

## 2. gün
###detaylı bilgi commonmark.org/help
[gitmek için tıkla](https://commonmark.org/help)
* README.md -->.md markdown dosyasıdır.
- -list item yazılması
- -list item yazılması2
* *list item yazılması
* *list item2 yazılması
### * italic *      ve   ** bold **     ve      *** bolditalic *** yazma
*italic*  **bold**  ***bolditalic***
- [link ekleme](https://www.github.com/kkocaturk)
***
- image eklemek için sadece link kodunun başına ! eklenir
----------------------
![image](https://fastly.picsum.photos/id/9/5000/3269.jpg?hmac=cZKbaLeduq7rNB8X-bigYO8bvPIWtT-mh8GRXtU3vPc)
----------------

> Blockquote 
> bu kısımda kullanışlı

`System.out.println("Hello world!");  // kısa kodlama alanı inline code ` iki ` arasında kullanılır  


```
# code block 3 adet ` backticks ile açılır
print '3 backticks or'
print 'indent 4 spaces'
```
kullanılan yazılım dili de belirtilebiliriz.

```java
class Myspace {
    public static void main(String [] args) {
        System.out.println("Java candır!");
}
}
```

```javascript
console.log("Hello world");
function helloWorld() {
console.log("Hello world")
}
```
1. Liste Elemanı sıralı liste oluşturma
2. Liste Elemanı
3. Liste Elemanı
---
1. Liste Elemanı, markdown satır başında 1. yazıyor--> 1 olarak düzenliyor
8. Liste Elemanı, markdown satır başında 8. yazıyor--> 2 olarak düzenliyor
13. Liste Elemanı, markdown satır başında 13. yazıyor-->3 olarak düzenliyor
--- 
-- içiçe liste yapmak--
1. Liste Elemanı
1. Alt Liste Elemanı
2. Alt Liste Elemanı
2. Liste Elemanı
3. Liste Elemanı
---
- tablo yapmak

| Ürünlerin Numaraları| Ürün Açıklaması| Ürünlerin Fiyatı|
| :--- | :---: | ---: |
| 1 | Açıklama | Fiyatı |

## 3. gün
- DataCasting çalışması ve Wrapper class
- Expilicit Narrowing işlemleri
## 4. gün
- ASCII Table
- Data Casting
- Wrapper Class int -->Integer
- Matematik işlem öncelikleri (üs, parantez, (çarpma, bölme), (toplama, çıkarma) ) --> eşitlik durumunda soldan sağa

## 5. gün
- a=a+1; ---> a++; 
- a++ ile ++a farkı
- 2030Java sout(20+""+30+"Java")
- Java2030 sout("Java"+20+30)
- Java50 --> sout("Java"+(20+30))

## 6. gün
- if statements
- if else  yapıları
- & ile && farkı
- char değişkenleri matematiksel işleme girdiklerinde ASCII tablosuna göre işlem yapması
- Wrapper class'tan faydalanarak işlem yapma --> Character.toUpperCase(krk)

## 7. gün
- IfelseIf yapısı

## 8.gün
- Nested If else yapısı 
- Ternary yapısı
- Nested ternary 

## 9. gün 
- Switch 
- String Manipulation
- Equals ve == karşılaştırma 
- concat()
- Polimorfizm çalışması

## 10. gün
- String Manipulation
- String str = "Java cok ama cok guzel";
- substring(1)   
- substring(1,5)
- contains()
- str.startsWith("java");
- str.endsWith("a");
- email.endsWith("@gmail.com");
- str.indexOf("cok")
- str.indexOf("cok", 6)
- str.lastIndexOf("a")
- str.lastIndexOf("a", 19)
---

## 11. gün
- String Manipulation
-     String str = "Java candir";

        System.out.println(str.isEmpty()); // false

        System.out.println(str.isBlank());  //isBlank boşluklardan mı oluşur?  false

` String str;  // str olusturuldu ama deger atanmadi`
- null bir deger degildir
- null bir pointer'dir,
- yanina yazildigi non-primitive variable'a deger atanmadigini isaret eder

- Java method icerisinde deger atamadan variable olusturulmasina izin verir  
- ama deger atamadan kullanilmasina izin vermez
```
        // System.out.println(str); CTE
        // str.concat("Java"); CTE
```


        - Bazen programlarda variable'lar olusturulur ama
        - daha sonra deger atanacagi icin deger atamasi yapilmaz
        - deger atamasi yapilmadan listeleme bile CTE verdigi icin
        - deger verilmedigini isaretleyecek, ama CTE olusmasini engelleyecek
        - bir cozum olarak null pointer olusturumustur

- 
       ` str = null; // str= "null" degil `
- null olarak isaretlenmis, degeri null atanmis degil
  ```
   System.out.println(str); // null 
   System.out.println(str.concat("Java")); // Run time Error---NullPointerException
   System.out.println(str.length()); // Run time Error---NullPointerException

    System.out.println(str + "Java"); // nullJava
    String str2 = str + "Java";
    System.out.println("str2 : " + str2); // nullJava

    // int sayi = null; primitive variable'lara null degeri olmaz
    Integer sayi = null; 
  ``` 


-  str.replace('a','2')
```
   String str = "Java Candir";
   System.out.println(str.replace('J', 'H')); // Hava Candir
   System.out.println(str.replace("a", "")); // Jv Cndir
```

- Burası önemli !!!
```
String str = "J1a23va34  5C54and65ir87*/-";
System.out.println("str = " + str);
str = str.replaceAll("\\d","");
System.out.println("str'in yeni hali  rakamları çıkardı \"\\\\d\": " + str); //Java Candir
```
>
        Eger degistirmek istedigimiz metin tek bir metin degil,
        ortak ozelligi olan farkli metinlerse

            - tum sayilar
            - sayi olmayanlarin tumu
            - tum space'ler
            - space olmayan tum karakterler

            bu ortak ozellikleri belirtmek icin Java regex tanimlamistir (regex:Regular Expressions)
            \\s:space                
            \\S:space olmayan herşey
            \\s+ yanyana birden fazla space
            \\d digits                  
            \\D digit olmayan herşey
            \\w harfler, sayılar ve _         
            \\W harf veya rakam olmayan herşey

            - replaceAll'da regex kullanılır ama char kullanılmaz.

         */
> 

- str= str.trim();
- for (int i = 1; i <=10 ; i++) {
   System.out.println(i +"- Java Candir");
   }

## 12.gün
- for loop
- nested for loop

## 13.gün

- method oluşturma
  Method olusturma asamalari
  1- public static standart (simdilik)
  2- olusturdugumuz method bize bir sonuc dondurecekse
  dondurecegi sonucun data turunu yaz
  3- method ismi
  4- method parantezi () icine method'a gondermemiz gereken bilgileri
  hangi variable ile gonderecegimizi yaz (parametre)
  5- dondurulmesi istenen islemi yap
  6- return keyword kullanarak dondurulmesi istenen degeri dondur

## 14. gün
- Metot overloading
Bir class'da ayni isme sahip 
farkli islem yapan method'lar olabilir
Java bu method'lardan hangisinin calisacagina
parametrelere gore karar verir

- Bir class'da ismi ayni, parametreleri farkli method'lar olmasina
  Method OVERLOADING denir.

- Java overloading kurallari
  1- isim ve parametreleri ayni olan birden fazla method olusturulamaz
  2- data turleri farkli olan parametrelerin yerlerini degistirirsek
  java yeni bir method olarak kabul eder (int, double) (double,int)

- Overloading olan class'larda
- Java hangi method'un calistirilacagina su sekilde karar verir

1. cagrilan isimde method var mi ?
2. method call'da kullanilan arguments ile method'lardaki
   parametrelerin %100 uyumlu oldugu var mi ?
3. argument ile parametre ayni olmasa bile
   verilen argumentleri kabul edecek parametre var mi ?
4. Casting ile birden fazla method'u kullanabiliyorsa
   daha az casting ile calisacak method'u kullanir

-  baslangic ve bitis degeri belli olan
   veya kac kere tekrar edilecegi bilinen loop'larda
   for loop ideal olarak kullanilabilir

- Ancak tekrar sayisi belli olmayan
baslangic veya bitisi baska bir variable'a bagli olan durumlarda
for loop yerine while loop tercih edilir

- while loop


## 15. gün







## 16. gün
- OOP konsepti 
- static variable local variable kapsamları ve kullanılabileceği seviyeler.
- ClassAdı.staticVariable
- obje.instantVariable
- Array giriş
- array tanımlama 
- String[] arr = new String[5];
- String[] isimler = {"Ali","Veli,"Deli"};
- char karakterler[] = {'e','4',','}; ---> javanın sevmediği yazım tarzı
-  Arrays.toString(diziIsmi) kullanımı
-  System.out.println("booleanDizi = " + booleanDizi); // booleanDizi = [Z@568db2f2
-  System.out.println("booleanDizi.toString() = " + booleanDizi.toString()); // booleanDizi.toString() = [Z@568db2f2
-  System.out.println("Arrays.toString(booleanDizi) = " + Arrays.toString(booleanDizi)); // Arrays.toString(booleanDizi) = [false, false, false, false, false]
---

## 17.gün
- Array'lerde for döngüsü kullanımı
- Array kullanma ve yeni array oluşturarak eskiArr güncelleme
- sort sıralama
```
   int[] arr1= {3,9,6,1,7};
   Arrays.sort(arr1);
```
- Arrays.binarySearch() ↓ kullanımı //sort yapılmadan binarySearch yapılırsa sağlıklı çalışmaz.!
- Arrays.sort(arr1);
```
   int[] arr1= {3,9,6,1,7};
   Arrays.sort(arr1);
    
    System.out.println(Arrays.binarySearch(arr2, "ali")); // 6  
```
---

## 18.gün

> gitHUB'a yüklü projede oluşturulan directorylerden sadece bir kısmını gitHuB'a atmak istiyorsak,
  ` D:\kurs\JavaProject> cd .\src\day18_multiDimensionalArrays\     `
yapılarak
`D:\kurs\JavaProject>src\day18_multiDimensionalArrays\ `
> yoluna gidilerek git add .\ClassWillBeLoad.java yapılır. 
> git add .\ yapılırsa o folder altındaki tüm dosyalar yüklenir


- binarySearch() için sort kullanılmalı.
``` java
String str= "Java candir can, bundan suphesi olan var mi?";
String[] kelimeler= str.split(" ");
System.out.println(Arrays.toString(kelimeler)); // [Java, candir, can,, bundan, suphesi, olan, var, mi?]
``` 

- str.split("can"); -> String[] döner

### MultiDimensionalArray
` int[][] arr = {{3,4,5},{2,3},{1}}; `
- outerArray içindeki innerArrayleri yazdırmak istersek deepToString kullanılır. sout(Arrays.ToString(arr);)-> referans değerler döner dikkat MDA
- System.out.println(Arrays.deepToString(arr)); // [[3, 4, 5], [2, 3], [1]]

## 19.gün
```
    List<String> harfler = new ArrayList<>(); // bos bir list olusturur
    List<String> harfler = {""böyle","tanımlanmaz"}; //array tanımlama ile karıştırma böyle kullanılmaz
    harfler.add("eklenecekString"); // element ekler.

 List<Integer> sayilar = new ArrayList<>(); tanımlama
   sayilar.add(3);
   sayilar.add(1,3);
   sayilar.addAll(ekler);
   sayilar.addAll(2,ekler);
```
```
  List<String> harfler = new ArrayList<>(); için
        
         Object parametresiyle .remove() metodu kullanılırsa true, false döner
         harfler.remove("B") -> ilk bulunan "B" String'ini siler.
         index parametresiyle .remove() metodu kullanılırsa silinen element  döner
        
```

```
 List<Integer> sayilar = new ArrayList<>(); içinde get() ve set() kullanımı
  System.out.println(sayilar.get(0)); // 3
  System.out.println(sayilar.set(2, 12)); // 2 --> [3, 5, 2]idi 2. index'i 12 yaptık [3, 5, 12] oldu. değiştirdiği 2. indexteki değer olan 2'yi döner
```
- algoritma ve array Arraylist arasında işlem yapma
``` 
  List<Integer> sayilar = new ArrayList<>(); içinde get() ve set() kullanımı
  System.out.println(sayilar.get(0)); // 3
  System.out.println(sayilar.set(2, 12)); // 2 --> [3, 5, 2]idi 2. index'i 12 yaptık [3, 5, 12] oldu. değiştirdiği 2. indexteki değer olan 2'yi döner
```
```
 List<Integer> sayilar = new ArrayList<>(); [3, 5, 2, 20, 10, 50] 
 sayilar.subList(3,5); [20, 10]  ->güncelleme yapmaz,yeniListe atamak lazım.
 List<Integer> yeniList= sayilar.subList(3,5);
 /*
            Eger sayilardan olusan bir list varsa
            remove method'una yazacagimiz sayiyi index olarak kabul eder

            sayilar.remove()-> Integer ArrayList'i için silmek için Object parametreli kullanmak için önce objeye atanır sonra işlem yapılır.

            Eger sayiyi silmek isterseniz
            remove method'undan once o sayiyi bir objeye atayip
            remove method'unda obje ismini yazabiliriz
 */
  System.out.println(sayilar); // [1, 3, 18, 2]
        sayilar.remove(1);  -->index: param
        System.out.println(sayilar); // [1, 18, 2]

        // 1'i silelim

        Integer silinecekSayi = 1; //değişkene atanmalı!!!

        sayilar.remove(silinecekSayi); -->Object: param -->18ideğil 1'i sildi
        System.out.println(sayilar); // [ 18, 2]
```

## 20.gün
- List<Integer> sayilar=new ArrayList<>(); tanımlama
-  listede element olarak 3 var mi ?
`   System.out.println(sayilar.contains(3)); // true `
- sayilar.clear();
- sayilar1.equals(sayilar2); --> ArrayList'te equals() hem değer hem index kontrol eder!
- sayilar1 : [3, 8, 1, 2]
- sayilar2 : [3, 1, 8, 2]
- sayilar1.equals(sayilar2); //false

- sayilar.sort(); başka bi durum. bunu yerine ↓ kullanılır
- Nasıl ki Array'i yazdırırken Arrays.toString(arr) yapıyorsak, ArrayList'i yazdırırken Collection.sort(sayilar); kullanılır.!!!
- Collections.sort(sayilar1);// Liste parent'i Collections sort edilebilir.
- Collections.sort(sayilar2);
- sayilar1 : [1, 2, 3, 8]
- sayilar2 : [1, 2, 3, 8]
- true

```
        List<String> isimler=new ArrayList<>();
        System.out.println(isimler); // [Kubra, Mustafa, Emre, Ferhat, Erdal]

        // 2.index'deki elementi yazdirin

        System.out.println(isimler.get(2)); // Emre

        // Ferhat'in index'ini yazdirin

        System.out.println(isimler.indexOf("Ferhat")); // 3


        System.out.println(isimler.lastIndexOf("Ferhat")); // 3


        System.out.println(isimler.indexOf("Hilal")); // -1
        System.out.println(isimler.lastIndexOf("Gokhan")); // -1
        
        System.out.println(isimler); // [Kubra, Mustafa, Emre, Ferhat, Erdal, Mustafa]


        System.out.println(isimler.indexOf("Mustafa")); // 1


        System.out.println(isimler.lastIndexOf("Mustafa")); // 5
```

## 21. gün
- Array ArrayList dönüşümü
- foreach loop
* Array'den .aslist() metodu kullanılarak elde edilen Arraylistler birlikte hareket eder
* yerine göre avantaj yerine göre dezavantaj
* .asList method'uyla arrayden ArrayList'e geçerse ArrayList mantığına aykırı olarak ArrayList'in boyutu artırılamaz azalamaz
* Array değişirse Arraylist ArrayList değişirse Array'de arka planda beraber değişir her ne kadar ayrı objeler olsa da .
* uzunluğu büyük bir array list olarak kullanılacaksa kullanılabilir ama ekle çıkar yapmayacaksak mantıklı
* değişince 2side değişir.

## 22. gün
- Bir obje ancak bir class'dan olusturulabilir.
- Bir objeyi olusturdugumuz class, ayni zamanda o objenin data turudur.

 - Her obje olusturuldugu class'in ozelliklerini tasir

  - Eger bir programda, ortak ozelliklere sahip
  - objeler uretmek uzere tasarladiginiz bir class varsa main method olmasi SART DEGILDIR
  - class'lar kaliphane gibi calisir
  -  Yani o class'dan ayni ozelliklere sahip objeler uretmemizi saglar

  - Constructor 'da mutlaka olması gereken iki özellik
  -    1-Ismi mutlaka Class ismi ile aynı olmalıdır
  -    2- Return type'ı olmamalıdır.  --> Class ismi aynı olup return type'ı varsa o bir metottur. Constructor değil!!

 
        ornegin bir hastane programinda,
        hastanede calisacak Hemsirelerin hangi bilgilerini tutmak istiyorsak,
        hangi method'lari hemsireler kullanmak istiyorsak
        bir hemsire class'i olusturup
        tum bu ozellikleri(variable ve method'lari) o class'da olustururuz

        programda ne zaman bir hemsireye ihtiyac olsa
        hemsire class'indan obje olustururuz
        boylece otomatik olarak tum ozelliklere sahip olur

        Eger biz istedigimiz parametrelere sahip bir constructor olusturmazsak
        Java class'dan obje olusturulabilmesi icin,
        class'a default bir constructor koyar.

        Default constructor GORUNMEZ,
        parametresi yoktur, cons. body'si bostur

```
        C02_Hemsire (){

        }

        Biz de istedigimiz parametrelere sahip,
        istedigimiz kadar constructor olusturabiliriz

        COK ONEMLI : Eger biz bir constructor olusturursak
                     yani class'da gozle gorunen bir constructor varsa
                     Java default constructor'i siler
                     Bizim olusturdugumuz hic bir constructor'a default constructor DENEMEZ

     
```
- bir obje olustururken parametre olarak hic bir deger girilmezse 
*   olusturulan obje, olusturuldugu class'daki variable'lara atanan degerleri alir
*  eger obje olusturulan class'da deger atamasi yoksa, Java default degerleri atar

## 23.Gün
- Constructor kullanımları
- static keyword
- public Ogretmen() {
  }

```
            1. default constructor görünmez
             - Arka planda çalışan java kendisi oluşturur
             - parametresi  ve blok içi boştur.

    

    

      public Ogretmen(){
        isim="Hasan";
        soyisim="Kul";
        brans="Mat";
    }

     2. Parametresiz Constructor
        - Default Cons ile aynı görünümdedir
        - biz oluştururuz
        - blok kısmında atama yapabliriz DEFault Cons'tan önemli bir farkı <ama tercih edilmez>
        çünkü her oluşan obje aynı değerleri almış olur.

    



    public Ogretmen(String isim,String soyisim,String brans){
            this.isim=isim;
            this.soyisim=soyisim;
            this.brans=brans;
        }

    3. Parametreli Constructor
        - Yukarıdaki dezavantajları giderir.
        -Constructor içinde parametre olarak gönderdiğimiz değerleri
     instance variable'lara atayarak bizi her bir değer için tek tek atama yapma zorunluluğundan kurtarır.
        - Parametreli Constructor oluşturduktan sonra parametresiz Cons
        ihtiyacımız varsa default cons gibi bir cons oluşturmamız gerekir.!!
```

## 24 . gün
- static keyword static block
- Constructor ve default/non-static blocks 
- PassByValue 

## 25. gün
- PassByValue

- Mutable kararsız, değişebilir;
- ArrayList
- List yapılar
- StringBuilder
- StringBuffer


- Immutable kararlı, değişmez örnekler
- String
- Wrapper classlar Integer, Boolean
- primitive types (int, double, float, short,long, boolean,byte) 
-      Java'da bir class ve oclass'dan olusturulan objeler
            ya mutable'dir, ya da immutable'dir.

            Java metinsel ifadeleri atayabilecegimiz 3 class olusturmustur
            String  --- immutable
            StringBuilder --- mutable
            StringBuffer --- mutable

            immutable bir class'dan olusturulan objeler de immutable'dir
            String immutable oldugundan
            ayni str objesine yeni deger atandiginda Java eski degeri DEGISTIREMEZ
            bunun yerine istenen yeni degere sahip yeni bir obje olusturur
            ve str 'in pointer'ini yeni objeye yoneltir.

            kullanilmayan eski objeler
            Garbage Collector tarafindan toplanmak uzere beklerler

## 26. gün
- LocalTime
- LocalDate
- LocalDateTime
- LocalDateTime nesneleriyle Duration class ile aradaki zamanı hesaplama 

```
        LocalTime localTime = LocalTime.now();
         Thread.sleep(2000,999999); //metotda 999999 alır en fazla
        LocalTime localTimeSonraki = LocalTime.now();


        Duration duration = Duration.between(localTime, localTimeSonraki);
        long seconds = duration.getSeconds();
        System.out.println("Geçen süre (saniye): " + seconds);
```

- LocalDateTime nesneleriyle Period class ile aradaki zamanı hesaplama 

```
    LocalDate dogumTarihi = LocalDate.of(1980,1,1);
    LocalDate bugun= LocalDate.now();
  
    System.out.println("for me \n" +   " yıl : "+ Period.between(myBirthday,bugun).getYears() +
                                          " ay : "+ Period.between(myBirthday,bugun).getMonths() +
                                        " gün : "+ Period.between(myBirthday,bugun).getDays()
                            ); 
```
- epoch kulanımı 1970-01-01

```
      LocalDate epoch=LocalDate.EPOCH;
      
      long epochDay=1250L;
      
      LocalDate epochDay1250sonrasiDate=LocalDate.ofEpochDay(epochDay);
      
      System.out.println(epochDay1250sonrasiDate); //1973-06-04
```

- DateTimeFormatter
- Varargs ve dikkat edilecekler

## 27.gün 
- ASCII table
- StringBuilder 
- .reverse()
- == equals() compare()
- StringBuilder metotları
  - append() ->sona ekler
  - insert() -> istenen konuma ekler  // sb1.insert(11,str,0,5);
  - delete(4,5) -> verilen indisleri aralığını siler 
  - deleteCharAt(2) -> o char'ı siler
  - sb1.replace(12,15,"Can."); -> replace eder.
``` 
 StringBuilder sb2 = new StringBuilder("Java candir");
 sb2.substring(5);//StringBuilser nesnesine String metotları uygulanırsa herhangi bir işlem yapmaz.
```
## 28.gün
- Access modifier
- Java programlama dilindeki erişim belirleyicileri (access modifiers) doğru bir şekilde açıklanmıştır. 
 İşte Java'da kullanılan erişim belirleyicileri ve kapsam alanları:

- public: Bir sınıfın veya üyenin her yerden erişilebilir olmasını sağlar. 
 Yani, başka sınıflardan, farklı paketlerden veya hatta farklı modüllerden erişim sağlanabilir.

- private: Bir sınıfın veya üyenin sadece kendi sınıfı içinden erişilebilir olmasını sağlar.
 Diğer sınıflar veya paketler bu öğeye erişemez. Özel erişim belirleyicisi, veri gizliliğini ve sınıfın iç yapısını korumak için kullanılır.

- default (varsayılan): Eğer bir sınıf veya üyenin herhangi bir erişim belirleyicisi belirtilmemişse, varsayılan erişim belirleyici olarak kabul edilir. 
 Bu durumda, sınıf veya üye yalnızca aynı paket içinden erişilebilir, farklı bir paketten erişim sağlanamaz.

- protected: Bir sınıfın veya üyenin yalnızca kendi paketi veya alt sınıfları tarafından erişilebilir olmasını sağlar. 
 Bu durumda, farklı paketlerden erişim sağlanamaz, ancak aynı paketteki sınıflar ve alt sınıflar tarafından erişilebilir.

- Baska bir classdaki variable veya method'a ulasmak istedigimizde

- ulasmak istedigimiz class uyesinin static olup olmamasi
  erisim yontemini etkiler
  static ise calssIsmi.uyeIsmi yazarken
  static degilse obje olusturup objeIsmi.uyeIsmi

- ulasmak istedigimiz uyenin access modifier'i ise
  o uyeye ulasip ulasamayacagimizi belirler

  ulasabilirsek o datayi okuyabilir veya o dataya yeni deger atayabiliriz

- Eger bir variable icin read veya write ozelliklerinin
  birbirinden ayrilmasi isteniyorsa
  oncelikle access modifier ile kimsenin ulasamamasini saglayin

- private yaparak kimsenin ulasamayacagini garantiye aldiktan sonra

-  READ yetkisi vermek istediklerimiz icin getter() 
- WRITE yetkisi vermek istediklerimiz icin setter() olusturmaliyiz
 ## 29.gün
- inheritance
- 
 ## 30.gün
- inheritance
- 
 ## 31.gün
- Biz gorunur bir constructor olusturdugumuzda
Java'nin default constructor'i silmesine benzer olarak
```
    Extends keyword kullanilmis bir class'daki
    herhangi bir constructor'in ilk satirinda
    gozle gorunur bir constructor call yazilmissa
    java default olarak koydugu super()'u siler


    bir constructor'in icinde
    sadece 1 tane constructor call olabilir
    o da ilk satirda olmak zorundadir

    Eger this(parametreler) veya super(parametreler) ile
    constructor call yaptigimizda
    yazdigimiz argument ile uyumlu parametreye sahip
    bir constructor yoksa Java CTE verir
```
