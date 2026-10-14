package tb;

import java.util.concurrent.atomic.AtomicReference;
import lb.k;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class g<T> extends AtomicReference<nb.b> implements k<T>, nb.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pb.b<? super T> f35889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pb.b<? super Throwable> f35890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final pb.a f35891e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final pb.b<? super nb.b> f35892f;

    public g(pb.b<? super T> bVar, pb.b<? super Throwable> bVar2, pb.a aVar, pb.b<? super nb.b> bVar3) {
        this.f35889c = bVar;
        this.f35890d = bVar2;
        this.f35891e = aVar;
        this.f35892f = bVar3;
    }

    @Override // lb.k
    public void a(Throwable th) {
        if (c()) {
            dc.a.b(th);
            return;
        }
        lazySet(qb.b.DISPOSED);
        try {
            this.f35890d.accept(th);
        } catch (Throwable th2) {
            c0.Q(th2);
            dc.a.b(new ob.a(th, th2));
        }
    }

    @Override // lb.k
    public void b(nb.b bVar) {
        if (qb.b.setOnce(this, bVar)) {
            try {
                this.f35892f.accept(this);
            } catch (Throwable th) {
                c0.Q(th);
                bVar.dispose();
                a(th);
            }
        }
    }

    public boolean c() {
        return get() == qb.b.DISPOSED;
    }

    @Override // lb.k
    public void d(T t10) {
        if (c()) {
            return;
        }
        try {
            this.f35889c.accept(t10);
        } catch (Throwable th) {
            c0.Q(th);
            get().dispose();
            a(th);
        }
    }

    @Override // nb.b
    public void dispose() {
        qb.b.dispose(this);
    }

    @Override // lb.k
    public void onComplete() {
        if (c()) {
            return;
        }
        lazySet(qb.b.DISPOSED);
        try {
            this.f35891e.run();
        } catch (Throwable th) {
            c0.Q(th);
            dc.a.b(th);
        }
    }
}
