package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdlx {
    private final com.google.android.gms.ads.internal.zza zzb;
    private final zzcfl zzc;
    private final Context zzd;
    private final zzdqa zze;
    private final zzfev zzf;
    private final Executor zzg;
    private final zzaqs zzh;
    private final zzbzx zzi;
    private final zzeba zzk;
    private final zzfgr zzl;
    private final zzebl zzm;
    private zzfwm zzn;
    private final zzdlk zza = new zzdlk();
    private final zzbix zzj = new zzbix();

    public zzdlx(zzdlu zzdluVar) {
        this.zzd = zzdluVar.zzc;
        this.zzg = zzdluVar.zzg;
        this.zzh = zzdluVar.zzh;
        this.zzi = zzdluVar.zzi;
        this.zzb = zzdluVar.zza;
        this.zzc = zzdluVar.zzb;
        this.zzk = zzdluVar.zzf;
        this.zzl = zzdluVar.zzj;
        this.zze = zzdluVar.zzd;
        this.zzf = zzdluVar.zze;
        this.zzm = zzdluVar.zzk;
    }

    public final /* synthetic */ zzcez zza(zzcez zzcezVar) {
        zzcezVar.zzad("/result", this.zzj);
        zzcgm zzcgmVarZzN = zzcezVar.zzN();
        zzdlk zzdlkVar = this.zza;
        zzcgmVarZzN.zzM(null, zzdlkVar, zzdlkVar, zzdlkVar, zzdlkVar, false, null, new com.google.android.gms.ads.internal.zzb(this.zzd, null, null), null, null, this.zzk, this.zzl, this.zze, this.zzf, null, null, null, null);
        return zzcezVar;
    }

    public final /* synthetic */ zzfwm zzc(String str, JSONObject jSONObject, zzcez zzcezVar) throws Exception {
        return this.zzj.zzb(zzcezVar, str, jSONObject);
    }

    public final synchronized zzfwm zzd(final String str, final JSONObject jSONObject) {
        zzfwm zzfwmVar = this.zzn;
        if (zzfwmVar == null) {
            return zzfwc.zzh(null);
        }
        return zzfwc.zzm(zzfwmVar, new zzfvj() { // from class: com.google.android.gms.internal.ads.zzdll
            @Override // com.google.android.gms.internal.ads.zzfvj
            public final zzfwm zza(Object obj) {
                return this.zza.zzc(str, jSONObject, (zzcez) obj);
            }
        }, this.zzg);
    }

    public final synchronized void zze(zzezn zzeznVar, zzezq zzezqVar) {
        zzfwm zzfwmVar = this.zzn;
        if (zzfwmVar == null) {
            return;
        }
        zzfwc.zzq(zzfwmVar, new zzdlr(this, zzeznVar, zzezqVar), this.zzg);
    }

    public final synchronized void zzf() {
        zzfwm zzfwmVar = this.zzn;
        if (zzfwmVar == null) {
            return;
        }
        zzfwc.zzq(zzfwmVar, new zzdln(this), this.zzg);
        this.zzn = null;
    }

    public final synchronized void zzg(String str, Map map) {
        zzfwm zzfwmVar = this.zzn;
        if (zzfwmVar == null) {
            return;
        }
        zzfwc.zzq(zzfwmVar, new zzdlq(this, "sendMessageToNativeJs", map), this.zzg);
    }

    public final synchronized void zzh() {
        final Context context = this.zzd;
        final zzbzx zzbzxVar = this.zzi;
        final String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzdu);
        final zzaqs zzaqsVar = this.zzh;
        final com.google.android.gms.ads.internal.zza zzaVar = this.zzb;
        final zzebl zzeblVar = this.zzm;
        zzfwm zzfwmVarZzl = zzfwc.zzl(zzfwc.zzk(new zzfvi() { // from class: com.google.android.gms.internal.ads.zzcfi
            @Override // com.google.android.gms.internal.ads.zzfvi
            public final zzfwm zza() throws zzcfk {
                Context context2 = context;
                zzaqs zzaqsVar2 = zzaqsVar;
                zzbzx zzbzxVar2 = zzbzxVar;
                com.google.android.gms.ads.internal.zza zzaVar2 = zzaVar;
                zzebl zzeblVar2 = zzeblVar;
                String str2 = str;
                com.google.android.gms.ads.internal.zzt.zzz();
                zzcez zzcezVarZza = zzcfl.zza(context2, zzcgo.zza(), "", false, false, zzaqsVar2, null, zzbzxVar2, null, null, zzaVar2, zzawz.zza(), null, null, zzeblVar2);
                final zzcai zzcaiVarZza = zzcai.zza(zzcezVarZza);
                zzcezVarZza.zzN().zzA(new zzcgk() { // from class: com.google.android.gms.internal.ads.zzcfj
                    @Override // com.google.android.gms.internal.ads.zzcgk
                    public final void zza(boolean z10) {
                        zzcaiVarZza.zzb();
                    }
                });
                zzcezVarZza.loadUrl(str2);
                return zzcaiVarZza;
            }
        }, zzcae.zze), new zzfov() { // from class: com.google.android.gms.internal.ads.zzdlm
            @Override // com.google.android.gms.internal.ads.zzfov
            public final Object apply(Object obj) {
                zzcez zzcezVar = (zzcez) obj;
                this.zza.zza(zzcezVar);
                return zzcezVar;
            }
        }, this.zzg);
        this.zzn = zzfwmVarZzl;
        zzcah.zza(zzfwmVarZzl, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void zzi(String str, zzbij zzbijVar) {
        zzfwm zzfwmVar = this.zzn;
        if (zzfwmVar == null) {
            return;
        }
        zzfwc.zzq(zzfwmVar, new zzdlo(this, str, zzbijVar), this.zzg);
    }

    public final void zzj(WeakReference weakReference, String str, zzbij zzbijVar) {
        zzi(str, new zzdlw(this, weakReference, str, zzbijVar, null));
    }

    public final synchronized void zzk(String str, zzbij zzbijVar) {
        zzfwm zzfwmVar = this.zzn;
        if (zzfwmVar == null) {
            return;
        }
        zzfwc.zzq(zzfwmVar, new zzdlp(this, str, zzbijVar), this.zzg);
    }
}
