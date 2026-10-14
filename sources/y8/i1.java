package y8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class i1 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i1 f38630a = new i1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38631b = "getIntervalTotalHours";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38634e;

    static {
        x8.e eVar = x8.e.INTEGER;
        f38632c = kc.k.a(new x8.i(eVar, false, 2, null));
        f38633d = eVar;
        f38634e = true;
    }

    public i1() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) throws x8.b {
        fd.j0.i(list, "args");
        long jLongValue = ((Long) list.get(0)).longValue();
        if (jLongValue < 0) {
            throw new x8.b("Failed to evaluate [getIntervalTotalHours(-1)]. Expecting non-negative number of milliseconds.", null, 2, null);
        }
        long j10 = 60;
        return Long.valueOf(((jLongValue / ((long) 1000)) / j10) / j10);
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38632c;
    }

    @Override // x8.h
    public String c() {
        return f38631b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38633d;
    }

    @Override // x8.h
    public boolean f() {
        return f38634e;
    }
}
