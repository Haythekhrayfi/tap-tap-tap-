package com.yandex.metrica.impl.ob;

import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.android.billingclient.api.SkuDetails;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1768l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1768l f16781a = new C1768l();

    private C1768l() {
    }

    private final long a(SkuDetails skuDetails) {
        String strA = skuDetails.a();
        fd.j0.h(strA, "skuDetails.freeTrialPeriod");
        if (strA.length() == 0) {
            return skuDetails.f3755b.optLong("introductoryPriceAmountMicros");
        }
        return 0L;
    }

    private final int b(SkuDetails skuDetails) {
        String strA = skuDetails.a();
        fd.j0.h(strA, "skuDetails.freeTrialPeriod");
        if (strA.length() == 0) {
            return skuDetails.f3755b.optInt("introductoryPriceCycles");
        }
        return 1;
    }

    private final com.yandex.metrica.billing_interface.b c(SkuDetails skuDetails) {
        String strA = skuDetails.a();
        fd.j0.h(strA, "skuDetails.freeTrialPeriod");
        return com.yandex.metrica.billing_interface.b.a(strA.length() == 0 ? skuDetails.f3755b.optString("introductoryPricePeriod") : skuDetails.a());
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0042  */
    public final ca.b a(PurchaseHistoryRecord purchaseHistoryRecord, SkuDetails skuDetails, Purchase purchase) {
        com.yandex.metrica.billing_interface.c cVar;
        String str;
        fd.j0.i(purchaseHistoryRecord, "purchasesHistoryRecord");
        fd.j0.i(skuDetails, "skuDetails");
        String strF = skuDetails.f();
        fd.j0.h(strF, "skuDetails.type");
        int iHashCode = strF.hashCode();
        if (iHashCode != 3541555) {
            if (iHashCode == 100343516 && strF.equals("inapp")) {
                cVar = com.yandex.metrica.billing_interface.c.INAPP;
            } else {
                cVar = com.yandex.metrica.billing_interface.c.UNKNOWN;
            }
        } else if (strF.equals("subs")) {
            cVar = com.yandex.metrica.billing_interface.c.SUBS;
        } else {
            cVar = com.yandex.metrica.billing_interface.c.UNKNOWN;
        }
        com.yandex.metrica.billing_interface.c cVar2 = cVar;
        String strE = skuDetails.e();
        int iOptInt = purchaseHistoryRecord.f3753c.optInt("quantity", 1);
        long jOptLong = skuDetails.f3755b.optLong("price_amount_micros");
        String strOptString = skuDetails.f3755b.optString("price_currency_code");
        long jA = a(skuDetails);
        com.yandex.metrica.billing_interface.b bVarC = c(skuDetails);
        int iB = b(skuDetails);
        com.yandex.metrica.billing_interface.b bVarA = com.yandex.metrica.billing_interface.b.a(skuDetails.f3755b.optString("subscriptionPeriod"));
        String str2 = purchaseHistoryRecord.f3752b;
        String strB = purchaseHistoryRecord.b();
        long jA2 = purchaseHistoryRecord.a();
        boolean zC = purchase != null ? purchase.c() : false;
        if (purchase == null || (str = purchase.f3748a) == null) {
            str = "{}";
        }
        return new ca.b(cVar2, strE, iOptInt, jOptLong, strOptString, jA, bVarC, iB, bVarA, str2, strB, jA2, zC, str);
    }
}
