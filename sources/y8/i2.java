package y8;

import java.util.List;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class i2 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i2 f38635a = new i2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38636b = "nowLocal";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38637c = kc.w.f32009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38638d = x8.e.DATETIME;

    public i2() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) {
        fd.j0.i(list, "args");
        long jCurrentTimeMillis = System.currentTimeMillis();
        TimeZone timeZone = TimeZone.getDefault();
        fd.j0.h(timeZone, "getDefault()");
        return new a9.b(jCurrentTimeMillis, timeZone);
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38637c;
    }

    @Override // x8.h
    public String c() {
        return f38636b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38638d;
    }

    @Override // x8.h
    public boolean f() {
        return false;
    }
}
