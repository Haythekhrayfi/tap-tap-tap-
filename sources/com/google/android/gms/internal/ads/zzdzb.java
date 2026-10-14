package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.ads.AdSDKNotificationListener;
import com.google.android.gms.ads.MobileAds;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdzb implements zzczy, com.google.android.gms.ads.internal.client.zza, zzcwa, zzcvk {
    private final Context zza;
    private final zzfax zzb;
    private final zzezz zzc;
    private final zzezn zzd;
    private final zzeba zze;
    private Boolean zzf;
    private final boolean zzg = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzgE)).booleanValue();
    private final zzfev zzh;
    private final String zzi;

    public zzdzb(Context context, zzfax zzfaxVar, zzezz zzezzVar, zzezn zzeznVar, zzeba zzebaVar, zzfev zzfevVar, String str) {
        this.zza = context;
        this.zzb = zzfaxVar;
        this.zzc = zzezzVar;
        this.zzd = zzeznVar;
        this.zze = zzebaVar;
        this.zzh = zzfevVar;
        this.zzi = str;
    }

    private final zzfeu zzf(String str) {
        zzfeu zzfeuVarZzb = zzfeu.zzb(str);
        zzfeuVarZzb.zzh(this.zzc, null);
        zzfeuVarZzb.zzf(this.zzd);
        zzfeuVarZzb.zza("request_id", this.zzi);
        if (!this.zzd.zzu.isEmpty()) {
            zzfeuVarZzb.zza("ancn", (String) this.zzd.zzu.get(0));
        }
        if (this.zzd.zzaj) {
            zzfeuVarZzb.zza("device_connectivity", true != com.google.android.gms.ads.internal.zzt.zzo().zzx(this.zza) ? "offline" : "online");
            zzfeuVarZzb.zza("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()));
            zzfeuVarZzb.zza("offline_ad", "1");
        }
        return zzfeuVarZzb;
    }

    private final void zzg(zzfeu zzfeuVar) {
        if (!this.zzd.zzaj) {
            this.zzh.zzb(zzfeuVar);
            return;
        }
        this.zze.zzd(new zzebc(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis(), this.zzc.zzb.zzb.zzb, this.zzh.zza(zzfeuVar), 2));
    }

    private final boolean zzh() {
        if (this.zzf == null) {
            synchronized (this) {
                if (this.zzf == null) {
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
                    this.zzf = Boolean.valueOf(zMatches);
                }
            }
        }
        return this.zzf.booleanValue();
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (this.zzd.zzaj) {
            zzg(zzf("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvk
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.client.zze zzeVar2;
        if (this.zzg) {
            int i10 = zzeVar.zza;
            String str = zzeVar.zzb;
            if (zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN) && (zzeVar2 = zzeVar.zzd) != null && !zzeVar2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                com.google.android.gms.ads.internal.client.zze zzeVar3 = zzeVar.zzd;
                i10 = zzeVar3.zza;
                str = zzeVar3.zzb;
            }
            String strZza = this.zzb.zza(str);
            zzfeu zzfeuVarZzf = zzf("ifts");
            zzfeuVarZzf.zza("reason", "adapter");
            if (i10 >= 0) {
                zzfeuVarZzf.zza("arec", String.valueOf(i10));
            }
            if (strZza != null) {
                zzfeuVarZzf.zza("areec", strZza);
            }
            this.zzh.zzb(zzfeuVarZzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvk
    public final void zzb() {
        if (this.zzg) {
            zzfev zzfevVar = this.zzh;
            zzfeu zzfeuVarZzf = zzf("ifts");
            zzfeuVarZzf.zza("reason", "blocked");
            zzfevVar.zzb(zzfeuVarZzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvk
    public final void zzc(zzdev zzdevVar) {
        if (this.zzg) {
            zzfeu zzfeuVarZzf = zzf("ifts");
            zzfeuVarZzf.zza("reason", "exception");
            if (!TextUtils.isEmpty(zzdevVar.getMessage())) {
                zzfeuVarZzf.zza("msg", zzdevVar.getMessage());
            }
            this.zzh.zzb(zzfeuVarZzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczy
    public final void zzd() {
        if (zzh()) {
            this.zzh.zzb(zzf("adapter_shown"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczy
    public final void zze() {
        if (zzh()) {
            this.zzh.zzb(zzf("adapter_impression"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwa
    public final void zzl() {
        if (zzh() || this.zzd.zzaj) {
            zzg(zzf(AdSDKNotificationListener.IMPRESSION_EVENT));
        }
    }
}
