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
   System.out.println("booleanDizi.toString() = " + booleanDizi.toString()); // booleanDizi.toString() = [Z@568db2f2
   System.out.println("Arrays.toString(booleanDizi) = " + Arrays.toString(booleanDizi)); // Arrays.toString(booleanDizi) = [false, false, false, false, false]
---

