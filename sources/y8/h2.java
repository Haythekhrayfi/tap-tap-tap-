package y8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class h2 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h2 f38612a = new h2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38613b = "toString";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38614c = kc.k.a(new x8.i(x8.e.INTEGER, false, 2, null));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38615d = x8.e.STRING;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38616e = true;

    public h2() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) {
        fd.j0.i(list, "args");
        return String.valueOf(((Long) kc.t.r(list)).longValue());
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38614c;
    }

    @Override // x8.h
    public String c() {
        return f38613b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38615d;
    }

    @Override // x8.h
    public boolean f() {
        return f38616e;
    }
}
