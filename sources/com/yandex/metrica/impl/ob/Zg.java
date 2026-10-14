package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class Zg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Fm<Fg.a, Integer> f15683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f15684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f15685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f15686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f15687e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Wn f15688f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final W0 f15689g;

    public static final class a<T> implements Comparator<T> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return lc.a.a((Comparable) ((jc.h) t10).f31812d, (Comparable) ((jc.h) t11).f31812d);
        }
    }

    public static final class b<T> implements Comparator<Fg> {
        public b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final int compare(Fg fg, Fg fg2) {
            int iA = xc.b.a(fg.f14002c - fg2.f14002c);
            if (iA != 0) {
                return iA;
            }
            int iIntValue = ((Number) Zg.this.f15683a.a(fg.f14003d)).intValue();
            Object objA = Zg.this.f15683a.a(fg2.f14003d);
            fd.j0.h(objA, "sourcePriorities[second.source]");
            return iIntValue - ((Number) objA).intValue();
        }
    }

    public Zg(Context context, Wn wn, W0 w10) {
        this.f15687e = context;
        this.f15688f = wn;
        this.f15689g = w10;
        Fm<Fg.a, Integer> fm = new Fm<>(0);
        fm.a(Fg.a.HMS, 1);
        fm.a(Fg.a.GP, 2);
        this.f15683a = fm;
        this.f15684b = TimeUnit.DAYS.toSeconds(1L);
        this.f15685c = "com.android.vending";
        this.f15686d = "com.huawei.appmarket";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Zg(Context context, Wn wn, W0 w10, int i10) {
        W0 w0A = null;
        Wn wn2 = (i10 & 2) != 0 ? new Wn() : null;
        if ((i10 & 4) != 0) {
            w0A = Oh.a();
            fd.j0.h(w0A, "YandexMetricaSelfReportFacade.getReporter()");
        }
        this(context, wn2, w0A);
    }

    private final JSONObject a(List<Fg> list, Fg fg, PackageInfo packageInfo) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = new ArrayList(kc.m.j(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(c((Fg) it.next()));
        }
        JSONObject jSONObjectPutOpt = jSONObject.put("candidates", C2120ym.b((List<?>) arrayList)).put("chosen", c(fg)).putOpt("install_time", packageInfo != null ? Long.valueOf(packageInfo.firstInstallTime) : null);
        fd.j0.h(jSONObjectPutOpt, "JSONObject()\n           …geInfo?.firstInstallTime)");
        return jSONObjectPutOpt;
    }

    private final JSONObject c(Fg fg) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("referrer", fg.f14000a).put("install_timestamp_seconds", fg.f14002c).put("click_timestamp_seconds", fg.f14001b).put("source", fg.f14003d.f14008a);
        fd.j0.h(jSONObjectPut, "JSONObject()\n           …eferrerInfo.source.value)");
        return jSONObjectPut;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Fg a(List<Fg> list) {
        Fg fg = null;
        if (list.isEmpty()) {
            return null;
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        Wn wn = this.f15688f;
        Context context = this.f15687e;
        PackageInfo packageInfoB = wn.b(context, context.getPackageName(), 0);
        if (packageInfoB != null) {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(packageInfoB.firstInstallTime);
            a aVar = new a();
            Iterator<T> it = list.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            Fg fg2 = (Fg) it.next();
            jc.h hVar = new jc.h(fg2, Long.valueOf(Math.abs(fg2.f14002c - seconds)));
            while (it.hasNext()) {
                Fg fg3 = (Fg) it.next();
                jc.h hVar2 = new jc.h(fg3, Long.valueOf(Math.abs(fg3.f14002c - seconds)));
                if (aVar.compare(hVar, hVar2) > 0) {
                    hVar = hVar2;
                }
            }
            Fg fg4 = (Fg) hVar.f31811c;
            if (((Number) hVar.f31812d).longValue() < this.f15684b) {
                fg = fg4;
            }
        }
        if (fg == null) {
            b bVar = new b();
            Iterator<T> it2 = list.iterator();
            if (!it2.hasNext()) {
                throw new NoSuchElementException();
            }
            Fg fg5 = (Fg) it2.next();
            while (it2.hasNext()) {
                Fg fg6 = (Fg) it2.next();
                if (bVar.compare(fg5, fg6) < 0) {
                    fg5 = fg6;
                }
            }
            fg = fg5;
        }
        this.f15689g.reportEvent("several_filled_referrers", a(list, fg, packageInfoB).toString());
        return fg;
    }

    public final boolean a(Fg fg) {
        String str;
        if (fg == null) {
            return false;
        }
        Wn wn = this.f15688f;
        Context context = this.f15687e;
        String packageName = context.getPackageName();
        Objects.requireNonNull(wn);
        String strA = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            strA = U2.a(30) ? Xn.a(packageManager, packageName) : packageManager.getInstallerPackageName(packageName);
        } catch (Throwable unused) {
        }
        int iOrdinal = fg.f14003d.ordinal();
        if (iOrdinal == 1) {
            str = this.f15685c;
        } else {
            if (iOrdinal != 2) {
                return false;
            }
            str = this.f15686d;
        }
        return fd.j0.d(str, strA);
    }

    public final boolean b(Fg fg) {
        String str = fg != null ? fg.f14000a : null;
        return !(str == null || str.length() == 0);
    }
}
