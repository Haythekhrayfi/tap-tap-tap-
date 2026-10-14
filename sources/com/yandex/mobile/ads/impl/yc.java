package com.yandex.mobile.ads.impl;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class yc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f26766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f26767d;

    public yc(String str, String str2, String str3, String str4) {
        this.f26764a = str;
        this.f26765b = str2;
        this.f26766c = str3;
        this.f26767d = str4;
    }

    public final String a() {
        return this.f26767d;
    }

    public final String b() {
        return this.f26766c;
    }

    public final String c() {
        return this.f26765b;
    }

    public final String d() {
        return this.f26764a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yc)) {
            return false;
        }
        yc ycVar = (yc) obj;
        return fd.j0.d(this.f26764a, ycVar.f26764a) && fd.j0.d(this.f26765b, ycVar.f26765b) && fd.j0.d(this.f26766c, ycVar.f26766c) && fd.j0.d(this.f26767d, ycVar.f26767d);
    }

    public final int hashCode() {
        String str = this.f26764a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f26765b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f26766c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f26767d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = v60.a("BackgroundColors(top=");
        sbA.append(this.f26764a);
        sbA.append(", right=");
        sbA.append(this.f26765b);
        sbA.append(", left=");
        sbA.append(this.f26766c);
        sbA.append(", bottom=");
        return s.a.a(sbA, this.f26767d, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
