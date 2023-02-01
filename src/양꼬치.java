public class 양꼬치 {
    public static void main(String[] args) {
        System.out.println(solution(10, 3));
    }

    static int solution(int n, int k) {
        int foodPrice = 12000*n;
        int drinkPrice = 2000*k;
        int service = 0;

        if (n >= 10) {
            service = n/10;
        }

        int answer = foodPrice+drinkPrice-service*2000;

        return answer;
    }
}
