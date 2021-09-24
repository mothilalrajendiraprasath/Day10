import java.util.Arrays;

public class generic<E extends Comparable<E>> {
    E[] element;

    public generic (E[] element){
        this.element=element;
}
 public static  <E extends Comparable<E>> E intCompare(E[] data) {

       E max = data[0];
     for (E element : data) {
         if ( element.compareTo(max)>0) {
            max=element;
         }
     }
     System.out.println("Max value:"+max);
     return max;
 }

    public static void main(String args[]){
     System.out.println("generic class:");
        Integer[] arr = {3, 4, 5};
     intCompare(arr);
    }
}
