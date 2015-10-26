package GorobetsDmitriy;

import java.util.Set;

/**
 * @author Gorobets Dmitriy
 *         <p/>
 *         At this Class in method "calculate" I put 3 arguments
 *         There is checked an operator and according to the operator chooses,
 *         which way to use for a calculation in the constructor
 *         <p/>
 *         First argument is "firstArg"-it have to be a double type
 *         <p/>
 *         Second argument is "operator"-it have to be an operator
 *         <p/>
 *         Third argument is "secondArg"-it have to be a double type
 */
/*
2. Есть текст (отрывок из Гарри Поттера):

“You don’t mean — you can’t mean the people who live here?” cried Professor McGonagall,
jumping to her feet and pointing at number four. “Dumbledore — you can’t. I’ve been watching them all day.
 You couldn’t find two people who are less like us. And they’ve got this son —
  I saw him kicking his mother all the way up the street, screaming for sweets. Harry Potter come and live here!”

Необходимо реализовать метод boolean isPhrase(String word) ,
 в котором будет происходить проверка, является ли слово частью цитаты или нет? К примеру,
  Dumbledore - является, потому что он используется в речевом обороте, а McGonagall - нет.

 */

public class Searcher {

//    public static int countCitation(String s) {
//        int quoteNumber = 0;
//
//        String quote = "\"";
//        String[] arrStr = s.split("");
//        for (String str : arrStr) {
//            if (str.equals(quote)) {
//                quoteNumber++;
//            }
//        }
//        return quoteNumber;
//    }

    public static boolean isPhrase(String word, Set<String> citations) {
        boolean result= false;

       for (String citat:citations){
//           if(citat.substring(0,citat.length())==true)
       }

//        int countOfCitation;
//        for (countOfCitation = 1; countOfCitation <=countCitation(s)/2 ; countOfCitation++) {
//            s = s.substring(s.indexOf('"')+1, s.indexOf('"', s.indexOf('"') + 2));
//            System.out.println(s);
//            String[] parts = s.split(" ");
//            System.out.println(Arrays.toString(parts));
//            for (int i = 0; i < parts.length; i++) {
//                if (parts[i].equals(word)) {
//                    result = true;
//        }
//
//
////                System.out.print(" " + parts[i]);
//            }
//        }
//
        return result;
    }


}
