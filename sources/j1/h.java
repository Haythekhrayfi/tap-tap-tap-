package j1;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class h implements Executor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f31690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque<Runnable> f31691d = new ArrayDeque<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Runnable f31692e;

    public class a implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Runnable f31693c;

        public a(Runnable runnable) {
            this.f31693c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f31693c.run();
            } finally {
                h.this.a();
            }
        }
    }

    public h(Executor executor) {
        this.f31690c = executor;
    }

    public synchronized void a() {
        Runnable runnablePoll = this.f31691d.poll();
        this.f31692e = runnablePoll;
        if (runnablePoll != null) {
            this.f31690c.execute(runnablePoll);
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        this.f31691d.offer(new a(runnable));
        if (this.f31692e == null) {
            a();
        }
    }
}
