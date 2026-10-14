package fd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public class v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f29628b = AtomicIntegerFieldUpdater.newUpdater(v.class, "_handled");
    private volatile /* synthetic */ int _handled;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f29629a;

    public v(Throwable th, boolean z10) {
        this.f29629a = th;
        this._handled = z10 ? 1 : 0;
    }

    public /* synthetic */ v(Throwable th, boolean z10, int i10, vc.g gVar) {
        this(th, (i10 & 2) != 0 ? false : z10);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean a() {
        return this._handled;
    }

    public String toString() {
        return getClass().getSimpleName() + '[' + this.f29629a + ']';
    }
}
