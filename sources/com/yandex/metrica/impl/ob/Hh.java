package com.yandex.metrica.impl.ob;

import ch.qos.logback.core.CoreConstants;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class Hh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<String> f14149b;

    public Hh(String str, List<String> list) {
        this.f14148a = str;
        this.f14149b = list;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("SdkItem{name='");
        l1.c.a(sbA, this.f14148a, CoreConstants.SINGLE_QUOTE_CHAR, ", classes=");
        return l1.f.a(sbA, this.f14149b, '}');
    }
}
