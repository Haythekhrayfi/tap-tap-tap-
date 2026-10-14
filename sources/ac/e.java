package ac;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class e<T> extends AtomicInteger implements sb.f<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T f337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final me.b<? super T> f338d;

    public e(me.b<? super T> bVar, T t10) {
        this.f338d = bVar;
        this.f337c = t10;
    }

    @Override // me.c
    public void cancel() {
        lazySet(2);
    }

    @Override // sb.i
    public void clear() {
        lazySet(1);
    }

    @Override // sb.i
    public boolean isEmpty() {
        return get() != 0;
    }

    @Override // sb.i
    public boolean offer(T t10) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // sb.i
    public T poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.f337c;
    }

    @Override // me.c
    public void request(long j10) {
        if (g.validate(j10) && compareAndSet(0, 1)) {
            me.b<? super T> bVar = this.f338d;
            bVar.d(this.f337c);
            if (get() != 2) {
                bVar.onComplete();
            }
        }
    }

    @Override // sb.e
    public int requestFusion(int i10) {
        return i10 & 1;
    }
}
