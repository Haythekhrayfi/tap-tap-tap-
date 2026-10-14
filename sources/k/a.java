package k;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class a extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile a f31886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Executor f31887c = new ExecutorC0328a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f31888a = new b();

    /* JADX INFO: renamed from: k.a$a, reason: collision with other inner class name */
    public static class ExecutorC0328a implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            a.d().f31888a.a(runnable);
        }
    }

    public static a d() {
        if (f31886b != null) {
            return f31886b;
        }
        synchronized (a.class) {
            if (f31886b == null) {
                f31886b = new a();
            }
        }
        return f31886b;
    }

    @Override // k.c
    public void a(Runnable runnable) {
        this.f31888a.a(runnable);
    }

    @Override // k.c
    public boolean b() {
        return this.f31888a.b();
    }

    @Override // k.c
    public void c(Runnable runnable) {
        this.f31888a.c(runnable);
    }
}
