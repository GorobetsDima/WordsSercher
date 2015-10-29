package GorobetsDmitriy;

import org.apache.log4j.Logger;

import java.util.Set;

/**
 * @author Gorobets Dmitriy
 *         <p>
 *         At this Class in method "isContain" I put 2 parameters
 *         There is I check whether a word -"word" belongs to the citations or not
 */


public class Searcher {

    public static final Logger SEARCH_LOGG = Logger.getLogger(Searcher.class);

    /**
     * @param word      -it's a word which we want to find in citations of text
     * @param citations - it's a set of citations which we found at the text at "CitationFinder" class
     * @return - "true" if There was found a word which equal to the "word" variable in the citations!
     * "false" if "word" wasn't found.
     */
    public static boolean isContain(String word, Set<String> citations) {

        boolean result = false;
        int citatNum = 0;
        SEARCH_LOGG.info("Цитаты, в которых было найдено слово " + word + ":");


        for (String citation : citations) {
            if (citation.contains(word)) {
                SEARCH_LOGG.info(citation);
                result = true;
                citatNum++;

            }
        }

        if (result)

        {
            SEARCH_LOGG.info("Слово " + word + " содержат " + citatNum + " цицаты.");
        } else

        {
            SEARCH_LOGG.info("В данном тексте нет таких цитат!");
        }

        return result;
    }
}


