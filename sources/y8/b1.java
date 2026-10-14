package y8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class b1 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b1 f38473a = new b1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38474b = "getDayOfWeek";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38475c = kc.k.a(new x8.i(x8.e.DATETIME, false, 2, null));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38476d = x8.e.INTEGER;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38477e = true;

    public b1() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) throws x8.b {
        fd.j0.i(list, "args");
        int i10 = c0.c((a9.b) list.get(0)).get(7) - 1;
        return Long.valueOf(i10 == 0 ? 7L : i10);
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38475c;
    }

    @Override // x8.h
    public String c() {
        return f38474b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38476d;
    }

    @Override // x8.h
    public boolean f() {
        return f38477e;
    }
}
