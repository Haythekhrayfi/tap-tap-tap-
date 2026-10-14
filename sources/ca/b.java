package ca;

import ch.qos.logback.core.CoreConstants;
import l1.e;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.yandex.metrica.billing_interface.c f3656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f3659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f3660e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f3661f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.yandex.metrica.billing_interface.b f3662g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f3663h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.yandex.metrica.billing_interface.b f3664i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f3665j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f3666k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f3667l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f3668m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f3669n;

    public b(com.yandex.metrica.billing_interface.c cVar, String str, int i10, long j10, String str2, long j11, com.yandex.metrica.billing_interface.b bVar, int i11, com.yandex.metrica.billing_interface.b bVar2, String str3, String str4, long j12, boolean z10, String str5) {
        this.f3656a = cVar;
        this.f3657b = str;
        this.f3658c = i10;
        this.f3659d = j10;
        this.f3660e = str2;
        this.f3661f = j11;
        this.f3662g = bVar;
        this.f3663h = i11;
        this.f3664i = bVar2;
        this.f3665j = str3;
        this.f3666k = str4;
        this.f3667l = j12;
        this.f3668m = z10;
        this.f3669n = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f3658c != bVar.f3658c || this.f3659d != bVar.f3659d || this.f3661f != bVar.f3661f || this.f3663h != bVar.f3663h || this.f3667l != bVar.f3667l || this.f3668m != bVar.f3668m || this.f3656a != bVar.f3656a || !this.f3657b.equals(bVar.f3657b) || !this.f3660e.equals(bVar.f3660e)) {
            return false;
        }
        com.yandex.metrica.billing_interface.b bVar2 = this.f3662g;
        if (bVar2 == null ? bVar.f3662g != null : !bVar2.equals(bVar.f3662g)) {
            return false;
        }
        com.yandex.metrica.billing_interface.b bVar3 = this.f3664i;
        if (bVar3 == null ? bVar.f3664i != null : !bVar3.equals(bVar.f3664i)) {
            return false;
        }
        if (this.f3665j.equals(bVar.f3665j) && this.f3666k.equals(bVar.f3666k)) {
            return this.f3669n.equals(bVar.f3669n);
        }
        return false;
    }

    public int hashCode() {
        int iA = (e.a(this.f3657b, this.f3656a.hashCode() * 31, 31) + this.f3658c) * 31;
        long j10 = this.f3659d;
        int iA2 = e.a(this.f3660e, (iA + ((int) (j10 ^ (j10 >>> 32)))) * 31, 31);
        long j11 = this.f3661f;
        int i10 = (iA2 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        com.yandex.metrica.billing_interface.b bVar = this.f3662g;
        int iHashCode = (((i10 + (bVar != null ? bVar.hashCode() : 0)) * 31) + this.f3663h) * 31;
        com.yandex.metrica.billing_interface.b bVar2 = this.f3664i;
        int iA3 = e.a(this.f3666k, e.a(this.f3665j, (iHashCode + (bVar2 != null ? bVar2.hashCode() : 0)) * 31, 31), 31);
        long j12 = this.f3667l;
        return this.f3669n.hashCode() + ((((iA3 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f3668m ? 1 : 0)) * 31);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("ProductInfo{type=");
        sbA.append(this.f3656a);
        sbA.append(", sku='");
        l1.c.a(sbA, this.f3657b, CoreConstants.SINGLE_QUOTE_CHAR, ", quantity=");
        sbA.append(this.f3658c);
        sbA.append(", priceMicros=");
        sbA.append(this.f3659d);
        sbA.append(", priceCurrency='");
        l1.c.a(sbA, this.f3660e, CoreConstants.SINGLE_QUOTE_CHAR, ", introductoryPriceMicros=");
        sbA.append(this.f3661f);
        sbA.append(", introductoryPricePeriod=");
        sbA.append(this.f3662g);
        sbA.append(", introductoryPriceCycles=");
        sbA.append(this.f3663h);
        sbA.append(", subscriptionPeriod=");
        sbA.append(this.f3664i);
        sbA.append(", signature='");
        l1.c.a(sbA, this.f3665j, CoreConstants.SINGLE_QUOTE_CHAR, ", purchaseToken='");
        l1.c.a(sbA, this.f3666k, CoreConstants.SINGLE_QUOTE_CHAR, ", purchaseTime=");
        sbA.append(this.f3667l);
        sbA.append(", autoRenewing=");
        sbA.append(this.f3668m);
        sbA.append(", purchaseOriginalJson='");
        sbA.append(this.f3669n);
        sbA.append(CoreConstants.SINGLE_QUOTE_CHAR);
        sbA.append('}');
        return sbA.toString();
    }
}
