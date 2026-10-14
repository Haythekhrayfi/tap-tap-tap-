package mb;

import android.os.Handler;
import android.os.Looper;
import bc.e;
import java.util.Objects;
import lb.l;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f33521a;

    /* JADX INFO: renamed from: mb.a$a, reason: collision with other inner class name */
    public static final class C0361a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l f33522a = new b(new Handler(Looper.getMainLooper()), false);
    }

    static {
        try {
            l lVar = C0361a.f33522a;
            if (lVar == null) {
                throw new NullPointerException("Scheduler Callable returned null");
            }
            f33521a = lVar;
        } catch (Throwable th) {
            throw e.d(th);
        }
    }

    public static l a() {
        l lVar = f33521a;
        Objects.requireNonNull(lVar, "scheduler == null");
        return lVar;
    }
}
