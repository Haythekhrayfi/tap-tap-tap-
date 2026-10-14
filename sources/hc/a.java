package hc;

import ac.g;
import lb.f;
import me.b;
import me.c;

/* JADX INFO: loaded from: classes3.dex */
public final class a<T> implements f<T>, c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b<? super T> f31065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f31066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f31067e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f31068f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public bc.a<Object> f31069g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f31070h;

    public a(b<? super T> bVar) {
        this(bVar, false);
    }

    public a(b<? super T> bVar, boolean z10) {
        this.f31065c = bVar;
        this.f31066d = z10;
    }

    @Override // me.b
    public void a(Throwable th) {
        if (this.f31070h) {
            dc.a.b(th);
            return;
        }
        synchronized (this) {
            boolean z10 = true;
            if (!this.f31070h) {
                if (this.f31068f) {
                    this.f31070h = true;
                    bc.a<Object> aVar = this.f31069g;
                    if (aVar == null) {
                        aVar = new bc.a<>(4);
                        this.f31069g = aVar;
                    }
                    Object objError = bc.f.error(th);
                    if (this.f31066d) {
                        aVar.a(objError);
                    } else {
                        aVar.b(objError);
                    }
                    return;
                }
                this.f31070h = true;
                this.f31068f = true;
                z10 = false;
            }
            if (z10) {
                dc.a.b(th);
            } else {
                this.f31065c.a(th);
            }
        }
    }

    @Override // lb.f, me.b
    public void c(c cVar) {
        if (g.validate(this.f31067e, cVar)) {
            this.f31067e = cVar;
            this.f31065c.c(this);
        }
    }

    @Override // me.c
    public void cancel() {
        this.f31067e.cancel();
    }

    @Override // me.b
    public void d(T t10) {
        boolean z10;
        if (this.f31070h) {
            return;
        }
        if (t10 == null) {
            this.f31067e.cancel();
            a(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            if (this.f31070h) {
                return;
            }
            if (this.f31068f) {
                bc.a<Object> aVar = this.f31069g;
                if (aVar == null) {
                    aVar = new bc.a<>(4);
                    this.f31069g = aVar;
                }
                aVar.a(bc.f.next(t10));
                return;
            }
            this.f31068f = true;
            this.f31065c.d(t10);
            do {
                synchronized (this) {
                    bc.a<Object> aVar2 = this.f31069g;
                    z10 = false;
                    if (aVar2 == null) {
                        this.f31068f = false;
                        return;
                    }
                    this.f31069g = null;
                    b<? super T> bVar = this.f31065c;
                    int i10 = aVar2.f3501a;
                    for (Object[] objArr = aVar2.f3502b; objArr != null; objArr = objArr[i10]) {
                        for (int i11 = 0; i11 < i10; i11++) {
                            Object[] objArr2 = objArr[i11];
                            if (objArr2 == null) {
                                break;
                            }
                            if (bc.f.acceptFull(objArr2, bVar)) {
                                z10 = true;
                                break;
                            }
                        }
                    }
                }
            } while (!z10);
        }
    }

    @Override // me.b
    public void onComplete() {
        if (this.f31070h) {
            return;
        }
        synchronized (this) {
            if (this.f31070h) {
                return;
            }
            if (!this.f31068f) {
                this.f31070h = true;
                this.f31068f = true;
                this.f31065c.onComplete();
            } else {
                bc.a<Object> aVar = this.f31069g;
                if (aVar == null) {
                    aVar = new bc.a<>(4);
                    this.f31069g = aVar;
                }
                aVar.a(bc.f.complete());
            }
        }
    }

    @Override // me.c
    public void request(long j10) {
        this.f31067e.request(j10);
    }
}
