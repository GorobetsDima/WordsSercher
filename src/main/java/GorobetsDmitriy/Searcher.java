package GorobetsDmitriy;

import org.apache.log4j.Logger;

import java.util.Set;

/**
 * @author Gorobets Dmitriy
 *         <p/>
 *         At this Class in method "isContain" I put 2 arguments
 *         There is I check whether a word -"word" belongs to the text or nor
 * @argum "String word"- it's a word which we want to find in citations of text
 * <p/>
 * "Set<String> citations"-it's a set of citations which we found at the text at "CitationFinder" class
 * @return "true" if There was found a word which equal to the "word" variable in the citations!
 * "false" if "word" wasn't found.
 */
/*
2. Есть текст (отрывок из Гарри Поттера):

“You don’t mean — you can’t mean the people who live here?” cried Professor McGonagall,
jumping to her feet and pointing at number four. “Dumbledore — you can’t. I’ve been watching them all day.
 You couldn’t find two people who are less like us. And they’ve got this son —
  I saw him kicking his mother all the way up the street, screaming for sweets. Harry Potter come and live here!”

Необходимо реализовать метод boolean isContain(String word) ,
 в котором будет происходить проверка, является ли слово частью цитаты или нет? К примеру,
  Dumbledore - является, потому что он используется в речевом обороте, а McGonagall - нет.

 */

public class Searcher {

    public static final Logger SEARCH_LOGG = Logger.getLogger(Searcher.class);


    public static boolean isContain(String word, Set<String> citations) {

        boolean result = false;
        int citatNum = 0;
        SEARCH_LOGG.info("Цитаты, в которых было найдено слово " + word + ":");
        for (String citation : citations) {

            String[] strArr = citation.split(" ");

            for (int wordsNum = 0; wordsNum < strArr.length; wordsNum++) {

                if (strArr[wordsNum].equals(word)) {
                    SEARCH_LOGG.info(citation);
                    result = true;
                    citatNum++;
                }
            }
        }
        if (result == true) {
            SEARCH_LOGG.info("Слово " + word + " содержат " + citatNum + " цицаты.");
        } else {
            SEARCH_LOGG.info("В данном тексте нет таких цитат!");
        }
        return result;
    }
}


