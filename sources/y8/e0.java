package y8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class e0 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f38531a = new e0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38532b = "ceil";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38535e;

    static {
        x8.e eVar = x8.e.NUMBER;
        f38533c = kc.k.a(new x8.i(eVar, false, 2, null));
        f38534d = eVar;
        f38535e = true;
    }

    public e0() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) {
        fd.j0.i(list, "args");
        return Double.valueOf(Math.ceil(((Double) kc.t.r(list)).doubleValue()));
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38533c;
    }

    @Override // x8.h
    public String c() {
        return f38532b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38534d;
    }

    @Override // x8.h
    public boolean f() {
        return f38535e;
    }
}
