package vb;

import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class j<T> extends vb.a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pb.d<? super T> f36885d;

    public static final class a<T> extends tb.a<T, T> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final pb.d<? super T> f36886h;

        public a(lb.k<? super T> kVar, pb.d<? super T> dVar) {
            super(kVar);
            this.f36886h = dVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // lb.k
        public void d(T t10) {
            if (this.f35880g != 0) {
                this.f35876c.d(null);
                return;
            }
            try {
                if (this.f36886h.e(t10)) {
                    this.f35876c.d((Object) t10);
                }
            } catch (Throwable th) {
                c0.Q(th);
                this.f35877d.dispose();
                a(th);
            }
        }

        @Override // sb.i
        public T poll() throws Exception {
            T tPoll;
            do {
                tPoll = this.f35878e.poll();
                if (tPoll == null) {
                    break;
                }
            } while (!this.f36886h.e(tPoll));
            return tPoll;
        }

        @Override // sb.e
        public int requestFusion(int i10) {
            return c(i10);
        }
    }

    public j(lb.j<T> jVar, pb.d<? super T> dVar) {
        super(jVar);
        this.f36885d = dVar;
    }

    @Override // lb.i
    public void t(lb.k<? super T> kVar) {
        this.f36794c.c(new a(kVar, this.f36885d));
    }
}
