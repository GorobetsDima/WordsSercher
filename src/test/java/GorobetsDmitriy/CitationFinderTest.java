package GorobetsDmitriy;
/**
 * @author Gorobets Dmitriy
 * <p/>
 * It's test  for add method
 */


import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Set;


public class CitationFinderTest {

    String citation = "“You don’t mean — you can’t mean the people who live here?”";
    CitationFinder cit;

    @BeforeClass
    public void initData() {


    }

    @DataProvider
    public Object[][] CitationProvider() {
        return new Object[][]{
                new Object[]{"You don’t mean — you can’t mean the people who live here? cried Professor McGonagall," +
                        "jumping to her feet and pointing at number four. Dumbledore — you can’t. I’ve been watching them all day." +
                        " You couldn’t find two people who are less like us. And they’ve got this son —" +
                        " I saw him kicking his mother all the way up the street, screaming for sweets. Harry Potter come and live here!"},
                new Object[]{"You don’t meashfksjgisjsdrgjlsdfbsdkvdsg;lsklan — you can’t mean" + citation + "the people who live here?l;dskhklfv"},

                new Object[]{"You don’t mean — you can’t mean the people who live here?"},

                new Object[]{" you can’t" + citation + " mean the people who live here?"},
                new Object[]{"You don’t \"mean\" — you can’t" + citation + " mean the people who live here?"},
                new Object[]{"You don’t mean — you can’t" + citation + " mean the people who live here?"},
                new Object[]{"You don’t mean — you can’t" + citation + " mean the people who live here?"},};
    }

    @Test(dataProvider = "CitationProvider")
    public void ValidCitationTest(String text) {
        cit = new CitationFinder();
        Set<String> citat = cit.parseCitationFromText(text);

        //there must have something
        Assert.assertTrue(citat.size() != 0);


        for (String citats : citat) {

            Assert.assertEquals(citats, citation);
        }

    }

}







