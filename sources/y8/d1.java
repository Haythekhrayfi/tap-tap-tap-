package y8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class d1 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x8.n f38514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<x8.i> f38516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x8.e f38517d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(x8.n nVar) {
        super(nVar);
        fd.j0.i(nVar, "variableProvider");
        this.f38514a = nVar;
        this.f38515b = "getIntegerValue";
        x8.e eVar = x8.e.INTEGER;
        this.f38516c = kc.l.c(new x8.i(x8.e.STRING, false, 2, null), new x8.i(eVar, false, 2, null));
        this.f38517d = eVar;
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) {
        fd.j0.i(list, "args");
        String str = (String) list.get(0);
        long jLongValue = ((Long) list.get(1)).longValue();
        Object obj = this.f38514a.get(str);
        Long l10 = obj instanceof Long ? (Long) obj : null;
        return l10 == null ? Long.valueOf(jLongValue) : l10;
    }

    @Override // x8.h
    public List<x8.i> b() {
        return this.f38516c;
    }

    @Override // x8.h
    public String c() {
        return this.f38515b;
    }

    @Override // x8.h
    public x8.e d() {
        return this.f38517d;
    }

    @Override // x8.h
    public boolean f() {
        return false;
    }
}
