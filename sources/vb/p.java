package vb;

import java.util.Objects;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class p<T, U> extends vb.a<T, U> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pb.c<? super T, ? extends U> f36929d;

    public static final class a<T, U> extends tb.a<T, U> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final pb.c<? super T, ? extends U> f36930h;

        public a(lb.k<? super U> kVar, pb.c<? super T, ? extends U> cVar) {
            super(kVar);
            this.f36930h = cVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // lb.k
        public void d(T t10) {
            if (this.f35879f) {
                return;
            }
            if (this.f35880g != 0) {
                this.f35876c.d(null);
                return;
            }
            try {
                U uApply = this.f36930h.apply(t10);
                Objects.requireNonNull(uApply, "The mapper function returned a null value.");
                this.f35876c.d((Object) uApply);
            } catch (Throwable th) {
                c0.Q(th);
                this.f35877d.dispose();
                a(th);
            }
        }

        @Override // sb.i
        public U poll() throws Exception {
            T tPoll = this.f35878e.poll();
            if (tPoll == null) {
                return null;
            }
            U uApply = this.f36930h.apply(tPoll);
            Objects.requireNonNull(uApply, "The mapper function returned a null value.");
            return uApply;
        }

        @Override // sb.e
        public int requestFusion(int i10) {
            return c(i10);
        }
    }

    public p(lb.j<T> jVar, pb.c<? super T, ? extends U> cVar) {
        super(jVar);
        this.f36929d = cVar;
    }

    @Override // lb.i
    public void t(lb.k<? super U> kVar) {
        this.f36794c.c(new a(kVar, this.f36929d));
    }
}
