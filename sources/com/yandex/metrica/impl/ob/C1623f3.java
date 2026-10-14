package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.YandexMetricaConfig;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.f3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1623f3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static C1959sg f16094a = new C1959sg(Y.g().c(), new C1984tg());

    public static YandexMetricaConfig a(YandexMetricaConfig yandexMetricaConfig, String str) {
        Objects.requireNonNull(f16094a);
        com.yandex.metrica.j.b bVarA = com.yandex.metrica.j.a(yandexMetricaConfig);
        bVarA.f18080c = Collections.singletonList(str);
        return bVarA.b();
    }

    public static String a(int i10) {
        Objects.requireNonNull(f16094a);
        return C1720j1.a(i10);
    }

    public static String a(Context context) {
        return f16094a.a(context);
    }

    public static String a(String str) {
        Objects.requireNonNull(f16094a);
        return B2.c(str);
    }

    public static void a(int i10, String str, String str2, Map<String, String> map) {
        f16094a.a(i10, str, str2, map);
    }

    public static void a(Context context, IIdentifierCallback iIdentifierCallback, List<String> list) {
        f16094a.a(context, iIdentifierCallback, list);
    }

    public static void a(Context context, Map<String, Object> map) {
        f16094a.a(context, map);
    }

    public static void a(Context context, boolean z10) {
        f16094a.a(context, z10);
    }

    public static void a(com.yandex.metrica.p.Ucc ucc, boolean z10) {
        f16094a.a(ucc, z10);
    }

    public static boolean a() {
        return f16094a.a();
    }

    public static String b(Context context) {
        return f16094a.b(context);
    }

    public static Future<String> b() {
        return f16094a.b();
    }

    public static String c(Context context) {
        return f16094a.c(context);
    }

    public static Future<Boolean> c() {
        return f16094a.c();
    }

    public static String d(Context context) {
        return f16094a.d(context);
    }

    public static void d() {
        f16094a.d();
    }

    public static YandexMetricaConfig a(YandexMetricaConfig yandexMetricaConfig, List<String> list) {
        Objects.requireNonNull(f16094a);
        com.yandex.metrica.j.b bVarA = com.yandex.metrica.j.a(yandexMetricaConfig);
        bVarA.f18080c = list;
        return bVarA.b();
    }
}
