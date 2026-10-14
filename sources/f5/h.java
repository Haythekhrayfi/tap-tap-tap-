package f5;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public class h implements Continuation<Void, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Callable f29277a;

    public h(f fVar, Callable callable) {
        this.f29277a = callable;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task<Void> task) throws Exception {
        return this.f29277a.call();
    }
}
