package ld;

import fd.b1;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public class f extends b1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f33095e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f33096f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f33097g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f33098h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f33099i;

    public f() {
        this(0, 0, 0L, null, 15, null);
    }

    public f(int i10, int i11, long j10, String str) {
        this.f33095e = i10;
        this.f33096f = i11;
        this.f33097g = j10;
        this.f33098h = str;
        this.f33099i = new a(i10, i11, j10, str);
    }

    public /* synthetic */ f(int i10, int i11, long j10, String str, int i12, vc.g gVar) {
        this((i12 & 1) != 0 ? l.f33105b : i10, (i12 & 2) != 0 ? l.f33106c : i11, (i12 & 4) != 0 ? l.f33107d : j10, (i12 & 8) != 0 ? "CoroutineScheduler" : str);
    }

    @Override // fd.c0
    public void c0(mc.f fVar, Runnable runnable) {
        a aVar = this.f33099i;
        AtomicLongFieldUpdater atomicLongFieldUpdater = a.f33071j;
        aVar.c(runnable, l.f33109f, false);
    }

    public void close() throws InterruptedException {
        this.f33099i.close();
    }
}
