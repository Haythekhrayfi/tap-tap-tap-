package y8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class p1 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x8.n f38784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<x8.i> f38786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x8.e f38787d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(x8.n nVar) {
        super(nVar);
        fd.j0.i(nVar, "variableProvider");
        this.f38784a = nVar;
        this.f38785b = "getNumberValue";
        x8.e eVar = x8.e.NUMBER;
        this.f38786c = kc.l.c(new x8.i(x8.e.STRING, false, 2, null), new x8.i(eVar, false, 2, null));
        this.f38787d = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x002b  */
    @Override // x8.h
    public Object a(List<? extends Object> list) {
        Number number;
        fd.j0.i(list, "args");
        String str = (String) list.get(0);
        Number number2 = (Number) list.get(1);
        if (this.f38784a.get(str) instanceof Long) {
            number = null;
        } else {
            Object obj = this.f38784a.get(str);
            if (obj instanceof Number) {
                number = (Number) obj;
            } else {
                number = null;
            }
        }
        return number == null ? number2 : number;
    }

    @Override // x8.h
    public List<x8.i> b() {
        return this.f38786c;
    }

    @Override // x8.h
    public String c() {
        return this.f38785b;
    }

    @Override // x8.h
    public x8.e d() {
        return this.f38787d;
    }

    @Override // x8.h
    public boolean f() {
        return false;
    }
}
