package zb;

import ac.g;
import sb.f;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a<T, R> implements sb.a<T>, f<R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sb.a<? super R> f45254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public me.c f45255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f<T> f45256e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f45257f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f45258g;

    public a(sb.a<? super R> aVar) {
        this.f45254c = aVar;
    }

    @Override // me.b
    public void a(Throwable th) {
        if (this.f45257f) {
            dc.a.b(th);
        } else {
            this.f45257f = true;
            this.f45254c.a(th);
        }
    }

    public final void b(Throwable th) {
        c0.Q(th);
        this.f45255d.cancel();
        a(th);
    }

    @Override // lb.f, me.b
    public final void c(me.c cVar) {
        if (g.validate(this.f45255d, cVar)) {
            this.f45255d = cVar;
            if (cVar instanceof f) {
                this.f45256e = (f) cVar;
            }
            this.f45254c.c(this);
        }
    }

    @Override // me.c
    public void cancel() {
        this.f45255d.cancel();
    }

    @Override // sb.i
    public void clear() {
        this.f45256e.clear();
    }

    @Override // sb.i
    public boolean isEmpty() {
        return this.f45256e.isEmpty();
    }

    @Override // sb.i
    public final boolean offer(R r10) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // me.b
    public void onComplete() {
        if (this.f45257f) {
            return;
        }
        this.f45257f = true;
        this.f45254c.onComplete();
    }

    @Override // me.c
    public void request(long j10) {
        this.f45255d.request(j10);
    }
}
