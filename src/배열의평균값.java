public class 배열의평균값 {

    public static void main(String[] args) {

        int numbers[] = {3,4,5,6,7,8};
        double answer = solution(numbers);
        System.out.println(answer);
    }

    // numbers_len은 배열 numbers의 길이입니다.
    static double solution(int numbers[]) {
        int sum = 0;
        int numbers_len = numbers.length;

        for (int i=0; i<numbers_len; i++){
            sum += numbers[i];
        }

        int div = sum/numbers_len;
        double div2 = 0.0;

        if (div == 5 || div == 0) {
            div2 = div*0.1;
        }else{
            div2 = div;
        }

        double answer = sum%numbers_len + div2;

        return answer;
    }
}
