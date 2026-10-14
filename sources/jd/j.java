package jd;

import jc.w;

/* JADX INFO: loaded from: classes3.dex */
public final class j<T> extends i<T, T> {
    public j(id.d<? extends T> dVar, mc.f fVar, int i10, hd.e eVar) {
        super(dVar, fVar, i10, eVar);
    }

    public /* synthetic */ j(id.d dVar, mc.f fVar, int i10, hd.e eVar, int i11, vc.g gVar) {
        this(dVar, (i11 & 2) != 0 ? mc.h.f33539c : fVar, (i11 & 4) != 0 ? -3 : i10, (i11 & 8) != 0 ? hd.e.SUSPEND : eVar);
    }

    @Override // jd.g
    public g<T> d(mc.f fVar, int i10, hd.e eVar) {
        return new j(this.f31863f, fVar, i10, eVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // jd.i
    public Object e(id.e<? super T> eVar, mc.d<? super w> dVar) {
        Object objA = this.f31863f.a((id.e<? super S>) eVar, dVar);
        return objA == nc.a.COROUTINE_SUSPENDED ? objA : w.f31842a;
    }
}
