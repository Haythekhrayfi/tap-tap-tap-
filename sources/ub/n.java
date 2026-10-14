package ub;

import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class n<T> extends ub.a<T, T> {

    public static final class a<T> extends AtomicLong implements lb.f<T>, me.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final me.b<? super T> f36330c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public me.c f36331d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f36332e;

        public a(me.b<? super T> bVar) {
            this.f36330c = bVar;
        }

        @Override // me.b
        public void a(Throwable th) {
            if (this.f36332e) {
                dc.a.b(th);
            } else {
                this.f36332e = true;
                this.f36330c.a(th);
            }
        }

        @Override // lb.f, me.b
        public void c(me.c cVar) {
            if (ac.g.validate(this.f36331d, cVar)) {
                this.f36331d = cVar;
                this.f36330c.c(this);
                cVar.request(RecyclerView.FOREVER_NS);
            }
        }

        @Override // me.c
        public void cancel() {
            this.f36331d.cancel();
        }

        @Override // me.b
        public void d(T t10) {
            if (this.f36332e) {
                return;
            }
            if (get() != 0) {
                this.f36330c.d(t10);
                h9.d.m(this, 1L);
            } else {
                this.f36331d.cancel();
                a(new ob.b("could not emit value due to lack of requests"));
            }
        }

        @Override // me.b
        public void onComplete() {
            if (this.f36332e) {
                return;
            }
            this.f36332e = true;
            this.f36330c.onComplete();
        }

        @Override // me.c
        public void request(long j10) {
            if (ac.g.validate(j10)) {
                h9.d.a(this, j10);
            }
        }
    }

    public n(lb.c<T> cVar) {
        super(cVar);
    }

    @Override // lb.c
    public void h(me.b<? super T> bVar) {
        this.f36195d.g(new a(bVar));
    }
}
