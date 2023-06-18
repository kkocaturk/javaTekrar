package day32_inheritance_dataTypeKullanimi;

public class Main {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass();
        superClass.display(); // SuperClass x: 10

        SubClass subClass = new SubClass();
        subClass.display(); // SubClass x: 20

        SuperClass polymorphicSubClass = new SubClass();
        polymorphicSubClass.display(); // SubClass x: 20

        System.out.println(polymorphicSubClass.x); // 10
    }
}
/*
    polymorphicSubClass adında bir SuperClass referansı oluşturuyoruz, ancak bu referansa SubClass'ın bir örneğini atıyoruz.
    Bu durumda, referansın türü SuperClass olsa da, aslında SubClass objesini temsil eder.

    Bu duruma "polimorfik referans" denir, çünkü SuperClass türündeki bir referans, hem SuperClass hem de ondan türetilmiş olan alt sınıfların nesnelerini işaret edebilir.

    display() metodu çağrıldığında, polimorfik referansın gerçek türüne (yani SubClass) göre uygun metot çağrılır.
    Bu durumda, SubClass'ın display() metodu çalışır ve x değeri olan 20 yazdırılır.

    Polimorfik referanslar, kodun esnekliğini artırır ve farklı alt sınıflara aynı şekilde davranabilme yeteneği sağlar.
    Bu, uygulamaların daha genel ve modüler olmasına olanak tanır.


         User: yani override'dan dolayı mı oldu?

    ChatGPT

    Evet, polimorfik davranışın gerçekleşmesinin temel nedeni, override (geçersiz kılma) işlemidir.
    Alt sınıflar, üst sınıfta tanımlanan metodları aynı imzayla (isim, parametreler ve dönüş tipi) geçersiz kılarlar.
    Böylece, üst sınıf referansı alt sınıfın nesnesini işaret ettiğinde, çağrılan metodun gerçek uygulaması alt sınıftaki geçersiz kılınmış (override) metot olur.

    Bu örnekte, SubClass sınıfı display() metodunu SuperClass sınıfında tanımlananın üzerine yazmıştır.
    Dolayısıyla, polymorphicSubClass referansı alt sınıfın bir örneğini işaret ederken display() metodunu çağırırsa, alt sınıftaki display() metodu çalışır.
    Bu, polimorfizm prensibine dayanan bir davranıştır.

    Override, alt sınıfların üst sınıfın davranışını değiştirebilmelerini sağlar.
    Polimorfizm ise bu geçersiz kılma işlemini kullanarak, aynı referansın farklı nesnelerin davranışını alabilmesini sağlar.

        User: ama nesne  SuperClass polymorphicSubClass = new SubClass(); şeklinde tanımlanmıştı ?

    polymorphicSubClass nesnesi SuperClass tipinde bir referansla tanımlanmış ve alt sınıf olan SubClass'ın bir örneğiyle başlatılmıştır.
    Bu durumda, referansın veri türü SuperClass olduğu için, polymorphicSubClass üzerinden sadece SuperClass'ın sahip olduğu metotlara erişilebilir.

    Ancak, eğer SubClass sınıfı display() metodunu SuperClass'da geçersiz kılarsa (override ederse), polymorphicSubClass.display() çağrısı alt sınıftaki display() metodunu çalıştıracaktır.
    Bu, override işlemi sayesinde gerçekleşir.

    Yani, polymorphicSubClass.display() çağrıldığında alt sınıftaki display() metodu çalışacak ve ilgili sonucu verecektir.
    Bu da polimorfizm prensibine dayanan bir davranıştır, çünkü referansın veri türü ne olursa olsun (burada SuperClass), çalıştırılan metot alt sınıfın geçersiz kılınmış (override) metodu olacaktır.
    */