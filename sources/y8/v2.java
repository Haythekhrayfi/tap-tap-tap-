package y8;

import ch.qos.logback.core.CoreConstants;
import java.util.Calendar;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class v2 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v2 f38894a = new v2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38895b = "setMonth";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38897d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38898e;

    static {
        x8.e eVar = x8.e.DATETIME;
        f38896c = kc.l.c(new x8.i(eVar, false, 2, null), new x8.i(x8.e.INTEGER, false, 2, null));
        f38897d = eVar;
        f38898e = true;
    }

    public v2() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) throws x8.b {
        fd.j0.i(list, "args");
        a9.b bVar = (a9.b) list.get(0);
        long jLongValue = ((Long) list.get(1)).longValue();
        if (jLongValue <= 12 && jLongValue >= 1) {
            Calendar calendarC = c0.c(bVar);
            calendarC.set(2, (int) (jLongValue - 1));
            return new a9.b(calendarC.getTimeInMillis(), bVar.f206d);
        }
        x8.c.f(f38895b, list, "Expecting month in [1..12], instead got " + jLongValue + CoreConstants.DOT, null, 8);
        throw null;
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38896c;
    }

    @Override // x8.h
    public String c() {
        return f38895b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38897d;
    }

    @Override // x8.h
    public boolean f() {
        return f38898e;
    }
}
