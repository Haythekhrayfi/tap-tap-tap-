package y8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class b3 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b3 f38483a = new b3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38484b = "index";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38487e;

    static {
        x8.e eVar = x8.e.STRING;
        f38485c = kc.l.c(new x8.i(eVar, false, 2, null), new x8.i(eVar, false, 2, null));
        f38486d = x8.e.INTEGER;
        f38487e = true;
    }

    public b3() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) {
        fd.j0.i(list, "args");
        return Long.valueOf(ed.u.E((String) list.get(0), (String) list.get(1), 0, false, 2));
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38485c;
    }

    @Override // x8.h
    public String c() {
        return f38484b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38486d;
    }

    @Override // x8.h
    public boolean f() {
        return f38487e;
    }
}
