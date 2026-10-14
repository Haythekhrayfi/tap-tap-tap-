package y8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class j1 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j1 f38653a = new j1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38654b = "getIntervalTotalMinutes";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38657e;

    static {
        x8.e eVar = x8.e.INTEGER;
        f38655c = kc.k.a(new x8.i(eVar, false, 2, null));
        f38656d = eVar;
        f38657e = true;
    }

    public j1() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) throws x8.b {
        fd.j0.i(list, "args");
        long jLongValue = ((Long) list.get(0)).longValue();
        if (jLongValue >= 0) {
            return Long.valueOf((jLongValue / ((long) 1000)) / ((long) 60));
        }
        throw new x8.b("Failed to evaluate [getIntervalTotalMinutes(-1)]. Expecting non-negative number of milliseconds.", null, 2, null);
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38655c;
    }

    @Override // x8.h
    public String c() {
        return f38654b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38656d;
    }

    @Override // x8.h
    public boolean f() {
        return f38657e;
    }
}
