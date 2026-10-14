package f5;

import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class m implements Callable<Task<Void>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f29298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Throwable f29299d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Thread f29300e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m5.j f29301f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f29302g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q f29303h;

    public m(q qVar, long j10, Throwable th, Thread thread, m5.j jVar, boolean z10) {
        this.f29303h = qVar;
        this.f29298c = j10;
        this.f29299d = th;
        this.f29300e = thread;
        this.f29301f = jVar;
        this.f29302g = z10;
    }

    @Override // java.util.concurrent.Callable
    public Task<Void> call() throws Exception {
        long j10 = this.f29298c / 1000;
        String strF = this.f29303h.f();
        if (strF == null) {
            c5.d.f3604c.c("Tried to write a fatal exception while no session was open.");
        } else {
            this.f29303h.f29321c.a();
            m0 m0Var = this.f29303h.f29329k;
            Throwable th = this.f29299d;
            Thread thread = this.f29300e;
            Objects.requireNonNull(m0Var);
            c5.d.f3604c.e("Persisting fatal event for session " + strF);
            m0Var.d(th, thread, strF, AppMeasurement.CRASH_ORIGIN, j10, true);
            this.f29303h.d(this.f29298c);
            this.f29303h.c(false, this.f29301f);
            q qVar = this.f29303h;
            new d(this.f29303h.f29323e);
            q.a(qVar, d.f29253b);
            if (this.f29303h.f29320b.a()) {
                Executor executor = this.f29303h.f29322d.f29264a;
                return ((m5.g) this.f29301f).f33214i.get().getTask().onSuccessTask(executor, new l(this, executor, strF));
            }
        }
        return Tasks.forResult(null);
    }
}
