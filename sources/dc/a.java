package dc;

import bc.e;
import java.util.Objects;
import java.util.concurrent.Callable;
import lb.l;
import ob.b;
import ob.c;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static l a(Callable<l> callable) {
        try {
            l lVarCall = callable.call();
            Objects.requireNonNull(lVarCall, "Scheduler Callable result can't be null");
            return lVarCall;
        } catch (Throwable th) {
            throw e.d(th);
        }
    }

    public static void b(Throwable th) {
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else {
            boolean z10 = true;
            if (!(th instanceof c) && !(th instanceof b) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof ob.a)) {
                z10 = false;
            }
            if (!z10) {
                th = new ob.e(th);
            }
        }
        th.printStackTrace();
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }
}
