package com.yandex.mobile.ads.impl;

import ch.qos.logback.core.CoreConstants;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class y21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f26682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f26683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final yc f26684e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final q21 f26685f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<q21> f26686g;

    public y21() {
        this(0);
    }

    public /* synthetic */ y21(int i10) {
        this(null, null, null, null, null, null, null);
    }

    public y21(String str, String str2, String str3, String str4, yc ycVar, q21 q21Var, List<q21> list) {
        this.f26680a = str;
        this.f26681b = str2;
        this.f26682c = str3;
        this.f26683d = str4;
        this.f26684e = ycVar;
        this.f26685f = q21Var;
        this.f26686g = list;
    }

    public final yc a() {
        return this.f26684e;
    }

    public final q21 b() {
        return this.f26685f;
    }

    public final List<q21> c() {
        return this.f26686g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y21)) {
            return false;
        }
        y21 y21Var = (y21) obj;
        return fd.j0.d(this.f26680a, y21Var.f26680a) && fd.j0.d(this.f26681b, y21Var.f26681b) && fd.j0.d(this.f26682c, y21Var.f26682c) && fd.j0.d(this.f26683d, y21Var.f26683d) && fd.j0.d(this.f26684e, y21Var.f26684e) && fd.j0.d(this.f26685f, y21Var.f26685f) && fd.j0.d(this.f26686g, y21Var.f26686g);
    }

    public final int hashCode() {
        String str = this.f26680a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f26681b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f26682c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f26683d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        yc ycVar = this.f26684e;
        int iHashCode5 = (iHashCode4 + (ycVar == null ? 0 : ycVar.hashCode())) * 31;
        q21 q21Var = this.f26685f;
        int iHashCode6 = (iHashCode5 + (q21Var == null ? 0 : q21Var.hashCode())) * 31;
        List<q21> list = this.f26686g;
        return iHashCode6 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = v60.a("SmartCenterSettings(colorWizButton=");
        sbA.append(this.f26680a);
        sbA.append(", colorWizButtonText=");
        sbA.append(this.f26681b);
        sbA.append(", colorWizBack=");
        sbA.append(this.f26682c);
        sbA.append(", colorWizBackRight=");
        sbA.append(this.f26683d);
        sbA.append(", backgroundColors=");
        sbA.append(this.f26684e);
        sbA.append(", smartCenter=");
        sbA.append(this.f26685f);
        sbA.append(", smartCenters=");
        return l1.f.a(sbA, this.f26686g, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
