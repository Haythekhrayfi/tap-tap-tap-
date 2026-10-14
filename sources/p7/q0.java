package p7;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public final class q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f34583b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s0 f34584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile q0 f34585d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r7.m f34586a;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }

        public final q0 a(Context context) {
            fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            q0 q0Var = q0.f34585d;
            if (q0Var != null) {
                return q0Var;
            }
            synchronized (this) {
                q0 q0Var2 = q0.f34585d;
                if (q0Var2 != null) {
                    return q0Var2;
                }
                a aVar = q0.f34583b;
                q0 q0Var3 = new q0(context, q0.f34584c, null);
                a aVar2 = q0.f34583b;
                q0.f34585d = q0Var3;
                return q0Var3;
            }
        }
    }

    static {
        s0.a aVar = new s0.a();
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        fd.j0.h(executorServiceNewSingleThreadExecutor, "executorService ?: Execu…newSingleThreadExecutor()");
        f34584c = new s0(null, executorServiceNewSingleThreadExecutor, aVar.f34593a, null);
    }

    public q0(Context context, s0 s0Var, vc.g gVar) {
        Context applicationContext = context.getApplicationContext();
        fd.j0.h(applicationContext, "context.applicationContext");
        Objects.requireNonNull(s0Var);
        h9.d.e(applicationContext, Context.class);
        h9.d.e(s0Var, s0.class);
        this.f34586a = new r7.a(s0Var, applicationContext, null);
    }
}
