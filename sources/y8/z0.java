package y8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class z0 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x8.n f38948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<x8.i> f38950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x8.e f38951d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(x8.n nVar) {
        super(nVar);
        fd.j0.i(nVar, "variableProvider");
        this.f38948a = nVar;
        this.f38949b = "getColorValue";
        x8.e eVar = x8.e.STRING;
        this.f38950c = kc.l.c(new x8.i(eVar, false, 2, null), new x8.i(eVar, false, 2, null));
        this.f38951d = x8.e.COLOR;
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) {
        fd.j0.i(list, "args");
        String str = (String) list.get(0);
        int iB = a9.a.f201b.b((String) list.get(1));
        Object obj = this.f38948a.get(str);
        a9.a aVar = obj instanceof a9.a ? (a9.a) obj : null;
        return aVar == null ? new a9.a(iB) : aVar;
    }

    @Override // x8.h
    public List<x8.i> b() {
        return this.f38950c;
    }

    @Override // x8.h
    public String c() {
        return this.f38949b;
    }

    @Override // x8.h
    public x8.e d() {
        return this.f38951d;
    }

    @Override // x8.h
    public boolean f() {
        return false;
    }
}
