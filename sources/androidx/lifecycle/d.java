package androidx.lifecycle;

import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2183c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2181a = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Queue<Runnable> f2184d = new ArrayDeque();

    public final boolean a() {
        return this.f2182b || !this.f2181a;
    }

    public final void b() {
        if (this.f2183c) {
            return;
        }
        try {
            this.f2183c = true;
            while ((!this.f2184d.isEmpty()) && a()) {
                Runnable runnablePoll = this.f2184d.poll();
                if (runnablePoll != null) {
                    runnablePoll.run();
                }
            }
            this.f2183c = false;
        } catch (Throwable th) {
            this.f2183c = false;
            throw th;
        }
    }

    public final void c(Runnable runnable) {
        if (!this.f2184d.offer(runnable)) {
            throw new IllegalStateException("cannot enqueue any more runnables".toString());
        }
        b();
    }
}
