package y8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class f3 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f3 f38569a = new f3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38570b = "substring";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38573e;

    static {
        x8.e eVar = x8.e.STRING;
        x8.e eVar2 = x8.e.INTEGER;
        f38571c = kc.l.c(new x8.i(eVar, false, 2, null), new x8.i(eVar2, false, 2, null), new x8.i(eVar2, false, 2, null));
        f38572d = eVar;
        f38573e = true;
    }

    public f3() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) {
        fd.j0.i(list, "args");
        String str = (String) list.get(0);
        long jLongValue = ((Long) list.get(1)).longValue();
        long jLongValue2 = ((Long) list.get(2)).longValue();
        if (jLongValue < 0 || jLongValue2 > str.length()) {
            x8.c.f(f38570b, list, "Indexes are out of bounds.", null, 8);
            throw null;
        }
        if (jLongValue > jLongValue2) {
            x8.c.f(f38570b, list, "Indexes should be in ascending order.", null, 8);
            throw null;
        }
        String strSubstring = str.substring((int) jLongValue, (int) jLongValue2);
        fd.j0.h(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38571c;
    }

    @Override // x8.h
    public String c() {
        return f38570b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38572d;
    }

    @Override // x8.h
    public boolean f() {
        return f38573e;
    }
}
