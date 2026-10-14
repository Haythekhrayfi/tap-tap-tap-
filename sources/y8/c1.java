package y8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class c1 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c1 f38493a = new c1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38494b = "getHours";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38495c = kc.k.a(new x8.i(x8.e.DATETIME, false, 2, null));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38496d = x8.e.INTEGER;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38497e = true;

    public c1() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) throws x8.b {
        fd.j0.i(list, "args");
        return Long.valueOf(c0.c((a9.b) list.get(0)).get(11));
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38495c;
    }

    @Override // x8.h
    public String c() {
        return f38494b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38496d;
    }

    @Override // x8.h
    public boolean f() {
        return f38497e;
    }
}
