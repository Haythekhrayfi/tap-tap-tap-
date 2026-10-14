package fd;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<d0> f29565a = dd.q.h(dd.j.a(e0.a()));

    public static final void a(mc.f fVar, Throwable th) {
        Throwable runtimeException;
        Iterator<d0> it = f29565a.iterator();
        while (it.hasNext()) {
            try {
                it.next().J(fVar, th);
            } catch (Throwable th2) {
                Thread threadCurrentThread = Thread.currentThread();
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = threadCurrentThread.getUncaughtExceptionHandler();
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    jc.a.a(runtimeException, th);
                }
                uncaughtExceptionHandler.uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        try {
            jc.i.a aVar = jc.i.f31813c;
            jc.a.a(th, new p0(fVar));
            jc.i.a aVar2 = jc.i.f31813c;
        } catch (Throwable th3) {
            jc.i.a aVar3 = jc.i.f31813c;
            h9.d.f(th3);
            jc.i.a aVar4 = jc.i.f31813c;
        }
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }
}
