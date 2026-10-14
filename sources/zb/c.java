package zb;

import ac.g;
import java.util.concurrent.atomic.AtomicReference;
import lb.f;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class c<T> extends AtomicReference<me.c> implements f<T>, me.c, nb.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pb.b<? super T> f45264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pb.b<? super Throwable> f45265d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final pb.a f45266e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final pb.b<? super me.c> f45267f;

    public c(pb.b<? super T> bVar, pb.b<? super Throwable> bVar2, pb.a aVar, pb.b<? super me.c> bVar3) {
        this.f45264c = bVar;
        this.f45265d = bVar2;
        this.f45266e = aVar;
        this.f45267f = bVar3;
    }

    @Override // me.b
    public void a(Throwable th) {
        me.c cVar = get();
        g gVar = g.CANCELLED;
        if (cVar == gVar) {
            dc.a.b(th);
            return;
        }
        lazySet(gVar);
        try {
            this.f45265d.accept(th);
        } catch (Throwable th2) {
            c0.Q(th2);
            dc.a.b(new ob.a(th, th2));
        }
    }

    public boolean b() {
        return get() == g.CANCELLED;
    }

    @Override // lb.f, me.b
    public void c(me.c cVar) {
        if (g.setOnce(this, cVar)) {
            try {
                this.f45267f.accept(this);
            } catch (Throwable th) {
                c0.Q(th);
                cVar.cancel();
                a(th);
            }
        }
    }

    @Override // me.c
    public void cancel() {
        g.cancel(this);
    }

    @Override // me.b
    public void d(T t10) {
        if (b()) {
            return;
        }
        try {
            this.f45264c.accept(t10);
        } catch (Throwable th) {
            c0.Q(th);
            get().cancel();
            a(th);
        }
    }

    @Override // nb.b
    public void dispose() {
        g.cancel(this);
    }

    @Override // me.b
    public void onComplete() {
        me.c cVar = get();
        g gVar = g.CANCELLED;
        if (cVar != gVar) {
            lazySet(gVar);
            try {
                this.f45266e.run();
            } catch (Throwable th) {
                c0.Q(th);
                dc.a.b(th);
            }
        }
    }

    @Override // me.c
    public void request(long j10) {
        get().request(j10);
    }
}
