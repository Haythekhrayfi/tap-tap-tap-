package o0;

/* JADX INFO: loaded from: classes.dex */
public class g<T> extends f<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f33866c;

    public g(int i10) {
        super(i10);
        this.f33866c = new Object();
    }

    @Override // o0.f, o0.e
    public boolean a(T t10) {
        boolean zA;
        synchronized (this.f33866c) {
            zA = super.a(t10);
        }
        return zA;
    }

    @Override // o0.f, o0.e
    public T b() {
        T t10;
        synchronized (this.f33866c) {
            t10 = (T) super.b();
        }
        return t10;
    }
}
