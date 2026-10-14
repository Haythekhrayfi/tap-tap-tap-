package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzpz implements zzoz {
    private static final Object zza = new Object();
    private static ExecutorService zzb;
    private static int zzc;
    private long zzA;
    private long zzB;
    private long zzC;
    private long zzD;
    private int zzE;
    private boolean zzF;
    private boolean zzG;
    private long zzH;
    private float zzI;
    private ByteBuffer zzJ;
    private int zzK;
    private ByteBuffer zzL;
    private byte[] zzM;
    private int zzN;
    private boolean zzO;
    private boolean zzP;
    private boolean zzQ;
    private boolean zzR;
    private int zzS;
    private zzl zzT;
    private zzpl zzU;
    private long zzV;
    private boolean zzW;
    private boolean zzX;
    private final zzpp zzY;
    private final zzph zzZ;
    private final zzpe zzd;
    private final zzqj zze;
    private final zzfsc zzf;
    private final zzfsc zzg;
    private final zzeb zzh;
    private final zzpd zzi;
    private final ArrayDeque zzj;
    private zzpx zzk;
    private final zzps zzl;
    private final zzps zzm;
    private final zzpm zzn;
    private zzoc zzo;
    private zzow zzp;
    private zzpo zzq;
    private zzpo zzr;
    private zzdo zzs;
    private AudioTrack zzt;
    private zzoe zzu;
    private zzk zzv;
    private zzpr zzw;
    private zzpr zzx;
    private zzch zzy;
    private boolean zzz;

    public /* synthetic */ zzpz(zzpn zzpnVar, zzpy zzpyVar) {
        this.zzu = zzpnVar.zza;
        this.zzY = zzpnVar.zzd;
        int i10 = zzfj.zza;
        this.zzn = zzpnVar.zzc;
        zzph zzphVar = zzpnVar.zze;
        Objects.requireNonNull(zzphVar);
        this.zzZ = zzphVar;
        zzeb zzebVar = new zzeb(zzdz.zza);
        this.zzh = zzebVar;
        zzebVar.zze();
        this.zzi = new zzpd(new zzpu(this, null));
        zzpe zzpeVar = new zzpe();
        this.zzd = zzpeVar;
        zzqj zzqjVar = new zzqj();
        this.zze = zzqjVar;
        this.zzf = zzfsc.zzo(new zzdv(), zzpeVar, zzqjVar);
        this.zzg = zzfsc.zzm(new zzqi());
        this.zzI = 1.0f;
        this.zzv = zzk.zza;
        this.zzS = 0;
        this.zzT = new zzl(0, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        zzch zzchVar = zzch.zza;
        this.zzx = new zzpr(zzchVar, 0L, 0L, null);
        this.zzy = zzchVar;
        this.zzz = false;
        this.zzj = new ArrayDeque();
        this.zzl = new zzps(100L);
        this.zzm = new zzps(100L);
    }

    public static /* synthetic */ void zzD(AudioTrack audioTrack, zzeb zzebVar) {
        try {
            audioTrack.flush();
            audioTrack.release();
            zzebVar.zze();
            synchronized (zza) {
                int i10 = zzc - 1;
                zzc = i10;
                if (i10 == 0) {
                    zzb.shutdown();
                    zzb = null;
                }
            }
        } catch (Throwable th) {
            zzebVar.zze();
            synchronized (zza) {
                int i11 = zzc - 1;
                zzc = i11;
                if (i11 == 0) {
                    zzb.shutdown();
                    zzb = null;
                }
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzF() {
        zzpo zzpoVar = this.zzr;
        return zzpoVar.zzc == 0 ? this.zzA / ((long) zzpoVar.zzb) : this.zzB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzG() {
        zzpo zzpoVar = this.zzr;
        return zzpoVar.zzc == 0 ? this.zzC / ((long) zzpoVar.zzd) : this.zzD;
    }

    private final AudioTrack zzH(zzpo zzpoVar) throws zzov {
        try {
            return zzpoVar.zzb(false, this.zzv, this.zzS);
        } catch (zzov e10) {
            zzow zzowVar = this.zzp;
            if (zzowVar != null) {
                zzowVar.zza(e10);
            }
            throw e10;
        }
    }

    private final void zzI(long j10) {
        zzch zzchVar;
        boolean z10;
        if (zzS()) {
            zzpp zzppVar = this.zzY;
            zzchVar = this.zzy;
            zzppVar.zzc(zzchVar);
        } else {
            zzchVar = zzch.zza;
        }
        zzch zzchVar2 = zzchVar;
        this.zzy = zzchVar2;
        if (zzS()) {
            zzpp zzppVar2 = this.zzY;
            z10 = this.zzz;
            zzppVar2.zzd(z10);
        } else {
            z10 = false;
        }
        this.zzz = z10;
        this.zzj.add(new zzpr(zzchVar2, Math.max(0L, j10), this.zzr.zza(zzG()), null));
        zzN();
        zzow zzowVar = this.zzp;
        if (zzowVar != null) {
            ((zzqe) zzowVar).zza.zzc.zzs(this.zzz);
        }
    }

    private final void zzJ() {
        if (this.zzP) {
            return;
        }
        this.zzP = true;
        this.zzi.zzc(zzG());
        this.zzt.stop();
    }

    private final void zzK(long j10) throws Exception {
        ByteBuffer byteBufferZzb;
        if (!this.zzs.zzh()) {
            ByteBuffer byteBuffer = this.zzJ;
            if (byteBuffer == null) {
                byteBuffer = zzdr.zza;
            }
            zzO(byteBuffer, j10);
            return;
        }
        while (!this.zzs.zzg()) {
            do {
                byteBufferZzb = this.zzs.zzb();
                if (byteBufferZzb.hasRemaining()) {
                    zzO(byteBufferZzb, j10);
                } else {
                    ByteBuffer byteBuffer2 = this.zzJ;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.zzs.zze(this.zzJ);
                    }
                }
            } while (!byteBufferZzb.hasRemaining());
            return;
        }
    }

    private final void zzL(zzch zzchVar) {
        zzpr zzprVar = new zzpr(zzchVar, -9223372036854775807L, -9223372036854775807L, null);
        if (zzQ()) {
            this.zzw = zzprVar;
        } else {
            this.zzx = zzprVar;
        }
    }

    private final void zzM() {
        if (zzQ()) {
            if (zzfj.zza >= 21) {
                this.zzt.setVolume(this.zzI);
                return;
            }
            AudioTrack audioTrack = this.zzt;
            float f10 = this.zzI;
            audioTrack.setStereoVolume(f10, f10);
        }
    }

    private final void zzN() {
        zzdo zzdoVar = this.zzr.zzi;
        this.zzs = zzdoVar;
        zzdoVar.zzc();
    }

    private final void zzO(ByteBuffer byteBuffer, long j10) throws Exception {
        int iWrite;
        zzow zzowVar;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.zzL;
            if (byteBuffer2 != null) {
                zzdy.zzd(byteBuffer2 == byteBuffer);
            } else {
                this.zzL = byteBuffer;
                if (zzfj.zza < 21) {
                    int iRemaining = byteBuffer.remaining();
                    byte[] bArr = this.zzM;
                    if (bArr == null || bArr.length < iRemaining) {
                        this.zzM = new byte[iRemaining];
                    }
                    int iPosition = byteBuffer.position();
                    byteBuffer.get(this.zzM, 0, iRemaining);
                    byteBuffer.position(iPosition);
                    this.zzN = 0;
                }
            }
            int iRemaining2 = byteBuffer.remaining();
            int i10 = zzfj.zza;
            if (i10 < 21) {
                int iZza = this.zzi.zza(this.zzC);
                if (iZza > 0) {
                    iWrite = this.zzt.write(this.zzM, this.zzN, Math.min(iRemaining2, iZza));
                    if (iWrite > 0) {
                        this.zzN += iWrite;
                        byteBuffer.position(byteBuffer.position() + iWrite);
                    }
                } else {
                    iWrite = 0;
                }
            } else {
                iWrite = this.zzt.write(byteBuffer, iRemaining2, 1);
            }
            this.zzV = SystemClock.elapsedRealtime();
            if (iWrite < 0) {
                zzoy zzoyVar = new zzoy(iWrite, this.zzr.zza, ((i10 >= 24 && iWrite == -6) || iWrite == -32) && this.zzD > 0);
                zzow zzowVar2 = this.zzp;
                if (zzowVar2 != null) {
                    zzowVar2.zza(zzoyVar);
                }
                if (zzoyVar.zzb) {
                    this.zzu = zzoe.zza;
                    throw zzoyVar;
                }
                this.zzm.zzb(zzoyVar);
                return;
            }
            this.zzm.zza();
            if (zzR(this.zzt)) {
                if (this.zzD > 0) {
                    this.zzX = false;
                }
                if (this.zzQ && (zzowVar = this.zzp) != null && iWrite < iRemaining2) {
                    zzqf zzqfVar = ((zzqe) zzowVar).zza;
                    if (zzqfVar.zzm != null) {
                        zzqfVar.zzm.zza();
                    }
                }
            }
            int i11 = this.zzr.zzc;
            if (i11 == 0) {
                this.zzC += (long) iWrite;
            }
            if (iWrite == iRemaining2) {
                if (i11 != 0) {
                    zzdy.zzf(byteBuffer == this.zzJ);
                    this.zzD = (((long) this.zzE) * ((long) this.zzK)) + this.zzD;
                }
                this.zzL = null;
            }
        }
    }

    private final boolean zzP() throws Exception {
        if (!this.zzs.zzh()) {
            ByteBuffer byteBuffer = this.zzL;
            if (byteBuffer == null) {
                return true;
            }
            zzO(byteBuffer, Long.MIN_VALUE);
            return this.zzL == null;
        }
        this.zzs.zzd();
        zzK(Long.MIN_VALUE);
        if (!this.zzs.zzg()) {
            return false;
        }
        ByteBuffer byteBuffer2 = this.zzL;
        return byteBuffer2 == null || !byteBuffer2.hasRemaining();
    }

    private final boolean zzQ() {
        return this.zzt != null;
    }

    private static boolean zzR(AudioTrack audioTrack) {
        return zzfj.zza >= 29 && audioTrack.isOffloadedPlayback();
    }

    private final boolean zzS() {
        zzpo zzpoVar = this.zzr;
        if (zzpoVar.zzc != 0) {
            return false;
        }
        int i10 = zzpoVar.zza.zzB;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    public final int zza(zzam zzamVar) {
        if (!"audio/raw".equals(zzamVar.zzm)) {
            return this.zzu.zza(zzamVar) != null ? 2 : 0;
        }
        boolean zZzD = zzfj.zzD(zzamVar.zzB);
        int i10 = zzamVar.zzB;
        if (zZzD) {
            return i10 != 2 ? 1 : 2;
        }
        zzer.zzf("DefaultAudioSink", "Invalid PCM encoding: " + i10);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    public final long zzb(boolean z10) {
        long jZzm;
        if (!zzQ() || this.zzG) {
            return Long.MIN_VALUE;
        }
        long jMin = Math.min(this.zzi.zzb(z10), this.zzr.zza(zzG()));
        while (!this.zzj.isEmpty() && jMin >= ((zzpr) this.zzj.getFirst()).zzc) {
            this.zzx = (zzpr) this.zzj.remove();
        }
        zzpr zzprVar = this.zzx;
        long j10 = jMin - zzprVar.zzc;
        if (zzprVar.zza.equals(zzch.zza)) {
            jZzm = this.zzx.zzb + j10;
        } else if (this.zzj.isEmpty()) {
            jZzm = this.zzY.zza(j10) + this.zzx.zzb;
        } else {
            zzpr zzprVar2 = (zzpr) this.zzj.getFirst();
            jZzm = zzprVar2.zzb - zzfj.zzm(zzprVar2.zzc - jMin, this.zzx.zza.zzc);
        }
        return jZzm + this.zzr.zza(this.zzY.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    public final zzch zzc() {
        return this.zzy;
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    public final zzoh zzd(zzam zzamVar) {
        return this.zzW ? zzoh.zza : this.zzZ.zza(zzamVar, this.zzv);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0160  */
    /* JADX WARN: Code duplicated, block: B:55:0x0163  */
    @Override // com.google.android.gms.internal.ads.zzoz
    public final void zze(zzam zzamVar, int i10, int[] iArr) throws zzou {
        int iIntValue;
        int i11;
        zzdo zzdoVar;
        int iZzk;
        int iIntValue2;
        int i12;
        int iZzk2;
        int iMax;
        int i13;
        zzpo zzpoVar;
        int[] iArr2;
        if ("audio/raw".equals(zzamVar.zzm)) {
            zzdy.zzd(zzfj.zzD(zzamVar.zzB));
            iZzk = zzfj.zzk(zzamVar.zzB, zzamVar.zzz);
            zzfrz zzfrzVar = new zzfrz();
            zzfrzVar.zzh(this.zzf);
            zzfrzVar.zzg(this.zzY.zze());
            zzdo zzdoVar2 = new zzdo(zzfrzVar.zzi());
            if (zzdoVar2.equals(this.zzs)) {
                zzdoVar2 = this.zzs;
            }
            this.zze.zzq(zzamVar.zzC, zzamVar.zzD);
            if (zzfj.zza < 21 && zzamVar.zzz == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i14 = 0; i14 < 6; i14++) {
                    iArr2[i14] = i14;
                }
            } else {
                iArr2 = iArr;
            }
            this.zzd.zzo(iArr2);
            try {
                zzdp zzdpVarZza = zzdoVar2.zza(new zzdp(zzamVar.zzA, zzamVar.zzz, zzamVar.zzB));
                iIntValue = zzdpVarZza.zzd;
                int i15 = zzdpVarZza.zzb;
                int i16 = zzdpVarZza.zzc;
                iIntValue2 = zzfj.zzf(i16);
                iZzk2 = zzfj.zzk(iIntValue, i16);
                zzdoVar = zzdoVar2;
                i12 = i15;
                i11 = 0;
            } catch (zzdq e10) {
                throw new zzou(e10, zzamVar);
            }
        } else {
            zzdo zzdoVar3 = new zzdo(zzfsc.zzl());
            int i17 = zzamVar.zzA;
            zzoh zzohVar = zzoh.zza;
            Pair pairZza = this.zzu.zza(zzamVar);
            if (pairZza == null) {
                throw new zzou("Unable to configure passthrough for: ".concat(String.valueOf(zzamVar)), zzamVar);
            }
            iIntValue = ((Integer) pairZza.first).intValue();
            i11 = 2;
            zzdoVar = zzdoVar3;
            iZzk = -1;
            iIntValue2 = ((Integer) pairZza.second).intValue();
            i12 = i17;
            iZzk2 = -1;
        }
        if (iIntValue == 0) {
            throw new zzou("Invalid output encoding (mode=" + i11 + ") for: " + String.valueOf(zzamVar), zzamVar);
        }
        if (iIntValue2 == 0) {
            throw new zzou("Invalid output channel config (mode=" + i11 + ") for: " + String.valueOf(zzamVar), zzamVar);
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i12, iIntValue2, iIntValue);
        zzdy.zzf(minBufferSize != -2);
        int i18 = iZzk2 != -1 ? iZzk2 : 1;
        int i19 = zzamVar.zzi;
        int i20 = 250000;
        if (i11 != 0) {
            if (i11 != 1) {
                int i21 = 5;
                if (iIntValue == 5) {
                    i20 = 500000;
                    iIntValue = 5;
                } else {
                    i21 = iIntValue;
                }
                iZzk2 = iZzk2;
                iMax = zzfuk.zza((((long) i20) * ((long) (i19 != -1 ? zzfui.zza(i19, 8, RoundingMode.CEILING) : zzqb.zzb(iIntValue)))) / 1000000);
                i13 = i21;
            } else {
                iMax = zzfuk.zza((((long) zzqb.zzb(iIntValue)) * 50000000) / 1000000);
            }
            int iMax2 = (((Math.max(minBufferSize, iMax) + i18) - 1) / i18) * i18;
            this.zzW = false;
            zzpoVar = new zzpo(zzamVar, iZzk, i11, iZzk2, i12, iIntValue2, i13, iMax2, zzdoVar, false, false);
            if (zzQ()) {
                this.zzq = zzpoVar;
            } else {
                this.zzr = zzpoVar;
            }
        }
        iMax = Math.max(zzqb.zza(250000, i12, i18), Math.min(minBufferSize * 4, zzqb.zza(750000, i12, i18)));
        i13 = iIntValue;
        int iMax3 = (((Math.max(minBufferSize, iMax) + i18) - 1) / i18) * i18;
        this.zzW = false;
        zzpoVar = new zzpo(zzamVar, iZzk, i11, iZzk2, i12, iIntValue2, i13, iMax3, zzdoVar, false, false);
        if (zzQ()) {
            this.zzq = zzpoVar;
        } else {
            this.zzr = zzpoVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    public final void zzf() {
        if (zzQ()) {
            this.zzA = 0L;
            this.zzB = 0L;
            this.zzC = 0L;
            this.zzD = 0L;
            this.zzX = false;
            this.zzE = 0;
            this.zzx = new zzpr(this.zzy, 0L, 0L, null);
            this.zzH = 0L;
            this.zzw = null;
            this.zzj.clear();
            this.zzJ = null;
            this.zzK = 0;
            this.zzL = null;
            this.zzP = false;
            this.zzO = false;
            this.zze.zzp();
            zzN();
            if (this.zzi.zzh()) {
                this.zzt.pause();
            }
            if (zzR(this.zzt)) {
                zzpx zzpxVar = this.zzk;
                Objects.requireNonNull(zzpxVar);
                zzpxVar.zzb(this.zzt);
            }
            if (zzfj.zza < 21 && !this.zzR) {
                this.zzS = 0;
            }
            zzpo zzpoVar = this.zzq;
            if (zzpoVar != null) {
                this.zzr = zzpoVar;
                this.zzq = null;
            }
            this.zzi.zzd();
            final AudioTrack audioTrack = this.zzt;
            final zzeb zzebVar = this.zzh;
            zzebVar.zzc();
            synchronized (zza) {
                if (zzb == null) {
                    zzb = zzfj.zzA("ExoPlayer:AudioTrackReleaseThread");
                }
                zzc++;
                zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpi
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzpz.zzD(audioTrack, zzebVar);
                    }
                });
            }
            this.zzt = null;
        }
        this.zzm.zza();
        this.zzl.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    public final void zzg() {
        this.zzF = true;
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    public final void zzh() {
        this.zzQ = false;
        if (zzQ() && this.zzi.zzk()) {
            this.zzt.pause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    public final void zzi() {
        this.zzQ = true;
        if (zzQ()) {
            this.zzi.zzf();
            this.zzt.play();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    public final void zzj() throws zzoy {
        if (!this.zzO && zzQ() && zzP()) {
            zzJ();
            this.zzO = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    public final void zzk() {
        zzf();
        zzfsc zzfscVar = this.zzf;
        int size = zzfscVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((zzdr) zzfscVar.get(i10)).zzf();
        }
        zzfsc zzfscVar2 = this.zzg;
        int size2 = zzfscVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((zzdr) zzfscVar2.get(i11)).zzf();
        }
        zzdo zzdoVar = this.zzs;
        if (zzdoVar != null) {
            zzdoVar.zzf();
        }
        this.zzQ = false;
        this.zzW = false;
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    public final void zzl(zzk zzkVar) {
        if (this.zzv.equals(zzkVar)) {
            return;
        }
        this.zzv = zzkVar;
        zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    public final void zzm(int i10) {
        if (this.zzS != i10) {
            this.zzS = i10;
            this.zzR = i10 != 0;
            zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    public final void zzn(zzl zzlVar) {
        if (this.zzT.equals(zzlVar)) {
            return;
        }
        int i10 = zzlVar.zza;
        if (this.zzt != null) {
            int i11 = this.zzT.zza;
        }
        this.zzT = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    public final void zzo(zzow zzowVar) {
        this.zzp = zzowVar;
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    public final void zzp(zzch zzchVar) {
        this.zzy = new zzch(Math.max(0.1f, Math.min(zzchVar.zzc, 8.0f)), Math.max(0.1f, Math.min(zzchVar.zzd, 8.0f)));
        zzL(zzchVar);
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    public final void zzq(zzoc zzocVar) {
        this.zzo = zzocVar;
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    public final void zzr(AudioDeviceInfo audioDeviceInfo) {
        zzpl zzplVar = audioDeviceInfo == null ? null : new zzpl(audioDeviceInfo);
        this.zzU = zzplVar;
        AudioTrack audioTrack = this.zzt;
        if (audioTrack != null) {
            zzpj.zza(audioTrack, zzplVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    public final void zzs(boolean z10) {
        this.zzz = z10;
        zzL(this.zzy);
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    public final void zzt(float f10) {
        if (this.zzI != f10) {
            this.zzI = f10;
            zzM();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:128:0x0229 A[PHI: r11
  0x0229: PHI (r11v5 int) = (r11v3 int), (r11v3 int), (r11v3 int), (r11v14 int) binds: [B:94:0x0173, B:121:0x0211, B:123:0x021a, B:117:0x0201] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:144:0x029d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:188:0x037d A[Catch: zzov -> 0x0381, TryCatch #3 {zzov -> 0x0381, blocks: (B:36:0x0071, B:49:0x00b8, B:51:0x00c0, B:53:0x00c6, B:54:0x00cd, B:55:0x00d6, B:57:0x00da, B:59:0x00de, B:60:0x00e3, B:64:0x00f9, B:68:0x0111, B:69:0x0116, B:45:0x0086, B:47:0x008f, B:186:0x0375, B:188:0x037d, B:189:0x0380, B:39:0x007a, B:41:0x007f), top: B:203:0x0071, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:206:? A[Catch: zzov -> 0x0381, SYNTHETIC, TRY_LEAVE, TryCatch #3 {zzov -> 0x0381, blocks: (B:36:0x0071, B:49:0x00b8, B:51:0x00c0, B:53:0x00c6, B:54:0x00cd, B:55:0x00d6, B:57:0x00da, B:59:0x00de, B:60:0x00e3, B:64:0x00f9, B:68:0x0111, B:69:0x0116, B:45:0x0086, B:47:0x008f, B:186:0x0375, B:188:0x037d, B:189:0x0380, B:39:0x007a, B:41:0x007f), top: B:203:0x0071, inners: #0 }] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzoz
    public final boolean zzu(ByteBuffer byteBuffer, long j10, int i10) throws Exception {
        AudioTrack audioTrackZzH;
        zzoc zzocVar;
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int iZzc;
        int i19;
        ByteBuffer byteBuffer2 = this.zzJ;
        zzdy.zzd(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.zzq != null) {
            if (!zzP()) {
                return false;
            }
            zzpo zzpoVar = this.zzq;
            zzpo zzpoVar2 = this.zzr;
            if (zzpoVar2.zzc == zzpoVar.zzc && zzpoVar2.zzg == zzpoVar.zzg && zzpoVar2.zze == zzpoVar.zze && zzpoVar2.zzf == zzpoVar.zzf && zzpoVar2.zzd == zzpoVar.zzd) {
                this.zzr = zzpoVar;
                this.zzq = null;
                AudioTrack audioTrack = this.zzt;
                if (audioTrack != null && zzR(audioTrack)) {
                    boolean z11 = this.zzr.zzk;
                }
            } else {
                zzJ();
                if (zzv()) {
                    return false;
                }
                zzf();
            }
            zzI(j10);
        }
        if (!zzQ()) {
            try {
                if (!this.zzh.zzd()) {
                    return false;
                }
                try {
                    zzpo zzpoVar3 = this.zzr;
                    Objects.requireNonNull(zzpoVar3);
                    audioTrackZzH = zzH(zzpoVar3);
                } catch (zzov e10) {
                    zzpo zzpoVar4 = this.zzr;
                    if (zzpoVar4.zzh > 1000000) {
                        zzpo zzpoVar5 = new zzpo(zzpoVar4.zza, zzpoVar4.zzb, zzpoVar4.zzc, zzpoVar4.zzd, zzpoVar4.zze, zzpoVar4.zzf, zzpoVar4.zzg, 1000000, zzpoVar4.zzi, false, false);
                        try {
                            audioTrackZzH = zzH(zzpoVar5);
                            this.zzr = zzpoVar5;
                        } catch (zzov e11) {
                            try {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(e10, e11);
                            } catch (Exception unused) {
                            }
                            if (this.zzr.zzc()) {
                                throw e10;
                            }
                            this.zzW = true;
                            throw e10;
                        }
                    }
                    if (this.zzr.zzc()) {
                        throw e10;
                    }
                    this.zzW = true;
                    throw e10;
                }
                this.zzt = audioTrackZzH;
                if (zzR(audioTrackZzH)) {
                    AudioTrack audioTrack2 = this.zzt;
                    if (this.zzk == null) {
                        this.zzk = new zzpx(this);
                    }
                    this.zzk.zza(audioTrack2);
                    boolean z12 = this.zzr.zzk;
                }
                int i20 = zzfj.zza;
                if (i20 >= 31 && (zzocVar = this.zzo) != null) {
                    zzpk.zza(this.zzt, zzocVar);
                }
                this.zzS = this.zzt.getAudioSessionId();
                zzpd zzpdVar = this.zzi;
                AudioTrack audioTrack3 = this.zzt;
                zzpo zzpoVar6 = this.zzr;
                zzpdVar.zze(audioTrack3, zzpoVar6.zzc == 2, zzpoVar6.zzg, zzpoVar6.zzd, zzpoVar6.zzh);
                zzM();
                int i21 = this.zzT.zza;
                zzpl zzplVar = this.zzU;
                if (zzplVar != null && i20 >= 23) {
                    zzpj.zza(this.zzt, zzplVar);
                }
                this.zzG = true;
            } catch (zzov e12) {
                if (e12.zzb) {
                    throw e12;
                }
                this.zzl.zzb(e12);
                return false;
            }
        }
        this.zzl.zza();
        if (this.zzG) {
            this.zzH = Math.max(0L, j10);
            this.zzF = false;
            this.zzG = false;
            zzI(j10);
            if (this.zzQ) {
                zzi();
            }
        }
        if (!this.zzi.zzj(zzG())) {
            return false;
        }
        if (this.zzJ == null) {
            zzdy.zzd(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            zzpo zzpoVar7 = this.zzr;
            if (zzpoVar7.zzc != 0 && this.zzE == 0) {
                int i22 = zzpoVar7.zzg;
                int iZza = 1024;
                switch (i22) {
                    case 5:
                    case 6:
                    case 18:
                        z10 = 1;
                        iZza = zzzx.zza(byteBuffer);
                        this.zzE = iZza;
                        if (iZza == 0) {
                            return z10;
                        }
                        break;
                    case 7:
                    case 8:
                        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
                            z10 = 1;
                        } else if (byteBuffer.getInt(0) == 622876772) {
                            iZzc = 4096;
                            iZza = iZzc;
                            z10 = 1;
                        } else {
                            int iPosition = byteBuffer.position();
                            byte b10 = byteBuffer.get(iPosition);
                            if (b10 != -2) {
                                if (b10 != -1) {
                                    if (b10 != 31) {
                                        i17 = (byteBuffer.get(iPosition + 4) & 1) << 6;
                                        i18 = byteBuffer.get(iPosition + 5) & 252;
                                        i16 = 2;
                                    } else {
                                        i13 = 2;
                                        i14 = (byteBuffer.get(iPosition + 5) & 7) << 4;
                                        i15 = iPosition + 6;
                                    }
                                    i11 = (i18 >> i16) | i17;
                                    i12 = 1;
                                } else {
                                    i13 = 2;
                                    i14 = (byteBuffer.get(iPosition + 4) & 7) << 4;
                                    i15 = iPosition + 7;
                                }
                                int i23 = i14;
                                i16 = i13;
                                i17 = i23;
                                i18 = byteBuffer.get(i15) & 60;
                                i11 = (i18 >> i16) | i17;
                                i12 = 1;
                            } else {
                                i11 = ((byteBuffer.get(iPosition + 4) & 252) >> 2) | ((byteBuffer.get(iPosition + 5) & 1) << 6);
                                i12 = 1;
                            }
                            iZza = (i11 + i12) * 32;
                            z10 = i12;
                        }
                        this.zzE = iZza;
                        if (iZza == 0) {
                            return z10;
                        }
                        break;
                    case 9:
                        iZzc = zzabq.zzc(zzfj.zzg(byteBuffer, byteBuffer.position()));
                        if (iZzc == -1) {
                            throw new IllegalArgumentException();
                        }
                        iZza = iZzc;
                        z10 = 1;
                        this.zzE = iZza;
                        if (iZza == 0) {
                            return z10;
                        }
                        break;
                    case 10:
                    case 16:
                        z10 = 1;
                        this.zzE = iZza;
                        if (iZza == 0) {
                            return z10;
                        }
                        break;
                    case 11:
                    case 12:
                        iZzc = 2048;
                        iZza = iZzc;
                        z10 = 1;
                        this.zzE = iZza;
                        if (iZza == 0) {
                            return z10;
                        }
                        break;
                    case 13:
                    case 19:
                    default:
                        throw new IllegalStateException(android.support.v4.media.a.a("Unexpected audio encoding: ", i22));
                    case 14:
                        int iPosition2 = byteBuffer.position();
                        int iLimit = byteBuffer.limit() - 10;
                        int i24 = iPosition2;
                        while (true) {
                            if (i24 > iLimit) {
                                i19 = -1;
                            } else if ((zzfj.zzg(byteBuffer, i24 + 4) & (-2)) == -126718022) {
                                i19 = i24 - iPosition2;
                            } else {
                                i24++;
                            }
                        }
                        if (i19 == -1) {
                            iZzc = 0;
                        } else {
                            iZzc = (40 << ((byteBuffer.get((byteBuffer.position() + i19) + ((byteBuffer.get((byteBuffer.position() + i19) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                        }
                        iZza = iZzc;
                        z10 = 1;
                        this.zzE = iZza;
                        if (iZza == 0) {
                            return z10;
                        }
                        break;
                    case 15:
                        iZzc = 512;
                        iZza = iZzc;
                        z10 = 1;
                        this.zzE = iZza;
                        if (iZza == 0) {
                            return z10;
                        }
                        break;
                    case 17:
                        byte[] bArr = new byte[16];
                        int iPosition3 = byteBuffer.position();
                        byteBuffer.get(bArr);
                        byteBuffer.position(iPosition3);
                        iZzc = zzaaa.zza(new zzez(bArr, 16)).zzc;
                        iZza = iZzc;
                        z10 = 1;
                        this.zzE = iZza;
                        if (iZza == 0) {
                            return z10;
                        }
                        break;
                    case 20:
                        iZzc = zzabr.zza(byteBuffer);
                        iZza = iZzc;
                        z10 = 1;
                        this.zzE = iZza;
                        if (iZza == 0) {
                            return z10;
                        }
                        break;
                }
            }
            if (this.zzw != null) {
                if (!zzP()) {
                    return false;
                }
                zzI(j10);
                this.zzw = null;
            }
            long jZzF = (((zzF() - this.zze.zzo()) * 1000000) / ((long) this.zzr.zza.zzA)) + this.zzH;
            if (!this.zzF && Math.abs(jZzF - j10) > 200000) {
                zzow zzowVar = this.zzp;
                if (zzowVar != null) {
                    zzowVar.zza(new zzox(j10, jZzF));
                }
                this.zzF = true;
            }
            if (this.zzF) {
                if (!zzP()) {
                    return false;
                }
                long j11 = j10 - jZzF;
                this.zzH += j11;
                this.zzF = false;
                zzI(j10);
                zzow zzowVar2 = this.zzp;
                if (zzowVar2 != null && j11 != 0) {
                    ((zzqe) zzowVar2).zza.zzae();
                }
            }
            if (this.zzr.zzc == 0) {
                this.zzA += (long) byteBuffer.remaining();
            } else {
                this.zzB = (((long) this.zzE) * ((long) i10)) + this.zzB;
            }
            this.zzJ = byteBuffer;
            this.zzK = i10;
        }
        zzK(j10);
        if (!this.zzJ.hasRemaining()) {
            this.zzJ = null;
            this.zzK = 0;
            return true;
        }
        if (!this.zzi.zzi(zzG())) {
            return false;
        }
        zzer.zzf("DefaultAudioSink", "Resetting stalled audio track");
        zzf();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    public final boolean zzv() {
        return zzQ() && this.zzi.zzg(zzG());
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    public final boolean zzw() {
        return !zzQ() || (this.zzO && !zzv());
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    public final boolean zzx(zzam zzamVar) {
        return zza(zzamVar) != 0;
    }
}
