package lab9_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListDictionary implements IDictionary{
    private ArrayList<String> words = new ArrayList<>();
    public ArrayListDictionary(){
        //Beolvasni a filebool a szavakat es elhelyezni a word taroloba
        try(Scanner scanner = new Scanner(new File(DICTIONARY_FILE))){
            while(scanner.hasNextLine()){
                String word = scanner.nextLine().trim();
                if(!word.isEmpty()){
                    words.add(word);
                }
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    @Override
    public boolean add(String string) {
        //Csak nem letezo szot teszunk be a szotarba
        if(!words.contains(string)){
            words.add(string);
            Collections.sort(words);
            return true;
        }
        //Ha binaris keresest akarsz, akkor kell rendezni a tombot
        //Collections.sort(words); - rendezi az ArrayListet
        return false;
    }

    @Override
    public boolean find(String word) {
        int index = Collections.binarySearch(words, word);
        return index >= 0;
    }

    @Override
    public int size() {
        return words.size();
    }
}
