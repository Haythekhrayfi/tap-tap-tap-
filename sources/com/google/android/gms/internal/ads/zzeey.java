package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeey implements zzeci {
    private final Context zza;
    private final zzdfk zzb;
    private final Executor zzc;

    public zzeey(Context context, zzdfk zzdfkVar, Executor executor) {
        this.zza = context;
        this.zzb = zzdfkVar;
        this.zzc = executor;
    }

    private static final boolean zzc(zzezz zzezzVar, int i10) {
        return zzezzVar.zza.zza.zzg.contains(Integer.toString(i10));
    }

    @Override // com.google.android.gms.internal.ads.zzeci
    public final /* bridge */ /* synthetic */ Object zza(zzezz zzezzVar, zzezn zzeznVar, zzecf zzecfVar) throws zzefu, zzfan {
        zzdha zzdhaVarZzaf;
        zzboh zzbohVarZzD = ((zzfbd) zzecfVar.zzb).zzD();
        zzboi zzboiVarZzE = ((zzfbd) zzecfVar.zzb).zzE();
        zzbol zzbolVarZzd = ((zzfbd) zzecfVar.zzb).zzd();
        if (zzbolVarZzd != null && zzc(zzezzVar, 6)) {
            zzdhaVarZzaf = zzdha.zzs(zzbolVarZzd);
        } else if (zzbohVarZzD != null && zzc(zzezzVar, 6)) {
            zzdhaVarZzaf = zzdha.zzag(zzbohVarZzD);
        } else if (zzbohVarZzD != null && zzc(zzezzVar, 2)) {
            zzdhaVarZzaf = zzdha.zzae(zzbohVarZzD);
        } else if (zzboiVarZzE != null && zzc(zzezzVar, 6)) {
            zzdhaVarZzaf = zzdha.zzah(zzboiVarZzE);
        } else {
            if (zzboiVarZzE == null || !zzc(zzezzVar, 1)) {
                throw new zzefu(1, "No native ad mappers");
            }
            zzdhaVarZzaf = zzdha.zzaf(zzboiVarZzE);
        }
        if (!zzezzVar.zza.zza.zzg.contains(Integer.toString(zzdhaVarZzaf.zzc()))) {
            throw new zzefu(1, "No corresponding native ad listener");
        }
        zzdhc zzdhcVarZze = this.zzb.zze(new zzcrs(zzezzVar, zzeznVar, zzecfVar.zza), new zzdhm(zzdhaVarZzaf), new zzdjb(zzboiVarZzE, zzbohVarZzD, zzbolVarZzd));
        ((zzedy) zzecfVar.zzc).zzc(zzdhcVarZze.zzj());
        zzdhcVarZze.zzd().zzm(new zzcnd((zzfbd) zzecfVar.zzb), this.zzc);
        return zzdhcVarZze.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzeci
    public final void zzb(zzezz zzezzVar, zzezn zzeznVar, zzecf zzecfVar) throws zzfan {
        zzfbd zzfbdVar = (zzfbd) zzecfVar.zzb;
        Context context = this.zza;
        com.google.android.gms.ads.internal.client.zzl zzlVar = zzezzVar.zza.zza.zzd;
        String string = zzeznVar.zzw.toString();
        String strZzl = com.google.android.gms.ads.internal.util.zzbu.zzl(zzeznVar.zzt);
        zzboc zzbocVar = (zzboc) zzecfVar.zzc;
        zzfai zzfaiVar = zzezzVar.zza.zza;
        zzfbdVar.zzp(context, zzlVar, string, strZzl, zzbocVar, zzfaiVar.zzi, zzfaiVar.zzg);
    }
}
