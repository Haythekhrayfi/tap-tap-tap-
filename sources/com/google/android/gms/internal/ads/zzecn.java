package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzecn implements zzecc {
    private final zzcop zza;
    private final Context zzb;
    private final zzdni zzc;
    private final zzfai zzd;
    private final Executor zze;
    private final zzbzx zzf;
    private final zzbil zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzit)).booleanValue();
    private final zzebl zzi;

    public zzecn(zzcop zzcopVar, Context context, Executor executor, zzdni zzdniVar, zzfai zzfaiVar, zzbzx zzbzxVar, zzbil zzbilVar, zzebl zzeblVar) {
        this.zzb = context;
        this.zza = zzcopVar;
        this.zze = executor;
        this.zzc = zzdniVar;
        this.zzd = zzfaiVar;
        this.zzf = zzbzxVar;
        this.zzg = zzbilVar;
        this.zzi = zzeblVar;
    }

    @Override // com.google.android.gms.internal.ads.zzecc
    public final zzfwm zza(final zzezz zzezzVar, final zzezn zzeznVar) {
        final zzdnm zzdnmVar = new zzdnm();
        zzfwm zzfwmVarZzm = zzfwc.zzm(zzfwc.zzh(null), new zzfvj() { // from class: com.google.android.gms.internal.ads.zzecl
            @Override // com.google.android.gms.internal.ads.zzfvj
            public final zzfwm zza(Object obj) {
                return this.zza.zzc(zzeznVar, zzezzVar, zzdnmVar, obj);
            }
        }, this.zze);
        zzfwmVarZzm.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzecm
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
        final zzcez zzcezVarZza = this.zzc.zza(this.zzd.zze, zzeznVar, zzezzVar.zzb.zzb);
        zzcezVarZza.zzZ(zzeznVar.zzX);
        zzdnmVar.zza(this.zzb, (View) zzcezVarZza);
        zzcaj zzcajVar = new zzcaj();
        final zzcom zzcomVarZza = this.zza.zza(new zzcrs(zzezzVar, zzeznVar, null), new zzddr(new zzecp(this.zzf, zzcajVar, zzeznVar, zzcezVarZza, this.zzd, this.zzh, this.zzg, this.zzi), zzcezVarZza), new zzcon(zzeznVar.zzab));
        zzcomVarZza.zzh().zzi(zzcezVarZza, false, this.zzh ? this.zzg : null);
        zzcajVar.zzd(zzcomVarZza);
        zzcomVarZza.zzc().zzm(new zzcwa() { // from class: com.google.android.gms.internal.ads.zzecj
            @Override // com.google.android.gms.internal.ads.zzcwa
            public final void zzl() {
                zzcez zzcezVar = zzcezVarZza;
                if (zzcezVar.zzN() != null) {
                    zzcezVar.zzN().zzq();
                }
            }
        }, zzcae.zzf);
        zzcomVarZza.zzh();
        zzezs zzezsVar = zzeznVar.zzt;
        return zzfwc.zzl(zzdnh.zzj(zzcezVarZza, zzezsVar.zzb, zzezsVar.zza), new zzfov() { // from class: com.google.android.gms.internal.ads.zzeck
            @Override // com.google.android.gms.internal.ads.zzfov
            public final Object apply(Object obj2) {
                zzcez zzcezVar = zzcezVarZza;
                zzezn zzeznVar2 = zzeznVar;
                zzcom zzcomVar = zzcomVarZza;
                if (zzeznVar2.zzN) {
                    zzcezVar.zzae();
                }
                zzcezVar.zzY();
                zzcezVar.onPause();
                return zzcomVar.zza();
            }
        }, this.zze);
    }
}
