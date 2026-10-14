package com.yandex.mobile.ads.impl;

import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.common.AdRequest;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class fx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f20906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdRequest f20907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f20908c;

    public fx(String str, AdRequest adRequest, int i10) {
        fd.j0.i(adRequest, "adRequest");
        this.f20906a = str;
        this.f20907b = adRequest;
        this.f20908c = i10;
    }

    public static fx a(fx fxVar, String str, AdRequest adRequest, int i10, int i11) {
        if ((i11 & 1) != 0) {
            str = fxVar.f20906a;
        }
        if ((i11 & 2) != 0) {
            adRequest = fxVar.f20907b;
        }
        if ((i11 & 4) != 0) {
            i10 = fxVar.f20908c;
        }
        Objects.requireNonNull(fxVar);
        fd.j0.i(adRequest, "adRequest");
        return new fx(str, adRequest, i10);
    }

    public final AdRequest a() {
        return this.f20907b;
    }

    public final String b() {
        return this.f20906a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fx)) {
            return false;
        }
        fx fxVar = (fx) obj;
        return fd.j0.d(this.f20906a, fxVar.f20906a) && fd.j0.d(this.f20907b, fxVar.f20907b) && this.f20908c == fxVar.f20908c;
    }

    public final int hashCode() {
        String str = this.f20906a;
        return Integer.hashCode(this.f20908c) + ((this.f20907b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = v60.a("FullscreenAdItem(adUnitId=");
        sbA.append(this.f20906a);
        sbA.append(", adRequest=");
        sbA.append(this.f20907b);
        sbA.append(", screenOrientation=");
        return h0.f.a(sbA, this.f20908c, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
