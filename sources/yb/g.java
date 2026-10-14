package yb;

import ch.qos.logback.core.CoreConstants;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends AtomicLong implements ThreadFactory {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f44853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f44854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f44855e;

    public static final class a extends Thread {
        public a(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    public g(String str) {
        this(str, 5, false);
    }

    public g(String str, int i10) {
        this(str, i10, false);
    }

    public g(String str, int i10, boolean z10) {
        this.f44853c = str;
        this.f44854d = i10;
        this.f44855e = z10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        String str = this.f44853c + CoreConstants.DASH_CHAR + incrementAndGet();
        Thread aVar = this.f44855e ? new a(runnable, str) : new Thread(runnable, str);
        aVar.setPriority(this.f44854d);
        aVar.setDaemon(true);
        return aVar;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public String toString() {
        return androidx.activity.k.a(defpackage.a.a("RxThreadFactory["), this.f44853c, "]");
    }
}
