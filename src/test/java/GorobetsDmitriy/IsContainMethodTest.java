package GorobetsDmitriy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Set;
import static org.junit.Assert.assertEquals;

/**
 * Created by Gorobets Dmitriy on 15.09.2015.
 */
public class IsContainMethodTest {
     String text = "“You don’t mean — you can’t mean the people who live here?” cried Professor McGonagall," +
            "jumping to her feet and (\"Some special test text for checking a regular expression\")pointing at number four. “Dumbledore — you can’t. I’ve been watching them all day." +
            " You couldn’t find two people who are less like us. And they’ve got this son —" +
            " I saw him kicking his mother all the way up the street, screaming for sweets. Harry Potter come and live here!”";
     String word1 = "You don’t mean";
     String word2 = "Some special test";
     String word3 = "Dumbledore";
    Set<String> citations;
    boolean isContain = true;

    @Before
    public void setUpBefore() {


        citations = CitationFinder.parseCitationFromText(text);

    }

    @Test
    public  void tst_TEXT_CONTAIN_WORD1() {

        assertEquals(isContain, Searcher.isContain(word1, citations));

    }
    @Test
    public  void tst_TEXT_CONTAIN_WORD2() {

        assertEquals(isContain, Searcher.isContain(word2, citations));

    }
    @Test
    public  void tst_TEXT_CONTAIN_WORD3() {

        assertEquals(isContain, Searcher.isContain(word3, citations));

    }


//
//    @Test
//    public void tst_File_Exist_False() {
//        assertFalse(destinationFileName, !file.exists());
//
//    }
//
//    @Test
//    public void tst_File_IsFile() {
//        assertTrue(file.isFile());
//    }
//
//    @Test
//    public void tst_File_GetName() {
//        assertTrue(file.getName().equals("Test CSVFile.csv"));
//    }
//
//    @Test
//    public void tst_File_Length() {
//        assertTrue(file.length() == 0);
//    }
//
//    @Test
//    public void tst_FileLength_NotNull_AfterWrite_True() {
////        fw.writeToCSVRandomData("Test CSVFile.csv", 1);
//        randomWriteToCSV.print(featureRandomProducts);
//        randomWriteToCSV.flush();
//        randomWriteToCSV.close();
//
//        assertTrue(file.length() != 0);
//    }
//
//    @Test
//    public void tst_FileLength_Null_AfterWrite_False() {
////        fw.writeToCSVRandomData("Test CSVFile.csv", 1);
//        randomWriteToCSV.print(featureRandomProducts);
//        randomWriteToCSV.flush();
//        randomWriteToCSV.close();
//
//        assertFalse(file.length() == 0);
//    }
//
//    @Test
//    public void tst_File_CanWrite() {
//
//        assertTrue(file.canWrite());
//    }
//
//    @Test
//    public void tst_File_CanRead() {
//
//        assertTrue(file.canRead());
//    }
//
//    @Test
//    public void tst_RandomWriteToCSV_True() {
//        randomWriteToCSV.print("dghdjkhdfgbn");
//        randomWriteToCSV.flush();
//        randomWriteToCSV.close();
//        assertTrue(file.length() != 0);
//    }
//
//    @Test
//    public void tst_RandomWriteToCSV_WithoutFlushAndClose_False() {
//        randomWriteToCSV.print("dghdjkhdfgbn");
//
//        assertFalse(file.length() != 0);
//    }
//
//    @Test
//    public void tst_WriteToStringBuilder_True() {
//        featureRandomProducts.append("dghdjkhdfgbn");
//
//        assertTrue(featureRandomProducts.length() != 0);
//    }
//
//    @Test
//    public void tst_DeleteFromStringBuilder_True() {
//        featureRandomProducts.append("dghdjkhdfgbn");
//        featureRandomProducts.delete(0, 12);
//
//        assertTrue(featureRandomProducts.length() == 0);
//    }
//
//    @Test
//    public void tst_StringBuilderEqualsToStr_True() {
//        featureRandomProducts.append("dghdjkhdfgbn");
//
//        assertTrue(featureRandomProducts.toString().equals("dghdjkhdfgbn"));
//    }


    @After

    public void setUpAfter() {
         citations= null;

    }

}
