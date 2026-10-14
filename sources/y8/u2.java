package y8;

import ch.qos.logback.core.CoreConstants;
import java.util.Calendar;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class u2 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u2 f38875a = new u2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38876b = "setMinutes";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38879e;

    static {
        x8.e eVar = x8.e.DATETIME;
        f38877c = kc.l.c(new x8.i(eVar, false, 2, null), new x8.i(x8.e.INTEGER, false, 2, null));
        f38878d = eVar;
        f38879e = true;
    }

    public u2() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) throws x8.b {
        fd.j0.i(list, "args");
        a9.b bVar = (a9.b) list.get(0);
        long jLongValue = ((Long) list.get(1)).longValue();
        if (jLongValue <= 59 && jLongValue >= 0) {
            Calendar calendarC = c0.c(bVar);
            calendarC.set(12, (int) jLongValue);
            return new a9.b(calendarC.getTimeInMillis(), bVar.f206d);
        }
        x8.c.f(f38876b, list, "Expecting minutes in [0..59], instead got " + jLongValue + CoreConstants.DOT, null, 8);
        throw null;
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38877c;
    }

    @Override // x8.h
    public String c() {
        return f38876b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38878d;
    }

    @Override // x8.h
    public boolean f() {
        return f38879e;
    }
}
