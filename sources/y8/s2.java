package y8;

import ch.qos.logback.core.CoreConstants;
import java.util.Calendar;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class s2 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s2 f38841a = new s2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38842b = "setHours";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38845e;

    static {
        x8.e eVar = x8.e.DATETIME;
        f38843c = kc.l.c(new x8.i(eVar, false, 2, null), new x8.i(x8.e.INTEGER, false, 2, null));
        f38844d = eVar;
        f38845e = true;
    }

    public s2() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) throws x8.b {
        fd.j0.i(list, "args");
        a9.b bVar = (a9.b) list.get(0);
        long jLongValue = ((Long) list.get(1)).longValue();
        if (jLongValue <= 23 && jLongValue >= 0) {
            Calendar calendarC = c0.c(bVar);
            calendarC.setTimeInMillis(bVar.f205c);
            calendarC.set(11, (int) jLongValue);
            return new a9.b(calendarC.getTimeInMillis(), bVar.f206d);
        }
        x8.c.f(f38842b, list, "Expecting hours in [0..23], instead got " + jLongValue + CoreConstants.DOT, null, 8);
        throw null;
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38843c;
    }

    @Override // x8.h
    public String c() {
        return f38842b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38844d;
    }

    @Override // x8.h
    public boolean f() {
        return f38845e;
    }
}
