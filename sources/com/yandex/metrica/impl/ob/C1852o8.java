package com.yandex.metrica.impl.ob;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.o8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1852o8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16999b;

    public C1852o8(String str, String str2) {
        this.f16998a = str;
        this.f16999b = str2;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("RuntimeConfig{errorEnvironment='");
        l1.c.a(sbA, this.f16998a, CoreConstants.SINGLE_QUOTE_CHAR, ", handlerVersion='");
        sbA.append(this.f16999b);
        sbA.append(CoreConstants.SINGLE_QUOTE_CHAR);
        sbA.append('}');
        return sbA.toString();
    }
}
