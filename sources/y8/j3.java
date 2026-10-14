package y8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class j3 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j3 f38663a = new j3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38664b = "toLowerCase";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38667e;

    static {
        x8.e eVar = x8.e.STRING;
        f38665c = kc.k.a(new x8.i(eVar, false, 2, null));
        f38666d = eVar;
        f38667e = true;
    }

    public j3() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) {
        fd.j0.i(list, "args");
        String lowerCase = ((String) list.get(0)).toLowerCase();
        fd.j0.h(lowerCase, "this as java.lang.String).toLowerCase()");
        return lowerCase;
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38665c;
    }

    @Override // x8.h
    public String c() {
        return f38664b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38666d;
    }

    @Override // x8.h
    public boolean f() {
        return f38667e;
    }
}
