package com.applovin.impl.sdk.b;

import ch.qos.logback.core.CoreConstants;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f10307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, String> f10308b;

    private c(String str, Map<String, String> map) {
        this.f10307a = str;
        this.f10308b = map;
    }

    public static c a(String str) {
        return a(str, null);
    }

    public static c a(String str, Map<String, String> map) {
        return new c(str, map);
    }

    public Map<String, String> a() {
        return this.f10308b;
    }

    public String b() {
        return this.f10307a;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("PendingReward{result='");
        l1.c.a(sbA, this.f10307a, CoreConstants.SINGLE_QUOTE_CHAR, "params='");
        sbA.append(this.f10308b);
        sbA.append(CoreConstants.SINGLE_QUOTE_CHAR);
        sbA.append('}');
        return sbA.toString();
    }
}
