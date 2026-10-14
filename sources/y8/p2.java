package y8;

import com.google.android.material.datepicker.UtcDates;
import java.util.List;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class p2 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p2 f38788a = new p2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38789b = "parseUnixTime";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38790c = kc.k.a(new x8.i(x8.e.INTEGER, false, 2, null));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38791d = x8.e.DATETIME;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38792e = true;

    public p2() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) {
        fd.j0.i(list, "args");
        long jLongValue = ((Long) kc.t.r(list)).longValue() * 1000;
        TimeZone timeZone = TimeZone.getTimeZone(UtcDates.UTC);
        fd.j0.h(timeZone, "getTimeZone(\"UTC\")");
        return new a9.b(jLongValue, timeZone);
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38790c;
    }

    @Override // x8.h
    public String c() {
        return f38789b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38791d;
    }

    @Override // x8.h
    public boolean f() {
        return f38792e;
    }
}
