package GorobetsDmitriy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.assertEquals;

/**
 * Created by Gorobets Dmitriy on 15.09.2015.
 */

public class ParseCitationFromTextMethodTest {
    String text = "“You don’t mean — you can’t mean the people who live here?” cried Professor McGonagall," +
            "jumping to her feet and (\"Some special test text for checking a regular expression\")pointing at number four. “Dumbledore — you can’t. I’ve been watching them all day." +
            " You couldn’t find two people who are less like us. And they’ve got this son —" +
            " I saw him kicking his mother all the way up the street, screaming for sweets. Harry Potter come and live here!”";
    Set<String> citations;

    @Before
    public void setUpBefore() {

        citations = CitationFinder.parseCitationFromText(text);
    }

    @Test
    public void tst_TEXT_CONTAIN_CITATIONS() {

        assertEquals(3, citations.size());

    }

    @Test
    public void tst_CITATION_EQUAL_PARSE_CITAT1() {


        assertEquals(text.contains("You don’t mean — you can’t mean the people who live here?"),
                citations.contains("You don’t mean — you can’t mean the people who live here?"));

    }

    @Test
    public void tst_CITATION_EQUAL_PARSE_CITAT2() {


        assertEquals(text.contains("Some special test text for checking a regular expression"),
                citations.contains("Some special test text for checking a regular expression"));

    }

    @Test
    public void tst_CITATION_EQUAL_PARSE_CITA3T() {


        assertEquals(text.contains("Dumbledore — you can’t. I’ve been watching them all day." +
                        " You couldn’t find two people who are less like us. And they’ve got this son —" +
                        " I saw him kicking his mother all the way up the street, screaming for sweets." +
                        " Harry Potter come and live here!"),
                citations.contains("Dumbledore — you can’t. I’ve been watching them all day." +
                        " You couldn’t find two people who are less like us. And they’ve got this son —" +
                        " I saw him kicking his mother all the way up the street, screaming for sweets." +
                        " Harry Potter come and live here!"));

    }

    @After

    public void setUpAfter() {
        citations = null;
    }

}
