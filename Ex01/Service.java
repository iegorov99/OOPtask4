package Ex01;

public interface Service<T1, T2> {
    T1 restock(T1 automat, T2 product);
}
