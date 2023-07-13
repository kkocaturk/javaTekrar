package day11stringManipulations_ForLoop;

public class C10_StringCharConvert {
    public static void main(String[] args) {
        String a="Hi HEllo";

       // char[] aSplit=new char[a.length()];
       char[] aSplit=a.toCharArray();
        System.out.println("aSplit.length = " + aSplit.length);
        for (char each:aSplit) {
            System.out.println(each);
        }
    }
}

