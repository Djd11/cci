package stringsArrays;

public class Rotatation {
/*

If we imagine that 52 is a rotation of 51, then we can ask what the rotation point is.
For example, if you rotate waterbottle after wat, you get erbottlewat. In a rotation,
we cut 51 into two parts, x and y, and rearrange them to get 52.
51 =xy =waterbottle x =wat y =erbottle
52 =yx =erbottlewat
So, we need to check if there's a way to split 51 into x and y such that xy = 51 and yx = 52.
 Regardless of where the division between x and y is, we can see that yx will always bea
 substring ofxyxy.That is, 52 will always be a substring of 5151.
 */
    static boolean isRotation(String s1, String s2){

        if(s1.length()!=s2.length() || s2.length()<0) return false;
        String s1s1 = s1+s1;
        return isSubstring(s1s1,s2);
    }

    /*
        two pointers i & j
        check each char of s1[i] and s2[j] if they are same only then move the j pointer,
        after one complete pass if j has moved till end of s2 , means it is a substring.

     */
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
