package y8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class g1 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g1 f38584a = new g1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38585b = "getIntervalSeconds";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38588e;

    static {
        x8.e eVar = x8.e.INTEGER;
        f38586c = kc.k.a(new x8.i(eVar, false, 2, null));
        f38587d = eVar;
        f38588e = true;
    }

    public g1() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) throws x8.b {
        fd.j0.i(list, "args");
        long jLongValue = ((Long) list.get(0)).longValue();
        if (jLongValue >= 0) {
            return Long.valueOf((jLongValue / ((long) 1000)) % ((long) 60));
        }
        throw new x8.b("Failed to evaluate [getIntervalSeconds(-1)]. Expecting non-negative number of milliseconds.", null, 2, null);
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38586c;
    }

    @Override // x8.h
    public String c() {
        return f38585b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38587d;
    }

    @Override // x8.h
    public boolean f() {
        return f38588e;
    }
}
