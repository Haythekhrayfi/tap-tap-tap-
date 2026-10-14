package y8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class g2 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g2 f38589a = new g2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38590b = "toNumber";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38591c = kc.k.a(new x8.i(x8.e.INTEGER, false, 2, null));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38592d = x8.e.NUMBER;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38593e = true;

    public g2() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) {
        fd.j0.i(list, "args");
        return Double.valueOf(((Long) kc.t.r(list)).longValue());
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38591c;
    }

    @Override // x8.h
    public String c() {
        return f38590b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38592d;
    }

    @Override // x8.h
    public boolean f() {
        return f38593e;
    }
}
