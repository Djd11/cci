package concept;

public class AbstractDemo {

    /*
        Superclass abstract which declares just abstract method but no definations.implementation
        it declares a common behavior which multiple class can extends and override or overload through ploymorphism

     */

    private static abstract class Superclass{
        abstract int getVolume(int depth,int width,int height);
    }

    private static class Subclass extends Superclass{

        int getVolume(int depth,int width,int height){
            int vol = depth*width*height;
            System.out.println(vol);
            return vol;
        }
    }

    public static void main(String[] args) {

        Subclass subclass = new Subclass();
        subclass.getVolume(3,3,3);

    }
}
