package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int n1 = number % 10; number /= 10;
        int n2 = number % 10; number /= 10;
        int n3 = number % 10; number /= 10;
        int n4 = number;
        System.out.println(n1 + n2 + n3 + n4);
    }
}
