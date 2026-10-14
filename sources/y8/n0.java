package y8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class n0 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n0 f38738a = new n0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38739b = "mul";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38741d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38742e;

    static {
        x8.e eVar = x8.e.NUMBER;
        f38740c = kc.k.a(new x8.i(eVar, true));
        f38741d = eVar;
        f38742e = true;
    }

    public n0() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) {
        fd.j0.i(list, "args");
        Double dValueOf = Double.valueOf(0.0d);
        int i10 = 0;
        for (Object objA : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                kc.l.i();
                throw null;
            }
            double dDoubleValue = dValueOf.doubleValue();
            if (i10 != 0) {
                objA = x8.f.f37555c.a(z8.d.c.a.InterfaceC0495c.C0497c.f45181a, Double.valueOf(dDoubleValue), objA);
            }
            dValueOf = Double.valueOf(((Double) objA).doubleValue());
            i10 = i11;
        }
        return dValueOf;
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38740c;
    }

    @Override // x8.h
    public String c() {
        return f38739b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38741d;
    }

    @Override // x8.h
    public boolean f() {
        return f38742e;
    }
}
