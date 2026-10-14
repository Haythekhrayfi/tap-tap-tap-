package y8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class g3 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g3 f38594a = new g3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38595b = "toBoolean";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38596c = kc.k.a(new x8.i(x8.e.STRING, false, 2, null));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38597d = x8.e.BOOLEAN;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38598e = true;

    public g3() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) {
        boolean z10;
        fd.j0.i(list, "args");
        String str = (String) kc.t.r(list);
        if (fd.j0.d(str, "true")) {
            z10 = true;
        } else {
            if (!fd.j0.d(str, "false")) {
                x8.c.f(f38595b, list, "Unable to convert value to Boolean.", null, 8);
                throw null;
            }
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38596c;
    }

    @Override // x8.h
    public String c() {
        return f38595b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38597d;
    }

    @Override // x8.h
    public boolean f() {
        return f38598e;
    }
}
