package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzhx {
    private final AudioManager zza;
    private final zzhv zzb;
    private zzhw zzc;
    private int zzd;
    private float zze = 1.0f;

    public zzhx(Context context, Handler handler, zzhw zzhwVar) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        Objects.requireNonNull(audioManager);
        this.zza = audioManager;
        this.zzc = zzhwVar;
        this.zzb = new zzhv(this, handler);
        this.zzd = 0;
    }

    public static /* bridge */ /* synthetic */ void zzc(zzhx zzhxVar, int i10) {
        if (i10 == -3 || i10 == -2) {
            if (i10 != -2) {
                zzhxVar.zzg(3);
                return;
            } else {
                zzhxVar.zzf(0);
                zzhxVar.zzg(2);
                return;
            }
        }
        if (i10 == -1) {
            zzhxVar.zzf(-1);
            zzhxVar.zze();
        } else if (i10 == 1) {
            zzhxVar.zzg(1);
            zzhxVar.zzf(1);
        } else {
            zzer.zzf("AudioFocusManager", "Unknown focus change type: " + i10);
        }
    }

    private final void zze() {
        if (this.zzd == 0) {
            return;
        }
        if (zzfj.zza < 26) {
            this.zza.abandonAudioFocus(this.zzb);
        }
        zzg(0);
    }

    private final void zzf(int i10) {
        zzhw zzhwVar = this.zzc;
        if (zzhwVar != null) {
            zzjt zzjtVar = (zzjt) zzhwVar;
            boolean zZzv = zzjtVar.zza.zzv();
            zzjtVar.zza.zzal(zZzv, i10, zzjx.zzY(zZzv, i10));
        }
    }

    private final void zzg(int i10) {
        if (this.zzd == i10) {
            return;
        }
        this.zzd = i10;
        float f10 = i10 == 3 ? 0.2f : 1.0f;
        if (this.zze == f10) {
            return;
        }
        this.zze = f10;
        zzhw zzhwVar = this.zzc;
        if (zzhwVar != null) {
            ((zzjt) zzhwVar).zza.zzai();
        }
    }

    public final float zza() {
        return this.zze;
    }

    public final int zzb(boolean z10, int i10) {
        zze();
        return z10 ? 1 : -1;
    }

    public final void zzd() {
        this.zzc = null;
        zze();
    }
}
