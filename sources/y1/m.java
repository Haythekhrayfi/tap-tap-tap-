package y1;

import android.annotation.SuppressLint;
import androidx.work.ListenableWorker;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public class m implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i2.d f38020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f38021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f38022e;

    public m(n nVar, i2.d dVar, String str) {
        this.f38022e = nVar;
        this.f38020c = dVar;
        this.f38021d = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    @SuppressLint({"SyntheticAccessor"})
    public void run() {
        try {
            try {
                ListenableWorker.a aVar = (ListenableWorker.a) this.f38020c.get();
                if (aVar == null) {
                    x1.m.c().b(n.f38023v, String.format("%s returned a null result. Treating it as a failure.", this.f38022e.f38028g.f29742c), new Throwable[0]);
                } else {
                    x1.m.c().a(n.f38023v, String.format("%s returned a %s result.", this.f38022e.f38028g.f29742c, aVar), new Throwable[0]);
                    this.f38022e.f38031j = aVar;
                }
            } catch (InterruptedException e10) {
                e = e10;
                x1.m.c().b(n.f38023v, String.format("%s failed because it threw an exception/error", this.f38021d), e);
            } catch (CancellationException e11) {
                x1.m.c().d(n.f38023v, String.format("%s was cancelled", this.f38021d), e11);
            } catch (ExecutionException e12) {
                e = e12;
                x1.m.c().b(n.f38023v, String.format("%s failed because it threw an exception/error", this.f38021d), e);
            }
            this.f38022e.c();
        } catch (Throwable th) {
            this.f38022e.c();
            throw th;
        }
    }
}
