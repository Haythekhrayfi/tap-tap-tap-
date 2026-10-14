package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
final class zzbay extends zzbbe {
    public zzbay(int i10, String str, Boolean bool) {
        super(i10, str, bool, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbbe
    public final /* bridge */ /* synthetic */ Object zza(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optBoolean(zzn(), ((Boolean) zzm()).booleanValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzbbe
    public final /* bridge */ /* synthetic */ Object zzb(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(zzn())) ? Boolean.valueOf(bundle.getBoolean("com.google.android.gms.ads.flag.".concat(zzn()))) : (Boolean) zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzbbe
    public final /* bridge */ /* synthetic */ Object zzc(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(zzn(), ((Boolean) zzm()).booleanValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzbbe
    public final /* bridge */ /* synthetic */ void zzd(SharedPreferences.Editor editor, Object obj) {
        editor.putBoolean(zzn(), ((Boolean) obj).booleanValue());
    }
}
