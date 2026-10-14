package y8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class w extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f38899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<x8.i> f38900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x8.e f38901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f38902d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w(k kVar) {
        super(null, 1, 0 == true ? 1 : 0);
        fd.j0.i(kVar, "componentSetter");
        this.f38899a = kVar;
        this.f38900b = kc.l.c(new x8.i(x8.e.STRING, false, 2, null), new x8.i(x8.e.NUMBER, false, 2, null));
        this.f38901c = x8.e.COLOR;
        this.f38902d = true;
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) {
        fd.j0.i(list, "args");
        try {
            return this.f38899a.e(kc.l.c(new a9.a(a9.a.f201b.b((String) list.get(0))), list.get(1)));
        } catch (IllegalArgumentException e10) {
            x8.c.e(c(), list, "Unable to convert value to Color, expected format #AARRGGBB.", e10);
            throw null;
        }
    }

    @Override // x8.h
    public List<x8.i> b() {
        return this.f38900b;
    }

    @Override // x8.h
    public x8.e d() {
        return this.f38901c;
    }

    @Override // x8.h
    public boolean f() {
        return this.f38902d;
    }
}
