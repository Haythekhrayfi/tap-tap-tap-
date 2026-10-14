package f2;

import androidx.work.impl.WorkDatabase;
import g2.p;
import g2.r;

/* JADX INFO: loaded from: classes.dex */
public class b implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WorkDatabase f29207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f29208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.work.impl.foreground.a f29209e;

    public b(androidx.work.impl.foreground.a aVar, WorkDatabase workDatabase, String str) {
        this.f29209e = aVar;
        this.f29207c = workDatabase;
        this.f29208d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        p pVarI = ((r) this.f29207c.v()).i(this.f29208d);
        if (pVarI == null || !pVarI.b()) {
            return;
        }
        synchronized (this.f29209e.f3202f) {
            this.f29209e.f3205i.put(this.f29208d, pVarI);
            this.f29209e.f3206j.add(pVarI);
            androidx.work.impl.foreground.a aVar = this.f29209e;
            aVar.f3207k.b(aVar.f3206j);
        }
    }
}
