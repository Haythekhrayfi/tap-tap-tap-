package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.fragment.app.w;
import androidx.recyclerview.widget.o;
import java.util.Objects;
import n1.c;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes2.dex */
public final class zzrs {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final MediaCodecInfo.CodecCapabilities zzd;
    public final boolean zze;
    public final boolean zzf;
    public final boolean zzg;
    private final boolean zzh;

    public zzrs(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        Objects.requireNonNull(str);
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = codecCapabilities;
        this.zzg = z10;
        this.zze = z13;
        this.zzf = z15;
        this.zzh = zzcc.zzg(str2);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003b  */
    public static zzrs zzc(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15;
        if (codecCapabilities != null) {
            int i10 = zzfj.zza;
            if (codecCapabilities.isFeatureSupported("adaptive-playback")) {
                if (i10 <= 22) {
                    String str4 = zzfj.zzd;
                    if (("ODROID-XU3".equals(str4) || "Nexus 10".equals(str4)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                        z15 = false;
                    }
                }
                z15 = true;
            } else {
                z15 = false;
            }
        } else {
            z15 = false;
        }
        return new zzrs(str, str2, str3, codecCapabilities, z10, z11, z12, z15, codecCapabilities != null && zzfj.zza >= 21 && codecCapabilities.isFeatureSupported("tunneled-playback"), z14 || (codecCapabilities != null && zzfj.zza >= 21 && codecCapabilities.isFeatureSupported("secure-playback")));
    }

    private static Point zzi(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i12 = zzfj.zza;
        return new Point((((i10 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i11 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    private final void zzj(String str) {
        String str2 = this.zza;
        zzer.zzb("MediaCodecInfo", w0.a.a(q2.a.a("NoSupport [", str, "] [", str2, ", "), this.zzb, "] [", zzfj.zze, "]"));
    }

    private static boolean zzk(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        Point pointZzi = zzi(videoCapabilities, i10, i11);
        int i12 = pointZzi.x;
        int i13 = pointZzi.y;
        return (d10 == -1.0d || d10 < 1.0d) ? videoCapabilities.isSizeSupported(i12, i13) : videoCapabilities.areSizeAndRateSupported(i12, i13, Math.floor(d10));
    }

    private final boolean zzl(zzam zzamVar, boolean z10) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair pairZzb = zzsl.zzb(zzamVar);
        if (pairZzb == null) {
            return true;
        }
        int iIntValue = ((Integer) pairZzb.first).intValue();
        int iIntValue2 = ((Integer) pairZzb.second).intValue();
        int i10 = 8;
        if ("video/dolby-vision".equals(zzamVar.zzm)) {
            if ("video/avc".equals(this.zzb)) {
                iIntValue = 8;
            } else if ("video/hevc".equals(this.zzb)) {
                iIntValue = 2;
            }
            iIntValue2 = 0;
        }
        if (!this.zzh && iIntValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrZzh = zzh();
        if (zzfj.zza <= 23 && "video/x-vnd.on2.vp9".equals(this.zzb) && codecProfileLevelArrZzh.length == 0) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
            int iIntValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
            if (iIntValue3 >= 180000000) {
                i10 = 1024;
            } else if (iIntValue3 >= 120000000) {
                i10 = 512;
            } else if (iIntValue3 >= 60000000) {
                i10 = 256;
            } else if (iIntValue3 >= 30000000) {
                i10 = 128;
            } else if (iIntValue3 >= 18000000) {
                i10 = 64;
            } else if (iIntValue3 >= 12000000) {
                i10 = 32;
            } else if (iIntValue3 >= 7200000) {
                i10 = 16;
            } else if (iIntValue3 < 3600000) {
                i10 = iIntValue3 >= 1800000 ? 4 : iIntValue3 >= 800000 ? 2 : 1;
            }
            MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
            codecProfileLevel.profile = 1;
            codecProfileLevel.level = i10;
            codecProfileLevelArrZzh = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArrZzh) {
            if (codecProfileLevel2.profile == iIntValue && (codecProfileLevel2.level >= iIntValue2 || !z10)) {
                if ("video/hevc".equals(this.zzb) && iIntValue == 2) {
                    String str = zzfj.zzb;
                    if ("sailfish".equals(str) || "marlin".equals(str)) {
                    }
                }
                return true;
            }
        }
        zzj(w.a("codec.profileLevel, ", zzamVar.zzj, ", ", this.zzc));
        return false;
    }

    private final boolean zzm(zzam zzamVar) {
        return this.zzb.equals(zzamVar.zzm) || this.zzb.equals(zzsl.zze(zzamVar));
    }

    public final String toString() {
        return this.zza;
    }

    public final Point zza(int i10, int i11) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return zzi(videoCapabilities, i10, i11);
    }

    public final zzia zzb(zzam zzamVar, zzam zzamVar2) {
        int i10 = true != zzfj.zzC(zzamVar.zzm, zzamVar2.zzm) ? 8 : 0;
        if (this.zzh) {
            if (zzamVar.zzu != zzamVar2.zzu) {
                i10 |= 1024;
            }
            if (!this.zze && (zzamVar.zzr != zzamVar2.zzr || zzamVar.zzs != zzamVar2.zzs)) {
                i10 |= 512;
            }
            if (!zzfj.zzC(zzamVar.zzy, zzamVar2.zzy)) {
                i10 |= 2048;
            }
            String str = this.zza;
            if (zzfj.zzd.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !zzamVar.zzd(zzamVar2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new zzia(this.zza, zzamVar, zzamVar2, true != zzamVar.zzd(zzamVar2) ? 2 : 3, 0);
            }
        } else {
            if (zzamVar.zzz != zzamVar2.zzz) {
                i10 |= 4096;
            }
            if (zzamVar.zzA != zzamVar2.zzA) {
                i10 |= 8192;
            }
            if (zzamVar.zzB != zzamVar2.zzB) {
                i10 |= Http2.INITIAL_MAX_FRAME_SIZE;
            }
            if (i10 == 0 && "audio/mp4a-latm".equals(this.zzb)) {
                Pair pairZzb = zzsl.zzb(zzamVar);
                Pair pairZzb2 = zzsl.zzb(zzamVar2);
                if (pairZzb != null && pairZzb2 != null) {
                    int iIntValue = ((Integer) pairZzb.first).intValue();
                    int iIntValue2 = ((Integer) pairZzb2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new zzia(this.zza, zzamVar, zzamVar2, 3, 0);
                    }
                }
            }
            if (!zzamVar.zzd(zzamVar2)) {
                i10 |= 32;
            }
            if ("audio/opus".equals(this.zzb)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new zzia(this.zza, zzamVar, zzamVar2, 1, 0);
            }
        }
        return new zzia(this.zza, zzamVar, zzamVar2, 0, i10);
    }

    public final boolean zzd(zzam zzamVar) {
        return zzm(zzamVar) && zzl(zzamVar, false);
    }

    public final boolean zze(zzam zzamVar) throws zzsf {
        String strA;
        int i10;
        String strA2;
        int i11;
        if (!zzm(zzamVar) || !zzl(zzamVar, true)) {
            return false;
        }
        if (this.zzh) {
            int i12 = zzamVar.zzr;
            if (i12 <= 0 || (i11 = zzamVar.zzs) <= 0) {
                return true;
            }
            if (zzfj.zza >= 21) {
                return zzg(i12, i11, zzamVar.zzt);
            }
            boolean z10 = i12 * i11 <= zzsl.zza();
            if (!z10) {
                zzj(c.a("legacyFrameSize, ", zzamVar.zzr, "x", zzamVar.zzs));
            }
            return z10;
        }
        int i13 = zzfj.zza;
        if (i13 >= 21) {
            int i14 = zzamVar.zzA;
            if (i14 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
                if (codecCapabilities == null) {
                    strA2 = "sampleRate.caps";
                } else {
                    MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                    if (audioCapabilities == null) {
                        strA2 = "sampleRate.aCaps";
                    } else if (!audioCapabilities.isSampleRateSupported(i14)) {
                        strA2 = android.support.v4.media.a.a("sampleRate.support, ", i14);
                    }
                }
                zzj(strA2);
                return false;
            }
            int i15 = zzamVar.zzz;
            if (i15 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.zzd;
                if (codecCapabilities2 == null) {
                    strA = "channelCount.caps";
                } else {
                    MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
                    if (audioCapabilities2 == null) {
                        strA = "channelCount.aCaps";
                    } else {
                        String str = this.zza;
                        String str2 = this.zzb;
                        int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                        if (maxInputChannelCount <= 1 && ((i13 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                            if ("audio/ac3".equals(str2)) {
                                i10 = 6;
                            } else {
                                i10 = "audio/eac3".equals(str2) ? 16 : 30;
                            }
                            zzer.zzf("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + maxInputChannelCount + " to " + i10 + "]");
                            maxInputChannelCount = i10;
                        }
                        if (maxInputChannelCount < i15) {
                            strA = android.support.v4.media.a.a("channelCount.support, ", i15);
                        }
                    }
                }
                zzj(strA);
                return false;
            }
        }
        return true;
    }

    public final boolean zzf(zzam zzamVar) {
        if (this.zzh) {
            return this.zze;
        }
        Pair pairZzb = zzsl.zzb(zzamVar);
        return pairZzb != null && ((Integer) pairZzb.first).intValue() == 42;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0031  */
    /* JADX WARN: Code duplicated, block: B:18:0x0037  */
    public final boolean zzg(int i10, int i11, double d10) {
        StringBuilder sb2;
        String str;
        String string;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null) {
            string = "sizeAndRate.caps";
        } else {
            MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
            if (videoCapabilities == null) {
                string = "sizeAndRate.vCaps";
            } else {
                if (zzfj.zza < 29) {
                    if (!zzk(videoCapabilities, i10, i11, d10)) {
                        if (i10 < i11 || (("OMX.MTK.VIDEO.DECODER.HEVC".equals(this.zza) && "mcv5a".equals(zzfj.zzb)) || !zzk(videoCapabilities, i11, i10, d10))) {
                            sb2 = new StringBuilder();
                            str = "sizeAndRate.support, ";
                        } else {
                            StringBuilder sbA = o.a("sizeAndRate.rotated, ", i10, "x", i11, "@");
                            sbA.append(d10);
                            String string2 = sbA.toString();
                            String str2 = this.zza;
                            zzer.zzb("MediaCodecInfo", w0.a.a(q2.a.a("AssumedSupport [", string2, "] [", str2, ", "), this.zzb, "] [", zzfj.zze, "]"));
                        }
                    }
                    return true;
                }
                int iZza = zzrr.zza(videoCapabilities, i10, i11, d10);
                if (iZza == 2) {
                    return true;
                }
                if (iZza != 1) {
                    if (!zzk(videoCapabilities, i10, i11, d10)) {
                        if (i10 < i11) {
                        }
                        sb2 = new StringBuilder();
                        str = "sizeAndRate.support, ";
                    }
                    return true;
                }
                sb2 = new StringBuilder();
                str = "sizeAndRate.cover, ";
                sb2.append(str);
                sb2.append(i10);
                sb2.append("x");
                sb2.append(i11);
                sb2.append("@");
                sb2.append(d10);
                string = sb2.toString();
            }
        }
        zzj(string);
        return false;
    }

    public final MediaCodecInfo.CodecProfileLevel[] zzh() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }
}
