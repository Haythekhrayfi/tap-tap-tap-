package tb;

import java.util.concurrent.atomic.AtomicReference;
import lb.n;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class d<T> extends AtomicReference<nb.b> implements n<T>, nb.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pb.b<? super T> f35881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pb.b<? super Throwable> f35882d;

    public d(pb.b<? super T> bVar, pb.b<? super Throwable> bVar2) {
        this.f35881c = bVar;
        this.f35882d = bVar2;
    }

    @Override // lb.n
    public void a(Throwable th) {
        lazySet(qb.b.DISPOSED);
        try {
            this.f35882d.accept(th);
        } catch (Throwable th2) {
            c0.Q(th2);
            dc.a.b(new ob.a(th, th2));
        }
    }

    @Override // lb.n
    public void b(nb.b bVar) {
        qb.b.setOnce(this, bVar);
    }

    @Override // nb.b
    public void dispose() {
        qb.b.dispose(this);
    }

    @Override // lb.n
    public void onSuccess(T t10) {
        lazySet(qb.b.DISPOSED);
        try {
            this.f35881c.accept(t10);
        } catch (Throwable th) {
            c0.Q(th);
            dc.a.b(th);
        }
    }
}
