package y8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class n2 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n2 f38748a = new n2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38749b = "padStart";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38752e;

    static {
        x8.e eVar = x8.e.INTEGER;
        x8.e eVar2 = x8.e.STRING;
        f38750c = kc.l.c(new x8.i(eVar, false, 2, null), new x8.i(eVar, false, 2, null), new x8.i(eVar2, false, 2, null));
        f38751d = eVar2;
        f38752e = true;
    }

    public n2() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) {
        fd.j0.i(list, "args");
        String strValueOf = String.valueOf(((Long) list.get(0)).longValue());
        long jLongValue = ((Long) list.get(1)).longValue();
        return fd.j0.p(c0.a((int) (jLongValue - ((long) strValueOf.length())), (String) list.get(2)), strValueOf);
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38750c;
    }

    @Override // x8.h
    public String c() {
        return f38749b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38751d;
    }

    @Override // x8.h
    public boolean f() {
        return f38752e;
    }
}
