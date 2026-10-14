package jd;

/* JADX INFO: loaded from: classes3.dex */
public final class s<T> implements mc.d<T>, oc.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mc.d<T> f31878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mc.f f31879d;

    /* JADX WARN: Multi-variable type inference failed */
    public s(mc.d<? super T> dVar, mc.f fVar) {
        this.f31878c = dVar;
        this.f31879d = fVar;
    }

    @Override // oc.d
    public oc.d getCallerFrame() {
        mc.d<T> dVar = this.f31878c;
        if (dVar instanceof oc.d) {
            return (oc.d) dVar;
        }
        return null;
    }

    @Override // mc.d
    public mc.f getContext() {
        return this.f31879d;
    }

    @Override // mc.d
    public void resumeWith(Object obj) {
        this.f31878c.resumeWith(obj);
    }
}
