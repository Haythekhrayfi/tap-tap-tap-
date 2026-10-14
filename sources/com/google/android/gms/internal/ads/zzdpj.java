package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.ads.AdSDKNotificationListener;
import com.google.android.gms.ads.MobileAds;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdpj implements zzczy, com.google.android.gms.ads.internal.client.zza, zzcwa, zzcvk {
    private final Context zza;
    private final zzfax zzb;
    private final zzdqa zzc;
    private final zzezz zzd;
    private final zzezn zze;
    private final zzeba zzf;
    private Boolean zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzgE)).booleanValue();

    public zzdpj(Context context, zzfax zzfaxVar, zzdqa zzdqaVar, zzezz zzezzVar, zzezn zzeznVar, zzeba zzebaVar) {
        this.zza = context;
        this.zzb = zzfaxVar;
        this.zzc = zzdqaVar;
        this.zzd = zzezzVar;
        this.zze = zzeznVar;
        this.zzf = zzebaVar;
    }

    private final zzdpz zzf(String str) {
        zzdpz zzdpzVarZza = this.zzc.zza();
        zzdpzVarZza.zze(this.zzd.zzb.zzb);
        zzdpzVarZza.zzd(this.zze);
        zzdpzVarZza.zzb("action", str);
        if (!this.zze.zzu.isEmpty()) {
            zzdpzVarZza.zzb("ancn", (String) this.zze.zzu.get(0));
        }
        if (this.zze.zzaj) {
            zzdpzVarZza.zzb("device_connectivity", true != com.google.android.gms.ads.internal.zzt.zzo().zzx(this.zza) ? "offline" : "online");
            zzdpzVarZza.zzb("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()));
            zzdpzVarZza.zzb("offline_ad", "1");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzgN)).booleanValue()) {
            boolean z10 = com.google.android.gms.ads.nonagon.signalgeneration.zzf.zze(this.zzd.zza.zza) != 1;
            zzdpzVarZza.zzb("scar", String.valueOf(z10));
            if (z10) {
                com.google.android.gms.ads.internal.client.zzl zzlVar = this.zzd.zza.zza.zzd;
                zzdpzVarZza.zzc("ragent", zzlVar.zzp);
                zzdpzVarZza.zzc("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzf.zza(com.google.android.gms.ads.nonagon.signalgeneration.zzf.zzb(zzlVar)));
            }
        }
        return zzdpzVarZza;
    }

    private final void zzg(zzdpz zzdpzVar) {
        if (!this.zze.zzaj) {
            zzdpzVar.zzg();
            return;
        }
        this.zzf.zzd(new zzebc(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis(), this.zzd.zzb.zzb.zzb, zzdpzVar.zzf(), 2));
    }

    private final boolean zzh() {
        if (this.zzg == null) {
            synchronized (this) {
                if (this.zzg == null) {
                    String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzbp);
                    com.google.android.gms.ads.internal.zzt.zzp();
                    String strZzn = com.google.android.gms.ads.internal.util.zzs.zzn(this.zza);
                    boolean zMatches = false;
                    if (str != null && strZzn != null) {
                        try {
                            zMatches = Pattern.matches(str, strZzn);
                        } catch (RuntimeException e10) {
                            com.google.android.gms.ads.internal.zzt.zzo().zzu(e10, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.zzg = Boolean.valueOf(zMatches);
                }
            }
        }
        return this.zzg.booleanValue();
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (this.zze.zzaj) {
            zzg(zzf("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvk
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.client.zze zzeVar2;
        if (this.zzh) {
            zzdpz zzdpzVarZzf = zzf("ifts");
            zzdpzVarZzf.zzb("reason", "adapter");
            int i10 = zzeVar.zza;
            String str = zzeVar.zzb;
            if (zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN) && (zzeVar2 = zzeVar.zzd) != null && !zzeVar2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                com.google.android.gms.ads.internal.client.zze zzeVar3 = zzeVar.zzd;
                i10 = zzeVar3.zza;
                str = zzeVar3.zzb;
            }
            if (i10 >= 0) {
                zzdpzVarZzf.zzb("arec", String.valueOf(i10));
            }
            String strZza = this.zzb.zza(str);
            if (strZza != null) {
                zzdpzVarZzf.zzb("areec", strZza);
            }
            zzdpzVarZzf.zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvk
    public final void zzb() {
        if (this.zzh) {
            zzdpz zzdpzVarZzf = zzf("ifts");
            zzdpzVarZzf.zzb("reason", "blocked");
            zzdpzVarZzf.zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvk
    public final void zzc(zzdev zzdevVar) {
        if (this.zzh) {
            zzdpz zzdpzVarZzf = zzf("ifts");
            zzdpzVarZzf.zzb("reason", "exception");
            if (!TextUtils.isEmpty(zzdevVar.getMessage())) {
                zzdpzVarZzf.zzb("msg", zzdevVar.getMessage());
            }
            zzdpzVarZzf.zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczy
    public final void zzd() {
        if (zzh()) {
            zzf("adapter_shown").zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczy
    public final void zze() {
        if (zzh()) {
            zzf("adapter_impression").zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwa
    public final void zzl() {
        if (zzh() || this.zze.zzaj) {
            zzg(zzf(AdSDKNotificationListener.IMPRESSION_EVENT));
        }
    }
}
