package h2;

import androidx.work.impl.WorkDatabase;

/* JADX INFO: loaded from: classes.dex */
public class l implements Runnable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f30515f = x1.m.e("StopWorkRunnable");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y1.k f30516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f30517d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f30518e;

    public l(y1.k kVar, String str, boolean z10) {
        this.f30516c = kVar;
        this.f30517d = str;
        this.f30518e = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zContainsKey;
        boolean zJ;
        y1.k kVar = this.f30516c;
        WorkDatabase workDatabase = kVar.f38010c;
        y1.d dVar = kVar.f38013f;
        g2.q qVarV = workDatabase.v();
        workDatabase.c();
        try {
            String str = this.f30517d;
            synchronized (dVar.f37987m) {
                zContainsKey = dVar.f37982h.containsKey(str);
            }
            if (this.f30518e) {
                zJ = this.f30516c.f38013f.i(this.f30517d);
            } else {
                if (!zContainsKey) {
                    g2.r rVar = (g2.r) qVarV;
                    if (rVar.f(this.f30517d) == androidx.work.h.RUNNING) {
                        rVar.p(androidx.work.h.ENQUEUED, this.f30517d);
                    }
                }
                zJ = this.f30516c.f38013f.j(this.f30517d);
            }
            x1.m.c().a(f30515f, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.f30517d, Boolean.valueOf(zJ)), new Throwable[0]);
            workDatabase.p();
            workDatabase.g();
        } catch (Throwable th) {
            workDatabase.g();
            throw th;
        }
    }
}
