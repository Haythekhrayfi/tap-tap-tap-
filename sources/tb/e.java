package tb;

import lb.k;

/* JADX INFO: loaded from: classes3.dex */
public class e<T> extends b<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k<? super T> f35883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public T f35884d;

    public e(k<? super T> kVar) {
        this.f35883c = kVar;
    }

    public final void c(T t10) {
        int i10 = get();
        if ((i10 & 54) != 0) {
            return;
        }
        k<? super T> kVar = this.f35883c;
        if (i10 == 8) {
            this.f35884d = t10;
            lazySet(16);
            t10 = null;
        } else {
            lazySet(2);
        }
        kVar.d(t10);
        if (get() != 4) {
            kVar.onComplete();
        }
    }

    @Override // sb.i
    public final void clear() {
        lazySet(32);
        this.f35884d = null;
    }

    @Override // nb.b
    public void dispose() {
        set(4);
        this.f35884d = null;
    }

    public final boolean e() {
        return get() == 4;
    }

    @Override // sb.i
    public final boolean isEmpty() {
        return get() != 16;
    }

    @Override // sb.i
    public final T poll() throws Exception {
        if (get() != 16) {
            return null;
        }
        T t10 = this.f35884d;
        this.f35884d = null;
        lazySet(32);
        return t10;
    }

    @Override // sb.e
    public final int requestFusion(int i10) {
        if ((i10 & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }
}
