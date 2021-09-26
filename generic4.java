import java.util.Arrays;

public class generic4<E extends Comparable<E>> {
    E a ,b ,c;

    public static   <E extends Comparable<E>> E compare(E a ,E b, E c) {

        E max =a;
            if ( b.compareTo(max)>0) {
                max=b;
            }
            else if(c.compareTo(max)>0){
                max=c;
        }
        return max;
    }

    public static void main(String args[]){
        System.out.println("generic class:");
        System.out.println("Max int value:"+compare(6,3,9));
        System.out.println("Max float value:"+compare(4.6f,8.1f,3.1f));
        System.out.println("Max string value:"+compare("datatype","string","constructor"));
    }
}
