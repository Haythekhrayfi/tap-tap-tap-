package y8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f38574a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38575b = "argb";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38577d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38578e;

    static {
        x8.e eVar = x8.e.NUMBER;
        f38576c = kc.l.c(new x8.i(eVar, false, 2, null), new x8.i(eVar, false, 2, null), new x8.i(eVar, false, 2, null), new x8.i(eVar, false, 2, null));
        f38577d = x8.e.COLOR;
        f38578e = true;
    }

    public g() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) {
        fd.j0.i(list, "args");
        try {
            return new a9.a(a9.a.f201b.a(l.a(((Double) list.get(0)).doubleValue()), l.a(((Double) list.get(1)).doubleValue()), l.a(((Double) list.get(2)).doubleValue()), l.a(((Double) list.get(3)).doubleValue())));
        } catch (IllegalArgumentException unused) {
            x8.c.f(f38575b, list, "Value out of range 0..1.", null, 8);
            throw null;
        }
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38576c;
    }

    @Override // x8.h
    public String c() {
        return f38575b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38577d;
    }

    @Override // x8.h
    public boolean f() {
        return f38578e;
    }
}
