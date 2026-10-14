package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventParameters;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzefh implements zzecc {
    private static Bundle zzd(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzecc
    public final zzfwm zza(zzezz zzezzVar, zzezn zzeznVar) {
        String strOptString = zzeznVar.zzw.optString("pubid", "");
        zzfai zzfaiVar = zzezzVar.zza.zza;
        zzfag zzfagVar = new zzfag();
        zzfagVar.zzp(zzfaiVar);
        zzfagVar.zzs(strOptString);
        Bundle bundleZzd = zzd(zzfaiVar.zzd.zzm);
        Bundle bundleZzd2 = zzd(bundleZzd.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        bundleZzd2.putInt("gw", 1);
        String strOptString2 = zzeznVar.zzw.optString(AdMobAdapter.HOUSE_ADS_PARAMETER, null);
        if (strOptString2 != null) {
            bundleZzd2.putString(AdMobAdapter.HOUSE_ADS_PARAMETER, strOptString2);
        }
        String strOptString3 = zzeznVar.zzw.optString(AdMobAdapter.AD_JSON_PARAMETER, null);
        if (strOptString3 != null) {
            bundleZzd2.putString(AdMobAdapter.AD_PARAMETER, strOptString3);
        }
        bundleZzd2.putBoolean("_noRefresh", true);
        Iterator<String> itKeys = zzeznVar.zzE.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString4 = zzeznVar.zzE.optString(next, null);
            if (next != null) {
                bundleZzd2.putString(next, strOptString4);
            }
        }
        bundleZzd.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundleZzd2);
        com.google.android.gms.ads.internal.client.zzl zzlVar = zzfaiVar.zzd;
        zzfagVar.zzE(new com.google.android.gms.ads.internal.client.zzl(zzlVar.zza, zzlVar.zzb, bundleZzd2, zzlVar.zzd, zzlVar.zze, zzlVar.zzf, zzlVar.zzg, zzlVar.zzh, zzlVar.zzi, zzlVar.zzj, zzlVar.zzk, zzlVar.zzl, bundleZzd, zzlVar.zzn, zzlVar.zzo, zzlVar.zzp, zzlVar.zzq, zzlVar.zzr, zzlVar.zzs, zzlVar.zzt, zzlVar.zzu, zzlVar.zzv, zzlVar.zzw, zzlVar.zzx));
        zzfai zzfaiVarZzG = zzfagVar.zzG();
        Bundle bundle = new Bundle();
        zzezq zzezqVar = zzezzVar.zzb.zzb;
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("nofill_urls", new ArrayList<>(zzezqVar.zza));
        bundle2.putInt("refresh_interval", zzezqVar.zzc);
        bundle2.putString("gws_query_id", zzezqVar.zzb);
        bundle.putBundle("parent_common_config", bundle2);
        String str = zzezzVar.zza.zza.zzf;
        Bundle bundle3 = new Bundle();
        bundle3.putString("initial_ad_unit_id", str);
        bundle3.putString("allocation_id", zzeznVar.zzx);
        bundle3.putStringArrayList("click_urls", new ArrayList<>(zzeznVar.zzc));
        bundle3.putStringArrayList("imp_urls", new ArrayList<>(zzeznVar.zzd));
        bundle3.putStringArrayList("manual_tracking_urls", new ArrayList<>(zzeznVar.zzq));
        bundle3.putStringArrayList("fill_urls", new ArrayList<>(zzeznVar.zzn));
        bundle3.putStringArrayList("video_start_urls", new ArrayList<>(zzeznVar.zzh));
        bundle3.putStringArrayList("video_reward_urls", new ArrayList<>(zzeznVar.zzi));
        bundle3.putStringArrayList("video_complete_urls", new ArrayList<>(zzeznVar.zzj));
        bundle3.putString(AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER, zzeznVar.zzk);
        bundle3.putString("valid_from_timestamp", zzeznVar.zzl);
        bundle3.putBoolean("is_closable_area_disabled", zzeznVar.zzQ);
        bundle3.putString("recursive_server_response_data", zzeznVar.zzap);
        if (zzeznVar.zzm != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt("rb_amount", zzeznVar.zzm.zzb);
            bundle4.putString("rb_type", zzeznVar.zzm.zza);
            bundle3.putParcelableArray("rewards", new Bundle[]{bundle4});
        }
        bundle.putBundle("parent_ad_config", bundle3);
        return zzc(zzfaiVarZzG, bundle, zzeznVar, zzezzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzecc
    public final boolean zzb(zzezz zzezzVar, zzezn zzeznVar) {
        return !TextUtils.isEmpty(zzeznVar.zzw.optString("pubid", ""));
    }

    public abstract zzfwm zzc(zzfai zzfaiVar, Bundle bundle, zzezn zzeznVar, zzezz zzezzVar);
}
