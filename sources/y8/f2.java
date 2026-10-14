package y8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class f2 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f2 f38564a = new f2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38565b = "toBoolean";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38566c = kc.k.a(new x8.i(x8.e.INTEGER, false, 2, null));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38567d = x8.e.BOOLEAN;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38568e = true;

    public f2() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) {
        boolean z10;
        fd.j0.i(list, "args");
        long jLongValue = ((Long) kc.t.r(list)).longValue();
        if (jLongValue == 0) {
            z10 = false;
        } else {
            if (jLongValue != 1) {
                x8.c.f(f38565b, list, "Unable to convert value to Boolean.", null, 8);
                throw null;
            }
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38566c;
    }

    @Override // x8.h
    public String c() {
        return f38565b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38567d;
    }

    @Override // x8.h
    public boolean f() {
        return f38568e;
    }
}
