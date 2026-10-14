package y8;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class e2 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e2 f38541a = new e2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38542b = "sum";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38544d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38545e;

    static {
        x8.e eVar = x8.e.INTEGER;
        f38543c = kc.k.a(new x8.i(eVar, true));
        f38544d = eVar;
        f38545e = true;
    }

    public e2() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) {
        fd.j0.i(list, "args");
        Long lValueOf = 0L;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            lValueOf = Long.valueOf(((Long) x8.f.f37555c.b(z8.d.c.a.f.b.f45186a, Long.valueOf(lValueOf.longValue()), it.next())).longValue());
        }
        return lValueOf;
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38543c;
    }

    @Override // x8.h
    public String c() {
        return f38542b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38544d;
    }

    @Override // x8.h
    public boolean f() {
        return f38545e;
    }
}
