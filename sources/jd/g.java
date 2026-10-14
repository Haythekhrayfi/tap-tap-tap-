package jd;

import fd.j0;
import fd.z;
import java.util.ArrayList;
import jc.w;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g<T> implements l<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mc.f f31857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f31858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final hd.e f31859e;

    public g(mc.f fVar, int i10, hd.e eVar) {
        this.f31857c = fVar;
        this.f31858d = i10;
        this.f31859e = eVar;
    }

    @Override // id.d
    public Object a(id.e<? super T> eVar, mc.d<? super w> dVar) {
        Object objL = z.l(new e(eVar, this, null), dVar);
        return objL == nc.a.COROUTINE_SUSPENDED ? objL : w.f31842a;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013 A[PHI: r4
  0x0013: PHI (r4v5 int) = (r4v2 int), (r4v2 int), (r4v4 int) binds: [B:8:0x0011, B:13:0x0019, B:16:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // jd.l
    public id.d<T> b(mc.f fVar, int i10, hd.e eVar) {
        mc.f fVarI = fVar.i(this.f31857c);
        if (eVar == hd.e.SUSPEND) {
            int i11 = this.f31858d;
            if (i11 != -3) {
                if (i10 == -3) {
                    i10 = i11;
                } else if (i11 != -2) {
                    if (i10 != -2 && (i11 = i11 + i10) < 0) {
                        i10 = Integer.MAX_VALUE;
                    } else {
                        i10 = i11;
                    }
                }
            }
            eVar = this.f31859e;
        }
        return (j0.d(fVarI, this.f31857c) && i10 == this.f31858d && eVar == this.f31859e) ? this : d(fVarI, i10, eVar);
    }

    public abstract Object c(hd.p<? super T> pVar, mc.d<? super w> dVar);

    public abstract g<T> d(mc.f fVar, int i10, hd.e eVar);

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        if (this.f31857c != mc.h.f33539c) {
            StringBuilder sbA = defpackage.a.a("context=");
            sbA.append(this.f31857c);
            arrayList.add(sbA.toString());
        }
        if (this.f31858d != -3) {
            StringBuilder sbA2 = defpackage.a.a("capacity=");
            sbA2.append(this.f31858d);
            arrayList.add(sbA2.toString());
        }
        if (this.f31859e != hd.e.SUSPEND) {
            StringBuilder sbA3 = defpackage.a.a("onBufferOverflow=");
            sbA3.append(this.f31859e);
            arrayList.add(sbA3.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('[');
        return s.a.a(sb2, kc.t.w(arrayList, ", ", null, null, 0, null, null, 62), ']');
    }
}
