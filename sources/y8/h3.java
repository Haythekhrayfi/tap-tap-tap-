package y8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class h3 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h3 f38617a = new h3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38618b = "toInteger";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38619c = kc.k.a(new x8.i(x8.e.STRING, false, 2, null));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38620d = x8.e.INTEGER;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38621e = true;

    public h3() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) {
        fd.j0.i(list, "args");
        try {
            return Long.valueOf(Long.parseLong((String) kc.t.r(list)));
        } catch (NumberFormatException e10) {
            x8.c.e(f38618b, list, "Unable to convert value to Integer.", e10);
            throw null;
        }
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38619c;
    }

    @Override // x8.h
    public String c() {
        return f38618b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38620d;
    }

    @Override // x8.h
    public boolean f() {
        return f38621e;
    }
}
