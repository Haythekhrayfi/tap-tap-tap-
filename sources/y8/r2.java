package y8;

import ch.qos.logback.core.CoreConstants;
import java.util.Calendar;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class r2 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r2 f38824a = new r2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38825b = "setDay";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38827d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38828e;

    static {
        x8.e eVar = x8.e.DATETIME;
        f38826c = kc.l.c(new x8.i(eVar, false, 2, null), new x8.i(x8.e.INTEGER, false, 2, null));
        f38827d = eVar;
        f38828e = true;
    }

    public r2() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) throws x8.b {
        fd.j0.i(list, "args");
        a9.b bVar = (a9.b) list.get(0);
        long jLongValue = ((Long) list.get(1)).longValue();
        Calendar calendarC = c0.c(bVar);
        if (1 <= jLongValue && jLongValue <= ((long) calendarC.getActualMaximum(5))) {
            calendarC.set(5, (int) jLongValue);
        } else {
            if (jLongValue != -1) {
                x8.c.f(f38825b, list, "Unable to set day " + jLongValue + " for date " + bVar + CoreConstants.DOT, null, 8);
                throw null;
            }
            calendarC.set(5, 0);
        }
        return new a9.b(calendarC.getTimeInMillis(), bVar.f206d);
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38826c;
    }

    @Override // x8.h
    public String c() {
        return f38825b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38827d;
    }

    @Override // x8.h
    public boolean f() {
        return f38828e;
    }
}
