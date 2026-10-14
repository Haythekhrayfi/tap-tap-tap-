package y8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class m0 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m0 f38715a = new m0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38716b = "mod";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38719e;

    static {
        x8.e eVar = x8.e.NUMBER;
        f38717c = kc.l.c(new x8.i(eVar, false, 2, null), new x8.i(eVar, false, 2, null));
        f38718d = eVar;
        f38719e = true;
    }

    public m0() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) {
        fd.j0.i(list, "args");
        double dDoubleValue = ((Double) kc.t.r(list)).doubleValue();
        double dDoubleValue2 = ((Double) kc.t.x(list)).doubleValue();
        if (!(dDoubleValue2 == 0.0d)) {
            return Double.valueOf(dDoubleValue % dDoubleValue2);
        }
        x8.c.f(f38716b, list, "Division by zero is not supported.", null, 8);
        throw null;
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38717c;
    }

    @Override // x8.h
    public String c() {
        return f38716b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38718d;
    }

    @Override // x8.h
    public boolean f() {
        return f38719e;
    }
}
