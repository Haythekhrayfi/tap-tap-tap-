package x1;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class a implements ThreadFactory {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicInteger f37377c = new AtomicInteger(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f37378d;

    public a(androidx.work.b bVar, boolean z10) {
        this.f37378d = z10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        StringBuilder sbA = defpackage.a.a(this.f37378d ? "WM.task-" : "androidx.work-");
        sbA.append(this.f37377c.incrementAndGet());
        return new Thread(runnable, sbA.toString());
    }
}
