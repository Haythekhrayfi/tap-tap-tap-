package y8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class v1 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v1 f38889a = new v1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38890b = "div";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38893e;

    static {
        x8.e eVar = x8.e.INTEGER;
        f38891c = kc.l.c(new x8.i(eVar, false, 2, null), new x8.i(eVar, false, 2, null));
        f38892d = eVar;
        f38893e = true;
    }

    public v1() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) {
        fd.j0.i(list, "args");
        long jLongValue = ((Long) kc.t.r(list)).longValue();
        long jLongValue2 = ((Long) kc.t.x(list)).longValue();
        if (jLongValue2 != 0) {
            return Long.valueOf(jLongValue / jLongValue2);
        }
        x8.c.f(f38890b, list, "Division by zero is not supported.", null, 8);
        throw null;
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38891c;
    }

    @Override // x8.h
    public String c() {
        return f38890b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38892d;
    }

    @Override // x8.h
    public boolean f() {
        return f38893e;
    }
}
