package 코테;

import java.util.Scanner;

public class test_8958 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        for (int i = 0; i < N ; i++) {
            String K = s.next();
            int sum = 0;
            int cnt = 0;
            for (int j = 0; j < K.length(); j++) {
                if (K.charAt(j) == 'O') {
                    cnt++;

                } else {cnt =0;
                }
                sum += cnt;
            }
            System.out.println(sum);

        }
    }
}
