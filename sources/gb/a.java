package gb;

import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import fd.j0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Purchase f30176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SkuDetails f30177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.zipoapps.premiumhelper.util.d f30178c;

    public a(Purchase purchase, SkuDetails skuDetails, com.zipoapps.premiumhelper.util.d dVar) {
        j0.i(purchase, "purchase");
        j0.i(dVar, "status");
        this.f30176a = purchase;
        this.f30177b = skuDetails;
        this.f30178c = dVar;
    }

    public /* synthetic */ a(Purchase purchase, SkuDetails skuDetails, com.zipoapps.premiumhelper.util.d dVar, int i10, vc.g gVar) {
        this(purchase, (i10 & 2) != 0 ? null : skuDetails, (i10 & 4) != 0 ? com.zipoapps.premiumhelper.util.d.UNKNOWN : dVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return j0.d(this.f30176a, aVar.f30176a) && j0.d(this.f30177b, aVar.f30177b) && this.f30178c == aVar.f30178c;
    }

    public int hashCode() {
        int iHashCode = this.f30176a.hashCode() * 31;
        SkuDetails skuDetails = this.f30177b;
        return this.f30178c.hashCode() + ((iHashCode + (skuDetails == null ? 0 : skuDetails.hashCode())) * 31);
    }

    public String toString() {
        String str;
        StringBuilder sbA = defpackage.a.a("\nActivePurchase: ");
        sbA.append(this.f30178c.name());
        sbA.append("\nPurchase JSON:\n");
        sbA.append(new JSONObject(this.f30176a.f3748a).toString(4));
        sbA.append("\nSkuDetails JSON: \n");
        SkuDetails skuDetails = this.f30177b;
        if (skuDetails == null || (str = skuDetails.f3754a) == null) {
            str = "null";
        }
        sbA.append(new JSONObject(str).toString(4));
        return sbA.toString();
    }
}
