package id;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class x extends jd.d<v<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f31632a = AtomicReferenceFieldUpdater.newUpdater(x.class, Object.class, "_state");
    public volatile /* synthetic */ Object _state = null;

    @Override // jd.d
    public boolean a(v<?> vVar) {
        if (this._state != null) {
            return false;
        }
        this._state = w.f31630a;
        return true;
    }

    @Override // jd.d
    public mc.d[] b(v<?> vVar) {
        this._state = null;
        return jd.c.f31849a;
    }

    public final Object c(mc.d<? super jc.w> dVar) {
        fd.k kVar = new fd.k(nc.b.c(dVar), 1);
        kVar.u();
        if (!f31632a.compareAndSet(this, w.f31630a, kVar)) {
            jc.i.a aVar = jc.i.f31813c;
            kVar.resumeWith(jc.w.f31842a);
        }
        Object objR = kVar.r();
        return objR == nc.a.COROUTINE_SUSPENDED ? objR : jc.w.f31842a;
    }
}
