package vb;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class s<T> extends vb.a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f36949d;

    public static final class a<T> extends AtomicInteger implements lb.k<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final lb.k<? super T> f36950c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final qb.e f36951d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final lb.j<? extends T> f36952e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f36953f;

        public a(lb.k<? super T> kVar, long j10, qb.e eVar, lb.j<? extends T> jVar) {
            this.f36950c = kVar;
            this.f36951d = eVar;
            this.f36952e = jVar;
            this.f36953f = j10;
        }

        @Override // lb.k
        public void a(Throwable th) {
            this.f36950c.a(th);
        }

        @Override // lb.k
        public void b(nb.b bVar) {
            qb.e eVar = this.f36951d;
            Objects.requireNonNull(eVar);
            qb.b.replace(eVar, bVar);
        }

        public void c() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f36951d.a()) {
                    this.f36952e.c(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // lb.k
        public void d(T t10) {
            this.f36950c.d(t10);
        }

        @Override // lb.k
        public void onComplete() {
            long j10 = this.f36953f;
            if (j10 != RecyclerView.FOREVER_NS) {
                this.f36953f = j10 - 1;
            }
            if (j10 != 0) {
                c();
            } else {
                this.f36950c.onComplete();
            }
        }
    }

    public s(lb.i<T> iVar, long j10) {
        super(iVar);
        this.f36949d = j10;
    }

    @Override // lb.i
    public void t(lb.k<? super T> kVar) {
        qb.e eVar = new qb.e();
        kVar.b(eVar);
        long j10 = this.f36949d;
        long j11 = RecyclerView.FOREVER_NS;
        if (j10 != RecyclerView.FOREVER_NS) {
            j11 = j10 - 1;
        }
        new a(kVar, j11, eVar, this.f36794c).c();
    }
}
