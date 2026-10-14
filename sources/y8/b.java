package y8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f38463a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38464b = "toInteger";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38465c = kc.k.a(new x8.i(x8.e.BOOLEAN, false, 2, null));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38466d = x8.e.INTEGER;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38467e = true;

    public b() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) {
        fd.j0.i(list, "args");
        return Long.valueOf(((Boolean) kc.t.r(list)).booleanValue() ? 1L : 0L);
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38465c;
    }

    @Override // x8.h
    public String c() {
        return f38464b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38466d;
    }

    @Override // x8.h
    public boolean f() {
        return f38467e;
    }
}
