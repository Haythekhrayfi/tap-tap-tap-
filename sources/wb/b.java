package wb;

import java.util.Objects;
import java.util.concurrent.TimeUnit;
import lb.n;
import lb.o;

/* JADX INFO: loaded from: classes3.dex */
public final class b<T> extends lb.m<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o<? extends T> f37249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f37250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f37251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lb.l f37252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f37253e;

    public final class a implements n<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final qb.e f37254c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final n<? super T> f37255d;

        /* JADX INFO: renamed from: wb.b$a$a, reason: collision with other inner class name */
        public final class RunnableC0449a implements Runnable {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Throwable f37257c;

            public RunnableC0449a(Throwable th) {
                this.f37257c = th;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f37255d.a(this.f37257c);
            }
        }

        /* JADX INFO: renamed from: wb.b$a$b, reason: collision with other inner class name */
        public final class RunnableC0450b implements Runnable {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final T f37259c;

            public RunnableC0450b(T t10) {
                this.f37259c = t10;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f37255d.onSuccess(this.f37259c);
            }
        }

        public a(qb.e eVar, n<? super T> nVar) {
            this.f37254c = eVar;
            this.f37255d = nVar;
        }

        @Override // lb.n
        public void a(Throwable th) {
            qb.e eVar = this.f37254c;
            b bVar = b.this;
            nb.b bVarC = bVar.f37252d.c(new RunnableC0449a(th), bVar.f37253e ? bVar.f37250b : 0L, bVar.f37251c);
            Objects.requireNonNull(eVar);
            qb.b.replace(eVar, bVarC);
        }

        @Override // lb.n
        public void b(nb.b bVar) {
            qb.e eVar = this.f37254c;
            Objects.requireNonNull(eVar);
            qb.b.replace(eVar, bVar);
        }

        @Override // lb.n
        public void onSuccess(T t10) {
            qb.e eVar = this.f37254c;
            b bVar = b.this;
            nb.b bVarC = bVar.f37252d.c(new RunnableC0450b(t10), bVar.f37250b, bVar.f37251c);
            Objects.requireNonNull(eVar);
            qb.b.replace(eVar, bVarC);
        }
    }

    public b(o<? extends T> oVar, long j10, TimeUnit timeUnit, lb.l lVar, boolean z10) {
        this.f37249a = oVar;
        this.f37250b = j10;
        this.f37251c = timeUnit;
        this.f37252d = lVar;
        this.f37253e = z10;
    }

    @Override // lb.m
    public void m(n<? super T> nVar) {
        qb.e eVar = new qb.e();
        nVar.b(eVar);
        this.f37249a.a(new a(eVar, nVar));
    }
}
