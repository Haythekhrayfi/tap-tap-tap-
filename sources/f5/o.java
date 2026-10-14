package f5;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class o implements SuccessContinuation<m5.d, Void> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Executor f29309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f29310d;

    public o(p pVar, Executor executor) {
        this.f29310d = pVar;
        this.f29309c = executor;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task<Void> then(m5.d dVar) throws Exception {
        if (dVar == null) {
            c5.d.f3604c.f("Received null app settings at app startup. Cannot send cached reports");
        } else {
            q.b(q.this);
            q.this.f29329k.e(this.f29309c, null);
            q.this.f29333o.trySetResult(null);
        }
        return Tasks.forResult(null);
    }
}
