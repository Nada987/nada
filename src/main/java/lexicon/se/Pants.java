package lexicon.se;

// Woman pants
public class Pants {
    int width;
    int length;

    String getSize() {
        String size = "";
        switch (width) {
            case 33:
                size = "XS";
                break;
            case 36:
                size = "S";
                break;
            case 38:
                size = "M";
                break;
            case 40:
                size = "L";
                break;
        }
        return size;
    }
}
