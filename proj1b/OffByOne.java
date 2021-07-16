public class OffByOne implements CharacterComparator {

    /** A class for off-by-1 comparators. */

    @Override
    public boolean equalChars(char x, char y) {
        if (Math.abs(x - y) == 1) {
            return true;
        }
        return false;
    }

}
