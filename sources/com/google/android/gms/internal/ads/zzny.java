package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import com.facebook.ads.AdError;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class zzny implements zzlv, zznz {
    private final Context zza;
    private final zzoa zzb;
    private final PlaybackSession zzc;
    private String zzi;
    private PlaybackMetrics.Builder zzj;
    private int zzk;
    private zzcf zzn;
    private zznx zzo;
    private zznx zzp;
    private zznx zzq;
    private zzam zzr;
    private zzam zzs;
    private zzam zzt;
    private boolean zzu;
    private boolean zzv;
    private int zzw;
    private int zzx;
    private int zzy;
    private boolean zzz;
    private final zzcv zze = new zzcv();
    private final zzct zzf = new zzct();
    private final HashMap zzh = new HashMap();
    private final HashMap zzg = new HashMap();
    private final long zzd = SystemClock.elapsedRealtime();
    private int zzl = 0;
    private int zzm = 0;

    private zzny(Context context, PlaybackSession playbackSession) {
        this.zza = context.getApplicationContext();
        this.zzc = playbackSession;
        zznw zznwVar = new zznw(zznw.zza);
        this.zzb = zznwVar;
        zznwVar.zzg(this);
    }

    public static zzny zzb(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new zzny(context, mediaMetricsManager.createPlaybackSession());
    }

    @SuppressLint({"SwitchIntDef"})
    private static int zzr(int i10) {
        switch (zzfj.zzh(i10)) {
            case AdError.ICONVIEW_MISSING_ERROR_CODE /* 6002 */:
                return 24;
            case AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE /* 6003 */:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    private final void zzs() {
        PlaybackMetrics.Builder builder = this.zzj;
        if (builder != null && this.zzz) {
            builder.setAudioUnderrunCount(this.zzy);
            this.zzj.setVideoFramesDropped(this.zzw);
            this.zzj.setVideoFramesPlayed(this.zzx);
            Long l10 = (Long) this.zzg.get(this.zzi);
            this.zzj.setNetworkTransferDurationMillis(l10 == null ? 0L : l10.longValue());
            Long l11 = (Long) this.zzh.get(this.zzi);
            this.zzj.setNetworkBytesRead(l11 == null ? 0L : l11.longValue());
            this.zzj.setStreamSource((l11 == null || l11.longValue() <= 0) ? 0 : 1);
            this.zzc.reportPlaybackMetrics(this.zzj.build());
        }
        this.zzj = null;
        this.zzi = null;
        this.zzy = 0;
        this.zzw = 0;
        this.zzx = 0;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzz = false;
    }

    private final void zzt(long j10, zzam zzamVar, int i10) {
        if (zzfj.zzC(this.zzs, zzamVar)) {
            return;
        }
        int i11 = this.zzs == null ? 1 : 0;
        this.zzs = zzamVar;
        zzx(0, j10, zzamVar, i11);
    }

    private final void zzu(long j10, zzam zzamVar, int i10) {
        if (zzfj.zzC(this.zzt, zzamVar)) {
            return;
        }
        int i11 = this.zzt == null ? 1 : 0;
        this.zzt = zzamVar;
        zzx(2, j10, zzamVar, i11);
    }

    @RequiresNonNull({"metricsBuilder"})
    private final void zzv(zzcw zzcwVar, zzto zztoVar) {
        int iZza;
        PlaybackMetrics.Builder builder = this.zzj;
        if (zztoVar == null || (iZza = zzcwVar.zza(zztoVar.zza)) == -1) {
            return;
        }
        int i10 = 0;
        zzcwVar.zzd(iZza, this.zzf, false);
        zzcwVar.zze(this.zzf.zzd, this.zze, 0L);
        zzbi zzbiVar = this.zze.zzd.zzd;
        if (zzbiVar != null) {
            int iZzl = zzfj.zzl(zzbiVar.zzb);
            if (iZzl == 0) {
                i10 = 3;
            } else if (iZzl != 1) {
                i10 = iZzl != 2 ? 1 : 4;
            } else {
                i10 = 5;
            }
        }
        builder.setStreamType(i10);
        zzcv zzcvVar = this.zze;
        if (zzcvVar.zzn != -9223372036854775807L && !zzcvVar.zzl && !zzcvVar.zzi && !zzcvVar.zzb()) {
            builder.setMediaDurationMillis(zzfj.zzq(this.zze.zzn));
        }
        builder.setPlaybackType(true != this.zze.zzb() ? 1 : 2);
        this.zzz = true;
    }

    private final void zzw(long j10, zzam zzamVar, int i10) {
        if (zzfj.zzC(this.zzr, zzamVar)) {
            return;
        }
        int i11 = this.zzr == null ? 1 : 0;
        this.zzr = zzamVar;
        zzx(1, j10, zzamVar, i11);
    }

    private final void zzx(int i10, long j10, zzam zzamVar, int i11) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i10).setTimeSinceCreatedMillis(j10 - this.zzd);
        if (zzamVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i11 != 1 ? 1 : 2);
            String str = zzamVar.zzl;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = zzamVar.zzm;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = zzamVar.zzj;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i12 = zzamVar.zzi;
            if (i12 != -1) {
                timeSinceCreatedMillis.setBitrate(i12);
            }
            int i13 = zzamVar.zzr;
            if (i13 != -1) {
                timeSinceCreatedMillis.setWidth(i13);
            }
            int i14 = zzamVar.zzs;
            if (i14 != -1) {
                timeSinceCreatedMillis.setHeight(i14);
            }
            int i15 = zzamVar.zzz;
            if (i15 != -1) {
                timeSinceCreatedMillis.setChannelCount(i15);
            }
            int i16 = zzamVar.zzA;
            if (i16 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i16);
            }
            String str4 = zzamVar.zzd;
            if (str4 != null) {
                int i17 = zzfj.zza;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f10 = zzamVar.zzt;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.zzz = true;
        this.zzc.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    private final boolean zzy(zznx zznxVar) {
        return zznxVar != null && zznxVar.zzc.equals(this.zzb.zzd());
    }

    public final LogSessionId zza() {
        return this.zzc.getSessionId();
    }

    @Override // com.google.android.gms.internal.ads.zznz
    public final void zzc(zzlt zzltVar, String str) {
        zzto zztoVar = zzltVar.zzd;
        if (zztoVar == null || !zztoVar.zzb()) {
            zzs();
            this.zzi = str;
            this.zzj = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.1.0-beta01");
            zzv(zzltVar.zzb, zzltVar.zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zznz
    public final void zzd(zzlt zzltVar, String str, boolean z10) {
        zzto zztoVar = zzltVar.zzd;
        if ((zztoVar == null || !zztoVar.zzb()) && str.equals(this.zzi)) {
            zzs();
        }
        this.zzg.remove(str);
        this.zzh.remove(str);
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final /* synthetic */ void zze(zzlt zzltVar, zzam zzamVar, zzia zziaVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final void zzf(zzlt zzltVar, int i10, long j10, long j11) {
        zzto zztoVar = zzltVar.zzd;
        if (zztoVar != null) {
            String strZze = this.zzb.zze(zzltVar.zzb, zztoVar);
            Long l10 = (Long) this.zzh.get(strZze);
            Long l11 = (Long) this.zzg.get(strZze);
            this.zzh.put(strZze, Long.valueOf((l10 == null ? 0L : l10.longValue()) + j10));
            this.zzg.put(strZze, Long.valueOf((l11 != null ? l11.longValue() : 0L) + ((long) i10)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final void zzg(zzlt zzltVar, zztk zztkVar) {
        zzto zztoVar = zzltVar.zzd;
        if (zztoVar == null) {
            return;
        }
        zzam zzamVar = zztkVar.zzb;
        Objects.requireNonNull(zzamVar);
        zznx zznxVar = new zznx(zzamVar, 0, this.zzb.zze(zzltVar.zzb, zztoVar));
        int i10 = zztkVar.zza;
        if (i10 != 0) {
            if (i10 == 1) {
                this.zzp = zznxVar;
                return;
            } else if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                this.zzq = zznxVar;
                return;
            }
        }
        this.zzo = zznxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final /* synthetic */ void zzh(zzlt zzltVar, int i10, long j10) {
    }

    /* JADX WARN: Code duplicated, block: B:177:0x028f  */
    /* JADX WARN: Code duplicated, block: B:178:0x0294  */
    /* JADX WARN: Code duplicated, block: B:180:0x0297  */
    /* JADX WARN: Code duplicated, block: B:182:0x029c  */
    /* JADX WARN: Code duplicated, block: B:188:0x02b7  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzlv
    public final void zzi(zzcp zzcpVar, zzlu zzluVar) {
        int i10;
        int i11;
        boolean z10;
        int i12;
        int i13;
        zzad zzadVar;
        int i14;
        int i15;
        if (zzluVar.zzb() != 0) {
            int errorCode = 0;
            for (int i16 = 0; i16 < zzluVar.zzb(); i16++) {
                int iZza = zzluVar.zza(i16);
                zzlt zzltVarZzc = zzluVar.zzc(iZza);
                if (iZza == 0) {
                    this.zzb.zzj(zzltVarZzc);
                } else if (iZza == 11) {
                    this.zzb.zzi(zzltVarZzc, this.zzk);
                } else {
                    this.zzb.zzh(zzltVarZzc);
                }
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (zzluVar.zzd(0)) {
                zzlt zzltVarZzc2 = zzluVar.zzc(0);
                if (this.zzj != null) {
                    zzv(zzltVarZzc2.zzb, zzltVarZzc2.zzd);
                }
            }
            if (zzluVar.zzd(2) && this.zzj != null) {
                zzfsc zzfscVarZza = zzcpVar.zzo().zza();
                int size = zzfscVarZza.size();
                int i17 = 0;
                loop1: while (true) {
                    if (i17 >= size) {
                        zzadVar = null;
                        break;
                    }
                    zzdg zzdgVar = (zzdg) zzfscVarZza.get(i17);
                    int i18 = 0;
                    while (true) {
                        int i19 = zzdgVar.zzb;
                        i15 = i17 + 1;
                        if (i18 <= 0) {
                            if (zzdgVar.zzd(i18) && (zzadVar = zzdgVar.zzb(i18).zzp) != null) {
                                break loop1;
                            } else {
                                i18++;
                            }
                        }
                    }
                    i17 = i15;
                }
                if (zzadVar != null) {
                    PlaybackMetrics.Builder builder = this.zzj;
                    int i20 = zzfj.zza;
                    int i21 = 0;
                    while (true) {
                        if (i21 >= zzadVar.zzb) {
                            i14 = 1;
                            break;
                        }
                        UUID uuid = zzadVar.zza(i21).zza;
                        if (uuid.equals(zzo.zzd)) {
                            i14 = 3;
                            break;
                        } else if (uuid.equals(zzo.zze)) {
                            i14 = 2;
                            break;
                        } else {
                            if (uuid.equals(zzo.zzc)) {
                                i14 = 6;
                                break;
                            }
                            i21++;
                        }
                    }
                    builder.setDrmType(i14);
                }
            }
            if (zzluVar.zzd(1011)) {
                this.zzy++;
            }
            zzcf zzcfVar = this.zzn;
            if (zzcfVar != null) {
                Context context = this.zza;
                int iZzr = 14;
                int i22 = 23;
                if (zzcfVar.zzb == 1001) {
                    iZzr = 20;
                } else {
                    zzih zzihVar = (zzih) zzcfVar;
                    boolean z11 = zzihVar.zze == 1;
                    int i23 = zzihVar.zzi;
                    Throwable cause = zzcfVar.getCause();
                    Objects.requireNonNull(cause);
                    if (!(cause instanceof IOException)) {
                        if (z11 && (i23 == 0 || i23 == 1)) {
                            i22 = 35;
                        } else {
                            if (z11 && i23 == 3) {
                                iZzr = 15;
                            } else if (!z11 || i23 != 2) {
                                if (cause instanceof zzru) {
                                    errorCode = zzfj.zzi(((zzru) cause).zzd);
                                    i22 = 13;
                                } else if (cause instanceof zzrq) {
                                    errorCode = zzfj.zzi(((zzrq) cause).zzb);
                                } else if (!(cause instanceof OutOfMemoryError)) {
                                    if (cause instanceof zzov) {
                                        errorCode = ((zzov) cause).zza;
                                        iZzr = 17;
                                    } else if (cause instanceof zzoy) {
                                        errorCode = ((zzoy) cause).zza;
                                        iZzr = 18;
                                    } else {
                                        int i24 = zzfj.zza;
                                        if (cause instanceof MediaCodec.CryptoException) {
                                            errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                            iZzr = zzr(errorCode);
                                        } else {
                                            iZzr = 22;
                                        }
                                    }
                                }
                            }
                            i22 = iZzr;
                        }
                        errorCode = 0;
                    } else if (cause instanceof zzgz) {
                        errorCode = ((zzgz) cause).zzd;
                        i22 = 5;
                    } else if ((cause instanceof zzgy) || (cause instanceof zzcd)) {
                        errorCode = 0;
                        i22 = 11;
                    } else {
                        boolean z12 = cause instanceof zzgx;
                        if (z12 || (cause instanceof zzhh)) {
                            if (zzey.zzb(context).zza() == 1) {
                                i22 = 3;
                            } else {
                                Throwable cause2 = cause.getCause();
                                if (cause2 instanceof UnknownHostException) {
                                    errorCode = 0;
                                    i22 = 6;
                                } else if (cause2 instanceof SocketTimeoutException) {
                                    errorCode = 0;
                                    i22 = 7;
                                } else if (z12 && ((zzgx) cause).zzc == 1) {
                                    errorCode = 0;
                                    i22 = 4;
                                } else {
                                    errorCode = 0;
                                    i22 = 8;
                                }
                            }
                        } else if (zzcfVar.zzb == 1002) {
                            i22 = 21;
                        } else if (cause instanceof zzqm) {
                            Throwable cause3 = cause.getCause();
                            Objects.requireNonNull(cause3);
                            int i25 = zzfj.zza;
                            if (i25 < 21 || !(cause3 instanceof MediaDrm.MediaDrmStateException)) {
                                if (i25 >= 23 && (cause3 instanceof MediaDrmResetException)) {
                                    iZzr = 27;
                                } else if (cause3 instanceof NotProvisionedException) {
                                    iZzr = 24;
                                } else if (cause3 instanceof DeniedByServerException) {
                                    iZzr = 29;
                                } else if (!(cause3 instanceof zzqx)) {
                                    iZzr = cause3 instanceof zzqk ? 28 : 30;
                                }
                                i22 = iZzr;
                            } else {
                                errorCode = zzfj.zzi(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                iZzr = zzr(errorCode);
                            }
                        } else if ((cause instanceof zzgt) && (cause.getCause() instanceof FileNotFoundException)) {
                            Throwable cause4 = cause.getCause();
                            Objects.requireNonNull(cause4);
                            Throwable cause5 = cause4.getCause();
                            if (zzfj.zza >= 21 && (cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) {
                                iZzr = 32;
                                i22 = iZzr;
                            } else {
                                i22 = 31;
                            }
                        } else {
                            i22 = 9;
                        }
                        errorCode = 0;
                    }
                    this.zzc.reportPlaybackErrorEvent(new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(jElapsedRealtime - this.zzd).setErrorCode(i22).setSubErrorCode(errorCode).setException(zzcfVar).build());
                    this.zzz = true;
                    this.zzn = null;
                }
                i22 = iZzr;
                this.zzc.reportPlaybackErrorEvent(new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(jElapsedRealtime - this.zzd).setErrorCode(i22).setSubErrorCode(errorCode).setException(zzcfVar).build());
                this.zzz = true;
                this.zzn = null;
            }
            if (zzluVar.zzd(2)) {
                zzdh zzdhVarZzo = zzcpVar.zzo();
                boolean zZzb = zzdhVarZzo.zzb(2);
                boolean zZzb2 = zzdhVarZzo.zzb(1);
                boolean zZzb3 = zzdhVarZzo.zzb(3);
                if (zZzb || zZzb2) {
                    if (zZzb) {
                        i13 = 0;
                    } else {
                        i13 = 0;
                        zzw(jElapsedRealtime, null, 0);
                    }
                    if (!zZzb2) {
                        zzt(jElapsedRealtime, null, i13);
                    }
                    if (!zZzb3) {
                        zzu(jElapsedRealtime, null, i13);
                    }
                } else if (zZzb3) {
                    zZzb3 = true;
                    if (zZzb) {
                        i13 = 0;
                        zzw(jElapsedRealtime, null, 0);
                    } else {
                        i13 = 0;
                    }
                    if (!zZzb2) {
                        zzt(jElapsedRealtime, null, i13);
                    }
                    if (!zZzb3) {
                        zzu(jElapsedRealtime, null, i13);
                    }
                }
            }
            if (zzy(this.zzo)) {
                zzam zzamVar = this.zzo.zza;
                if (zzamVar.zzs != -1) {
                    i10 = 0;
                    zzw(jElapsedRealtime, zzamVar, 0);
                    this.zzo = null;
                } else {
                    i10 = 0;
                }
            } else {
                i10 = 0;
            }
            if (zzy(this.zzp)) {
                zzt(jElapsedRealtime, this.zzp.zza, i10);
                this.zzp = null;
            }
            if (zzy(this.zzq)) {
                zzu(jElapsedRealtime, this.zzq.zza, i10);
                this.zzq = null;
            }
            switch (zzey.zzb(this.zza).zza()) {
                case 0:
                    i11 = 0;
                    break;
                case 1:
                    i11 = 9;
                    break;
                case 2:
                    i11 = 2;
                    break;
                case 3:
                    i11 = 4;
                    break;
                case 4:
                    i11 = 5;
                    break;
                case 5:
                    i11 = 6;
                    break;
                case 6:
                case 8:
                default:
                    i11 = 1;
                    break;
                case 7:
                    i11 = 3;
                    break;
                case 9:
                    i11 = 8;
                    break;
                case 10:
                    i11 = 7;
                    break;
            }
            if (i11 != this.zzm) {
                this.zzm = i11;
                this.zzc.reportNetworkEvent(new NetworkEvent.Builder().setNetworkType(i11).setTimeSinceCreatedMillis(jElapsedRealtime - this.zzd).build());
            }
            if (zzcpVar.zzf() != 2) {
                z10 = false;
                this.zzu = false;
            } else {
                z10 = false;
            }
            if (((zzlo) zzcpVar).zzC() == null) {
                this.zzv = z10;
            } else if (zzluVar.zzd(10)) {
                this.zzv = true;
            }
            int iZzf = zzcpVar.zzf();
            if (this.zzu) {
                i12 = 5;
            } else if (this.zzv) {
                i12 = 13;
            } else {
                i12 = 4;
                if (iZzf == 4) {
                    i12 = 11;
                } else if (iZzf == 2) {
                    int i26 = this.zzl;
                    if (i26 == 0 || i26 == 2) {
                        i12 = 2;
                    } else if (zzcpVar.zzv()) {
                        i12 = zzcpVar.zzg() != 0 ? 10 : 6;
                    } else {
                        i12 = 7;
                    }
                } else if (iZzf != 3) {
                    i12 = (iZzf != 1 || this.zzl == 0) ? this.zzl : 12;
                } else if (zzcpVar.zzv()) {
                    i12 = zzcpVar.zzg() != 0 ? 9 : 3;
                }
            }
            if (this.zzl != i12) {
                this.zzl = i12;
                this.zzz = true;
                this.zzc.reportPlaybackStateEvent(new PlaybackStateEvent.Builder().setState(this.zzl).setTimeSinceCreatedMillis(jElapsedRealtime - this.zzd).build());
            }
            if (zzluVar.zzd(1028)) {
                this.zzb.zzf(zzluVar.zzc(1028));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final void zzj(zzlt zzltVar, zztf zztfVar, zztk zztkVar, IOException iOException, boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final /* synthetic */ void zzk(zzlt zzltVar, int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final void zzl(zzlt zzltVar, zzcf zzcfVar) {
        this.zzn = zzcfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final void zzm(zzlt zzltVar, zzco zzcoVar, zzco zzcoVar2, int i10) {
        if (i10 == 1) {
            this.zzu = true;
            i10 = 1;
        }
        this.zzk = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final /* synthetic */ void zzn(zzlt zzltVar, Object obj, long j10) {
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final void zzo(zzlt zzltVar, zzhz zzhzVar) {
        this.zzw += zzhzVar.zzg;
        this.zzx += zzhzVar.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final /* synthetic */ void zzp(zzlt zzltVar, zzam zzamVar, zzia zziaVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final void zzq(zzlt zzltVar, zzdn zzdnVar) {
        zznx zznxVar = this.zzo;
        if (zznxVar != null) {
            zzam zzamVar = zznxVar.zza;
            if (zzamVar.zzs == -1) {
                zzak zzakVarZzb = zzamVar.zzb();
                zzakVarZzb.zzX(zzdnVar.zzc);
                zzakVarZzb.zzF(zzdnVar.zzd);
                this.zzo = new zznx(zzakVarZzb.zzY(), 0, zznxVar.zzc);
            }
        }
    }
}
