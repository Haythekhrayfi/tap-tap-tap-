package androidx.work;

import android.content.Context;
import fd.c0;
import fd.g0;
import fd.j0;
import fd.k;
import fd.s0;
import fd.t;
import fd.z;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import jc.w;
import uc.p;
import x1.j;
import x1.l;

/* JADX INFO: loaded from: classes.dex */
public abstract class CoroutineWorker extends ListenableWorker {
    private final c0 coroutineContext;
    private final i2.d<ListenableWorker.a> future;
    private final t job;

    public static final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (CoroutineWorker.this.getFuture$work_runtime_ktx_release().f31189c instanceof i2.b.c) {
                CoroutineWorker.this.getJob$work_runtime_ktx_release().c(null);
            }
        }
    }

    @oc.e(c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", f = "CoroutineWorker.kt", l = {134}, m = "invokeSuspend")
    public static final class b extends oc.h implements p<g0, mc.d<? super w>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f3072c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f3073d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ j<x1.d> f3074e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ CoroutineWorker f3075f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(j<x1.d> jVar, CoroutineWorker coroutineWorker, mc.d<? super b> dVar) {
            super(2, dVar);
            this.f3074e = jVar;
            this.f3075f = coroutineWorker;
        }

        @Override // oc.a
        public final mc.d<w> create(Object obj, mc.d<?> dVar) {
            return new b(this.f3074e, this.f3075f, dVar);
        }

        @Override // uc.p
        public Object invoke(g0 g0Var, mc.d<? super w> dVar) {
            return new b(this.f3074e, this.f3075f, dVar).invokeSuspend(w.f31842a);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            j<x1.d> jVar;
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            int i10 = this.f3073d;
            if (i10 == 0) {
                h9.d.t(obj);
                j<x1.d> jVar2 = this.f3074e;
                CoroutineWorker coroutineWorker = this.f3075f;
                this.f3072c = jVar2;
                this.f3073d = 1;
                Object foregroundInfo = coroutineWorker.getForegroundInfo(this);
                if (foregroundInfo == aVar) {
                    return aVar;
                }
                jVar = jVar2;
                obj = foregroundInfo;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jVar = (j) this.f3072c;
                h9.d.t(obj);
            }
            jVar.f37404d.j((R) obj);
            return w.f31842a;
        }
    }

    @oc.e(c = "androidx.work.CoroutineWorker$startWork$1", f = "CoroutineWorker.kt", l = {68}, m = "invokeSuspend")
    public static final class c extends oc.h implements p<g0, mc.d<? super w>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f3076c;

        public c(mc.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // oc.a
        public final mc.d<w> create(Object obj, mc.d<?> dVar) {
            return CoroutineWorker.this.new c(dVar);
        }

        @Override // uc.p
        public Object invoke(g0 g0Var, mc.d<? super w> dVar) {
            return CoroutineWorker.this.new c(dVar).invokeSuspend(w.f31842a);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            int i10 = this.f3076c;
            try {
                if (i10 == 0) {
                    h9.d.t(obj);
                    CoroutineWorker coroutineWorker = CoroutineWorker.this;
                    this.f3076c = 1;
                    obj = coroutineWorker.doWork(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h9.d.t(obj);
                }
                CoroutineWorker.this.getFuture$work_runtime_ktx_release().j((ListenableWorker.a) obj);
            } catch (Throwable th) {
                CoroutineWorker.this.getFuture$work_runtime_ktx_release().k(th);
            }
            return w.f31842a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        j0.i(context, "appContext");
        j0.i(workerParameters, "params");
        this.job = z.b(null, 1, null);
        i2.d<ListenableWorker.a> dVar = new i2.d<>();
        this.future = dVar;
        dVar.a(new a(), ((j2.b) getTaskExecutor()).f31695a);
        this.coroutineContext = s0.f29619a;
    }

    public static /* synthetic */ void getCoroutineContext$annotations() {
    }

    public static /* synthetic */ Object getForegroundInfo$suspendImpl(CoroutineWorker coroutineWorker, mc.d dVar) {
        throw new IllegalStateException("Not implemented");
    }

    public abstract Object doWork(mc.d<? super ListenableWorker.a> dVar);

    public c0 getCoroutineContext() {
        return this.coroutineContext;
    }

    public Object getForegroundInfo(mc.d<? super x1.d> dVar) {
        return getForegroundInfo$suspendImpl(this, dVar);
    }

    @Override // androidx.work.ListenableWorker
    public final t4.a<x1.d> getForegroundInfoAsync() {
        t tVarB = z.b(null, 1, null);
        c0 coroutineContext = getCoroutineContext();
        Objects.requireNonNull(coroutineContext);
        g0 g0VarA = z.a(mc.f.a.C0363a.d(coroutineContext, tVarB));
        j jVar = new j(tVarB, null, 2, null);
        y8.c0.z(g0VarA, null, null, new b(jVar, this, null), 3, null);
        return jVar;
    }

    public final i2.d<ListenableWorker.a> getFuture$work_runtime_ktx_release() {
        return this.future;
    }

    public final t getJob$work_runtime_ktx_release() {
        return this.job;
    }

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        super.onStopped();
        this.future.cancel(false);
    }

    public final Object setForeground(x1.d dVar, mc.d<? super w> dVar2) throws Throwable {
        Object objR;
        t4.a<Void> foregroundAsync = setForegroundAsync(dVar);
        j0.h(foregroundAsync, "setForegroundAsync(foregroundInfo)");
        if (foregroundAsync.isDone()) {
            try {
                objR = foregroundAsync.get();
            } catch (ExecutionException e10) {
                Throwable cause = e10.getCause();
                if (cause == null) {
                    throw e10;
                }
                throw cause;
            }
        } else {
            k kVar = new k(nc.b.c(dVar2), 1);
            kVar.u();
            foregroundAsync.a(new x1.k(kVar, foregroundAsync), d.INSTANCE);
            kVar.s(new l(foregroundAsync));
            objR = kVar.r();
            if (objR == nc.a.COROUTINE_SUSPENDED) {
                j0.i(dVar2, "frame");
            }
        }
        return objR == nc.a.COROUTINE_SUSPENDED ? objR : w.f31842a;
    }

    public final Object setProgress(androidx.work.c cVar, mc.d<? super w> dVar) throws Throwable {
        Object objR;
        t4.a<Void> progressAsync = setProgressAsync(cVar);
        j0.h(progressAsync, "setProgressAsync(data)");
        if (progressAsync.isDone()) {
            try {
                objR = progressAsync.get();
            } catch (ExecutionException e10) {
                Throwable cause = e10.getCause();
                if (cause == null) {
                    throw e10;
                }
                throw cause;
            }
        } else {
            k kVar = new k(nc.b.c(dVar), 1);
            kVar.u();
            progressAsync.a(new x1.k(kVar, progressAsync), d.INSTANCE);
            kVar.s(new l(progressAsync));
            objR = kVar.r();
            if (objR == nc.a.COROUTINE_SUSPENDED) {
                j0.i(dVar, "frame");
            }
        }
        return objR == nc.a.COROUTINE_SUSPENDED ? objR : w.f31842a;
    }

    @Override // androidx.work.ListenableWorker
    public final t4.a<ListenableWorker.a> startWork() {
        c0 coroutineContext = getCoroutineContext();
        t tVar = this.job;
        Objects.requireNonNull(coroutineContext);
        y8.c0.z(z.a(mc.f.a.C0363a.d(coroutineContext, tVar)), null, null, new c(null), 3, null);
        return this.future;
    }
}
