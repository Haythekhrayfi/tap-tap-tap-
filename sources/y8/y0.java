package y8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class y0 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x8.n f38932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<x8.i> f38934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x8.e f38935d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(x8.n nVar) {
        super(nVar);
        fd.j0.i(nVar, "variableProvider");
        this.f38932a = nVar;
        this.f38933b = "getColorValue";
        x8.e eVar = x8.e.COLOR;
        this.f38934c = kc.l.c(new x8.i(x8.e.STRING, false, 2, null), new x8.i(eVar, false, 2, null));
        this.f38935d = eVar;
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) {
        fd.j0.i(list, "args");
        String str = (String) list.get(0);
        int i10 = ((a9.a) list.get(1)).f202a;
        Object obj = this.f38932a.get(str);
        a9.a aVar = obj instanceof a9.a ? (a9.a) obj : null;
        return aVar == null ? new a9.a(i10) : aVar;
    }

    @Override // x8.h
    public List<x8.i> b() {
        return this.f38934c;
    }

    @Override // x8.h
    public String c() {
        return this.f38933b;
    }

    @Override // x8.h
    public x8.e d() {
        return this.f38935d;
    }

    @Override // x8.h
    public boolean f() {
        return false;
    }
}
