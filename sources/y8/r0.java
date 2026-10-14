package y8;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class r0 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r0 f38815a = new r0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38816b = "sum";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38819e;

    static {
        x8.e eVar = x8.e.NUMBER;
        f38817c = kc.k.a(new x8.i(eVar, true));
        f38818d = eVar;
        f38819e = true;
    }

    public r0() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) {
        fd.j0.i(list, "args");
        Double dValueOf = Double.valueOf(0.0d);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            dValueOf = Double.valueOf(((Double) x8.f.f37555c.b(z8.d.c.a.f.b.f45186a, Double.valueOf(dValueOf.doubleValue()), it.next())).doubleValue());
        }
        return dValueOf;
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38817c;
    }

    @Override // x8.h
    public String c() {
        return f38816b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38818d;
    }

    @Override // x8.h
    public boolean f() {
        return f38819e;
    }
}
