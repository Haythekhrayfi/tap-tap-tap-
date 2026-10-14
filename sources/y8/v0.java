package y8;

import com.google.android.material.datepicker.UtcDates;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class v0 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v0 f38884a = new v0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38885b = "formatDateAsUTCWithLocale";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38888e;

    static {
        x8.e eVar = x8.e.STRING;
        f38886c = kc.l.c(new x8.i(x8.e.DATETIME, false, 2, null), new x8.i(eVar, false, 2, null), new x8.i(eVar, false, 2, null));
        f38887d = eVar;
        f38888e = true;
    }

    public v0() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) {
        fd.j0.i(list, "args");
        a9.b bVar = (a9.b) list.get(0);
        String str = (String) list.get(1);
        String str2 = (String) list.get(2);
        c0.b(str);
        Date dateD = c0.d(bVar);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, new Locale.Builder().setLanguageTag(str2).build());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(UtcDates.UTC));
        String str3 = simpleDateFormat.format(dateD);
        fd.j0.h(str3, "sdf.format(date)");
        return str3;
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38886c;
    }

    @Override // x8.h
    public String c() {
        return f38885b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38887d;
    }

    @Override // x8.h
    public boolean f() {
        return f38888e;
    }
}
