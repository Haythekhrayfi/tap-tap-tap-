package ub;

import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicLong;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class m<T> extends ub.a<T, T> implements pb.b<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final pb.b<? super T> f36325e;

    public static final class a<T> extends AtomicLong implements lb.f<T>, me.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final me.b<? super T> f36326c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final pb.b<? super T> f36327d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public me.c f36328e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f36329f;

        public a(me.b<? super T> bVar, pb.b<? super T> bVar2) {
            this.f36326c = bVar;
            this.f36327d = bVar2;
        }

        @Override // me.b
        public void a(Throwable th) {
            if (this.f36329f) {
                dc.a.b(th);
            } else {
                this.f36329f = true;
                this.f36326c.a(th);
            }
        }

        @Override // lb.f, me.b
        public void c(me.c cVar) {
            if (ac.g.validate(this.f36328e, cVar)) {
                this.f36328e = cVar;
                this.f36326c.c(this);
                cVar.request(RecyclerView.FOREVER_NS);
            }
        }

        @Override // me.c
        public void cancel() {
            this.f36328e.cancel();
        }

        @Override // me.b
        public void d(T t10) {
            if (this.f36329f) {
                return;
            }
            if (get() != 0) {
                this.f36326c.d(t10);
                h9.d.m(this, 1L);
                return;
            }
            try {
                this.f36327d.accept(t10);
            } catch (Throwable th) {
                c0.Q(th);
                cancel();
                a(th);
            }
        }

        @Override // me.b
        public void onComplete() {
            if (this.f36329f) {
                return;
            }
            this.f36329f = true;
            this.f36326c.onComplete();
        }

        @Override // me.c
        public void request(long j10) {
            if (ac.g.validate(j10)) {
                h9.d.a(this, j10);
            }
        }
    }

    public m(lb.c<T> cVar) {
        super(cVar);
        this.f36325e = this;
    }

    public m(lb.c<T> cVar, pb.b<? super T> bVar) {
        super(cVar);
        this.f36325e = bVar;
    }

    @Override // pb.b
    public void accept(T t10) {
    }

    @Override // lb.c
    public void h(me.b<? super T> bVar) {
        this.f36195d.g(new a(bVar, this.f36325e));
    }
}
