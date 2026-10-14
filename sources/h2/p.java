package h2;

import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class p implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ UUID f30540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.work.c f30541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i2.d f30542e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q f30543f;

    public p(q qVar, UUID uuid, androidx.work.c cVar, i2.d dVar) {
        this.f30543f = qVar;
        this.f30540c = uuid;
        this.f30541d = cVar;
        this.f30542e = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        String string = this.f30540c.toString();
        x1.m mVarC = x1.m.c();
        String str = q.f30544c;
        mVarC.a(str, String.format("Updating progress for %s (%s)", this.f30540c, this.f30541d), new Throwable[0]);
        this.f30543f.f30545a.c();
        try {
            g2.p pVarI = ((g2.r) this.f30543f.f30545a.v()).i(string);
            if (pVarI == null) {
                throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
            }
            if (pVarI.f29741b == androidx.work.h.RUNNING) {
                g2.m mVar = new g2.m(string, this.f30541d);
                g2.o oVar = (g2.o) this.f30543f.f30545a.u();
                oVar.f29735a.b();
                oVar.f29735a.c();
                try {
                    oVar.f29736b.e(mVar);
                    oVar.f29735a.p();
                    oVar.f29735a.g();
                } catch (Throwable th) {
                    oVar.f29735a.g();
                    throw th;
                }
            } else {
                x1.m.c().g(str, String.format("Ignoring setProgressAsync(...). WorkSpec (%s) is not in a RUNNING state.", string), new Throwable[0]);
            }
            this.f30542e.j(null);
            this.f30543f.f30545a.p();
        } catch (Throwable th2) {
            try {
                x1.m.c().b(q.f30544c, "Error updating Worker progress", th2);
                this.f30542e.k(th2);
            } finally {
                this.f30543f.f30545a.g();
            }
        }
    }
}
