package com.yandex.metrica.impl.ob;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.text.TextUtils;
import ch.qos.logback.core.CoreConstants;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.Locale;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.b2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1522b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Wn f15776a = new Wn();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Fm<Integer, d> f15777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @TargetApi(23)
    private static final Fm<Integer, d> f15778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Fm<d, Integer> f15779d;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.b2$a */
    public class a extends Fm<Integer, d> {
        public a(d dVar) {
            super(dVar);
            a(1, d.WIFI);
            a(0, d.CELL);
            a(7, d.BLUETOOTH);
            a(9, d.ETHERNET);
            a(4, d.MOBILE_DUN);
            a(5, d.MOBILE_HIPRI);
            a(2, d.MOBILE_MMS);
            a(3, d.MOBILE_SUPL);
            a(6, d.WIMAX);
            if (U2.a(21)) {
                a(17, d.VPN);
            }
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.b2$b */
    public class b extends Fm<Integer, d> {
        public b(d dVar) {
            super(dVar);
            a(1, d.WIFI);
            a(0, d.CELL);
            a(3, d.ETHERNET);
            a(2, d.BLUETOOTH);
            a(4, d.VPN);
            if (U2.a(27)) {
                a(6, d.LOWPAN);
            }
            if (U2.a(26)) {
                a(5, d.WIFI_AWARE);
            }
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.b2$c */
    public class c extends Fm<d, Integer> {
        public c(Integer num) {
            super(num);
            a(d.CELL, 0);
            a(d.WIFI, 1);
            a(d.BLUETOOTH, 3);
            a(d.ETHERNET, 4);
            a(d.MOBILE_DUN, 5);
            a(d.MOBILE_HIPRI, 6);
            a(d.MOBILE_MMS, 7);
            a(d.MOBILE_SUPL, 8);
            a(d.VPN, 9);
            a(d.WIMAX, 10);
            a(d.LOWPAN, 11);
            a(d.WIFI_AWARE, 12);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.b2$d */
    public enum d {
        WIFI,
        CELL,
        ETHERNET,
        BLUETOOTH,
        VPN,
        LOWPAN,
        WIFI_AWARE,
        MOBILE_DUN,
        MOBILE_HIPRI,
        MOBILE_MMS,
        MOBILE_SUPL,
        WIMAX,
        OFFLINE,
        UNDEFINED
    }

    static {
        d dVar = d.UNDEFINED;
        f15777b = new a(dVar);
        f15778c = new b(dVar);
        f15779d = new c(2);
    }

    public static com.yandex.metrica.c a(Context context, Point point) {
        float f10;
        try {
            f10 = context.getResources().getDisplayMetrics().density;
        } catch (Throwable unused) {
            f10 = 0.0f;
        }
        if (f10 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            return com.yandex.metrica.c.PHONE;
        }
        float f11 = point.x;
        float f12 = point.y;
        float fMin = Math.min(f11 / f10, f12 / f10);
        float f13 = f10 * 160.0f;
        float f14 = f11 / f13;
        float f15 = f12 / f13;
        double dSqrt = Math.sqrt((f15 * f15) + (f14 * f14));
        if (dSqrt >= 15.0d && !f15776a.a(context, "android.hardware.touchscreen")) {
            return com.yandex.metrica.c.TV;
        }
        return (dSqrt >= 7.0d || fMin >= 600.0f) ? com.yandex.metrica.c.TABLET : com.yandex.metrica.c.PHONE;
    }

    public static d a(Context context) {
        d dVarA;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        d dVar = d.UNDEFINED;
        if (connectivityManager != null) {
            try {
                dVarA = U2.a(23) ? a(connectivityManager) : b(connectivityManager);
            } catch (Throwable unused) {
                dVarA = null;
            }
        } else {
            dVarA = null;
        }
        return dVarA == null ? dVar : dVarA;
    }

    public static d a(ConnectivityManager connectivityManager) {
        d dVar = d.UNDEFINED;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (a(connectivityManager, activeNetwork)) {
            return d.OFFLINE;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities == null) {
            return dVar;
        }
        for (Integer num : f15778c.a()) {
            if (networkCapabilities.hasTransport(num.intValue())) {
                return f15778c.a(num);
            }
        }
        return dVar;
    }

    public static String a(Locale locale) {
        String language = locale.getLanguage();
        String country = locale.getCountry();
        StringBuilder sb2 = new StringBuilder(language);
        if (U2.a(21)) {
            String script = locale.getScript();
            if (!TextUtils.isEmpty(script)) {
                sb2.append(CoreConstants.DASH_CHAR);
                sb2.append(script);
            }
        }
        if (!TextUtils.isEmpty(country)) {
            sb2.append('_');
            sb2.append(country);
        }
        return sb2.toString();
    }

    private static boolean a(ConnectivityManager connectivityManager, Network network) {
        if (U2.a(29)) {
            return network == null;
        }
        if (network == null) {
            return true;
        }
        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(network);
        return (networkInfo == null || networkInfo.isConnected()) ? false : true;
    }

    public static int b(Context context) {
        return f15779d.a(a(context)).intValue();
    }

    public static d b(ConnectivityManager connectivityManager) {
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) ? d.OFFLINE : f15777b.a(Integer.valueOf(activeNetworkInfo.getType()));
    }
}
