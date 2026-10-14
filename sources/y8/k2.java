package y8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class k2 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k2 f38682a = new k2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38683b = "toString";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38684c = kc.k.a(new x8.i(x8.e.NUMBER, false, 2, null));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38685d = x8.e.STRING;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38686e = true;

    public k2() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) {
        fd.j0.i(list, "args");
        return String.valueOf(((Double) kc.t.r(list)).doubleValue());
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38684c;
    }

    @Override // x8.h
    public String c() {
        return f38683b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38685d;
    }

    @Override // x8.h
    public boolean f() {
        return f38686e;
    }
}
