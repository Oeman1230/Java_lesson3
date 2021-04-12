package lession_pack;

import lession_pack.books.bookGuide;
import lession_pack.books.bookEncyclopedia;

public class Main {

    public static void main(String[] args) {
        bookGuide testGuide = new bookGuide();
        testGuide.setBookCode("1");
        testGuide.setBookName("test guide book");
        testGuide.setBookAuthor("Oeman1230");
        testGuide.setBookPublisher("java courses");
        testGuide.setBookYear(2021);
        testGuide.setGuideMainTopic("programming");
        testGuide.addScheme("java code relation",1,"java_code","1)pict.#1 java");
        testGuide.addTopic("java programming", "there is instruction how to programme in java",1);
        System.out.println(testGuide.getGuide());
        System.out.println("text:"+ testGuide.getSchemeByPage(1) + System.lineSeparator() +
        testGuide.getTopic(1) );
        //////////////////////////////////
        System.out.println(System.lineSeparator());
        bookEncyclopedia testEncy = new bookEncyclopedia();
        testEncy.setBookCode("2");
        testEncy.setBookName("big java world");
        testEncy.setBookAuthor("Oeman1230");
        testEncy.setBookYear(2021);
        testEncy.setEncyName("java encyclopedia");
        testEncy.setEncyPagesCount(300);
        testEncy.addImage(1,"Image of coffee cup");
        System.out.println(testEncy.getEncyclopedia());
        System.out.println(testEncy.getImageByPage(1));
        testEncy.addTopic("java data types", "there is int, float, char" +
                "and othres", 1);
        testEncy.addScheme("java in proggraming world", 1, "different_languages",
                "pict.#1 Java in world");
        System.out.println(testEncy.getTopic(1));
        System.out.println(testEncy.getSchemeByPage(1));
    }
}
