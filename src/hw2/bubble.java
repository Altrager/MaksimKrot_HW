package hw2;

public class bubble {
    private long[] a;
    private int elems;

    public bubble(int max){
        a = new long[max];
        elems = 0;
    }

    public void into(long value){
        a[elems] = value;
        elems++;
    }

    public void printer(){
        for (int i = 0; i < elems; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("End");
    }

    private void Swap(int first, int second){
        long dummy = a[first];
        a[first] = a[second];
        a[second] = dummy;
    }

    public void bubbleSorter(){
        for (int out = elems - 1; out >= 1; out--){
            for (int in = 0; in < out; in++){
                if(a[in] > a[in + 1])
                    Swap(in, in + 1);
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        bubble array = new bubble(9);

        array.into(1332);
        array.into(28);
        array.into(184);
        array.into(19);
        array.into(174);
        array.into(15);
        array.into(144);
        array.into(89);
        array.into(11);

        array.bubbleSorter();
        array.printer();
    }
}
