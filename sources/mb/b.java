package mb;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import lb.l;
import qb.c;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f33523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f33524d;

    public static final class a extends l.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Handler f33525c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f33526d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile boolean f33527e;

        public a(Handler handler, boolean z10) {
            this.f33525c = handler;
            this.f33526d = z10;
        }

        @Override // lb.l.c
        @SuppressLint({"NewApi"})
        public nb.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
            Objects.requireNonNull(runnable, "run == null");
            Objects.requireNonNull(timeUnit, "unit == null");
            if (this.f33527e) {
                return c.INSTANCE;
            }
            Handler handler = this.f33525c;
            RunnableC0362b runnableC0362b = new RunnableC0362b(handler, runnable);
            Message messageObtain = Message.obtain(handler, runnableC0362b);
            messageObtain.obj = this;
            if (this.f33526d) {
                messageObtain.setAsynchronous(true);
            }
            this.f33525c.sendMessageDelayed(messageObtain, timeUnit.toMillis(j10));
            if (!this.f33527e) {
                return runnableC0362b;
            }
            this.f33525c.removeCallbacks(runnableC0362b);
            return c.INSTANCE;
        }

        @Override // nb.b
        public void dispose() {
            this.f33527e = true;
            this.f33525c.removeCallbacksAndMessages(this);
        }
    }

    /* JADX INFO: renamed from: mb.b$b, reason: collision with other inner class name */
    public static final class RunnableC0362b implements Runnable, nb.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Handler f33528c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Runnable f33529d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile boolean f33530e;

        public RunnableC0362b(Handler handler, Runnable runnable) {
            this.f33528c = handler;
            this.f33529d = runnable;
        }

        @Override // nb.b
        public void dispose() {
            this.f33528c.removeCallbacks(this);
            this.f33530e = true;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f33529d.run();
            } catch (Throwable th) {
                dc.a.b(th);
            }
        }
    }

    public b(Handler handler, boolean z10) {
        this.f33523c = handler;
        this.f33524d = z10;
    }

    @Override // lb.l
    public l.c a() {
        return new a(this.f33523c, this.f33524d);
    }

    @Override // lb.l
    @SuppressLint({"NewApi"})
    public nb.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
        Objects.requireNonNull(runnable, "run == null");
        Objects.requireNonNull(timeUnit, "unit == null");
        Handler handler = this.f33523c;
        RunnableC0362b runnableC0362b = new RunnableC0362b(handler, runnable);
        Message messageObtain = Message.obtain(handler, runnableC0362b);
        if (this.f33524d) {
            messageObtain.setAsynchronous(true);
        }
        this.f33523c.sendMessageDelayed(messageObtain, timeUnit.toMillis(j10));
        return runnableC0362b;
    }
}
