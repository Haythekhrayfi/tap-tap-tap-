package com.yandex.mobile.ads.impl;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class w9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f26222c;

    public w9(String str, String str2, String str3) {
        this.f26220a = str;
        this.f26221b = str2;
        this.f26222c = str3;
    }

    public final String a() {
        return this.f26220a;
    }

    public final String b() {
        return this.f26221b;
    }

    public final String c() {
        return this.f26222c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w9)) {
            return false;
        }
        w9 w9Var = (w9) obj;
        return fd.j0.d(this.f26220a, w9Var.f26220a) && fd.j0.d(this.f26221b, w9Var.f26221b) && fd.j0.d(this.f26222c, w9Var.f26222c);
    }

    public final int hashCode() {
        String str = this.f26220a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f26221b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f26222c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = v60.a("AppMetricaIdentifiers(adGetUrl=");
        sbA.append(this.f26220a);
        sbA.append(", deviceId=");
        sbA.append(this.f26221b);
        sbA.append(", uuid=");
        return s.a.a(sbA, this.f26222c, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
