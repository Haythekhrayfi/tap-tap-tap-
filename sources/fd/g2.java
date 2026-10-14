package fd;

/* JADX INFO: loaded from: classes3.dex */
public final class g2 extends c0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g2 f29572e = new g2();

    @Override // fd.c0
    public void c0(mc.f fVar, Runnable runnable) {
        if (((j2) fVar.b(j2.f29581d)) == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
    }

    @Override // fd.c0
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
