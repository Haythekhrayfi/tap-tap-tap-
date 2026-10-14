package com.yandex.metrica.impl.ob;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.p7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1876p7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1826n7 f17056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1602e7 f17057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<C1776l7> f17058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f17060e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map<String, String> f17061f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f17062g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Boolean f17063h;

    public C1876p7(C1826n7 c1826n7, C1602e7 c1602e7, List<C1776l7> list, String str, String str2, Map<String, String> map, String str3, Boolean bool) {
        this.f17056a = c1826n7;
        this.f17057b = c1602e7;
        this.f17058c = list;
        this.f17059d = str;
        this.f17060e = str2;
        this.f17061f = map;
        this.f17062g = str3;
        this.f17063h = bool;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        C1826n7 c1826n7 = this.f17056a;
        if (c1826n7 != null) {
            for (C1776l7 c1776l7 : c1826n7.d()) {
                StringBuilder sbA = defpackage.a.a("at ");
                sbA.append(c1776l7.a());
                sbA.append(".");
                sbA.append(c1776l7.e());
                sbA.append("(");
                sbA.append(c1776l7.c());
                sbA.append(":");
                sbA.append(c1776l7.d());
                sbA.append(":");
                sbA.append(c1776l7.b());
                sbA.append(")\n");
                sb2.append(sbA.toString());
            }
        }
        StringBuilder sbA2 = defpackage.a.a("UnhandledException{exception=");
        sbA2.append(this.f17056a);
        sbA2.append("\n");
        sbA2.append(sb2.toString());
        sbA2.append('}');
        return sbA2.toString();
    }
}
