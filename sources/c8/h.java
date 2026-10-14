package c8;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3638a;

    public h(int i10) {
        this.f3638a = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f3638a == ((h) obj).f3638a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f3638a);
    }

    public String toString() {
        return h0.f.a(defpackage.a.a("PagerState(currentPageIndex="), this.f3638a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
