package j3;

import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ExecutorService {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f31699d = TimeUnit.SECONDS.toMillis(10);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile int f31700e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExecutorService f31701c;

    /* JADX INFO: renamed from: j3.a$a, reason: collision with other inner class name */
    public static final class ThreadFactoryC0319a implements ThreadFactory {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f31702c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final b f31703d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f31704e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f31705f;

        /* JADX INFO: renamed from: j3.a$a$a, reason: collision with other inner class name */
        public class C0320a extends Thread {
            public C0320a(Runnable runnable, String str) {
                super(runnable, str);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(9);
                if (ThreadFactoryC0319a.this.f31704e) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    super.run();
                } catch (Throwable th) {
                    ThreadFactoryC0319a.this.f31703d.a(th);
                }
            }
        }

        public ThreadFactoryC0319a(String str, b bVar, boolean z10) {
            this.f31702c = str;
            this.f31703d = bVar;
            this.f31704e = z10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            C0320a c0320a;
            c0320a = new C0320a(runnable, "glide-" + this.f31702c + "-thread-" + this.f31705f);
            this.f31705f = this.f31705f + 1;
            return c0320a;
        }
    }

    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f31707a = new C0321a();

        /* JADX INFO: renamed from: j3.a$b$a, reason: collision with other inner class name */
        public class C0321a implements b {
            @Override // j3.a.b
            public void a(Throwable th) {
                if (Log.isLoggable("GlideExecutor", 6)) {
                    Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                }
            }
        }

        void a(Throwable th);
    }

    public a(ExecutorService executorService) {
        this.f31701c = executorService;
    }

    public static int a() {
        if (f31700e == 0) {
            f31700e = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        return f31700e;
    }

    public static a b() {
        return new a(new ThreadPoolExecutor(0, a() >= 4 ? 2 : 1, f31699d, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new ThreadFactoryC0319a("animation", b.f31707a, true)));
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f31701c.awaitTermination(j10, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f31701c.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f31701c.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f31701c.invokeAll(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.f31701c.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.f31701c.invokeAny(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f31701c.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f31701c.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f31701c.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return this.f31701c.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.f31701c.submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t10) {
        return this.f31701c.submit(runnable, t10);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return this.f31701c.submit(callable);
    }

    public String toString() {
        return this.f31701c.toString();
    }
}
