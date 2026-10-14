package fd;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f29593c = AtomicIntegerFieldUpdater.newUpdater(m.class, "_resumed");
    private volatile /* synthetic */ int _resumed;

    public m(mc.d<?> dVar, Throwable th, boolean z10) {
        if (th == null) {
            th = new CancellationException("Continuation " + dVar + " was cancelled normally");
        }
        super(th, z10);
        this._resumed = 0;
    }
}
