package a5;

/* JADX INFO: loaded from: classes2.dex */
public class q<T> implements x5.b<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f122c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f123a = f122c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile x5.b<T> f124b;

    public q(x5.b<T> bVar) {
        this.f124b = bVar;
    }

    @Override // x5.b
    public T get() {
        T t10 = (T) this.f123a;
        Object obj = f122c;
        if (t10 == obj) {
            synchronized (this) {
                t10 = (T) this.f123a;
                if (t10 == obj) {
                    t10 = this.f124b.get();
                    this.f123a = t10;
                    this.f124b = null;
                }
            }
        }
        return t10;
    }
}
