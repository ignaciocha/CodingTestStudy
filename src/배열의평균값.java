public class 배열의평균값 {

    public static void main(String[] args) {

        int numbers[] = {3, 4, 5, 6, 7, 8};
        double answer = solution(numbers);
        System.out.println(answer);
    }

    // numbers_len은 배열 numbers의 길이입니다.
    static double solution(int numbers[]) {
        double answer = 0;
        int sum = 0;

        for(int i=0; i<numbers.length; i++){
            sum += numbers[i];
        }

        answer = (double) sum/numbers.length;

        return answer;
    }
}
