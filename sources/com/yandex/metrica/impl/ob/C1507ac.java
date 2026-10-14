package com.yandex.metrica.impl.ob;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ac, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1507ac {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f15738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f15740c;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ac$a */
    public enum a {
        GOOGLE,
        HMS,
        YANDEX
    }

    public C1507ac(a aVar, String str, Boolean bool) {
        this.f15738a = aVar;
        this.f15739b = str;
        this.f15740c = bool;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("AdTrackingInfo{provider=");
        sbA.append(this.f15738a);
        sbA.append(", advId='");
        l1.c.a(sbA, this.f15739b, CoreConstants.SINGLE_QUOTE_CHAR, ", limitedAdTracking=");
        sbA.append(this.f15740c);
        sbA.append('}');
        return sbA.toString();
    }
}
