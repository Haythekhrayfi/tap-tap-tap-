package k;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f31889a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f31890b = Executors.newFixedThreadPool(4, new a(this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Handler f31891c;

    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicInteger f31892c = new AtomicInteger(0);

        public a(b bVar) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", Integer.valueOf(this.f31892c.getAndIncrement())));
            return thread;
        }
    }

    public static Handler d(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Handler.createAsync(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    @Override // k.c
    public void a(Runnable runnable) {
        this.f31890b.execute(runnable);
    }

    @Override // k.c
    public boolean b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // k.c
    public void c(Runnable runnable) {
        if (this.f31891c == null) {
            synchronized (this.f31889a) {
                if (this.f31891c == null) {
                    this.f31891c = d(Looper.getMainLooper());
                }
            }
        }
        this.f31891c.post(runnable);
    }
}
