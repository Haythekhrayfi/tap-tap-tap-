package y8;

import java.util.List;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class q2 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q2 f38808a = new q2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38809b = "parseUnixTimeAsLocal";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38810c = kc.k.a(new x8.i(x8.e.INTEGER, false, 2, null));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38811d = x8.e.DATETIME;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38812e = true;

    public q2() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) {
        fd.j0.i(list, "args");
        long jLongValue = ((Long) kc.t.r(list)).longValue() * 1000;
        TimeZone timeZone = TimeZone.getDefault();
        fd.j0.h(timeZone, "getDefault()");
        return new a9.b(jLongValue, timeZone);
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38810c;
    }

    @Override // x8.h
    public String c() {
        return f38809b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38811d;
    }

    @Override // x8.h
    public boolean f() {
        return f38812e;
    }
}
