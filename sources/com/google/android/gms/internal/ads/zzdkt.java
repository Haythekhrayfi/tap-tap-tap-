package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdkt {
    private final zzfai zza;
    private final Executor zzb;
    private final zzdni zzc;
    private final zzdmd zzd;
    private final Context zze;
    private final zzdqa zzf;
    private final zzfev zzg;
    private final zzfgr zzh;
    private final zzeba zzi;

    public zzdkt(zzfai zzfaiVar, Executor executor, zzdni zzdniVar, Context context, zzdqa zzdqaVar, zzfev zzfevVar, zzfgr zzfgrVar, zzeba zzebaVar, zzdmd zzdmdVar) {
        this.zza = zzfaiVar;
        this.zzb = executor;
        this.zzc = zzdniVar;
        this.zze = context;
        this.zzf = zzdqaVar;
        this.zzg = zzfevVar;
        this.zzh = zzfgrVar;
        this.zzi = zzebaVar;
        this.zzd = zzdmdVar;
    }

    private final void zzh(zzcez zzcezVar) {
        zzi(zzcezVar);
        zzcezVar.zzad("/video", zzbii.zzl);
        zzcezVar.zzad("/videoMeta", zzbii.zzm);
        zzcezVar.zzad("/precache", new zzcdm());
        zzcezVar.zzad("/delayPageLoaded", zzbii.zzp);
        zzcezVar.zzad("/instrument", zzbii.zzn);
        zzcezVar.zzad("/log", zzbii.zzg);
        zzcezVar.zzad("/click", new zzbhk(null));
        if (this.zza.zzb != null) {
            zzcezVar.zzN().zzD(true);
            zzcezVar.zzad("/open", new zzbit(null, null, null, null, null));
        } else {
            zzcezVar.zzN().zzD(false);
        }
        if (com.google.android.gms.ads.internal.zzt.zzn().zzu(zzcezVar.getContext())) {
            zzcezVar.zzad("/logScionEvent", new zzbio(zzcezVar.getContext()));
        }
    }

    private static final void zzi(zzcez zzcezVar) {
        zzcezVar.zzad("/videoClicked", zzbii.zzh);
        zzcezVar.zzN().zzF(true);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzdw)).booleanValue()) {
            zzcezVar.zzad("/getNativeAdViewSignals", zzbii.zzs);
        }
        zzcezVar.zzad("/getNativeClickMeta", zzbii.zzt);
    }

    public final zzfwm zza(final JSONObject jSONObject) {
        return zzfwc.zzm(zzfwc.zzm(zzfwc.zzh(null), new zzfvj() { // from class: com.google.android.gms.internal.ads.zzdkj
            @Override // com.google.android.gms.internal.ads.zzfvj
            public final zzfwm zza(Object obj) {
                return this.zza.zze(obj);
            }
        }, this.zzb), new zzfvj() { // from class: com.google.android.gms.internal.ads.zzdkk
            @Override // com.google.android.gms.internal.ads.zzfvj
            public final zzfwm zza(Object obj) {
                return this.zza.zzc(jSONObject, (zzcez) obj);
            }
        }, this.zzb);
    }

    public final zzfwm zzb(final String str, final String str2, final zzezn zzeznVar, final zzezq zzezqVar, final com.google.android.gms.ads.internal.client.zzq zzqVar) {
        return zzfwc.zzm(zzfwc.zzh(null), new zzfvj() { // from class: com.google.android.gms.internal.ads.zzdkm
            @Override // com.google.android.gms.internal.ads.zzfvj
            public final zzfwm zza(Object obj) {
                return this.zza.zzd(zzqVar, zzeznVar, zzezqVar, str, str2, obj);
            }
        }, this.zzb);
    }

    public final /* synthetic */ zzfwm zzc(JSONObject jSONObject, final zzcez zzcezVar) throws Exception {
        final zzcai zzcaiVarZza = zzcai.zza(zzcezVar);
        zzcezVar.zzag(this.zza.zzb != null ? zzcgo.zzd() : zzcgo.zze());
        zzcezVar.zzN().zzA(new zzcgk() { // from class: com.google.android.gms.internal.ads.zzdki
            @Override // com.google.android.gms.internal.ads.zzcgk
            public final void zza(boolean z10) {
                this.zza.zzf(zzcezVar, zzcaiVarZza, z10);
            }
        });
        zzcezVar.zzl("google.afma.nativeAds.renderVideo", jSONObject);
        return zzcaiVarZza;
    }

    public final /* synthetic */ zzfwm zzd(com.google.android.gms.ads.internal.client.zzq zzqVar, zzezn zzeznVar, zzezq zzezqVar, String str, String str2, Object obj) throws Exception {
        final zzcez zzcezVarZza = this.zzc.zza(zzqVar, zzeznVar, zzezqVar);
        final zzcai zzcaiVarZza = zzcai.zza(zzcezVarZza);
        if (this.zza.zzb != null) {
            zzh(zzcezVarZza);
            zzcezVarZza.zzag(zzcgo.zzd());
        } else {
            zzdma zzdmaVarZzb = this.zzd.zzb();
            zzcezVarZza.zzN().zzM(zzdmaVarZzb, zzdmaVarZzb, zzdmaVarZzb, zzdmaVarZzb, zzdmaVarZzb, false, null, new com.google.android.gms.ads.internal.zzb(this.zze, null, null), null, null, this.zzi, this.zzh, this.zzf, this.zzg, null, zzdmaVarZzb, null, null);
            zzi(zzcezVarZza);
        }
        zzcezVarZza.zzN().zzA(new zzcgk() { // from class: com.google.android.gms.internal.ads.zzdkn
            @Override // com.google.android.gms.internal.ads.zzcgk
            public final void zza(boolean z10) {
                this.zza.zzg(zzcezVarZza, zzcaiVarZza, z10);
            }
        });
        zzcezVarZza.zzab(str, str2, null);
        return zzcaiVarZza;
    }

    public final /* synthetic */ zzfwm zze(Object obj) throws Exception {
        zzcez zzcezVarZza = this.zzc.zza(com.google.android.gms.ads.internal.client.zzq.zzc(), null, null);
        final zzcai zzcaiVarZza = zzcai.zza(zzcezVarZza);
        zzh(zzcezVarZza);
        zzcezVarZza.zzN().zzG(new zzcgl() { // from class: com.google.android.gms.internal.ads.zzdkl
            @Override // com.google.android.gms.internal.ads.zzcgl
            public final void zza() {
                zzcaiVarZza.zzb();
            }
        });
        zzcezVarZza.loadUrl((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzdv));
        return zzcaiVarZza;
    }

    public final /* synthetic */ void zzf(zzcez zzcezVar, zzcai zzcaiVar, boolean z10) {
        if (this.zza.zza != null && zzcezVar.zzq() != null) {
            zzcezVar.zzq().zzs(this.zza.zza);
        }
        zzcaiVar.zzb();
    }

    public final /* synthetic */ void zzg(zzcez zzcezVar, zzcai zzcaiVar, boolean z10) {
        if (!z10) {
            zzcaiVar.zze(new zzefu(1, "Html video Web View failed to load."));
            return;
        }
        if (this.zza.zza != null && zzcezVar.zzq() != null) {
            zzcezVar.zzq().zzs(this.zza.zza);
        }
        zzcaiVar.zzb();
    }
}
