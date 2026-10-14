package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcoh implements zzaua {
    private zzcez zza;
    private final Executor zzb;
    private final zzcnt zzc;
    private final Clock zzd;
    private boolean zze = false;
    private boolean zzf = false;
    private final zzcnw zzg = new zzcnw();

    public zzcoh(Executor executor, zzcnt zzcntVar, Clock clock) {
        this.zzb = executor;
        this.zzc = zzcntVar;
        this.zzd = clock;
    }

    private final void zzg() {
        try {
            final JSONObject jSONObjectZzb = this.zzc.zzb(this.zzg);
            if (this.zza != null) {
                this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcog
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzd(jSONObjectZzb);
                    }
                });
            }
        } catch (JSONException e10) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed to call video active view js", e10);
        }
    }

    public final void zza() {
        this.zze = false;
    }

    public final void zzb() {
        this.zze = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzaua
    public final void zzc(zzatz zzatzVar) {
        zzcnw zzcnwVar = this.zzg;
        zzcnwVar.zza = this.zzf ? false : zzatzVar.zzj;
        zzcnwVar.zzd = this.zzd.elapsedRealtime();
        this.zzg.zzf = zzatzVar;
        if (this.zze) {
            zzg();
        }
    }

    public final /* synthetic */ void zzd(JSONObject jSONObject) {
        this.zza.zzl("AFMA_updateActiveView", jSONObject);
    }

    public final void zze(boolean z10) {
        this.zzf = z10;
    }

    public final void zzf(zzcez zzcezVar) {
        this.zza = zzcezVar;
    }
}
