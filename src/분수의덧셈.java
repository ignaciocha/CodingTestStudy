import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 분수의덧셈 {
    public static void main(String[] args) {
        // psvm : 메인 메서드 만드는 단축어

        System.out.println(solution(1,2,3,4)[0]);

    }

    public static int[] solution(int denum1, int num1, int denum2, int num2) {

        int[] answer = new int[2];

        int denum = denum1*num2+denum2*num1;
        int num = num1*num2;

        System.out.println(denum+","+num);

        int max = gcd(denum, num);
        int a = denum / max;
        int b = num / max;

        answer[0] = a;
        answer[1] = b;

        System.out.println(max);

        return answer;
    }

    public static int gcd(int a, int b){
        while (b > 0){
            int tmp = a;
            a = b;
            b = tmp%b;
        }
        return a;
    }

}
