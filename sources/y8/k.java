package y8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uc.p<a9.a, Double, a9.a> f38668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<x8.i> f38669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x8.e f38670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f38671d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k(uc.p<? super a9.a, ? super Double, a9.a> pVar) {
        super(null, 1, 0 == true ? 1 : 0);
        fd.j0.i(pVar, "componentSetter");
        this.f38668a = pVar;
        x8.e eVar = x8.e.COLOR;
        this.f38669b = kc.l.c(new x8.i(eVar, false, 2, null), new x8.i(x8.e.NUMBER, false, 2, null));
        this.f38670c = eVar;
        this.f38671d = true;
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) {
        fd.j0.i(list, "args");
        int i10 = ((a9.a) list.get(0)).f202a;
        double dDoubleValue = ((Double) list.get(1)).doubleValue();
        try {
            return new a9.a(this.f38668a.invoke(new a9.a(i10), Double.valueOf(dDoubleValue)).f202a);
        } catch (IllegalArgumentException unused) {
            x8.c.f(c(), kc.l.c(a9.a.a(i10), Double.valueOf(dDoubleValue)), "Value out of range 0..1.", null, 8);
            throw null;
        }
    }

    @Override // x8.h
    public List<x8.i> b() {
        return this.f38669b;
    }

    @Override // x8.h
    public x8.e d() {
        return this.f38670c;
    }

    @Override // x8.h
    public boolean f() {
        return this.f38671d;
    }
}
