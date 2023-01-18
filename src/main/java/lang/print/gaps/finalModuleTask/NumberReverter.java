package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int last = number % 10;
        number = number / 10;
        int middle = number % 10;
        number = number / 10;
        int first = number % 10;
        System.out.println(last * 100 + middle * 10 + first);
    }
}
