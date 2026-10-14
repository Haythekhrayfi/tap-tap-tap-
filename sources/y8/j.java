package y8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uc.l<a9.a, Integer> f38644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<x8.i> f38645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x8.e f38646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f38647d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(uc.l<? super a9.a, Integer> lVar) {
        super(null, 1, 0 == true ? 1 : 0);
        fd.j0.i(lVar, "componentGetter");
        this.f38644a = lVar;
        this.f38645b = kc.k.a(new x8.i(x8.e.COLOR, false, 2, null));
        this.f38646c = x8.e.NUMBER;
        this.f38647d = true;
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) {
        fd.j0.i(list, "args");
        int iIntValue = this.f38644a.invoke((a9.a) kc.t.r(list)).intValue();
        boolean z10 = false;
        if (iIntValue >= 0 && iIntValue < 256) {
            z10 = true;
        }
        if (z10) {
            return Double.valueOf(((double) iIntValue) / ((double) 255.0f));
        }
        throw new IllegalArgumentException("Value out of channel range 0..255");
    }

    @Override // x8.h
    public List<x8.i> b() {
        return this.f38645b;
    }

    @Override // x8.h
    public x8.e d() {
        return this.f38646c;
    }

    @Override // x8.h
    public boolean f() {
        return this.f38647d;
    }
}
