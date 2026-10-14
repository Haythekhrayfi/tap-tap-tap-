package y8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class k1 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k1 f38677a = new k1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38678b = "getIntervalTotalSeconds";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38681e;

    static {
        x8.e eVar = x8.e.INTEGER;
        f38679c = kc.k.a(new x8.i(eVar, false, 2, null));
        f38680d = eVar;
        f38681e = true;
    }

    public k1() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) throws x8.b {
        fd.j0.i(list, "args");
        long jLongValue = ((Long) list.get(0)).longValue();
        if (jLongValue >= 0) {
            return Long.valueOf(jLongValue / ((long) 1000));
        }
        throw new x8.b("Failed to evaluate [getIntervalTotalSeconds(-1)]. Expecting non-negative number of milliseconds.", null, 2, null);
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38679c;
    }

    @Override // x8.h
    public String c() {
        return f38678b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38680d;
    }

    @Override // x8.h
    public boolean f() {
        return f38681e;
    }
}
