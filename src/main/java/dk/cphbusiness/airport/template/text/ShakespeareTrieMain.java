/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.cphbusiness.airport.template.text;

import dk.cphbusiness.algorithm.examples.utils.FileUtility;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author LouiseB
 */
public class ShakespeareTrieMain {

    int limit = 1000;
    String[] words = null;
    public String[] shakeSpeareWords = new String[limit];

    public String[] ShakeSpeareTextFile() {
        try {
            words = FileUtility.toStringArray("C:\\Users\\LouiseB\\OneDrive\\Cphbusiness\\4.semester\\Datastruktur og algoritmer\\Shakespeare\\src\\shakespeare\\Shakespeare.txt", "[^A-Za-z']+");
            shakeSpeareWords = Arrays.copyOfRange(words, 0, limit);
        } catch (IOException ex) {
            ex.toString();
        }
        
        return shakeSpeareWords;
    }
      
    
    public static void main(String[] args) {
        ShakespeareTrieMain shakespeare = new ShakespeareTrieMain();
        String[] tempShakeSpeareWords = shakespeare.ShakeSpeareTextFile();
        
        ShakespeareTrie trie = new ShakespeareTrie();
        
        for(String word : tempShakeSpeareWords){
            trie.put(word, word);
        }
        
        trie.print(System.out);
    }
}
