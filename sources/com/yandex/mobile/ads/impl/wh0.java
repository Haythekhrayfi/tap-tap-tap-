package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;

/* JADX INFO: loaded from: classes3.dex */
public final class wh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdResponse f26281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k2 f26282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final cj0 f26283c;

    public wh0(cj0 cj0Var, AdResponse adResponse, k2 k2Var) {
        this.f26281a = adResponse;
        this.f26282b = k2Var;
        this.f26283c = cj0Var;
    }

    public final k2 a() {
        return this.f26282b;
    }

    public final AdResponse b() {
        return this.f26281a;
    }

    public final cj0 c() {
        return this.f26283c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wh0.class != obj.getClass()) {
            return false;
        }
        wh0 wh0Var = (wh0) obj;
        AdResponse adResponse = this.f26281a;
        if (adResponse == null ? wh0Var.f26281a != null : !adResponse.equals(wh0Var.f26281a)) {
            return false;
        }
        k2 k2Var = this.f26282b;
        if (k2Var == null ? wh0Var.f26282b != null : !k2Var.equals(wh0Var.f26282b)) {
            return false;
        }
        cj0 cj0Var = this.f26283c;
        cj0 cj0Var2 = wh0Var.f26283c;
        if (cj0Var != null) {
            return cj0Var.equals(cj0Var2);
        }
        return cj0Var2 == null;
    }

    public final int hashCode() {
        AdResponse adResponse = this.f26281a;
        int iHashCode = (adResponse != null ? adResponse.hashCode() : 0) * 31;
        k2 k2Var = this.f26282b;
        int iHashCode2 = (iHashCode + (k2Var != null ? k2Var.hashCode() : 0)) * 31;
        cj0 cj0Var = this.f26283c;
        return iHashCode2 + (cj0Var != null ? cj0Var.hashCode() : 0);
    }
}
