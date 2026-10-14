package h2;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class j implements Executor {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f30507d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Runnable f30509f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque<a> f30506c = new ArrayDeque<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f30508e = new Object();

    public static class a implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final j f30510c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Runnable f30511d;

        public a(j jVar, Runnable runnable) {
            this.f30510c = jVar;
            this.f30511d = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f30511d.run();
            } finally {
                this.f30510c.a();
            }
        }
    }

    public j(Executor executor) {
        this.f30507d = executor;
    }

    public void a() {
        synchronized (this.f30508e) {
            a aVarPoll = this.f30506c.poll();
            this.f30509f = aVarPoll;
            if (aVarPoll != null) {
                this.f30507d.execute(this.f30509f);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.f30508e) {
            this.f30506c.add(new a(this, runnable));
            if (this.f30509f == null) {
                a();
            }
        }
    }
}
