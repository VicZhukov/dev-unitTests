package ua.vic.goit;

public class SumCalculator{
    public int sum(int n){
        int res = 0;

        if(n == 0){
            throw new IllegalArgumentException();
        }
        for(int i = 1; i <= n; i++){
            res += i;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new SumCalculator().sum(0));
    }
}
