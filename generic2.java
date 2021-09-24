import java.util.Arrays;

public class generic2<E extends Comparable<E>> {
    E[] element;

    public generic2 (E[] element){
        this.element=element;
    }
    public static  <E extends Comparable<E>> E compare(E[] elements) {

        E max = elements[0];
        for (E element : elements) {
            if ( element.compareTo(max)>0) {
                max=element;
            }
        }
        System.out.println("Max int value:"+max);
        return max;
    }
    public static  <E extends Comparable<E>> E floatCompare(E[] elements) {

        E max = elements[0];
        for (E element : elements) {
            if ( element.compareTo(max)>0) {
                max=element;
            }
        }
        System.out.println("Max Float value:"+max);
        return max;
    }


    public static void main(String args[]){
        System.out.println("generic class:");
        Integer[] arr = {3, 4, 5};
        compare(arr);
        Float[] arr2= {3.4f,1.2f,7.3f};
        floatCompare(arr2);
    }
}
