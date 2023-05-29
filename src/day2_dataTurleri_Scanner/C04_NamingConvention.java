package day2_dataTurleri_Scanner;

public class C04_NamingConvention {
    public static void main(String[] args) {
        String str = "Java zevklidir.";
        //case Sensitive
        str = "variableName'de boşluk  ve özel karakterler olamaz ancak $ve_ kullanılabilir.\n" +
                "variable rakam ile başlamaz\n" +
                "_ve$ ile başlayaabilir ama tavsiye edilmez \n" +
                "küçük harfle başlar" +
                "birden fazla kelime varsa CamelCase yazılır" +
                "type nul  > InWindowsCommandPrompt.txt yeni InWindowsCommandPrompt.txt oluşturur.!!! -> hataveriyor gözükse de  dosya oluşur.!" +
                "New-Item -ItemType File -Name \"yeni_dosya.txt\" " +
                "kodu da PowerShell komutudur.";
        System.out.println(str);

    }
}
