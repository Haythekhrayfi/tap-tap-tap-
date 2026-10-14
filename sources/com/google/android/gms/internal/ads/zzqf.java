package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import ch.qos.logback.core.util.FileUtil;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzqf extends zzrw implements zzkl {
    private final Context zzb;
    private final zzos zzc;
    private final zzoz zzd;
    private int zze;
    private boolean zzf;
    private zzam zzg;
    private zzam zzh;
    private long zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private zzlh zzm;

    public zzqf(Context context, zzro zzroVar, zzry zzryVar, boolean z10, Handler handler, zzot zzotVar, zzoz zzozVar) {
        super(1, zzroVar, zzryVar, false, 44100.0f);
        this.zzb = context.getApplicationContext();
        this.zzd = zzozVar;
        this.zzc = new zzos(handler, zzotVar);
        zzozVar.zzo(new zzqe(this, null));
    }

    private final int zzaC(zzrs zzrsVar, zzam zzamVar) {
        int i10;
        if (!"OMX.google.raw.decoder".equals(zzrsVar.zza) || (i10 = zzfj.zza) >= 24 || (i10 == 23 && zzfj.zzE(this.zzb))) {
            return zzamVar.zzn;
        }
        return -1;
    }

    private static List zzaD(zzry zzryVar, zzam zzamVar, boolean z10, zzoz zzozVar) throws zzsf {
        zzrs zzrsVarZzd;
        if (zzamVar.zzm == null) {
            return zzfsc.zzl();
        }
        return (!zzozVar.zzx(zzamVar) || (zzrsVarZzd = zzsl.zzd()) == null) ? zzsl.zzh(zzryVar, zzamVar, false, false) : zzfsc.zzm(zzrsVarZzd);
    }

    private final void zzaE() {
        long jZzb = this.zzd.zzb(zzP());
        if (jZzb != Long.MIN_VALUE) {
            if (!this.zzk) {
                jZzb = Math.max(this.zzi, jZzb);
            }
            this.zzi = jZzb;
            this.zzk = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzli, com.google.android.gms.internal.ads.zzlk
    public final String zzN() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzrw, com.google.android.gms.internal.ads.zzli
    public final boolean zzP() {
        return super.zzP() && this.zzd.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzrw, com.google.android.gms.internal.ads.zzli
    public final boolean zzQ() {
        return this.zzd.zzv() || super.zzQ();
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final float zzS(float f10, zzam zzamVar, zzam[] zzamVarArr) {
        int iMax = -1;
        for (zzam zzamVar2 : zzamVarArr) {
            int i10 = zzamVar2.zzA;
            if (i10 != -1) {
                iMax = Math.max(iMax, i10);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f10;
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final int zzT(zzry zzryVar, zzam zzamVar) throws zzsf {
        int i10;
        boolean z10;
        int i11;
        if (!zzcc.zzf(zzamVar.zzm)) {
            return 128;
        }
        int i12 = zzfj.zza >= 21 ? 32 : 0;
        int i13 = zzamVar.zzF;
        boolean zZzaB = zzrw.zzaB(zzamVar);
        if (zZzaB && (i13 == 0 || zzsl.zzd() != null)) {
            zzoh zzohVarZzd = this.zzd.zzd(zzamVar);
            if (zzohVarZzd.zzb) {
                i10 = true != zzohVarZzd.zzc ? 512 : 1536;
                if (zzohVarZzd.zzd) {
                    i10 |= 2048;
                }
            } else {
                i10 = 0;
            }
            if (this.zzd.zzx(zzamVar)) {
                i11 = i12 | 140;
            }
            return i11 | i10;
        }
        i10 = 0;
        if (("audio/raw".equals(zzamVar.zzm) && !this.zzd.zzx(zzamVar)) || !this.zzd.zzx(zzfj.zzv(2, zzamVar.zzz, zzamVar.zzA))) {
            return 129;
        }
        List listZzaD = zzaD(zzryVar, zzamVar, false, this.zzd);
        if (listZzaD.isEmpty()) {
            return 129;
        }
        if (!zZzaB) {
            return 130;
        }
        zzrs zzrsVar = (zzrs) listZzaD.get(0);
        boolean zZze = zzrsVar.zze(zzamVar);
        if (!zZze) {
            int i14 = 1;
            while (true) {
                if (i14 >= listZzaD.size()) {
                    z10 = true;
                    break;
                }
                zzrs zzrsVar2 = (zzrs) listZzaD.get(i14);
                if (zzrsVar2.zze(zzamVar)) {
                    z10 = false;
                    zZze = true;
                    zzrsVar = zzrsVar2;
                    break;
                }
                i14++;
            }
        } else {
            z10 = true;
            break;
        }
        int i15 = true != zZze ? 3 : 4;
        int i16 = 8;
        if (zZze && zzrsVar.zzf(zzamVar)) {
            i16 = 16;
        }
        i11 = i15 | i16 | i12 | (true != zzrsVar.zzg ? 0 : 64) | (true != z10 ? 0 : 128);
        return i11 | i10;
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final zzia zzU(zzrs zzrsVar, zzam zzamVar, zzam zzamVar2) {
        int i10;
        int i11;
        zzia zziaVarZzb = zzrsVar.zzb(zzamVar, zzamVar2);
        int i12 = zziaVarZzb.zze;
        if (zzaz(zzamVar2)) {
            i12 |= FileUtil.BUF_SIZE;
        }
        if (zzaC(zzrsVar, zzamVar2) > this.zze) {
            i12 |= 64;
        }
        String str = zzrsVar.zza;
        if (i12 != 0) {
            i11 = 0;
            i10 = i12;
        } else {
            i10 = 0;
            i11 = zziaVarZzb.zzd;
        }
        return new zzia(str, zzamVar, zzamVar2, i11, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final zzia zzV(zzkj zzkjVar) throws zzih {
        zzam zzamVar = zzkjVar.zza;
        Objects.requireNonNull(zzamVar);
        this.zzg = zzamVar;
        zzia zziaVarZzV = super.zzV(zzkjVar);
        this.zzc.zzg(this.zzg, zziaVarZzV);
        return zziaVarZzV;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x00aa  */
    @Override // com.google.android.gms.internal.ads.zzrw
    public final zzrn zzY(zzrs zzrsVar, zzam zzamVar, MediaCrypto mediaCrypto, float f10) {
        boolean z10;
        zzam[] zzamVarArrZzM = zzM();
        int length = zzamVarArrZzM.length;
        int iZzaC = zzaC(zzrsVar, zzamVar);
        if (length != 1) {
            for (zzam zzamVar2 : zzamVarArrZzM) {
                if (zzrsVar.zzb(zzamVar, zzamVar2).zzd != 0) {
                    iZzaC = Math.max(iZzaC, zzaC(zzrsVar, zzamVar2));
                }
            }
        }
        this.zze = iZzaC;
        String str = zzrsVar.zza;
        int i10 = zzfj.zza;
        if (i10 < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(zzfj.zzc)) {
            String str2 = zzfj.zzb;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        this.zzf = z10;
        String str3 = zzrsVar.zzc;
        int i11 = this.zze;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str3);
        mediaFormat.setInteger("channel-count", zzamVar.zzz);
        mediaFormat.setInteger("sample-rate", zzamVar.zzA);
        zzet.zzb(mediaFormat, zzamVar.zzo);
        zzet.zza(mediaFormat, "max-input-size", i11);
        if (i10 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f) {
                if (i10 == 23) {
                    String str4 = zzfj.zzd;
                    if (!"ZTE B2017G".equals(str4) && !"AXON 7 mini".equals(str4)) {
                        mediaFormat.setFloat("operating-rate", f10);
                    }
                } else {
                    mediaFormat.setFloat("operating-rate", f10);
                }
            }
        }
        if (i10 <= 28 && "audio/ac4".equals(zzamVar.zzm)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i10 >= 24 && this.zzd.zza(zzfj.zzv(4, zzamVar.zzz, zzamVar.zzA)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i10 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        this.zzh = (!"audio/raw".equals(zzrsVar.zzb) || "audio/raw".equals(zzamVar.zzm)) ? null : zzamVar;
        return zzrn.zza(zzrsVar, mediaFormat, zzamVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final List zzZ(zzry zzryVar, zzam zzamVar, boolean z10) throws zzsf {
        return zzsl.zzi(zzaD(zzryVar, zzamVar, false, this.zzd), zzamVar);
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final long zza() {
        if (zzbc() == 2) {
            zzaE();
        }
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzaa(Exception exc) {
        zzer.zzd("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.zzc.zza(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzab(String str, zzrn zzrnVar, long j10, long j11) {
        this.zzc.zzc(str, j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzac(String str) {
        this.zzc.zzd(str);
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzad(zzam zzamVar, MediaFormat mediaFormat) throws zzih {
        int iZzj;
        int i10;
        zzam zzamVar2 = this.zzh;
        int[] iArr = null;
        if (zzamVar2 != null) {
            zzamVar = zzamVar2;
        } else if (zzan() != null) {
            if ("audio/raw".equals(zzamVar.zzm)) {
                iZzj = zzamVar.zzB;
            } else if (zzfj.zza < 24 || !mediaFormat.containsKey("pcm-encoding")) {
                iZzj = mediaFormat.containsKey("v-bits-per-sample") ? zzfj.zzj(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            } else {
                iZzj = mediaFormat.getInteger("pcm-encoding");
            }
            zzak zzakVar = new zzak();
            zzakVar.zzS("audio/raw");
            zzakVar.zzN(iZzj);
            zzakVar.zzC(zzamVar.zzC);
            zzakVar.zzD(zzamVar.zzD);
            zzakVar.zzw(mediaFormat.getInteger("channel-count"));
            zzakVar.zzT(mediaFormat.getInteger("sample-rate"));
            zzam zzamVarZzY = zzakVar.zzY();
            if (this.zzf && zzamVarZzY.zzz == 6 && (i10 = zzamVar.zzz) < 6) {
                iArr = new int[i10];
                for (int i11 = 0; i11 < zzamVar.zzz; i11++) {
                    iArr[i11] = i11;
                }
            }
            zzamVar = zzamVarZzY;
        }
        try {
            int i12 = zzfj.zza;
            if (i12 >= 29) {
                if (zzay()) {
                    zzk();
                }
                zzdy.zzf(i12 >= 29);
            }
            this.zzd.zze(zzamVar, 0, iArr);
        } catch (zzou e10) {
            throw zzbe(e10, e10.zza, false, 5001);
        }
    }

    public final void zzae() {
        this.zzk = true;
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzaf(long j10) {
        super.zzaf(j10);
        this.zzj = false;
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzag() {
        this.zzd.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzah(zzhp zzhpVar) {
        if (!this.zzj || zzhpVar.zzf()) {
            return;
        }
        if (Math.abs(zzhpVar.zzd - this.zzi) > 500000) {
            this.zzi = zzhpVar.zzd;
        }
        this.zzj = false;
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzai() throws zzih {
        try {
            this.zzd.zzj();
        } catch (zzoy e10) {
            throw zzbe(e10, e10.zzc, e10.zzb, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final boolean zzaj(long j10, long j11, zzrp zzrpVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, zzam zzamVar) throws zzih {
        Objects.requireNonNull(byteBuffer);
        if (this.zzh != null && (i11 & 2) != 0) {
            Objects.requireNonNull(zzrpVar);
            zzrpVar.zzn(i10, false);
            return true;
        }
        if (z10) {
            if (zzrpVar != null) {
                zzrpVar.zzn(i10, false);
            }
            ((zzrw) this).zza.zzf += i12;
            this.zzd.zzg();
            return true;
        }
        try {
            if (!this.zzd.zzu(byteBuffer, j12, i12)) {
                return false;
            }
            if (zzrpVar != null) {
                zzrpVar.zzn(i10, false);
            }
            ((zzrw) this).zza.zze += i12;
            return true;
        } catch (zzov e10) {
            throw zzbe(e10, this.zzg, e10.zzb, 5001);
        } catch (zzoy e11) {
            throw zzbe(e11, zzamVar, e11.zzb, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final boolean zzak(zzam zzamVar) {
        zzk();
        return this.zzd.zzx(zzamVar);
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final zzch zzc() {
        return this.zzd.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final void zzg(zzch zzchVar) {
        this.zzd.zzp(zzchVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhy, com.google.android.gms.internal.ads.zzli
    public final zzkl zzi() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzhy, com.google.android.gms.internal.ads.zzle
    public final void zzq(int i10, Object obj) throws zzih {
        if (i10 == 2) {
            this.zzd.zzt(((Float) obj).floatValue());
            return;
        }
        if (i10 == 3) {
            this.zzd.zzl((zzk) obj);
            return;
        }
        if (i10 == 6) {
            this.zzd.zzn((zzl) obj);
            return;
        }
        switch (i10) {
            case 9:
                this.zzd.zzs(((Boolean) obj).booleanValue());
                break;
            case 10:
                this.zzd.zzm(((Integer) obj).intValue());
                break;
            case 11:
                this.zzm = (zzlh) obj;
                break;
            case 12:
                if (zzfj.zza >= 23) {
                    zzqc.zza(this.zzd, obj);
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrw, com.google.android.gms.internal.ads.zzhy
    public final void zzt() {
        this.zzl = true;
        this.zzg = null;
        try {
            this.zzd.zzf();
            try {
                super.zzt();
            } finally {
                this.zzc.zze(((zzrw) this).zza);
            }
        } catch (Throwable th) {
            try {
                super.zzt();
                throw th;
            } finally {
                this.zzc.zze(((zzrw) this).zza);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrw, com.google.android.gms.internal.ads.zzhy
    public final void zzu(boolean z10, boolean z11) throws zzih {
        super.zzu(z10, z11);
        this.zzc.zzf(((zzrw) this).zza);
        zzk();
        this.zzd.zzq(zzl());
    }

    @Override // com.google.android.gms.internal.ads.zzrw, com.google.android.gms.internal.ads.zzhy
    public final void zzv(long j10, boolean z10) throws zzih {
        super.zzv(j10, z10);
        this.zzd.zzf();
        this.zzi = j10;
        this.zzj = true;
        this.zzk = true;
    }

    @Override // com.google.android.gms.internal.ads.zzrw, com.google.android.gms.internal.ads.zzhy
    public final void zzw() {
        try {
            super.zzw();
            if (this.zzl) {
            }
        } finally {
            if (this.zzl) {
                this.zzl = false;
                this.zzd.zzk();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhy
    public final void zzx() {
        this.zzd.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzhy
    public final void zzy() {
        zzaE();
        this.zzd.zzh();
    }
}
