package Lab1;

;

public class Worker {
    public static void main(String[] args) {
//        System.out.println( Algo.calculate1(Double.parseDouble("0"),Double.parseDouble("0")));
//        System.out.println( Algo.calculate1(3,4));
//        System.out.println( Algo.calculate2(2,4,2));
//        System.out.println( Algo.calculate3(3,1,1,1));
        int[] a = {44,12,2,5,64,1,23132,12,123,123,213,213123,12,3};
        HeapSort.sort(a);
        for (int i : a){
            System.out.print(i + ", ");
        }
    }
}
