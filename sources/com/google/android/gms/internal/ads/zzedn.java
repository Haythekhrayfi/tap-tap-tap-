package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzedn implements zzeci {
    private final Context zza;
    private final zzcpy zzb;
    private View zzc;
    private zzbof zzd;

    public zzedn(Context context, zzcpy zzcpyVar) {
        this.zza = context;
        this.zzb = zzcpyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzeci
    public final /* bridge */ /* synthetic */ Object zza(zzezz zzezzVar, final zzezn zzeznVar, final zzecf zzecfVar) throws zzefu, zzfan {
        final View view;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzhs)).booleanValue() && zzeznVar.zzah) {
            try {
                view = (View) ObjectWrapper.unwrap(this.zzd.zze());
                boolean zZzf = this.zzd.zzf();
                if (view == null) {
                    throw new zzfan(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                }
                if (zZzf) {
                    try {
                        view = (View) zzfwc.zzm(zzfwc.zzh(null), new zzfvj() { // from class: com.google.android.gms.internal.ads.zzedj
                            @Override // com.google.android.gms.internal.ads.zzfvj
                            public final zzfwm zza(Object obj) {
                                return this.zza.zzc(view, zzeznVar, obj);
                            }
                        }, zzcae.zze).get();
                    } catch (InterruptedException | ExecutionException e10) {
                        throw new zzfan(e10);
                    }
                }
            } catch (RemoteException e11) {
                throw new zzfan(e11);
            }
        } else {
            view = this.zzc;
        }
        zzcpc zzcpcVarZza = this.zzb.zza(new zzcrs(zzezzVar, zzeznVar, zzecfVar.zza), new zzcpi(view, null, new zzcrb() { // from class: com.google.android.gms.internal.ads.zzedk
            @Override // com.google.android.gms.internal.ads.zzcrb
            public final com.google.android.gms.ads.internal.client.zzdq zza() throws zzfan {
                try {
                    return ((zzbpt) zzecfVar.zzb).zze();
                } catch (RemoteException e12) {
                    throw new zzfan(e12);
                }
            }
        }, (zzezo) zzeznVar.zzv.get(0)));
        zzcpcVarZza.zzg().zza(view);
        ((zzedy) zzecfVar.zzc).zzc(zzcpcVarZza.zzi());
        return zzcpcVarZza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzeci
    public final void zzb(zzezz zzezzVar, zzezn zzeznVar, zzecf zzecfVar) throws zzfan {
        try {
            ((zzbpt) zzecfVar.zzb).zzq(zzeznVar.zzaa);
            zzedl zzedlVar = null;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzhs)).booleanValue() && zzeznVar.zzah) {
                ((zzbpt) zzecfVar.zzb).zzk(zzeznVar.zzV, zzeznVar.zzw.toString(), zzezzVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzedm(this, zzecfVar, zzedlVar), (zzboc) zzecfVar.zzc, zzezzVar.zza.zza.zze);
            } else {
                ((zzbpt) zzecfVar.zzb).zzj(zzeznVar.zzV, zzeznVar.zzw.toString(), zzezzVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzedm(this, zzecfVar, zzedlVar), (zzboc) zzecfVar.zzc, zzezzVar.zza.zza.zze);
            }
        } catch (RemoteException e10) {
            throw new zzfan(e10);
        }
    }

    public final /* synthetic */ zzfwm zzc(View view, zzezn zzeznVar, Object obj) throws Exception {
        return zzfwc.zzh(zzcqp.zza(this.zza, view, zzeznVar));
    }
}
