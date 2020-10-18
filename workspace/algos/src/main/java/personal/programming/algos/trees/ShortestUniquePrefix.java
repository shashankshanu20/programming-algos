package personal.programming.algos.trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ShortestUniquePrefix {

    class TrieNode{
        Character character;
        int terminalCount = 0;
        Map<Character,TrieNode> map = new HashMap<>();
        TrieNode(Character character){
            this.character = character;
        }
    }

    public void insert(TrieNode root, String word){
        for(int i = 0;i<word.length(); i++){
            if(!root.map.containsKey(word.charAt(i))){
                TrieNode trieNode = new TrieNode(word.charAt(i));
                if(i==word.length()-1)
                    trieNode.terminalCount++;
                root.map.put(word.charAt(i),trieNode);
            }else{
                if(i==word.length()-1)
                    root.terminalCount++;
            }
            root = root.map.get(word.charAt(i));
        }

    }

    public String searchPrefix(TrieNode root, String word){
        String prefix="";
        int lleast = 0;
        int index = 0;

        while(root.map.size() != 0){
            prefix += word.charAt(index);
            if(root.map.size() > 1)
                lleast = index;
            root = root.map.get(word.charAt(index));
            index++;
        }
        return prefix.substring(0,lleast+1);
    }

    public ArrayList<String> prefix(ArrayList<String> A) {
        TrieNode root = new TrieNode('\0');
        for(String word : A)
            insert(root,word);

        ArrayList<String> result = new ArrayList<>();
        for(String word: A)
            result.add(searchPrefix(root,word));
        return result;
    }
}
