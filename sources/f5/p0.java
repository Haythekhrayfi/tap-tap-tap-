package f5;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public class p0 implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Callable f29315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f29316d;

    public class a implements Continuation<Object, Void> {
        public a() {
        }

        @Override // com.google.android.gms.tasks.Continuation
        public Void then(Task<Object> task) throws Exception {
            if (task.isSuccessful()) {
                p0.this.f29316d.setResult(task.getResult());
                return null;
            }
            p0.this.f29316d.setException(task.getException());
            return null;
        }
    }

    public p0(Callable callable, TaskCompletionSource taskCompletionSource) {
        this.f29315c = callable;
        this.f29316d = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            ((Task) this.f29315c.call()).continueWith(new a());
        } catch (Exception e10) {
            this.f29316d.setException(e10);
        }
    }
}
