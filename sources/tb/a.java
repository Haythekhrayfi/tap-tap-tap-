package tb;

import lb.k;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a<T, R> implements k<T>, sb.d<R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k<? super R> f35876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public nb.b f35877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public sb.d<T> f35878e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f35879f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f35880g;

    public a(k<? super R> kVar) {
        this.f35876c = kVar;
    }

    @Override // lb.k
    public void a(Throwable th) {
        if (this.f35879f) {
            dc.a.b(th);
        } else {
            this.f35879f = true;
            this.f35876c.a(th);
        }
    }

    @Override // lb.k
    public final void b(nb.b bVar) {
        if (qb.b.validate(this.f35877d, bVar)) {
            this.f35877d = bVar;
            if (bVar instanceof sb.d) {
                this.f35878e = (sb.d) bVar;
            }
            this.f35876c.b(this);
        }
    }

    public final int c(int i10) {
        sb.d<T> dVar = this.f35878e;
        if (dVar == null || (i10 & 4) != 0) {
            return 0;
        }
        int iRequestFusion = dVar.requestFusion(i10);
        if (iRequestFusion != 0) {
            this.f35880g = iRequestFusion;
        }
        return iRequestFusion;
    }

    @Override // sb.i
    public void clear() {
        this.f35878e.clear();
    }

    @Override // nb.b
    public void dispose() {
        this.f35877d.dispose();
    }

    @Override // sb.i
    public boolean isEmpty() {
        return this.f35878e.isEmpty();
    }

    @Override // sb.i
    public final boolean offer(R r10) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // lb.k
    public void onComplete() {
        if (this.f35879f) {
            return;
        }
        this.f35879f = true;
        this.f35876c.onComplete();
    }
}
