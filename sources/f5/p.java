package f5;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class p implements Callable<Task<Void>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Boolean f29313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q.a f29314d;

    public p(q.a aVar, Boolean bool) {
        this.f29314d = aVar;
        this.f29313c = bool;
    }

    @Override // java.util.concurrent.Callable
    public Task<Void> call() throws Exception {
        if (this.f29313c.booleanValue()) {
            c5.d.f3604c.b("Sending cached crash reports...");
            boolean zBooleanValue = this.f29313c.booleanValue();
            d0 d0Var = q.this.f29320b;
            Objects.requireNonNull(d0Var);
            if (!zBooleanValue) {
                throw new IllegalStateException("An invalid data collection token was used.");
            }
            d0Var.f29260g.trySetResult(null);
            q.a aVar = this.f29314d;
            Executor executor = q.this.f29322d.f29264a;
            return aVar.f29334c.onSuccessTask(executor, new o(this, executor));
        }
        c5.d.f3604c.e("Deleting cached crash reports...");
        k5.c cVar = q.this.f29324f;
        Iterator it = k5.c.j(cVar.f31906b.listFiles(j.f29286b)).iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
        k5.b bVar = q.this.f29329k.f29305b;
        bVar.a(bVar.f31903b.e());
        bVar.a(bVar.f31903b.d());
        bVar.a(bVar.f31903b.c());
        q.this.f29333o.trySetResult(null);
        return Tasks.forResult(null);
    }
}
