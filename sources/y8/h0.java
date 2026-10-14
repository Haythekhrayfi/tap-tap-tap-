package y8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class h0 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h0 f38602a = new h0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38603b = "floor";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38606e;

    static {
        x8.e eVar = x8.e.NUMBER;
        f38604c = kc.k.a(new x8.i(eVar, false, 2, null));
        f38605d = eVar;
        f38606e = true;
    }

    public h0() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) {
        fd.j0.i(list, "args");
        return Double.valueOf(Math.floor(((Double) kc.t.r(list)).doubleValue()));
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38604c;
    }

    @Override // x8.h
    public String c() {
        return f38603b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38605d;
    }

    @Override // x8.h
    public boolean f() {
        return f38606e;
    }
}
