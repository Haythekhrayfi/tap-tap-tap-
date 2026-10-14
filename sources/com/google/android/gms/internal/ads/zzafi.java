package com.google.android.gms.internal.ads;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.io.IOException;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes2.dex */
final class zzafi implements zzafk {
    private final byte[] zza = new byte[8];
    private final ArrayDeque zzb = new ArrayDeque();
    private final zzafr zzc = new zzafr();
    private zzafj zzd;
    private int zze;
    private int zzf;
    private long zzg;

    private final long zzd(zzaax zzaaxVar, int i10) throws IOException {
        ((zzaam) zzaaxVar).zzn(this.zza, 0, i10, false);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | ((long) (this.zza[i11] & 255));
        }
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.zzafk
    public final void zza(zzafj zzafjVar) {
        this.zzd = zzafjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafk
    public final void zzb() {
        this.zze = 0;
        this.zzb.clear();
        this.zzc.zze();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b2 A[LOOP:0: B:3:0x0005->B:36:0x00b2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:46:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:56:0x0131  */
    /* JADX WARN: Code duplicated, block: B:58:0x0134  */
    /* JADX WARN: Code duplicated, block: B:59:0x0137  */
    /* JADX WARN: Code duplicated, block: B:61:0x0140  */
    /* JADX WARN: Code duplicated, block: B:63:0x0146 A[LOOP:2: B:60:0x013e->B:63:0x0146, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x0155  */
    /* JADX WARN: Code duplicated, block: B:71:0x0171  */
    /* JADX WARN: Code duplicated, block: B:73:0x017e  */
    /* JADX WARN: Code duplicated, block: B:77:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x00fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0105 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x016b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:67:0x0155, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:73:0x017e, please report this as an issue */
    @Override // com.google.android.gms.internal.ads.zzafk
    public final boolean zzc(zzaax zzaaxVar) throws IOException {
        int i10;
        zzafn zzafnVar;
        zzafp zzafpVar;
        long j10;
        long j11;
        int i11;
        byte[] bArr;
        String str;
        int i12;
        long j12;
        int i13;
        long jZzd;
        double dLongBitsToDouble;
        zzaam zzaamVar;
        int iZzb;
        int iZzc;
        zzdy.zzb(this.zzd);
        while (true) {
            zzafh zzafhVar = (zzafh) this.zzb.peek();
            if (zzafhVar != null && zzaaxVar.zzf() >= zzafhVar.zzb) {
                ((zzafn) this.zzd).zza.zzh(((zzafh) this.zzb.pop()).zza);
                return true;
            }
            int i14 = this.zze;
            if (i14 != 0) {
                if (i14 == 1) {
                }
                zzafj zzafjVar = this.zzd;
                i10 = this.zzf;
                zzafnVar = (zzafn) zzafjVar;
                zzafpVar = zzafnVar.zza;
                switch (i10) {
                    case 131:
                    case SyslogConstants.LOG_LOCAL1 /* 136 */:
                    case 155:
                    case 159:
                    case SyslogConstants.LOG_LOCAL6 /* 176 */:
                    case 179:
                    case 186:
                    case 215:
                    case 231:
                    case 238:
                    case 241:
                    case 251:
                    case 16871:
                    case 16980:
                    case 17029:
                    case 17143:
                    case 18401:
                    case 18408:
                    case 20529:
                    case 20530:
                    case 21420:
                    case 21432:
                    case 21680:
                    case 21682:
                    case 21690:
                    case 21930:
                    case 21945:
                    case 21946:
                    case 21947:
                    case 21948:
                    case 21949:
                    case 21998:
                    case 22186:
                    case 22203:
                    case 25188:
                    case 30114:
                    case 30321:
                    case 2352003:
                    case 2807729:
                        j10 = this.zzg;
                        if (j10 <= 8) {
                            zzafnVar.zza.zzj(i10, zzd(zzaaxVar, (int) j10));
                            this.zze = 0;
                            return true;
                        }
                        throw zzcd.zza("Invalid integer size: " + j10, null);
                    case 134:
                    case 17026:
                    case 21358:
                    case 2274716:
                        j11 = this.zzg;
                        if (j11 <= 2147483647L) {
                            throw zzcd.zza("String element size: " + j11, null);
                        }
                        i11 = (int) j11;
                        if (i11 == 0) {
                            str = "";
                        } else {
                            bArr = new byte[i11];
                            ((zzaam) zzaaxVar).zzn(bArr, 0, i11, false);
                            while (i11 > 0) {
                                i12 = i11 - 1;
                                if (bArr[i12] == 0) {
                                    i11 = i12;
                                } else {
                                    str = new String(bArr, 0, i11);
                                }
                            }
                            str = new String(bArr, 0, i11);
                        }
                        zzafnVar.zza.zzl(i10, str);
                        this.zze = 0;
                        return true;
                    case SyslogConstants.LOG_LOCAL4 /* 160 */:
                    case 166:
                    case 174:
                    case 183:
                    case 187:
                    case 224:
                    case HideBottomViewOnScrollBehavior.ENTER_ANIMATION_DURATION /* 225 */:
                    case 16868:
                    case 18407:
                    case 19899:
                    case 20532:
                    case 20533:
                    case 21936:
                    case 21968:
                    case 25152:
                    case 28032:
                    case 30113:
                    case 30320:
                    case 290298740:
                    case 357149030:
                    case 374648427:
                    case 408125543:
                    case 440786851:
                    case 475249515:
                    case 524531317:
                        long jZzf = zzaaxVar.zzf();
                        this.zzb.push(new zzafh(i10, this.zzg + jZzf, null));
                        ((zzafn) this.zzd).zza.zzk(this.zzf, jZzf, this.zzg);
                        this.zze = 0;
                        return true;
                    case 161:
                    case 163:
                    case 165:
                    case 16877:
                    case 16981:
                    case 18402:
                    case 21419:
                    case 25506:
                    case 30322:
                        zzafpVar.zzg(i10, (int) this.zzg, zzaaxVar);
                        this.zze = 0;
                        return true;
                    case 181:
                    case 17545:
                    case 21969:
                    case 21970:
                    case 21971:
                    case 21972:
                    case 21973:
                    case 21974:
                    case 21975:
                    case 21976:
                    case 21977:
                    case 21978:
                    case 30323:
                    case 30324:
                    case 30325:
                        j12 = this.zzg;
                        if (j12 == 4 && j12 != 8) {
                            throw zzcd.zza("Invalid float size: " + j12, null);
                        }
                        i13 = (int) j12;
                        jZzd = zzd(zzaaxVar, i13);
                        if (i13 == 4) {
                            dLongBitsToDouble = Float.intBitsToFloat((int) jZzd);
                        } else {
                            dLongBitsToDouble = Double.longBitsToDouble(jZzd);
                        }
                        zzafnVar.zza.zzi(i10, dLongBitsToDouble);
                        this.zze = 0;
                        return true;
                    default:
                        ((zzaam) zzaaxVar).zzo((int) this.zzg, false);
                        this.zze = 0;
                        break;
                }
            } else {
                long jZzd2 = this.zzc.zzd(zzaaxVar, true, false, 4);
                if (jZzd2 == -2) {
                    zzaaxVar.zzj();
                    while (true) {
                        zzaamVar = (zzaam) zzaaxVar;
                        zzaamVar.zzm(this.zza, 0, 4, false);
                        iZzb = zzafr.zzb(this.zza[0]);
                        if (iZzb != -1 && iZzb <= 4) {
                            iZzc = (int) zzafr.zzc(this.zza, iZzb, false);
                            zzafp zzafpVar2 = ((zzafn) this.zzd).zza;
                            if (iZzc != 357149030 && iZzc != 524531317 && iZzc != 475249515) {
                                if (iZzc == 374648427) {
                                    iZzc = 374648427;
                                }
                            }
                        }
                        zzaamVar.zzo(1, false);
                    }
                    zzaamVar.zzo(iZzb, false);
                    jZzd2 = iZzc;
                }
                if (jZzd2 == -1) {
                    return false;
                }
                this.zzf = (int) jZzd2;
                this.zze = 1;
            }
            this.zzg = this.zzc.zzd(zzaaxVar, false, true, 8);
            this.zze = 2;
            zzafj zzafjVar2 = this.zzd;
            i10 = this.zzf;
            zzafnVar = (zzafn) zzafjVar2;
            zzafpVar = zzafnVar.zza;
            switch (i10) {
                case 131:
                case SyslogConstants.LOG_LOCAL1 /* 136 */:
                case 155:
                case 159:
                case SyslogConstants.LOG_LOCAL6 /* 176 */:
                case 179:
                case 186:
                case 215:
                case 231:
                case 238:
                case 241:
                case 251:
                case 16871:
                case 16980:
                case 17029:
                case 17143:
                case 18401:
                case 18408:
                case 20529:
                case 20530:
                case 21420:
                case 21432:
                case 21680:
                case 21682:
                case 21690:
                case 21930:
                case 21945:
                case 21946:
                case 21947:
                case 21948:
                case 21949:
                case 21998:
                case 22186:
                case 22203:
                case 25188:
                case 30114:
                case 30321:
                case 2352003:
                case 2807729:
                    j10 = this.zzg;
                    if (j10 <= 8) {
                        zzafnVar.zza.zzj(i10, zzd(zzaaxVar, (int) j10));
                        this.zze = 0;
                        return true;
                    }
                    throw zzcd.zza("Invalid integer size: " + j10, null);
                case 134:
                case 17026:
                case 21358:
                case 2274716:
                    j11 = this.zzg;
                    if (j11 <= 2147483647L) {
                        throw zzcd.zza("String element size: " + j11, null);
                    }
                    i11 = (int) j11;
                    if (i11 == 0) {
                        str = "";
                    } else {
                        bArr = new byte[i11];
                        ((zzaam) zzaaxVar).zzn(bArr, 0, i11, false);
                        while (i11 > 0) {
                            i12 = i11 - 1;
                            if (bArr[i12] == 0) {
                                i11 = i12;
                            } else {
                                str = new String(bArr, 0, i11);
                            }
                        }
                        str = new String(bArr, 0, i11);
                    }
                    zzafnVar.zza.zzl(i10, str);
                    this.zze = 0;
                    return true;
                case SyslogConstants.LOG_LOCAL4 /* 160 */:
                case 166:
                case 174:
                case 183:
                case 187:
                case 224:
                case HideBottomViewOnScrollBehavior.ENTER_ANIMATION_DURATION /* 225 */:
                case 16868:
                case 18407:
                case 19899:
                case 20532:
                case 20533:
                case 21936:
                case 21968:
                case 25152:
                case 28032:
                case 30113:
                case 30320:
                case 290298740:
                case 357149030:
                case 374648427:
                case 408125543:
                case 440786851:
                case 475249515:
                case 524531317:
                    long jZzf2 = zzaaxVar.zzf();
                    this.zzb.push(new zzafh(i10, this.zzg + jZzf2, null));
                    ((zzafn) this.zzd).zza.zzk(this.zzf, jZzf2, this.zzg);
                    this.zze = 0;
                    return true;
                case 161:
                case 163:
                case 165:
                case 16877:
                case 16981:
                case 18402:
                case 21419:
                case 25506:
                case 30322:
                    zzafpVar.zzg(i10, (int) this.zzg, zzaaxVar);
                    this.zze = 0;
                    return true;
                case 181:
                case 17545:
                case 21969:
                case 21970:
                case 21971:
                case 21972:
                case 21973:
                case 21974:
                case 21975:
                case 21976:
                case 21977:
                case 21978:
                case 30323:
                case 30324:
                case 30325:
                    j12 = this.zzg;
                    if (j12 == 4) {
                        break;
                    }
                    i13 = (int) j12;
                    jZzd = zzd(zzaaxVar, i13);
                    if (i13 == 4) {
                        dLongBitsToDouble = Float.intBitsToFloat((int) jZzd);
                    } else {
                        dLongBitsToDouble = Double.longBitsToDouble(jZzd);
                    }
                    zzafnVar.zza.zzi(i10, dLongBitsToDouble);
                    this.zze = 0;
                    return true;
                default:
                    ((zzaam) zzaaxVar).zzo((int) this.zzg, false);
                    this.zze = 0;
                    break;
            }
        }
    }
}
