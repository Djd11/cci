package stringsArrays;

public class Rotatation {

    static boolean isRotation(String s1, String s2){

        if(s1.length()!=s2.length() || s2.length()<0) return false;
        String s1s1 = s1+s1;
        return isSubstring(s1s1,s2);
    }

    static boolean isSubstring(String s, String t){

        int sl = s.length(); int tl = t.length();
        System.out.println("S1 :"+s+" S2: "+t);
        if(sl == 0) return false;
        int j =0;
        for(int i = 0 ; i < sl && j < tl;i++ ) {
            if(s.charAt(i) == t.charAt(j)){
                System.out.println("i: "+i+" j: "+j);
                j++;
            }
        }
        return j == tl;
    }

    public static void main(String[] args) {

        System.out.println("Check if rotation: "+ isRotation("waterbottle","erbottlewat"));
        System.out.println("Check if rotation: "+ isRotation("sheepofsheep","eepofsheepsh"));
        System.out.println("Check if rotation: "+ isRotation("12345","23451"));
    }
    //waterbottlewaterbottle
    //erbottlewat
}
