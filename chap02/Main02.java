public class Main02 {
    public static void main(String[] args) {
        System.out.println("あなたの名前は?");
        String name = new java.util.Scanner(System.in).nextLine();

        System.out.println("あなたの年齢は?");
        int age = new java.util.Scanner(System.in).nextInt();

        System.out.println
        ("ようこそ、" + age + "歳の" + name + "さん");
    }
}