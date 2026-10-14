package y8;

import ch.qos.logback.core.CoreConstants;
import java.util.Calendar;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class t2 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t2 f38858a = new t2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38859b = "setMillis";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38862e;

    static {
        x8.e eVar = x8.e.DATETIME;
        f38860c = kc.l.c(new x8.i(eVar, false, 2, null), new x8.i(x8.e.INTEGER, false, 2, null));
        f38861d = eVar;
        f38862e = true;
    }

    public t2() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) throws x8.b {
        fd.j0.i(list, "args");
        a9.b bVar = (a9.b) list.get(0);
        long jLongValue = ((Long) list.get(1)).longValue();
        if (jLongValue <= 999 && jLongValue >= 0) {
            Calendar calendarC = c0.c(bVar);
            calendarC.set(14, (int) jLongValue);
            return new a9.b(calendarC.getTimeInMillis(), bVar.f206d);
        }
        x8.c.f(f38859b, list, "Expecting millis in [0..999], instead got " + jLongValue + CoreConstants.DOT, null, 8);
        throw null;
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38860c;
    }

    @Override // x8.h
    public String c() {
        return f38859b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38861d;
    }

    @Override // x8.h
    public boolean f() {
        return f38862e;
    }
}
