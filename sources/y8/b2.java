package y8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class b2 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b2 f38478a = new b2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38479b = "mul";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38482e;

    static {
        x8.e eVar = x8.e.INTEGER;
        f38480c = kc.k.a(new x8.i(eVar, true));
        f38481d = eVar;
        f38482e = true;
    }

    public b2() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) {
        fd.j0.i(list, "args");
        Long lValueOf = 0L;
        int i10 = 0;
        for (Object objA : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                kc.l.i();
                throw null;
            }
            long jLongValue = lValueOf.longValue();
            if (i10 != 0) {
                objA = x8.f.f37555c.a(z8.d.c.a.InterfaceC0495c.C0497c.f45181a, Long.valueOf(jLongValue), objA);
            }
            lValueOf = Long.valueOf(((Long) objA).longValue());
            i10 = i11;
        }
        return lValueOf;
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38480c;
    }

    @Override // x8.h
    public String c() {
        return f38479b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38481d;
    }

    @Override // x8.h
    public boolean f() {
        return f38482e;
    }
}
