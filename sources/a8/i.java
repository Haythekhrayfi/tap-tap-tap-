package a8;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f196b;

    public i(int i10, int i11) {
        this.f195a = i10;
        this.f196b = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f195a == iVar.f195a && this.f196b == iVar.f196b;
    }

    public int hashCode() {
        return Integer.hashCode(this.f196b) + (Integer.hashCode(this.f195a) * 31);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("DivVideoResolution(width=");
        sbA.append(this.f195a);
        sbA.append(", height=");
        return h0.f.a(sbA, this.f196b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
