package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
final class zzbnc implements zzbiw {
    public final /* synthetic */ zzbnd zza;
    private final zzbmf zzb;
    private final zzcaj zzc;

    public zzbnc(zzbnd zzbndVar, zzbmf zzbmfVar, zzcaj zzcajVar) {
        this.zza = zzbndVar;
        this.zzb = zzbmfVar;
        this.zzc = zzcajVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbiw
    public final void zza(String str) {
        try {
            if (str == null) {
                this.zzc.zze(new zzbmo());
            } else {
                this.zzc.zze(new zzbmo(str));
            }
        } catch (IllegalStateException unused) {
        } finally {
            this.zzb.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbiw
    public final void zzb(JSONObject jSONObject) {
        try {
            try {
                this.zzc.zzd(this.zza.zza.zza(jSONObject));
            } catch (IllegalStateException unused) {
            } catch (JSONException e10) {
                this.zzc.zze(e10);
            }
        } finally {
            this.zzb.zzb();
        }
    }
}
