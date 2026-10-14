package wb;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import lb.n;
import lb.o;

/* JADX INFO: loaded from: classes3.dex */
public final class k<T> extends lb.m<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o<? extends T> f37292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lb.l f37293b;

    public static final class a<T> extends AtomicReference<nb.b> implements n<T>, nb.b, Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final n<? super T> f37294c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final qb.e f37295d = new qb.e();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final o<? extends T> f37296e;

        public a(n<? super T> nVar, o<? extends T> oVar) {
            this.f37294c = nVar;
            this.f37296e = oVar;
        }

        @Override // lb.n
        public void a(Throwable th) {
            this.f37294c.a(th);
        }

        @Override // lb.n
        public void b(nb.b bVar) {
            qb.b.setOnce(this, bVar);
        }

        @Override // nb.b
        public void dispose() {
            qb.b.dispose(this);
            qb.e eVar = this.f37295d;
            Objects.requireNonNull(eVar);
            qb.b.dispose(eVar);
        }

        @Override // lb.n
        public void onSuccess(T t10) {
            this.f37294c.onSuccess(t10);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f37296e.a(this);
        }
    }

    public k(o<? extends T> oVar, lb.l lVar) {
        this.f37292a = oVar;
        this.f37293b = lVar;
    }

    @Override // lb.m
    public void m(n<? super T> nVar) {
        a aVar = new a(nVar, this.f37292a);
        nVar.b(aVar);
        nb.b bVarB = this.f37293b.b(aVar);
        qb.e eVar = aVar.f37295d;
        Objects.requireNonNull(eVar);
        qb.b.replace(eVar, bVarB);
    }
}
