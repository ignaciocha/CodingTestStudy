public class 두수의나눗셈 {
    public static void main(String[] args) {

    // 문제 설명
        // 정수 num1과 num2가 매개변수로 주어질 때,
        // num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을
        // return 하도록 soltuion 함수를 완성해주세요.

        int answer = solution(3, 2);
        System.out.println(answer);
    }
        public static int solution(int num1, int num2) {
            int answer = (int)(1.0*num1/num2*1000);
            return answer;
    }
}