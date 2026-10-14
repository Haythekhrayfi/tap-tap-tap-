package y8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f38441a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38442b = "addMillis";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38445e;

    static {
        x8.e eVar = x8.e.DATETIME;
        f38443c = kc.l.c(new x8.i(eVar, false, 2, null), new x8.i(x8.e.INTEGER, false, 2, null));
        f38444d = eVar;
        f38445e = true;
    }

    public a() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) {
        fd.j0.i(list, "args");
        a9.b bVar = (a9.b) list.get(0);
        return new a9.b(bVar.f205c + ((Long) list.get(1)).longValue(), bVar.f206d);
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38443c;
    }

    @Override // x8.h
    public String c() {
        return f38442b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38444d;
    }

    @Override // x8.h
    public boolean f() {
        return f38445e;
    }
}
