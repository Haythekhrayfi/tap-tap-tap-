package jc;

import ch.qos.logback.core.CoreConstants;
import fd.j0;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class h<A, B> implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A f31811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final B f31812d;

    public h(A a10, B b10) {
        this.f31811c = a10;
        this.f31812d = b10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return j0.d(this.f31811c, hVar.f31811c) && j0.d(this.f31812d, hVar.f31812d);
    }

    public int hashCode() {
        A a10 = this.f31811c;
        int iHashCode = (a10 == null ? 0 : a10.hashCode()) * 31;
        B b10 = this.f31812d;
        return iHashCode + (b10 != null ? b10.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbA = o2.b.a(CoreConstants.LEFT_PARENTHESIS_CHAR);
        sbA.append(this.f31811c);
        sbA.append(", ");
        sbA.append(this.f31812d);
        sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sbA.toString();
    }
}
