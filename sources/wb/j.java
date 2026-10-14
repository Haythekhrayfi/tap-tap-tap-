package wb;

import lb.n;
import lb.o;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class j<T> extends lb.m<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o<? extends T> f37287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pb.c<? super Throwable, ? extends T> f37288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T f37289c;

    public final class a implements n<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final n<? super T> f37290c;

        public a(n<? super T> nVar) {
            this.f37290c = nVar;
        }

        @Override // lb.n
        public void a(Throwable th) {
            T tApply;
            j jVar = j.this;
            pb.c<? super Throwable, ? extends T> cVar = jVar.f37288b;
            if (cVar != null) {
                try {
                    tApply = cVar.apply(th);
                } catch (Throwable th2) {
                    c0.Q(th2);
                    this.f37290c.a(new ob.a(th, th2));
                    return;
                }
            } else {
                tApply = jVar.f37289c;
            }
            if (tApply != null) {
                this.f37290c.onSuccess(tApply);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
            nullPointerException.initCause(th);
            this.f37290c.a(nullPointerException);
        }

        @Override // lb.n
        public void b(nb.b bVar) {
            this.f37290c.b(bVar);
        }

        @Override // lb.n
        public void onSuccess(T t10) {
            this.f37290c.onSuccess(t10);
        }
    }

    public j(o<? extends T> oVar, pb.c<? super Throwable, ? extends T> cVar, T t10) {
        this.f37287a = oVar;
        this.f37288b = cVar;
        this.f37289c = t10;
    }

    @Override // lb.m
    public void m(n<? super T> nVar) {
        this.f37287a.a(new a(nVar));
    }
}
