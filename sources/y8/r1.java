package y8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class r1 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x8.n f38820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<x8.i> f38822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x8.e f38823d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(x8.n nVar) {
        super(nVar);
        fd.j0.i(nVar, "variableProvider");
        this.f38820a = nVar;
        this.f38821b = "getStringValue";
        x8.e eVar = x8.e.STRING;
        this.f38822c = kc.l.c(new x8.i(eVar, false, 2, null), new x8.i(eVar, false, 2, null));
        this.f38823d = eVar;
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) {
        fd.j0.i(list, "args");
        String str = (String) list.get(0);
        String str2 = (String) list.get(1);
        Object obj = this.f38820a.get(str);
        String str3 = obj instanceof String ? (String) obj : null;
        return str3 == null ? str2 : str3;
    }

    @Override // x8.h
    public List<x8.i> b() {
        return this.f38822c;
    }

    @Override // x8.h
    public String c() {
        return this.f38821b;
    }

    @Override // x8.h
    public x8.e d() {
        return this.f38823d;
    }

    @Override // x8.h
    public boolean f() {
        return false;
    }
}
