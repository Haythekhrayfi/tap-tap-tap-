package y8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class j0 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j0 f38648a = new j0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38649b = "maxNumber";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38650c = kc.w.f32009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38651d = x8.e.NUMBER;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38652e = true;

    public j0() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List list) {
        fd.j0.i(list, "args");
        return Double.valueOf(Double.MAX_VALUE);
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38650c;
    }

    @Override // x8.h
    public String c() {
        return f38649b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38651d;
    }

    @Override // x8.h
    public boolean f() {
        return f38652e;
    }
}
