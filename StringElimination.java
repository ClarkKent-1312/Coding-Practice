import java.util.Scanner;

public class StringElimination {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        String outputString = eliminateChars(s);
        System.out.println(outputString);


    }

    public static String eliminateChars(String s) {
        
        String newS = "";
        int i = 0;
        newS += s.charAt(i);
        while (i < s.length() - 1) {

            if (s.charAt(i) != s.charAt(i + 1)) {
                newS += s.charAt(i + 1);
            }
            i++;
        }

        return newS;
    }

}