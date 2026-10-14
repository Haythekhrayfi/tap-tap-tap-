package y8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class q0 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q0 f38798a = new q0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38799b = "sub";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38801d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38802e;

    static {
        x8.e eVar = x8.e.NUMBER;
        f38800c = kc.k.a(new x8.i(eVar, true));
        f38801d = eVar;
        f38802e = true;
    }

    public q0() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) {
        fd.j0.i(list, "args");
        Double dValueOf = Double.valueOf(0.0d);
        int i10 = 0;
        for (Object objB : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                kc.l.i();
                throw null;
            }
            double dDoubleValue = dValueOf.doubleValue();
            if (i10 != 0) {
                objB = x8.f.f37555c.b(z8.d.c.a.f.C0500a.f45185a, Double.valueOf(dDoubleValue), objB);
            }
            dValueOf = Double.valueOf(((Double) objB).doubleValue());
            i10 = i11;
        }
        return dValueOf;
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38800c;
    }

    @Override // x8.h
    public String c() {
        return f38799b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38801d;
    }

    @Override // x8.h
    public boolean f() {
        return f38802e;
    }
}
