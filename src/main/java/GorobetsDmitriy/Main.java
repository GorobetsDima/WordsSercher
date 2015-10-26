package GorobetsDmitriy;

/**
 * Created by Вика on 26.10.2015.
 */
public class Main {
    public static void main(String[] args) {
        String s = new String("\"You don’t mean — you can’t mean the people who live here?\" cried Professor McGonagall,jumping to her feet and pointing at number four. \"Dumbledore — you can’t. I’ve been watching them all day. You couldn’t find two people who are less like us. And they’ve got this son — I saw him kicking his mother all the way up the street, screaming for sweets. Harry Potter come and live here!\"");
        String word = "live";
        System.out.println(Searcher.isPhrase(word));

    }
}
