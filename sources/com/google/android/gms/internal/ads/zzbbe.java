package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbbe {
    private final int zza;
    private final String zzb;
    private final Object zzc;

    public /* synthetic */ zzbbe(int i10, String str, Object obj, zzbbd zzbbdVar) {
        this.zza = i10;
        this.zzb = str;
        this.zzc = obj;
        com.google.android.gms.ads.internal.client.zzba.zza().zzd(this);
    }

    public static zzbbe zzf(int i10, String str, float f10) {
        return new zzbbb(1, str, Float.valueOf(f10));
    }

    public static zzbbe zzg(int i10, String str, int i11) {
        return new zzbaz(1, str, Integer.valueOf(i11));
    }

    public static zzbbe zzh(int i10, String str, long j10) {
        return new zzbba(1, str, Long.valueOf(j10));
    }

    public static zzbbe zzi(int i10, String str, Boolean bool) {
        return new zzbay(i10, str, bool);
    }

    public static zzbbe zzj(int i10, String str, String str2) {
        return new zzbbc(1, str, str2);
    }

    public static zzbbe zzk(int i10, String str) {
        zzbbe zzbbeVarZzj = zzj(1, "gads:sdk_core_constants:experiment_id", null);
        com.google.android.gms.ads.internal.client.zzba.zza().zzc(zzbbeVarZzj);
        return zzbbeVarZzj;
    }

    public abstract Object zza(JSONObject jSONObject);

    public abstract Object zzb(Bundle bundle);

    public abstract Object zzc(SharedPreferences sharedPreferences);

    public abstract void zzd(SharedPreferences.Editor editor, Object obj);

    public final int zze() {
        return this.zza;
    }

    public final Object zzl() {
        return com.google.android.gms.ads.internal.client.zzba.zzc().zzb(this);
    }

    public final Object zzm() {
        return this.zzc;
    }

    public final String zzn() {
        return this.zzb;
    }
}
