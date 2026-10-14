package d5;

import android.os.Bundle;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class c implements b, a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f28641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f28642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TimeUnit f28643e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f28644f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CountDownLatch f28645g;

    public c(e eVar, int i10, TimeUnit timeUnit) {
        this.f28641c = eVar;
        this.f28642d = i10;
        this.f28643e = timeUnit;
    }

    @Override // d5.a
    public void a(String str, Bundle bundle) {
        synchronized (this.f28644f) {
            c5.d dVar = c5.d.f3604c;
            dVar.e("Logging event " + str + " to Firebase Analytics with params " + bundle);
            this.f28645g = new CountDownLatch(1);
            this.f28641c.f28647c.b("clx", str, bundle);
            dVar.e("Awaiting app exception callback from Analytics...");
            try {
                if (this.f28645g.await(this.f28642d, this.f28643e)) {
                    dVar.e("App exception callback received from Analytics listener.");
                } else {
                    dVar.f("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                }
            } catch (InterruptedException unused) {
                c5.d.f3604c.c("Interrupted while awaiting app exception callback from Analytics listener.");
            }
            this.f28645g = null;
        }
    }

    @Override // d5.b
    public void b(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.f28645g;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }
}
