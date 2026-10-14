package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class zzehh implements zzecc {
    private final zzece zza;
    private final zzeci zzb;
    private final zzfel zzc;
    private final zzfwn zzd;

    public zzehh(zzfel zzfelVar, zzfwn zzfwnVar, zzece zzeceVar, zzeci zzeciVar) {
        this.zzc = zzfelVar;
        this.zzd = zzfwnVar;
        this.zzb = zzeciVar;
        this.zza = zzeceVar;
    }

    public static final String zze(String str, int i10) {
        return "Error from: " + str + ", code: " + i10;
    }

    @Override // com.google.android.gms.internal.ads.zzecc
    public final zzfwm zza(final zzezz zzezzVar, final zzezn zzeznVar) {
        final zzecf zzecfVarZza;
        Iterator it = zzeznVar.zzu.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzecfVarZza = null;
                break;
            }
            try {
                zzecfVarZza = this.zza.zza((String) it.next(), zzeznVar.zzw);
                break;
            } catch (zzfan unused) {
            }
        }
        if (zzecfVarZza == null) {
            return zzfwc.zzg(new zzefe("Unable to instantiate mediation adapter class."));
        }
        zzcaj zzcajVar = new zzcaj();
        zzecfVarZza.zzc.zza(new zzehg(this, zzecfVarZza, zzcajVar));
        if (zzeznVar.zzN) {
            Bundle bundle = zzezzVar.zza.zza.zzd.zzm;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        zzfel zzfelVar = this.zzc;
        return zzfdv.zzd(new zzfdp() { // from class: com.google.android.gms.internal.ads.zzehe
            @Override // com.google.android.gms.internal.ads.zzfdp
            public final void zza() throws Exception {
                this.zza.zzd(zzezzVar, zzeznVar, zzecfVarZza);
            }
        }, this.zzd, zzfef.ADAPTER_LOAD_AD_SYN, zzfelVar).zzb(zzfef.ADAPTER_LOAD_AD_ACK).zzd(zzcajVar).zzb(zzfef.ADAPTER_WRAP_ADAPTER).zze(new zzfdo() { // from class: com.google.android.gms.internal.ads.zzehf
            @Override // com.google.android.gms.internal.ads.zzfdo
            public final Object zza(Object obj) {
                return this.zza.zzc(zzezzVar, zzeznVar, zzecfVarZza, (Void) obj);
            }
        }).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzecc
    public final boolean zzb(zzezz zzezzVar, zzezn zzeznVar) {
        return !zzeznVar.zzu.isEmpty();
    }

    public final /* synthetic */ Object zzc(zzezz zzezzVar, zzezn zzeznVar, zzecf zzecfVar, Void r10) throws Exception {
        return this.zzb.zza(zzezzVar, zzeznVar, zzecfVar);
    }

    public final /* synthetic */ void zzd(zzezz zzezzVar, zzezn zzeznVar, zzecf zzecfVar) throws Exception {
        this.zzb.zzb(zzezzVar, zzeznVar, zzecfVar);
    }
}
