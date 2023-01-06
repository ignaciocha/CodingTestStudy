public class 중앙값구하기 {
    public static void main(String[] args) {

        int[] a = {1,2,3};
        System.out.println(solution(a));
    }

    public static int solution(int[] array) {

        int a = 0;

        for(int i=0;i<array.length;i++){
            a += array[i];
        }

        int b = a / 2;



        return a;
    }
}
