package y8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class x0 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x8.n f38916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<x8.i> f38918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x8.e f38919d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(x8.n nVar) {
        super(nVar);
        fd.j0.i(nVar, "variableProvider");
        this.f38916a = nVar;
        this.f38917b = "getBooleanValue";
        x8.e eVar = x8.e.BOOLEAN;
        this.f38918c = kc.l.c(new x8.i(x8.e.STRING, false, 2, null), new x8.i(eVar, false, 2, null));
        this.f38919d = eVar;
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) {
        fd.j0.i(list, "args");
        String str = (String) list.get(0);
        boolean zBooleanValue = ((Boolean) list.get(1)).booleanValue();
        Object obj = this.f38916a.get(str);
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        return bool == null ? Boolean.valueOf(zBooleanValue) : bool;
    }

    @Override // x8.h
    public List<x8.i> b() {
        return this.f38918c;
    }

    @Override // x8.h
    public String c() {
        return this.f38917b;
    }

    @Override // x8.h
    public x8.e d() {
        return this.f38919d;
    }

    @Override // x8.h
    public boolean f() {
        return false;
    }
}
