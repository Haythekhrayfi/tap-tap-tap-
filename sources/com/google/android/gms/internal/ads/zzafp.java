package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.SparseArray;
import ch.qos.logback.core.net.SyslogConstants;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.e.e.g;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class zzafp implements zzaaw {
    public static final zzabd zza = new zzabd() { // from class: com.google.android.gms.internal.ads.zzafl
        @Override // com.google.android.gms.internal.ads.zzabd
        public final /* synthetic */ zzaaw[] zza(Uri uri, Map map) {
            int i10 = zzabc.zza;
            zzabd zzabdVar = zzafp.zza;
            return new zzaaw[]{new zzafp(0)};
        }
    };
    private static final byte[] zzb = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] zzc;
    private static final byte[] zzd;
    private static final byte[] zze;
    private static final UUID zzf;
    private static final Map zzg;
    private long zzA;
    private zzafo zzB;
    private boolean zzC;
    private int zzD;
    private long zzE;
    private boolean zzF;
    private long zzG;
    private long zzH;
    private long zzI;
    private zzes zzJ;
    private zzes zzK;
    private boolean zzL;
    private boolean zzM;
    private int zzN;
    private long zzO;
    private long zzP;
    private int zzQ;
    private int zzR;
    private int[] zzS;
    private int zzT;
    private int zzU;
    private int zzV;
    private int zzW;
    private boolean zzX;
    private long zzY;
    private int zzZ;
    private int zzaa;
    private int zzab;
    private boolean zzac;
    private boolean zzad;
    private boolean zzae;
    private int zzaf;
    private byte zzag;
    private boolean zzah;
    private zzaaz zzai;
    private final zzafk zzh;
    private final zzafr zzi;
    private final SparseArray zzj;
    private final boolean zzk;
    private final zzfa zzl;
    private final zzfa zzm;
    private final zzfa zzn;
    private final zzfa zzo;
    private final zzfa zzp;
    private final zzfa zzq;
    private final zzfa zzr;
    private final zzfa zzs;
    private final zzfa zzt;
    private final zzfa zzu;
    private ByteBuffer zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    static {
        int i10 = zzfj.zza;
        zzc = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(zzfot.zzc);
        zzd = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        zze = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        zzf = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        g.a(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090", BaseTransientBottomBar.ANIMATION_FADE_DURATION, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        zzg = Collections.unmodifiableMap(map);
    }

    public zzafp() {
        this(0);
    }

    public zzafp(int i10) {
        zzafi zzafiVar = new zzafi();
        this.zzx = -1L;
        this.zzy = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
        this.zzA = -9223372036854775807L;
        this.zzG = -1L;
        this.zzH = -1L;
        this.zzI = -9223372036854775807L;
        this.zzh = zzafiVar;
        zzafiVar.zza(new zzafn(this, null));
        this.zzk = true;
        this.zzi = new zzafr();
        this.zzj = new SparseArray();
        this.zzn = new zzfa(4);
        this.zzo = new zzfa(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzp = new zzfa(4);
        this.zzl = new zzfa(zzfu.zza);
        this.zzm = new zzfa(4);
        this.zzq = new zzfa();
        this.zzr = new zzfa();
        this.zzs = new zzfa(8);
        this.zzt = new zzfa();
        this.zzu = new zzfa();
        this.zzS = new int[1];
    }

    @RequiresNonNull({"#2.output"})
    private final int zzn(zzaax zzaaxVar, zzafo zzafoVar, int i10, boolean z10) throws IOException {
        int i11;
        if ("S_TEXT/UTF8".equals(zzafoVar.zzb)) {
            zzv(zzaaxVar, zzb, i10);
        } else if ("S_TEXT/ASS".equals(zzafoVar.zzb)) {
            zzv(zzaaxVar, zzd, i10);
        } else if ("S_TEXT/WEBVTT".equals(zzafoVar.zzb)) {
            zzv(zzaaxVar, zze, i10);
        } else {
            zzabz zzabzVar = zzafoVar.zzV;
            if (!this.zzac) {
                if (zzafoVar.zzg) {
                    this.zzV &= -1073741825;
                    if (!this.zzad) {
                        ((zzaam) zzaaxVar).zzn(this.zzn.zzH(), 0, 1, false);
                        this.zzZ++;
                        if ((this.zzn.zzH()[0] & 128) == 128) {
                            throw zzcd.zza("Extension bit is set in signal byte", null);
                        }
                        this.zzag = this.zzn.zzH()[0];
                        this.zzad = true;
                    }
                    byte b10 = this.zzag;
                    if ((b10 & 1) == 1) {
                        int i12 = b10 & 2;
                        this.zzV |= 1073741824;
                        if (!this.zzah) {
                            ((zzaam) zzaaxVar).zzn(this.zzs.zzH(), 0, 8, false);
                            this.zzZ += 8;
                            this.zzah = true;
                            this.zzn.zzH()[0] = (byte) ((i12 != 2 ? 0 : 128) | 8);
                            this.zzn.zzF(0);
                            zzabzVar.zzr(this.zzn, 1, 1);
                            this.zzaa++;
                            this.zzs.zzF(0);
                            zzabzVar.zzr(this.zzs, 8, 1);
                            this.zzaa += 8;
                        }
                        if (i12 == 2) {
                            if (!this.zzae) {
                                ((zzaam) zzaaxVar).zzn(this.zzn.zzH(), 0, 1, false);
                                this.zzZ++;
                                this.zzn.zzF(0);
                                this.zzaf = this.zzn.zzk();
                                this.zzae = true;
                            }
                            int i13 = this.zzaf * 4;
                            this.zzn.zzC(i13);
                            ((zzaam) zzaaxVar).zzn(this.zzn.zzH(), 0, i13, false);
                            this.zzZ += i13;
                            int i14 = (this.zzaf >> 1) + 1;
                            int i15 = (i14 * 6) + 2;
                            ByteBuffer byteBuffer = this.zzv;
                            if (byteBuffer == null || byteBuffer.capacity() < i15) {
                                this.zzv = ByteBuffer.allocate(i15);
                            }
                            this.zzv.position(0);
                            this.zzv.putShort((short) i14);
                            int i16 = 0;
                            int i17 = 0;
                            while (true) {
                                i11 = this.zzaf;
                                if (i16 >= i11) {
                                    break;
                                }
                                int iZzn = this.zzn.zzn();
                                if (i16 % 2 == 0) {
                                    this.zzv.putShort((short) (iZzn - i17));
                                } else {
                                    this.zzv.putInt(iZzn - i17);
                                }
                                i16++;
                                i17 = iZzn;
                            }
                            int i18 = (i10 - this.zzZ) - i17;
                            if ((i11 & 1) == 1) {
                                this.zzv.putInt(i18);
                            } else {
                                this.zzv.putShort((short) i18);
                                this.zzv.putInt(0);
                            }
                            this.zzt.zzD(this.zzv.array(), i15);
                            zzabzVar.zzr(this.zzt, i15, 1);
                            this.zzaa += i15;
                        }
                    }
                } else {
                    byte[] bArr = zzafoVar.zzh;
                    if (bArr != null) {
                        this.zzq.zzD(bArr, bArr.length);
                    }
                }
                if (!"A_OPUS".equals(zzafoVar.zzb) ? zzafoVar.zzf > 0 : z10) {
                    this.zzV |= 268435456;
                    this.zzu.zzC(0);
                    int iZzd = (this.zzq.zzd() + i10) - this.zzZ;
                    this.zzn.zzC(4);
                    this.zzn.zzH()[0] = (byte) ((iZzd >> 24) & 255);
                    this.zzn.zzH()[1] = (byte) ((iZzd >> 16) & 255);
                    this.zzn.zzH()[2] = (byte) ((iZzd >> 8) & 255);
                    this.zzn.zzH()[3] = (byte) (iZzd & 255);
                    zzabzVar.zzr(this.zzn, 4, 2);
                    this.zzaa += 4;
                }
                this.zzac = true;
            }
            int iZzd2 = this.zzq.zzd() + i10;
            if (!"V_MPEG4/ISO/AVC".equals(zzafoVar.zzb) && !"V_MPEGH/ISO/HEVC".equals(zzafoVar.zzb)) {
                if (zzafoVar.zzS != null) {
                    zzdy.zzf(this.zzq.zzd() == 0);
                    zzafoVar.zzS.zzd(zzaaxVar);
                }
                while (true) {
                    int i19 = this.zzZ;
                    if (i19 >= iZzd2) {
                        break;
                    }
                    int iZzo = zzo(zzaaxVar, zzabzVar, iZzd2 - i19);
                    this.zzZ += iZzo;
                    this.zzaa += iZzo;
                }
            } else {
                byte[] bArrZzH = this.zzm.zzH();
                bArrZzH[0] = 0;
                bArrZzH[1] = 0;
                bArrZzH[2] = 0;
                int i20 = zzafoVar.zzW;
                int i21 = 4 - i20;
                while (this.zzZ < iZzd2) {
                    int i22 = this.zzab;
                    if (i22 == 0) {
                        int iMin = Math.min(i20, this.zzq.zza());
                        ((zzaam) zzaaxVar).zzn(bArrZzH, i21 + iMin, i20 - iMin, false);
                        if (iMin > 0) {
                            this.zzq.zzB(bArrZzH, i21, iMin);
                        }
                        this.zzZ += i20;
                        this.zzm.zzF(0);
                        this.zzab = this.zzm.zzn();
                        this.zzl.zzF(0);
                        zzabx.zzb(zzabzVar, this.zzl, 4);
                        this.zzaa += 4;
                    } else {
                        int iZzo2 = zzo(zzaaxVar, zzabzVar, i22);
                        this.zzZ += iZzo2;
                        this.zzaa += iZzo2;
                        this.zzab -= iZzo2;
                    }
                }
            }
            if ("A_VORBIS".equals(zzafoVar.zzb)) {
                this.zzo.zzF(0);
                zzabx.zzb(zzabzVar, this.zzo, 4);
                this.zzaa += 4;
            }
        }
        int i23 = this.zzaa;
        zzu();
        return i23;
    }

    private final int zzo(zzaax zzaaxVar, zzabz zzabzVar, int i10) throws IOException {
        int iZza = this.zzq.zza();
        if (iZza <= 0) {
            return zzabx.zza(zzabzVar, zzaaxVar, i10, false);
        }
        int iMin = Math.min(i10, iZza);
        zzabx.zzb(zzabzVar, this.zzq, iMin);
        return iMin;
    }

    private final long zzp(long j10) throws zzcd {
        long j11 = this.zzy;
        if (j11 != -9223372036854775807L) {
            return zzfj.zzp(j10, j11, 1000L);
        }
        throw zzcd.zza("Can't scale timecode prior to timecodeScale being set.", null);
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    private final void zzq(int i10) throws zzcd {
        if (this.zzJ == null || this.zzK == null) {
            throw zzcd.zza("Element " + i10 + " must be in a Cues", null);
        }
    }

    @EnsuresNonNull({"currentTrack"})
    private final void zzr(int i10) throws zzcd {
        if (this.zzB != null) {
            return;
        }
        throw zzcd.zza("Element " + i10 + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008e  */
    @RequiresNonNull({"#1.output"})
    private final void zzs(zzafo zzafoVar, long j10, int i10, int i11, int i12) {
        byte b10;
        int i13;
        String str;
        int iZzd;
        String str2;
        zzaca zzacaVar = zzafoVar.zzS;
        if (zzacaVar != null) {
            zzacaVar.zzc(zzafoVar.zzV, j10, i10, i11, i12, zzafoVar.zzi);
        } else {
            if ("S_TEXT/UTF8".equals(zzafoVar.zzb) || "S_TEXT/ASS".equals(zzafoVar.zzb) || "S_TEXT/WEBVTT".equals(zzafoVar.zzb)) {
                if (this.zzR > 1) {
                    str2 = "Skipping subtitle sample in laced block.";
                } else {
                    long j11 = this.zzP;
                    if (j11 == -9223372036854775807L) {
                        str2 = "Skipping subtitle sample with no duration.";
                    } else {
                        String str3 = zzafoVar.zzb;
                        byte[] bArrZzH = this.zzr.zzH();
                        int iHashCode = str3.hashCode();
                        if (iHashCode != 738597099) {
                            if (iHashCode != 1045209816) {
                                if (iHashCode == 1422270023 && str3.equals("S_TEXT/UTF8")) {
                                    b10 = 0;
                                } else {
                                    b10 = -1;
                                }
                            } else if (str3.equals("S_TEXT/WEBVTT")) {
                                b10 = 2;
                            } else {
                                b10 = -1;
                            }
                        } else if (str3.equals("S_TEXT/ASS")) {
                            b10 = 1;
                        } else {
                            b10 = -1;
                        }
                        long j12 = 1000;
                        if (b10 == 0) {
                            i13 = 19;
                            str = "%02d:%02d:%02d,%03d";
                        } else if (b10 == 1) {
                            i13 = 21;
                            j12 = AbstractComponentTracker.LINGERING_TIMEOUT;
                            str = "%01d:%02d:%02d:%02d";
                        } else {
                            if (b10 != 2) {
                                throw new IllegalArgumentException();
                            }
                            i13 = 25;
                            str = "%02d:%02d:%02d.%03d";
                        }
                        byte[] bArrZzw = zzw(j11, str, j12);
                        System.arraycopy(bArrZzw, 0, bArrZzH, i13, bArrZzw.length);
                        for (int iZzc = this.zzr.zzc(); iZzc < this.zzr.zzd(); iZzc++) {
                            if (this.zzr.zzH()[iZzc] == 0) {
                                this.zzr.zzE(iZzc);
                                break;
                            }
                        }
                        zzabz zzabzVar = zzafoVar.zzV;
                        zzfa zzfaVar = this.zzr;
                        zzabx.zzb(zzabzVar, zzfaVar, zzfaVar.zzd());
                        iZzd = this.zzr.zzd() + i11;
                    }
                }
                zzer.zzf("MatroskaExtractor", str2);
                iZzd = i11;
            } else {
                iZzd = i11;
            }
            if ((i10 & 268435456) != 0) {
                if (this.zzR > 1) {
                    this.zzu.zzC(0);
                } else {
                    int iZzd2 = this.zzu.zzd();
                    zzafoVar.zzV.zzr(this.zzu, iZzd2, 2);
                    iZzd += iZzd2;
                }
            }
            zzafoVar.zzV.zzs(j10, i10, iZzd, i12, zzafoVar.zzi);
        }
        this.zzM = true;
    }

    private final void zzt(zzaax zzaaxVar, int i10) throws IOException {
        if (this.zzn.zzd() >= i10) {
            return;
        }
        if (this.zzn.zzb() < i10) {
            zzfa zzfaVar = this.zzn;
            int iZzb = zzfaVar.zzb();
            zzfaVar.zzz(Math.max(iZzb + iZzb, i10));
        }
        ((zzaam) zzaaxVar).zzn(this.zzn.zzH(), this.zzn.zzd(), i10 - this.zzn.zzd(), false);
        this.zzn.zzE(i10);
    }

    private final void zzu() {
        this.zzZ = 0;
        this.zzaa = 0;
        this.zzab = 0;
        this.zzac = false;
        this.zzad = false;
        this.zzae = false;
        this.zzaf = 0;
        this.zzag = (byte) 0;
        this.zzah = false;
        this.zzq.zzC(0);
    }

    private final void zzv(zzaax zzaaxVar, byte[] bArr, int i10) throws IOException {
        int length = bArr.length;
        int i11 = length + i10;
        if (this.zzr.zzb() < i11) {
            zzfa zzfaVar = this.zzr;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i11 + i10);
            zzfaVar.zzD(bArrCopyOf, bArrCopyOf.length);
        } else {
            System.arraycopy(bArr, 0, this.zzr.zzH(), 0, length);
        }
        ((zzaam) zzaaxVar).zzn(this.zzr.zzH(), length, i10, false);
        this.zzr.zzF(0);
        this.zzr.zzE(i11);
    }

    private static byte[] zzw(long j10, String str, long j11) {
        zzdy.zzd(j10 != -9223372036854775807L);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - (((long) i10) * 3600000000L);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - (((long) i11) * 60000000);
        int i12 = (int) (j13 / 1000000);
        String str2 = String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (((long) i12) * 1000000)) / j11)));
        int i13 = zzfj.zza;
        return str2.getBytes(zzfot.zzc);
    }

    private static int[] zzx(int[] iArr, int i10) {
        if (iArr == null) {
            return new int[i10];
        }
        int length = iArr.length;
        return length >= i10 ? iArr : new int[Math.max(length + length, i10)];
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final int zza(zzaax zzaaxVar, zzabs zzabsVar) throws IOException {
        this.zzM = false;
        while (!this.zzM) {
            if (!this.zzh.zzc(zzaaxVar)) {
                for (int i10 = 0; i10 < this.zzj.size(); i10++) {
                    zzafo zzafoVar = (zzafo) this.zzj.valueAt(i10);
                    Objects.requireNonNull(zzafoVar.zzV);
                    zzaca zzacaVar = zzafoVar.zzS;
                    if (zzacaVar != null) {
                        zzacaVar.zza(zzafoVar.zzV, zzafoVar.zzi);
                    }
                }
                return -1;
            }
            long jZzf = zzaaxVar.zzf();
            if (this.zzF) {
                this.zzH = jZzf;
                zzabsVar.zza = this.zzG;
                this.zzF = false;
                return 1;
            }
            if (this.zzC) {
                long j10 = this.zzH;
                if (j10 != -1) {
                    zzabsVar.zza = j10;
                    this.zzH = -1L;
                    return 1;
                }
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final void zzb(zzaaz zzaazVar) {
        this.zzai = zzaazVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final void zzc(long j10, long j11) {
        this.zzI = -9223372036854775807L;
        this.zzN = 0;
        this.zzh.zzb();
        this.zzi.zze();
        zzu();
        for (int i10 = 0; i10 < this.zzj.size(); i10++) {
            zzaca zzacaVar = ((zzafo) this.zzj.valueAt(i10)).zzS;
            if (zzacaVar != null) {
                zzacaVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final boolean zzd(zzaax zzaaxVar) throws IOException {
        return new zzafq().zza(zzaaxVar);
    }

    public final void zzg(int i10, int i11, zzaax zzaaxVar) throws IOException {
        int i12;
        long j10;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = i10;
        int i18 = 1;
        int i19 = 0;
        if (i17 != 161 && i17 != 163) {
            if (i17 == 165) {
                if (this.zzN != 2) {
                    return;
                }
                zzafo zzafoVar = (zzafo) this.zzj.get(this.zzT);
                if (this.zzW != 4 || !"V_VP9".equals(zzafoVar.zzb)) {
                    ((zzaam) zzaaxVar).zzo(i11, false);
                    return;
                }
                this.zzu.zzC(i11);
                ((zzaam) zzaaxVar).zzn(this.zzu.zzH(), 0, i11, false);
                return;
            }
            if (i17 == 16877) {
                zzr(i10);
                zzafo zzafoVar2 = this.zzB;
                if (zzafoVar2.zzX != 1685485123 && zzafoVar2.zzX != 1685480259) {
                    ((zzaam) zzaaxVar).zzo(i11, false);
                    return;
                }
                byte[] bArr = new byte[i11];
                zzafoVar2.zzM = bArr;
                ((zzaam) zzaaxVar).zzn(bArr, 0, i11, false);
                return;
            }
            if (i17 == 16981) {
                zzr(i10);
                byte[] bArr2 = new byte[i11];
                this.zzB.zzh = bArr2;
                ((zzaam) zzaaxVar).zzn(bArr2, 0, i11, false);
                return;
            }
            if (i17 == 18402) {
                byte[] bArr3 = new byte[i11];
                ((zzaam) zzaaxVar).zzn(bArr3, 0, i11, false);
                zzr(i10);
                this.zzB.zzi = new zzaby(1, bArr3, 0, 0);
                return;
            }
            if (i17 == 21419) {
                Arrays.fill(this.zzp.zzH(), (byte) 0);
                ((zzaam) zzaaxVar).zzn(this.zzp.zzH(), 4 - i11, i11, false);
                this.zzp.zzF(0);
                this.zzD = (int) this.zzp.zzs();
                return;
            }
            if (i17 == 25506) {
                zzr(i10);
                byte[] bArr4 = new byte[i11];
                this.zzB.zzj = bArr4;
                ((zzaam) zzaaxVar).zzn(bArr4, 0, i11, false);
                return;
            }
            if (i17 != 30322) {
                throw zzcd.zza("Unexpected id: " + i17, null);
            }
            zzr(i10);
            byte[] bArr5 = new byte[i11];
            this.zzB.zzu = bArr5;
            ((zzaam) zzaaxVar).zzn(bArr5, 0, i11, false);
            return;
        }
        int i20 = 8;
        if (this.zzN == 0) {
            this.zzT = (int) this.zzi.zzd(zzaaxVar, false, true, 8);
            this.zzU = this.zzi.zza();
            this.zzP = -9223372036854775807L;
            this.zzN = 1;
            this.zzn.zzC(0);
        }
        zzafo zzafoVar3 = (zzafo) this.zzj.get(this.zzT);
        if (zzafoVar3 == null) {
            ((zzaam) zzaaxVar).zzo(i11 - this.zzU, false);
            this.zzN = 0;
            return;
        }
        Objects.requireNonNull(zzafoVar3.zzV);
        if (this.zzN == 1) {
            zzt(zzaaxVar, 3);
            int i21 = (this.zzn.zzH()[2] & 6) >> 1;
            if (i21 == 0) {
                this.zzR = 1;
                int[] iArrZzx = zzx(this.zzS, 1);
                this.zzS = iArrZzx;
                iArrZzx[0] = (i11 - this.zzU) - 3;
            } else {
                zzt(zzaaxVar, 4);
                int i22 = (this.zzn.zzH()[3] & 255) + 1;
                this.zzR = i22;
                int[] iArrZzx2 = zzx(this.zzS, i22);
                this.zzS = iArrZzx2;
                if (i21 == 2) {
                    int i23 = (i11 - this.zzU) - 4;
                    int i24 = this.zzR;
                    Arrays.fill(iArrZzx2, 0, i24, i23 / i24);
                } else if (i21 == 1) {
                    int i25 = 0;
                    int i26 = 0;
                    int i27 = 4;
                    while (true) {
                        i13 = this.zzR - 1;
                        if (i25 >= i13) {
                            break;
                        }
                        this.zzS[i25] = 0;
                        do {
                            i27++;
                            zzt(zzaaxVar, i27);
                            i14 = this.zzn.zzH()[i27 - 1] & 255;
                            int[] iArr = this.zzS;
                            i15 = iArr[i25] + i14;
                            iArr[i25] = i15;
                        } while (i14 == 255);
                        i26 += i15;
                        i25++;
                    }
                    this.zzS[i13] = ((i11 - this.zzU) - i27) - i26;
                } else {
                    if (i21 != 3) {
                        throw zzcd.zza("Unexpected lacing value: 2", null);
                    }
                    int i28 = 0;
                    int i29 = 0;
                    int i30 = 4;
                    while (true) {
                        int i31 = this.zzR - 1;
                        if (i28 >= i31) {
                            this.zzS[i31] = ((i11 - this.zzU) - i30) - i29;
                            break;
                        }
                        this.zzS[i28] = i19;
                        i30++;
                        zzt(zzaaxVar, i30);
                        int i32 = i30 - 1;
                        if (this.zzn.zzH()[i32] == 0) {
                            throw zzcd.zza("No valid varint length mask found", null);
                        }
                        int i33 = i19;
                        while (true) {
                            if (i33 >= i20) {
                                j10 = 0;
                                break;
                            }
                            int i34 = i18 << (7 - i33);
                            if ((this.zzn.zzH()[i32] & i34) != 0) {
                                i30 += i33;
                                zzt(zzaaxVar, i30);
                                j10 = (~i34) & this.zzn.zzH()[i32] & 255;
                                int i35 = i32 + 1;
                                while (i35 < i30) {
                                    j10 = (j10 << i20) | ((long) (this.zzn.zzH()[i35] & 255));
                                    i35++;
                                    i20 = 8;
                                }
                                if (i28 <= 0) {
                                    break;
                                }
                                j10 -= (1 << ((i33 * 7) + 6)) - 1;
                                break;
                            }
                            i33++;
                            i18 = 1;
                            i20 = 8;
                        }
                        if (j10 < -2147483648L || j10 > 2147483647L) {
                            throw zzcd.zza("EBML lacing sample size out of range.", null);
                        }
                        int[] iArr2 = this.zzS;
                        int i36 = (int) j10;
                        if (i28 != 0) {
                            i36 += iArr2[i28 - 1];
                        }
                        iArr2[i28] = i36;
                        i29 += i36;
                        i28++;
                        i18 = 1;
                        i19 = 0;
                        i20 = 8;
                    }
                }
            }
            this.zzO = this.zzI + zzp((this.zzn.zzH()[0] << 8) | (this.zzn.zzH()[1] & 255));
            if (zzafoVar3.zzd == 2) {
                i16 = 1;
            } else {
                if (i17 == 163) {
                    if ((this.zzn.zzH()[2] & 128) == 128) {
                        i17 = 163;
                        i16 = 1;
                    } else {
                        i17 = 163;
                    }
                }
                i16 = 0;
            }
            this.zzV = i16;
            this.zzN = 2;
            this.zzQ = 0;
            i12 = 163;
        } else {
            i12 = 163;
        }
        if (i17 == i12) {
            while (true) {
                int i37 = this.zzQ;
                if (i37 >= this.zzR) {
                    this.zzN = 0;
                    return;
                }
                zzs(zzafoVar3, ((long) ((this.zzQ * zzafoVar3.zze) / 1000)) + this.zzO, this.zzV, zzn(zzaaxVar, zzafoVar3, this.zzS[i37], false), 0);
                this.zzQ++;
            }
        } else {
            while (true) {
                int i38 = this.zzQ;
                if (i38 >= this.zzR) {
                    return;
                }
                int[] iArr3 = this.zzS;
                iArr3[i38] = zzn(zzaaxVar, zzafoVar3, iArr3[i38], true);
                this.zzQ++;
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void zzh(int i10) throws zzcd {
        int i11;
        int i12;
        zzabv zzabuVar;
        int i13;
        zzdy.zzb(this.zzai);
        byte b10 = 8;
        if (i10 == 160) {
            if (this.zzN != 2) {
                return;
            }
            zzafo zzafoVar = (zzafo) this.zzj.get(this.zzT);
            Objects.requireNonNull(zzafoVar.zzV);
            if (this.zzY > 0 && "A_OPUS".equals(zzafoVar.zzb)) {
                zzfa zzfaVar = this.zzu;
                byte[] bArrArray = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.zzY).array();
                zzfaVar.zzD(bArrArray, bArrArray.length);
            }
            int i14 = 0;
            for (int i15 = 0; i15 < this.zzR; i15++) {
                i14 += this.zzS[i15];
            }
            int i16 = 0;
            while (i16 < this.zzR) {
                long j10 = this.zzO + ((long) ((zzafoVar.zze * i16) / 1000));
                int i17 = this.zzV;
                if (i16 == 0) {
                    if (!this.zzX) {
                        i17 |= 1;
                    }
                    i12 = i17;
                    i11 = 0;
                } else {
                    i11 = i16;
                    i12 = i17;
                }
                int i18 = this.zzS[i11];
                int i19 = i14 - i18;
                zzs(zzafoVar, j10, i12, i18, i19);
                i16 = i11 + 1;
                i14 = i19;
            }
            this.zzN = 0;
            return;
        }
        if (i10 != 174) {
            if (i10 == 19899) {
                int i20 = this.zzD;
                if (i20 != -1) {
                    long j11 = this.zzE;
                    if (j11 != -1) {
                        if (i20 == 475249515) {
                            this.zzG = j11;
                            return;
                        }
                        return;
                    }
                }
                throw zzcd.zza("Mandatory element SeekID or SeekPosition not found", null);
            }
            if (i10 == 25152) {
                zzr(i10);
                zzafo zzafoVar2 = this.zzB;
                if (zzafoVar2.zzg) {
                    if (zzafoVar2.zzi == null) {
                        throw zzcd.zza("Encrypted Track found but ContentEncKeyID was not found", null);
                    }
                    zzafoVar2.zzk = new zzad(null, new zzac(zzo.zza, null, "video/webm", this.zzB.zzi.zzb));
                    return;
                }
                return;
            }
            if (i10 == 28032) {
                zzr(i10);
                zzafo zzafoVar3 = this.zzB;
                if (zzafoVar3.zzg && zzafoVar3.zzh != null) {
                    throw zzcd.zza("Combining encryption and compression is not supported", null);
                }
                return;
            }
            if (i10 == 357149030) {
                if (this.zzy == -9223372036854775807L) {
                    this.zzy = 1000000L;
                }
                long j12 = this.zzz;
                if (j12 != -9223372036854775807L) {
                    this.zzA = zzp(j12);
                    return;
                }
                return;
            }
            if (i10 == 374648427) {
                if (this.zzj.size() == 0) {
                    throw zzcd.zza("No valid tracks were found", null);
                }
                this.zzai.zzC();
                return;
            }
            if (i10 != 475249515) {
                return;
            }
            if (!this.zzC) {
                zzaaz zzaazVar = this.zzai;
                zzes zzesVar = this.zzJ;
                zzes zzesVar2 = this.zzK;
                if (this.zzx == -1 || this.zzA == -9223372036854775807L || zzesVar == null || zzesVar.zza() == 0 || zzesVar2 == null || zzesVar2.zza() != zzesVar.zza()) {
                    zzabuVar = new zzabu(this.zzA, 0L);
                } else {
                    int iZza = zzesVar.zza();
                    int[] iArrCopyOf = new int[iZza];
                    long[] jArrCopyOf = new long[iZza];
                    long[] jArrCopyOf2 = new long[iZza];
                    long[] jArrCopyOf3 = new long[iZza];
                    for (int i21 = 0; i21 < iZza; i21++) {
                        jArrCopyOf3[i21] = zzesVar.zzb(i21);
                        jArrCopyOf[i21] = zzesVar2.zzb(i21) + this.zzx;
                    }
                    int i22 = 0;
                    while (true) {
                        i13 = iZza - 1;
                        if (i22 >= i13) {
                            break;
                        }
                        int i23 = i22 + 1;
                        iArrCopyOf[i22] = (int) (jArrCopyOf[i23] - jArrCopyOf[i22]);
                        jArrCopyOf2[i22] = jArrCopyOf3[i23] - jArrCopyOf3[i22];
                        i22 = i23;
                    }
                    iArrCopyOf[i13] = (int) ((this.zzx + this.zzw) - jArrCopyOf[i13]);
                    long j13 = this.zzA - jArrCopyOf3[i13];
                    jArrCopyOf2[i13] = j13;
                    if (j13 <= 0) {
                        zzer.zzf("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j13);
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i13);
                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, i13);
                        jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i13);
                        jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i13);
                    }
                    zzabuVar = new zzaak(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
                }
                zzaazVar.zzN(zzabuVar);
                this.zzC = true;
            }
            this.zzJ = null;
            this.zzK = null;
            return;
        }
        zzafo zzafoVar4 = this.zzB;
        zzdy.zzb(zzafoVar4);
        String str = zzafoVar4.zzb;
        if (str == null) {
            throw zzcd.zza("CodecId is missing in TrackEntry element", null);
        }
        switch (str.hashCode()) {
            case -2095576542:
                b10 = str.equals("V_MPEG4/ISO/AP") ? (byte) 6 : (byte) -1;
                break;
            case -2095575984:
                b10 = str.equals("V_MPEG4/ISO/SP") ? (byte) 4 : (byte) -1;
                break;
            case -1985379776:
                b10 = str.equals("A_MS/ACM") ? (byte) 23 : (byte) -1;
                break;
            case -1784763192:
                b10 = str.equals("A_TRUEHD") ? (byte) 18 : (byte) -1;
                break;
            case -1730367663:
                b10 = str.equals("A_VORBIS") ? (byte) 12 : (byte) -1;
                break;
            case -1482641358:
                b10 = str.equals("A_MPEG/L2") ? (byte) 14 : (byte) -1;
                break;
            case -1482641357:
                b10 = str.equals("A_MPEG/L3") ? (byte) 15 : (byte) -1;
                break;
            case -1373388978:
                b10 = str.equals("V_MS/VFW/FOURCC") ? (byte) 9 : (byte) -1;
                break;
            case -933872740:
                b10 = str.equals("S_DVBSUB") ? (byte) 32 : (byte) -1;
                break;
            case -538363189:
                b10 = str.equals("V_MPEG4/ISO/ASP") ? (byte) 5 : (byte) -1;
                break;
            case -538363109:
                b10 = str.equals("V_MPEG4/ISO/AVC") ? (byte) 7 : (byte) -1;
                break;
            case -425012669:
                b10 = str.equals("S_VOBSUB") ? Ascii.RS : (byte) -1;
                break;
            case -356037306:
                b10 = str.equals("A_DTS/LOSSLESS") ? (byte) 21 : (byte) -1;
                break;
            case 62923557:
                b10 = str.equals("A_AAC") ? (byte) 13 : (byte) -1;
                break;
            case 62923603:
                b10 = str.equals("A_AC3") ? (byte) 16 : (byte) -1;
                break;
            case 62927045:
                b10 = str.equals("A_DTS") ? (byte) 19 : (byte) -1;
                break;
            case 82318131:
                b10 = str.equals("V_AV1") ? (byte) 2 : (byte) -1;
                break;
            case 82338133:
                b10 = str.equals("V_VP8") ? (byte) 0 : (byte) -1;
                break;
            case 82338134:
                b10 = str.equals("V_VP9") ? (byte) 1 : (byte) -1;
                break;
            case 99146302:
                b10 = str.equals("S_HDMV/PGS") ? Ascii.US : (byte) -1;
                break;
            case 444813526:
                b10 = str.equals("V_THEORA") ? (byte) 10 : (byte) -1;
                break;
            case 542569478:
                b10 = str.equals("A_DTS/EXPRESS") ? (byte) 20 : (byte) -1;
                break;
            case 635596514:
                b10 = str.equals("A_PCM/FLOAT/IEEE") ? Ascii.SUB : (byte) -1;
                break;
            case 725948237:
                b10 = str.equals("A_PCM/INT/BIG") ? Ascii.EM : (byte) -1;
                break;
            case 725957860:
                b10 = str.equals("A_PCM/INT/LIT") ? Ascii.CAN : (byte) -1;
                break;
            case 738597099:
                b10 = str.equals("S_TEXT/ASS") ? Ascii.FS : (byte) -1;
                break;
            case 855502857:
                if (!str.equals("V_MPEGH/ISO/HEVC")) {
                    b10 = -1;
                }
                break;
            case 1045209816:
                b10 = str.equals("S_TEXT/WEBVTT") ? Ascii.GS : (byte) -1;
                break;
            case 1422270023:
                b10 = str.equals("S_TEXT/UTF8") ? Ascii.ESC : (byte) -1;
                break;
            case 1809237540:
                b10 = str.equals("V_MPEG2") ? (byte) 3 : (byte) -1;
                break;
            case 1950749482:
                b10 = str.equals("A_EAC3") ? (byte) 17 : (byte) -1;
                break;
            case 1950789798:
                b10 = str.equals("A_FLAC") ? (byte) 22 : (byte) -1;
                break;
            case 1951062397:
                b10 = str.equals("A_OPUS") ? (byte) 11 : (byte) -1;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
                zzafoVar4.zze(this.zzai, zzafoVar4.zzc);
                this.zzj.put(zzafoVar4.zzc, zzafoVar4);
                break;
        }
        this.zzB = null;
    }

    public final void zzi(int i10, double d10) throws zzcd {
        if (i10 == 181) {
            zzr(i10);
            this.zzB.zzP = (int) d10;
            return;
        }
        if (i10 == 17545) {
            this.zzz = (long) d10;
            return;
        }
        switch (i10) {
            case 21969:
                zzr(i10);
                this.zzB.zzC = (float) d10;
                break;
            case 21970:
                zzr(i10);
                this.zzB.zzD = (float) d10;
                break;
            case 21971:
                zzr(i10);
                this.zzB.zzE = (float) d10;
                break;
            case 21972:
                zzr(i10);
                this.zzB.zzF = (float) d10;
                break;
            case 21973:
                zzr(i10);
                this.zzB.zzG = (float) d10;
                break;
            case 21974:
                zzr(i10);
                this.zzB.zzH = (float) d10;
                break;
            case 21975:
                zzr(i10);
                this.zzB.zzI = (float) d10;
                break;
            case 21976:
                zzr(i10);
                this.zzB.zzJ = (float) d10;
                break;
            case 21977:
                zzr(i10);
                this.zzB.zzK = (float) d10;
                break;
            case 21978:
                zzr(i10);
                this.zzB.zzL = (float) d10;
                break;
            default:
                switch (i10) {
                    case 30323:
                        zzr(i10);
                        this.zzB.zzr = (float) d10;
                        break;
                    case 30324:
                        zzr(i10);
                        this.zzB.zzs = (float) d10;
                        break;
                    case 30325:
                        zzr(i10);
                        this.zzB.zzt = (float) d10;
                        break;
                }
                break;
        }
    }

    public final void zzj(int i10, long j10) throws zzcd {
        if (i10 == 20529) {
            if (j10 == 0) {
                return;
            }
            throw zzcd.zza("ContentEncodingOrder " + j10 + " not supported", null);
        }
        if (i10 == 20530) {
            if (j10 == 1) {
                return;
            }
            throw zzcd.zza("ContentEncodingScope " + j10 + " not supported", null);
        }
        switch (i10) {
            case 131:
                zzr(i10);
                this.zzB.zzd = (int) j10;
                return;
            case SyslogConstants.LOG_LOCAL1 /* 136 */:
                zzr(i10);
                this.zzB.zzU = j10 == 1;
                return;
            case 155:
                this.zzP = zzp(j10);
                return;
            case 159:
                zzr(i10);
                this.zzB.zzN = (int) j10;
                return;
            case SyslogConstants.LOG_LOCAL6 /* 176 */:
                zzr(i10);
                this.zzB.zzl = (int) j10;
                return;
            case 179:
                zzq(i10);
                this.zzJ.zzc(zzp(j10));
                return;
            case 186:
                zzr(i10);
                this.zzB.zzm = (int) j10;
                return;
            case 215:
                zzr(i10);
                this.zzB.zzc = (int) j10;
                return;
            case 231:
                this.zzI = zzp(j10);
                return;
            case 238:
                this.zzW = (int) j10;
                return;
            case 241:
                if (this.zzL) {
                    return;
                }
                zzq(i10);
                this.zzK.zzc(j10);
                this.zzL = true;
                return;
            case 251:
                this.zzX = true;
                return;
            case 16871:
                zzr(i10);
                this.zzB.zzX = (int) j10;
                return;
            case 16980:
                if (j10 == 3) {
                    return;
                }
                throw zzcd.zza("ContentCompAlgo " + j10 + " not supported", null);
            case 17029:
                if (j10 < 1 || j10 > 2) {
                    throw zzcd.zza("DocTypeReadVersion " + j10 + " not supported", null);
                }
                return;
            case 17143:
                if (j10 == 1) {
                    return;
                }
                throw zzcd.zza("EBMLReadVersion " + j10 + " not supported", null);
            case 18401:
                if (j10 == 5) {
                    return;
                }
                throw zzcd.zza("ContentEncAlgo " + j10 + " not supported", null);
            case 18408:
                if (j10 == 1) {
                    return;
                }
                throw zzcd.zza("AESSettingsCipherMode " + j10 + " not supported", null);
            case 21420:
                this.zzE = j10 + this.zzx;
                return;
            case 21432:
                int i11 = (int) j10;
                zzr(i10);
                if (i11 == 0) {
                    this.zzB.zzv = 0;
                    return;
                }
                if (i11 == 1) {
                    this.zzB.zzv = 2;
                    return;
                } else if (i11 == 3) {
                    this.zzB.zzv = 1;
                    return;
                } else {
                    if (i11 != 15) {
                        return;
                    }
                    this.zzB.zzv = 3;
                    return;
                }
            case 21680:
                zzr(i10);
                this.zzB.zzn = (int) j10;
                return;
            case 21682:
                zzr(i10);
                this.zzB.zzp = (int) j10;
                return;
            case 21690:
                zzr(i10);
                this.zzB.zzo = (int) j10;
                return;
            case 21930:
                zzr(i10);
                this.zzB.zzT = j10 == 1;
                return;
            case 21998:
                zzr(i10);
                this.zzB.zzf = (int) j10;
                return;
            case 22186:
                zzr(i10);
                this.zzB.zzQ = j10;
                return;
            case 22203:
                zzr(i10);
                this.zzB.zzR = j10;
                return;
            case 25188:
                zzr(i10);
                this.zzB.zzO = (int) j10;
                return;
            case 30114:
                this.zzY = j10;
                return;
            case 30321:
                zzr(i10);
                int i12 = (int) j10;
                if (i12 == 0) {
                    this.zzB.zzq = 0;
                    return;
                }
                if (i12 == 1) {
                    this.zzB.zzq = 1;
                    return;
                } else if (i12 == 2) {
                    this.zzB.zzq = 2;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    this.zzB.zzq = 3;
                    return;
                }
            case 2352003:
                zzr(i10);
                this.zzB.zze = (int) j10;
                return;
            case 2807729:
                this.zzy = j10;
                return;
            default:
                switch (i10) {
                    case 21945:
                        zzr(i10);
                        int i13 = (int) j10;
                        if (i13 == 1) {
                            this.zzB.zzz = 2;
                            return;
                        } else {
                            if (i13 != 2) {
                                return;
                            }
                            this.zzB.zzz = 1;
                            return;
                        }
                    case 21946:
                        zzr(i10);
                        int iZzb = zzs.zzb((int) j10);
                        if (iZzb != -1) {
                            this.zzB.zzy = iZzb;
                            return;
                        }
                        return;
                    case 21947:
                        zzr(i10);
                        this.zzB.zzw = true;
                        int iZza = zzs.zza((int) j10);
                        if (iZza != -1) {
                            this.zzB.zzx = iZza;
                            return;
                        }
                        return;
                    case 21948:
                        zzr(i10);
                        this.zzB.zzA = (int) j10;
                        return;
                    case 21949:
                        zzr(i10);
                        this.zzB.zzB = (int) j10;
                        return;
                    default:
                        return;
                }
        }
    }

    public final void zzk(int i10, long j10, long j11) throws zzcd {
        zzdy.zzb(this.zzai);
        if (i10 == 160) {
            this.zzX = false;
            this.zzY = 0L;
            return;
        }
        if (i10 == 174) {
            this.zzB = new zzafo();
            return;
        }
        if (i10 == 187) {
            this.zzL = false;
            return;
        }
        if (i10 == 19899) {
            this.zzD = -1;
            this.zzE = -1L;
            return;
        }
        if (i10 == 20533) {
            zzr(i10);
            this.zzB.zzg = true;
            return;
        }
        if (i10 == 21968) {
            zzr(i10);
            this.zzB.zzw = true;
            return;
        }
        if (i10 == 408125543) {
            long j12 = this.zzx;
            if (j12 != -1 && j12 != j10) {
                throw zzcd.zza("Multiple Segment elements not supported", null);
            }
            this.zzx = j10;
            this.zzw = j11;
            return;
        }
        if (i10 == 475249515) {
            this.zzJ = new zzes(32);
            this.zzK = new zzes(32);
        } else if (i10 == 524531317 && !this.zzC) {
            if (this.zzk && this.zzG != -1) {
                this.zzF = true;
            } else {
                this.zzai.zzN(new zzabu(this.zzA, 0L));
                this.zzC = true;
            }
        }
    }

    public final void zzl(int i10, String str) throws zzcd {
        if (i10 == 134) {
            zzr(i10);
            this.zzB.zzb = str;
            return;
        }
        if (i10 == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                return;
            }
            throw zzcd.zza("DocType " + str + " not supported", null);
        }
        if (i10 == 21358) {
            zzr(i10);
            this.zzB.zza = str;
        } else {
            if (i10 != 2274716) {
                return;
            }
            zzr(i10);
            this.zzB.zzY = str;
        }
    }
}
