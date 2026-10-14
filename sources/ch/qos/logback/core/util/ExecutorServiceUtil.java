package ch.qos.logback.core.util;

import ch.qos.logback.core.CoreConstants;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class ExecutorServiceUtil {
    private static final ThreadFactory THREAD_FACTORY = new a();

    public static class a implements ThreadFactory {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ThreadFactory f3741c = Executors.defaultThreadFactory();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicInteger f3742d = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = this.f3741c.newThread(runnable);
            if (!threadNewThread.isDaemon()) {
                threadNewThread.setDaemon(true);
            }
            StringBuilder sbA = defpackage.a.a("logback-");
            sbA.append(this.f3742d.getAndIncrement());
            threadNewThread.setName(sbA.toString());
            return threadNewThread;
        }
    }

    public static ExecutorService newExecutorService() {
        return new ThreadPoolExecutor(CoreConstants.CORE_POOL_SIZE, 32, 0L, TimeUnit.MILLISECONDS, new SynchronousQueue(), THREAD_FACTORY);
    }

    public static ScheduledExecutorService newScheduledExecutorService() {
        return new ScheduledThreadPoolExecutor(2, THREAD_FACTORY);
    }

    public static void shutdown(ExecutorService executorService) {
        executorService.shutdownNow();
    }
}
