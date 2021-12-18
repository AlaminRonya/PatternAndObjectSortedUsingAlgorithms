package factoryPattern.modul;

import factoryPattern.Book;

public class FactoryMethod {
    private static Book BOOK = null;
    public static void chooseInstance(Chooses chooses){
        if (chooses==Chooses.SCIENCE){
            BOOK = getInstance("SCIENCE");
        }else if (chooses==Chooses.ARTS){
            BOOK = getInstance("ARTS");
        }else if (chooses==Chooses.COMMERCE){
            BOOK = getInstance("COMMERCE");
        }
        assert BOOK != null;
        BOOK.searchBook();
    }
    private static Book getInstance(String name){
        if (name.equals("SCIENCE")){
            return new ScienceBook();
        }else if (name.equals("ARTS")){
            return new ArtsBook();
        }else if (name.equals("COMMERCE")){
            return new CommerceBook();
        }
        return null;
    }
}
