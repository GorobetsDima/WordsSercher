package GorobetsDmitriy;

import java.util.Set;

/**
 * Created by Вика on 28.10.2015.
 */
public class Occurrence {

    public boolean isPhrase(String text, String word) {

        Set<String> citation = CitationFinder.parseCitationFromText(text);

        boolean result = Searcher.isContain(word, citation);


        return result;
    }
}
