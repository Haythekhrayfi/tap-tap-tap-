package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.yd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2111yd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f17907b;

    public C2111yd(boolean z10, boolean z11) {
        this.f17906a = z10;
        this.f17907b = z11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2111yd.class != obj.getClass()) {
            return false;
        }
        C2111yd c2111yd = (C2111yd) obj;
        return this.f17906a == c2111yd.f17906a && this.f17907b == c2111yd.f17907b;
    }

    public int hashCode() {
        return ((this.f17906a ? 1 : 0) * 31) + (this.f17907b ? 1 : 0);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("ProviderAccessFlags{lastKnownEnabled=");
        sbA.append(this.f17906a);
        sbA.append(", scanningEnabled=");
        return androidx.recyclerview.widget.s.a(sbA, this.f17907b, '}');
    }
}
