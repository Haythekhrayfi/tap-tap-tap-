package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class d11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f19739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Long f19740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f19741c;

    public final Long a() {
        return this.f19740b;
    }

    public final void a(Long l10) {
        this.f19740b = l10;
    }

    public final void a(String str) {
        this.f19739a = str;
    }

    public final void a(boolean z10) {
        this.f19741c = z10;
    }

    public final String b() {
        return this.f19739a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d11.class != obj.getClass()) {
            return false;
        }
        d11 d11Var = (d11) obj;
        if (this.f19741c != d11Var.f19741c) {
            return false;
        }
        String str = this.f19739a;
        if (str == null ? d11Var.f19739a != null : !str.equals(d11Var.f19739a)) {
            return false;
        }
        Long l10 = this.f19740b;
        Long l11 = d11Var.f19740b;
        if (l10 != null) {
            return l10.equals(l11);
        }
        return l11 == null;
    }

    public final int hashCode() {
        String str = this.f19739a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Long l10 = this.f19740b;
        return ((iHashCode + (l10 != null ? l10.hashCode() : 0)) * 31) + (this.f19741c ? 1 : 0);
    }
}
