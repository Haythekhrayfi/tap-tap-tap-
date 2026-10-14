package g3;

import android.os.Process;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f29777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f29778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<d3.c, b> f29779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ReferenceQueue<p<?>> f29780d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p.a f29781e;

    /* JADX INFO: renamed from: g3.a$a, reason: collision with other inner class name */
    public class ThreadFactoryC0266a implements ThreadFactory {

        /* JADX INFO: renamed from: g3.a$a$a, reason: collision with other inner class name */
        public class RunnableC0267a implements Runnable {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Runnable f29782c;

            public RunnableC0267a(ThreadFactoryC0266a threadFactoryC0266a, Runnable runnable) {
                this.f29782c = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(10);
                this.f29782c.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(new RunnableC0267a(this, runnable), "glide-active-resources");
        }
    }

    public static final class b extends WeakReference<p<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d3.c f29783a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f29784b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public u<?> f29785c;

        public b(d3.c cVar, p<?> pVar, ReferenceQueue<? super p<?>> referenceQueue, boolean z10) {
            u<?> uVar;
            super(pVar, referenceQueue);
            Objects.requireNonNull(cVar, "Argument must not be null");
            this.f29783a = cVar;
            if (pVar.f29927c && z10) {
                uVar = pVar.f29929e;
                Objects.requireNonNull(uVar, "Argument must not be null");
            } else {
                uVar = null;
            }
            this.f29785c = uVar;
            this.f29784b = pVar.f29927c;
        }
    }

    public a(boolean z10) {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC0266a());
        this.f29779c = new HashMap();
        this.f29780d = new ReferenceQueue<>();
        this.f29777a = z10;
        this.f29778b = executorServiceNewSingleThreadExecutor;
        executorServiceNewSingleThreadExecutor.execute(new g3.b(this));
    }

    public synchronized void a(d3.c cVar, p<?> pVar) {
        b bVarPut = this.f29779c.put(cVar, new b(cVar, pVar, this.f29780d, this.f29777a));
        if (bVarPut != null) {
            bVarPut.f29785c = null;
            bVarPut.clear();
        }
    }

    public void b(b bVar) {
        u<?> uVar;
        synchronized (this.f29781e) {
            synchronized (this) {
                this.f29779c.remove(bVar.f29783a);
                if (bVar.f29784b && (uVar = bVar.f29785c) != null) {
                    p<?> pVar = new p<>(uVar, true, false);
                    d3.c cVar = bVar.f29783a;
                    p.a aVar = this.f29781e;
                    synchronized (pVar) {
                        pVar.f29931g = cVar;
                        pVar.f29930f = aVar;
                    }
                    ((l) this.f29781e).e(bVar.f29783a, pVar);
                }
            }
        }
    }
}
