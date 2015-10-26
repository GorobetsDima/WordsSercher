package GorobetsDmitriy;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Вика on 27.10.2015.
 */
public class CitationFinder {

    private Pattern patternSitation;

    private Matcher matcherSitation;


    private static final String SITATION_PATTERN = "(“([^\" “ ”]+?)”)";

    public CitationFinder() {
        patternSitation = Pattern.compile(SITATION_PATTERN);
    }


    /**
     * Validate text with regular expression
     *
     * @param text string content for validation
     * @return String
     */
    public Set<String> parseSitationFromText(String text) {


        Set<String> result = new HashSet<String>();


        matcherSitation = patternSitation.matcher(text);

        while (matcherSitation.find()) {


            String sitation = matcherSitation.group(1); // citation
            sitation = sitation.replaceAll("“", "");
            sitation = sitation.replaceAll("”", "");
            result.add(sitation);

        }
        return result;


    }
}
