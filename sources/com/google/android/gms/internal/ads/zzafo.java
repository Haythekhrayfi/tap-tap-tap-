package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.applovin.exoplayer2.common.base.Ascii;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class zzafo {
    public byte[] zzM;
    public zzaca zzS;
    public boolean zzT;
    public zzabz zzV;
    public int zzW;
    private int zzX;
    public String zza;
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public boolean zzg;
    public byte[] zzh;
    public zzaby zzi;
    public byte[] zzj;
    public zzad zzk;
    public int zzl = -1;
    public int zzm = -1;
    public int zzn = -1;
    public int zzo = -1;
    public int zzp = 0;
    public int zzq = -1;
    public float zzr = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
    public float zzs = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
    public float zzt = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
    public byte[] zzu = null;
    public int zzv = -1;
    public boolean zzw = false;
    public int zzx = -1;
    public int zzy = -1;
    public int zzz = -1;
    public int zzA = 1000;
    public int zzB = 200;
    public float zzC = -1.0f;
    public float zzD = -1.0f;
    public float zzE = -1.0f;
    public float zzF = -1.0f;
    public float zzG = -1.0f;
    public float zzH = -1.0f;
    public float zzI = -1.0f;
    public float zzJ = -1.0f;
    public float zzK = -1.0f;
    public float zzL = -1.0f;
    public int zzN = 1;
    public int zzO = -1;
    public int zzP = 8000;
    public long zzQ = 0;
    public long zzR = 0;
    public boolean zzU = true;
    private String zzY = "eng";

    private static Pair zzf(zzfa zzfaVar) throws zzcd {
        try {
            zzfaVar.zzG(16);
            long jZzq = zzfaVar.zzq();
            if (jZzq == 1482049860) {
                return new Pair("video/divx", null);
            }
            if (jZzq == 859189832) {
                return new Pair("video/3gpp", null);
            }
            if (jZzq != 826496599) {
                zzer.zzf("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair("video/x-unknown", null);
            }
            int iZzc = zzfaVar.zzc() + 20;
            byte[] bArrZzH = zzfaVar.zzH();
            while (true) {
                int length = bArrZzH.length;
                if (iZzc >= length - 4) {
                    throw zzcd.zza("Failed to find FourCC VC1 initialization data", null);
                }
                if (bArrZzH[iZzc] == 0 && bArrZzH[iZzc + 1] == 0 && bArrZzH[iZzc + 2] == 1 && bArrZzH[iZzc + 3] == 15) {
                    return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArrZzH, iZzc, length)));
                }
                iZzc++;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzcd.zza("Error parsing FourCC private data", null);
        }
    }

    private static List zzg(byte[] bArr) throws zzcd {
        int i10;
        int i11;
        try {
            if (bArr[0] != 2) {
                throw zzcd.zza("Error parsing vorbis codec private", null);
            }
            int i12 = 0;
            int i13 = 1;
            while (true) {
                i10 = bArr[i13] & 255;
                if (i10 != 255) {
                    break;
                }
                i13++;
                i12 += 255;
            }
            int i14 = i12 + i10;
            int i15 = i13 + 1;
            int i16 = 0;
            while (true) {
                i11 = bArr[i15] & 255;
                if (i11 != 255) {
                    break;
                }
                i15++;
                i16 += 255;
            }
            int i17 = i15 + 1;
            int i18 = i16 + i11;
            if (bArr[i17] != 1) {
                throw zzcd.zza("Error parsing vorbis codec private", null);
            }
            byte[] bArr2 = new byte[i14];
            System.arraycopy(bArr, i17, bArr2, 0, i14);
            int i19 = i17 + i14;
            if (bArr[i19] != 3) {
                throw zzcd.zza("Error parsing vorbis codec private", null);
            }
            int i20 = i19 + i18;
            if (bArr[i20] != 5) {
                throw zzcd.zza("Error parsing vorbis codec private", null);
            }
            int length = bArr.length - i20;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, i20, bArr3, 0, length);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(bArr2);
            arrayList.add(bArr3);
            return arrayList;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzcd.zza("Error parsing vorbis codec private", null);
        }
    }

    private static boolean zzh(zzfa zzfaVar) throws zzcd {
        try {
            int iZzi = zzfaVar.zzi();
            if (iZzi == 1) {
                return true;
            }
            if (iZzi == 65534) {
                zzfaVar.zzF(24);
                if (zzfaVar.zzr() == zzafp.zzf.getMostSignificantBits() && zzfaVar.zzr() == zzafp.zzf.getLeastSignificantBits()) {
                    return true;
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzcd.zza("Error parsing MS/ACM codec private", null);
        }
    }

    @EnsuresNonNull({"codecPrivate"})
    private final byte[] zzi(String str) throws zzcd {
        byte[] bArr = this.zzj;
        if (bArr != null) {
            return bArr;
        }
        throw zzcd.zza("Missing CodecPrivate for codec ".concat(String.valueOf(str)), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:104:0x018f  */
    /* JADX WARN: Code duplicated, block: B:129:0x0228 A[PHI: r9
  0x0228: PHI (r9v6 int) = (r9v2 int), (r9v3 int), (r9v4 int), (r9v5 int), (r9v0 int) binds: [B:133:0x0244, B:126:0x020f, B:123:0x01fe, B:121:0x01fa, B:116:0x01eb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:171:0x0370  */
    /* JADX WARN: Code duplicated, block: B:176:0x0389  */
    /* JADX WARN: Code duplicated, block: B:177:0x038b  */
    /* JADX WARN: Code duplicated, block: B:180:0x0398  */
    /* JADX WARN: Code duplicated, block: B:181:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:183:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:185:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:187:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:190:0x03be  */
    /* JADX WARN: Code duplicated, block: B:192:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:195:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:198:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:201:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:203:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:226:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:231:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:250:0x0511  */
    /* JADX WARN: Code duplicated, block: B:252:0x0531  */
    /* JADX WARN: Code duplicated, block: B:254:0x0537  */
    /* JADX WARN: Code duplicated, block: B:270:0x0568  */
    @EnsuresNonNull({"this.output"})
    @RequiresNonNull({"codecId"})
    public final void zze(zzaaz zzaazVar, int i10) throws zzcd {
        byte b10;
        List list;
        String str;
        int i11;
        String str2;
        List list2;
        List listZzg;
        List list3;
        String string;
        int i12;
        StringBuilder sb2;
        String str3;
        List listZzn;
        String str4;
        int i13;
        zzak zzakVar;
        int iIntValue;
        int i14;
        float f10;
        int i15;
        int i16;
        int i17;
        zzaas zzaasVarZza;
        List list4;
        List listSingletonList;
        String str5 = this.zzb;
        int i18 = 1;
        int iZzj = 4;
        int i19 = 0;
        switch (str5) {
            case "V_MPEG4/ISO/AP":
                b10 = 6;
                break;
            case "V_MPEG4/ISO/SP":
                b10 = 4;
                break;
            case "A_MS/ACM":
                b10 = 23;
                break;
            case "A_TRUEHD":
                b10 = 18;
                break;
            case "A_VORBIS":
                b10 = 11;
                break;
            case "A_MPEG/L2":
                b10 = 14;
                break;
            case "A_MPEG/L3":
                b10 = 15;
                break;
            case "V_MS/VFW/FOURCC":
                b10 = 9;
                break;
            case "S_DVBSUB":
                b10 = 32;
                break;
            case "V_MPEG4/ISO/ASP":
                b10 = 5;
                break;
            case "V_MPEG4/ISO/AVC":
                b10 = 7;
                break;
            case "S_VOBSUB":
                b10 = Ascii.RS;
                break;
            case "A_DTS/LOSSLESS":
                b10 = 21;
                break;
            case "A_AAC":
                b10 = 13;
                break;
            case "A_AC3":
                b10 = 16;
                break;
            case "A_DTS":
                b10 = 19;
                break;
            case "V_AV1":
                b10 = 2;
                break;
            case "V_VP8":
                b10 = 0;
                break;
            case "V_VP9":
                b10 = 1;
                break;
            case "S_HDMV/PGS":
                b10 = Ascii.US;
                break;
            case "V_THEORA":
                b10 = 10;
                break;
            case "A_DTS/EXPRESS":
                b10 = 20;
                break;
            case "A_PCM/FLOAT/IEEE":
                b10 = Ascii.SUB;
                break;
            case "A_PCM/INT/BIG":
                b10 = Ascii.EM;
                break;
            case "A_PCM/INT/LIT":
                b10 = Ascii.CAN;
                break;
            case "S_TEXT/ASS":
                b10 = Ascii.FS;
                break;
            case "V_MPEGH/ISO/HEVC":
                b10 = 8;
                break;
            case "S_TEXT/WEBVTT":
                b10 = Ascii.GS;
                break;
            case "S_TEXT/UTF8":
                b10 = Ascii.ESC;
                break;
            case "V_MPEG2":
                b10 = 3;
                break;
            case "A_EAC3":
                b10 = 17;
                break;
            case "A_FLAC":
                b10 = 22;
                break;
            case "A_OPUS":
                b10 = 12;
                break;
            default:
                b10 = -1;
                break;
        }
        int i20 = 4096;
        String str6 = "audio/raw";
        zzs zzsVar = null;
        bArr = null;
        bArr = null;
        bArr = null;
        bArr = null;
        bArr = null;
        bArr = null;
        bArr = null;
        bArr = null;
        bArr = null;
        byte[] bArr = null;
        switch (b10) {
            case 0:
                str6 = "video/x-vnd.on2.vp8";
                listZzn = null;
                str2 = null;
                i11 = -1;
                list4 = listZzn;
                iZzj = -1;
                list2 = list4;
                if (this.zzM != null && (zzaasVarZza = zzaas.zza(new zzfa(this.zzM))) != null) {
                    str2 = zzaasVarZza.zza;
                    str6 = "video/dolby-vision";
                }
                str4 = str6;
                boolean z10 = this.zzU;
                if (true != this.zzT) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i21 = (z10 ? 1 : 0) | i13;
                zzakVar = new zzak();
                if (!zzcc.zzf(str4)) {
                    zzakVar.zzw(this.zzN);
                    zzakVar.zzT(this.zzP);
                    zzakVar.zzN(iZzj);
                } else if (zzcc.zzg(str4)) {
                    if (this.zzp == 0) {
                        i16 = this.zzn;
                        iIntValue = -1;
                        if (i16 == -1) {
                            i16 = this.zzl;
                        }
                        this.zzn = i16;
                        i17 = this.zzo;
                        if (i17 == -1) {
                            i17 = this.zzm;
                        }
                        this.zzo = i17;
                    } else {
                        iIntValue = -1;
                    }
                    i14 = this.zzn;
                    if (i14 != iIntValue || (i15 = this.zzo) == iIntValue) {
                        f10 = -1.0f;
                    } else {
                        f10 = (this.zzm * i14) / (this.zzl * i15);
                    }
                    if (this.zzw) {
                        if (this.zzC != -1.0f && this.zzD != -1.0f && this.zzE != -1.0f && this.zzF != -1.0f && this.zzG != -1.0f && this.zzH != -1.0f && this.zzI != -1.0f && this.zzJ != -1.0f && this.zzK != -1.0f && this.zzL != -1.0f) {
                            bArr = new byte[25];
                            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                            byteBufferOrder.put((byte) 0);
                            byteBufferOrder.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) (this.zzK + 0.5f));
                            byteBufferOrder.putShort((short) (this.zzL + 0.5f));
                            byteBufferOrder.putShort((short) this.zzA);
                            byteBufferOrder.putShort((short) this.zzB);
                        }
                        zzsVar = new zzs(this.zzx, this.zzz, this.zzy, bArr);
                    }
                    if (this.zza != null && zzafp.zzg.containsKey(this.zza)) {
                        iIntValue = ((Integer) zzafp.zzg.get(this.zza)).intValue();
                    }
                    if (this.zzq == 0 || Float.compare(this.zzr, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) != 0 || Float.compare(this.zzs, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) != 0) {
                        i19 = iIntValue;
                    } else if (Float.compare(this.zzt, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) != 0) {
                        if (Float.compare(this.zzs, 90.0f) == 0) {
                            i19 = 90;
                        } else if (Float.compare(this.zzs, -180.0f) == 0 || Float.compare(this.zzs, 180.0f) == 0) {
                            i19 = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                        } else if (Float.compare(this.zzs, -90.0f) == 0) {
                            i19 = 270;
                        } else {
                            i19 = iIntValue;
                        }
                    }
                    zzakVar.zzX(this.zzl);
                    zzakVar.zzF(this.zzm);
                    zzakVar.zzP(f10);
                    zzakVar.zzR(i19);
                    zzakVar.zzQ(this.zzu);
                    zzakVar.zzV(this.zzv);
                    zzakVar.zzy(zzsVar);
                    i18 = 2;
                } else {
                    if ("application/x-subrip".equals(str4) && !"text/x-ssa".equals(str4) && !"text/vtt".equals(str4) && !"application/vobsub".equals(str4) && !"application/pgs".equals(str4) && !"application/dvbsubs".equals(str4)) {
                        throw zzcd.zza("Unexpected MIME type.", null);
                    }
                    i18 = 3;
                }
                if (this.zza != null && !zzafp.zzg.containsKey(this.zza)) {
                    zzakVar.zzJ(this.zza);
                }
                zzakVar.zzG(i10);
                zzakVar.zzS(str4);
                zzakVar.zzL(i11);
                zzakVar.zzK(this.zzY);
                zzakVar.zzU(i21);
                zzakVar.zzI(list2);
                zzakVar.zzx(str2);
                zzakVar.zzB(this.zzk);
                zzam zzamVarZzY = zzakVar.zzY();
                zzabz zzabzVarZzv = zzaazVar.zzv(this.zzc, i18);
                this.zzV = zzabzVarZzv;
                zzabzVarZzv.zzk(zzamVarZzY);
                return;
            case 1:
                str6 = "video/x-vnd.on2.vp9";
                listZzn = null;
                str2 = null;
                i11 = -1;
                list4 = listZzn;
                iZzj = -1;
                list2 = list4;
                if (this.zzM != null) {
                    str2 = zzaasVarZza.zza;
                    str6 = "video/dolby-vision";
                }
                str4 = str6;
                boolean z11 = this.zzU;
                if (true != this.zzT) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i22 = (z11 ? 1 : 0) | i13;
                zzakVar = new zzak();
                if (!zzcc.zzf(str4)) {
                    if (zzcc.zzg(str4)) {
                        if (this.zzp == 0) {
                            i16 = this.zzn;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.zzl;
                            }
                            this.zzn = i16;
                            i17 = this.zzo;
                            if (i17 == -1) {
                                i17 = this.zzm;
                            }
                            this.zzo = i17;
                        } else {
                            iIntValue = -1;
                        }
                        i14 = this.zzn;
                        if (i14 != iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder2 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder2.put((byte) 0);
                                byteBufferOrder2.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                                byteBufferOrder2.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder2.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder2.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder2.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder2.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder2.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder2.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder2.putShort((short) (this.zzK + 0.5f));
                                byteBufferOrder2.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder2.putShort((short) this.zzA);
                                byteBufferOrder2.putShort((short) this.zzB);
                            }
                            zzsVar = new zzs(this.zzx, this.zzz, this.zzy, bArr);
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzafp.zzg.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i19 = iIntValue;
                        } else {
                            i19 = iIntValue;
                        }
                        zzakVar.zzX(this.zzl);
                        zzakVar.zzF(this.zzm);
                        zzakVar.zzP(f10);
                        zzakVar.zzR(i19);
                        zzakVar.zzQ(this.zzu);
                        zzakVar.zzV(this.zzv);
                        zzakVar.zzy(zzsVar);
                        i18 = 2;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                        }
                        i18 = 3;
                    }
                    break;
                } else {
                    zzakVar.zzw(this.zzN);
                    zzakVar.zzT(this.zzP);
                    zzakVar.zzN(iZzj);
                }
                if (this.zza != null) {
                    zzakVar.zzJ(this.zza);
                }
                zzakVar.zzG(i10);
                zzakVar.zzS(str4);
                zzakVar.zzL(i11);
                zzakVar.zzK(this.zzY);
                zzakVar.zzU(i22);
                zzakVar.zzI(list2);
                zzakVar.zzx(str2);
                zzakVar.zzB(this.zzk);
                zzam zzamVarZzY2 = zzakVar.zzY();
                zzabz zzabzVarZzv2 = zzaazVar.zzv(this.zzc, i18);
                this.zzV = zzabzVarZzv2;
                zzabzVarZzv2.zzk(zzamVarZzY2);
                return;
            case 2:
                str6 = "video/av01";
                listZzn = null;
                str2 = null;
                i11 = -1;
                list4 = listZzn;
                iZzj = -1;
                list2 = list4;
                if (this.zzM != null) {
                    str2 = zzaasVarZza.zza;
                    str6 = "video/dolby-vision";
                }
                str4 = str6;
                boolean z12 = this.zzU;
                if (true != this.zzT) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i23 = (z12 ? 1 : 0) | i13;
                zzakVar = new zzak();
                if (!zzcc.zzf(str4)) {
                    if (zzcc.zzg(str4)) {
                        if (this.zzp == 0) {
                            i16 = this.zzn;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.zzl;
                            }
                            this.zzn = i16;
                            i17 = this.zzo;
                            if (i17 == -1) {
                                i17 = this.zzm;
                            }
                            this.zzo = i17;
                        } else {
                            iIntValue = -1;
                        }
                        i14 = this.zzn;
                        if (i14 != iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder3 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder3.put((byte) 0);
                                byteBufferOrder3.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                                byteBufferOrder3.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder3.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder3.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder3.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder3.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder3.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder3.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder3.putShort((short) (this.zzK + 0.5f));
                                byteBufferOrder3.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder3.putShort((short) this.zzA);
                                byteBufferOrder3.putShort((short) this.zzB);
                            }
                            zzsVar = new zzs(this.zzx, this.zzz, this.zzy, bArr);
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzafp.zzg.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i19 = iIntValue;
                        } else {
                            i19 = iIntValue;
                        }
                        zzakVar.zzX(this.zzl);
                        zzakVar.zzF(this.zzm);
                        zzakVar.zzP(f10);
                        zzakVar.zzR(i19);
                        zzakVar.zzQ(this.zzu);
                        zzakVar.zzV(this.zzv);
                        zzakVar.zzy(zzsVar);
                        i18 = 2;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                        }
                        i18 = 3;
                    }
                    break;
                } else {
                    zzakVar.zzw(this.zzN);
                    zzakVar.zzT(this.zzP);
                    zzakVar.zzN(iZzj);
                }
                if (this.zza != null) {
                    zzakVar.zzJ(this.zza);
                }
                zzakVar.zzG(i10);
                zzakVar.zzS(str4);
                zzakVar.zzL(i11);
                zzakVar.zzK(this.zzY);
                zzakVar.zzU(i23);
                zzakVar.zzI(list2);
                zzakVar.zzx(str2);
                zzakVar.zzB(this.zzk);
                zzam zzamVarZzY3 = zzakVar.zzY();
                zzabz zzabzVarZzv3 = zzaazVar.zzv(this.zzc, i18);
                this.zzV = zzabzVarZzv3;
                zzabzVarZzv3.zzk(zzamVarZzY3);
                return;
            case 3:
                str6 = "video/mpeg2";
                listZzn = null;
                str2 = null;
                i11 = -1;
                list4 = listZzn;
                iZzj = -1;
                list2 = list4;
                if (this.zzM != null) {
                    str2 = zzaasVarZza.zza;
                    str6 = "video/dolby-vision";
                }
                str4 = str6;
                boolean z13 = this.zzU;
                if (true != this.zzT) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i24 = (z13 ? 1 : 0) | i13;
                zzakVar = new zzak();
                if (!zzcc.zzf(str4)) {
                    if (zzcc.zzg(str4)) {
                        if (this.zzp == 0) {
                            i16 = this.zzn;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.zzl;
                            }
                            this.zzn = i16;
                            i17 = this.zzo;
                            if (i17 == -1) {
                                i17 = this.zzm;
                            }
                            this.zzo = i17;
                        } else {
                            iIntValue = -1;
                        }
                        i14 = this.zzn;
                        if (i14 != iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder4 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder4.put((byte) 0);
                                byteBufferOrder4.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                                byteBufferOrder4.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder4.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder4.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder4.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder4.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder4.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder4.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder4.putShort((short) (this.zzK + 0.5f));
                                byteBufferOrder4.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder4.putShort((short) this.zzA);
                                byteBufferOrder4.putShort((short) this.zzB);
                            }
                            zzsVar = new zzs(this.zzx, this.zzz, this.zzy, bArr);
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzafp.zzg.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i19 = iIntValue;
                        } else {
                            i19 = iIntValue;
                        }
                        zzakVar.zzX(this.zzl);
                        zzakVar.zzF(this.zzm);
                        zzakVar.zzP(f10);
                        zzakVar.zzR(i19);
                        zzakVar.zzQ(this.zzu);
                        zzakVar.zzV(this.zzv);
                        zzakVar.zzy(zzsVar);
                        i18 = 2;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                        }
                        i18 = 3;
                    }
                    break;
                } else {
                    zzakVar.zzw(this.zzN);
                    zzakVar.zzT(this.zzP);
                    zzakVar.zzN(iZzj);
                }
                if (this.zza != null) {
                    zzakVar.zzJ(this.zza);
                }
                zzakVar.zzG(i10);
                zzakVar.zzS(str4);
                zzakVar.zzL(i11);
                zzakVar.zzK(this.zzY);
                zzakVar.zzU(i24);
                zzakVar.zzI(list2);
                zzakVar.zzx(str2);
                zzakVar.zzB(this.zzk);
                zzam zzamVarZzY4 = zzakVar.zzY();
                zzabz zzabzVarZzv4 = zzaazVar.zzv(this.zzc, i18);
                this.zzV = zzabzVarZzv4;
                zzabzVarZzv4.zzk(zzamVarZzY4);
                return;
            case 4:
            case 5:
            case 6:
                byte[] bArr2 = this.zzj;
                str6 = "video/mp4v-es";
                listSingletonList = bArr2 == null ? null : Collections.singletonList(bArr2);
                str2 = null;
                listZzn = listSingletonList;
                i11 = -1;
                list4 = listZzn;
                iZzj = -1;
                list2 = list4;
                if (this.zzM != null) {
                    str2 = zzaasVarZza.zza;
                    str6 = "video/dolby-vision";
                }
                str4 = str6;
                boolean z14 = this.zzU;
                if (true != this.zzT) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i25 = (z14 ? 1 : 0) | i13;
                zzakVar = new zzak();
                if (!zzcc.zzf(str4)) {
                    if (zzcc.zzg(str4)) {
                        if (this.zzp == 0) {
                            i16 = this.zzn;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.zzl;
                            }
                            this.zzn = i16;
                            i17 = this.zzo;
                            if (i17 == -1) {
                                i17 = this.zzm;
                            }
                            this.zzo = i17;
                        } else {
                            iIntValue = -1;
                        }
                        i14 = this.zzn;
                        if (i14 != iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder5 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder5.put((byte) 0);
                                byteBufferOrder5.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) (this.zzK + 0.5f));
                                byteBufferOrder5.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder5.putShort((short) this.zzA);
                                byteBufferOrder5.putShort((short) this.zzB);
                            }
                            zzsVar = new zzs(this.zzx, this.zzz, this.zzy, bArr);
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzafp.zzg.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i19 = iIntValue;
                        } else {
                            i19 = iIntValue;
                        }
                        zzakVar.zzX(this.zzl);
                        zzakVar.zzF(this.zzm);
                        zzakVar.zzP(f10);
                        zzakVar.zzR(i19);
                        zzakVar.zzQ(this.zzu);
                        zzakVar.zzV(this.zzv);
                        zzakVar.zzy(zzsVar);
                        i18 = 2;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                        }
                        i18 = 3;
                    }
                    break;
                } else {
                    zzakVar.zzw(this.zzN);
                    zzakVar.zzT(this.zzP);
                    zzakVar.zzN(iZzj);
                }
                if (this.zza != null) {
                    zzakVar.zzJ(this.zza);
                }
                zzakVar.zzG(i10);
                zzakVar.zzS(str4);
                zzakVar.zzL(i11);
                zzakVar.zzK(this.zzY);
                zzakVar.zzU(i25);
                zzakVar.zzI(list2);
                zzakVar.zzx(str2);
                zzakVar.zzB(this.zzk);
                zzam zzamVarZzY5 = zzakVar.zzY();
                zzabz zzabzVarZzv5 = zzaazVar.zzv(this.zzc, i18);
                this.zzV = zzabzVarZzv5;
                zzabzVarZzv5.zzk(zzamVarZzY5);
                return;
            case 7:
                zzaab zzaabVarZza = zzaab.zza(new zzfa(zzi(this.zzb)));
                list = zzaabVarZza.zza;
                this.zzW = zzaabVarZza.zzb;
                str = zzaabVarZza.zzi;
                str6 = "video/avc";
                i11 = -1;
                iZzj = -1;
                List list5 = list;
                str2 = str;
                list2 = list5;
                if (this.zzM != null) {
                    str2 = zzaasVarZza.zza;
                    str6 = "video/dolby-vision";
                }
                str4 = str6;
                boolean z15 = this.zzU;
                if (true != this.zzT) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i26 = (z15 ? 1 : 0) | i13;
                zzakVar = new zzak();
                if (!zzcc.zzf(str4)) {
                    if (zzcc.zzg(str4)) {
                        if (this.zzp == 0) {
                            i16 = this.zzn;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.zzl;
                            }
                            this.zzn = i16;
                            i17 = this.zzo;
                            if (i17 == -1) {
                                i17 = this.zzm;
                            }
                            this.zzo = i17;
                        } else {
                            iIntValue = -1;
                        }
                        i14 = this.zzn;
                        if (i14 != iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder6 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder6.put((byte) 0);
                                byteBufferOrder6.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                                byteBufferOrder6.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder6.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder6.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder6.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder6.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder6.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder6.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder6.putShort((short) (this.zzK + 0.5f));
                                byteBufferOrder6.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder6.putShort((short) this.zzA);
                                byteBufferOrder6.putShort((short) this.zzB);
                            }
                            zzsVar = new zzs(this.zzx, this.zzz, this.zzy, bArr);
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzafp.zzg.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i19 = iIntValue;
                        } else {
                            i19 = iIntValue;
                        }
                        zzakVar.zzX(this.zzl);
                        zzakVar.zzF(this.zzm);
                        zzakVar.zzP(f10);
                        zzakVar.zzR(i19);
                        zzakVar.zzQ(this.zzu);
                        zzakVar.zzV(this.zzv);
                        zzakVar.zzy(zzsVar);
                        i18 = 2;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                        }
                        i18 = 3;
                    }
                    break;
                } else {
                    zzakVar.zzw(this.zzN);
                    zzakVar.zzT(this.zzP);
                    zzakVar.zzN(iZzj);
                }
                if (this.zza != null) {
                    zzakVar.zzJ(this.zza);
                }
                zzakVar.zzG(i10);
                zzakVar.zzS(str4);
                zzakVar.zzL(i11);
                zzakVar.zzK(this.zzY);
                zzakVar.zzU(i26);
                zzakVar.zzI(list2);
                zzakVar.zzx(str2);
                zzakVar.zzB(this.zzk);
                zzam zzamVarZzY6 = zzakVar.zzY();
                zzabz zzabzVarZzv6 = zzaazVar.zzv(this.zzc, i18);
                this.zzV = zzabzVarZzv6;
                zzabzVarZzv6.zzk(zzamVarZzY6);
                return;
            case 8:
                zzabm zzabmVarZza = zzabm.zza(new zzfa(zzi(this.zzb)));
                list = zzabmVarZza.zza;
                this.zzW = zzabmVarZza.zzb;
                str = zzabmVarZza.zzg;
                str6 = "video/hevc";
                i11 = -1;
                iZzj = -1;
                List list6 = list;
                str2 = str;
                list2 = list6;
                if (this.zzM != null) {
                    str2 = zzaasVarZza.zza;
                    str6 = "video/dolby-vision";
                }
                str4 = str6;
                boolean z16 = this.zzU;
                if (true != this.zzT) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i27 = (z16 ? 1 : 0) | i13;
                zzakVar = new zzak();
                if (!zzcc.zzf(str4)) {
                    if (zzcc.zzg(str4)) {
                        if (this.zzp == 0) {
                            i16 = this.zzn;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.zzl;
                            }
                            this.zzn = i16;
                            i17 = this.zzo;
                            if (i17 == -1) {
                                i17 = this.zzm;
                            }
                            this.zzo = i17;
                        } else {
                            iIntValue = -1;
                        }
                        i14 = this.zzn;
                        if (i14 != iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder7 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder7.put((byte) 0);
                                byteBufferOrder7.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) (this.zzK + 0.5f));
                                byteBufferOrder7.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder7.putShort((short) this.zzA);
                                byteBufferOrder7.putShort((short) this.zzB);
                            }
                            zzsVar = new zzs(this.zzx, this.zzz, this.zzy, bArr);
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzafp.zzg.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i19 = iIntValue;
                        } else {
                            i19 = iIntValue;
                        }
                        zzakVar.zzX(this.zzl);
                        zzakVar.zzF(this.zzm);
                        zzakVar.zzP(f10);
                        zzakVar.zzR(i19);
                        zzakVar.zzQ(this.zzu);
                        zzakVar.zzV(this.zzv);
                        zzakVar.zzy(zzsVar);
                        i18 = 2;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                        }
                        i18 = 3;
                    }
                    break;
                } else {
                    zzakVar.zzw(this.zzN);
                    zzakVar.zzT(this.zzP);
                    zzakVar.zzN(iZzj);
                }
                if (this.zza != null) {
                    zzakVar.zzJ(this.zza);
                }
                zzakVar.zzG(i10);
                zzakVar.zzS(str4);
                zzakVar.zzL(i11);
                zzakVar.zzK(this.zzY);
                zzakVar.zzU(i27);
                zzakVar.zzI(list2);
                zzakVar.zzx(str2);
                zzakVar.zzB(this.zzk);
                zzam zzamVarZzY7 = zzakVar.zzY();
                zzabz zzabzVarZzv7 = zzaazVar.zzv(this.zzc, i18);
                this.zzV = zzabzVarZzv7;
                zzabzVarZzv7.zzk(zzamVarZzY7);
                return;
            case 9:
                Pair pairZzf = zzf(new zzfa(zzi(this.zzb)));
                str6 = (String) pairZzf.first;
                listSingletonList = (List) pairZzf.second;
                str2 = null;
                listZzn = listSingletonList;
                i11 = -1;
                list4 = listZzn;
                iZzj = -1;
                list2 = list4;
                if (this.zzM != null) {
                    str2 = zzaasVarZza.zza;
                    str6 = "video/dolby-vision";
                }
                str4 = str6;
                boolean z17 = this.zzU;
                if (true != this.zzT) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i28 = (z17 ? 1 : 0) | i13;
                zzakVar = new zzak();
                if (!zzcc.zzf(str4)) {
                    if (zzcc.zzg(str4)) {
                        if (this.zzp == 0) {
                            i16 = this.zzn;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.zzl;
                            }
                            this.zzn = i16;
                            i17 = this.zzo;
                            if (i17 == -1) {
                                i17 = this.zzm;
                            }
                            this.zzo = i17;
                        } else {
                            iIntValue = -1;
                        }
                        i14 = this.zzn;
                        if (i14 != iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder8 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder8.put((byte) 0);
                                byteBufferOrder8.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) (this.zzK + 0.5f));
                                byteBufferOrder8.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder8.putShort((short) this.zzA);
                                byteBufferOrder8.putShort((short) this.zzB);
                            }
                            zzsVar = new zzs(this.zzx, this.zzz, this.zzy, bArr);
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzafp.zzg.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i19 = iIntValue;
                        } else {
                            i19 = iIntValue;
                        }
                        zzakVar.zzX(this.zzl);
                        zzakVar.zzF(this.zzm);
                        zzakVar.zzP(f10);
                        zzakVar.zzR(i19);
                        zzakVar.zzQ(this.zzu);
                        zzakVar.zzV(this.zzv);
                        zzakVar.zzy(zzsVar);
                        i18 = 2;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                        }
                        i18 = 3;
                    }
                    break;
                } else {
                    zzakVar.zzw(this.zzN);
                    zzakVar.zzT(this.zzP);
                    zzakVar.zzN(iZzj);
                }
                if (this.zza != null) {
                    zzakVar.zzJ(this.zza);
                }
                zzakVar.zzG(i10);
                zzakVar.zzS(str4);
                zzakVar.zzL(i11);
                zzakVar.zzK(this.zzY);
                zzakVar.zzU(i28);
                zzakVar.zzI(list2);
                zzakVar.zzx(str2);
                zzakVar.zzB(this.zzk);
                zzam zzamVarZzY8 = zzakVar.zzY();
                zzabz zzabzVarZzv8 = zzaazVar.zzv(this.zzc, i18);
                this.zzV = zzabzVarZzv8;
                zzabzVarZzv8.zzk(zzamVarZzY8);
                return;
            case 10:
                str6 = "video/x-unknown";
                listZzn = null;
                str2 = null;
                i11 = -1;
                list4 = listZzn;
                iZzj = -1;
                list2 = list4;
                if (this.zzM != null) {
                    str2 = zzaasVarZza.zza;
                    str6 = "video/dolby-vision";
                }
                str4 = str6;
                boolean z18 = this.zzU;
                if (true != this.zzT) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i29 = (z18 ? 1 : 0) | i13;
                zzakVar = new zzak();
                if (!zzcc.zzf(str4)) {
                    if (zzcc.zzg(str4)) {
                        if (this.zzp == 0) {
                            i16 = this.zzn;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.zzl;
                            }
                            this.zzn = i16;
                            i17 = this.zzo;
                            if (i17 == -1) {
                                i17 = this.zzm;
                            }
                            this.zzo = i17;
                        } else {
                            iIntValue = -1;
                        }
                        i14 = this.zzn;
                        if (i14 != iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder9 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder9.put((byte) 0);
                                byteBufferOrder9.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                                byteBufferOrder9.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder9.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder9.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder9.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder9.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder9.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder9.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder9.putShort((short) (this.zzK + 0.5f));
                                byteBufferOrder9.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder9.putShort((short) this.zzA);
                                byteBufferOrder9.putShort((short) this.zzB);
                            }
                            zzsVar = new zzs(this.zzx, this.zzz, this.zzy, bArr);
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzafp.zzg.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i19 = iIntValue;
                        } else {
                            i19 = iIntValue;
                        }
                        zzakVar.zzX(this.zzl);
                        zzakVar.zzF(this.zzm);
                        zzakVar.zzP(f10);
                        zzakVar.zzR(i19);
                        zzakVar.zzQ(this.zzu);
                        zzakVar.zzV(this.zzv);
                        zzakVar.zzy(zzsVar);
                        i18 = 2;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                        }
                        i18 = 3;
                    }
                    break;
                } else {
                    zzakVar.zzw(this.zzN);
                    zzakVar.zzT(this.zzP);
                    zzakVar.zzN(iZzj);
                }
                if (this.zza != null) {
                    zzakVar.zzJ(this.zza);
                }
                zzakVar.zzG(i10);
                zzakVar.zzS(str4);
                zzakVar.zzL(i11);
                zzakVar.zzK(this.zzY);
                zzakVar.zzU(i29);
                zzakVar.zzI(list2);
                zzakVar.zzx(str2);
                zzakVar.zzB(this.zzk);
                zzam zzamVarZzY9 = zzakVar.zzY();
                zzabz zzabzVarZzv9 = zzaazVar.zzv(this.zzc, i18);
                this.zzV = zzabzVarZzv9;
                zzabzVarZzv9.zzk(zzamVarZzY9);
                return;
            case 11:
                i20 = 8192;
                str6 = "audio/vorbis";
                listZzg = zzg(zzi(str5));
                str2 = null;
                list3 = listZzg;
                i11 = i20;
                list4 = list3;
                iZzj = -1;
                list2 = list4;
                if (this.zzM != null) {
                    str2 = zzaasVarZza.zza;
                    str6 = "video/dolby-vision";
                }
                str4 = str6;
                boolean z19 = this.zzU;
                if (true != this.zzT) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i210 = (z19 ? 1 : 0) | i13;
                zzakVar = new zzak();
                if (!zzcc.zzf(str4)) {
                    if (zzcc.zzg(str4)) {
                        if (this.zzp == 0) {
                            i16 = this.zzn;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.zzl;
                            }
                            this.zzn = i16;
                            i17 = this.zzo;
                            if (i17 == -1) {
                                i17 = this.zzm;
                            }
                            this.zzo = i17;
                        } else {
                            iIntValue = -1;
                        }
                        i14 = this.zzn;
                        if (i14 != iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder10 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder10.put((byte) 0);
                                byteBufferOrder10.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) (this.zzK + 0.5f));
                                byteBufferOrder10.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder10.putShort((short) this.zzA);
                                byteBufferOrder10.putShort((short) this.zzB);
                            }
                            zzsVar = new zzs(this.zzx, this.zzz, this.zzy, bArr);
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzafp.zzg.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i19 = iIntValue;
                        } else {
                            i19 = iIntValue;
                        }
                        zzakVar.zzX(this.zzl);
                        zzakVar.zzF(this.zzm);
                        zzakVar.zzP(f10);
                        zzakVar.zzR(i19);
                        zzakVar.zzQ(this.zzu);
                        zzakVar.zzV(this.zzv);
                        zzakVar.zzy(zzsVar);
                        i18 = 2;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                        }
                        i18 = 3;
                    }
                    break;
                } else {
                    zzakVar.zzw(this.zzN);
                    zzakVar.zzT(this.zzP);
                    zzakVar.zzN(iZzj);
                }
                if (this.zza != null) {
                    zzakVar.zzJ(this.zza);
                }
                zzakVar.zzG(i10);
                zzakVar.zzS(str4);
                zzakVar.zzL(i11);
                zzakVar.zzK(this.zzY);
                zzakVar.zzU(i210);
                zzakVar.zzI(list2);
                zzakVar.zzx(str2);
                zzakVar.zzB(this.zzk);
                zzam zzamVarZzY10 = zzakVar.zzY();
                zzabz zzabzVarZzv10 = zzaazVar.zzv(this.zzc, i18);
                this.zzV = zzabzVarZzv10;
                zzabzVarZzv10.zzk(zzamVarZzY10);
                return;
            case 12:
                i20 = 5760;
                ArrayList arrayList = new ArrayList(3);
                arrayList.add(zzi(this.zzb));
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                arrayList.add(byteBufferAllocate.order(byteOrder).putLong(this.zzQ).array());
                arrayList.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.zzR).array());
                str6 = "audio/opus";
                listZzg = arrayList;
                str2 = null;
                list3 = listZzg;
                i11 = i20;
                list4 = list3;
                iZzj = -1;
                list2 = list4;
                if (this.zzM != null) {
                    str2 = zzaasVarZza.zza;
                    str6 = "video/dolby-vision";
                }
                str4 = str6;
                boolean z110 = this.zzU;
                if (true != this.zzT) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i211 = (z110 ? 1 : 0) | i13;
                zzakVar = new zzak();
                if (!zzcc.zzf(str4)) {
                    if (zzcc.zzg(str4)) {
                        if (this.zzp == 0) {
                            i16 = this.zzn;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.zzl;
                            }
                            this.zzn = i16;
                            i17 = this.zzo;
                            if (i17 == -1) {
                                i17 = this.zzm;
                            }
                            this.zzo = i17;
                        } else {
                            iIntValue = -1;
                        }
                        i14 = this.zzn;
                        if (i14 != iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder11 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder11.put((byte) 0);
                                byteBufferOrder11.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) (this.zzK + 0.5f));
                                byteBufferOrder11.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder11.putShort((short) this.zzA);
                                byteBufferOrder11.putShort((short) this.zzB);
                            }
                            zzsVar = new zzs(this.zzx, this.zzz, this.zzy, bArr);
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzafp.zzg.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i19 = iIntValue;
                        } else {
                            i19 = iIntValue;
                        }
                        zzakVar.zzX(this.zzl);
                        zzakVar.zzF(this.zzm);
                        zzakVar.zzP(f10);
                        zzakVar.zzR(i19);
                        zzakVar.zzQ(this.zzu);
                        zzakVar.zzV(this.zzv);
                        zzakVar.zzy(zzsVar);
                        i18 = 2;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                        }
                        i18 = 3;
                    }
                    break;
                } else {
                    zzakVar.zzw(this.zzN);
                    zzakVar.zzT(this.zzP);
                    zzakVar.zzN(iZzj);
                }
                if (this.zza != null) {
                    zzakVar.zzJ(this.zza);
                }
                zzakVar.zzG(i10);
                zzakVar.zzS(str4);
                zzakVar.zzL(i11);
                zzakVar.zzK(this.zzY);
                zzakVar.zzU(i211);
                zzakVar.zzI(list2);
                zzakVar.zzx(str2);
                zzakVar.zzB(this.zzk);
                zzam zzamVarZzY11 = zzakVar.zzY();
                zzabz zzabzVarZzv11 = zzaazVar.zzv(this.zzc, i18);
                this.zzV = zzabzVarZzv11;
                zzabzVarZzv11.zzk(zzamVarZzY11);
                return;
            case 13:
                List listSingletonList2 = Collections.singletonList(zzi(str5));
                zzzt zzztVarZza = zzzu.zza(this.zzj);
                this.zzP = zzztVarZza.zza;
                this.zzN = zzztVarZza.zzb;
                str2 = zzztVarZza.zzc;
                str6 = "audio/mp4a-latm";
                listZzn = listSingletonList2;
                i11 = -1;
                list4 = listZzn;
                iZzj = -1;
                list2 = list4;
                if (this.zzM != null) {
                    str2 = zzaasVarZza.zza;
                    str6 = "video/dolby-vision";
                }
                str4 = str6;
                boolean z111 = this.zzU;
                if (true != this.zzT) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i212 = (z111 ? 1 : 0) | i13;
                zzakVar = new zzak();
                if (!zzcc.zzf(str4)) {
                    if (zzcc.zzg(str4)) {
                        if (this.zzp == 0) {
                            i16 = this.zzn;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.zzl;
                            }
                            this.zzn = i16;
                            i17 = this.zzo;
                            if (i17 == -1) {
                                i17 = this.zzm;
                            }
                            this.zzo = i17;
                        } else {
                            iIntValue = -1;
                        }
                        i14 = this.zzn;
                        if (i14 != iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder12 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder12.put((byte) 0);
                                byteBufferOrder12.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) (this.zzK + 0.5f));
                                byteBufferOrder12.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder12.putShort((short) this.zzA);
                                byteBufferOrder12.putShort((short) this.zzB);
                            }
                            zzsVar = new zzs(this.zzx, this.zzz, this.zzy, bArr);
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzafp.zzg.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i19 = iIntValue;
                        } else {
                            i19 = iIntValue;
                        }
                        zzakVar.zzX(this.zzl);
                        zzakVar.zzF(this.zzm);
                        zzakVar.zzP(f10);
                        zzakVar.zzR(i19);
                        zzakVar.zzQ(this.zzu);
                        zzakVar.zzV(this.zzv);
                        zzakVar.zzy(zzsVar);
                        i18 = 2;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                        }
                        i18 = 3;
                    }
                    break;
                } else {
                    zzakVar.zzw(this.zzN);
                    zzakVar.zzT(this.zzP);
                    zzakVar.zzN(iZzj);
                }
                if (this.zza != null) {
                    zzakVar.zzJ(this.zza);
                }
                zzakVar.zzG(i10);
                zzakVar.zzS(str4);
                zzakVar.zzL(i11);
                zzakVar.zzK(this.zzY);
                zzakVar.zzU(i212);
                zzakVar.zzI(list2);
                zzakVar.zzx(str2);
                zzakVar.zzB(this.zzk);
                zzam zzamVarZzY12 = zzakVar.zzY();
                zzabz zzabzVarZzv12 = zzaazVar.zzv(this.zzc, i18);
                this.zzV = zzabzVarZzv12;
                zzabzVarZzv12.zzk(zzamVarZzY12);
                return;
            case 14:
                str6 = "audio/mpeg-L2";
                list3 = null;
                str2 = null;
                i11 = i20;
                list4 = list3;
                iZzj = -1;
                list2 = list4;
                if (this.zzM != null) {
                    str2 = zzaasVarZza.zza;
                    str6 = "video/dolby-vision";
                }
                str4 = str6;
                boolean z112 = this.zzU;
                if (true != this.zzT) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i213 = (z112 ? 1 : 0) | i13;
                zzakVar = new zzak();
                if (!zzcc.zzf(str4)) {
                    if (zzcc.zzg(str4)) {
                        if (this.zzp == 0) {
                            i16 = this.zzn;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.zzl;
                            }
                            this.zzn = i16;
                            i17 = this.zzo;
                            if (i17 == -1) {
                                i17 = this.zzm;
                            }
                            this.zzo = i17;
                        } else {
                            iIntValue = -1;
                        }
                        i14 = this.zzn;
                        if (i14 != iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder13 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder13.put((byte) 0);
                                byteBufferOrder13.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) (this.zzK + 0.5f));
                                byteBufferOrder13.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder13.putShort((short) this.zzA);
                                byteBufferOrder13.putShort((short) this.zzB);
                            }
                            zzsVar = new zzs(this.zzx, this.zzz, this.zzy, bArr);
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzafp.zzg.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i19 = iIntValue;
                        } else {
                            i19 = iIntValue;
                        }
                        zzakVar.zzX(this.zzl);
                        zzakVar.zzF(this.zzm);
                        zzakVar.zzP(f10);
                        zzakVar.zzR(i19);
                        zzakVar.zzQ(this.zzu);
                        zzakVar.zzV(this.zzv);
                        zzakVar.zzy(zzsVar);
                        i18 = 2;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                        }
                        i18 = 3;
                    }
                    break;
                } else {
                    zzakVar.zzw(this.zzN);
                    zzakVar.zzT(this.zzP);
                    zzakVar.zzN(iZzj);
                }
                if (this.zza != null) {
                    zzakVar.zzJ(this.zza);
                }
                zzakVar.zzG(i10);
                zzakVar.zzS(str4);
                zzakVar.zzL(i11);
                zzakVar.zzK(this.zzY);
                zzakVar.zzU(i213);
                zzakVar.zzI(list2);
                zzakVar.zzx(str2);
                zzakVar.zzB(this.zzk);
                zzam zzamVarZzY13 = zzakVar.zzY();
                zzabz zzabzVarZzv13 = zzaazVar.zzv(this.zzc, i18);
                this.zzV = zzabzVarZzv13;
                zzabzVarZzv13.zzk(zzamVarZzY13);
                return;
            case 15:
                str6 = "audio/mpeg";
                list3 = null;
                str2 = null;
                i11 = i20;
                list4 = list3;
                iZzj = -1;
                list2 = list4;
                if (this.zzM != null) {
                    str2 = zzaasVarZza.zza;
                    str6 = "video/dolby-vision";
                }
                str4 = str6;
                boolean z113 = this.zzU;
                if (true != this.zzT) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i214 = (z113 ? 1 : 0) | i13;
                zzakVar = new zzak();
                if (!zzcc.zzf(str4)) {
                    if (zzcc.zzg(str4)) {
                        if (this.zzp == 0) {
                            i16 = this.zzn;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.zzl;
                            }
                            this.zzn = i16;
                            i17 = this.zzo;
                            if (i17 == -1) {
                                i17 = this.zzm;
                            }
                            this.zzo = i17;
                        } else {
                            iIntValue = -1;
                        }
                        i14 = this.zzn;
                        if (i14 != iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder14 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder14.put((byte) 0);
                                byteBufferOrder14.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) (this.zzK + 0.5f));
                                byteBufferOrder14.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder14.putShort((short) this.zzA);
                                byteBufferOrder14.putShort((short) this.zzB);
                            }
                            zzsVar = new zzs(this.zzx, this.zzz, this.zzy, bArr);
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzafp.zzg.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i19 = iIntValue;
                        } else {
                            i19 = iIntValue;
                        }
                        zzakVar.zzX(this.zzl);
                        zzakVar.zzF(this.zzm);
                        zzakVar.zzP(f10);
                        zzakVar.zzR(i19);
                        zzakVar.zzQ(this.zzu);
                        zzakVar.zzV(this.zzv);
                        zzakVar.zzy(zzsVar);
                        i18 = 2;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                        }
                        i18 = 3;
                    }
                    break;
                } else {
                    zzakVar.zzw(this.zzN);
                    zzakVar.zzT(this.zzP);
                    zzakVar.zzN(iZzj);
                }
                if (this.zza != null) {
                    zzakVar.zzJ(this.zza);
                }
                zzakVar.zzG(i10);
                zzakVar.zzS(str4);
                zzakVar.zzL(i11);
                zzakVar.zzK(this.zzY);
                zzakVar.zzU(i214);
                zzakVar.zzI(list2);
                zzakVar.zzx(str2);
                zzakVar.zzB(this.zzk);
                zzam zzamVarZzY14 = zzakVar.zzY();
                zzabz zzabzVarZzv14 = zzaazVar.zzv(this.zzc, i18);
                this.zzV = zzabzVarZzv14;
                zzabzVarZzv14.zzk(zzamVarZzY14);
                return;
            case 16:
                str6 = "audio/ac3";
                listZzn = null;
                str2 = null;
                i11 = -1;
                list4 = listZzn;
                iZzj = -1;
                list2 = list4;
                if (this.zzM != null) {
                    str2 = zzaasVarZza.zza;
                    str6 = "video/dolby-vision";
                }
                str4 = str6;
                boolean z114 = this.zzU;
                if (true != this.zzT) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i215 = (z114 ? 1 : 0) | i13;
                zzakVar = new zzak();
                if (!zzcc.zzf(str4)) {
                    if (zzcc.zzg(str4)) {
                        if (this.zzp == 0) {
                            i16 = this.zzn;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.zzl;
                            }
                            this.zzn = i16;
                            i17 = this.zzo;
                            if (i17 == -1) {
                                i17 = this.zzm;
                            }
                            this.zzo = i17;
                        } else {
                            iIntValue = -1;
                        }
                        i14 = this.zzn;
                        if (i14 != iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder15 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder15.put((byte) 0);
                                byteBufferOrder15.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) (this.zzK + 0.5f));
                                byteBufferOrder15.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder15.putShort((short) this.zzA);
                                byteBufferOrder15.putShort((short) this.zzB);
                            }
                            zzsVar = new zzs(this.zzx, this.zzz, this.zzy, bArr);
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzafp.zzg.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i19 = iIntValue;
                        } else {
                            i19 = iIntValue;
                        }
                        zzakVar.zzX(this.zzl);
                        zzakVar.zzF(this.zzm);
                        zzakVar.zzP(f10);
                        zzakVar.zzR(i19);
                        zzakVar.zzQ(this.zzu);
                        zzakVar.zzV(this.zzv);
                        zzakVar.zzy(zzsVar);
                        i18 = 2;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                        }
                        i18 = 3;
                    }
                    break;
                } else {
                    zzakVar.zzw(this.zzN);
                    zzakVar.zzT(this.zzP);
                    zzakVar.zzN(iZzj);
                }
                if (this.zza != null) {
                    zzakVar.zzJ(this.zza);
                }
                zzakVar.zzG(i10);
                zzakVar.zzS(str4);
                zzakVar.zzL(i11);
                zzakVar.zzK(this.zzY);
                zzakVar.zzU(i215);
                zzakVar.zzI(list2);
                zzakVar.zzx(str2);
                zzakVar.zzB(this.zzk);
                zzam zzamVarZzY15 = zzakVar.zzY();
                zzabz zzabzVarZzv15 = zzaazVar.zzv(this.zzc, i18);
                this.zzV = zzabzVarZzv15;
                zzabzVarZzv15.zzk(zzamVarZzY15);
                return;
            case 17:
                str6 = "audio/eac3";
                listZzn = null;
                str2 = null;
                i11 = -1;
                list4 = listZzn;
                iZzj = -1;
                list2 = list4;
                if (this.zzM != null) {
                    str2 = zzaasVarZza.zza;
                    str6 = "video/dolby-vision";
                }
                str4 = str6;
                boolean z115 = this.zzU;
                if (true != this.zzT) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i216 = (z115 ? 1 : 0) | i13;
                zzakVar = new zzak();
                if (!zzcc.zzf(str4)) {
                    if (zzcc.zzg(str4)) {
                        if (this.zzp == 0) {
                            i16 = this.zzn;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.zzl;
                            }
                            this.zzn = i16;
                            i17 = this.zzo;
                            if (i17 == -1) {
                                i17 = this.zzm;
                            }
                            this.zzo = i17;
                        } else {
                            iIntValue = -1;
                        }
                        i14 = this.zzn;
                        if (i14 != iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder16 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder16.put((byte) 0);
                                byteBufferOrder16.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) (this.zzK + 0.5f));
                                byteBufferOrder16.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder16.putShort((short) this.zzA);
                                byteBufferOrder16.putShort((short) this.zzB);
                            }
                            zzsVar = new zzs(this.zzx, this.zzz, this.zzy, bArr);
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzafp.zzg.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i19 = iIntValue;
                        } else {
                            i19 = iIntValue;
                        }
                        zzakVar.zzX(this.zzl);
                        zzakVar.zzF(this.zzm);
                        zzakVar.zzP(f10);
                        zzakVar.zzR(i19);
                        zzakVar.zzQ(this.zzu);
                        zzakVar.zzV(this.zzv);
                        zzakVar.zzy(zzsVar);
                        i18 = 2;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                        }
                        i18 = 3;
                    }
                    break;
                } else {
                    zzakVar.zzw(this.zzN);
                    zzakVar.zzT(this.zzP);
                    zzakVar.zzN(iZzj);
                }
                if (this.zza != null) {
                    zzakVar.zzJ(this.zza);
                }
                zzakVar.zzG(i10);
                zzakVar.zzS(str4);
                zzakVar.zzL(i11);
                zzakVar.zzK(this.zzY);
                zzakVar.zzU(i216);
                zzakVar.zzI(list2);
                zzakVar.zzx(str2);
                zzakVar.zzB(this.zzk);
                zzam zzamVarZzY16 = zzakVar.zzY();
                zzabz zzabzVarZzv16 = zzaazVar.zzv(this.zzc, i18);
                this.zzV = zzabzVarZzv16;
                zzabzVarZzv16.zzk(zzamVarZzY16);
                return;
            case 18:
                this.zzS = new zzaca();
                str6 = "audio/true-hd";
                listZzn = null;
                str2 = null;
                i11 = -1;
                list4 = listZzn;
                iZzj = -1;
                list2 = list4;
                if (this.zzM != null) {
                    str2 = zzaasVarZza.zza;
                    str6 = "video/dolby-vision";
                }
                str4 = str6;
                boolean z116 = this.zzU;
                if (true != this.zzT) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i217 = (z116 ? 1 : 0) | i13;
                zzakVar = new zzak();
                if (!zzcc.zzf(str4)) {
                    if (zzcc.zzg(str4)) {
                        if (this.zzp == 0) {
                            i16 = this.zzn;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.zzl;
                            }
                            this.zzn = i16;
                            i17 = this.zzo;
                            if (i17 == -1) {
                                i17 = this.zzm;
                            }
                            this.zzo = i17;
                        } else {
                            iIntValue = -1;
                        }
                        i14 = this.zzn;
                        if (i14 != iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder17 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder17.put((byte) 0);
                                byteBufferOrder17.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) (this.zzK + 0.5f));
                                byteBufferOrder17.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder17.putShort((short) this.zzA);
                                byteBufferOrder17.putShort((short) this.zzB);
                            }
                            zzsVar = new zzs(this.zzx, this.zzz, this.zzy, bArr);
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzafp.zzg.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i19 = iIntValue;
                        } else {
                            i19 = iIntValue;
                        }
                        zzakVar.zzX(this.zzl);
                        zzakVar.zzF(this.zzm);
                        zzakVar.zzP(f10);
                        zzakVar.zzR(i19);
                        zzakVar.zzQ(this.zzu);
                        zzakVar.zzV(this.zzv);
                        zzakVar.zzy(zzsVar);
                        i18 = 2;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                        }
                        i18 = 3;
                    }
                    break;
                } else {
                    zzakVar.zzw(this.zzN);
                    zzakVar.zzT(this.zzP);
                    zzakVar.zzN(iZzj);
                }
                if (this.zza != null) {
                    zzakVar.zzJ(this.zza);
                }
                zzakVar.zzG(i10);
                zzakVar.zzS(str4);
                zzakVar.zzL(i11);
                zzakVar.zzK(this.zzY);
                zzakVar.zzU(i217);
                zzakVar.zzI(list2);
                zzakVar.zzx(str2);
                zzakVar.zzB(this.zzk);
                zzam zzamVarZzY17 = zzakVar.zzY();
                zzabz zzabzVarZzv17 = zzaazVar.zzv(this.zzc, i18);
                this.zzV = zzabzVarZzv17;
                zzabzVarZzv17.zzk(zzamVarZzY17);
                return;
            case 19:
            case 20:
                str6 = "audio/vnd.dts";
                listZzn = null;
                str2 = null;
                i11 = -1;
                list4 = listZzn;
                iZzj = -1;
                list2 = list4;
                if (this.zzM != null) {
                    str2 = zzaasVarZza.zza;
                    str6 = "video/dolby-vision";
                }
                str4 = str6;
                boolean z117 = this.zzU;
                if (true != this.zzT) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i218 = (z117 ? 1 : 0) | i13;
                zzakVar = new zzak();
                if (!zzcc.zzf(str4)) {
                    if (zzcc.zzg(str4)) {
                        if (this.zzp == 0) {
                            i16 = this.zzn;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.zzl;
                            }
                            this.zzn = i16;
                            i17 = this.zzo;
                            if (i17 == -1) {
                                i17 = this.zzm;
                            }
                            this.zzo = i17;
                        } else {
                            iIntValue = -1;
                        }
                        i14 = this.zzn;
                        if (i14 != iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder18 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder18.put((byte) 0);
                                byteBufferOrder18.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) (this.zzK + 0.5f));
                                byteBufferOrder18.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder18.putShort((short) this.zzA);
                                byteBufferOrder18.putShort((short) this.zzB);
                            }
                            zzsVar = new zzs(this.zzx, this.zzz, this.zzy, bArr);
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzafp.zzg.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i19 = iIntValue;
                        } else {
                            i19 = iIntValue;
                        }
                        zzakVar.zzX(this.zzl);
                        zzakVar.zzF(this.zzm);
                        zzakVar.zzP(f10);
                        zzakVar.zzR(i19);
                        zzakVar.zzQ(this.zzu);
                        zzakVar.zzV(this.zzv);
                        zzakVar.zzy(zzsVar);
                        i18 = 2;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                        }
                        i18 = 3;
                    }
                    break;
                } else {
                    zzakVar.zzw(this.zzN);
                    zzakVar.zzT(this.zzP);
                    zzakVar.zzN(iZzj);
                }
                if (this.zza != null) {
                    zzakVar.zzJ(this.zza);
                }
                zzakVar.zzG(i10);
                zzakVar.zzS(str4);
                zzakVar.zzL(i11);
                zzakVar.zzK(this.zzY);
                zzakVar.zzU(i218);
                zzakVar.zzI(list2);
                zzakVar.zzx(str2);
                zzakVar.zzB(this.zzk);
                zzam zzamVarZzY18 = zzakVar.zzY();
                zzabz zzabzVarZzv18 = zzaazVar.zzv(this.zzc, i18);
                this.zzV = zzabzVarZzv18;
                zzabzVarZzv18.zzk(zzamVarZzY18);
                return;
            case 21:
                str6 = "audio/vnd.dts.hd";
                listZzn = null;
                str2 = null;
                i11 = -1;
                list4 = listZzn;
                iZzj = -1;
                list2 = list4;
                if (this.zzM != null) {
                    str2 = zzaasVarZza.zza;
                    str6 = "video/dolby-vision";
                }
                str4 = str6;
                boolean z118 = this.zzU;
                if (true != this.zzT) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i219 = (z118 ? 1 : 0) | i13;
                zzakVar = new zzak();
                if (!zzcc.zzf(str4)) {
                    if (zzcc.zzg(str4)) {
                        if (this.zzp == 0) {
                            i16 = this.zzn;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.zzl;
                            }
                            this.zzn = i16;
                            i17 = this.zzo;
                            if (i17 == -1) {
                                i17 = this.zzm;
                            }
                            this.zzo = i17;
                        } else {
                            iIntValue = -1;
                        }
                        i14 = this.zzn;
                        if (i14 != iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder19 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder19.put((byte) 0);
                                byteBufferOrder19.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) (this.zzK + 0.5f));
                                byteBufferOrder19.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder19.putShort((short) this.zzA);
                                byteBufferOrder19.putShort((short) this.zzB);
                            }
                            zzsVar = new zzs(this.zzx, this.zzz, this.zzy, bArr);
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzafp.zzg.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i19 = iIntValue;
                        } else {
                            i19 = iIntValue;
                        }
                        zzakVar.zzX(this.zzl);
                        zzakVar.zzF(this.zzm);
                        zzakVar.zzP(f10);
                        zzakVar.zzR(i19);
                        zzakVar.zzQ(this.zzu);
                        zzakVar.zzV(this.zzv);
                        zzakVar.zzy(zzsVar);
                        i18 = 2;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                        }
                        i18 = 3;
                    }
                    break;
                } else {
                    zzakVar.zzw(this.zzN);
                    zzakVar.zzT(this.zzP);
                    zzakVar.zzN(iZzj);
                }
                if (this.zza != null) {
                    zzakVar.zzJ(this.zza);
                }
                zzakVar.zzG(i10);
                zzakVar.zzS(str4);
                zzakVar.zzL(i11);
                zzakVar.zzK(this.zzY);
                zzakVar.zzU(i219);
                zzakVar.zzI(list2);
                zzakVar.zzx(str2);
                zzakVar.zzB(this.zzk);
                zzam zzamVarZzY19 = zzakVar.zzY();
                zzabz zzabzVarZzv19 = zzaazVar.zzv(this.zzc, i18);
                this.zzV = zzabzVarZzv19;
                zzabzVarZzv19.zzk(zzamVarZzY19);
                return;
            case 22:
                str6 = "audio/flac";
                listSingletonList = Collections.singletonList(zzi(str5));
                str2 = null;
                listZzn = listSingletonList;
                i11 = -1;
                list4 = listZzn;
                iZzj = -1;
                list2 = list4;
                if (this.zzM != null) {
                    str2 = zzaasVarZza.zza;
                    str6 = "video/dolby-vision";
                }
                str4 = str6;
                boolean z119 = this.zzU;
                if (true != this.zzT) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i2110 = (z119 ? 1 : 0) | i13;
                zzakVar = new zzak();
                if (!zzcc.zzf(str4)) {
                    if (zzcc.zzg(str4)) {
                        if (this.zzp == 0) {
                            i16 = this.zzn;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.zzl;
                            }
                            this.zzn = i16;
                            i17 = this.zzo;
                            if (i17 == -1) {
                                i17 = this.zzm;
                            }
                            this.zzo = i17;
                        } else {
                            iIntValue = -1;
                        }
                        i14 = this.zzn;
                        if (i14 != iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder110 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder110.put((byte) 0);
                                byteBufferOrder110.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) (this.zzK + 0.5f));
                                byteBufferOrder110.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder110.putShort((short) this.zzA);
                                byteBufferOrder110.putShort((short) this.zzB);
                            }
                            zzsVar = new zzs(this.zzx, this.zzz, this.zzy, bArr);
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzafp.zzg.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i19 = iIntValue;
                        } else {
                            i19 = iIntValue;
                        }
                        zzakVar.zzX(this.zzl);
                        zzakVar.zzF(this.zzm);
                        zzakVar.zzP(f10);
                        zzakVar.zzR(i19);
                        zzakVar.zzQ(this.zzu);
                        zzakVar.zzV(this.zzv);
                        zzakVar.zzy(zzsVar);
                        i18 = 2;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                        }
                        i18 = 3;
                    }
                    break;
                } else {
                    zzakVar.zzw(this.zzN);
                    zzakVar.zzT(this.zzP);
                    zzakVar.zzN(iZzj);
                }
                if (this.zza != null) {
                    zzakVar.zzJ(this.zza);
                }
                zzakVar.zzG(i10);
                zzakVar.zzS(str4);
                zzakVar.zzL(i11);
                zzakVar.zzK(this.zzY);
                zzakVar.zzU(i2110);
                zzakVar.zzI(list2);
                zzakVar.zzx(str2);
                zzakVar.zzB(this.zzk);
                zzam zzamVarZzY110 = zzakVar.zzY();
                zzabz zzabzVarZzv110 = zzaazVar.zzv(this.zzc, i18);
                this.zzV = zzabzVarZzv110;
                zzabzVarZzv110.zzk(zzamVarZzY110);
                return;
            case 23:
                if (zzh(new zzfa(zzi(this.zzb)))) {
                    iZzj = zzfj.zzj(this.zzO);
                    if (iZzj == 0) {
                        i12 = this.zzO;
                        sb2 = new StringBuilder();
                        str3 = "Unsupported PCM bit depth: ";
                        sb2.append(str3);
                        sb2.append(i12);
                        sb2.append(". Setting mimeType to audio/x-unknown");
                        string = sb2.toString();
                    } else {
                        list2 = null;
                        str2 = null;
                        i11 = -1;
                    }
                    if (this.zzM != null) {
                        str2 = zzaasVarZza.zza;
                        str6 = "video/dolby-vision";
                    }
                    str4 = str6;
                    boolean z1110 = this.zzU;
                    if (true != this.zzT) {
                        i13 = 0;
                    } else {
                        i13 = 2;
                    }
                    int i2111 = (z1110 ? 1 : 0) | i13;
                    zzakVar = new zzak();
                    if (!zzcc.zzf(str4)) {
                        if (zzcc.zzg(str4)) {
                            if (this.zzp == 0) {
                                i16 = this.zzn;
                                iIntValue = -1;
                                if (i16 == -1) {
                                    i16 = this.zzl;
                                }
                                this.zzn = i16;
                                i17 = this.zzo;
                                if (i17 == -1) {
                                    i17 = this.zzm;
                                }
                                this.zzo = i17;
                            } else {
                                iIntValue = -1;
                            }
                            i14 = this.zzn;
                            if (i14 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.zzw) {
                                if (this.zzC != -1.0f) {
                                    bArr = new byte[25];
                                    ByteBuffer byteBufferOrder111 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                    byteBufferOrder111.put((byte) 0);
                                    byteBufferOrder111.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                                    byteBufferOrder111.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                    byteBufferOrder111.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                    byteBufferOrder111.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                    byteBufferOrder111.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                    byteBufferOrder111.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                    byteBufferOrder111.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                    byteBufferOrder111.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                    byteBufferOrder111.putShort((short) (this.zzK + 0.5f));
                                    byteBufferOrder111.putShort((short) (this.zzL + 0.5f));
                                    byteBufferOrder111.putShort((short) this.zzA);
                                    byteBufferOrder111.putShort((short) this.zzB);
                                }
                                zzsVar = new zzs(this.zzx, this.zzz, this.zzy, bArr);
                            }
                            if (this.zza != null) {
                                iIntValue = ((Integer) zzafp.zzg.get(this.zza)).intValue();
                            }
                            if (this.zzq == 0) {
                                i19 = iIntValue;
                            } else {
                                i19 = iIntValue;
                            }
                            zzakVar.zzX(this.zzl);
                            zzakVar.zzF(this.zzm);
                            zzakVar.zzP(f10);
                            zzakVar.zzR(i19);
                            zzakVar.zzQ(this.zzu);
                            zzakVar.zzV(this.zzv);
                            zzakVar.zzy(zzsVar);
                            i18 = 2;
                        } else {
                            if ("application/x-subrip".equals(str4)) {
                            }
                            i18 = 3;
                        }
                        break;
                    } else {
                        zzakVar.zzw(this.zzN);
                        zzakVar.zzT(this.zzP);
                        zzakVar.zzN(iZzj);
                    }
                    if (this.zza != null) {
                        zzakVar.zzJ(this.zza);
                    }
                    zzakVar.zzG(i10);
                    zzakVar.zzS(str4);
                    zzakVar.zzL(i11);
                    zzakVar.zzK(this.zzY);
                    zzakVar.zzU(i2111);
                    zzakVar.zzI(list2);
                    zzakVar.zzx(str2);
                    zzakVar.zzB(this.zzk);
                    zzam zzamVarZzY111 = zzakVar.zzY();
                    zzabz zzabzVarZzv111 = zzaazVar.zzv(this.zzc, i18);
                    this.zzV = zzabzVarZzv111;
                    zzabzVarZzv111.zzk(zzamVarZzY111);
                    return;
                }
                string = "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown";
                zzer.zzf("MatroskaExtractor", string);
                listZzn = null;
                str2 = null;
                str6 = "audio/x-unknown";
                i11 = -1;
                list4 = listZzn;
                iZzj = -1;
                list2 = list4;
                if (this.zzM != null) {
                    str2 = zzaasVarZza.zza;
                    str6 = "video/dolby-vision";
                }
                str4 = str6;
                boolean z1111 = this.zzU;
                if (true != this.zzT) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i2112 = (z1111 ? 1 : 0) | i13;
                zzakVar = new zzak();
                if (!zzcc.zzf(str4)) {
                    if (zzcc.zzg(str4)) {
                        if (this.zzp == 0) {
                            i16 = this.zzn;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.zzl;
                            }
                            this.zzn = i16;
                            i17 = this.zzo;
                            if (i17 == -1) {
                                i17 = this.zzm;
                            }
                            this.zzo = i17;
                        } else {
                            iIntValue = -1;
                        }
                        i14 = this.zzn;
                        if (i14 != iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder112 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder112.put((byte) 0);
                                byteBufferOrder112.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) (this.zzK + 0.5f));
                                byteBufferOrder112.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder112.putShort((short) this.zzA);
                                byteBufferOrder112.putShort((short) this.zzB);
                            }
                            zzsVar = new zzs(this.zzx, this.zzz, this.zzy, bArr);
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzafp.zzg.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i19 = iIntValue;
                        } else {
                            i19 = iIntValue;
                        }
                        zzakVar.zzX(this.zzl);
                        zzakVar.zzF(this.zzm);
                        zzakVar.zzP(f10);
                        zzakVar.zzR(i19);
                        zzakVar.zzQ(this.zzu);
                        zzakVar.zzV(this.zzv);
                        zzakVar.zzy(zzsVar);
                        i18 = 2;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                        }
                        i18 = 3;
                    }
                    break;
                } else {
                    zzakVar.zzw(this.zzN);
                    zzakVar.zzT(this.zzP);
                    zzakVar.zzN(iZzj);
                }
                if (this.zza != null) {
                    zzakVar.zzJ(this.zza);
                }
                zzakVar.zzG(i10);
                zzakVar.zzS(str4);
                zzakVar.zzL(i11);
                zzakVar.zzK(this.zzY);
                zzakVar.zzU(i2112);
                zzakVar.zzI(list2);
                zzakVar.zzx(str2);
                zzakVar.zzB(this.zzk);
                zzam zzamVarZzY112 = zzakVar.zzY();
                zzabz zzabzVarZzv112 = zzaazVar.zzv(this.zzc, i18);
                this.zzV = zzabzVarZzv112;
                zzabzVarZzv112.zzk(zzamVarZzY112);
                return;
            case 24:
                iZzj = zzfj.zzj(this.zzO);
                if (iZzj == 0) {
                    i12 = this.zzO;
                    sb2 = new StringBuilder();
                    str3 = "Unsupported little endian PCM bit depth: ";
                    sb2.append(str3);
                    sb2.append(i12);
                    sb2.append(". Setting mimeType to audio/x-unknown");
                    string = sb2.toString();
                    zzer.zzf("MatroskaExtractor", string);
                    listZzn = null;
                    str2 = null;
                    str6 = "audio/x-unknown";
                    i11 = -1;
                    list4 = listZzn;
                    iZzj = -1;
                    list2 = list4;
                } else {
                    list2 = null;
                    str2 = null;
                    i11 = -1;
                }
                if (this.zzM != null) {
                    str2 = zzaasVarZza.zza;
                    str6 = "video/dolby-vision";
                }
                str4 = str6;
                boolean z1112 = this.zzU;
                if (true != this.zzT) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i2113 = (z1112 ? 1 : 0) | i13;
                zzakVar = new zzak();
                if (!zzcc.zzf(str4)) {
                    if (zzcc.zzg(str4)) {
                        if (this.zzp == 0) {
                            i16 = this.zzn;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.zzl;
                            }
                            this.zzn = i16;
                            i17 = this.zzo;
                            if (i17 == -1) {
                                i17 = this.zzm;
                            }
                            this.zzo = i17;
                        } else {
                            iIntValue = -1;
                        }
                        i14 = this.zzn;
                        if (i14 != iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder113 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder113.put((byte) 0);
                                byteBufferOrder113.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) (this.zzK + 0.5f));
                                byteBufferOrder113.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder113.putShort((short) this.zzA);
                                byteBufferOrder113.putShort((short) this.zzB);
                            }
                            zzsVar = new zzs(this.zzx, this.zzz, this.zzy, bArr);
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzafp.zzg.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i19 = iIntValue;
                        } else {
                            i19 = iIntValue;
                        }
                        zzakVar.zzX(this.zzl);
                        zzakVar.zzF(this.zzm);
                        zzakVar.zzP(f10);
                        zzakVar.zzR(i19);
                        zzakVar.zzQ(this.zzu);
                        zzakVar.zzV(this.zzv);
                        zzakVar.zzy(zzsVar);
                        i18 = 2;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                        }
                        i18 = 3;
                    }
                    break;
                } else {
                    zzakVar.zzw(this.zzN);
                    zzakVar.zzT(this.zzP);
                    zzakVar.zzN(iZzj);
                }
                if (this.zza != null) {
                    zzakVar.zzJ(this.zza);
                }
                zzakVar.zzG(i10);
                zzakVar.zzS(str4);
                zzakVar.zzL(i11);
                zzakVar.zzK(this.zzY);
                zzakVar.zzU(i2113);
                zzakVar.zzI(list2);
                zzakVar.zzx(str2);
                zzakVar.zzB(this.zzk);
                zzam zzamVarZzY113 = zzakVar.zzY();
                zzabz zzabzVarZzv113 = zzaazVar.zzv(this.zzc, i18);
                this.zzV = zzabzVarZzv113;
                zzabzVarZzv113.zzk(zzamVarZzY113);
                return;
            case 25:
                i12 = this.zzO;
                if (i12 == 8) {
                    iZzj = 3;
                } else {
                    if (i12 != 16) {
                        sb2 = new StringBuilder();
                        str3 = "Unsupported big endian PCM bit depth: ";
                        sb2.append(str3);
                        sb2.append(i12);
                        sb2.append(". Setting mimeType to audio/x-unknown");
                        string = sb2.toString();
                        zzer.zzf("MatroskaExtractor", string);
                        listZzn = null;
                        str2 = null;
                        str6 = "audio/x-unknown";
                        i11 = -1;
                        list4 = listZzn;
                        iZzj = -1;
                        list2 = list4;
                        if (this.zzM != null) {
                            str2 = zzaasVarZza.zza;
                            str6 = "video/dolby-vision";
                        }
                        str4 = str6;
                        boolean z1113 = this.zzU;
                        if (true != this.zzT) {
                            i13 = 0;
                        } else {
                            i13 = 2;
                        }
                        int i2114 = (z1113 ? 1 : 0) | i13;
                        zzakVar = new zzak();
                        if (!zzcc.zzf(str4)) {
                            if (zzcc.zzg(str4)) {
                                if (this.zzp == 0) {
                                    i16 = this.zzn;
                                    iIntValue = -1;
                                    if (i16 == -1) {
                                        i16 = this.zzl;
                                    }
                                    this.zzn = i16;
                                    i17 = this.zzo;
                                    if (i17 == -1) {
                                        i17 = this.zzm;
                                    }
                                    this.zzo = i17;
                                } else {
                                    iIntValue = -1;
                                }
                                i14 = this.zzn;
                                if (i14 != iIntValue) {
                                    f10 = -1.0f;
                                } else {
                                    f10 = -1.0f;
                                }
                                if (this.zzw) {
                                    if (this.zzC != -1.0f) {
                                        bArr = new byte[25];
                                        ByteBuffer byteBufferOrder114 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                        byteBufferOrder114.put((byte) 0);
                                        byteBufferOrder114.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                                        byteBufferOrder114.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                        byteBufferOrder114.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                        byteBufferOrder114.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                        byteBufferOrder114.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                        byteBufferOrder114.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                        byteBufferOrder114.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                        byteBufferOrder114.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                        byteBufferOrder114.putShort((short) (this.zzK + 0.5f));
                                        byteBufferOrder114.putShort((short) (this.zzL + 0.5f));
                                        byteBufferOrder114.putShort((short) this.zzA);
                                        byteBufferOrder114.putShort((short) this.zzB);
                                    }
                                    zzsVar = new zzs(this.zzx, this.zzz, this.zzy, bArr);
                                }
                                if (this.zza != null) {
                                    iIntValue = ((Integer) zzafp.zzg.get(this.zza)).intValue();
                                }
                                if (this.zzq == 0) {
                                    i19 = iIntValue;
                                } else {
                                    i19 = iIntValue;
                                }
                                zzakVar.zzX(this.zzl);
                                zzakVar.zzF(this.zzm);
                                zzakVar.zzP(f10);
                                zzakVar.zzR(i19);
                                zzakVar.zzQ(this.zzu);
                                zzakVar.zzV(this.zzv);
                                zzakVar.zzy(zzsVar);
                                i18 = 2;
                            } else {
                                if ("application/x-subrip".equals(str4)) {
                                }
                                i18 = 3;
                            }
                            break;
                        } else {
                            zzakVar.zzw(this.zzN);
                            zzakVar.zzT(this.zzP);
                            zzakVar.zzN(iZzj);
                        }
                        if (this.zza != null) {
                            zzakVar.zzJ(this.zza);
                        }
                        zzakVar.zzG(i10);
                        zzakVar.zzS(str4);
                        zzakVar.zzL(i11);
                        zzakVar.zzK(this.zzY);
                        zzakVar.zzU(i2114);
                        zzakVar.zzI(list2);
                        zzakVar.zzx(str2);
                        zzakVar.zzB(this.zzk);
                        zzam zzamVarZzY114 = zzakVar.zzY();
                        zzabz zzabzVarZzv114 = zzaazVar.zzv(this.zzc, i18);
                        this.zzV = zzabzVarZzv114;
                        zzabzVarZzv114.zzk(zzamVarZzY114);
                        return;
                    }
                    iZzj = 268435456;
                }
                list2 = null;
                str2 = null;
                i11 = -1;
                if (this.zzM != null) {
                    str2 = zzaasVarZza.zza;
                    str6 = "video/dolby-vision";
                }
                str4 = str6;
                boolean z1114 = this.zzU;
                if (true != this.zzT) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i2115 = (z1114 ? 1 : 0) | i13;
                zzakVar = new zzak();
                if (!zzcc.zzf(str4)) {
                    if (zzcc.zzg(str4)) {
                        if (this.zzp == 0) {
                            i16 = this.zzn;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.zzl;
                            }
                            this.zzn = i16;
                            i17 = this.zzo;
                            if (i17 == -1) {
                                i17 = this.zzm;
                            }
                            this.zzo = i17;
                        } else {
                            iIntValue = -1;
                        }
                        i14 = this.zzn;
                        if (i14 != iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder115 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder115.put((byte) 0);
                                byteBufferOrder115.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) (this.zzK + 0.5f));
                                byteBufferOrder115.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder115.putShort((short) this.zzA);
                                byteBufferOrder115.putShort((short) this.zzB);
                            }
                            zzsVar = new zzs(this.zzx, this.zzz, this.zzy, bArr);
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzafp.zzg.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i19 = iIntValue;
                        } else {
                            i19 = iIntValue;
                        }
                        zzakVar.zzX(this.zzl);
                        zzakVar.zzF(this.zzm);
                        zzakVar.zzP(f10);
                        zzakVar.zzR(i19);
                        zzakVar.zzQ(this.zzu);
                        zzakVar.zzV(this.zzv);
                        zzakVar.zzy(zzsVar);
                        i18 = 2;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                        }
                        i18 = 3;
                    }
                    break;
                } else {
                    zzakVar.zzw(this.zzN);
                    zzakVar.zzT(this.zzP);
                    zzakVar.zzN(iZzj);
                }
                if (this.zza != null) {
                    zzakVar.zzJ(this.zza);
                }
                zzakVar.zzG(i10);
                zzakVar.zzS(str4);
                zzakVar.zzL(i11);
                zzakVar.zzK(this.zzY);
                zzakVar.zzU(i2115);
                zzakVar.zzI(list2);
                zzakVar.zzx(str2);
                zzakVar.zzB(this.zzk);
                zzam zzamVarZzY115 = zzakVar.zzY();
                zzabz zzabzVarZzv115 = zzaazVar.zzv(this.zzc, i18);
                this.zzV = zzabzVarZzv115;
                zzabzVarZzv115.zzk(zzamVarZzY115);
                return;
            case 26:
                i12 = this.zzO;
                if (i12 == 32) {
                    list2 = null;
                    str2 = null;
                    i11 = -1;
                } else {
                    sb2 = new StringBuilder();
                    str3 = "Unsupported floating point PCM bit depth: ";
                    sb2.append(str3);
                    sb2.append(i12);
                    sb2.append(". Setting mimeType to audio/x-unknown");
                    string = sb2.toString();
                    zzer.zzf("MatroskaExtractor", string);
                    listZzn = null;
                    str2 = null;
                    str6 = "audio/x-unknown";
                    i11 = -1;
                    list4 = listZzn;
                    iZzj = -1;
                    list2 = list4;
                }
                if (this.zzM != null) {
                    str2 = zzaasVarZza.zza;
                    str6 = "video/dolby-vision";
                }
                str4 = str6;
                boolean z1115 = this.zzU;
                if (true != this.zzT) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i2116 = (z1115 ? 1 : 0) | i13;
                zzakVar = new zzak();
                if (!zzcc.zzf(str4)) {
                    if (zzcc.zzg(str4)) {
                        if (this.zzp == 0) {
                            i16 = this.zzn;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.zzl;
                            }
                            this.zzn = i16;
                            i17 = this.zzo;
                            if (i17 == -1) {
                                i17 = this.zzm;
                            }
                            this.zzo = i17;
                        } else {
                            iIntValue = -1;
                        }
                        i14 = this.zzn;
                        if (i14 != iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder116 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder116.put((byte) 0);
                                byteBufferOrder116.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) (this.zzK + 0.5f));
                                byteBufferOrder116.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder116.putShort((short) this.zzA);
                                byteBufferOrder116.putShort((short) this.zzB);
                            }
                            zzsVar = new zzs(this.zzx, this.zzz, this.zzy, bArr);
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzafp.zzg.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i19 = iIntValue;
                        } else {
                            i19 = iIntValue;
                        }
                        zzakVar.zzX(this.zzl);
                        zzakVar.zzF(this.zzm);
                        zzakVar.zzP(f10);
                        zzakVar.zzR(i19);
                        zzakVar.zzQ(this.zzu);
                        zzakVar.zzV(this.zzv);
                        zzakVar.zzy(zzsVar);
                        i18 = 2;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                        }
                        i18 = 3;
                    }
                    break;
                } else {
                    zzakVar.zzw(this.zzN);
                    zzakVar.zzT(this.zzP);
                    zzakVar.zzN(iZzj);
                }
                if (this.zza != null) {
                    zzakVar.zzJ(this.zza);
                }
                zzakVar.zzG(i10);
                zzakVar.zzS(str4);
                zzakVar.zzL(i11);
                zzakVar.zzK(this.zzY);
                zzakVar.zzU(i2116);
                zzakVar.zzI(list2);
                zzakVar.zzx(str2);
                zzakVar.zzB(this.zzk);
                zzam zzamVarZzY116 = zzakVar.zzY();
                zzabz zzabzVarZzv116 = zzaazVar.zzv(this.zzc, i18);
                this.zzV = zzabzVarZzv116;
                zzabzVarZzv116.zzk(zzamVarZzY116);
                return;
            case 27:
                str6 = "application/x-subrip";
                listZzn = null;
                str2 = null;
                i11 = -1;
                list4 = listZzn;
                iZzj = -1;
                list2 = list4;
                if (this.zzM != null) {
                    str2 = zzaasVarZza.zza;
                    str6 = "video/dolby-vision";
                }
                str4 = str6;
                boolean z1116 = this.zzU;
                if (true != this.zzT) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i2117 = (z1116 ? 1 : 0) | i13;
                zzakVar = new zzak();
                if (!zzcc.zzf(str4)) {
                    if (zzcc.zzg(str4)) {
                        if (this.zzp == 0) {
                            i16 = this.zzn;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.zzl;
                            }
                            this.zzn = i16;
                            i17 = this.zzo;
                            if (i17 == -1) {
                                i17 = this.zzm;
                            }
                            this.zzo = i17;
                        } else {
                            iIntValue = -1;
                        }
                        i14 = this.zzn;
                        if (i14 != iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder117 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder117.put((byte) 0);
                                byteBufferOrder117.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) (this.zzK + 0.5f));
                                byteBufferOrder117.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder117.putShort((short) this.zzA);
                                byteBufferOrder117.putShort((short) this.zzB);
                            }
                            zzsVar = new zzs(this.zzx, this.zzz, this.zzy, bArr);
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzafp.zzg.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i19 = iIntValue;
                        } else {
                            i19 = iIntValue;
                        }
                        zzakVar.zzX(this.zzl);
                        zzakVar.zzF(this.zzm);
                        zzakVar.zzP(f10);
                        zzakVar.zzR(i19);
                        zzakVar.zzQ(this.zzu);
                        zzakVar.zzV(this.zzv);
                        zzakVar.zzy(zzsVar);
                        i18 = 2;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                        }
                        i18 = 3;
                    }
                    break;
                } else {
                    zzakVar.zzw(this.zzN);
                    zzakVar.zzT(this.zzP);
                    zzakVar.zzN(iZzj);
                }
                if (this.zza != null) {
                    zzakVar.zzJ(this.zza);
                }
                zzakVar.zzG(i10);
                zzakVar.zzS(str4);
                zzakVar.zzL(i11);
                zzakVar.zzK(this.zzY);
                zzakVar.zzU(i2117);
                zzakVar.zzI(list2);
                zzakVar.zzx(str2);
                zzakVar.zzB(this.zzk);
                zzam zzamVarZzY117 = zzakVar.zzY();
                zzabz zzabzVarZzv117 = zzaazVar.zzv(this.zzc, i18);
                this.zzV = zzabzVarZzv117;
                zzabzVarZzv117.zzk(zzamVarZzY117);
                return;
            case 28:
                str2 = null;
                str6 = "text/x-ssa";
                listZzn = zzfsc.zzn(zzafp.zzc, zzi(this.zzb));
                i11 = -1;
                list4 = listZzn;
                iZzj = -1;
                list2 = list4;
                if (this.zzM != null) {
                    str2 = zzaasVarZza.zza;
                    str6 = "video/dolby-vision";
                }
                str4 = str6;
                boolean z1117 = this.zzU;
                if (true != this.zzT) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i2118 = (z1117 ? 1 : 0) | i13;
                zzakVar = new zzak();
                if (!zzcc.zzf(str4)) {
                    if (zzcc.zzg(str4)) {
                        if (this.zzp == 0) {
                            i16 = this.zzn;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.zzl;
                            }
                            this.zzn = i16;
                            i17 = this.zzo;
                            if (i17 == -1) {
                                i17 = this.zzm;
                            }
                            this.zzo = i17;
                        } else {
                            iIntValue = -1;
                        }
                        i14 = this.zzn;
                        if (i14 != iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder118 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder118.put((byte) 0);
                                byteBufferOrder118.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) (this.zzK + 0.5f));
                                byteBufferOrder118.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder118.putShort((short) this.zzA);
                                byteBufferOrder118.putShort((short) this.zzB);
                            }
                            zzsVar = new zzs(this.zzx, this.zzz, this.zzy, bArr);
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzafp.zzg.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i19 = iIntValue;
                        } else {
                            i19 = iIntValue;
                        }
                        zzakVar.zzX(this.zzl);
                        zzakVar.zzF(this.zzm);
                        zzakVar.zzP(f10);
                        zzakVar.zzR(i19);
                        zzakVar.zzQ(this.zzu);
                        zzakVar.zzV(this.zzv);
                        zzakVar.zzy(zzsVar);
                        i18 = 2;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                        }
                        i18 = 3;
                    }
                    break;
                } else {
                    zzakVar.zzw(this.zzN);
                    zzakVar.zzT(this.zzP);
                    zzakVar.zzN(iZzj);
                }
                if (this.zza != null) {
                    zzakVar.zzJ(this.zza);
                }
                zzakVar.zzG(i10);
                zzakVar.zzS(str4);
                zzakVar.zzL(i11);
                zzakVar.zzK(this.zzY);
                zzakVar.zzU(i2118);
                zzakVar.zzI(list2);
                zzakVar.zzx(str2);
                zzakVar.zzB(this.zzk);
                zzam zzamVarZzY118 = zzakVar.zzY();
                zzabz zzabzVarZzv118 = zzaazVar.zzv(this.zzc, i18);
                this.zzV = zzabzVarZzv118;
                zzabzVarZzv118.zzk(zzamVarZzY118);
                return;
            case 29:
                listZzn = null;
                str2 = null;
                str6 = "text/vtt";
                i11 = -1;
                list4 = listZzn;
                iZzj = -1;
                list2 = list4;
                if (this.zzM != null) {
                    str2 = zzaasVarZza.zza;
                    str6 = "video/dolby-vision";
                }
                str4 = str6;
                boolean z1118 = this.zzU;
                if (true != this.zzT) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i2119 = (z1118 ? 1 : 0) | i13;
                zzakVar = new zzak();
                if (!zzcc.zzf(str4)) {
                    if (zzcc.zzg(str4)) {
                        if (this.zzp == 0) {
                            i16 = this.zzn;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.zzl;
                            }
                            this.zzn = i16;
                            i17 = this.zzo;
                            if (i17 == -1) {
                                i17 = this.zzm;
                            }
                            this.zzo = i17;
                        } else {
                            iIntValue = -1;
                        }
                        i14 = this.zzn;
                        if (i14 != iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder119 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder119.put((byte) 0);
                                byteBufferOrder119.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) (this.zzK + 0.5f));
                                byteBufferOrder119.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder119.putShort((short) this.zzA);
                                byteBufferOrder119.putShort((short) this.zzB);
                            }
                            zzsVar = new zzs(this.zzx, this.zzz, this.zzy, bArr);
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzafp.zzg.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i19 = iIntValue;
                        } else {
                            i19 = iIntValue;
                        }
                        zzakVar.zzX(this.zzl);
                        zzakVar.zzF(this.zzm);
                        zzakVar.zzP(f10);
                        zzakVar.zzR(i19);
                        zzakVar.zzQ(this.zzu);
                        zzakVar.zzV(this.zzv);
                        zzakVar.zzy(zzsVar);
                        i18 = 2;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                        }
                        i18 = 3;
                    }
                    break;
                } else {
                    zzakVar.zzw(this.zzN);
                    zzakVar.zzT(this.zzP);
                    zzakVar.zzN(iZzj);
                }
                if (this.zza != null) {
                    zzakVar.zzJ(this.zza);
                }
                zzakVar.zzG(i10);
                zzakVar.zzS(str4);
                zzakVar.zzL(i11);
                zzakVar.zzK(this.zzY);
                zzakVar.zzU(i2119);
                zzakVar.zzI(list2);
                zzakVar.zzx(str2);
                zzakVar.zzB(this.zzk);
                zzam zzamVarZzY119 = zzakVar.zzY();
                zzabz zzabzVarZzv119 = zzaazVar.zzv(this.zzc, i18);
                this.zzV = zzabzVarZzv119;
                zzabzVarZzv119.zzk(zzamVarZzY119);
                return;
            case 30:
                str6 = "application/vobsub";
                listSingletonList = zzfsc.zzm(zzi(str5));
                str2 = null;
                listZzn = listSingletonList;
                i11 = -1;
                list4 = listZzn;
                iZzj = -1;
                list2 = list4;
                if (this.zzM != null) {
                    str2 = zzaasVarZza.zza;
                    str6 = "video/dolby-vision";
                }
                str4 = str6;
                boolean z1119 = this.zzU;
                if (true != this.zzT) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i21110 = (z1119 ? 1 : 0) | i13;
                zzakVar = new zzak();
                if (!zzcc.zzf(str4)) {
                    if (zzcc.zzg(str4)) {
                        if (this.zzp == 0) {
                            i16 = this.zzn;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.zzl;
                            }
                            this.zzn = i16;
                            i17 = this.zzo;
                            if (i17 == -1) {
                                i17 = this.zzm;
                            }
                            this.zzo = i17;
                        } else {
                            iIntValue = -1;
                        }
                        i14 = this.zzn;
                        if (i14 != iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder1110 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder1110.put((byte) 0);
                                byteBufferOrder1110.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) (this.zzK + 0.5f));
                                byteBufferOrder1110.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder1110.putShort((short) this.zzA);
                                byteBufferOrder1110.putShort((short) this.zzB);
                            }
                            zzsVar = new zzs(this.zzx, this.zzz, this.zzy, bArr);
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzafp.zzg.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i19 = iIntValue;
                        } else {
                            i19 = iIntValue;
                        }
                        zzakVar.zzX(this.zzl);
                        zzakVar.zzF(this.zzm);
                        zzakVar.zzP(f10);
                        zzakVar.zzR(i19);
                        zzakVar.zzQ(this.zzu);
                        zzakVar.zzV(this.zzv);
                        zzakVar.zzy(zzsVar);
                        i18 = 2;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                        }
                        i18 = 3;
                    }
                    break;
                } else {
                    zzakVar.zzw(this.zzN);
                    zzakVar.zzT(this.zzP);
                    zzakVar.zzN(iZzj);
                }
                if (this.zza != null) {
                    zzakVar.zzJ(this.zza);
                }
                zzakVar.zzG(i10);
                zzakVar.zzS(str4);
                zzakVar.zzL(i11);
                zzakVar.zzK(this.zzY);
                zzakVar.zzU(i21110);
                zzakVar.zzI(list2);
                zzakVar.zzx(str2);
                zzakVar.zzB(this.zzk);
                zzam zzamVarZzY1110 = zzakVar.zzY();
                zzabz zzabzVarZzv1110 = zzaazVar.zzv(this.zzc, i18);
                this.zzV = zzabzVarZzv1110;
                zzabzVarZzv1110.zzk(zzamVarZzY1110);
                return;
            case 31:
                str6 = "application/pgs";
                listZzn = null;
                str2 = null;
                i11 = -1;
                list4 = listZzn;
                iZzj = -1;
                list2 = list4;
                if (this.zzM != null) {
                    str2 = zzaasVarZza.zza;
                    str6 = "video/dolby-vision";
                }
                str4 = str6;
                boolean z11110 = this.zzU;
                if (true != this.zzT) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i21111 = (z11110 ? 1 : 0) | i13;
                zzakVar = new zzak();
                if (!zzcc.zzf(str4)) {
                    if (zzcc.zzg(str4)) {
                        if (this.zzp == 0) {
                            i16 = this.zzn;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.zzl;
                            }
                            this.zzn = i16;
                            i17 = this.zzo;
                            if (i17 == -1) {
                                i17 = this.zzm;
                            }
                            this.zzo = i17;
                        } else {
                            iIntValue = -1;
                        }
                        i14 = this.zzn;
                        if (i14 != iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder1111 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder1111.put((byte) 0);
                                byteBufferOrder1111.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) (this.zzK + 0.5f));
                                byteBufferOrder1111.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder1111.putShort((short) this.zzA);
                                byteBufferOrder1111.putShort((short) this.zzB);
                            }
                            zzsVar = new zzs(this.zzx, this.zzz, this.zzy, bArr);
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzafp.zzg.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i19 = iIntValue;
                        } else {
                            i19 = iIntValue;
                        }
                        zzakVar.zzX(this.zzl);
                        zzakVar.zzF(this.zzm);
                        zzakVar.zzP(f10);
                        zzakVar.zzR(i19);
                        zzakVar.zzQ(this.zzu);
                        zzakVar.zzV(this.zzv);
                        zzakVar.zzy(zzsVar);
                        i18 = 2;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                        }
                        i18 = 3;
                    }
                    break;
                } else {
                    zzakVar.zzw(this.zzN);
                    zzakVar.zzT(this.zzP);
                    zzakVar.zzN(iZzj);
                }
                if (this.zza != null) {
                    zzakVar.zzJ(this.zza);
                }
                zzakVar.zzG(i10);
                zzakVar.zzS(str4);
                zzakVar.zzL(i11);
                zzakVar.zzK(this.zzY);
                zzakVar.zzU(i21111);
                zzakVar.zzI(list2);
                zzakVar.zzx(str2);
                zzakVar.zzB(this.zzk);
                zzam zzamVarZzY1111 = zzakVar.zzY();
                zzabz zzabzVarZzv1111 = zzaazVar.zzv(this.zzc, i18);
                this.zzV = zzabzVarZzv1111;
                zzabzVarZzv1111.zzk(zzamVarZzY1111);
                return;
            case 32:
                byte[] bArr3 = new byte[4];
                System.arraycopy(zzi(str5), 0, bArr3, 0, 4);
                str6 = "application/dvbsubs";
                listSingletonList = zzfsc.zzm(bArr3);
                str2 = null;
                listZzn = listSingletonList;
                i11 = -1;
                list4 = listZzn;
                iZzj = -1;
                list2 = list4;
                if (this.zzM != null) {
                    str2 = zzaasVarZza.zza;
                    str6 = "video/dolby-vision";
                }
                str4 = str6;
                boolean z11111 = this.zzU;
                if (true != this.zzT) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i21112 = (z11111 ? 1 : 0) | i13;
                zzakVar = new zzak();
                if (!zzcc.zzf(str4)) {
                    if (zzcc.zzg(str4)) {
                        if (this.zzp == 0) {
                            i16 = this.zzn;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.zzl;
                            }
                            this.zzn = i16;
                            i17 = this.zzo;
                            if (i17 == -1) {
                                i17 = this.zzm;
                            }
                            this.zzo = i17;
                        } else {
                            iIntValue = -1;
                        }
                        i14 = this.zzn;
                        if (i14 != iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder1112 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder1112.put((byte) 0);
                                byteBufferOrder1112.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) (this.zzK + 0.5f));
                                byteBufferOrder1112.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder1112.putShort((short) this.zzA);
                                byteBufferOrder1112.putShort((short) this.zzB);
                            }
                            zzsVar = new zzs(this.zzx, this.zzz, this.zzy, bArr);
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzafp.zzg.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i19 = iIntValue;
                        } else {
                            i19 = iIntValue;
                        }
                        zzakVar.zzX(this.zzl);
                        zzakVar.zzF(this.zzm);
                        zzakVar.zzP(f10);
                        zzakVar.zzR(i19);
                        zzakVar.zzQ(this.zzu);
                        zzakVar.zzV(this.zzv);
                        zzakVar.zzy(zzsVar);
                        i18 = 2;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                        }
                        i18 = 3;
                    }
                    break;
                } else {
                    zzakVar.zzw(this.zzN);
                    zzakVar.zzT(this.zzP);
                    zzakVar.zzN(iZzj);
                }
                if (this.zza != null) {
                    zzakVar.zzJ(this.zza);
                }
                zzakVar.zzG(i10);
                zzakVar.zzS(str4);
                zzakVar.zzL(i11);
                zzakVar.zzK(this.zzY);
                zzakVar.zzU(i21112);
                zzakVar.zzI(list2);
                zzakVar.zzx(str2);
                zzakVar.zzB(this.zzk);
                zzam zzamVarZzY1112 = zzakVar.zzY();
                zzabz zzabzVarZzv1112 = zzaazVar.zzv(this.zzc, i18);
                this.zzV = zzabzVarZzv1112;
                zzabzVarZzv1112.zzk(zzamVarZzY1112);
                return;
            default:
                throw zzcd.zza("Unrecognized codec identifier.", null);
        }
    }
}
