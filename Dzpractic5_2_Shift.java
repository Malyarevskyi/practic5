package practic.practic5;

public class Dzpractic5_2_Shift {

    public static int Shift(String before, String after) {
        for (int index = before.length() - 1; index >= 0; index--) {
            if ((before.substring(index) + before.substring(0, index)).equals(after)) {
                return before.length() - index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(Shift("abcdefg", "efgabcd"));
        System.out.println(Shift("abcde", "eadc"));
    }
}
