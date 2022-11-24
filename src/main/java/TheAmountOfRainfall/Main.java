import java.util.*;

public class Main {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("강수량(종료: 0): ");
            int n = scanner.nextInt();
            if(n==0) break;
            v.add(n);
            int sum=0;
            var iterator = v.iterator();
            while(iterator.hasNext()) {
                int a = iterator.next();
                System.out.print(a + " ");
                sum += a;
            }
            System.out.println();
            System.out.println("현재 평균 : " + (sum/v.size()));
        }
    }
}