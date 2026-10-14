package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.util.Objects;
import r.e;

/* JADX INFO: loaded from: classes2.dex */
final class zzpd {
    private long zzA;
    private long zzB;
    private long zzC;
    private long zzD;
    private boolean zzE;
    private long zzF;
    private long zzG;
    private final zzpc zza;
    private final long[] zzb;
    private AudioTrack zzc;
    private int zzd;
    private int zze;
    private zzpb zzf;
    private int zzg;
    private boolean zzh;
    private long zzi;
    private float zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private Method zzn;
    private long zzo;
    private boolean zzp;
    private boolean zzq;
    private long zzr;
    private long zzs;
    private long zzt;
    private long zzu;
    private long zzv;
    private int zzw;
    private int zzx;
    private long zzy;
    private long zzz;

    public zzpd(zzpc zzpcVar) {
        this.zza = zzpcVar;
        int i10 = zzfj.zza;
        try {
            this.zzn = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.zzb = new long[10];
    }

    private final long zzl(long j10) {
        return (j10 * ((long) this.zzg)) / 1000000;
    }

    private final long zzm(long j10) {
        return (j10 * 1000000) / ((long) this.zzg);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0084  */
    private final long zzn() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.zzy;
        if (j10 != -9223372036854775807L) {
            return Math.min(this.zzB, this.zzA + zzl(zzfj.zzm((jElapsedRealtime * 1000) - j10, this.zzj)));
        }
        if (jElapsedRealtime - this.zzs >= 5) {
            AudioTrack audioTrack = this.zzc;
            Objects.requireNonNull(audioTrack);
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
                long j11 = 0;
                if (this.zzh) {
                    if (playState == 2) {
                        if (playbackHeadPosition == 0) {
                            this.zzv = this.zzt;
                        }
                        playState = 2;
                    }
                    playbackHeadPosition += this.zzv;
                }
                if (zzfj.zza > 29) {
                    if (this.zzt > playbackHeadPosition) {
                        this.zzu++;
                    }
                    this.zzt = playbackHeadPosition;
                } else {
                    if (playbackHeadPosition != 0) {
                        j11 = playbackHeadPosition;
                    } else if (this.zzt > 0 && playState == 3) {
                        if (this.zzz == -9223372036854775807L) {
                            this.zzz = jElapsedRealtime;
                        }
                    }
                    this.zzz = -9223372036854775807L;
                    playbackHeadPosition = j11;
                    if (this.zzt > playbackHeadPosition) {
                        this.zzu++;
                    }
                    this.zzt = playbackHeadPosition;
                }
            }
            this.zzs = jElapsedRealtime;
        }
        return this.zzt + (this.zzu << 32);
    }

    private final void zzo() {
        this.zzl = 0L;
        this.zzx = 0;
        this.zzw = 0;
        this.zzm = 0L;
        this.zzD = 0L;
        this.zzG = 0L;
        this.zzk = false;
    }

