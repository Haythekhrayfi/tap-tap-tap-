package wb;

import java.util.Objects;
import lb.n;
import lb.o;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class h<T, R> extends lb.m<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o<? extends T> f37277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pb.c<? super T, ? extends R> f37278b;

    public static final class a<T, R> implements n<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final n<? super R> f37279c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final pb.c<? super T, ? extends R> f37280d;

        public a(n<? super R> nVar, pb.c<? super T, ? extends R> cVar) {
            this.f37279c = nVar;
            this.f37280d = cVar;
        }

        @Override // lb.n
        public void a(Throwable th) {
            this.f37279c.a(th);
        }

        @Override // lb.n
        public void b(nb.b bVar) {
            this.f37279c.b(bVar);
        }

        @Override // lb.n
        public void onSuccess(T t10) {
            try {
                R rApply = this.f37280d.apply(t10);
                Objects.requireNonNull(rApply, "The mapper function returned a null value.");
                this.f37279c.onSuccess(rApply);
            } catch (Throwable th) {
                c0.Q(th);
                a(th);
            }
        }
    }

    public h(o<? extends T> oVar, pb.c<? super T, ? extends R> cVar) {
        this.f37277a = oVar;
        this.f37278b = cVar;
    }

    @Override // lb.m
    public void m(n<? super R> nVar) {
        this.f37277a.a(new a(nVar, this.f37278b));
    }
}
