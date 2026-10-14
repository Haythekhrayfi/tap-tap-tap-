package tb;

import lb.k;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class f<T> implements k<T>, nb.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k<? super T> f35885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pb.b<? super nb.b> f35886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final pb.a f35887e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public nb.b f35888f;

    public f(k<? super T> kVar, pb.b<? super nb.b> bVar, pb.a aVar) {
        this.f35885c = kVar;
        this.f35886d = bVar;
        this.f35887e = aVar;
    }

    @Override // lb.k
    public void a(Throwable th) {
        nb.b bVar = this.f35888f;
        qb.b bVar2 = qb.b.DISPOSED;
        if (bVar == bVar2) {
            dc.a.b(th);
        } else {
            this.f35888f = bVar2;
            this.f35885c.a(th);
        }
    }

    @Override // lb.k
    public void b(nb.b bVar) {
        try {
            this.f35886d.accept(bVar);
            if (qb.b.validate(this.f35888f, bVar)) {
                this.f35888f = bVar;
                this.f35885c.b(this);
            }
        } catch (Throwable th) {
            c0.Q(th);
            bVar.dispose();
            this.f35888f = qb.b.DISPOSED;
            qb.c.error(th, this.f35885c);
        }
    }

    @Override // lb.k
    public void d(T t10) {
        this.f35885c.d(t10);
    }

    @Override // nb.b
    public void dispose() {
        nb.b bVar = this.f35888f;
        qb.b bVar2 = qb.b.DISPOSED;
        if (bVar != bVar2) {
            this.f35888f = bVar2;
            try {
                this.f35887e.run();
            } catch (Throwable th) {
                c0.Q(th);
                dc.a.b(th);
            }
            bVar.dispose();
        }
    }

    @Override // lb.k
    public void onComplete() {
        nb.b bVar = this.f35888f;
        qb.b bVar2 = qb.b.DISPOSED;
        if (bVar != bVar2) {
            this.f35888f = bVar2;
            this.f35885c.onComplete();
        }
    }
}
