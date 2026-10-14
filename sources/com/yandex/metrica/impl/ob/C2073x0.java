package com.yandex.metrica.impl.ob;

import ch.qos.logback.core.CoreConstants;
import java.util.Map;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2073x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, String> f17817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17819c;

    public C2073x0(String str, Map<String, String> map, String str2) {
        this.f17818b = str;
        this.f17817a = map;
        this.f17819c = str2;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("DeferredDeeplinkState{mParameters=");
        sbA.append(this.f17817a);
        sbA.append(", mDeeplink='");
        l1.c.a(sbA, this.f17818b, CoreConstants.SINGLE_QUOTE_CHAR, ", mUnparsedReferrer='");
        sbA.append(this.f17819c);
        sbA.append(CoreConstants.SINGLE_QUOTE_CHAR);
        sbA.append('}');
        return sbA.toString();
    }
}
