package day9_SwitchStatements_stringManipulation;

public class C05_concat {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Candir";
        String str3 = " ";

        // yukaridaki variable'lari kullanarak "Java Candir" yazdirin

        System.out.println(str1 + str2 + str3); //Concatenation
        System.out.println(str1.concat(str3).concat(str2)); // Java Candir

    }
}
