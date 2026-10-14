package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.Keep;
import h2.o;
import h2.q;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import x1.p;
import x1.w;

/* JADX INFO: loaded from: classes.dex */
public abstract class ListenableWorker {
    private Context mAppContext;
    private boolean mRunInForeground;
    private volatile boolean mStopped;
    private boolean mUsed;
    private WorkerParameters mWorkerParams;

    public static abstract class a {

        /* JADX INFO: renamed from: androidx.work.ListenableWorker$a$a, reason: collision with other inner class name */
        public static final class C0046a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final androidx.work.c f3078a;

            public C0046a() {
                this(androidx.work.c.f3118c);
            }

            public C0046a(androidx.work.c cVar) {
                this.f3078a = cVar;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0046a.class != obj.getClass()) {
                    return false;
                }
                return this.f3078a.equals(((C0046a) obj).f3078a);
            }

            public int hashCode() {
                return this.f3078a.hashCode() + (C0046a.class.getName().hashCode() * 31);
            }

            public String toString() {
                StringBuilder sbA = defpackage.a.a("Failure {mOutputData=");
                sbA.append(this.f3078a);
                sbA.append('}');
                return sbA.toString();
            }
        }

        public static final class b extends a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public int hashCode() {
                return b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        public static final class c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final androidx.work.c f3079a;

            public c() {
                this(androidx.work.c.f3118c);
            }

            public c(androidx.work.c cVar) {
                this.f3079a = cVar;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || c.class != obj.getClass()) {
                    return false;
                }
                return this.f3079a.equals(((c) obj).f3079a);
            }

            public int hashCode() {
                return this.f3079a.hashCode() + (c.class.getName().hashCode() * 31);
            }

            public String toString() {
                StringBuilder sbA = defpackage.a.a("Success {mOutputData=");
                sbA.append(this.f3079a);
                sbA.append('}');
                return sbA.toString();
            }
        }
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.mAppContext = context;
        this.mWorkerParams = workerParameters;
    }

    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.f3087f;
    }

    public t4.a<x1.d> getForegroundInfoAsync() {
        i2.d dVar = new i2.d();
        dVar.k(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return dVar;
    }

    public final UUID getId() {
        return this.mWorkerParams.f3082a;
    }

    public final c getInputData() {
        return this.mWorkerParams.f3083b;
    }

    public final Network getNetwork() {
        return this.mWorkerParams.f3085d.f3094c;
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.f3086e;
    }

    public final Set<String> getTags() {
        return this.mWorkerParams.f3084c;
    }

    public j2.a getTaskExecutor() {
        return this.mWorkerParams.f3088g;
    }

    public final List<String> getTriggeredContentAuthorities() {
        return this.mWorkerParams.f3085d.f3092a;
    }

    public final List<Uri> getTriggeredContentUris() {
        return this.mWorkerParams.f3085d.f3093b;
    }

    public w getWorkerFactory() {
        return this.mWorkerParams.f3089h;
    }

    public boolean isRunInForeground() {
        return this.mRunInForeground;
    }

    public final boolean isStopped() {
        return this.mStopped;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public void onStopped() {
    }

    public final t4.a<Void> setForegroundAsync(x1.d dVar) {
        this.mRunInForeground = true;
        return ((o) this.mWorkerParams.f3091j).a(getApplicationContext(), getId(), dVar);
    }

    public t4.a<Void> setProgressAsync(c cVar) {
        p pVar = this.mWorkerParams.f3090i;
        getApplicationContext();
        UUID id2 = getId();
        q qVar = (q) pVar;
        Objects.requireNonNull(qVar);
        i2.d dVar = new i2.d();
        j2.a aVar = qVar.f30546b;
        ((j2.b) aVar).f31695a.execute(new h2.p(qVar, id2, cVar, dVar));
        return dVar;
    }

    public void setRunInForeground(boolean z10) {
        this.mRunInForeground = z10;
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract t4.a<a> startWork();

    public final void stop() {
        this.mStopped = true;
        onStopped();
    }
}
