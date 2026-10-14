package c8;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3637b;

    public g(int i10, int i11) {
        this.f3636a = i10;
        this.f3637b = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f3636a == gVar.f3636a && this.f3637b == gVar.f3637b;
    }

    public int hashCode() {
        return Integer.hashCode(this.f3637b) + (Integer.hashCode(this.f3636a) * 31);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("GalleryState(visibleItemIndex=");
        sbA.append(this.f3636a);
        sbA.append(", scrollOffset=");
        return h0.f.a(sbA, this.f3637b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
