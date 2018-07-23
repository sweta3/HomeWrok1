import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Please enter base's length:");
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int type = base % 2;
        int height = base / 2 + type;
        StringBuffer star = new StringBuffer("*");
        if (type == 0) {
            star.append("*");
        }
        StringBuffer space = new StringBuffer(" ");

        for (int i = 0; i < height; i++) {

            for (int j = 0; j < i; j++) {
                star.append("**");
            }

            for (int l = base / 2 - i + type; l > 1; l--) {
                space.append(" ");
            }
            System.out.print(space);
            System.out.print(star);
            System.out.println();
            space = new StringBuffer(" ");
            star = new StringBuffer("*");
            if (type == 0) {
                star.append("*");
            }
        }
    }
}