package g1;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class c<Params, Progress, Result> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Executor f29702h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static f f29703i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h<Params, Result> f29704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FutureTask<Result> f29705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile g f29706e = g.PENDING;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f29707f = new AtomicBoolean();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f29708g = new AtomicBoolean();

    public static class a implements ThreadFactory {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicInteger f29709c = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder sbA = defpackage.a.a("ModernAsyncTask #");
            sbA.append(this.f29709c.getAndIncrement());
            return new Thread(runnable, sbA.toString());
        }
    }

    public class b extends h<Params, Result> {
        public b() {
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // java.util.concurrent.Callable
        public Result call() throws Exception {
            c.this.f29708g.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) c.this.a(this.f29715c);
                Binder.flushPendingCommands();
                c.this.d(result);
                return result;
            } catch (Throwable th) {
                try {
                    c.this.f29707f.set(true);
                    throw th;
                } catch (Throwable th2) {
                    c.this.d(result);
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: g1.c$c, reason: collision with other inner class name */
    public class C0265c extends FutureTask<Result> {
        public C0265c(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            try {
                Result result = get();
                c cVar = c.this;
                if (cVar.f29708g.get()) {
                    return;
                }
                cVar.d(result);
            } catch (InterruptedException e10) {
                Log.w("AsyncTask", e10);
            } catch (CancellationException unused) {
                c cVar2 = c.this;
                if (cVar2.f29708g.get()) {
                    return;
                }
                cVar2.d(null);
            } catch (ExecutionException e11) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e11.getCause());
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    public static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29712a;

        static {
            int[] iArr = new int[g.values().length];
            f29712a = iArr;
            try {
                iArr[g.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29712a[g.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class e<Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f29713a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Data[] f29714b;

        public e(c cVar, Data... dataArr) {
            this.f29713a = cVar;
            this.f29714b = dataArr;
        }
    }

    public static class f extends Handler {
        public f() {
            super(Looper.getMainLooper());
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            e eVar = (e) message.obj;
            int i10 = message.what;
            if (i10 != 1) {
                if (i10 != 2) {
                    return;
                }
                Objects.requireNonNull(eVar.f29713a);
            } else {
                c cVar = eVar.f29713a;
                Object obj = eVar.f29714b[0];
                if (cVar.f29707f.get()) {
                    cVar.b(obj);
                } else {
                    cVar.c(obj);
                }
                cVar.f29706e = g.FINISHED;
            }
        }
    }

    public enum g {
        PENDING,
        RUNNING,
        FINISHED
    }

    public static abstract class h<Params, Result> implements Callable<Result> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Params[] f29715c;
    }

    static {
        a aVar = new a();
        f29702h = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(10), aVar);
    }

    public c() {
        b bVar = new b();
        this.f29704c = bVar;
        this.f29705d = new C0265c(bVar);
    }

    public abstract Result a(Params... paramsArr);

    public void b(Result result) {
    }

    public void c(Result result) {
    }

    public Result d(Result result) {
        f fVar;
        synchronized (c.class) {
            if (f29703i == null) {
                f29703i = new f();
            }
            fVar = f29703i;
        }
        fVar.obtainMessage(1, new e(this, result)).sendToTarget();
        return result;
    }
}
