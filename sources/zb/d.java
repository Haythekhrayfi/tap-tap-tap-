package zb;

import ac.g;
import bc.e;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import lb.f;

/* JADX INFO: loaded from: classes3.dex */
public class d<T> extends AtomicInteger implements f<T>, me.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final me.b<? super T> f45268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bc.c f45269d = new bc.c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicLong f45270e = new AtomicLong();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReference<me.c> f45271f = new AtomicReference<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f45272g = new AtomicBoolean();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f45273h;

    public d(me.b<? super T> bVar) {
        this.f45268c = bVar;
    }

    @Override // me.b
    public void a(Throwable th) {
        this.f45273h = true;
        me.b<? super T> bVar = this.f45268c;
        bc.c cVar = this.f45269d;
        if (!e.a(cVar, th)) {
            dc.a.b(th);
        } else if (getAndIncrement() == 0) {
            bVar.a(e.b(cVar));
        }
    }

    @Override // lb.f, me.b
    public void c(me.c cVar) {
        if (this.f45272g.compareAndSet(false, true)) {
            this.f45268c.c(this);
            g.deferredSetOnce(this.f45271f, this.f45270e, cVar);
        } else {
            cVar.cancel();
            cancel();
            a(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
        }
    }

    @Override // me.c
    public void cancel() {
        if (this.f45273h) {
            return;
        }
        g.cancel(this.f45271f);
    }

    @Override // me.b
    public void d(T t10) {
        me.b<? super T> bVar = this.f45268c;
        bc.c cVar = this.f45269d;
        if (get() == 0 && compareAndSet(0, 1)) {
            bVar.d(t10);
            if (decrementAndGet() != 0) {
                Throwable thB = e.b(cVar);
                if (thB != null) {
                    bVar.a(thB);
                } else {
                    bVar.onComplete();
                }
            }
        }
    }

    @Override // me.b
    public void onComplete() {
        this.f45273h = true;
        me.b<? super T> bVar = this.f45268c;
        bc.c cVar = this.f45269d;
        if (getAndIncrement() == 0) {
            Throwable thB = e.b(cVar);
            if (thB != null) {
                bVar.a(thB);
            } else {
                bVar.onComplete();
            }
        }
    }

    @Override // me.c
    public void request(long j10) {
        if (j10 > 0) {
            g.deferredRequest(this.f45271f, this.f45270e, j10);
        } else {
            cancel();
            a(new IllegalArgumentException(androidx.viewpager2.adapter.a.a("§3.9 violated: positive request amount required but it was ", j10)));
        }
    }
}
