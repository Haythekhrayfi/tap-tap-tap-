package yb;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends lb.l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f44849d = new g("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ThreadFactory f44850c;

    public e() {
        this(f44849d);
    }

    public e(ThreadFactory threadFactory) {
        this.f44850c = threadFactory;
    }

    @Override // lb.l
    public lb.l.c a() {
        return new f(this.f44850c);
    }
}
