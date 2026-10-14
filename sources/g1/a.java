package g1;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import l0.i;
import o0.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class a<D> extends b<D> {
    public static final boolean DEBUG = false;
    public static final String TAG = "AsyncTaskLoader";
    public volatile a<D>.RunnableC0263a mCancellingTask;
    private final Executor mExecutor;
    public Handler mHandler;
    public long mLastLoadCompleteTime;
    public volatile a<D>.RunnableC0263a mTask;
    public long mUpdateThrottle;

    /* JADX INFO: renamed from: g1.a$a, reason: collision with other inner class name */
    public final class RunnableC0263a extends c<Void, Void, D> implements Runnable {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final CountDownLatch f29699j = new CountDownLatch(1);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f29700k;

        public RunnableC0263a() {
        }

        @Override // g1.c
        public Object a(Void[] voidArr) {
            try {
                return a.this.onLoadInBackground();
            } catch (i e10) {
                if (this.f29707f.get()) {
                    return null;
                }
                throw e10;
            }
        }

        @Override // g1.c
        public void b(D d10) {
            try {
                a.this.dispatchOnCancelled(this, d10);
            } finally {
                this.f29699j.countDown();
            }
        }

        @Override // g1.c
        public void c(D d10) {
            try {
                a.this.dispatchOnLoadComplete(this, d10);
            } finally {
                this.f29699j.countDown();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f29700k = false;
            a.this.executePendingTask();
        }
    }

    public a(Context context) {
        this(context, c.f29702h);
    }

    private a(Context context, Executor executor) {
        super(context);
        this.mLastLoadCompleteTime = -10000L;
        this.mExecutor = executor;
    }

    public void cancelLoadInBackground() {
    }

    public void dispatchOnCancelled(a<D>.RunnableC0263a runnableC0263a, D d10) {
        onCanceled(d10);
        if (this.mCancellingTask == runnableC0263a) {
            rollbackContentChanged();
            this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
            this.mCancellingTask = null;
            deliverCancellation();
            executePendingTask();
        }
    }

    public void dispatchOnLoadComplete(a<D>.RunnableC0263a runnableC0263a, D d10) {
        if (this.mTask != runnableC0263a) {
            dispatchOnCancelled(runnableC0263a, d10);
            return;
        }
        if (isAbandoned()) {
            onCanceled(d10);
            return;
        }
        commitContentChanged();
        this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
        this.mTask = null;
        deliverResult(d10);
    }

    @Override // g1.b
    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (this.mTask != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.mTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mTask.f29700k);
        }
        if (this.mCancellingTask != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.mCancellingTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mCancellingTask.f29700k);
        }
        if (this.mUpdateThrottle != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            h.b(this.mUpdateThrottle, printWriter, 0);
            printWriter.print(" mLastLoadCompleteTime=");
            long j10 = this.mLastLoadCompleteTime;
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (j10 == 0) {
                printWriter.print("--");
            } else {
                h.b(j10 - jUptimeMillis, printWriter, 0);
            }
            printWriter.println();
        }
    }

    public void executePendingTask() {
        if (this.mCancellingTask != null || this.mTask == null) {
            return;
        }
        if (this.mTask.f29700k) {
            this.mTask.f29700k = false;
            this.mHandler.removeCallbacks(this.mTask);
        }
        if (this.mUpdateThrottle > 0 && SystemClock.uptimeMillis() < this.mLastLoadCompleteTime + this.mUpdateThrottle) {
            this.mTask.f29700k = true;
            this.mHandler.postAtTime(this.mTask, this.mLastLoadCompleteTime + this.mUpdateThrottle);
            return;
        }
        a<D>.RunnableC0263a runnableC0263a = this.mTask;
        Executor executor = this.mExecutor;
        if (runnableC0263a.f29706e == c.g.PENDING) {
            runnableC0263a.f29706e = c.g.RUNNING;
            runnableC0263a.f29704c.f29715c = null;
            executor.execute(runnableC0263a.f29705d);
        } else {
            int i10 = c.d.f29712a[runnableC0263a.f29706e.ordinal()];
            if (i10 == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
            if (i10 == 2) {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
            throw new IllegalStateException("We should never reach this state");
        }
    }

    public boolean isLoadInBackgroundCanceled() {
        return this.mCancellingTask != null;
    }

    public abstract D loadInBackground();

    @Override // g1.b
    public boolean onCancelLoad() {
        if (this.mTask == null) {
            return false;
        }
        if (!this.mStarted) {
            this.mContentChanged = true;
        }
        if (this.mCancellingTask != null) {
            if (this.mTask.f29700k) {
                this.mTask.f29700k = false;
                this.mHandler.removeCallbacks(this.mTask);
            }
            this.mTask = null;
            return false;
        }
        if (this.mTask.f29700k) {
            this.mTask.f29700k = false;
            this.mHandler.removeCallbacks(this.mTask);
            this.mTask = null;
            return false;
        }
        a<D>.RunnableC0263a runnableC0263a = this.mTask;
        runnableC0263a.f29707f.set(true);
        boolean zCancel = runnableC0263a.f29705d.cancel(false);
        if (zCancel) {
            this.mCancellingTask = this.mTask;
            cancelLoadInBackground();
        }
        this.mTask = null;
        return zCancel;
    }

    public void onCanceled(D d10) {
    }

    @Override // g1.b
    public void onForceLoad() {
        super.onForceLoad();
        cancelLoad();
        this.mTask = new RunnableC0263a();
        executePendingTask();
    }

    public D onLoadInBackground() {
        return loadInBackground();
    }

    public void setUpdateThrottle(long j10) {
        this.mUpdateThrottle = j10;
        if (j10 != 0) {
            this.mHandler = new Handler();
        }
    }

    public void waitForLoader() {
        a<D>.RunnableC0263a runnableC0263a = this.mTask;
        if (runnableC0263a != null) {
            try {
                runnableC0263a.f29699j.await();
            } catch (InterruptedException unused) {
            }
        }
    }
}
