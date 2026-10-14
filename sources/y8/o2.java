package y8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class o2 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o2 f38771a = new o2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38772b = "padStart";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38774d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38775e;

    static {
        x8.e eVar = x8.e.STRING;
        f38773c = kc.l.c(new x8.i(eVar, false, 2, null), new x8.i(x8.e.INTEGER, false, 2, null), new x8.i(eVar, false, 2, null));
        f38774d = eVar;
        f38775e = true;
    }

    public o2() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) {
        fd.j0.i(list, "args");
        String str = (String) list.get(0);
        long jLongValue = ((Long) list.get(1)).longValue();
        return fd.j0.p(c0.a((int) (jLongValue - ((long) str.length())), (String) list.get(2)), str);
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38773c;
    }

    @Override // x8.h
    public String c() {
        return f38772b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38774d;
    }

    @Override // x8.h
    public boolean f() {
        return f38775e;
    }
}
