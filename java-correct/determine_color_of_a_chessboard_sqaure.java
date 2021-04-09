class Solution {
    public boolean squareIsWhite(String coordinates) {
        int x = coordinates.charAt(0)-'a'+1;
        int y = Integer.parseInt(Character.toString(coordinates.charAt(1)));
        int diff = Math.abs(x-y);        
        boolean color = true; // white
        switch(diff){
            case 0 : 
            case 2 : 
            case 4 : 
            case 6 :
                color = false;
                break;
            case 1 :
            case 3 :
            case 5 : 
            case 7 :
                break;
        }
        return color;
    }
}