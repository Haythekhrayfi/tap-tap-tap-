package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public class v<T> extends LiveData<T> {
    public v() {
    }

    public v(T t10) {
        super(t10);
    }

    @Override // androidx.lifecycle.LiveData
    public void i(T t10) {
        LiveData.a("setValue");
        this.f2143g++;
        this.f2141e = t10;
        c(null);
    }

    public void j(T t10) {
        boolean z10;
        synchronized (this.f2137a) {
            z10 = this.f2142f == LiveData.f2136k;
            this.f2142f = t10;
        }
        if (z10) {
            k.a.d().f31888a.c(this.f2146j);
        }
    }
}
