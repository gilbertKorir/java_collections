package conditions;

public class Recursion {
    public static void main(String[] args) {
        int sum = sumRecus(5);
        System.out.println(sum);

    }
    public static int sumRecus(int a){
        if(a>0){
            return a + sumRecus(a - 1);
        }else {
            return 0;
        }
    }
}
