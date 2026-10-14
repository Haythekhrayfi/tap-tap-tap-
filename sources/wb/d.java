package wb;

import lb.n;
import lb.o;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class d<T> extends lb.m<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o<T> f37265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pb.b<? super T> f37266b;

    public final class a implements n<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final n<? super T> f37267c;

        public a(n<? super T> nVar) {
            this.f37267c = nVar;
        }

        @Override // lb.n
        public void a(Throwable th) {
            this.f37267c.a(th);
        }

        @Override // lb.n
        public void b(nb.b bVar) {
            this.f37267c.b(bVar);
        }

        @Override // lb.n
        public void onSuccess(T t10) {
            try {
                d.this.f37266b.accept(t10);
                this.f37267c.onSuccess(t10);
            } catch (Throwable th) {
                c0.Q(th);
                this.f37267c.a(th);
            }
        }
    }

    public d(o<T> oVar, pb.b<? super T> bVar) {
        this.f37265a = oVar;
        this.f37266b = bVar;
    }

    @Override // lb.m
    public void m(n<? super T> nVar) {
        this.f37265a.a(new a(nVar));
    }
}
