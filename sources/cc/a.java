package cc;

import bc.f;
import lb.k;
import nb.b;

/* JADX INFO: loaded from: classes3.dex */
public final class a<T> implements k<T>, b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k<? super T> f3673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f3674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f3675e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3676f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public bc.a<Object> f3677g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f3678h;

    public a(k<? super T> kVar) {
        this(kVar, false);
    }

    public a(k<? super T> kVar, boolean z10) {
        this.f3673c = kVar;
        this.f3674d = z10;
    }

    @Override // lb.k
    public void a(Throwable th) {
        if (this.f3678h) {
            dc.a.b(th);
            return;
        }
        synchronized (this) {
            boolean z10 = true;
            if (!this.f3678h) {
                if (this.f3676f) {
                    this.f3678h = true;
                    bc.a<Object> aVar = this.f3677g;
                    if (aVar == null) {
                        aVar = new bc.a<>(4);
                        this.f3677g = aVar;
                    }
                    Object objError = f.error(th);
                    if (this.f3674d) {
                        aVar.a(objError);
                    } else {
                        aVar.b(objError);
                    }
                    return;
                }
                this.f3678h = true;
                this.f3676f = true;
                z10 = false;
            }
            if (z10) {
                dc.a.b(th);
            } else {
                this.f3673c.a(th);
            }
        }
    }

    @Override // lb.k
    public void b(b bVar) {
        if (qb.b.validate(this.f3675e, bVar)) {
            this.f3675e = bVar;
            this.f3673c.b(this);
        }
    }

    @Override // lb.k
    public void d(T t10) {
        boolean z10;
        if (this.f3678h) {
            return;
        }
        if (t10 == null) {
            this.f3675e.dispose();
            a(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            if (this.f3678h) {
                return;
            }
            if (this.f3676f) {
                bc.a<Object> aVar = this.f3677g;
                if (aVar == null) {
                    aVar = new bc.a<>(4);
                    this.f3677g = aVar;
                }
                aVar.a(f.next(t10));
                return;
            }
            this.f3676f = true;
            this.f3673c.d(t10);
            do {
                synchronized (this) {
                    bc.a<Object> aVar2 = this.f3677g;
                    z10 = false;
                    if (aVar2 == null) {
                        this.f3676f = false;
                        return;
                    }
                    this.f3677g = null;
                    k<? super T> kVar = this.f3673c;
                    int i10 = aVar2.f3501a;
                    for (Object[] objArr = aVar2.f3502b; objArr != null; objArr = objArr[i10]) {
                        for (int i11 = 0; i11 < i10; i11++) {
                            Object[] objArr2 = objArr[i11];
                            if (objArr2 == null) {
                                break;
                            }
                            if (f.acceptFull(objArr2, kVar)) {
                                z10 = true;
                                break;
                            }
                        }
                    }
                }
            } while (!z10);
        }
    }

    @Override // nb.b
    public void dispose() {
        this.f3675e.dispose();
    }

    @Override // lb.k
    public void onComplete() {
        if (this.f3678h) {
            return;
        }
        synchronized (this) {
            if (this.f3678h) {
                return;
            }
            if (!this.f3676f) {
                this.f3678h = true;
                this.f3676f = true;
                this.f3673c.onComplete();
            } else {
                bc.a<Object> aVar = this.f3677g;
                if (aVar == null) {
                    aVar = new bc.a<>(4);
                    this.f3677g = aVar;
                }
                aVar.a(f.complete());
            }
        }
    }
}
