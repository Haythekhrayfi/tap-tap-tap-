package ib;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class b<T> implements ic.a<T>, hb.a<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f31544c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile ic.a<T> f31545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f31546b = f31544c;

    public b(ic.a<T> aVar) {
        this.f31545a = aVar;
    }

    public static <P extends ic.a<T>, T> ic.a<T> a(P p10) {
        Objects.requireNonNull(p10);
        return p10 instanceof b ? p10 : new b(p10);
    }

    public static Object b(Object obj, Object obj2) {
        if (!((obj == f31544c || (obj instanceof d)) ? false : true) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // ic.a
    public T get() {
        T t10 = (T) this.f31546b;
        Object obj = f31544c;
        if (t10 == obj) {
            synchronized (this) {
                t10 = (T) this.f31546b;
                if (t10 == obj) {
                    t10 = this.f31545a.get();
                    b(this.f31546b, t10);
                    this.f31546b = t10;
                    this.f31545a = null;
                }
            }
        }
        return t10;
    }
}
