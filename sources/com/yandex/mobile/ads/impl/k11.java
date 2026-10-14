package com.yandex.mobile.ads.impl;

import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.common.AdError;

/* JADX INFO: loaded from: classes3.dex */
public final class k11 implements AdError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f22223a = "Fullscreen ad was already presented. Fullscreen can be presented just once.";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k11) && fd.j0.d(this.f22223a, ((k11) obj).f22223a);
    }

    @Override // com.yandex.mobile.ads.common.AdError
    public final String getDescription() {
        return this.f22223a;
    }

    public final int hashCode() {
        return this.f22223a.hashCode();
    }

    public final String toString() {
        return s.a.a(v60.a("SimpleAdError(errorDescription="), this.f22223a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
