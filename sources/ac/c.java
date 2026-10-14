package ac;

/* JADX INFO: loaded from: classes3.dex */
public class c<T> extends a<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final me.b<? super T> f335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public T f336d;

    public c(me.b<? super T> bVar) {
        this.f335c = bVar;
    }

    @Override // me.c
    public void cancel() {
        set(4);
        this.f336d = null;
    }

    @Override // sb.i
    public final void clear() {
        lazySet(32);
        this.f336d = null;
    }

    public final void f(T t10) {
        int i10 = get();
        while (i10 != 8) {
            if ((i10 & (-3)) != 0) {
                return;
            }
            if (i10 == 2) {
                lazySet(3);
                me.b<? super T> bVar = this.f335c;
                bVar.d(t10);
                if (get() != 4) {
                    bVar.onComplete();
                    return;
                }
                return;
            }
            this.f336d = t10;
            if (compareAndSet(0, 1)) {
                return;
            }
            i10 = get();
            if (i10 == 4) {
                this.f336d = null;
                return;
            }
        }
        this.f336d = t10;
        lazySet(16);
        me.b<? super T> bVar2 = this.f335c;
        bVar2.d(t10);
        if (get() != 4) {
            bVar2.onComplete();
        }
    }

    @Override // sb.i
    public final boolean isEmpty() {
        return get() != 16;
    }

    @Override // sb.i
    public final T poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        T t10 = this.f336d;
        this.f336d = null;
        return t10;
    }

    @Override // me.c
    public final void request(long j10) {
        T t10;
        if (g.validate(j10)) {
            do {
                int i10 = get();
                if ((i10 & (-2)) != 0) {
                    return;
                }
                if (i10 == 1) {
                    if (!compareAndSet(1, 3) || (t10 = this.f336d) == null) {
                        return;
                    }
                    this.f336d = null;
                    me.b<? super T> bVar = this.f335c;
                    bVar.d(t10);
                    if (get() != 4) {
                        bVar.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
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
