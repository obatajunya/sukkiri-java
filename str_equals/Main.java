public class Main {
    public static void main(String[] args){
        System.out.println("文字を入力してください");
        String str1 = new java.util.Scanner(System.in).nextline();
                System.out.println("もうひとつ文字を入力してください");

                String str2 = new java.util.Scanner(System.in).nextline();

    

    if (str1.equals(str2)) {
        System.out.println("同じです");
    } else {
        System.out.println("ちがいます");
    }
    }
}