package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcce implements AudioManager.OnAudioFocusChangeListener {
    private final AudioManager zza;
    private final zzccd zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private float zzf = 1.0f;

    public zzcce(Context context, zzccd zzccdVar) {
        this.zza = (AudioManager) context.getSystemService("audio");
        this.zzb = zzccdVar;
    }

    private final void zzf() {
        boolean z10 = false;
        if (!this.zzd || this.zze || this.zzf <= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            if (!this.zzc) {
                return;
            }
            AudioManager audioManager = this.zza;
            if (audioManager != null) {
                if (audioManager.abandonAudioFocus(this) == 0) {
                    z10 = true;
                }
                this.zzc = z10;
            }
        } else {
            if (this.zzc) {
                return;
            }
            AudioManager audioManager2 = this.zza;
            if (audioManager2 != null) {
                if (audioManager2.requestAudioFocus(this, 3, 2) == 1) {
                    z10 = true;
                }
                this.zzc = z10;
            }
        }
        this.zzb.zzn();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i10) {
        this.zzc = i10 > 0;
        this.zzb.zzn();
    }

    public final float zza() {
        return this.zzc ? this.zze ? 0.0f : this.zzf : StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
    }

    public final void zzb() {
        this.zzd = true;
        zzf();
    }

    public final void zzc() {
        this.zzd = false;
        zzf();
    }

    public final void zzd(boolean z10) {
        this.zze = z10;
        zzf();
    }

    public final void zze(float f10) {
        this.zzf = f10;
        zzf();
    }
}
