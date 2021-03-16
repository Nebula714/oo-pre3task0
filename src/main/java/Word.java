import java.util.Scanner;

public class Word {
    private int num;

    int comWord(String s) {
        String[] list = s.split("\\s+");
        int i;
        int j;
        for (i = 0; i < list.length; i++) {
            for (j = 0; j < list[i].length(); j++) {
                char a = list[i].charAt(j);
                if (Character.isUpperCase(a) | Character.isLowerCase(a)) {
                    num++;
                    break;
                }
            }
        }
        //System.out.println(num);
        return num;
    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        String s = sn.nextLine();
        Word word = new Word();
        System.out.println(word.comWord(s));
    }
}