    public final int zza(long j10) {
        return this.zze - ((int) (j10 - (zzn() * ((long) this.zzd))));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0068  */
    /* JADX WARN: Code duplicated, block: B:21:0x0077  */
    /* JADX WARN: Code duplicated, block: B:23:0x0096  */
    /* JADX WARN: Code duplicated, block: B:25:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:27:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:40:0x0131 A[Catch: Exception -> 0x014a, TRY_LEAVE, TryCatch #0 {Exception -> 0x014a, blocks: (B:36:0x0105, B:38:0x010b, B:40:0x0131), top: B:69:0x0105 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:40:0x0131, please report this as an issue */
    public final long zzb(boolean z10) {
        long jZzm;
        zzpb zzpbVar;
        Method method;
        long jMax;
        long jZzb;
        long jZza;
        long jZzm2;
        zzpb zzpbVar2;
        long jZzF;
        long jZzG;
        String str;
        AudioTrack audioTrack = this.zzc;
        Objects.requireNonNull(audioTrack);
        if (audioTrack.getPlayState() == 3) {
            long jNanoTime = System.nanoTime() / 1000;
            if (jNanoTime - this.zzm >= 30000) {
                long jZzm3 = zzm(zzn());
                if (jZzm3 != 0) {
                    this.zzb[this.zzw] = zzfj.zzn(jZzm3, this.zzj) - jNanoTime;
                    this.zzw = (this.zzw + 1) % 10;
                    int i10 = this.zzx;
                    if (i10 < 10) {
                        this.zzx = i10 + 1;
                    }
                    this.zzm = jNanoTime;
                    this.zzl = 0L;
                    int i11 = 0;
                    while (true) {
                        int i12 = this.zzx;
                        if (i11 >= i12) {
                            break;
                        }
                        this.zzl = (this.zzb[i11] / ((long) i12)) + this.zzl;
                        i11++;
                    }
                    if (!this.zzh) {
                        zzpbVar = this.zzf;
                        Objects.requireNonNull(zzpbVar);
                        if (zzpbVar.zzg(jNanoTime)) {
                            jZzb = zzpbVar.zzb();
                            jZza = zzpbVar.zza();
                            jZzm2 = zzm(zzn());
                            if (Math.abs(jZzb - jNanoTime) > 5000000) {
                                zzpu zzpuVar = (zzpu) this.zza;
                                jZzF = zzpuVar.zza.zzF();
                                jZzG = zzpuVar.zza.zzG();
                                zzpbVar2 = zzpbVar;
                                str = "Spurious audio timestamp (system clock mismatch): ";
                            } else {
                                zzpbVar2 = zzpbVar;
                                if (Math.abs(zzm(jZza) - jZzm2) > 5000000) {
                                    zzpu zzpuVar2 = (zzpu) this.zza;
                                    jZzF = zzpuVar2.zza.zzF();
                                    jZzG = zzpuVar2.zza.zzG();
                                    str = "Spurious audio timestamp (frame position mismatch): ";
                                } else {
                                    zzpbVar2.zzc();
                                }
                            }
                            StringBuilder sbA = i2.a.a(str, jZza, ", ");
                            sbA.append(jZzb);
                            e.a(sbA, ", ", jNanoTime, ", ");
                            sbA.append(jZzm2);
                            e.a(sbA, ", ", jZzF, ", ");
                            sbA.append(jZzG);
                            zzer.zzf("DefaultAudioSink", sbA.toString());
                            zzpbVar2.zzd();
                        }
                        if (this.zzq && (method = this.zzn) != null && jNanoTime - this.zzr >= 500000) {
                            try {
                                AudioTrack audioTrack2 = this.zzc;
                                Objects.requireNonNull(audioTrack2);
                                Integer num = (Integer) method.invoke(audioTrack2, new Object[0]);
                                int i13 = zzfj.zza;
                                long jIntValue = (((long) num.intValue()) * 1000) - this.zzi;
                                this.zzo = jIntValue;
                                jMax = Math.max(jIntValue, 0L);
                                this.zzo = jMax;
                                if (jMax > 5000000) {
                                    zzer.zzf("DefaultAudioSink", "Ignoring impossibly large audio latency: " + jMax);
                                    this.zzo = 0L;
                                }
                            } catch (Exception unused) {
                                this.zzn = null;
                            }
                            this.zzr = jNanoTime;
                        }
                    }
                }
            } else if (!this.zzh) {
                zzpbVar = this.zzf;
                Objects.requireNonNull(zzpbVar);
                if (zzpbVar.zzg(jNanoTime)) {
                    jZzb = zzpbVar.zzb();
                    jZza = zzpbVar.zza();
                    jZzm2 = zzm(zzn());
                    if (Math.abs(jZzb - jNanoTime) > 5000000) {
                        zzpu zzpuVar3 = (zzpu) this.zza;
                        jZzF = zzpuVar3.zza.zzF();
                        jZzG = zzpuVar3.zza.zzG();
                        zzpbVar2 = zzpbVar;
                        str = "Spurious audio timestamp (system clock mismatch): ";
                    } else {
                        zzpbVar2 = zzpbVar;
                        if (Math.abs(zzm(jZza) - jZzm2) > 5000000) {
                            zzpu zzpuVar4 = (zzpu) this.zza;
                            jZzF = zzpuVar4.zza.zzF();
                            jZzG = zzpuVar4.zza.zzG();
                            str = "Spurious audio timestamp (frame position mismatch): ";
                        } else {
                            zzpbVar2.zzc();
                        }
                    }
                    StringBuilder sbA2 = i2.a.a(str, jZza, ", ");
                    sbA2.append(jZzb);
                    e.a(sbA2, ", ", jNanoTime, ", ");
                    sbA2.append(jZzm2);
                    e.a(sbA2, ", ", jZzF, ", ");
                    sbA2.append(jZzG);
                    zzer.zzf("DefaultAudioSink", sbA2.toString());
                    zzpbVar2.zzd();
                }
                if (this.zzq) {
                    AudioTrack audioTrack3 = this.zzc;
                    Objects.requireNonNull(audioTrack3);
                    Integer num2 = (Integer) method.invoke(audioTrack3, new Object[0]);
                    int i14 = zzfj.zza;
                    long jIntValue2 = (((long) num2.intValue()) * 1000) - this.zzi;
                    this.zzo = jIntValue2;
                    jMax = Math.max(jIntValue2, 0L);
                    this.zzo = jMax;
                    if (jMax > 5000000) {
                        zzer.zzf("DefaultAudioSink", "Ignoring impossibly large audio latency: " + jMax);
                        this.zzo = 0L;
                    }
                    this.zzr = jNanoTime;
                }
            }
        }
        long jNanoTime2 = System.nanoTime() / 1000;
        zzpb zzpbVar3 = this.zzf;
        Objects.requireNonNull(zzpbVar3);
        boolean zZzf = zzpbVar3.zzf();
        if (zZzf) {
            jZzm = zzfj.zzm(jNanoTime2 - zzpbVar3.zzb(), this.zzj) + zzm(zzpbVar3.zza());
        } else {
            jZzm = this.zzx == 0 ? zzm(zzn()) : zzfj.zzm(this.zzl + jNanoTime2, this.zzj);
            if (!z10) {
                jZzm = Math.max(0L, jZzm - this.zzo);
            }
        }
        if (this.zzE != zZzf) {
            this.zzG = this.zzD;
            this.zzF = this.zzC;
        }
        long j10 = jNanoTime2 - this.zzG;
        if (j10 < 1000000) {
            long jZzm4 = zzfj.zzm(j10, this.zzj) + this.zzF;
            long j11 = (j10 * 1000) / 1000000;
            jZzm = (((1000 - j11) * jZzm4) + (jZzm * j11)) / 1000;
        }
        if (!this.zzk) {
            long j12 = this.zzC;
            if (jZzm > j12) {
                this.zzk = true;
                int i15 = zzfj.zza;
                long jCurrentTimeMillis = System.currentTimeMillis() - zzfj.zzq(zzfj.zzn(zzfj.zzq(jZzm - j12), this.zzj));
                zzpz zzpzVar = ((zzpu) this.zza).zza;
                if (zzpzVar.zzp != null) {
                    ((zzqe) zzpzVar.zzp).zza.zzc.zzr(jCurrentTimeMillis);
                }
            }
        }
        this.zzD = jNanoTime2;
        this.zzC = jZzm;
        this.zzE = zZzf;
        return jZzm;
    }

    public final void zzc(long j10) {
        this.zzA = zzn();
        this.zzy = SystemClock.elapsedRealtime() * 1000;
        this.zzB = j10;
    }

    public final void zzd() {
        zzo();
        this.zzc = null;
        this.zzf = null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    public final void zze(AudioTrack audioTrack, boolean z10, int i10, int i11, int i12) {
        this.zzc = audioTrack;
        this.zzd = i11;
        this.zze = i12;
        this.zzf = new zzpb(audioTrack);
        this.zzg = audioTrack.getSampleRate();
        boolean z11 = true;
        if (!z10 || zzfj.zza >= 23) {
            z11 = false;
        } else if (i10 != 5) {
            if (i10 == 6) {
                i10 = 6;
            } else {
                z11 = false;
            }
        }
        this.zzh = z11;
        boolean zZzD = zzfj.zzD(i10);
        this.zzq = zZzD;
        this.zzi = zZzD ? zzm(i12 / i11) : -9223372036854775807L;
        this.zzt = 0L;
        this.zzu = 0L;
        this.zzv = 0L;
        this.zzp = false;
        this.zzy = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
        this.zzr = 0L;
        this.zzo = 0L;
        this.zzj = 1.0f;
    }

    public final void zzf() {
        zzpb zzpbVar = this.zzf;
        Objects.requireNonNull(zzpbVar);
        zzpbVar.zze();
    }

    public final boolean zzg(long j10) {
        if (j10 > zzl(zzb(false))) {
            return true;
        }
        if (this.zzh) {
            AudioTrack audioTrack = this.zzc;
            Objects.requireNonNull(audioTrack);
            if (audioTrack.getPlayState() == 2 && zzn() == 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzh() {
        AudioTrack audioTrack = this.zzc;
        Objects.requireNonNull(audioTrack);
        return audioTrack.getPlayState() == 3;
    }

    public final boolean zzi(long j10) {
        return this.zzz != -9223372036854775807L && j10 > 0 && SystemClock.elapsedRealtime() - this.zzz >= 200;
    }

    public final boolean zzj(long j10) {
        AudioTrack audioTrack = this.zzc;
        Objects.requireNonNull(audioTrack);
        int playState = audioTrack.getPlayState();
        if (this.zzh) {
            if (playState == 2) {
                this.zzp = false;
                return false;
            }
            if (playState == 1) {
                if (zzn() == 0) {
                    return false;
                }
                playState = 1;
            }
        }
        boolean z10 = this.zzp;
        boolean zZzg = zzg(j10);
        this.zzp = zZzg;
        if (z10 && !zZzg && playState != 1) {
            zzpc zzpcVar = this.zza;
            int i10 = this.zze;
            long jZzq = zzfj.zzq(this.zzi);
            zzpu zzpuVar = (zzpu) zzpcVar;
            if (zzpuVar.zza.zzp != null) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                zzpz zzpzVar = zzpuVar.zza;
                ((zzqe) zzpzVar.zzp).zza.zzc.zzt(i10, jZzq, jElapsedRealtime - zzpzVar.zzV);
            }
        }
        return true;
    }

    public final boolean zzk() {
        zzo();
        if (this.zzy != -9223372036854775807L) {
            return false;
        }
        zzpb zzpbVar = this.zzf;
        Objects.requireNonNull(zzpbVar);
        zzpbVar.zze();
        return true;
    }
}
