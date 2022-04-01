package AlgorithmicTasksEasyLeetCode.Task12;
import java.util.List;
/*You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item.
You are also given a rule represented by two strings, ruleKey and ruleValue.
The ith item is said to match the rule if one of the following is true:
ruleKey == "type" and ruleValue == typei.
ruleKey == "color" and ruleValue == colori.
ruleKey == "name" and ruleValue == namei.
Return the number of items that match the given rule.*/
public class CountItemsMatchingRule {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int idType = 0,idColor = 1,idName =2,count = 0;
        String temp;

        if(ruleKey.equals("type")){
            for(int i =0;i<items.size();i++){
                if(items.get(i).get(0).equals(ruleValue)){count++;}
            }
            return count;
        }
        if(ruleKey.equals("color")){
            for(int i =0;i<items.size();i++){
                if(items.get(i).get(1).equals(ruleValue)){count++;}
            }
            return count;
        }
        if(ruleKey.equals("name")){
            for(int i =0;i<items.size();i++){
                if(items.get(i).get(2).equals(ruleValue)){count++;}
            }
            return count;
        }

        return count;
    }
}
