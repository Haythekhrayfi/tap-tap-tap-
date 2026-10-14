package y8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class t1 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t1 f38853a = new t1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38854b = "abs";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38857e;

    static {
        x8.e eVar = x8.e.INTEGER;
        f38855c = kc.k.a(new x8.i(eVar, false, 2, null));
        f38856d = eVar;
        f38857e = true;
    }

    public t1() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) {
        fd.j0.i(list, "args");
        long jLongValue = ((Long) kc.t.r(list)).longValue();
        if (jLongValue != Long.MIN_VALUE) {
            return Long.valueOf(Math.abs(jLongValue));
        }
        x8.c.f(f38854b, list, "Integer overflow.", null, 8);
        throw null;
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38855c;
    }

    @Override // x8.h
    public String c() {
        return f38854b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38856d;
    }

    @Override // x8.h
    public boolean f() {
        return f38857e;
    }
}
