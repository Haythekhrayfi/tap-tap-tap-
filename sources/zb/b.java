package zb;

import ac.g;
import lb.f;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b<T, R> implements f<T>, sb.f<R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final me.b<? super R> f45259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public me.c f45260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public sb.f<T> f45261e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f45262f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f45263g;

    public b(me.b<? super R> bVar) {
        this.f45259c = bVar;
    }

    @Override // me.b
    public void a(Throwable th) {
        if (this.f45262f) {
            dc.a.b(th);
        } else {
            this.f45262f = true;
            this.f45259c.a(th);
        }
    }

    @Override // lb.f, me.b
    public final void c(me.c cVar) {
        if (g.validate(this.f45260d, cVar)) {
            this.f45260d = cVar;
            if (cVar instanceof sb.f) {
                this.f45261e = (sb.f) cVar;
            }
            this.f45259c.c(this);
        }
    }

    @Override // me.c
    public void cancel() {
        this.f45260d.cancel();
    }

    @Override // sb.i
    public void clear() {
        this.f45261e.clear();
    }

    @Override // sb.i
    public boolean isEmpty() {
        return this.f45261e.isEmpty();
    }

    @Override // sb.i
    public final boolean offer(R r10) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // me.b
    public void onComplete() {
        if (this.f45262f) {
            return;
        }
        this.f45262f = true;
        this.f45259c.onComplete();
    }

    @Override // me.c
    public void request(long j10) {
        this.f45260d.request(j10);
    }
}
