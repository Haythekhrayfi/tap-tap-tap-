package com.android.billingclient.api;

import android.os.Bundle;
import com.google.android.gms.internal.play_billing.zzb;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class i0 {
    public static r.g a(Bundle bundle, String str, String str2) {
        n nVar = e0.f3777j;
        if (bundle == null) {
            zzb.zzj("BillingClient", String.format("%s got null owned items list", str2));
            return new r.g(nVar, 54);
        }
        int iZzb = zzb.zzb(bundle, "BillingClient");
        String strZzf = zzb.zzf(bundle, "BillingClient");
        n nVar2 = new n();
        nVar2.f3848a = iZzb;
        nVar2.f3849b = strZzf;
        if (iZzb != 0) {
            zzb.zzj("BillingClient", String.format("%s failed. Response code: %s", str2, Integer.valueOf(iZzb)));
            return new r.g(nVar2, 23);
        }
        if (!bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") || !bundle.containsKey("INAPP_PURCHASE_DATA_LIST") || !bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
            zzb.zzj("BillingClient", String.format("Bundle returned from %s doesn't contain required fields.", str2));
            return new r.g(nVar, 55);
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        if (stringArrayList == null) {
            zzb.zzj("BillingClient", String.format("Bundle returned from %s contains null SKUs list.", str2));
            return new r.g(nVar, 56);
        }
        if (stringArrayList2 == null) {
            zzb.zzj("BillingClient", String.format("Bundle returned from %s contains null purchases list.", str2));
            return new r.g(nVar, 57);
        }
        if (stringArrayList3 != null) {
            return new r.g(e0.f3778k, 1);
        }
        zzb.zzj("BillingClient", String.format("Bundle returned from %s contains null signatures list.", str2));
        return new r.g(nVar, 58);
    }
}
