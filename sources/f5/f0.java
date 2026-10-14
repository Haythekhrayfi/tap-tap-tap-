package f5;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public class f0 implements ThreadFactory {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f29269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicLong f29270d;

    public class a extends c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Runnable f29271c;

        public a(f0 f0Var, Runnable runnable) {
            this.f29271c = runnable;
        }

        @Override // f5.c
        public void a() {
            this.f29271c.run();
        }
    }

    public f0(String str, AtomicLong atomicLong) {
        this.f29269c = str;
        this.f29270d = atomicLong;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread threadNewThread = Executors.defaultThreadFactory().newThread(new a(this, runnable));
        threadNewThread.setName(this.f29269c + this.f29270d.getAndIncrement());
        return threadNewThread;
    }
}
