package f5;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class g0 extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f29273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ExecutorService f29274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f29275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f29276f;

    public g0(String str, ExecutorService executorService, long j10, TimeUnit timeUnit) {
        this.f29273c = str;
        this.f29274d = executorService;
        this.f29275e = j10;
        this.f29276f = timeUnit;
    }

    @Override // f5.c
    public void a() {
        try {
            c5.d dVar = c5.d.f3604c;
            dVar.b("Executing shutdown hook for " + this.f29273c);
            this.f29274d.shutdown();
            if (this.f29274d.awaitTermination(this.f29275e, this.f29276f)) {
                return;
            }
            dVar.b(this.f29273c + " did not shut down in the allocated time. Requesting immediate shutdown.");
            this.f29274d.shutdownNow();
        } catch (InterruptedException unused) {
            c5.d.f3604c.b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.f29273c));
            this.f29274d.shutdownNow();
        }
    }
}
