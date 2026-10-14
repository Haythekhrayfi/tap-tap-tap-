package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import c2.c;
import g2.p;
import g2.r;
import i2.d;
import java.util.Collections;
import java.util.List;
import x1.m;
import y1.k;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f3215h = m.e("ConstraintTrkngWrkr");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WorkerParameters f3216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f3217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f3218e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d<ListenableWorker.a> f3219f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ListenableWorker f3220g;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ConstraintTrackingWorker constraintTrackingWorker = ConstraintTrackingWorker.this;
            String strB = constraintTrackingWorker.getInputData().b("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
            if (TextUtils.isEmpty(strB)) {
                m.c().b(ConstraintTrackingWorker.f3215h, "No worker to delegate to.", new Throwable[0]);
            } else {
                ListenableWorker listenableWorkerB = constraintTrackingWorker.getWorkerFactory().b(constraintTrackingWorker.getApplicationContext(), strB, constraintTrackingWorker.f3216c);
                constraintTrackingWorker.f3220g = listenableWorkerB;
                if (listenableWorkerB == null) {
                    m.c().a(ConstraintTrackingWorker.f3215h, "No worker to delegate to.", new Throwable[0]);
                } else {
                    p pVarI = ((r) k.c(constraintTrackingWorker.getApplicationContext()).f38010c.v()).i(constraintTrackingWorker.getId().toString());
                    if (pVarI != null) {
                        c2.d dVar = new c2.d(constraintTrackingWorker.getApplicationContext(), constraintTrackingWorker.getTaskExecutor(), constraintTrackingWorker);
                        dVar.b(Collections.singletonList(pVarI));
                        if (!dVar.a(constraintTrackingWorker.getId().toString())) {
                            m.c().a(ConstraintTrackingWorker.f3215h, String.format("Constraints not met for delegate %s. Requesting retry.", strB), new Throwable[0]);
                            constraintTrackingWorker.c();
                            return;
                        }
                        m.c().a(ConstraintTrackingWorker.f3215h, String.format("Constraints met for delegate %s", strB), new Throwable[0]);
                        try {
                            t4.a<ListenableWorker.a> aVarStartWork = constraintTrackingWorker.f3220g.startWork();
                            aVarStartWork.a(new k2.a(constraintTrackingWorker, aVarStartWork), constraintTrackingWorker.getBackgroundExecutor());
                            return;
                        } catch (Throwable th) {
                            m mVarC = m.c();
                            String str = ConstraintTrackingWorker.f3215h;
                            mVarC.a(str, String.format("Delegated worker %s threw exception in startWork.", strB), th);
                            synchronized (constraintTrackingWorker.f3217d) {
                                if (constraintTrackingWorker.f3218e) {
                                    m.c().a(str, "Constraints were unmet, Retrying.", new Throwable[0]);
                                    constraintTrackingWorker.c();
                                } else {
                                    constraintTrackingWorker.a();
                                }
                                return;
                            }
                        }
                    }
                }
            }
            constraintTrackingWorker.a();
        }
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f3216c = workerParameters;
        this.f3217d = new Object();
        this.f3218e = false;
        this.f3219f = new d<>();
    }

    public void a() {
        this.f3219f.j(new ListenableWorker.a.C0046a());
    }

    @Override // c2.c
    public void b(List<String> list) {
        m.c().a(f3215h, String.format("Constraints changed for %s", list), new Throwable[0]);
        synchronized (this.f3217d) {
            this.f3218e = true;
        }
    }

    public void c() {
        this.f3219f.j(new ListenableWorker.a.b());
    }

    @Override // c2.c
    public void f(List<String> list) {
    }

    @Override // androidx.work.ListenableWorker
    public j2.a getTaskExecutor() {
        return k.c(getApplicationContext()).f38011d;
    }

    @Override // androidx.work.ListenableWorker
    public boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.f3220g;
        return listenableWorker != null && listenableWorker.isRunInForeground();
    }

    @Override // androidx.work.ListenableWorker
    public void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.f3220g;
        if (listenableWorker == null || listenableWorker.isStopped()) {
            return;
        }
        this.f3220g.stop();
    }

    @Override // androidx.work.ListenableWorker
    public t4.a<ListenableWorker.a> startWork() {
        getBackgroundExecutor().execute(new a());
        return this.f3219f;
    }
}
