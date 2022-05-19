// p.52

import java.util.Scanner;
import java.util.InputMismatchException;

public class Test3 {
    public static void main(String[] args) {
        try {
            int num = getNum();
            disp(num);
        } catch(InputMismatchException e) {
            System.out.println("数字ではありません。");
        }
    }

    private static int getNum() {
        System.out.print("num > ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        return num;
    }

    private static void disp(int num) {
        int num2 = num * -1;
        System.out.printf("(byte)%-5d : ", num);
        System.out.println(toBinaryString((byte)num));
        System.out.printf("(byte)%-5d : ", num2);
        System.out.println(toBinaryString((byte)num2));

        System.out.printf("(short)%-5d: ", num);
        System.out.println(toBinaryString((short)num));
        System.out.printf("(short)%-5d: ", num2);
        System.out.println(toBinaryString((short)num2));

        System.out.printf("%-11d : ", num);
        System.out.println(toBinaryString(num));
        System.out.printf("%-11d : ", num2);
        System.out.println(toBinaryString(num2));

        System.out.printf("%-11s : ", (num + "L"));
        System.out.println(toBinaryString((long)num));
        System.out.printf("%-11s : ", (num2 + "L"));
        System.out.println(toBinaryString((long)num2));
        
        System.out.println("'1'         : " + toBinaryString('1'));
        System.out.println("'a'         : " + toBinaryString('a'));
        System.out.println("'あ'        : " + toBinaryString('あ'));
    }

    private static String toBinaryString(byte x) {
        return toBinaryFormat(Integer.toBinaryString((int)x), 1);
    }

    private static String toBinaryString(short x) {
        return toBinaryFormat(Integer.toBinaryString((int)x), 2);
    }

        private static String toBinaryString(int x) {
        return toBinaryFormat(Integer.toBinaryString(x), 4);
    }

        private static String toBinaryString(long x) {
        return toBinaryFormat(Long.toBinaryString(x), 8);
    }

        private static String toBinaryString(char x) {
        return toBinaryFormat(Integer.toBinaryString((int)x), 2);
    }
    
    private static String toBinaryFormat(String s, int m) {
        String t = "";
        String ret = "";
        int n = m * 8;     // n: ビット桁 -- m 1バイト -> n 8ビット
        
        // String s を nビットにそろえる。
        // それを t とする。
        if (s.length() < n) {
            for (int i = 0; i < (n - s.length()); i++) {
                t += "0";
            }
            t += s;
        } else {
            // 文字列s の 右n桁分を取得
            t += s.substring((s.length() - n), s.length());
        }

        for (int i = 0; i < n; i++) {
            ret += t.charAt(i);
            if (i < (n-1) && ((i+1) % 8) == 0) {
                ret += " ";
            }
        }
        return ret;
    }
}

// 修正時刻: Sun 2022/05/15 14:12:18
