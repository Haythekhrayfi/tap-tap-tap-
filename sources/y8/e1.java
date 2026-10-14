package y8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class e1 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e1 f38536a = new e1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38537b = "getIntervalHours";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38540e;

    static {
        x8.e eVar = x8.e.INTEGER;
        f38538c = kc.k.a(new x8.i(eVar, false, 2, null));
        f38539d = eVar;
        f38540e = true;
    }

    public e1() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) throws x8.b {
        fd.j0.i(list, "args");
        long jLongValue = ((Long) list.get(0)).longValue();
        if (jLongValue < 0) {
            throw new x8.b("Failed to evaluate [getIntervalHours(-1)]. Expecting non-negative number of milliseconds.", null, 2, null);
        }
        long j10 = 60;
        return Long.valueOf((((jLongValue / ((long) 1000)) / j10) / j10) % ((long) 24));
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38538c;
    }

    @Override // x8.h
    public String c() {
        return f38537b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38539d;
    }

    @Override // x8.h
    public boolean f() {
        return f38540e;
    }
}
