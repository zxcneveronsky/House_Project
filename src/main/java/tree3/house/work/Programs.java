package tree3.house.work;


import java.util.HashMap;
import java.util.HashSet;

public class Programs {
    public static void main(String[] args) {

        String a = "вода хлеб вода горе горе хлеб вода горе";
        String[] wordList = a.split("\\s+");
        HashSet<String> wordHashList = new HashSet<String>();
        for (String word:wordList){
            wordHashList.add(word);
        }

        HashMap<String,Integer> hashMap = new HashMap<String,Integer>();
        for (int i = 0; i<wordList.length;i++) {
            if (wordHashList.contains(wordList[i])) {
                if (hashMap.containsKey(wordList[i])){
                    hashMap.replace(wordList[i],hashMap.get(wordList[i])+1);
                } else{
                    hashMap.put(wordList[i],1);
                }

            }

        }
        System.out.println(hashMap);
    }
}
