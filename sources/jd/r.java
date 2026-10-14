package jd;

import hd.v;
import jc.w;

/* JADX INFO: loaded from: classes3.dex */
public final class r<T> implements id.e<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v<T> f31877c;

    /* JADX WARN: Multi-variable type inference failed */
    public r(v<? super T> vVar) {
        this.f31877c = vVar;
    }

    @Override // id.e
    public Object emit(T t10, mc.d<? super w> dVar) {
        Object objU = this.f31877c.u(t10, dVar);
        return objU == nc.a.COROUTINE_SUSPENDED ? objU : w.f31842a;
    }
}
