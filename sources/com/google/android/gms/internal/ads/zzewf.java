package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzewf implements zzexe {
    private zzcun zza;
    private final Executor zzb = zzfwt.zzb();

    public final zzcun zza() {
        return this.zza;
    }

    public final zzfwm zzb(zzexf zzexfVar, zzexd zzexdVar, zzcun zzcunVar) {
        zzcum zzcumVarZza = zzexdVar.zza(zzexfVar.zzb);
        zzcumVarZza.zzb(new zzexi(true));
        zzcun zzcunVar2 = (zzcun) zzcumVarZza.zzh();
        this.zza = zzcunVar2;
        final zzcsk zzcskVarZzb = zzcunVar2.zzb();
        final zzfcd zzfcdVar = new zzfcd();
        return zzfwc.zzl(zzfwc.zzm(zzfvt.zzv(zzcskVarZzb.zzj()), new zzfvj() { // from class: com.google.android.gms.internal.ads.zzewd
            @Override // com.google.android.gms.internal.ads.zzfvj
            public final zzfwm zza(Object obj) {
                zzfcd zzfcdVar2 = zzfcdVar;
                zzcsk zzcskVar = zzcskVarZzb;
                zzezz zzezzVar = (zzezz) obj;
                zzfcdVar2.zzb = zzezzVar;
                Iterator it = zzezzVar.zzb.zza.iterator();
                boolean z10 = false;
                while (it.hasNext()) {
                    Iterator it2 = ((zzezn) it.next()).zza.iterator();
                    while (it2.hasNext()) {
                        if (!((String) it2.next()).contains("FirstPartyRenderer")) {
                            return zzfwc.zzh(null);
                        }
                        z10 = true;
                    }
                }
                if (z10) {
                    return zzcskVar.zzi(zzfwc.zzh(zzezzVar));
                }
                return zzfwc.zzh(null);
            }
        }, this.zzb), new zzfov() { // from class: com.google.android.gms.internal.ads.zzewe
            @Override // com.google.android.gms.internal.ads.zzfov
            public final Object apply(Object obj) {
                zzfcd zzfcdVar2 = zzfcdVar;
                zzfcdVar2.zzc = (zzcrd) obj;
                return zzfcdVar2;
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzexe
    public final /* bridge */ /* synthetic */ zzfwm zzc(zzexf zzexfVar, zzexd zzexdVar, Object obj) {
        return zzb(zzexfVar, zzexdVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzexe
    public final /* synthetic */ Object zzd() {
        return this.zza;
    }
}
