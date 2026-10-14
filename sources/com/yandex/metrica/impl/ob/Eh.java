package com.yandex.metrica.impl.ob;

import ch.qos.logback.core.CoreConstants;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class Eh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<Hh> f13908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f13910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f13911d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f13912e;

    public Eh(List<Hh> list, String str, long j10, boolean z10, boolean z11) {
        this.f13908a = Collections.unmodifiableList(list);
        this.f13909b = str;
        this.f13910c = j10;
        this.f13911d = z10;
        this.f13912e = z11;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("SdkFingerprintingState{sdkItemList=");
        sbA.append(this.f13908a);
        sbA.append(", etag='");
        l1.c.a(sbA, this.f13909b, CoreConstants.SINGLE_QUOTE_CHAR, ", lastAttemptTime=");
        sbA.append(this.f13910c);
        sbA.append(", hasFirstCollectionOccurred=");
        sbA.append(this.f13911d);
        sbA.append(", shouldRetry=");
        return androidx.recyclerview.widget.s.a(sbA, this.f13912e, '}');
    }
}
