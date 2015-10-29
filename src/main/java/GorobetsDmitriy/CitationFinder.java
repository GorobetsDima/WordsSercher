package GorobetsDmitriy;

import org.apache.log4j.Logger;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *
 * @author Gorobets Dmitriy
 *         <p/>
 *         At this Class in the method "parseCitationFromText"
 *         There is I check whether a "text" contains the citation
 *
 */
public class CitationFinder {
    public static final Logger CIT_FIND_LOGG = Logger.getLogger(CitationFinder.class);

    private static final String CITATION_PATTERN = "(“([^\\\"\\“\\”]+?)”|\"([^\\\"\\“\\”]+?)\")";


    /**
     * Validate text with regular expression
     *
     * @param text string content for validation
     * @return Set<String> if there was found the citations which contain the "word" variable in the citations!
     *
     *         if citations wasn't found,then returnes -"Цитаты соответствующие регулярному выражению "СITATION_PATTERN" не были найдены"
     */
    public static Set<String> parseCitationFromText(String text) {

        Set<String> citations = new HashSet<String>();
        Matcher matcher = createMatcher(text);

        while (matcher.find()) {

            String citation = matcher.group(1); // citation
            String citat = validateCitations(citation);
            citations.add(citat);

        }
        if (citations.size() == 0) {
            CIT_FIND_LOGG.info("Цитаты соответствующие регулярному выражению \"СITATION_PATTERN\" не были найдены");
        }
        return citations;


    }

    public static Matcher createMatcher(String text) {
        Matcher matcherCitation;

        Pattern patternCitation = Pattern.compile(CITATION_PATTERN);

        matcherCitation = patternCitation.matcher(text);

        return matcherCitation;
    }

    public static String validateCitations(String citation) {

        citation = citation.replaceAll("“", "");
        citation = citation.replaceAll("”", "");
        citation = citation.replaceAll("\"", "");


        return citation;
    }
}
