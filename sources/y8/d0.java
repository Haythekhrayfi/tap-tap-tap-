package y8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class d0 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f38509a = new d0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38510b = "abs";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38513e;

    static {
        x8.e eVar = x8.e.NUMBER;
        f38511c = kc.k.a(new x8.i(eVar, false, 2, null));
        f38512d = eVar;
        f38513e = true;
    }

    public d0() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) {
        fd.j0.i(list, "args");
        return Double.valueOf(Math.abs(((Double) kc.t.r(list)).doubleValue()));
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38511c;
    }

    @Override // x8.h
    public String c() {
        return f38510b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38512d;
    }

    @Override // x8.h
    public boolean f() {
        return f38513e;
    }
}
