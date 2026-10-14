package y8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class f0 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f0 f38554a = new f0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38555b = "copySign";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38558e;

    static {
        x8.e eVar = x8.e.NUMBER;
        f38556c = kc.l.c(new x8.i(eVar, false, 2, null), new x8.i(eVar, false, 2, null));
        f38557d = eVar;
        f38558e = true;
    }

    public f0() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) {
        fd.j0.i(list, "args");
        return Double.valueOf(Math.copySign(((Double) kc.t.r(list)).doubleValue(), ((Double) kc.t.x(list)).doubleValue()));
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38556c;
    }

    @Override // x8.h
    public String c() {
        return f38555b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38557d;
    }

    @Override // x8.h
    public boolean f() {
        return f38558e;
    }
}
