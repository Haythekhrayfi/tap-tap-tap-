package j2;

import android.os.Handler;
import android.os.Looper;
import h2.j;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class b implements j2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f31695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f31696b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f31697c = new a();

    public class a implements Executor {
        public a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            b.this.f31696b.post(runnable);
        }
    }

    public b(Executor executor) {
        this.f31695a = new j(executor);
    }
}
