package fa;

import ch.qos.logback.core.CoreConstants;
import fd.j0;

/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f29491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f29492c;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }
    }

    static {
        new a(null);
    }

    public n(int i10, String str, String str2) {
        j0.i(str, "message");
        j0.i(str2, "domain");
        this.f29490a = i10;
        this.f29491b = str;
        this.f29492c = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f29490a == nVar.f29490a && j0.d(this.f29491b, nVar.f29491b) && j0.d(this.f29492c, nVar.f29492c);
    }

    public int hashCode() {
        return this.f29492c.hashCode() + l1.e.a(this.f29491b, Integer.hashCode(this.f29490a) * 31, 31);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("PhAdError(code=");
        sbA.append(this.f29490a);
        sbA.append(", message=");
        sbA.append(this.f29491b);
        sbA.append(", domain=");
        return s.a.a(sbA, this.f29492c, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
