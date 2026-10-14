package f5;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* JADX INFO: loaded from: classes2.dex */
public class n implements SuccessContinuation<Void, Boolean> {
    public n(q qVar) {
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task<Boolean> then(Void r10) throws Exception {
        return Tasks.forResult(Boolean.TRUE);
    }
}
