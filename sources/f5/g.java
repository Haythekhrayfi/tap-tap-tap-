package f5;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public class g implements Callable<Void> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f29272c;

    public g(f fVar, Runnable runnable) {
        this.f29272c = runnable;
    }

    @Override // java.util.concurrent.Callable
    public Void call() throws Exception {
        this.f29272c.run();
        return null;
    }
}
