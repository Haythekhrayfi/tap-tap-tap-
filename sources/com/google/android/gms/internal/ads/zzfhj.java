package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfhj extends ContentObserver {
    private final Context zza;
    private final AudioManager zzb;
    private final zzfhh zzc;
    private float zzd;
    private final zzfhr zze;

    public zzfhj(Handler handler, Context context, zzfhh zzfhhVar, zzfhr zzfhrVar) {
        super(handler);
        this.zza = context;
        this.zzb = (AudioManager) context.getSystemService("audio");
        this.zzc = zzfhhVar;
        this.zze = zzfhrVar;
    }

    private final float zzc() {
        int streamVolume = this.zzb.getStreamVolume(3);
        int streamMaxVolume = this.zzb.getStreamMaxVolume(3);
        if (streamMaxVolume <= 0 || streamVolume <= 0) {
            return StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        }
        float f10 = streamVolume / streamMaxVolume;
        if (f10 > 1.0f) {
            return 1.0f;
        }
        return f10;
    }

    private final void zzd() {
        this.zze.zzd(this.zzd);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        super.onChange(z10);
        float fZzc = zzc();
        if (fZzc != this.zzd) {
            this.zzd = fZzc;
            zzd();
        }
    }

    public final void zza() {
        this.zzd = zzc();
        zzd();
        this.zza.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public final void zzb() {
        this.zza.getContentResolver().unregisterContentObserver(this);
    }
}
