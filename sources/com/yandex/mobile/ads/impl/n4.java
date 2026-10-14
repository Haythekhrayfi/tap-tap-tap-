package com.yandex.mobile.ads.impl;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class n4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f23212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f23213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f23214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Long f23215d;

    public n4(long j10, long j11, long j12, Long l10) {
        this.f23212a = j10;
        this.f23213b = j11;
        this.f23214c = j12;
        this.f23215d = l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4)) {
            return false;
        }
        n4 n4Var = (n4) obj;
        return this.f23212a == n4Var.f23212a && this.f23213b == n4Var.f23213b && this.f23214c == n4Var.f23214c && fd.j0.d(this.f23215d, n4Var.f23215d);
    }

    public final int hashCode() {
        int iA = r6.b.a(this.f23214c, r6.b.a(this.f23213b, Long.hashCode(this.f23212a) * 31, 31), 31);
        Long l10 = this.f23215d;
        return iA + (l10 == null ? 0 : l10.hashCode());
    }

    public final String toString() {
        StringBuilder sbA = v60.a("AdPodInfo(timerValue=");
        sbA.append(this.f23212a);
        sbA.append(", showPackShotDelay=");
        sbA.append(this.f23213b);
        sbA.append(", showImageDelay=");
        sbA.append(this.f23214c);
        sbA.append(", closeButtonDelay=");
        sbA.append(this.f23215d);
        sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sbA.toString();
    }
}
