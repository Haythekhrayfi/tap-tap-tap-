package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.common.util.Predicate;
import java.util.ArrayList;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
public final class zzblo implements zzblg, zzble {
    private final zzcez zza;

    /* JADX WARN: Multi-variable type inference failed */
    public zzblo(Context context, zzbzx zzbzxVar, zzaqs zzaqsVar, com.google.android.gms.ads.internal.zza zzaVar) throws zzcfk {
        com.google.android.gms.ads.internal.zzt.zzz();
        zzcez zzcezVarZza = zzcfl.zza(context, zzcgo.zza(), "", false, false, null, null, zzbzxVar, null, null, null, zzawz.zza(), null, null, null);
        this.zza = zzcezVarZza;
        ((View) zzcezVarZza).setWillNotDraw(true);
    }

    private static final void zzs(Runnable runnable) {
        com.google.android.gms.ads.internal.client.zzay.zzb();
        if (zzbzk.zzu()) {
            runnable.run();
        } else {
            com.google.android.gms.ads.internal.util.zzs.zza.post(runnable);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final void zza(final String str) {
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzblj
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzm(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final /* synthetic */ void zzb(String str, String str2) {
        zzbld.zzc(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzblg
    public final void zzc() {
        this.zza.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzblc
    public final /* synthetic */ void zzd(String str, Map map) {
        zzbld.zza(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzblc
    public final /* synthetic */ void zze(String str, JSONObject jSONObject) {
        zzbld.zzb(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzblg
    public final void zzf(final String str) {
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzblk
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzn(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzblg
    public final void zzg(final String str) {
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzblm
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzo(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzblg
    public final void zzh(String str) {
        final String str2 = String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", str);
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbll
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzp(str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzblg
    public final boolean zzi() {
        return this.zza.zzaz();
    }

    @Override // com.google.android.gms.internal.ads.zzblg
    public final zzbmn zzj() {
        return new zzbmn(this);
    }

    @Override // com.google.android.gms.internal.ads.zzblg
    public final void zzk(final zzblv zzblvVar) {
        this.zza.zzN().zzG(new zzcgl() { // from class: com.google.android.gms.internal.ads.zzblh
            @Override // com.google.android.gms.internal.ads.zzcgl
            public final void zza() {
                zzblv zzblvVar2 = zzblvVar;
                final zzbml zzbmlVar = zzblvVar2.zza;
                final ArrayList arrayList = zzblvVar2.zzb;
                final long j10 = zzblvVar2.zzc;
                final zzbmk zzbmkVar = zzblvVar2.zzd;
                final zzblg zzblgVar = zzblvVar2.zze;
                arrayList.add(Long.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - j10));
                com.google.android.gms.ads.internal.util.zze.zza("LoadNewJavascriptEngine(onEngLoaded) latency is " + String.valueOf(arrayList.get(0)) + " ms.");
                com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzblt
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbmlVar.zzi(zzbmkVar, zzblgVar, arrayList, j10);
                    }
                }, (long) ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzc)).intValue());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final /* synthetic */ void zzl(String str, JSONObject jSONObject) {
        zzbld.zzd(this, str, jSONObject);
    }

    public final /* synthetic */ void zzm(String str) {
        this.zza.zza(str);
    }

    public final /* synthetic */ void zzn(String str) {
        this.zza.loadData(str, "text/html", "UTF-8");
    }

    public final /* synthetic */ void zzo(String str) {
        this.zza.loadUrl(str);
    }

    public final /* synthetic */ void zzp(String str) {
        this.zza.loadData(str, "text/html", "UTF-8");
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final void zzq(String str, zzbij zzbijVar) {
        this.zza.zzad(str, new zzbln(this, zzbijVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final void zzr(String str, final zzbij zzbijVar) {
        this.zza.zzav(str, new Predicate() { // from class: com.google.android.gms.internal.ads.zzbli
            @Override // com.google.android.gms.common.util.Predicate
            public final boolean apply(Object obj) {
                zzbij zzbijVar2 = (zzbij) obj;
                return (zzbijVar2 instanceof zzbln) && ((zzbln) zzbijVar2).zzb.equals(zzbijVar);
            }
        });
    }
}
