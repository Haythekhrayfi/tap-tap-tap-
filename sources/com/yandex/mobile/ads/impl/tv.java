package com.yandex.mobile.ads.impl;

import android.graphics.Typeface;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class tv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Typeface f25505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Typeface f25506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Typeface f25507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Typeface f25508d;

    public tv(Typeface typeface, Typeface typeface2, Typeface typeface3, Typeface typeface4) {
        this.f25505a = typeface;
        this.f25506b = typeface2;
        this.f25507c = typeface3;
        this.f25508d = typeface4;
    }

    public final Typeface a() {
        return this.f25508d;
    }

    public final Typeface b() {
        return this.f25505a;
    }

    public final Typeface c() {
        return this.f25507c;
    }

    public final Typeface d() {
        return this.f25506b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tv)) {
            return false;
        }
        tv tvVar = (tv) obj;
        return fd.j0.d(this.f25505a, tvVar.f25505a) && fd.j0.d(this.f25506b, tvVar.f25506b) && fd.j0.d(this.f25507c, tvVar.f25507c) && fd.j0.d(this.f25508d, tvVar.f25508d);
    }

    public final int hashCode() {
        Typeface typeface = this.f25505a;
        int iHashCode = (typeface == null ? 0 : typeface.hashCode()) * 31;
        Typeface typeface2 = this.f25506b;
        int iHashCode2 = (iHashCode + (typeface2 == null ? 0 : typeface2.hashCode())) * 31;
        Typeface typeface3 = this.f25507c;
        int iHashCode3 = (iHashCode2 + (typeface3 == null ? 0 : typeface3.hashCode())) * 31;
        Typeface typeface4 = this.f25508d;
        return iHashCode3 + (typeface4 != null ? typeface4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = v60.a("FontTypefaceData(light=");
        sbA.append(this.f25505a);
        sbA.append(", regular=");
        sbA.append(this.f25506b);
        sbA.append(", medium=");
        sbA.append(this.f25507c);
        sbA.append(", bold=");
        sbA.append(this.f25508d);
        sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sbA.toString();
    }
}
