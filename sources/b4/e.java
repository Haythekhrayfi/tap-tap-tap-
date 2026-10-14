package b4;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Executor f3295a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Executor f3296b = new b();

    public class a implements Executor {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Handler f3297c = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f3297c.post(runnable);
        }
    }

    public class b implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }
}
