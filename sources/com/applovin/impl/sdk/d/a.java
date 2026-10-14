package com.applovin.impl.sdk.d;

import ch.qos.logback.core.CoreConstants;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f10420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f10421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, String> f10422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f10423d;

    public a(String str, String str2) {
        this(str, str2, null, false);
    }

    public a(String str, String str2, Map<String, String> map, boolean z10) {
        this.f10420a = str;
        this.f10421b = str2;
        this.f10422c = map;
        this.f10423d = z10;
    }

    public String a() {
        return this.f10420a;
    }

    public String b() {
        return this.f10421b;
    }

    public Map<String, String> c() {
        return this.f10422c;
    }

    public boolean d() {
        return this.f10423d;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("AdEventPostback{url='");
        l1.c.a(sbA, this.f10420a, CoreConstants.SINGLE_QUOTE_CHAR, ", backupUrl='");
        l1.c.a(sbA, this.f10421b, CoreConstants.SINGLE_QUOTE_CHAR, ", headers='");
        sbA.append(this.f10422c);
        sbA.append(CoreConstants.SINGLE_QUOTE_CHAR);
        sbA.append(", shouldFireInWebView='");
        sbA.append(this.f10423d);
        sbA.append(CoreConstants.SINGLE_QUOTE_CHAR);
        sbA.append('}');
        return sbA.toString();
    }
}
