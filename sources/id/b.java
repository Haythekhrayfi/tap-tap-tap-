package id;

/* JADX INFO: loaded from: classes3.dex */
public class b<T> extends jd.g<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final uc.p<hd.p<? super T>, mc.d<? super jc.w>, Object> f31553f;

    /* JADX WARN: Multi-variable type inference failed */
    public b(uc.p<? super hd.p<? super T>, ? super mc.d<? super jc.w>, ? extends Object> pVar, mc.f fVar, int i10, hd.e eVar) {
        super(fVar, i10, eVar);
        this.f31553f = pVar;
    }

    public /* synthetic */ b(uc.p pVar, mc.f fVar, int i10, hd.e eVar, int i11, vc.g gVar) {
        this(pVar, (i11 & 2) != 0 ? mc.h.f33539c : fVar, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? hd.e.SUSPEND : eVar);
    }

    @Override // jd.g
    public Object c(hd.p<? super T> pVar, mc.d<? super jc.w> dVar) {
        Object objInvoke = this.f31553f.invoke(pVar, dVar);
        return objInvoke == nc.a.COROUTINE_SUSPENDED ? objInvoke : jc.w.f31842a;
    }

    @Override // jd.g
    public jd.g<T> d(mc.f fVar, int i10, hd.e eVar) {
        return new b(this.f31553f, fVar, i10, eVar);
    }

    @Override // jd.g
    public String toString() {
        StringBuilder sbA = defpackage.a.a("block[");
        sbA.append(this.f31553f);
        sbA.append("] -> ");
        sbA.append(super.toString());
        return sbA.toString();
    }
}
