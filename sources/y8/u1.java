package y8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class u1 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u1 f38870a = new u1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38871b = "copySign";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38873d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38874e;

    static {
        x8.e eVar = x8.e.INTEGER;
        f38872c = kc.l.c(new x8.i(eVar, false, 2, null), new x8.i(eVar, false, 2, null));
        f38873d = eVar;
        f38874e = true;
    }

    public u1() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) {
        fd.j0.i(list, "args");
        long jLongValue = ((Long) kc.t.r(list)).longValue();
        int iA = xc.b.a(((Long) kc.t.x(list)).longValue());
        if (iA == 0) {
            return Long.valueOf(jLongValue);
        }
        if (jLongValue != Long.MIN_VALUE) {
            return Long.valueOf(Math.abs(jLongValue) * ((long) iA));
        }
        if (iA == -1) {
            return Long.valueOf(jLongValue);
        }
        x8.c.f(f38871b, list, "Integer overflow.", null, 8);
        throw null;
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38872c;
    }

    @Override // x8.h
    public String c() {
        return f38871b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38873d;
    }

    @Override // x8.h
    public boolean f() {
        return f38874e;
    }
}
