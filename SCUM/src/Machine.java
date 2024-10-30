public class Machine<T> {

    public T execute(MonoOperation<T> mono, T n1) {
        return mono.execute(n1);
    }

    public T execute(BiOperation<T> bi, T n1, T n2) {
        return bi.execute(n1, n2);
    }
}
