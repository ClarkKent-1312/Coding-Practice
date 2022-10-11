import java.util.Scanner;

public class HungryBird {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the distance the bird should travel : ");
        int distance = sc.nextInt();
        int fp_permile[] = new int[distance];

        for (int i = 0; i < distance; i++) {
            System.out.println("Enter the values of food packets at stage " + i + " : ");
            fp_permile[i] = sc.nextInt();
        }

        boolean t = eatFood(distance, fp_permile);

        if (t) {
            System.out.println("Reachable");
        } else {
            System.out.println("Not Reachable");
        }

        sc.close();

    }

    public static boolean eatFood(int d, int fp[]) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < fp.length;) {
            if (fp[i] == d - 1) {
                return true;
            } else if (fp[i] == 0) {
                return false;
            }
            System.out.println("How many food packets do you want the bird to eat from stage " + i + "? : ");
            int no = sc.nextInt();
            if (no > fp[i]) {
                System.out.println("Invalid input");
                continue;
            }
            i += no;
        }

        return false;


    }
}