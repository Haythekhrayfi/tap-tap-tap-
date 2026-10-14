package y8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class k3 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k3 f38687a = new k3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38688b = "toUpperCase";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38691e;

    static {
        x8.e eVar = x8.e.STRING;
        f38689c = kc.k.a(new x8.i(eVar, false, 2, null));
        f38690d = eVar;
        f38691e = true;
    }

    public k3() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) {
        fd.j0.i(list, "args");
        String upperCase = ((String) list.get(0)).toUpperCase();
        fd.j0.h(upperCase, "this as java.lang.String).toUpperCase()");
        return upperCase;
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38689c;
    }

    @Override // x8.h
    public String c() {
        return f38688b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38690d;
    }

    @Override // x8.h
    public boolean f() {
        return f38691e;
    }
}
