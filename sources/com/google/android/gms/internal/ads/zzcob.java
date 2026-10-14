package com.google.android.gms.internal.ads;

import com.yandex.metrica.plugins.PluginErrorDetails;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcob implements zzgwe {
    private final zzgwr zza;
    private final zzgwr zzb;
    private final zzgwr zzc;

    public zzcob(zzgwr zzgwrVar, zzgwr zzgwrVar2, zzgwr zzgwrVar3) {
        this.zza = zzgwrVar;
        this.zzb = zzgwrVar2;
        this.zzc = zzgwrVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbzx zzbzxVarZza = ((zzchm) this.zza).zza();
        JSONObject jSONObject = (JSONObject) this.zzb.zzb();
        String str = (String) this.zzc.zzb();
        boolean zEquals = PluginErrorDetails.Platform.NATIVE.equals(str);
        com.google.android.gms.ads.internal.zzt.zzp();
        return new zzatw(UUID.randomUUID().toString(), zzbzxVarZza, str, jSONObject, false, zEquals);
    }
}
