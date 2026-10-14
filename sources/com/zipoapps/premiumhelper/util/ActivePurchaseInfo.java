package com.zipoapps.premiumhelper.util;

import ch.qos.logback.core.CoreConstants;
import com.applovin.sdk.AppLovinEventParameters;
import fd.j0;
import l1.e;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivePurchaseInfo {
    private final long purchaseTime;
    private final String purchaseToken;
    private final String sku;
    private final d status;

    public ActivePurchaseInfo(String str, String str2, long j10, d dVar) {
        j0.i(str, AppLovinEventParameters.PRODUCT_IDENTIFIER);
        j0.i(str2, "purchaseToken");
        this.sku = str;
        this.purchaseToken = str2;
        this.purchaseTime = j10;
        this.status = dVar;
    }

    public static /* synthetic */ ActivePurchaseInfo copy$default(ActivePurchaseInfo activePurchaseInfo, String str, String str2, long j10, d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = activePurchaseInfo.sku;
        }
        if ((i10 & 2) != 0) {
            str2 = activePurchaseInfo.purchaseToken;
        }
        String str3 = str2;
        if ((i10 & 4) != 0) {
            j10 = activePurchaseInfo.purchaseTime;
        }
        long j11 = j10;
        if ((i10 & 8) != 0) {
            dVar = activePurchaseInfo.status;
        }
        return activePurchaseInfo.copy(str, str3, j11, dVar);
    }

    public final String component1() {
        return this.sku;
    }

    public final String component2() {
        return this.purchaseToken;
    }

    public final long component3() {
        return this.purchaseTime;
    }

    public final d component4() {
        return this.status;
    }

    public final ActivePurchaseInfo copy(String str, String str2, long j10, d dVar) {
        j0.i(str, AppLovinEventParameters.PRODUCT_IDENTIFIER);
        j0.i(str2, "purchaseToken");
        return new ActivePurchaseInfo(str, str2, j10, dVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivePurchaseInfo)) {
            return false;
        }
        ActivePurchaseInfo activePurchaseInfo = (ActivePurchaseInfo) obj;
        return j0.d(this.sku, activePurchaseInfo.sku) && j0.d(this.purchaseToken, activePurchaseInfo.purchaseToken) && this.purchaseTime == activePurchaseInfo.purchaseTime && this.status == activePurchaseInfo.status;
    }

    public final long getPurchaseTime() {
        return this.purchaseTime;
    }

    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final String getSku() {
        return this.sku;
    }

    public final d getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iA = r6.b.a(this.purchaseTime, e.a(this.purchaseToken, this.sku.hashCode() * 31, 31), 31);
        d dVar = this.status;
        return iA + (dVar == null ? 0 : dVar.hashCode());
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("ActivePurchaseInfo(sku=");
        sbA.append(this.sku);
        sbA.append(", purchaseToken=");
        sbA.append(this.purchaseToken);
        sbA.append(", purchaseTime=");
        sbA.append(this.purchaseTime);
        sbA.append(", status=");
        sbA.append(this.status);
        sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sbA.toString();
    }
}
