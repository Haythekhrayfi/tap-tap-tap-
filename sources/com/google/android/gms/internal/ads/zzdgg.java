package com.google.android.gms.internal.ads;

import com.yandex.metrica.plugins.PluginErrorDetails;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdgg implements zzgwe {
    private final zzgwr zza;
    private final zzgwr zzb;

    public zzdgg(zzgwr zzgwrVar, zzgwr zzgwrVar2) {
        this.zza = zzgwrVar;
        this.zzb = zzgwrVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbzx zzbzxVarZza = ((zzchm) this.zza).zza();
        com.google.android.gms.ads.internal.zzt.zzp();
        return new zzatw(UUID.randomUUID().toString(), zzbzxVarZza, PluginErrorDetails.Platform.NATIVE, new JSONObject(), false, true);
    }
}
