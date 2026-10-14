package y8;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class s0 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s0 f38831a = new s0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38832b = "formatDateAsLocal";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38834d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38835e;

    static {
        x8.e eVar = x8.e.STRING;
        f38833c = kc.l.c(new x8.i(x8.e.DATETIME, false, 2, null), new x8.i(eVar, false, 2, null));
        f38834d = eVar;
        f38835e = true;
    }

    public s0() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) {
        fd.j0.i(list, "args");
        a9.b bVar = (a9.b) list.get(0);
        String str = (String) list.get(1);
        c0.b(str);
        Date dateD = c0.d(bVar);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        String str2 = simpleDateFormat.format(dateD);
        fd.j0.h(str2, "sdf.format(date)");
        return str2;
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38833c;
    }

    @Override // x8.h
    public String c() {
        return f38832b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38834d;
    }

    @Override // x8.h
    public boolean f() {
        return f38835e;
    }
}
