package y8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class y2 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y2 f38941a = new y2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38942b = "contains";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38945e;

    static {
        x8.e eVar = x8.e.STRING;
        f38943c = kc.l.c(new x8.i(eVar, false, 2, null), new x8.i(eVar, false, 2, null));
        f38944d = x8.e.BOOLEAN;
        f38945e = true;
    }

    public y2() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) {
        fd.j0.i(list, "args");
        return Boolean.valueOf(ed.u.v((String) list.get(0), (String) list.get(1), false));
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38943c;
    }

    @Override // x8.h
    public String c() {
        return f38942b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38944d;
    }

    @Override // x8.h
    public boolean f() {
        return f38945e;
    }
}
