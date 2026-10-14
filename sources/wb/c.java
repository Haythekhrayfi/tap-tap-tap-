package wb;

import lb.n;
import lb.o;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class c<T> extends lb.m<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o<T> f37261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pb.b<? super Throwable> f37262b;

    public final class a implements n<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final n<? super T> f37263c;

        public a(n<? super T> nVar) {
            this.f37263c = nVar;
        }

        @Override // lb.n
        public void a(Throwable th) {
            try {
                c.this.f37262b.accept(th);
            } catch (Throwable th2) {
                c0.Q(th2);
                th = new ob.a(th, th2);
            }
            this.f37263c.a(th);
        }

        @Override // lb.n
        public void b(nb.b bVar) {
            this.f37263c.b(bVar);
        }

        @Override // lb.n
        public void onSuccess(T t10) {
            this.f37263c.onSuccess(t10);
        }
    }

    public c(o<T> oVar, pb.b<? super Throwable> bVar) {
        this.f37261a = oVar;
        this.f37262b = bVar;
    }

    @Override // lb.m
    public void m(n<? super T> nVar) {
        this.f37261a.a(new a(nVar));
    }
}
