package ha;

import android.os.Bundle;
import com.applovin.mediation.MaxAd;
import com.applovin.sdk.AppLovinEventParameters;
import com.applovin.sdk.AppLovinMediationProvider;
import fd.j0;

/* JADX INFO: loaded from: classes3.dex */
public final class l {
    public static final Bundle a(MaxAd maxAd) {
        double revenue = maxAd.getRevenue();
        String networkName = maxAd.getNetworkName();
        String adUnitId = maxAd.getAdUnitId();
        jc.h[] hVarArr = new jc.h[8];
        int i10 = 0;
        hVarArr[0] = new jc.h("valuemicros", Long.valueOf((long) (((double) 1000000) * revenue)));
        hVarArr[1] = new jc.h("value", Float.valueOf((float) revenue));
        hVarArr[2] = new jc.h(AppLovinEventParameters.REVENUE_CURRENCY, "USD");
        String revenuePrecision = maxAd.getRevenuePrecision();
        j0.h(revenuePrecision, "ad.revenuePrecision");
        int iHashCode = revenuePrecision.hashCode();
        if (iHashCode != -623607748) {
            if (iHashCode != 96946943) {
                if (iHashCode == 655944390 && revenuePrecision.equals("publisher_defined")) {
                    i10 = 2;
                }
            } else if (revenuePrecision.equals("exact")) {
                i10 = 3;
            }
        } else if (revenuePrecision.equals("estimated")) {
            i10 = 1;
        }
        hVarArr[3] = new jc.h("precision", Integer.valueOf(i10));
        hVarArr[4] = new jc.h("adunitid", adUnitId);
        hVarArr[5] = new jc.h("mediation", "applovin");
        hVarArr[6] = new jc.h("ad_format", maxAd.getFormat().getLabel());
        if (networkName == null) {
            networkName = AppLovinMediationProvider.UNKNOWN;
        }
        hVarArr[7] = new jc.h("network", networkName);
        return androidx.activity.i.a(hVarArr);
    }
}
