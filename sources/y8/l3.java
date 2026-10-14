package y8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class l3 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l3 f38707a = new l3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38708b = "trim";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38710d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38711e;

    static {
        x8.e eVar = x8.e.STRING;
        f38709c = kc.k.a(new x8.i(eVar, false, 2, null));
        f38710d = eVar;
        f38711e = true;
    }

    public l3() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) {
        fd.j0.i(list, "args");
        return ed.u.Y((String) list.get(0)).toString();
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38709c;
    }

    @Override // x8.h
    public String c() {
        return f38708b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38710d;
    }

    @Override // x8.h
    public boolean f() {
        return f38711e;
    }
}
