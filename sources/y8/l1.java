package y8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class l1 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l1 f38697a = new l1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38698b = "getIntervalTotalWeeks";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38700d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38701e;

    static {
        x8.e eVar = x8.e.INTEGER;
        f38699c = kc.k.a(new x8.i(eVar, false, 2, null));
        f38700d = eVar;
        f38701e = true;
    }

    public l1() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) throws x8.b {
        fd.j0.i(list, "args");
        long jLongValue = ((Long) list.get(0)).longValue();
        if (jLongValue < 0) {
            throw new x8.b("Failed to evaluate [getIntervalTotalWeeks(-1)]. Expecting non-negative number of milliseconds.", null, 2, null);
        }
        long j10 = 60;
        return Long.valueOf(((((jLongValue / ((long) 1000)) / j10) / j10) / ((long) 24)) / ((long) 7));
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38699c;
    }

    @Override // x8.h
    public String c() {
        return f38698b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38700d;
    }

    @Override // x8.h
    public boolean f() {
        return f38701e;
    }
}
