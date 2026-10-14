package gc;

import bc.f;
import lb.k;
import pb.d;

/* JADX INFO: loaded from: classes3.dex */
public final class b<T> extends c<T> implements d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c<T> f30429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f30430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public bc.a<Object> f30431e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f30432f;

    public b(c<T> cVar) {
        this.f30429c = cVar;
    }

    public void A() {
        bc.a<Object> aVar;
        while (true) {
            synchronized (this) {
                aVar = this.f30431e;
                if (aVar == null) {
                    this.f30430d = false;
                    return;
                }
                this.f30431e = null;
            }
            int i10 = aVar.f3501a;
            for (Object[] objArr = aVar.f3502b; objArr != null; objArr = objArr[i10]) {
                for (int i11 = 0; i11 < i10; i11++) {
                    Object[] objArr2 = objArr[i11];
                    if (objArr2 == null) {
                        break;
                    } else {
                        if (f.acceptFull(objArr2, this.f30429c)) {
                            break;
                        }
                    }
                }
            }
        }
    }

    @Override // lb.k
    public void a(Throwable th) {
        if (this.f30432f) {
            dc.a.b(th);
            return;
        }
        synchronized (this) {
            boolean z10 = true;
            if (!this.f30432f) {
                this.f30432f = true;
                if (this.f30430d) {
                    bc.a<Object> aVar = this.f30431e;
                    if (aVar == null) {
                        aVar = new bc.a<>(4);
                        this.f30431e = aVar;
                    }
                    aVar.b(f.error(th));
                    return;
                }
                this.f30430d = true;
                z10 = false;
            }
            if (z10) {
                dc.a.b(th);
            } else {
                this.f30429c.a(th);
            }
        }
    }

    @Override // lb.k
    public void b(nb.b bVar) {
        boolean z10 = true;
        if (!this.f30432f) {
            synchronized (this) {
                if (!this.f30432f) {
                    if (this.f30430d) {
                        bc.a<Object> aVar = this.f30431e;
                        if (aVar == null) {
                            aVar = new bc.a<>(4);
                            this.f30431e = aVar;
                        }
                        aVar.a(f.disposable(bVar));
                        return;
                    }
                    this.f30430d = true;
                    z10 = false;
                }
            }
        }
        if (z10) {
            bVar.dispose();
        } else {
            this.f30429c.b(bVar);
            A();
        }
    }

    @Override // lb.k
    public void d(T t10) {
        if (this.f30432f) {
            return;
        }
        synchronized (this) {
            if (this.f30432f) {
                return;
            }
            if (!this.f30430d) {
                this.f30430d = true;
                this.f30429c.d(t10);
                A();
            } else {
                bc.a<Object> aVar = this.f30431e;
                if (aVar == null) {
                    aVar = new bc.a<>(4);
                    this.f30431e = aVar;
                }
                aVar.a(f.next(t10));
            }
        }
    }

    @Override // pb.d
    public boolean e(Object obj) {
        return f.acceptFull(obj, this.f30429c);
    }

    @Override // lb.k
    public void onComplete() {
        if (this.f30432f) {
            return;
        }
        synchronized (this) {
            if (this.f30432f) {
                return;
            }
            this.f30432f = true;
            if (!this.f30430d) {
                this.f30430d = true;
                this.f30429c.onComplete();
                return;
            }
            bc.a<Object> aVar = this.f30431e;
            if (aVar == null) {
                aVar = new bc.a<>(4);
                this.f30431e = aVar;
            }
            aVar.a(f.complete());
        }
    }

    @Override // lb.i
    public void t(k<? super T> kVar) {
        this.f30429c.c(kVar);
    }
}
