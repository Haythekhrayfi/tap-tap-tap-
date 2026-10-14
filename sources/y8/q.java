package y8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f38793a = new q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38794b = "rgb";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38797e;

    static {
        x8.e eVar = x8.e.NUMBER;
        f38795c = kc.l.c(new x8.i(eVar, false, 2, null), new x8.i(eVar, false, 2, null), new x8.i(eVar, false, 2, null));
        f38796d = x8.e.COLOR;
        f38797e = true;
    }

    public q() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) {
        fd.j0.i(list, "args");
        try {
            return new a9.a(a9.a.f201b.a(255, l.a(((Double) list.get(0)).doubleValue()), l.a(((Double) list.get(1)).doubleValue()), l.a(((Double) list.get(2)).doubleValue())));
        } catch (IllegalArgumentException unused) {
            x8.c.f(f38794b, list, "Value out of range 0..1.", null, 8);
            throw null;
        }
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38795c;
    }

    @Override // x8.h
    public String c() {
        return f38794b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38796d;
    }

    @Override // x8.h
    public boolean f() {
        return f38797e;
    }
}
