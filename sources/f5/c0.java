package f5;

import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class c0 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f29247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m5.j f29248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f29249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c5.a f29250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f29251e = new AtomicBoolean(false);

    public interface a {
    }

    public c0(a aVar, m5.j jVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, c5.a aVar2) {
        this.f29247a = aVar;
        this.f29248b = jVar;
        this.f29249c = uncaughtExceptionHandler;
        this.f29250d = aVar2;
    }

    public final boolean a(Thread thread, Throwable th) {
        if (thread == null) {
            c5.d.f3604c.c("Crashlytics will not record uncaught exception; null thread");
            return false;
        }
        if (th == null) {
            c5.d.f3604c.c("Crashlytics will not record uncaught exception; null throwable");
            return false;
        }
        if (!this.f29250d.b()) {
            return true;
        }
        c5.d.f3604c.b("Crashlytics will not record uncaught exception; native crash exists for session.");
        return false;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        this.f29251e.set(true);
        try {
            if (a(thread, th)) {
                ((k) this.f29247a).a(this.f29248b, thread, th);
            } else {
                c5.d.f3604c.b("Uncaught exception will not be recorded by Crashlytics.");
            }
            c5.d.f3604c.b("Completed exception processing. Invoking default exception handler.");
        } catch (Exception e10) {
            c5.d dVar = c5.d.f3604c;
            if (dVar.a(6)) {
                Log.e(dVar.f3605a, "An error occurred in the uncaught exception handler", e10);
            }
            dVar.b("Completed exception processing. Invoking default exception handler.");
        } finally {
            c5.d.f3604c.b("Completed exception processing. Invoking default exception handler.");
            this.f29249c.uncaughtException(thread, th);
            this.f29251e.set(false);
        }
    }
}
