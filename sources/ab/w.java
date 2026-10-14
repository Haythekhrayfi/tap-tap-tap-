package ab;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f334d;

    public w() {
        this(false, false, false, false, 15, null);
    }

    public w(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f331a = z10;
        this.f332b = z11;
        this.f333c = z12;
        this.f334d = z13;
    }

    public /* synthetic */ w(boolean z10, boolean z11, boolean z12, boolean z13, int i10, vc.g gVar) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12, (i10 & 8) != 0 ? false : z13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f331a == wVar.f331a && this.f332b == wVar.f332b && this.f333c == wVar.f333c && this.f334d == wVar.f334d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public int hashCode() {
        boolean z10 = this.f331a;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = r10 * 31;
        boolean z11 = this.f332b;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int i11 = (i10 + r11) * 31;
        boolean z12 = this.f333c;
        ?? r12 = z12;
        if (z12) {
            r12 = 1;
        }
        int i12 = (i11 + r12) * 31;
        boolean z13 = this.f334d;
        return i12 + (z13 ? 1 : z13);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("RelaunchResult(premiumOfferingShown=");
        sbA.append(this.f331a);
        sbA.append(", interstitialAdShown=");
        sbA.append(this.f332b);
        sbA.append(", rateUiShown=");
        sbA.append(this.f333c);
        sbA.append(", isFirstAppStart=");
        return androidx.recyclerview.widget.s.a(sbA, this.f334d, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
