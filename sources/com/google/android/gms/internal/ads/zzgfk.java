package com.google.android.gms.internal.ads;

import androidx.activity.j;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgfk {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    public /* synthetic */ zzgfk(zzgfe zzgfeVar, zzgfj zzgfjVar) {
        this.zza = new HashMap(zzgfeVar.zza);
        this.zzb = new HashMap(zzgfeVar.zzb);
        this.zzc = new HashMap(zzgfeVar.zzc);
        this.zzd = new HashMap(zzgfeVar.zzd);
    }

    public final zzfxn zza(zzgfd zzgfdVar, @Nullable zzfyq zzfyqVar) throws GeneralSecurityException {
        zzgfg zzgfgVar = new zzgfg(zzgfdVar.getClass(), zzgfdVar.zzd(), null);
        if (this.zzb.containsKey(zzgfgVar)) {
            return ((zzgdn) this.zzb.get(zzgfgVar)).zza(zzgfdVar, zzfyqVar);
        }
        throw new GeneralSecurityException(j.a("No Key Parser for requested key type ", zzgfgVar.toString(), " available"));
    }

    public final zzfyf zzb(zzgfd zzgfdVar) throws GeneralSecurityException {
        zzgfg zzgfgVar = new zzgfg(zzgfdVar.getClass(), zzgfdVar.zzd(), null);
        if (this.zzd.containsKey(zzgfgVar)) {
            return ((zzgek) this.zzd.get(zzgfgVar)).zza(zzgfdVar);
        }
        throw new GeneralSecurityException(j.a("No Parameters Parser for requested key type ", zzgfgVar.toString(), " available"));
    }

    public final zzgfd zzc(zzfyf zzfyfVar, Class cls) throws GeneralSecurityException {
        zzgfi zzgfiVar = new zzgfi(zzfyfVar.getClass(), cls, null);
        if (this.zzc.containsKey(zzgfiVar)) {
            return ((zzgeo) this.zzc.get(zzgfiVar)).zza(zzfyfVar);
        }
        throw new GeneralSecurityException(j.a("No Key Format serializer for ", zzgfiVar.toString(), " available"));
    }

    public final boolean zzh(zzgfd zzgfdVar) {
        return this.zzb.containsKey(new zzgfg(zzgfdVar.getClass(), zzgfdVar.zzd(), null));
    }

    public final boolean zzi(zzgfd zzgfdVar) {
        return this.zzd.containsKey(new zzgfg(zzgfdVar.getClass(), zzgfdVar.zzd(), null));
    }
}
