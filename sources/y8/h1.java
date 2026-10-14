package y8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class h1 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h1 f38607a = new h1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38608b = "getIntervalTotalDays";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38611e;

    static {
        x8.e eVar = x8.e.INTEGER;
        f38609c = kc.k.a(new x8.i(eVar, false, 2, null));
        f38610d = eVar;
        f38611e = true;
    }

    public h1() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) throws x8.b {
        fd.j0.i(list, "args");
        long jLongValue = ((Long) list.get(0)).longValue();
        if (jLongValue < 0) {
            throw new x8.b("Failed to evaluate [getIntervalTotalDays(-1)]. Expecting non-negative number of milliseconds.", null, 2, null);
        }
        long j10 = 60;
        return Long.valueOf((((jLongValue / ((long) 1000)) / j10) / j10) / ((long) 24));
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38609c;
    }

    @Override // x8.h
    public String c() {
        return f38608b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38610d;
    }

    @Override // x8.h
    public boolean f() {
        return f38611e;
    }
}
