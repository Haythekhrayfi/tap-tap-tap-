package com.yandex.metrica;

import android.content.Context;
import com.yandex.metrica.impl.ob.C1623f3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.FutureTask;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<String> f18091a = Arrays.asList("yandex_mobile_metrica_uuid", "yandex_mobile_metrica_device_id", "appmetrica_device_id_hash", "yandex_mobile_metrica_get_ad_url", "yandex_mobile_metrica_report_ad_url");

    public interface Ucc {
        void onError(String str);

        void onResult(JSONObject jSONObject);
    }

    public static void a(Context context, IIdentifierCallback iIdentifierCallback) {
        a(context, iIdentifierCallback, f18091a);
    }

    public static void a(Context context, IIdentifierCallback iIdentifierCallback, List<String> list) {
        C1623f3.a(context, iIdentifierCallback, new ArrayList(list));
    }

    public static void a(Context context, IIdentifierCallback iIdentifierCallback, String... strArr) {
        a(context, iIdentifierCallback, (List<String>) Arrays.asList(strArr));
    }

    @Deprecated
    public static YandexMetricaConfig cpcwh(YandexMetricaConfig yandexMetricaConfig, String str) {
        return C1623f3.a(yandexMetricaConfig, str);
    }

    public static String gcni(Context context) {
        return C1623f3.a(context);
    }

    public static String gdid(Context context) {
        return C1623f3.b(context);
    }

    public static String gmsvn(int i10) {
        return C1623f3.a(i10);
    }

    public static void guc(Ucc ucc, boolean z10) {
        C1623f3.a(ucc, z10);
    }

    public static String guid(Context context) {
        return C1623f3.d(context);
    }

    public static boolean iifa() {
        return C1623f3.a();
    }

    public static String mpn(Context context) {
        return C1623f3.c(context);
    }

    public static String pgai() {
        try {
            return (String) ((FutureTask) C1623f3.b()).get();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Boolean plat() {
        try {
            return (Boolean) ((FutureTask) C1623f3.c()).get();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void rce(int i10, String str, String str2, Map<String, String> map) {
        C1623f3.a(i10, str, str2, map);
    }

    public static void rlse(Context context, Map<String, Object> map) {
        C1623f3.a(context, map);
    }

    public static void seb() {
        C1623f3.d();
    }

    public static void slte(Context context, boolean z10) {
        C1623f3.a(context, z10);
    }

    public static String u(String str) {
        return C1623f3.a(str);
    }
}
