package x1;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fd.i<Object> f37406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t4.a<Object> f37407d;

    public k(fd.i<Object> iVar, t4.a<Object> aVar) {
        this.f37406c = iVar;
        this.f37407d = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            fd.i<Object> iVar = this.f37406c;
            Object obj = this.f37407d.get();
            jc.i.a aVar = jc.i.f31813c;
            iVar.resumeWith(obj);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                cause = th;
            }
            if (th instanceof CancellationException) {
                this.f37406c.x(cause);
                return;
            }
            fd.i<Object> iVar2 = this.f37406c;
            jc.i.a aVar2 = jc.i.f31813c;
            iVar2.resumeWith(h9.d.f(cause));
        }
    }
}
