package lession_pack;

import lession_pack.books.bookGuide;
import lession_pack.books.bookEncyclopedia;
import lession_pack.doctors.neuroSurgeon;
import lession_pack.doctors.surgeon;
import lession_pack.phone.Model;

public class Main {

    public static void main(String[] args) {
        bookGuide testGuide = new bookGuide();
        System.out.println(System.lineSeparator());
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
        ////////////////////////////////////////////////////////////////////
        Model phone1 = new Model();
        phone1.setPhoneOwner("Kolya");
        phone1.setPhoneNumber(980);
        phone1.setPhoneCameraCount(1);
        phone1.setPhoneCameraMPix(12);
        phone1.setPhoneMemorySize(120);
        phone1.setModelNumber(123);
        phone1.setOSname("Android");
        phone1.setOSversion(101);
        phone1.setInternetConnection();
        System.out.println(System.lineSeparator() +phone1.getModelInfo());

        ////////////////////////////////////////////////////////////////////
        Model phone2 = new Model();
        phone2.setPhoneOwner("Pasha");
        phone2.setPhoneNumber(240);
        phone2.setPhoneCameraCount(3);
        phone2.setPhoneCameraMPix(24);
        phone2.setPhoneMemorySize(240);
        phone2.setModelNumber(234);
        phone2.setOSname("Ios");
        phone2.setOSversion(567);
        phone2.setFiveGAccess();
        System.out.println(System.lineSeparator() + phone2.getModelInfo());
        ////////////////////////////////////////////////////////////////////
        phone1.sendSMS(phone2.getPhoneOwner(), "Привет");
        phone2.getSMSFrom(phone1.getPhoneOwner(), "Привет");
        phone2.sendSMS(phone1.getPhoneOwner(), "Здорова. Как дела? ");
        phone1.getSMSFrom(phone2.getPhoneOwner(), "Здорова. Как дела?" );
        phone1.phoneCall(phone2.getPhoneOwner());
        ////////////////////////////////////////////////////////////////////
        System.out.println(System.lineSeparator());
        surgeon doc1 = new surgeon();
        doc1.setDoctorName("Vladimir");
        doc1.setYearsInWork(10);
        doc1.teachNewIllness("hit", "pain in leg");

        doc1.doDoctorWork(phone1.getPhoneOwner(), "pain in leg");
        System.out.println(doc1.toString());
        System.out.println(System.lineSeparator());
        neuroSurgeon doc2 = new neuroSurgeon();
        doc2.setDoctorName("Stepan");
        doc2.setYearsInWork(16);
        doc2.teachNewIllness("insult", "headache", 50, true);
        doc2.doDoctorWork("Sasha", "headache");
        doc2.setCanOperateHead();
        doc2.doDoctorWork("Sasha", "headache");
        doc2.setOperationTableStatus();
        doc2.doDoctorWork("Sasha", "headache");
        System.out.println(doc2.toString());
    }
}
