public class AdditionPattern {
    private int num;
    private int add;
    private int start;

    public AdditionPattern(int num, int add) {
        this.num = num;
        this.add = add;
        start = num;
    }

    public int currentNumber() {
        return num;
    }

    public void next() {
        num += add;
    }

    public void prev() {
        int thing = num - add;
        if (thing >= start) {
            num -= add;
        }

    }
}

