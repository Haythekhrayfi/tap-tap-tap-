package y8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class d2 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d2 f38518a = new d2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38519b = "sub";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38522e;

    static {
        x8.e eVar = x8.e.INTEGER;
        f38520c = kc.k.a(new x8.i(eVar, true));
        f38521d = eVar;
        f38522e = true;
    }

    public d2() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) {
        fd.j0.i(list, "args");
        Long lValueOf = 0L;
        int i10 = 0;
        for (Object objB : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                kc.l.i();
                throw null;
            }
            long jLongValue = lValueOf.longValue();
            if (i10 != 0) {
                objB = x8.f.f37555c.b(z8.d.c.a.f.C0500a.f45185a, Long.valueOf(jLongValue), objB);
            }
            lValueOf = Long.valueOf(((Long) objB).longValue());
            i10 = i11;
        }
        return lValueOf;
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38520c;
    }

    @Override // x8.h
    public String c() {
        return f38519b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38521d;
    }

    @Override // x8.h
    public boolean f() {
        return f38522e;
    }
}
