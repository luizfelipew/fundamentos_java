package refactors;

public class Subtracting implements Operation {
    @Override
    public int apply(int a, int b) {
        return a - b;
    }
}
