package ma;

import ch.qos.logback.core.CoreConstants;
import com.android.billingclient.api.SkuDetails;
import com.applovin.sdk.AppLovinEventParameters;
import fd.j0;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f33403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SkuDetails f33404c;

    public e(String str, String str2, SkuDetails skuDetails) {
        j0.i(str, AppLovinEventParameters.PRODUCT_IDENTIFIER);
        this.f33402a = str;
        this.f33403b = str2;
        this.f33404c = skuDetails;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return j0.d(this.f33402a, eVar.f33402a) && j0.d(this.f33403b, eVar.f33403b) && j0.d(this.f33404c, eVar.f33404c);
    }

    public int hashCode() {
        int iHashCode = this.f33402a.hashCode() * 31;
        String str = this.f33403b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        SkuDetails skuDetails = this.f33404c;
        return iHashCode2 + (skuDetails != null ? skuDetails.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("Offer(sku=");
        sbA.append(this.f33402a);
        sbA.append(", skuType=");
        sbA.append(this.f33403b);
        sbA.append(", skuDetails=");
        sbA.append(this.f33404c);
        sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sbA.toString();
    }
}
