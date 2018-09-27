package dictionary;

import java.util.Scanner;

public class DictionaryCommandline {

    DictionaryManagement dictionaryManagement = new DictionaryManagement();
    
    public DictionaryManagement getDictionaryManagement() {
        return dictionaryManagement;
    }
    

    void dictionaryAdvanced() {
        dictionaryManagement.insertFromFile();
        showAllWords();
    }

    void dictionaryBasic() {
        //dictionaryManagement.insertFromCommandline();
        dictionaryManagement.insertFromFile();
        showAllWords();
        //dictionaryManagement.dictionaryLookup();
        //dictionaryManagement.addWord();
        dictionaryManagement.deleteWord();
        //dictionaryManagement.repairWord();
        showAllWords();
    }

    void dictionarySearcher() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = 0; i < dictionaryManagement.getSizeWords(); i++) {
            if (str.equalsIgnoreCase(dictionaryManagement.getDictionary().getWords().get(i).getWord_target().substring(0, str.length()))) {
                System.out.print(dictionaryManagement.getDictionary().getWords().get(i).getWord_target() + ", ");
            }
        }

    }

    void showAllWords() {
        System.out.printf("%-10s%-30s%s", "No", "English", "Vietnamese\n");
        for (int i = 0; i < dictionaryManagement.getSizeWords(); i++) {
            System.out.printf("%-10s%-30s%s\n", i + 1, dictionaryManagement.getDictionary().getWords().get(i).getWord_target(),
                    dictionaryManagement.getDictionary().getWords().get(i).getWord_explain());
        }
    }

//    public static void main(String[] args) {
//        DictionaryCommandline dictionaryCommandline = new DictionaryCommandline();
//        dictionaryCommandline.dictionaryBasic();
//        //dictionaryCommandline.dictionarySearcher();
//    }


}
