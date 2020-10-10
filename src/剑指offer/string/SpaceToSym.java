package 剑指offer.string;

public class SpaceToSym {
    public String replaceSpace(String s) {
        String replace = s.replace(" ", "%20");
        return replace;
    }
}
