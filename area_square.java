import java.util.*;

public class area_square {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();

        int area = side * side;

        sc.close();

        System.out.println(area);
    }
}
