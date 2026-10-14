package f5;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0 implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f29312b;

    public /* synthetic */ o0(TaskCompletionSource taskCompletionSource, int i10) {
        this.f29311a = i10;
        this.f29312b = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        switch (this.f29311a) {
            case 0:
                TaskCompletionSource taskCompletionSource = this.f29312b;
                if (!task.isSuccessful()) {
                    Exception exception = task.getException();
                    Objects.requireNonNull(exception);
                    taskCompletionSource.trySetException(exception);
                } else {
                    taskCompletionSource.trySetResult(task.getResult());
                }
                break;
            default:
                TaskCompletionSource taskCompletionSource2 = this.f29312b;
                if (!task.isSuccessful()) {
                    Exception exception2 = task.getException();
                    Objects.requireNonNull(exception2);
                    taskCompletionSource2.trySetException(exception2);
                } else {
                    taskCompletionSource2.trySetResult(task.getResult());
                }
                break;
        }
        return null;
    }
}
