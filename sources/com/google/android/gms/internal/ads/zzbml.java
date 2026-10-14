package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
public final class zzbml {
    private final Context zzb;
    private final String zzc;
    private final zzbzx zzd;
    private final zzfgb zze;
    private final com.google.android.gms.ads.internal.util.zzbb zzf;
    private final com.google.android.gms.ads.internal.util.zzbb zzg;
    private zzbmk zzh;
    private final Object zza = new Object();
    private int zzi = 1;

    public zzbml(Context context, zzbzx zzbzxVar, String str, com.google.android.gms.ads.internal.util.zzbb zzbbVar, com.google.android.gms.ads.internal.util.zzbb zzbbVar2, zzfgb zzfgbVar) {
        this.zzc = str;
        this.zzb = context.getApplicationContext();
        this.zzd = zzbzxVar;
        this.zze = zzfgbVar;
        this.zzf = zzbbVar;
        this.zzg = zzbbVar2;
    }

    public final zzbmf zzb(zzaqs zzaqsVar) {
        synchronized (this.zza) {
            synchronized (this.zza) {
                zzbmk zzbmkVar = this.zzh;
                if (zzbmkVar != null && this.zzi == 0) {
                    zzbmkVar.zzi(new zzcan() { // from class: com.google.android.gms.internal.ads.zzblq
                        @Override // com.google.android.gms.internal.ads.zzcan
                        public final void zza(Object obj) {
                            this.zza.zzk((zzblg) obj);
                        }
                    }, new zzcal() { // from class: com.google.android.gms.internal.ads.zzblr
                        @Override // com.google.android.gms.internal.ads.zzcal
                        public final void zza() {
                        }
                    });
                }
            }
            zzbmk zzbmkVar2 = this.zzh;
            if (zzbmkVar2 != null && zzbmkVar2.zze() != -1) {
                int i10 = this.zzi;
                if (i10 == 0) {
                    return this.zzh.zza();
                }
                if (i10 != 1) {
                    return this.zzh.zza();
                }
                this.zzi = 2;
                zzd(null);
                return this.zzh.zza();
            }
            this.zzi = 2;
            zzbmk zzbmkVarZzd = zzd(null);
            this.zzh = zzbmkVarZzd;
            return zzbmkVarZzd.zza();
        }
    }

    public final zzbmk zzd(zzaqs zzaqsVar) {
        zzffn zzffnVarZza = zzffm.zza(this.zzb, 6);
        zzffnVarZza.zzh();
        final zzbmk zzbmkVar = new zzbmk(this.zzg);
        final zzaqs zzaqsVar2 = null;
        zzcae.zze.execute(new Runnable(zzaqsVar2, zzbmkVar) { // from class: com.google.android.gms.internal.ads.zzblu
            public final /* synthetic */ zzbmk zzb;

            {
                this.zzb = zzbmkVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzj(null, this.zzb);
            }
        });
        zzbmkVar.zzi(new zzbma(this, zzbmkVar, zzffnVarZza), new zzbmb(this, zzbmkVar, zzffnVarZza));
        return zzbmkVar;
    }

    public final /* synthetic */ void zzi(zzbmk zzbmkVar, final zzblg zzblgVar, ArrayList arrayList, long j10) {
        synchronized (this.zza) {
            if (zzbmkVar.zze() != -1 && zzbmkVar.zze() != 1) {
                zzbmkVar.zzg();
                zzcae.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbls
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzblgVar.zzc();
                    }
                });
                com.google.android.gms.ads.internal.util.zze.zza("Could not receive /jsLoaded in " + String.valueOf(com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzc)) + " ms. JS engine session reference status(onEngLoadedTimeout) is " + zzbmkVar.zze() + ". Update status(onEngLoadedTimeout) is " + this.zzi + ". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is " + String.valueOf(arrayList.get(0)) + " ms. Total latency(onEngLoadedTimeout) is " + (com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - j10) + " ms. Rejecting.");
            }
        }
    }

    public final /* synthetic */ void zzj(zzaqs zzaqsVar, zzbmk zzbmkVar) {
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        try {
            zzblo zzbloVar = new zzblo(this.zzb, this.zzd, null, null);
            zzbloVar.zzk(new zzblv(this, arrayList, jCurrentTimeMillis, zzbmkVar, zzbloVar));
            zzbloVar.zzq("/jsLoaded", new zzblw(this, jCurrentTimeMillis, zzbmkVar, zzbloVar));
            com.google.android.gms.ads.internal.util.zzca zzcaVar = new com.google.android.gms.ads.internal.util.zzca();
            zzblx zzblxVar = new zzblx(this, null, zzbloVar, zzcaVar);
            zzcaVar.zzb(zzblxVar);
            zzbloVar.zzq("/requestReload", zzblxVar);
            if (this.zzc.endsWith(".js")) {
                zzbloVar.zzh(this.zzc);
            } else if (this.zzc.startsWith("<html>")) {
                zzbloVar.zzf(this.zzc);
            } else {
                zzbloVar.zzg(this.zzc);
            }
            com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new zzblz(this, zzbmkVar, zzbloVar, arrayList, jCurrentTimeMillis), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzd)).intValue());
        } catch (Throwable th) {
            zzbzr.zzh("Error creating webview.", th);
            com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "SdkJavascriptFactory.loadJavascriptEngine");
            zzbmkVar.zzg();
        }
    }

    public final /* synthetic */ void zzk(zzblg zzblgVar) {
        if (zzblgVar.zzi()) {
            this.zzi = 1;
        }
    }
}
