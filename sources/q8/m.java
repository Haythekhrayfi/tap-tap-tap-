package q8;

import ch.qos.logback.core.CoreConstants;
import fd.j0;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f34833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f34834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f34835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f34836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f34837e;

    public m() {
        this(false, 0, 0, null, null, 31, null);
    }

    public m(boolean z10, int i10, int i11, String str, String str2) {
        j0.i(str, "errorDetails");
        j0.i(str2, "warningDetails");
        this.f34833a = z10;
        this.f34834b = i10;
        this.f34835c = i11;
        this.f34836d = str;
        this.f34837e = str2;
    }

    public /* synthetic */ m(boolean z10, int i10, int i11, String str, String str2, int i12, vc.g gVar) {
        this((i12 & 1) != 0 ? false : z10, (i12 & 2) != 0 ? 0 : i10, (i12 & 4) == 0 ? i11 : 0, (i12 & 8) != 0 ? "" : str, (i12 & 16) != 0 ? "" : str2);
    }

    public static m a(m mVar, boolean z10, int i10, int i11, String str, String str2, int i12) {
        if ((i12 & 1) != 0) {
            z10 = mVar.f34833a;
        }
        boolean z11 = z10;
        if ((i12 & 2) != 0) {
            i10 = mVar.f34834b;
        }
        int i13 = i10;
        if ((i12 & 4) != 0) {
            i11 = mVar.f34835c;
        }
        int i14 = i11;
        if ((i12 & 8) != 0) {
            str = mVar.f34836d;
        }
        String str3 = str;
        if ((i12 & 16) != 0) {
            str2 = mVar.f34837e;
        }
        String str4 = str2;
        Objects.requireNonNull(mVar);
        j0.i(str3, "errorDetails");
        j0.i(str4, "warningDetails");
        return new m(z11, i13, i14, str3, str4);
    }

    public final String b() {
        int i10 = this.f34834b;
        if (i10 <= 0 || this.f34835c <= 0) {
            int i11 = this.f34835c;
            if (i11 > 0) {
                return String.valueOf(i11);
            }
            return i10 > 0 ? String.valueOf(i10) : "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f34834b);
        sb2.append('/');
        sb2.append(this.f34835c);
        return sb2.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f34833a == mVar.f34833a && this.f34834b == mVar.f34834b && this.f34835c == mVar.f34835c && j0.d(this.f34836d, mVar.f34836d) && j0.d(this.f34837e, mVar.f34837e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z10 = this.f34833a;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return this.f34837e.hashCode() + l1.e.a(this.f34836d, r6.a.a(this.f34835c, r6.a.a(this.f34834b, r10 * 31, 31), 31), 31);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("ErrorViewModel(showDetails=");
        sbA.append(this.f34833a);
        sbA.append(", errorCount=");
        sbA.append(this.f34834b);
        sbA.append(", warningCount=");
        sbA.append(this.f34835c);
        sbA.append(", errorDetails=");
        sbA.append(this.f34836d);
        sbA.append(", warningDetails=");
        return s.a.a(sbA, this.f34837e, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
