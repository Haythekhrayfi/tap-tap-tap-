package y8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class b0 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0 f38468a = new b0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38469b = "toString";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38470c = kc.k.a(new x8.i(x8.e.COLOR, false, 2, null));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38471d = x8.e.STRING;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38472e = true;

    public b0() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) {
        fd.j0.i(list, "args");
        return a9.a.a(((a9.a) kc.t.r(list)).f202a);
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38470c;
    }

    @Override // x8.h
    public String c() {
        return f38469b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38471d;
    }

    @Override // x8.h
    public boolean f() {
        return f38472e;
    }
}
