package y8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class i3 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i3 f38639a = new i3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38640b = "toNumber";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38641c = kc.k.a(new x8.i(x8.e.STRING, false, 2, null));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38642d = x8.e.NUMBER;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38643e = true;

    public i3() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) {
        fd.j0.i(list, "args");
        try {
            double d10 = Double.parseDouble((String) kc.t.r(list));
            boolean z10 = true;
            if (!(d10 == Double.POSITIVE_INFINITY)) {
                if (d10 != Double.NEGATIVE_INFINITY) {
                    z10 = false;
                }
                if (!z10) {
                    return Double.valueOf(d10);
                }
            }
            x8.c.f(f38640b, list, "Unable to convert value to Number.", null, 8);
            throw null;
        } catch (NumberFormatException e10) {
            x8.c.e(f38640b, list, "Unable to convert value to Number.", e10);
            throw null;
        }
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38641c;
    }

    @Override // x8.h
    public String c() {
        return f38640b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38642d;
    }

    @Override // x8.h
    public boolean f() {
        return f38643e;
    }
}
