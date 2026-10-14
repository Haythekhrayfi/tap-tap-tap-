package y8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class c2 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c2 f38498a = new c2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38499b = "signum";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38501d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38502e;

    static {
        x8.e eVar = x8.e.INTEGER;
        f38500c = kc.k.a(new x8.i(eVar, false, 2, null));
        f38501d = eVar;
        f38502e = true;
    }

    public c2() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) {
        fd.j0.i(list, "args");
        return Long.valueOf(xc.b.a(((Long) kc.t.r(list)).longValue()));
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38500c;
    }

    @Override // x8.h
    public String c() {
        return f38499b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38501d;
    }

    @Override // x8.h
    public boolean f() {
        return f38502e;
    }
}
