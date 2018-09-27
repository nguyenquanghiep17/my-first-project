package dictionary;
import dictionary.Word;
import java.io.*;
import java.util.Scanner;

public class DictionaryManagement {

    private Dictionary dictionary = new Dictionary();
    public int getSizeWords() {
        return dictionary.getWords().size();
    }

    public Dictionary getDictionary() {
        return this.dictionary;
    }
    public void dictionaryLookup() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = 0; i < dictionary.getWords().size(); i++) {
            if (str.equals(dictionary.getWords().get(i).getWord_target()))
                System.out.println(dictionary.getWords().get(i).getWord_explain());
        }
    }

    public void insertFromFile() {
        try {
            File inFile = new File("dictionaries.txt");
            FileReader fileReader = new FileReader(inFile);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = null;
            while ((line = reader.readLine()) != null) {
                String str[] = line.split("\t");
                Word new_word = new Word();
                new_word.setWord_target(str[0]);
                new_word.setWord_explain(str[1]);
                dictionary.getWords().add(new_word);
            }
//            dictionary.getWords().get(0).setWord_target(dictionary.getWords().get(0).getWord_target().substring(1));
            reader.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addWord() {
        Scanner sc = new Scanner(System.in);
        Word new_word = new Word();
        new_word.setWord_target(sc.nextLine());
        new_word.setWord_explain(sc.nextLine());
        dictionary.getWords().add(new_word);
        dictionaryExportToFile();
    }

    public void deleteWord() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = 0; i < dictionary.getWords().size(); i++) {
            if (str.equalsIgnoreCase(dictionary.getWords().get(i).getWord_target())) {
                dictionary.getWords().remove(i);
            }
        }
        dictionaryExportToFile();
    }

    public void repairWord() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = 0; i < dictionary.getWords().size(); i++) {
            if (str.equalsIgnoreCase(dictionary.getWords().get(i).getWord_target())) {
                dictionary.getWords().get(i).setWord_target(sc.nextLine());
                dictionary.getWords().get(i).setWord_explain(sc.nextLine());
            }
        }
        dictionaryExportToFile();
    }

    public void dictionaryExportToFile()  {
        try {
            FileWriter writer = new FileWriter("dictionaries.txt");
            for (int i = 0; i < getSizeWords(); i++)
                writer.write(dictionary.getWords().get(i).getWord_target() + "\t" + dictionary.getWords().get(i).getWord_explain() + "\n");
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void insertFromCommandline() {
        int number_word;
        Scanner sc = new Scanner(System.in);
        number_word = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < number_word; i++) {
            Word new_word = new Word();
            new_word.setWord_target(sc.nextLine());
            new_word.setWord_explain(sc.nextLine());
            dictionary.getWords().add(new_word);
        }
        sc.close();
    }
}
