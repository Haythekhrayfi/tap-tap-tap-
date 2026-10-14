package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeef implements zzecc {
    private final Context zza;
    private final zzdni zzb;
    private final zzdeo zzc;
    private final zzfai zzd;
    private final Executor zze;
    private final zzbzx zzf;
    private final zzbil zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzit)).booleanValue();
    private final zzebl zzi;

    public zzeef(Context context, zzbzx zzbzxVar, zzfai zzfaiVar, Executor executor, zzdeo zzdeoVar, zzdni zzdniVar, zzbil zzbilVar, zzebl zzeblVar) {
        this.zza = context;
        this.zzd = zzfaiVar;
        this.zzc = zzdeoVar;
        this.zze = executor;
        this.zzf = zzbzxVar;
        this.zzb = zzdniVar;
        this.zzg = zzbilVar;
        this.zzi = zzeblVar;
    }

    @Override // com.google.android.gms.internal.ads.zzecc
    public final zzfwm zza(final zzezz zzezzVar, final zzezn zzeznVar) {
        final zzdnm zzdnmVar = new zzdnm();
        zzfwm zzfwmVarZzm = zzfwc.zzm(zzfwc.zzh(null), new zzfvj() { // from class: com.google.android.gms.internal.ads.zzeea
            @Override // com.google.android.gms.internal.ads.zzfvj
            public final zzfwm zza(Object obj) {
                return this.zza.zzc(zzeznVar, zzezzVar, zzdnmVar, obj);
            }
        }, this.zze);
        zzfwmVarZzm.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeeb
            @Override // java.lang.Runnable
            public final void run() {
                zzdnmVar.zzb();
            }
        }, this.zze);
        return zzfwmVarZzm;
    }

    @Override // com.google.android.gms.internal.ads.zzecc
    public final boolean zzb(zzezz zzezzVar, zzezn zzeznVar) {
        zzezs zzezsVar = zzeznVar.zzt;
        return (zzezsVar == null || zzezsVar.zza == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ zzfwm zzc(final zzezn zzeznVar, zzezz zzezzVar, zzdnm zzdnmVar, Object obj) throws Exception {
        final zzcez zzcezVarZza = this.zzb.zza(this.zzd.zze, zzeznVar, zzezzVar.zzb.zzb);
        zzcezVarZza.zzZ(zzeznVar.zzX);
        zzdnmVar.zza(this.zza, (View) zzcezVarZza);
        zzcaj zzcajVar = new zzcaj();
        final zzddo zzddoVarZze = this.zzc.zze(new zzcrs(zzezzVar, zzeznVar, null), new zzddr(new zzeee(this.zza, this.zzf, zzcajVar, zzeznVar, zzcezVarZza, this.zzd, this.zzh, this.zzg, this.zzi), zzcezVarZza));
        zzcajVar.zzd(zzddoVarZze);
        zzddoVarZze.zzc().zzm(new zzcwa() { // from class: com.google.android.gms.internal.ads.zzeec
            @Override // com.google.android.gms.internal.ads.zzcwa
            public final void zzl() {
                zzcez zzcezVar = zzcezVarZza;
                if (zzcezVar.zzN() != null) {
                    zzcezVar.zzN().zzq();
                }
            }
        }, zzcae.zzf);
        zzddoVarZze.zzk().zzi(zzcezVarZza, true, this.zzh ? this.zzg : null);
        zzddoVarZze.zzk();
        zzezs zzezsVar = zzeznVar.zzt;
        return zzfwc.zzl(zzdnh.zzj(zzcezVarZza, zzezsVar.zzb, zzezsVar.zza), new zzfov() { // from class: com.google.android.gms.internal.ads.zzeed
            @Override // com.google.android.gms.internal.ads.zzfov
            public final Object apply(Object obj2) {
                zzcez zzcezVar = zzcezVarZza;
                zzezn zzeznVar2 = zzeznVar;
                zzddo zzddoVar = zzddoVarZze;
                if (zzeznVar2.zzN) {
                    zzcezVar.zzae();
                }
                zzcezVar.zzY();
                zzcezVar.onPause();
                return zzddoVar.zzg();
            }
        }, this.zze);
    }
}
