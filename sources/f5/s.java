package f5;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class s implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f29340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Throwable f29341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Thread f29342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q f29343f;

    public s(q qVar, long j10, Throwable th, Thread thread) {
        this.f29343f = qVar;
        this.f29340c = j10;
        this.f29341d = th;
        this.f29342e = thread;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f29343f.g()) {
            return;
        }
        long j10 = this.f29340c / 1000;
        String strF = this.f29343f.f();
        if (strF == null) {
            c5.d.f3604c.f("Tried to write a non-fatal exception while no session was open.");
            return;
        }
        m0 m0Var = this.f29343f.f29329k;
        Throwable th = this.f29341d;
        Thread thread = this.f29342e;
        Objects.requireNonNull(m0Var);
        c5.d.f3604c.e("Persisting non-fatal event for session " + strF);
        m0Var.d(th, thread, strF, "error", j10, false);
    }
}
