package y8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class m1 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m1 f38720a = new m1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38721b = "getMillis";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38722c = kc.k.a(new x8.i(x8.e.DATETIME, false, 2, null));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38723d = x8.e.INTEGER;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38724e = true;

    public m1() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) throws x8.b {
        fd.j0.i(list, "args");
        return Long.valueOf(c0.c((a9.b) list.get(0)).get(14));
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38722c;
    }

    @Override // x8.h
    public String c() {
        return f38721b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38723d;
    }

    @Override // x8.h
    public boolean f() {
        return f38724e;
    }
}
