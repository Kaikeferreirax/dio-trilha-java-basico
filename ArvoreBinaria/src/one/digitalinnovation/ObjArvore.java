package one.digitalinnovation;

public abstract class ObjArvore<T> {

    public abstract boolean equals(Object o);
    public abstract int hashCode();
    public abstract int compareTo(T outro);
    public abstract String toString();
}
