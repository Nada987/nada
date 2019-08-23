package lexicon.se;


public class App {

    public static void main(String[] args) {
        Pants chinos = new Pants();
        chinos.length = 33;
        chinos.width = 36;

        System.out.println("Woman pants with size " + chinos.getSize());
    }

}