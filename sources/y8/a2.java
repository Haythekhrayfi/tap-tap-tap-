package y8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class a2 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a2 f38453a = new a2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38454b = "mod";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38456d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38457e;

    static {
        x8.e eVar = x8.e.INTEGER;
        f38455c = kc.l.c(new x8.i(eVar, false, 2, null), new x8.i(eVar, false, 2, null));
        f38456d = eVar;
        f38457e = true;
    }

    public a2() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) {
        fd.j0.i(list, "args");
        long jLongValue = ((Long) kc.t.r(list)).longValue();
        long jLongValue2 = ((Long) kc.t.x(list)).longValue();
        if (jLongValue2 != 0) {
            return Long.valueOf(jLongValue % jLongValue2);
        }
        x8.c.f(f38454b, list, "Division by zero is not supported.", null, 8);
        throw null;
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38455c;
    }

    @Override // x8.h
    public String c() {
        return f38454b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38456d;
    }

    @Override // x8.h
    public boolean f() {
        return f38457e;
    }
}
