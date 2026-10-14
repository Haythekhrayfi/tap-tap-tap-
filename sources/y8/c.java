package y8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f38488a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38489b = "toString";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38490c = kc.k.a(new x8.i(x8.e.BOOLEAN, false, 2, null));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38491d = x8.e.STRING;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38492e = true;

    public c() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) {
        fd.j0.i(list, "args");
        return ((Boolean) kc.t.r(list)).booleanValue() ? "true" : "false";
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38490c;
    }

    @Override // x8.h
    public String c() {
        return f38489b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38491d;
    }

    @Override // x8.h
    public boolean f() {
        return f38492e;
    }
}
