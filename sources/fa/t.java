package fa;

import ch.qos.logback.core.CoreConstants;
import fd.j0;

/* JADX INFO: loaded from: classes3.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f29504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f29505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f29506d;

    public t(int i10, String str, String str2, String str3) {
        j0.i(str, "message");
        j0.i(str2, "domain");
        this.f29503a = i10;
        this.f29504b = str;
        this.f29505c = str2;
        this.f29506d = str3;
    }

    public /* synthetic */ t(int i10, String str, String str2, String str3, int i11, vc.g gVar) {
        this(i10, str, str2, (i11 & 8) != 0 ? null : str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f29503a == tVar.f29503a && j0.d(this.f29504b, tVar.f29504b) && j0.d(this.f29505c, tVar.f29505c) && j0.d(this.f29506d, tVar.f29506d);
    }

    public int hashCode() {
        int iA = l1.e.a(this.f29505c, l1.e.a(this.f29504b, Integer.hashCode(this.f29503a) * 31, 31), 31);
        String str = this.f29506d;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("PhLoadAdError(code=");
        sbA.append(this.f29503a);
        sbA.append(", message=");
        sbA.append(this.f29504b);
        sbA.append(", domain=");
        sbA.append(this.f29505c);
        sbA.append(", cause=");
        return s.a.a(sbA, this.f29506d, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
