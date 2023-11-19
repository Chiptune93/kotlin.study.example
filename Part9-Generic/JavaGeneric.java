import java.util.ArrayList;
import java.util.List;

interface test<T> {
    T get(T param);
}

class extendTest implements test<String> {

    @Override
    public String get(String param) {
        return param;
    }
}

class extendTest2<X> implements test<X> {

    X test;

    @Override
    public X get(X param) {
        return param;
    }
}

public class JavaGeneric {
    public static void main(String[] args) {
        extendTest e = new extendTest();
        System.out.println(e.get("10"));
        extendTest2<Integer> e2 = new extendTest2<>();
        System.out.println(e2.get(10));
    }
}



