package f5;

import android.util.Log;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public class k implements c0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f29290a;

    public k(q qVar) {
        this.f29290a = qVar;
    }

    public void a(m5.j jVar, Thread thread, Throwable th) {
        q qVar = this.f29290a;
        synchronized (qVar) {
            try {
                c5.d.f3604c.b("Handling uncaught exception \"" + th + "\" from thread " + thread.getName());
                try {
                    q0.a(qVar.f29322d.c(new m(qVar, System.currentTimeMillis(), th, thread, jVar, false)));
                } catch (TimeoutException unused) {
                    c5.d.f3604c.c("Cannot send reports. Timed out while fetching settings.");
                } catch (Exception e10) {
                    c5.d dVar = c5.d.f3604c;
                    if (dVar.a(6)) {
                        Log.e(dVar.f3605a, "Error handling uncaught exception", e10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
