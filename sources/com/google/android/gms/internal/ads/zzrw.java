package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzrw extends zzhy {
    private static final byte[] zzb = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, Ascii.CAN, -96, 0, 47, -65, Ascii.FS, 49, -61, 39, 93, 120};
    private zzru zzA;
    private zzrs zzB;
    private int zzC;
    private boolean zzD;
    private boolean zzE;
    private boolean zzF;
    private boolean zzG;
    private boolean zzH;
    private boolean zzI;
    private boolean zzJ;
    private boolean zzK;
    private boolean zzL;
    private zzrk zzM;
    private long zzN;
    private int zzO;
    private int zzP;
    private ByteBuffer zzQ;
    private boolean zzR;
    private boolean zzS;
    private boolean zzT;
    private boolean zzU;
    private boolean zzV;
    private boolean zzW;
    private int zzX;
    private int zzY;
    private int zzZ;
    public zzhz zza;
    private boolean zzaa;
    private boolean zzab;
    private boolean zzac;
    private long zzad;
    private long zzae;
    private boolean zzaf;
    private boolean zzag;
    private boolean zzah;
    private zzrv zzai;
    private long zzaj;
    private boolean zzak;
    private zzqv zzal;
    private zzqv zzam;
    private final zzro zzc;
    private final zzry zzd;
    private final float zze;
    private final zzhp zzf;
    private final zzhp zzg;
    private final zzhp zzh;
    private final zzrj zzi;
    private final ArrayList zzj;
    private final MediaCodec.BufferInfo zzk;
    private final ArrayDeque zzl;
    private final zzqg zzm;
    private zzam zzn;
    private zzam zzo;
    private MediaCrypto zzp;
    private boolean zzq;
    private long zzr;
    private float zzs;
    private float zzt;
    private zzrp zzu;
    private zzam zzv;
    private MediaFormat zzw;
    private boolean zzx;
    private float zzy;
    private ArrayDeque zzz;

    public zzrw(int i10, zzro zzroVar, zzry zzryVar, boolean z10, float f10) {
        super(i10);
        this.zzc = zzroVar;
        Objects.requireNonNull(zzryVar);
        this.zzd = zzryVar;
        this.zze = f10;
        this.zzf = new zzhp(0, 0);
        this.zzg = new zzhp(0, 0);
        this.zzh = new zzhp(2, 0);
        zzrj zzrjVar = new zzrj();
        this.zzi = zzrjVar;
        this.zzj = new ArrayList();
        this.zzk = new MediaCodec.BufferInfo();
        this.zzs = 1.0f;
        this.zzt = 1.0f;
        this.zzr = -9223372036854775807L;
        this.zzl = new ArrayDeque();
        zzaG(zzrv.zza);
        zzrjVar.zzj(0);
        zzrjVar.zzb.order(ByteOrder.nativeOrder());
        this.zzm = new zzqg();
        this.zzy = -1.0f;
        this.zzC = 0;
        this.zzX = 0;
        this.zzO = -1;
        this.zzP = -1;
        this.zzN = -9223372036854775807L;
        this.zzad = -9223372036854775807L;
        this.zzae = -9223372036854775807L;
        this.zzaj = -9223372036854775807L;
        this.zzY = 0;
        this.zzZ = 0;
    }

    private final void zzW() {
        this.zzV = false;
        this.zzi.zzb();
        this.zzh.zzb();
        this.zzU = false;
        this.zzT = false;
        this.zzm.zzb();
    }

    private final void zzX() throws zzih {
        if (this.zzaa) {
            this.zzY = 1;
            this.zzZ = 3;
        } else {
            zzat();
            zzar();
        }
    }

    public static boolean zzaB(zzam zzamVar) {
        return zzamVar.zzF == 0;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0294  */
    /* JADX WARN: Code duplicated, block: B:124:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:162:0x034c  */
    /* JADX WARN: Code duplicated, block: B:189:0x03a8  */
    private final void zzaC(zzrs zzrsVar, MediaCrypto mediaCrypto) throws Exception {
        zzrp zzsnVar;
        long j10;
        zzrn zzrnVar;
        int i10;
        boolean z10;
        boolean z11;
        String string;
        String str;
        String str2 = zzrsVar.zza;
        int i11 = zzfj.zza;
        float fZzS = i11 < 23 ? -1.0f : zzS(this.zzt, this.zzn, zzM());
        if (fZzS <= this.zze) {
            fZzS = -1.0f;
        }
        zzas(this.zzn);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        MediaCodec mediaCodec = null;
        zzrn zzrnVarZzY = zzY(zzrsVar, this.zzn, null, fZzS);
        if (i11 >= 31) {
            zzrt.zza(zzrnVarZzY, zzl());
        }
        try {
            Trace.beginSection("createCodec:" + str2);
            boolean z12 = false;
            z12 = false;
            if (i11 < 23 || i11 < 31) {
                try {
                    zzrs zzrsVar2 = zzrnVarZzY.zza;
                    Objects.requireNonNull(zzrsVar2);
                    String str3 = zzrsVar2.zza;
                    Trace.beginSection("createCodec:".concat(str3));
                    MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str3);
                    Trace.endSection();
                    try {
                        Trace.beginSection("configureCodec");
                        mediaCodecCreateByCodecName.configure(zzrnVarZzY.zzb, zzrnVarZzY.zzd, (MediaCrypto) null, 0);
                        Trace.endSection();
                        Trace.beginSection("startCodec");
                        mediaCodecCreateByCodecName.start();
                        Trace.endSection();
                        zzsnVar = new zzsn(mediaCodecCreateByCodecName, null);
                    } catch (IOException | RuntimeException e10) {
                        e = e10;
                        mediaCodec = mediaCodecCreateByCodecName;
                        if (mediaCodec != null) {
                            mediaCodec.release();
                        }
                        throw e;
                    }
                } catch (IOException e11) {
                    e = e11;
                } catch (RuntimeException e12) {
                    e = e12;
                }
            } else {
                int iZzb = zzcc.zzb(zzrnVarZzY.zzc.zzm);
                zzer.zze("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(zzfj.zzy(iZzb)));
                zzsnVar = new zzra(iZzb, false).zzc(zzrnVarZzY);
            }
            this.zzu = zzsnVar;
            Trace.endSection();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            if (zzrsVar.zze(this.zzn)) {
                j10 = jElapsedRealtime;
                zzrnVar = zzrnVarZzY;
            } else {
                Object[] objArr = new Object[2];
                zzam zzamVar = this.zzn;
                zzn zznVar = zzam.zza;
                if (zzamVar == null) {
                    string = "null";
                    j10 = jElapsedRealtime;
                    zzrnVar = zzrnVarZzY;
                } else {
                    StringBuilder sbA = defpackage.a.a("id=");
                    sbA.append(zzamVar.zzb);
                    sbA.append(", mimeType=");
                    sbA.append(zzamVar.zzm);
                    if (zzamVar.zzi != -1) {
                        sbA.append(", bitrate=");
                        sbA.append(zzamVar.zzi);
                    }
                    if (zzamVar.zzj != null) {
                        sbA.append(", codecs=");
                        sbA.append(zzamVar.zzj);
                    }
                    if (zzamVar.zzp != null) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        int i12 = 0;
                        while (true) {
                            zzad zzadVar = zzamVar.zzp;
                            zzrnVar = zzrnVarZzY;
                            if (i12 >= zzadVar.zzb) {
                                break;
                            }
                            UUID uuid = zzadVar.zza(i12).zza;
                            if (uuid.equals(zzo.zzb)) {
                                str = "cenc";
                            } else if (uuid.equals(zzo.zzc)) {
                                str = "clearkey";
                            } else if (uuid.equals(zzo.zze)) {
                                str = "playready";
                            } else if (uuid.equals(zzo.zzd)) {
                                str = "widevine";
                            } else {
                                if (uuid.equals(zzo.zza)) {
                                    str = "universal";
                                } else {
                                    linkedHashSet.add("unknown (" + uuid.toString() + ")");
                                }
                                i12++;
                                zzrnVarZzY = zzrnVar;
                                jElapsedRealtime = jElapsedRealtime;
                            }
                            linkedHashSet.add(str);
                            i12++;
                            zzrnVarZzY = zzrnVar;
                            jElapsedRealtime = jElapsedRealtime;
                        }
                        j10 = jElapsedRealtime;
                        sbA.append(", drm=[");
                        zzfow.zzb(sbA, linkedHashSet, ",");
                        sbA.append(']');
                    } else {
                        j10 = jElapsedRealtime;
                        zzrnVar = zzrnVarZzY;
                    }
                    if (zzamVar.zzr != -1 && zzamVar.zzs != -1) {
                        sbA.append(", res=");
                        sbA.append(zzamVar.zzr);
                        sbA.append("x");
                        sbA.append(zzamVar.zzs);
                    }
                    zzs zzsVar = zzamVar.zzy;
                    if (zzsVar != null && zzsVar.zze()) {
                        sbA.append(", color=");
                        sbA.append(zzamVar.zzy.zzd());
                    }
                    if (zzamVar.zzt != -1.0f) {
                        sbA.append(", fps=");
                        sbA.append(zzamVar.zzt);
                    }
                    if (zzamVar.zzz != -1) {
                        sbA.append(", channels=");
                        sbA.append(zzamVar.zzz);
                    }
                    if (zzamVar.zzA != -1) {
                        sbA.append(", sample_rate=");
                        sbA.append(zzamVar.zzA);
                    }
                    if (zzamVar.zzd != null) {
                        sbA.append(", language=");
                        sbA.append(zzamVar.zzd);
                    }
                    if (zzamVar.zzc != null) {
                        sbA.append(", label=");
                        sbA.append(zzamVar.zzc);
                    }
                    if (zzamVar.zze != 0) {
                        ArrayList arrayList = new ArrayList();
                        if ((zzamVar.zze & 1) != 0) {
                            arrayList.add("default");
                        }
                        if ((zzamVar.zze & 2) != 0) {
                            arrayList.add("forced");
                        }
                        sbA.append(", selectionFlags=[");
                        zzfow.zzb(sbA, arrayList, ",");
                        sbA.append("]");
                    }
                    string = sbA.toString();
                    z12 = false;
                }
                objArr[z12 ? 1 : 0] = string;
                objArr[1] = str2;
                zzer.zzf("MediaCodecRenderer", String.format(Locale.US, "Format exceeds selected codec's capabilities [%s, %s]", objArr));
            }
            this.zzB = zzrsVar;
            this.zzy = fZzS;
            this.zzv = this.zzn;
            int i13 = zzfj.zza;
            if (i13 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str2)) {
                String str4 = zzfj.zzd;
                if (str4.startsWith("SM-T585") || str4.startsWith("SM-A510") || str4.startsWith("SM-A520") || str4.startsWith("SM-J700")) {
                    i10 = 2;
                } else if (i13 < 24) {
                    i10 = z12 ? 1 : 0;
                } else {
                    i10 = z12 ? 1 : 0;
                }
            } else if (i13 < 24 || !("OMX.Nvidia.h264.decode".equals(str2) || "OMX.Nvidia.h264.decode.secure".equals(str2))) {
                i10 = z12 ? 1 : 0;
            } else {
                String str5 = zzfj.zzb;
                if ("flounder".equals(str5) || "flounder_lte".equals(str5) || "grouper".equals(str5) || "tilapia".equals(str5)) {
                    i10 = 1;
                } else {
                    i10 = z12 ? 1 : 0;
                }
            }
            this.zzC = i10;
            this.zzD = (i13 < 21 && this.zzv.zzo.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str2)) ? true : z12 ? 1 : 0;
            this.zzE = (i13 == 19 && zzfj.zzd.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str2) || "OMX.Exynos.avc.dec.secure".equals(str2))) ? true : z12 ? 1 : 0;
            this.zzF = (i13 == 29 && "c2.android.aac.decoder".equals(str2)) ? true : z12 ? 1 : 0;
            if (i13 > 23 || !"OMX.google.vorbis.decoder".equals(str2)) {
                if (i13 <= 19) {
                    String str6 = zzfj.zzb;
                    if (("hb2000".equals(str6) || "stvm8".equals(str6)) && ("OMX.amlogic.avc.decoder.awesome".equals(str2) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str2))) {
                        z10 = true;
                    }
                }
                z10 = z12 ? 1 : 0;
            } else {
                z10 = true;
            }
            this.zzG = z10;
            this.zzH = (i13 == 21 && "OMX.google.aac.decoder".equals(str2)) ? true : z12 ? 1 : 0;
            if (i13 < 21 && "OMX.SEC.mp3.dec".equals(str2) && "samsung".equals(zzfj.zzc)) {
                String str7 = zzfj.zzb;
                if (str7.startsWith("baffin") || str7.startsWith("grand") || str7.startsWith("fortuna") || str7.startsWith("gprimelte") || str7.startsWith("j2y18lte") || str7.startsWith("ms01")) {
                    z11 = true;
                } else {
                    z11 = z12 ? 1 : 0;
                }
            } else {
                z11 = z12 ? 1 : 0;
            }
            this.zzI = z11;
            String str8 = zzrsVar.zza;
            if ((i13 <= 25 && "OMX.rk.video_decoder.avc".equals(str8)) || ((i13 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str8) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str8) || "OMX.bcm.vdec.avc.tunnel".equals(str8) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str8) || "OMX.bcm.vdec.hevc.tunnel".equals(str8) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str8))) || ("Amazon".equals(zzfj.zzc) && "AFTS".equals(zzfj.zzd) && zzrsVar.zzf))) {
                z12 = true;
            }
            this.zzL = z12;
            this.zzu.zzr();
            if ("c2.android.mp3.decoder".equals(zzrsVar.zza)) {
                this.zzM = new zzrk();
            }
            if (zzbc() == 2) {
                this.zzN = SystemClock.elapsedRealtime() + 1000;
            }
            this.zza.zza++;
            zzab(str2, zzrnVar, jElapsedRealtime2, jElapsedRealtime2 - j10);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @TargetApi(23)
    private final void zzaD() throws zzih {
        int i10 = this.zzZ;
        if (i10 == 1) {
            zzae();
            return;
        }
        if (i10 == 2) {
            zzae();
            zzaH();
        } else if (i10 != 3) {
            this.zzag = true;
            zzai();
        } else {
            zzat();
            zzar();
        }
    }

    private final void zzaE() {
        this.zzO = -1;
        this.zzg.zzb = null;
    }

    private final void zzaF() {
        this.zzP = -1;
        this.zzQ = null;
    }

    private final void zzaG(zzrv zzrvVar) {
        this.zzai = zzrvVar;
        if (zzrvVar.zzc != -9223372036854775807L) {
            this.zzak = true;
        }
    }

    private final void zzaH() throws zzih {
        this.zzal = this.zzam;
        this.zzY = 0;
        this.zzZ = 0;
    }

    @TargetApi(23)
    private final boolean zzaI() throws zzih {
        if (this.zzaa) {
            this.zzY = 1;
            if (this.zzE || this.zzG) {
                this.zzZ = 3;
                return false;
            }
            this.zzZ = 2;
        } else {
            zzaH();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    private final boolean zzaJ() throws zzih {
        zzrp zzrpVar = this.zzu;
        boolean z10 = 0;
        if (zzrpVar == null || this.zzY == 2 || this.zzaf) {
            return false;
        }
        if (this.zzO < 0) {
            int iZza = zzrpVar.zza();
            this.zzO = iZza;
            if (iZza < 0) {
                return false;
            }
            this.zzg.zzb = this.zzu.zzf(iZza);
            this.zzg.zzb();
        }
        if (this.zzY == 1) {
            if (!this.zzL) {
                this.zzab = true;
                this.zzu.zzj(this.zzO, 0, 0, 0L, 4);
                zzaE();
            }
            this.zzY = 2;
            return false;
        }
        if (this.zzJ) {
            this.zzJ = false;
            this.zzg.zzb.put(zzb);
            this.zzu.zzj(this.zzO, 0, 38, 0L, 0);
            zzaE();
            this.zzaa = true;
            return true;
        }
        if (this.zzX == 1) {
            for (int i10 = 0; i10 < this.zzv.zzo.size(); i10++) {
                this.zzg.zzb.put((byte[]) this.zzv.zzo.get(i10));
            }
            this.zzX = 2;
        }
        int iPosition = this.zzg.zzb.position();
        zzkj zzkjVarZzh = zzh();
        try {
            int iZzbd = zzbd(zzkjVarZzh, this.zzg, 0);
            if (zzJ() || this.zzg.zzi()) {
                this.zzae = this.zzad;
            }
            if (iZzbd == -3) {
                return false;
            }
            if (iZzbd == -5) {
                if (this.zzX == 2) {
                    this.zzg.zzb();
                    this.zzX = 1;
                }
                zzV(zzkjVarZzh);
                return true;
            }
            zzhp zzhpVar = this.zzg;
            if (zzhpVar.zzg()) {
                if (this.zzX == 2) {
                    zzhpVar.zzb();
                    this.zzX = 1;
                }
                this.zzaf = true;
                if (!this.zzaa) {
                    zzaD();
                    return false;
                }
                try {
                    if (!this.zzL) {
                        this.zzab = true;
                        this.zzu.zzj(this.zzO, 0, 0, 0L, 4);
                        zzaE();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e10) {
                    throw zzbe(e10, this.zzn, false, zzfj.zzh(e10.getErrorCode()));
                }
            }
            if (!this.zzaa && !zzhpVar.zzh()) {
                zzhpVar.zzb();
                if (this.zzX == 2) {
                    this.zzX = 1;
                }
                return true;
            }
            boolean zZzl = zzhpVar.zzl();
            if (zZzl) {
                zzhpVar.zza.zzb(iPosition);
            }
            if (this.zzD && !zZzl) {
                ByteBuffer byteBuffer = this.zzg.zzb;
                byte[] bArr = zzfu.zza;
                int iPosition2 = byteBuffer.position();
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    int i13 = i11 + 1;
                    if (i13 >= iPosition2) {
                        byteBuffer.clear();
                        break;
                    }
                    int i14 = byteBuffer.get(i11) & 255;
                    if (i12 == 3) {
                        if (i14 == 1) {
                            if ((byteBuffer.get(i13) & Ascii.US) == 7) {
                                ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                                byteBufferDuplicate.position(i11 - 3);
                                byteBufferDuplicate.limit(iPosition2);
                                byteBuffer.position(0);
                                byteBuffer.put(byteBufferDuplicate);
                                break;
                            }
                            i14 = 1;
                        }
                    } else if (i14 == 0) {
                        i12++;
                    }
                    if (i14 != 0) {
                        i12 = 0;
                    }
                    i11 = i13;
                }
                if (this.zzg.zzb.position() == 0) {
                    return true;
                }
                this.zzD = false;
            }
            zzhp zzhpVar2 = this.zzg;
            long jZzb = zzhpVar2.zzd;
            zzrk zzrkVar = this.zzM;
            if (zzrkVar != null) {
                jZzb = zzrkVar.zzb(this.zzn, zzhpVar2);
                this.zzad = Math.max(this.zzad, this.zzM.zza(this.zzn));
            }
            long j10 = jZzb;
            if (this.zzg.zzf()) {
                this.zzj.add(Long.valueOf(j10));
            }
            if (this.zzah) {
                (!this.zzl.isEmpty() ? (zzrv) this.zzl.peekLast() : this.zzai).zzd.zzd(j10, this.zzn);
                this.zzah = false;
            }
            this.zzad = Math.max(this.zzad, j10);
            this.zzg.zzk();
            zzhp zzhpVar3 = this.zzg;
            if (zzhpVar3.zze()) {
                zzaq(zzhpVar3);
            }
            zzah(this.zzg);
            try {
                if (zZzl) {
                    this.zzu.zzk(this.zzO, 0, this.zzg.zza, j10, 0);
                } else {
                    this.zzu.zzj(this.zzO, 0, this.zzg.zzb.limit(), j10, 0);
                }
                zzaE();
                this.zzaa = true;
                this.zzX = 0;
                zzhz zzhzVar = this.zza;
                z10 = zzhzVar.zzc + 1;
                zzhzVar.zzc = z10;
                return true;
            } catch (MediaCodec.CryptoException e11) {
                throw zzbe(e11, this.zzn, z10, zzfj.zzh(e11.getErrorCode()));
            }
        } catch (zzho e12) {
            zzaa(e12);
            zzaL(0);
            zzae();
            return true;
        }
    }

    private final boolean zzaK() {
        return this.zzP >= 0;
    }

    private final boolean zzaL(int i10) throws zzih {
        zzkj zzkjVarZzh = zzh();
        this.zzf.zzb();
        int iZzbd = zzbd(zzkjVarZzh, this.zzf, i10 | 4);
        if (iZzbd == -5) {
            zzV(zzkjVarZzh);
            return true;
        }
        if (iZzbd != -4 || !this.zzf.zzg()) {
            return false;
        }
        this.zzaf = true;
        zzaD();
        return false;
    }

    private final boolean zzaM(long j10) {
        return this.zzr == -9223372036854775807L || SystemClock.elapsedRealtime() - j10 < this.zzr;
    }

    private final boolean zzaN(zzam zzamVar) throws zzih {
        if (zzfj.zza >= 23 && this.zzu != null && this.zzZ != 3 && zzbc() != 0) {
            float fZzS = zzS(this.zzt, zzamVar, zzM());
            float f10 = this.zzy;
            if (f10 == fZzS) {
                return true;
            }
            if (fZzS == -1.0f) {
                zzX();
                return false;
            }
            if (f10 == -1.0f && fZzS <= this.zze) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fZzS);
            this.zzu.zzp(bundle);
            this.zzy = fZzS;
        }
        return true;
    }

    private final void zzae() {
        try {
            this.zzu.zzi();
        } finally {
            zzau();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhy, com.google.android.gms.internal.ads.zzli
    public void zzG(float f10, float f11) throws zzih {
        this.zzs = f10;
        this.zzt = f11;
        zzaN(this.zzv);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 9681. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // com.google.android.gms.internal.ads.zzli
    public final void zzO(long r24, long r26) throws com.google.android.gms.internal.ads.zzih {
        /*
            Method dump skipped, instruction units count: 968
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrw.zzO(long, long):void");
    }

    @Override // com.google.android.gms.internal.ads.zzli
    public boolean zzP() {
        return this.zzag;
    }

    @Override // com.google.android.gms.internal.ads.zzli
    public boolean zzQ() {
        if (this.zzn != null) {
            if (zzL() || zzaK()) {
                return true;
            }
            if (this.zzN != -9223372036854775807L && SystemClock.elapsedRealtime() < this.zzN) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzlk
    public final int zzR(zzam zzamVar) throws zzih {
        try {
            return zzT(this.zzd, zzamVar);
        } catch (zzsf e10) {
            throw zzbe(e10, zzamVar, false, 4002);
        }
    }

    public float zzS(float f10, zzam zzamVar, zzam[] zzamVarArr) {
        throw null;
    }

    public abstract int zzT(zzry zzryVar, zzam zzamVar) throws zzsf;

    public zzia zzU(zzrs zzrsVar, zzam zzamVar, zzam zzamVar2) {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    public zzia zzV(zzkj zzkjVar) throws zzih {
        boolean z10 = true;
        this.zzah = true;
        zzam zzamVar = zzkjVar.zza;
        Objects.requireNonNull(zzamVar);
        if (zzamVar.zzm == null) {
            throw zzbe(new IllegalArgumentException(), zzamVar, false, 4005);
        }
        zzqv zzqvVar = zzkjVar.zzb;
        this.zzam = zzqvVar;
        this.zzn = zzamVar;
        if (this.zzT) {
            this.zzV = true;
            return null;
        }
        zzrp zzrpVar = this.zzu;
        if (zzrpVar == null) {
            this.zzz = null;
            zzar();
            return null;
        }
        zzrs zzrsVar = this.zzB;
        zzam zzamVar2 = this.zzv;
        zzqv zzqvVar2 = this.zzal;
        if (zzqvVar2 != zzqvVar) {
            zzX();
            return new zzia(zzrsVar.zza, zzamVar2, zzamVar, 0, 128);
        }
        boolean z11 = zzqvVar != zzqvVar2;
        zzdy.zzf(!z11 || zzfj.zza >= 23);
        zzia zziaVarZzU = zzU(zzrsVar, zzamVar2, zzamVar);
        int i10 = zziaVarZzU.zzd;
        int i11 = 2;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (zzaN(zzamVar)) {
                        this.zzv = zzamVar;
                        if (!z11 || zzaI()) {
                        }
                    } else {
                        i11 = 16;
                    }
                } else if (zzaN(zzamVar)) {
                    this.zzW = true;
                    this.zzX = 1;
                    int i12 = this.zzC;
                    if (i12 != 2 && (i12 != 1 || zzamVar.zzr != zzamVar2.zzr || zzamVar.zzs != zzamVar2.zzs)) {
                        z10 = false;
                    }
                    this.zzJ = z10;
                    this.zzv = zzamVar;
                    if (!z11 || zzaI()) {
                    }
                } else {
                    i11 = 16;
                }
            } else if (zzaN(zzamVar)) {
                this.zzv = zzamVar;
                if (z11) {
                    if (zzaI()) {
                    }
                } else if (this.zzaa) {
                    this.zzY = 1;
                    if (this.zzE || this.zzG) {
                        this.zzZ = 3;
                    } else {
                        this.zzZ = 1;
                    }
                }
            } else {
                i11 = 16;
            }
            return (zziaVarZzU.zzd != 0 || (this.zzu == zzrpVar && this.zzZ != 3)) ? zziaVarZzU : new zzia(zzrsVar.zza, zzamVar2, zzamVar, 0, i11);
        }
        zzX();
        i11 = 0;
        if (zziaVarZzU.zzd != 0) {
        }
    }

    public abstract zzrn zzY(zzrs zzrsVar, zzam zzamVar, MediaCrypto mediaCrypto, float f10);

    public abstract List zzZ(zzry zzryVar, zzam zzamVar, boolean z10) throws zzsf;

    public boolean zzaA(zzrs zzrsVar) {
        return true;
    }

    public void zzaa(Exception exc) {
        throw null;
    }

    public void zzab(String str, zzrn zzrnVar, long j10, long j11) {
        throw null;
    }

    public void zzac(String str) {
        throw null;
    }

    public void zzad(zzam zzamVar, MediaFormat mediaFormat) throws zzih {
        throw null;
    }

    public void zzaf(long j10) {
        this.zzaj = j10;
        while (!this.zzl.isEmpty() && j10 >= ((zzrv) this.zzl.peek()).zzb) {
            zzaG((zzrv) this.zzl.poll());
            zzag();
        }
    }

    public void zzag() {
    }

    public void zzah(zzhp zzhpVar) throws zzih {
        throw null;
    }

    public void zzai() throws zzih {
    }

    public abstract boolean zzaj(long j10, long j11, zzrp zzrpVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, zzam zzamVar) throws zzih;

    public boolean zzak(zzam zzamVar) {
        return false;
    }

    public final float zzal() {
        return this.zzs;
    }

    public final long zzam() {
        return this.zzai.zzc;
    }

    public final zzrp zzan() {
        return this.zzu;
    }

    public zzrq zzao(Throwable th, zzrs zzrsVar) {
        return new zzrq(th, zzrsVar);
    }

    public final zzrs zzap() {
        return this.zzB;
    }

    public void zzaq(zzhp zzhpVar) throws zzih {
    }

    public final void zzar() throws zzih {
        zzam zzamVar;
        if (this.zzu != null || this.zzT || (zzamVar = this.zzn) == null) {
            return;
        }
        if (zzaz(zzamVar)) {
            zzam zzamVar2 = this.zzn;
            zzW();
            String str = zzamVar2.zzm;
            if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                this.zzi.zzo(32);
            } else {
                this.zzi.zzo(1);
            }
            this.zzT = true;
            return;
        }
        zzqv zzqvVar = this.zzam;
        this.zzal = zzqvVar;
        zzam zzamVar3 = this.zzn;
        String str2 = zzamVar3.zzm;
        if (zzqvVar != null) {
            boolean z10 = zzqw.zza;
        }
        try {
            if (this.zzz == null) {
                try {
                    List listZzZ = zzZ(this.zzd, zzamVar3, false);
                    listZzZ.isEmpty();
                    this.zzz = new ArrayDeque();
                    if (!listZzZ.isEmpty()) {
                        this.zzz.add((zzrs) listZzZ.get(0));
                    }
                    this.zzA = null;
                } catch (zzsf e10) {
                    throw new zzru(this.zzn, (Throwable) e10, false, -49998);
                }
            }
            if (this.zzz.isEmpty()) {
                throw new zzru(this.zzn, (Throwable) null, false, -49999);
            }
            zzrs zzrsVar = (zzrs) this.zzz.peekFirst();
            while (this.zzu == null) {
                zzrs zzrsVar2 = (zzrs) this.zzz.peekFirst();
                if (!zzaA(zzrsVar2)) {
                    return;
                }
                try {
                    zzaC(zzrsVar2, null);
                } catch (Exception e11) {
                    if (zzrsVar2 != zzrsVar) {
                        throw e11;
                    }
                    try {
                        zzer.zzf("MediaCodecRenderer", "Preferred decoder instantiation failed. Sleeping for 50ms then retrying.");
                        Thread.sleep(50L);
                        zzaC(zzrsVar2, null);
                    } catch (Exception e12) {
                        zzer.zzg("MediaCodecRenderer", "Failed to initialize decoder: ".concat(String.valueOf(zzrsVar2)), e12);
                        this.zzz.removeFirst();
                        zzru zzruVar = new zzru(this.zzn, (Throwable) e12, false, zzrsVar2);
                        zzaa(zzruVar);
                        zzru zzruVar2 = this.zzA;
                        if (zzruVar2 == null) {
                            this.zzA = zzruVar;
                        } else {
                            this.zzA = zzru.zza(zzruVar2, zzruVar);
                        }
                        if (this.zzz.isEmpty()) {
                            throw this.zzA;
                        }
                    }
                }
            }
            this.zzz = null;
        } catch (zzru e13) {
            throw zzbe(e13, this.zzn, false, 4001);
        }
    }

    public void zzas(zzam zzamVar) throws zzih {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzat() {
        try {
            zzrp zzrpVar = this.zzu;
            if (zzrpVar != null) {
                zzrpVar.zzl();
                this.zza.zzb++;
                zzac(this.zzB.zza);
            }
        } finally {
            this.zzu = null;
            this.zzp = null;
            this.zzal = null;
            zzav();
        }
    }

    public void zzau() {
        zzaE();
        zzaF();
        this.zzN = -9223372036854775807L;
        this.zzab = false;
        this.zzaa = false;
        this.zzJ = false;
        this.zzK = false;
        this.zzR = false;
        this.zzS = false;
        this.zzj.clear();
        this.zzad = -9223372036854775807L;
        this.zzae = -9223372036854775807L;
        this.zzaj = -9223372036854775807L;
        zzrk zzrkVar = this.zzM;
        if (zzrkVar != null) {
            zzrkVar.zzc();
        }
        this.zzY = 0;
        this.zzZ = 0;
        this.zzX = this.zzW ? 1 : 0;
    }

    public final void zzav() {
        zzau();
        this.zzM = null;
        this.zzz = null;
        this.zzB = null;
        this.zzv = null;
        this.zzw = null;
        this.zzx = false;
        this.zzac = false;
        this.zzy = -1.0f;
        this.zzC = 0;
        this.zzD = false;
        this.zzE = false;
        this.zzF = false;
        this.zzG = false;
        this.zzH = false;
        this.zzI = false;
        this.zzL = false;
        this.zzW = false;
        this.zzX = 0;
        this.zzq = false;
    }

    public final boolean zzaw() throws zzih {
        boolean zZzax = zzax();
        if (zZzax) {
            zzar();
        }
        return zZzax;
    }

    public final boolean zzax() {
        if (this.zzu == null) {
            return false;
        }
        int i10 = this.zzZ;
        if (i10 == 3 || this.zzE || ((this.zzF && !this.zzac) || (this.zzG && this.zzab))) {
            zzat();
            return true;
        }
        if (i10 == 2) {
            int i11 = zzfj.zza;
            zzdy.zzf(i11 >= 23);
            if (i11 >= 23) {
                try {
                    zzaH();
                } catch (zzih e10) {
                    zzer.zzg("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e10);
                    zzat();
                    return true;
                }
            }
        }
        zzae();
        return false;
    }

    public final boolean zzay() {
        return this.zzT;
    }

    public final boolean zzaz(zzam zzamVar) {
        return this.zzam == null && zzak(zzamVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhy, com.google.android.gms.internal.ads.zzlk
    public final int zze() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzhy
    public void zzt() {
        this.zzn = null;
        zzaG(zzrv.zza);
        this.zzl.clear();
        zzax();
    }

    @Override // com.google.android.gms.internal.ads.zzhy
    public void zzu(boolean z10, boolean z11) throws zzih {
        this.zza = new zzhz();
    }

    @Override // com.google.android.gms.internal.ads.zzhy
    public void zzv(long j10, boolean z10) throws zzih {
        this.zzaf = false;
        this.zzag = false;
        if (this.zzT) {
            this.zzi.zzb();
            this.zzh.zzb();
            this.zzU = false;
        } else {
            zzaw();
        }
        zzfg zzfgVar = this.zzai.zzd;
        if (zzfgVar.zza() > 0) {
            this.zzah = true;
        }
        zzfgVar.zze();
        this.zzl.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzhy
    public void zzw() {
        try {
            zzW();
            zzat();
        } finally {
            this.zzam = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r5 >= r1) goto L14;
     */
    @Override // com.google.android.gms.internal.ads.zzhy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzz(com.google.android.gms.internal.ads.zzam[] r13, long r14, long r16) throws com.google.android.gms.internal.ads.zzih {
        /*
            r12 = this;
            r0 = r12
            com.google.android.gms.internal.ads.zzrv r1 = r0.zzai
            long r1 = r1.zzc
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L20
            com.google.android.gms.internal.ads.zzrv r1 = new com.google.android.gms.internal.ads.zzrv
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.zzaG(r1)
            return
        L20:
            java.util.ArrayDeque r1 = r0.zzl
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L55
            long r1 = r0.zzad
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L38
            long r5 = r0.zzaj
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L55
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 < 0) goto L55
        L38:
            com.google.android.gms.internal.ads.zzrv r1 = new com.google.android.gms.internal.ads.zzrv
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.zzaG(r1)
            com.google.android.gms.internal.ads.zzrv r1 = r0.zzai
            long r1 = r1.zzc
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L54
            r12.zzag()
        L54:
            return
        L55:
            java.util.ArrayDeque r1 = r0.zzl
            com.google.android.gms.internal.ads.zzrv r9 = new com.google.android.gms.internal.ads.zzrv
            long r3 = r0.zzad
            r2 = r9
            r5 = r14
            r7 = r16
            r2.<init>(r3, r5, r7)
            r1.add(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrw.zzz(com.google.android.gms.internal.ads.zzam[], long, long):void");
    }
}
