package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeno implements zzeqy {
    private final Context zza;
    private final zzfwn zzb;

    public zzeno(Context context, zzfwn zzfwnVar) {
        this.zza = context;
        this.zzb = zzfwnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqy
    public final int zza() {
        return 18;
    }

    @Override // com.google.android.gms.internal.ads.zzeqy
    public final zzfwm zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzenl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        });
    }

    public final /* synthetic */ zzenn zzc() throws Exception {
        Bundle bundle;
        com.google.android.gms.ads.internal.zzt.zzp();
        String string = !((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzfP)).booleanValue() ? "" : this.zza.getSharedPreferences("mobileads_consent", 0).getString("consent_string", "");
        String string2 = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzfR)).booleanValue() ? this.zza.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", "") : "";
        com.google.android.gms.ads.internal.zzt.zzp();
        Context context = this.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzfQ)).booleanValue()) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            bundle = new Bundle();
            if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
                bundle.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
            }
            String[] strArr = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
            for (int i10 = 0; i10 < 4; i10++) {
                String str = strArr[i10];
                if (defaultSharedPreferences.contains(str)) {
                    bundle.putString(str, defaultSharedPreferences.getString(str, null));
                }
            }
        } else {
            bundle = null;
        }
        return new zzenn(string, string2, bundle, null);
    }
}
