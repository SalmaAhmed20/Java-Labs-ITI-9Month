package dictionaryPkg;

import java.util.*;

public class Dictionary {
    private SortedMap<Character, List<String>> dictionary;

    public Dictionary() {
        dictionary = new TreeMap<>();
    }

    public void addSorted(Character c, String word) {
        if (!word.isEmpty()) {
            if (dictionary.containsKey(Character.toUpperCase(c)) && dictionary.get(Character.toUpperCase(c)).size() > 0) {
                if (Character.toUpperCase(word.charAt(0)) == Character.toUpperCase(c)) {
                    if (!dictionary.get(Character.toUpperCase(c)).contains(word)) {
                    dictionary.get(Character.toUpperCase(c)).add(word);
                    Collections.sort(dictionary.get(Character.toUpperCase(c)));
                    }
                    else
                        System.out.println("exist");
                }
            } else {
                if ( Character.toUpperCase(word.charAt(0)) == Character.toUpperCase(c)) {
                    List<String> words = new ArrayList<>();
                    words.add(word);
                    dictionary.put(Character.toUpperCase(c), words);
                }
            }
        }else {
            System.out.println("Can't add empty word");
        }
    }

    public void printAll() {
        dictionary.forEach((key, value) -> {
            System.out.println("Key: " + key);
            System.out.println("Words: ");
            for (String s : value) {
                System.out.println("\t" + s);
            }
        });
    }

    public void printSpecific(Character c) {
        if (dictionary.containsKey(Character.toUpperCase(c))) {
            System.out.println("Key: " + Character.toUpperCase(c) + "\nWords");
            dictionary.get(Character.toUpperCase(c)).forEach(System.out::println);
        } else
            System.out.println("Key: " + Character.toUpperCase(c) + " Not Exist");
    }
}
