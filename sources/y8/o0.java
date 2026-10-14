package y8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class o0 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o0 f38761a = new o0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38762b = "round";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38764d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38765e;

    static {
        x8.e eVar = x8.e.NUMBER;
        f38763c = kc.k.a(new x8.i(eVar, false, 2, null));
        f38764d = eVar;
        f38765e = true;
    }

    public o0() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) {
        fd.j0.i(list, "args");
        double dDoubleValue = ((Double) kc.t.r(list)).doubleValue();
        return Double.valueOf(Math.floor(Math.abs(dDoubleValue) + 0.5d) * Math.signum(dDoubleValue));
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38763c;
    }

    @Override // x8.h
    public String c() {
        return f38762b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38764d;
    }

    @Override // x8.h
    public boolean f() {
        return f38765e;
    }
}
