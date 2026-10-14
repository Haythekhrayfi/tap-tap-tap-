package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {
    public i2.d<ListenableWorker.a> mFuture;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Worker.this.mFuture.j(Worker.this.doWork());
            } catch (Throwable th) {
                Worker.this.mFuture.k(th);
            }
        }
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract ListenableWorker.a doWork();

    @Override // androidx.work.ListenableWorker
    public final t4.a<ListenableWorker.a> startWork() {
        this.mFuture = new i2.d<>();
        getBackgroundExecutor().execute(new a());
        return this.mFuture;
    }
}
