package f5;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class l implements SuccessContinuation<m5.d, Void> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Executor f29293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f29294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m f29295e;

    public l(m mVar, Executor executor, String str) {
        this.f29295e = mVar;
        this.f29293c = executor;
        this.f29294d = str;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task<Void> then(m5.d dVar) throws Exception {
        if (dVar == null) {
            c5.d.f3604c.f("Received null app settings, cannot send reports at crash time.");
            return Tasks.forResult(null);
        }
        Task[] taskArr = new Task[2];
        taskArr[0] = q.b(this.f29295e.f29303h);
        m mVar = this.f29295e;
        taskArr[1] = mVar.f29303h.f29329k.e(this.f29293c, mVar.f29302g ? this.f29294d : null);
        return Tasks.whenAll((Task<?>[]) taskArr);
    }
}
