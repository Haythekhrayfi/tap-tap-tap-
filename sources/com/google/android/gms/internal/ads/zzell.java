package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzell implements zzeqy {
    private final zzfwn zza;
    private final zzdnv zzb;
    private final zzdsc zzc;
    private final zzeln zzd;

    public zzell(zzfwn zzfwnVar, zzdnv zzdnvVar, zzdsc zzdscVar, zzeln zzelnVar) {
        this.zza = zzfwnVar;
        this.zzb = zzdnvVar;
        this.zzc = zzdscVar;
        this.zzd = zzelnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqy
    public final int zza() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzeqy
    public final zzfwm zzb() {
        zzbbe zzbbeVar = zzbbm.zzka;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbeVar)).booleanValue() && this.zzd.zza() != null) {
            zzelm zzelmVarZza = this.zzd.zza();
            Objects.requireNonNull(zzelmVarZza);
            return zzfwc.zzh(zzelmVarZza);
        }
        if (zzfpw.zzd((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzbn)) || (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbeVar)).booleanValue() && (this.zzd.zzd() || !this.zzc.zzt()))) {
            return zzfwc.zzh(new zzelm(new Bundle()));
        }
        this.zzd.zzc(true);
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzelk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        });
    }

    public final /* synthetic */ zzelm zzc() throws Exception {
        List<String> listAsList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzbn)).split(";"));
        Bundle bundle = new Bundle();
        for (String str : listAsList) {
            try {
                zzfbd zzfbdVarZzc = this.zzb.zzc(str, new JSONObject());
                zzfbdVarZzc.zzC();
                boolean zZzt = this.zzc.zzt();
                Bundle bundle2 = new Bundle();
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzka)).booleanValue() || zZzt) {
                    try {
                        zzbqh zzbqhVarZzf = zzfbdVarZzc.zzf();
                        if (zzbqhVarZzf != null) {
                            bundle2.putString("sdk_version", zzbqhVarZzf.toString());
                        }
                    } catch (zzfan unused) {
                    }
                }
                try {
                    zzbqh zzbqhVarZze = zzfbdVarZzc.zze();
                    if (zzbqhVarZze != null) {
                        bundle2.putString("adapter_version", zzbqhVarZze.toString());
                    }
                } catch (zzfan unused2) {
                }
                bundle.putBundle(str, bundle2);
            } catch (zzfan unused3) {
            }
        }
        zzelm zzelmVar = new zzelm(bundle);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzka)).booleanValue()) {
            this.zzd.zzb(zzelmVar);
        }
        return zzelmVar;
    }
}
