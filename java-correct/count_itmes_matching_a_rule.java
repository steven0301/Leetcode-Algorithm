class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int cnt = 0;
        for(List<String> list : items){
            Item i = new Item(list.get(0), list.get(1), list.get(2));
            if(i.isTrue(ruleKey, ruleValue)) cnt++;
        }
        return cnt;
    }
}

class Item {
    
    public String type;
    public String color;
    public String name;

    Item(String type, String color, String name){
        this.type = type;
        this.color = color;
        this.name = name;
    }
    
    public boolean isTrue(String key, String value){
        switch(key){
            case "type": return value.equals(type);
            case "color": return value.equals(color);
            case "name": return value.equals(name);
        }
        return false;
    }
}