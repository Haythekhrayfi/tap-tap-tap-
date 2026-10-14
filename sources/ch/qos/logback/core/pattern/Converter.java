package ch.qos.logback.core.pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class Converter<E> {
    public Converter<E> next;

    public abstract String convert(E e10);

    public final Converter<E> getNext() {
        return this.next;
    }

    public final void setNext(Converter<E> converter) {
        if (this.next != null) {
            throw new IllegalStateException("Next converter has been already set");
        }
        this.next = converter;
    }

    public void write(StringBuilder sb2, E e10) {
        sb2.append(convert(e10));
    }
}
