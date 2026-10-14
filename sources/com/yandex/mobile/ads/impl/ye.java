package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.model.AdUnitIdBiddingSettings;
import com.yandex.mobile.ads.base.model.BiddingSettings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
final class ye {
    public static BiddingSettings a(b90 b90Var) {
        Set setA = b90Var.a(Collections.emptySet());
        if (!setA.isEmpty()) {
            xe xeVar = new xe();
            ArrayList arrayList = new ArrayList(setA.size());
            Iterator it = setA.iterator();
            while (it.hasNext()) {
                String strB = b90Var.b("BiddingSettingsAdUnitIdsInfo_" + ((String) it.next()));
                if (strB != null && !strB.isEmpty()) {
                    try {
                        AdUnitIdBiddingSettings adUnitIdBiddingSettingsA = xeVar.a(new JSONObject(strB));
                        if (adUnitIdBiddingSettingsA != null) {
                            arrayList.add(adUnitIdBiddingSettingsA);
                        }
                    } catch (JSONException unused) {
                        x60.c("Can't parse bidding block from shared prefs", new Object[0]);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                return new BiddingSettings(arrayList);
            }
        }
        return null;
    }

    public static void a(b90 b90Var, BiddingSettings biddingSettings) {
        List<AdUnitIdBiddingSettings> listC = biddingSettings.c();
        HashSet hashSet = new HashSet(listC.size());
        for (AdUnitIdBiddingSettings adUnitIdBiddingSettings : listC) {
            String strC = adUnitIdBiddingSettings.c();
            String strE = adUnitIdBiddingSettings.e();
            hashSet.add(strC);
            b90Var.putString("BiddingSettingsAdUnitIdsInfo_" + strC, strE);
        }
        for (String str : b90Var.a(Collections.emptySet())) {
            if (!hashSet.contains(str)) {
                b90Var.remove("BiddingSettingsAdUnitIdsInfo_" + str);
            }
        }
        b90Var.a(hashSet);
    }

    public static void b(b90 b90Var) {
        Iterator it = b90Var.a(Collections.emptySet()).iterator();
        while (it.hasNext()) {
            b90Var.remove("BiddingSettingsAdUnitIdsInfo_" + ((String) it.next()));
        }
        b90Var.remove("BiddingSettingsAdUnitIdsSet");
    }
}
