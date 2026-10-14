package f5;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f29264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Task<Void> f29265b = Tasks.forResult(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f29266c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ThreadLocal<Boolean> f29267d = new ThreadLocal<>();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.f29267d.set(Boolean.TRUE);
        }
    }

    public f(Executor executor) {
        this.f29264a = executor;
        executor.execute(new a());
    }

    public void a() {
        if (!Boolean.TRUE.equals(this.f29267d.get())) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
    }

    public <T> Task<T> b(Callable<T> callable) {
        Task<T> task;
        synchronized (this.f29266c) {
            task = (Task<T>) this.f29265b.continueWith(this.f29264a, new h(this, callable));
            this.f29265b = task.continueWith(this.f29264a, new i(this));
        }
        return task;
    }

    public <T> Task<T> c(Callable<Task<T>> callable) {
        Task<T> task;
        synchronized (this.f29266c) {
            task = (Task<T>) this.f29265b.continueWithTask(this.f29264a, new h(this, callable));
            this.f29265b = task.continueWith(this.f29264a, new i(this));
        }
        return task;
    }
}
