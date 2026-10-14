package y8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class j2 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j2 f38658a = new j2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38659b = "toInteger";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38660c = kc.k.a(new x8.i(x8.e.NUMBER, false, 2, null));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38661d = x8.e.INTEGER;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38662e = true;

    public j2() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) {
        fd.j0.i(list, "args");
        double dDoubleValue = ((Double) kc.t.r(list)).doubleValue();
        if (dDoubleValue >= -9.223372036854776E18d && dDoubleValue <= 9.223372036854776E18d) {
            return Long.valueOf((long) dDoubleValue);
        }
        x8.c.f(f38659b, list, "Unable to convert value to Integer.", null, 8);
        throw null;
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38660c;
    }

    @Override // x8.h
    public String c() {
        return f38659b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38661d;
    }

    @Override // x8.h
    public boolean f() {
        return f38662e;
    }
}
