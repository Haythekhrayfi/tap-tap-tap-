package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Display;
import android.view.Surface;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzzf {
    private final zzyj zza = new zzyj();
    private final zzzb zzb;
    private final zzze zzc;
    private boolean zzd;
    private Surface zze;
    private float zzf;
    private float zzg;
    private float zzh;
    private float zzi;
    private int zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;

    public zzzf(Context context) {
        zzzb zzzbVarZzc;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            int i10 = zzfj.zza;
            zzzbVarZzc = zzzd.zzc(applicationContext);
            if (zzzbVarZzc == null) {
                zzzbVarZzc = zzzc.zzc(applicationContext);
            }
        } else {
            zzzbVarZzc = null;
        }
        this.zzb = zzzbVarZzc;
        this.zzc = zzzbVarZzc != null ? zzze.zza() : null;
        this.zzk = -9223372036854775807L;
        this.zzl = -9223372036854775807L;
        this.zzf = -1.0f;
        this.zzi = 1.0f;
        this.zzj = 0;
    }

    public static /* synthetic */ void zzb(zzzf zzzfVar, Display display) {
        long j10;
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            zzzfVar.zzk = refreshRate;
            j10 = (refreshRate * 80) / 100;
        } else {
            zzer.zzf("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            j10 = -9223372036854775807L;
            zzzfVar.zzk = -9223372036854775807L;
        }
        zzzfVar.zzl = j10;
    }

    private final void zzk() {
        Surface surface;
        if (zzfj.zza < 30 || (surface = this.zze) == null || this.zzj == Integer.MIN_VALUE || this.zzh == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            return;
        }
        this.zzh = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        zzza.zza(surface, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
    }

    private final void zzl() {
        this.zzm = 0L;
        this.zzp = -1L;
        this.zzn = -1L;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0063  */
    /* JADX WARN: Code duplicated, block: B:33:0x0067 A[RETURN] */
    private final void zzm() {
        if (zzfj.zza < 30 || this.zze == null) {
            return;
        }
        float fZza = this.zza.zzg() ? this.zza.zza() : this.zzf;
        float f10 = this.zzg;
        if (fZza == f10) {
            return;
        }
        boolean z10 = true;
        if (fZza != -1.0f && f10 != -1.0f) {
            float f11 = 1.0f;
            if (this.zza.zzg() && this.zza.zzd() >= 5000000000L) {
                f11 = 0.02f;
            }
            if (Math.abs(fZza - this.zzg) < f11) {
                z10 = false;
            }
            if (!z10) {
                return;
            }
        } else if (fZza == -1.0f) {
            if (this.zza.zzb() < 30) {
                z10 = false;
            }
            if (!z10) {
                return;
            }
        }
        this.zzg = fZza;
        zzn(false);
    }

    private final void zzn(boolean z10) {
        Surface surface;
        if (zzfj.zza < 30 || (surface = this.zze) == null || this.zzj == Integer.MIN_VALUE) {
            return;
        }
        boolean z11 = this.zzd;
        float f10 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        if (z11) {
            float f11 = this.zzg;
            if (f11 != -1.0f) {
                f10 = this.zzi * f11;
            }
        }
        if (z10 || this.zzh != f10) {
            this.zzh = f10;
            zzza.zza(surface, f10);
        }
    }

    public final long zza(long j10) {
        long j11;
        if (this.zzp != -1 && this.zza.zzg()) {
            long jZzc = this.zzq + ((long) (((this.zzm - this.zzp) * this.zza.zzc()) / this.zzi));
            if (Math.abs(j10 - jZzc) > 20000000) {
                zzl();
            } else {
                j10 = jZzc;
            }
        }
        this.zzn = this.zzm;
        this.zzo = j10;
        zzze zzzeVar = this.zzc;
        if (zzzeVar == null || this.zzk == -9223372036854775807L) {
            return j10;
        }
        long j12 = zzzeVar.zza;
        if (j12 == -9223372036854775807L) {
            return j10;
        }
        long j13 = this.zzk;
        long j14 = (((j10 - j12) / j13) * j13) + j12;
        if (j10 <= j14) {
            j11 = j14 - j13;
        } else {
            j11 = j14;
            j14 = j13 + j14;
        }
        long j15 = this.zzl;
        if (j14 - j10 >= j10 - j11) {
            j14 = j11;
        }
        return j14 - j15;
    }

    public final void zzc(float f10) {
        this.zzf = f10;
        this.zza.zzf();
        zzm();
    }

    public final void zzd(long j10) {
        long j11 = this.zzn;
        if (j11 != -1) {
            this.zzp = j11;
            this.zzq = this.zzo;
        }
        this.zzm++;
        this.zza.zze(j10 * 1000);
        zzm();
    }

    public final void zze(float f10) {
        this.zzi = f10;
        zzl();
        zzn(false);
    }

    public final void zzf() {
        zzl();
    }

    public final void zzg() {
        this.zzd = true;
        zzl();
        if (this.zzb != null) {
            zzze zzzeVar = this.zzc;
            Objects.requireNonNull(zzzeVar);
            zzzeVar.zzb();
            this.zzb.zzb(new zzyz(this));
        }
        zzn(false);
    }

    public final void zzh() {
        this.zzd = false;
        zzzb zzzbVar = this.zzb;
        if (zzzbVar != null) {
            zzzbVar.zza();
            zzze zzzeVar = this.zzc;
            Objects.requireNonNull(zzzeVar);
            zzzeVar.zzc();
        }
        zzk();
    }

    public final void zzi(Surface surface) {
        if (true == (surface instanceof zzyx)) {
            surface = null;
        }
        if (this.zze == surface) {
            return;
        }
        zzk();
        this.zze = surface;
        zzn(true);
    }

    public final void zzj(int i10) {
        if (this.zzj == i10) {
            return;
        }
        this.zzj = i10;
        zzn(true);
    }
}
