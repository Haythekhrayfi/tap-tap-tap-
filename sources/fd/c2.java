package fd;

/* JADX INFO: loaded from: classes3.dex */
public final class c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c2 f29557a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal<x0> f29558b = new ThreadLocal<>();

    public static final x0 a() {
        ThreadLocal<x0> threadLocal = f29558b;
        x0 x0Var = threadLocal.get();
        if (x0Var != null) {
            return x0Var;
        }
        e eVar = new e(Thread.currentThread());
        threadLocal.set(eVar);
        return eVar;
    }
}
