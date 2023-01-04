import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 분수의덧셈 {
    public static void main(String[] args) {
        // psvm : 메인 메서드 만드는 단축어

        System.out.println(solution(1,2,3,4));

    }

    public static int[] solution(int denum1, int num1, int denum2, int num2) {

        int[] answer = new int[2];

        int denum = denum1*num2+denum2*num1;
        int num = num1*num2;

        int min = gcd(denum, num);
        int a = denum % min;
        int b = num % min;

        answer[0] = a;
        answer[1] = b;

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
