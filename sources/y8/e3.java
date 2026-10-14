package y8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class e3 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e3 f38546a = new e3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38547b = "replaceAll";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38549d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38550e;

    static {
        x8.e eVar = x8.e.STRING;
        f38548c = kc.l.c(new x8.i(eVar, false, 2, null), new x8.i(eVar, false, 2, null), new x8.i(eVar, false, 2, null));
        f38549d = eVar;
        f38550e = true;
    }

    public e3() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) {
        fd.j0.i(list, "args");
        String str = (String) list.get(0);
        String str2 = (String) list.get(1);
        return str2.length() == 0 ? str : ed.q.o(str, str2, (String) list.get(2), false);
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38548c;
    }

    @Override // x8.h
    public String c() {
        return f38547b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38549d;
    }

    @Override // x8.h
    public boolean f() {
        return f38550e;
    }
}
