package y8;

import com.google.android.material.datepicker.UtcDates;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class u0 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u0 f38865a = new u0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38866b = "formatDateAsUTC";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38868d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38869e;

    static {
        x8.e eVar = x8.e.STRING;
        f38867c = kc.l.c(new x8.i(x8.e.DATETIME, false, 2, null), new x8.i(eVar, false, 2, null));
        f38868d = eVar;
        f38869e = true;
    }

    public u0() {
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
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(UtcDates.UTC));
        String str2 = simpleDateFormat.format(dateD);
        fd.j0.h(str2, "sdf.format(date)");
        return str2;
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38867c;
    }

    @Override // x8.h
    public String c() {
        return f38866b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38868d;
    }

    @Override // x8.h
    public boolean f() {
        return f38869e;
    }
}
