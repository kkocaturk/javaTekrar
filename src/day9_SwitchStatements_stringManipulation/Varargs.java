package day9_SwitchStatements_stringManipulation;

public class Varargs {

        public static void main(String[] args) {
            printStrings("Merhaba", "dünya", "Java", "varargs","kerim");
        }

        public static void printStrings(String... strings) {
            for (String str : strings) {
                System.out.println(str);
            }
    }

}
