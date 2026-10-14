package y8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class p0 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p0 f38779a = new p0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38780b = "signum";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38783e;

    static {
        x8.e eVar = x8.e.NUMBER;
        f38781c = kc.k.a(new x8.i(eVar, false, 2, null));
        f38782d = eVar;
        f38783e = true;
    }

    public p0() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) {
        fd.j0.i(list, "args");
        return Double.valueOf(Math.signum(((Double) kc.t.r(list)).doubleValue()));
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38781c;
    }

    @Override // x8.h
    public String c() {
        return f38780b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38782d;
    }

    @Override // x8.h
    public boolean f() {
        return f38783e;
    }
}
