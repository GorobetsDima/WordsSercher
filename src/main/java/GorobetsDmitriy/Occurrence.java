package GorobetsDmitriy;

import java.util.Set;

/**
 * @author Gorobets Dmitriy
 *         <p>
 *         At this Class in method "isPhrase" I put 2 parameters
 *         There is I check whether a word -"word" belongs to the citations at the given text or not
 */

public class Occurrence {

    /**
     * @param word - it's a word which we want to find in citations of text
     *             <p>
     * @param text -it's a text where we have to find citations at "CitationFinder" class
     *             <p>
     * @return "true" if There was found a word which equal to the "word" variable in the citations!
     * "false" if "word" wasn't found.
     */
    public boolean isPhrase(String text, String word) {

        Set<String> citation = CitationFinder.parseCitationFromText(text);

        boolean result = Searcher.isContain(word, citation);


        return result;
    }
}
