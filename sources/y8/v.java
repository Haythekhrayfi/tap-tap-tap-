package y8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class v extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f38880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<x8.i> f38881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x8.e f38882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f38883d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public v(j jVar) {
        super(null, 1, 0 == true ? 1 : 0);
        fd.j0.i(jVar, "componentGetter");
        this.f38880a = jVar;
        this.f38881b = kc.k.a(new x8.i(x8.e.STRING, false, 2, null));
        this.f38882c = x8.e.NUMBER;
        this.f38883d = true;
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) {
        fd.j0.i(list, "args");
        try {
            return this.f38880a.e(kc.k.a(new a9.a(a9.a.f201b.b((String) kc.t.r(list)))));
        } catch (IllegalArgumentException e10) {
            x8.c.e(c(), list, "Unable to convert value to Color, expected format #AARRGGBB.", e10);
            throw null;
        }
    }

    @Override // x8.h
    public List<x8.i> b() {
        return this.f38881b;
    }

    @Override // x8.h
    public x8.e d() {
        return this.f38882c;
    }

    @Override // x8.h
    public boolean f() {
        return this.f38883d;
    }
}
