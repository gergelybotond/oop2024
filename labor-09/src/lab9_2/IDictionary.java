package lab9_2;

public interface IDictionary {
    static final String DICTIONARY_FILE = "dic.txt";
    boolean add(String string);
    boolean find(String word);
    int size();
}
