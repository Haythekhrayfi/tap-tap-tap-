package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import v1.b;

/* JADX INFO: loaded from: classes2.dex */
final class zzagn {
    private static final byte[] zza;

    static {
        int i10 = zzfj.zza;
        zza = "OpusHead".getBytes(zzfot.zzc);
    }

    public static zzbz zza(zzagc zzagcVar) {
        zzfn zzfnVar;
        zzagd zzagdVarZzb = zzagcVar.zzb(1751411826);
        zzagd zzagdVarZzb2 = zzagcVar.zzb(1801812339);
        zzagd zzagdVarZzb3 = zzagcVar.zzb(1768715124);
        if (zzagdVarZzb == null || zzagdVarZzb2 == null || zzagdVarZzb3 == null || zzg(zzagdVarZzb.zza) != 1835299937) {
            return null;
        }
        zzfa zzfaVar = zzagdVarZzb2.zza;
        zzfaVar.zzF(12);
        int iZze = zzfaVar.zze();
        String[] strArr = new String[iZze];
        for (int i10 = 0; i10 < iZze; i10++) {
            int iZze2 = zzfaVar.zze();
            zzfaVar.zzG(4);
            strArr[i10] = zzfaVar.zzx(iZze2 - 8, zzfot.zzc);
        }
        zzfa zzfaVar2 = zzagdVarZzb3.zza;
        zzfaVar2.zzF(8);
        ArrayList arrayList = new ArrayList();
        while (zzfaVar2.zza() > 8) {
            int iZzc = zzfaVar2.zzc();
            int iZze3 = zzfaVar2.zze();
            int iZze4 = zzfaVar2.zze() - 1;
            if (iZze4 < 0 || iZze4 >= iZze) {
                zzer.zzf("AtomParsers", "Skipped metadata with unknown key index: " + iZze4);
            } else {
                String str = strArr[iZze4];
                int i11 = iZzc + iZze3;
                while (true) {
                    int iZzc2 = zzfaVar2.zzc();
                    if (iZzc2 >= i11) {
                        zzfnVar = null;
                        break;
                    }
                    int iZze5 = zzfaVar2.zze();
                    if (zzfaVar2.zze() == 1684108385) {
                        int iZze6 = zzfaVar2.zze();
                        int iZze7 = zzfaVar2.zze();
                        int i12 = iZze5 - 16;
                        byte[] bArr = new byte[i12];
                        zzfaVar2.zzB(bArr, 0, i12);
                        zzfnVar = new zzfn(str, bArr, iZze7, iZze6);
                        break;
                    }
                    zzfaVar2.zzF(iZzc2 + iZze5);
                }
                if (zzfnVar != null) {
                    arrayList.add(zzfnVar);
                }
            }
            zzfaVar2.zzF(iZzc + iZze3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzbz(arrayList);
    }

    public static zzagm zzb(zzagd zzagdVar) {
        zzfa zzfaVar = zzagdVar.zza;
        zzfaVar.zzF(8);
        zzbz zzbzVar = null;
        zzbz zzbzVar2 = null;
        zzbz zzbzVarZzk = null;
        while (zzfaVar.zza() >= 8) {
            int iZzc = zzfaVar.zzc();
            int iZze = zzfaVar.zze();
            int iZze2 = zzfaVar.zze();
            if (iZze2 == 1835365473) {
                zzfaVar.zzF(iZzc);
                int i10 = iZzc + iZze;
                zzfaVar.zzG(8);
                zzd(zzfaVar);
                while (true) {
                    if (zzfaVar.zzc() < i10) {
                        int iZzc2 = zzfaVar.zzc();
                        int iZze3 = zzfaVar.zze();
                        if (zzfaVar.zze() == 1768715124) {
                            zzfaVar.zzF(iZzc2);
                            int i11 = iZzc2 + iZze3;
                            zzfaVar.zzG(8);
                            ArrayList arrayList = new ArrayList();
                            while (zzfaVar.zzc() < i11) {
                                zzby zzbyVarZza = zzagu.zza(zzfaVar);
                                if (zzbyVarZza != null) {
                                    arrayList.add(zzbyVarZza);
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                zzbzVar = new zzbz(arrayList);
                                break;
                            }
                        } else {
                            zzfaVar.zzF(iZzc2 + iZze3);
                        }
                    }
                    zzbzVar = null;
                    break;
                }
            }
            if (iZze2 == 1936553057) {
                zzfaVar.zzF(iZzc);
                int i12 = iZzc + iZze;
                zzfaVar.zzG(12);
                while (true) {
                    if (zzfaVar.zzc() < i12) {
                        int iZzc3 = zzfaVar.zzc();
                        int iZze4 = zzfaVar.zze();
                        if (zzfaVar.zze() != 1935766900) {
                            zzfaVar.zzF(iZzc3 + iZze4);
                        } else if (iZze4 >= 14) {
                            zzfaVar.zzG(5);
                            int iZzk = zzfaVar.zzk();
                            float f10 = 120.0f;
                            if (iZzk != 12) {
                                if (iZzk != 13) {
                                }
                            } else if (iZzk == 12) {
                                f10 = 240.0f;
                            }
                            zzfaVar.zzG(1);
                            zzbzVar2 = new zzbz(-9223372036854775807L, new zzafd(f10, zzfaVar.zzk()));
                            break;
                        }
                    }
                    zzbzVar2 = null;
                    break;
                }
            }
            if (iZze2 == -1451722374) {
                zzbzVarZzk = zzk(zzfaVar);
            }
            zzfaVar.zzF(iZzc + iZze);
        }
        return new zzagm(zzbzVar, zzbzVar2, zzbzVarZzk);
    }

    /* JADX WARN: Code duplicated, block: B:368:0x078c  */
    /* JADX WARN: Code duplicated, block: B:369:0x0791  */
    /* JADX WARN: Code duplicated, block: B:388:0x084a  */
    /* JADX WARN: Code duplicated, block: B:390:0x0871  */
    /* JADX WARN: Code duplicated, block: B:391:0x0879  */
    /* JADX WARN: Code duplicated, block: B:393:0x0882  */
    /* JADX WARN: Code duplicated, block: B:396:0x088d  */
    /* JADX WARN: Code duplicated, block: B:397:0x08ac  */
    /* JADX WARN: Code duplicated, block: B:399:0x08b5  */
    /* JADX WARN: Code duplicated, block: B:400:0x08c1  */
    /* JADX WARN: Code duplicated, block: B:403:0x08e5  */
    /* JADX WARN: Code duplicated, block: B:404:0x08e8  */
    /* JADX WARN: Code duplicated, block: B:407:0x08f2  */
    /* JADX WARN: Code duplicated, block: B:408:0x08f5  */
    /* JADX WARN: Code duplicated, block: B:411:0x090f  */
    /* JADX WARN: Code duplicated, block: B:412:0x0917  */
    /* JADX WARN: Code duplicated, block: B:414:0x091a  */
    /* JADX WARN: Code duplicated, block: B:416:0x0923  */
    /* JADX WARN: Code duplicated, block: B:417:0x0929  */
    /* JADX WARN: Code duplicated, block: B:418:0x092b  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00fa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:445:0x09db A[PHI: r5
  0x09db: PHI (r5v25 int) = (r5v24 int), (r5v24 int), (r5v52 int), (r5v24 int) binds: [B:420:0x0937, B:427:0x0951, B:444:0x09da, B:426:0x094f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:447:0x0a08  */
    /* JADX WARN: Code duplicated, block: B:449:0x0a0c  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:451:0x0a12 A[LOOP:11: B:448:0x0a0a->B:451:0x0a12, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:456:0x0a51 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:458:0x0a56 A[ADDED_TO_REGION, LOOP:12: B:458:0x0a56->B:460:0x0a5a, LOOP_START, PHI: r17 r19 r51
  0x0a56: PHI (r17v13 int) = (r17v7 int), (r17v14 int) binds: [B:456:0x0a51, B:460:0x0a5a] A[DONT_GENERATE, DONT_INLINE]
  0x0a56: PHI (r19v5 int) = (r19v3 int), (r19v9 int) binds: [B:456:0x0a51, B:460:0x0a5a] A[DONT_GENERATE, DONT_INLINE]
  0x0a56: PHI (r51v2 int) = (r51v1 int), (r51v3 int) binds: [B:456:0x0a51, B:460:0x0a5a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:459:0x0a58 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:460:0x0a5a A[LOOP:12: B:458:0x0a56->B:460:0x0a5a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:465:0x0a76  */
    /* JADX WARN: Code duplicated, block: B:468:0x0a7f  */
    /* JADX WARN: Code duplicated, block: B:469:0x0a81  */
    /* JADX WARN: Code duplicated, block: B:46:0x0101  */
    /* JADX WARN: Code duplicated, block: B:472:0x0a86  */
    /* JADX WARN: Code duplicated, block: B:474:0x0a8d  */
    /* JADX WARN: Code duplicated, block: B:477:0x0aa2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:478:0x0aa4  */
    /* JADX WARN: Code duplicated, block: B:479:0x0ab4  */
    /* JADX WARN: Code duplicated, block: B:47:0x0103  */
    /* JADX WARN: Code duplicated, block: B:484:0x0ae2 A[DONT_INVERT, LOOP:13: B:484:0x0ae2->B:488:0x0aec, LOOP_START, PHI: r17
  0x0ae2: PHI (r17v11 int) = (r17v7 int), (r17v12 int) binds: [B:483:0x0ae0, B:488:0x0aec] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:485:0x0ae4  */
    /* JADX WARN: Code duplicated, block: B:488:0x0aec A[LOOP:13: B:484:0x0ae2->B:488:0x0aec, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:489:0x0af2 A[EDGE_INSN: B:489:0x0af2->B:490:0x0af3 BREAK  A[LOOP:13: B:484:0x0ae2->B:488:0x0aec]] */
    /* JADX WARN: Code duplicated, block: B:48:0x0104 A[PHI: r6
  0x0104: PHI (r6v5 int) = (r6v3 int), (r6v7 int) binds: [B:42:0x00f8, B:47:0x0103] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:491:0x0af5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:492:0x0af7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:493:0x0af9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:494:0x0afb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:495:0x0afd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:496:0x0aff  */
    /* JADX WARN: Code duplicated, block: B:497:0x0b10  */
    /* JADX WARN: Code duplicated, block: B:498:0x0b1b  */
    /* JADX WARN: Code duplicated, block: B:499:0x0b21  */
    /* JADX WARN: Code duplicated, block: B:500:0x0b26  */
    /* JADX WARN: Code duplicated, block: B:502:0x0b36  */
    /* JADX WARN: Code duplicated, block: B:503:0x0b38 A[PHI: r16
  0x0b38: PHI (r16v15 int) = (r16v14 int), (r16v18 int) binds: [B:490:0x0af3, B:502:0x0b36] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:506:0x0b6c  */
    /* JADX WARN: Code duplicated, block: B:507:0x0b6f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0107 A[DONT_INVERT, PHI: r0 r6 r9
  0x0107: PHI (r0v5 int) = (r0v4 int), (r0v8 int) binds: [B:41:0x00f6, B:49:0x0105] A[DONT_GENERATE, DONT_INLINE]
  0x0107: PHI (r6v4 int) = (r6v3 int), (r6v6 int) binds: [B:41:0x00f6, B:49:0x0105] A[DONT_GENERATE, DONT_INLINE]
  0x0107: PHI (r9v5 int) = (r9v4 int), (r9v6 int) binds: [B:41:0x00f6, B:49:0x0105] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:512:0x0b95  */
    /* JADX WARN: Code duplicated, block: B:514:0x0bb1  */
    /* JADX WARN: Code duplicated, block: B:51:0x0109 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:533:0x0c4f  */
    /* JADX WARN: Code duplicated, block: B:536:0x0c59  */
    /* JADX WARN: Code duplicated, block: B:538:0x0c62  */
    /* JADX WARN: Code duplicated, block: B:541:0x0c6d A[LOOP:5: B:539:0x0c6a->B:541:0x0c6d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:544:0x0ca3  */
    /* JADX WARN: Code duplicated, block: B:547:0x0ca9  */
    /* JADX WARN: Code duplicated, block: B:548:0x0cab  */
    /* JADX WARN: Code duplicated, block: B:552:0x0cbe  */
    /* JADX WARN: Code duplicated, block: B:554:0x0cc9  */
    /* JADX WARN: Code duplicated, block: B:557:0x0cf4  */
    /* JADX WARN: Code duplicated, block: B:55:0x0112  */
    /* JADX WARN: Code duplicated, block: B:562:0x0d08  */
    /* JADX WARN: Code duplicated, block: B:564:0x0d0f  */
    /* JADX WARN: Code duplicated, block: B:568:0x0d2b  */
    /* JADX WARN: Code duplicated, block: B:569:0x0d2d  */
    /* JADX WARN: Code duplicated, block: B:572:0x0d32  */
    /* JADX WARN: Code duplicated, block: B:573:0x0d35  */
    /* JADX WARN: Code duplicated, block: B:575:0x0d39  */
    /* JADX WARN: Code duplicated, block: B:576:0x0d3c  */
    /* JADX WARN: Code duplicated, block: B:579:0x0d40  */
    /* JADX WARN: Code duplicated, block: B:581:0x0d44  */
    /* JADX WARN: Code duplicated, block: B:582:0x0d47  */
    /* JADX WARN: Code duplicated, block: B:586:0x0d54  */
    /* JADX WARN: Code duplicated, block: B:588:0x0d60  */
    /* JADX WARN: Code duplicated, block: B:589:0x0d72  */
    /* JADX WARN: Code duplicated, block: B:592:0x0d7c  */
    /* JADX WARN: Code duplicated, block: B:594:0x0dae  */
    /* JADX WARN: Code duplicated, block: B:603:0x0e11  */
    /* JADX WARN: Code duplicated, block: B:611:0x0e09 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:620:0x0d20 A[EDGE_INSN: B:620:0x0d20->B:566:0x0d20 BREAK  A[LOOP:6: B:550:0x0cb9->B:565:0x0d16], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:623:0x0d01 A[ADDED_TO_REGION, EDGE_INSN: B:623:0x0d01->B:560:0x0d01 BREAK  A[LOOP:7: B:555:0x0cec->B:559:0x0cf9], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:628:0x0db4 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:630:0x0a39 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:631:0x0ad3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:633:0x0ab5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:635:0x0a2f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:636:0x0a27 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:638:0x0a65 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:639:0x0af2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:640:0x0aea A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:554:0x0cc9, please report this as an issue */
    public static List zzc(zzagc zzagcVar, zzabl zzablVar, long j10, zzad zzadVar, boolean z10, boolean z11, zzfov zzfovVar) throws zzcd {
        long jZzs;
        int i10;
        ArrayList arrayList;
        int i11;
        String str;
        zzagc zzagcVar2;
        long[] jArr;
        long[] jArr2;
        zzahc zzahcVar;
        Pair pairZzh;
        int i12;
        zzagi zzagiVar;
        zzad zzadVarZzb;
        String str2;
        float fZzn;
        int i13;
        int i14;
        int i15;
        byte[] bArrArray;
        zzagi zzagiVar2;
        int i16;
        int i17;
        int i18;
        int i19;
        zzagi zzagiVar3;
        String str3;
        int i20;
        boolean z12;
        int i21;
        byte[] bArrZzq;
        String str4;
        List list;
        String str5;
        int i22;
        int i23;
        String str6;
        zzagi zzagiVar4;
        int i24;
        int i25;
        String str7;
        String str8;
        zzfsc zzfscVarZzm;
        long j11;
        zzahc zzahcVar2;
        ArrayList arrayList2;
        zzagc zzagcVarZza;
        zzagd zzagdVarZzb;
        zzagd zzagdVarZzb2;
        zzagh zzagkVar;
        int iZzb;
        zzagd zzagdVarZzb3;
        boolean z13;
        zzfa zzfaVar;
        zzagd zzagdVarZzb4;
        zzfa zzfaVar2;
        zzagd zzagdVarZzb5;
        zzfa zzfaVar3;
        zzagf zzagfVar;
        int iZzn;
        int iZzn2;
        int iZzn3;
        int iZzn4;
        int iZzn5;
        int iZza;
        int i26;
        long[] jArrCopyOf;
        int[] iArrCopyOf;
        long[] jArrCopyOf2;
        int i27;
        int[] iArrCopyOf2;
        int i28;
        int iZzn6;
        long j12;
        long j13;
        int iZze;
        int i29;
        int iZzn7;
        zzahc zzahcVar3;
        int i30;
        int i31;
        int i32;
        int i33;
        boolean z14;
        boolean z15;
        int i34;
        int i35;
        int i36;
        int i37;
        long j14;
        long[] jArr3;
        long[] jArr4;
        int[] iArr;
        int[] iArr2;
        int i38;
        String str9;
        int i39;
        boolean zZza;
        int i40;
        int iZzc;
        int i41;
        int iZze2;
        int iZzn8;
        long jZzp;
        long[] jArr5;
        int[] iArr3;
        long[] jArr6;
        int length;
        boolean z16;
        int[] iArr4;
        int[] iArr5;
        long[] jArr7;
        int i42;
        int i43;
        boolean z17;
        int i44;
        long[] jArr8;
        int[] iArr6;
        long[] jArr9;
        int i45;
        boolean z18;
        boolean z19;
        long[] jArr10;
        int[] iArr7;
        int[] iArr8;
        long[] jArr11;
        long j15;
        int i46;
        int i47;
        zzahf zzahfVar;
        long j16;
        int i48;
        int i49;
        long[] jArr12;
        long j17;
        int i50;
        int[] iArr9;
        int i51;
        int i52;
        int i53;
        long j18;
        int i54;
        zzahf zzahfVar2;
        ArrayList arrayList3 = new ArrayList();
        int i55 = 0;
        while (i55 < zzagcVar.zzc.size()) {
            zzagc zzagcVar3 = (zzagc) zzagcVar.zzc.get(i55);
            if (zzagcVar3.zzd != 1953653099) {
                arrayList2 = arrayList3;
                i11 = i55;
            } else {
                zzagd zzagdVarZzb6 = zzagcVar.zzb(1836476516);
                Objects.requireNonNull(zzagdVarZzb6);
                zzagc zzagcVarZza2 = zzagcVar3.zza(1835297121);
                Objects.requireNonNull(zzagcVarZza2);
                zzagd zzagdVarZzb7 = zzagcVarZza2.zzb(1751411826);
                Objects.requireNonNull(zzagdVarZzb7);
                int iZze3 = zze(zzg(zzagdVarZzb7.zza));
                int iZzn9 = -1;
                if (iZze3 == -1) {
                    arrayList = arrayList3;
                    i11 = i55;
                    zzagcVar2 = zzagcVar3;
                    str = "AtomParsers";
                } else {
                    zzagd zzagdVarZzb8 = zzagcVar3.zzb(1953196132);
                    Objects.requireNonNull(zzagdVarZzb8);
                    zzfa zzfaVar4 = zzagdVarZzb8.zza;
                    zzfaVar4.zzF(8);
                    int iZze4 = zzage.zze(zzfaVar4.zze());
                    zzfaVar4.zzG(iZze4 != 0 ? 16 : 8);
                    int iZze5 = zzfaVar4.zze();
                    zzfaVar4.zzG(4);
                    int iZzc2 = zzfaVar4.zzc();
                    int i56 = 0;
                    while (true) {
                        int i57 = iZze4 == 0 ? 4 : 8;
                        if (i56 >= i57) {
                            zzfaVar4.zzG(i57);
                        } else {
                            if (zzfaVar4.zzH()[iZzc2 + i56] != -1) {
                                jZzs = iZze4 == 0 ? zzfaVar4.zzs() : zzfaVar4.zzt();
                                if (jZzs != 0) {
                                    break;
                                }
                                break;
                            }
                            i56++;
                        }
                        jZzs = -9223372036854775807L;
                        break;
                    }
                    zzfaVar4.zzG(16);
                    int iZze6 = zzfaVar4.zze();
                    int iZze7 = zzfaVar4.zze();
                    zzfaVar4.zzG(4);
                    int iZze8 = zzfaVar4.zze();
                    int iZze9 = zzfaVar4.zze();
                    String str10 = "AtomParsers";
                    int i58 = 65536;
                    int i59 = iZze3;
                    if (iZze6 == 0) {
                        if (iZze7 == 65536) {
                            if (iZze8 == -65536) {
                                if (iZze9 == 0) {
                                    i10 = 90;
                                } else {
                                    iZze8 = -65536;
                                }
                            }
                            iZze7 = 65536;
                        }
                        iZze6 = 0;
                        if (iZze6 != 0) {
                            if (iZze6 != -65536) {
                                i10 = 0;
                            } else {
                                i10 = 0;
                            }
                        } else if (iZze7 != -65536) {
                            i58 = iZze8;
                            iZze6 = 0;
                            iZze8 = i58;
                            if (iZze6 != -65536) {
                                i10 = 0;
                            } else {
                                i10 = 0;
                            }
                        } else if (iZze8 == 65536) {
                            iZze7 = -65536;
                            i58 = iZze8;
                            iZze6 = 0;
                            iZze8 = i58;
                            if (iZze6 != -65536) {
                                i10 = 0;
                            } else {
                                i10 = 0;
                            }
                        } else if (iZze9 == 0) {
                            i10 = 270;
                        } else {
                            iZze7 = -65536;
                            iZze6 = 0;
                            iZze8 = i58;
                            if (iZze6 != -65536) {
                                i10 = 0;
                            } else {
                                i10 = 0;
                            }
                        }
                    } else if (iZze6 != 0) {
                        if (iZze6 != -65536 && iZze7 == 0 && iZze8 == 0 && iZze9 == -65536) {
                            i10 = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                        } else {
                            i10 = 0;
                        }
                    } else if (iZze7 != -65536) {
                        i58 = iZze8;
                        iZze6 = 0;
                        iZze8 = i58;
                        if (iZze6 != -65536) {
                            i10 = 0;
                        } else {
                            i10 = 0;
                        }
                    } else if (iZze8 == 65536) {
                        iZze7 = -65536;
                        i58 = iZze8;
                        iZze6 = 0;
                        iZze8 = i58;
                        if (iZze6 != -65536) {
                            i10 = 0;
                        } else {
                            i10 = 0;
                        }
                    } else if (iZze9 == 0) {
                        i10 = 270;
                    } else {
                        iZze7 = -65536;
                        iZze6 = 0;
                        iZze8 = i58;
                        if (iZze6 != -65536) {
                            i10 = 0;
                        } else {
                            i10 = 0;
                        }
                    }
                    zzagl zzaglVar = new zzagl(iZze5, jZzs, i10);
                    long j19 = j10 == -9223372036854775807L ? zzaglVar.zzb : j10;
                    zzfa zzfaVar5 = zzagdVarZzb6.zza;
                    zzfaVar5.zzF(8);
                    zzfaVar5.zzG(zzage.zze(zzfaVar5.zze()) != 0 ? 16 : 8);
                    long jZzs2 = zzfaVar5.zzs();
                    long jZzp2 = j19 == -9223372036854775807L ? -9223372036854775807L : zzfj.zzp(j19, 1000000L, jZzs2);
                    zzagc zzagcVarZza3 = zzagcVarZza2.zza(1835626086);
                    Objects.requireNonNull(zzagcVarZza3);
                    zzagc zzagcVarZza4 = zzagcVarZza3.zza(1937007212);
                    Objects.requireNonNull(zzagcVarZza4);
                    zzagd zzagdVarZzb9 = zzagcVarZza2.zzb(1835296868);
                    Objects.requireNonNull(zzagdVarZzb9);
                    Pair pairZzi = zzi(zzagdVarZzb9.zza);
                    zzagd zzagdVarZzb10 = zzagcVarZza4.zzb(1937011556);
                    if (zzagdVarZzb10 == null) {
                        throw zzcd.zza("Malformed sample table (stbl) missing sample description (stsd)", null);
                    }
                    zzfa zzfaVar6 = zzagdVarZzb10.zza;
                    int i60 = zzaglVar.zza;
                    int i61 = zzaglVar.zzc;
                    String str11 = (String) pairZzi.second;
                    zzfaVar6.zzF(12);
                    int iZze10 = zzfaVar6.zze();
                    zzagi zzagiVar5 = new zzagi(iZze10);
                    int i62 = 0;
                    while (i62 < iZze10) {
                        int iZzc3 = zzfaVar6.zzc();
                        int iZze11 = zzfaVar6.zze();
                        int i63 = i62;
                        int i64 = iZze10;
                        zzaba.zzb(iZze11 > 0, "childAtomSize must be positive");
                        int iZze12 = zzfaVar6.zze();
                        int i65 = i61;
                        if (iZze12 == 1635148593 || iZze12 == 1635148595 || iZze12 == 1701733238 || iZze12 == 1831958048 || iZze12 == 1836070006 || iZze12 == 1752589105 || iZze12 == 1751479857 || iZze12 == 1932670515 || iZze12 == 1211250227 || iZze12 == 1987063864 || iZze12 == 1987063865 || iZze12 == 1635135537 || iZze12 == 1685479798 || iZze12 == 1685479729 || iZze12 == 1685481573 || iZze12 == 1685481521) {
                            i12 = iZze11;
                            zzagi zzagiVar6 = zzagiVar5;
                            str11 = str11;
                            pairZzi = pairZzi;
                            arrayList3 = arrayList3;
                            i55 = i55;
                            zzagcVar3 = zzagcVar3;
                            i59 = i59;
                            str10 = str10;
                            int i66 = iZzc3;
                            int i67 = i60;
                            zzaglVar = zzaglVar;
                            zzfaVar6.zzF(i66 + 16);
                            zzfaVar6.zzG(16);
                            int iZzo = zzfaVar6.zzo();
                            int iZzo2 = zzfaVar6.zzo();
                            zzfaVar6.zzG(50);
                            int iZzc4 = zzfaVar6.zzc();
                            if (iZze12 == 1701733238) {
                                Pair pairZzj = zzj(zzfaVar6, i66, i12);
                                if (pairZzj != null) {
                                    int iIntValue = ((Integer) pairZzj.first).intValue();
                                    zzadVarZzb = zzadVar == null ? null : zzadVar.zzb(((zzahd) pairZzj.second).zzb);
                                    zzagiVar = zzagiVar6;
                                    zzagiVar.zza[i63] = (zzahd) pairZzj.second;
                                    iZze12 = iIntValue;
                                } else {
                                    zzagiVar = zzagiVar6;
                                    iZze12 = 1701733238;
                                    zzadVarZzb = zzadVar;
                                }
                                zzfaVar6.zzF(iZzc4);
                            } else {
                                zzagiVar = zzagiVar6;
                                zzadVarZzb = zzadVar;
                            }
                            if (iZze12 == 1831958048) {
                                str2 = "video/mpeg";
                            } else if (iZze12 == 1211250227) {
                                str2 = "video/3gpp";
                                iZze12 = 1211250227;
                            } else {
                                str2 = null;
                            }
                            float f10 = 1.0f;
                            int iZza2 = -1;
                            String str12 = null;
                            byte[] bArr = null;
                            ByteBuffer byteBufferZzm = null;
                            zzagg zzaggVar = null;
                            boolean z20 = false;
                            int iZzb2 = -1;
                            List listZzm = null;
                            int i68 = -1;
                            int i69 = -1;
                            zzad zzadVar2 = zzadVarZzb;
                            while (true) {
                                if (iZzc4 - i66 >= i12) {
                                    fZzn = f10;
                                    break;
                                }
                                zzfaVar6.zzF(iZzc4);
                                int iZzc5 = zzfaVar6.zzc();
                                int iZze13 = zzfaVar6.zze();
                                if (iZze13 == 0) {
                                    fZzn = f10;
                                    if (zzfaVar6.zzc() - i66 == i12) {
                                        break;
                                    }
                                    iZze13 = 0;
                                } else {
                                    fZzn = f10;
                                }
                                int i70 = iZze13;
                                int i71 = i12;
                                int i72 = i66;
                                zzaba.zzb(i70 > 0, "childAtomSize must be positive");
                                int iZze14 = zzfaVar6.zze();
                                if (iZze14 == 1635148611) {
                                    zzaba.zzb(str2 == null, null);
                                    zzfaVar6.zzF(iZzc5 + 8);
                                    zzaab zzaabVarZza = zzaab.zza(zzfaVar6);
                                    list = zzaabVarZza.zza;
                                    zzagiVar.zzc = zzaabVarZza.zzb;
                                    if (!z20) {
                                        fZzn = zzaabVarZza.zzh;
                                    }
                                    str5 = zzaabVarZza.zzi;
                                    iZza2 = zzaabVarZza.zze;
                                    i22 = zzaabVarZza.zzf;
                                    i23 = zzaabVarZza.zzg;
                                    str6 = "video/avc";
                                } else {
                                    if (iZze14 == 1752589123) {
                                        zzaba.zzb(str2 == null, null);
                                        zzfaVar6.zzF(iZzc5 + 8);
                                        zzabm zzabmVarZza = zzabm.zza(zzfaVar6);
                                        list = zzabmVarZza.zza;
                                        zzagiVar.zzc = zzabmVarZza.zzb;
                                        if (!z20) {
                                            fZzn = zzabmVarZza.zzf;
                                        }
                                        str5 = zzabmVarZza.zzg;
                                        iZza2 = zzabmVarZza.zzc;
                                        i22 = zzabmVarZza.zzd;
                                        i23 = zzabmVarZza.zze;
                                        str6 = "video/hevc";
                                    } else {
                                        if (iZze14 == 1685480259 || iZze14 == 1685485123) {
                                            i16 = iZzo;
                                            i17 = iZzo2;
                                            i18 = iZze12;
                                            i19 = iZzc4;
                                            zzagiVar3 = zzagiVar;
                                            str3 = str12;
                                            i20 = i67;
                                            zzaas zzaasVarZza = zzaas.zza(zzfaVar6);
                                            if (zzaasVarZza != null) {
                                                str12 = zzaasVarZza.zza;
                                                str2 = "video/dolby-vision";
                                            }
                                        } else {
                                            if (iZze14 == 1987076931) {
                                                zzaba.zzb(str2 == null, null);
                                                zzfaVar6.zzF(iZzc5 + 12);
                                                zzfaVar6.zzG(2);
                                                int iZzk = zzfaVar6.zzk() & 1;
                                                int iZzk2 = zzfaVar6.zzk();
                                                int iZzk3 = zzfaVar6.zzk();
                                                iZza2 = zzs.zza(iZzk2);
                                                i69 = 1 != iZzk ? 2 : 1;
                                                iZzb2 = zzs.zzb(iZzk3);
                                                str4 = iZze12 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                            } else {
                                                if (iZze14 == 1635135811) {
                                                    zzaba.zzb(str2 == null, null);
                                                    str2 = "video/av01";
                                                } else if (iZze14 == 1668050025) {
                                                    if (byteBufferZzm == null) {
                                                        byteBufferZzm = zzm();
                                                    }
                                                    ByteBuffer byteBuffer = byteBufferZzm;
                                                    byteBuffer.position(21);
                                                    byteBuffer.putShort(zzfaVar6.zzy());
                                                    byteBuffer.putShort(zzfaVar6.zzy());
                                                    byteBufferZzm = byteBuffer;
                                                } else {
                                                    if (iZze14 == 1835295606) {
                                                        if (byteBufferZzm == null) {
                                                            byteBufferZzm = zzm();
                                                        }
                                                        ByteBuffer byteBuffer2 = byteBufferZzm;
                                                        short sZzy = zzfaVar6.zzy();
                                                        short sZzy2 = zzfaVar6.zzy();
                                                        i18 = iZze12;
                                                        short sZzy3 = zzfaVar6.zzy();
                                                        zzagiVar3 = zzagiVar;
                                                        short sZzy4 = zzfaVar6.zzy();
                                                        i17 = iZzo2;
                                                        short sZzy5 = zzfaVar6.zzy();
                                                        i16 = iZzo;
                                                        short sZzy6 = zzfaVar6.zzy();
                                                        str3 = str12;
                                                        short sZzy7 = zzfaVar6.zzy();
                                                        i20 = i67;
                                                        short sZzy8 = zzfaVar6.zzy();
                                                        long jZzs3 = zzfaVar6.zzs();
                                                        long jZzs4 = zzfaVar6.zzs();
                                                        i19 = iZzc4;
                                                        byteBuffer2.position(1);
                                                        byteBuffer2.putShort(sZzy5);
                                                        byteBuffer2.putShort(sZzy6);
                                                        byteBuffer2.putShort(sZzy);
                                                        byteBuffer2.putShort(sZzy2);
                                                        byteBuffer2.putShort(sZzy3);
                                                        byteBuffer2.putShort(sZzy4);
                                                        byteBuffer2.putShort(sZzy7);
                                                        byteBuffer2.putShort(sZzy8);
                                                        byteBuffer2.putShort((short) (jZzs3 / AbstractComponentTracker.LINGERING_TIMEOUT));
                                                        byteBuffer2.putShort((short) (jZzs4 / AbstractComponentTracker.LINGERING_TIMEOUT));
                                                        byteBufferZzm = byteBuffer2;
                                                    } else {
                                                        i16 = iZzo;
                                                        i17 = iZzo2;
                                                        i18 = iZze12;
                                                        i19 = iZzc4;
                                                        zzagiVar3 = zzagiVar;
                                                        str3 = str12;
                                                        i20 = i67;
                                                        if (iZze14 == 1681012275) {
                                                            zzaba.zzb(str2 == null, null);
                                                            str2 = "video/3gpp";
                                                        } else if (iZze14 == 1702061171) {
                                                            zzaba.zzb(str2 == null, null);
                                                            zzagg zzaggVarZzl = zzl(zzfaVar6, iZzc5);
                                                            str2 = zzaggVarZzl.zza;
                                                            byte[] bArr2 = zzaggVarZzl.zzb;
                                                            if (bArr2 != null) {
                                                                zzaggVar = zzaggVarZzl;
                                                                listZzm = zzfsc.zzm(bArr2);
                                                            } else {
                                                                zzaggVar = zzaggVarZzl;
                                                            }
                                                        } else if (iZze14 == 1885434736) {
                                                            zzfaVar6.zzF(iZzc5 + 8);
                                                            fZzn = zzfaVar6.zzn() / zzfaVar6.zzn();
                                                            z20 = true;
                                                        } else if (iZze14 == 1937126244) {
                                                            bArrZzq = zzq(zzfaVar6, iZzc5, i70);
                                                            str4 = str2;
                                                            str2 = str4;
                                                            bArr = bArrZzq;
                                                        } else if (iZze14 == 1936995172) {
                                                            int iZzk4 = zzfaVar6.zzk();
                                                            zzfaVar6.zzG(3);
                                                            if (iZzk4 == 0) {
                                                                int iZzk5 = zzfaVar6.zzk();
                                                                if (iZzk5 == 0) {
                                                                    i21 = 0;
                                                                } else if (iZzk5 == 1) {
                                                                    i21 = 1;
                                                                } else if (iZzk5 == 2) {
                                                                    i21 = 2;
                                                                } else if (iZzk5 == 3) {
                                                                    i68 = 3;
                                                                }
                                                                i68 = i21;
                                                            }
                                                        } else if (iZze14 == 1668246642 && iZza2 == -1) {
                                                            if (iZzb2 == -1) {
                                                                int iZze15 = zzfaVar6.zze();
                                                                if (iZze15 == 1852009592 || iZze15 == 1852009571) {
                                                                    int iZzo3 = zzfaVar6.zzo();
                                                                    int iZzo4 = zzfaVar6.zzo();
                                                                    zzfaVar6.zzG(2);
                                                                    int i73 = 19;
                                                                    if (i70 != 19) {
                                                                        z12 = false;
                                                                        i73 = i70;
                                                                    } else if ((zzfaVar6.zzk() & 128) != 0) {
                                                                        z12 = true;
                                                                    } else {
                                                                        i70 = 19;
                                                                        z12 = false;
                                                                        i73 = i70;
                                                                    }
                                                                    iZza2 = zzs.zza(iZzo3);
                                                                    i69 = true != z12 ? 2 : 1;
                                                                    iZzb2 = zzs.zzb(iZzo4);
                                                                    i70 = i73;
                                                                } else {
                                                                    zzer.zzf(str10, "Unsupported color type: ".concat(zzage.zzf(iZze15)));
                                                                    iZza2 = -1;
                                                                    iZzb2 = -1;
                                                                }
                                                            } else {
                                                                iZza2 = -1;
                                                            }
                                                        }
                                                    }
                                                    bArrZzq = bArr;
                                                    str4 = str2;
                                                    str2 = str4;
                                                    bArr = bArrZzq;
                                                }
                                                str4 = str2;
                                            }
                                            i16 = iZzo;
                                            i17 = iZzo2;
                                            i18 = iZze12;
                                            i19 = iZzc4;
                                            zzagiVar3 = zzagiVar;
                                            str3 = str12;
                                            i20 = i67;
                                            bArrZzq = bArr;
                                            str2 = str4;
                                            bArr = bArrZzq;
                                        }
                                        str12 = str3;
                                    }
                                    iZzc4 = i19 + i70;
                                    i66 = i72;
                                    iZze12 = i18;
                                    f10 = fZzn;
                                    i12 = i71;
                                    zzagiVar = zzagiVar3;
                                    iZzo2 = i17;
                                    iZzo = i16;
                                    i67 = i20;
                                }
                                i16 = iZzo;
                                i17 = iZzo2;
                                i18 = iZze12;
                                i19 = iZzc4;
                                listZzm = list;
                                zzagiVar3 = zzagiVar;
                                i69 = i22;
                                str2 = str6;
                                i20 = i67;
                                iZzb2 = i23;
                                str12 = str5;
                                iZzc4 = i19 + i70;
                                i66 = i72;
                                iZze12 = i18;
                                f10 = fZzn;
                                i12 = i71;
                                zzagiVar = zzagiVar3;
                                iZzo2 = i17;
                                iZzo = i16;
                                i67 = i20;
                            }
                            zzagi zzagiVar7 = zzagiVar;
                            String str13 = str12;
                            i13 = i66;
                            int i74 = i67;
                            if (str2 == null) {
                                i15 = i65;
                                zzagiVar2 = zzagiVar7;
                                i14 = i74;
                            } else {
                                zzak zzakVar = new zzak();
                                i14 = i74;
                                zzakVar.zzG(i14);
                                zzakVar.zzS(str2);
                                zzakVar.zzx(str13);
                                zzakVar.zzX(iZzo);
                                zzakVar.zzF(iZzo2);
                                zzakVar.zzP(fZzn);
                                i15 = i65;
                                zzakVar.zzR(i15);
                                zzakVar.zzQ(bArr);
                                zzakVar.zzV(i68);
                                zzakVar.zzI(listZzm);
                                zzakVar.zzB(zzadVar2);
                                int i75 = i69;
                                if (iZza2 != -1) {
                                    if (byteBufferZzm != null) {
                                        bArrArray = byteBufferZzm.array();
                                    } else {
                                        bArrArray = null;
                                    }
                                    zzakVar.zzy(new zzs(iZza2, i75, iZzb2, bArrArray));
                                } else {
                                    if (i75 == -1) {
                                        if (iZzb2 == -1) {
                                            if (byteBufferZzm != null) {
                                                iZzb2 = -1;
                                            }
                                        }
                                        i75 = -1;
                                        iZza2 = -1;
                                    } else {
                                        iZza2 = -1;
                                    }
                                    if (byteBufferZzm != null) {
                                        bArrArray = byteBufferZzm.array();
                                    } else {
                                        bArrArray = null;
                                    }
                                    zzakVar.zzy(new zzs(iZza2, i75, iZzb2, bArrArray));
                                }
                                if (zzaggVar != null) {
                                    zzakVar.zzv(zzfuk.zzc(zzaggVar.zzc));
                                    zzakVar.zzO(zzfuk.zzc(zzaggVar.zzd));
                                }
                                zzam zzamVarZzY = zzakVar.zzY();
                                zzagiVar2 = zzagiVar7;
                                zzagiVar2.zzb = zzamVarZzY;
                            }
                        } else if (iZze12 == 1836069985 || iZze12 == 1701733217 || iZze12 == 1633889587 || iZze12 == 1700998451 || iZze12 == 1633889588 || iZze12 == 1835823201 || iZze12 == 1685353315 || iZze12 == 1685353317 || iZze12 == 1685353320 || iZze12 == 1685353324 || iZze12 == 1685353336 || iZze12 == 1935764850 || iZze12 == 1935767394 || iZze12 == 1819304813 || iZze12 == 1936684916 || iZze12 == 1953984371 || iZze12 == 778924082 || iZze12 == 778924083 || iZze12 == 1835557169 || iZze12 == 1835560241 || iZze12 == 1634492771 || iZze12 == 1634492791 || iZze12 == 1970037111 || iZze12 == 1332770163 || iZze12 == 1716281667) {
                            int i76 = iZze11;
                            zzagiVar4 = zzagiVar5;
                            i24 = iZzc3;
                            i25 = i76;
                            zzn(zzfaVar6, iZze12, iZzc3, i76, i60, str11, z11, zzadVar, zzagiVar4, i63);
                            i12 = i25;
                            i13 = i24;
                            i14 = i60;
                            i15 = i65;
                            zzagiVar2 = zzagiVar4;
                        } else if (iZze12 == 1414810956 || iZze12 == 1954034535 || iZze12 == 2004251764 || iZze12 == 1937010800 || iZze12 == 1664495672) {
                            zzfaVar6.zzF(iZzc3 + 16);
                            long j20 = RecyclerView.FOREVER_NS;
                            if (iZze12 == 1414810956) {
                                str7 = "application/ttml+xml";
                            } else {
                                if (iZze12 == 1954034535) {
                                    int i77 = iZze11 - 16;
                                    byte[] bArr3 = new byte[i77];
                                    zzfaVar6.zzB(bArr3, 0, i77);
                                    zzfscVarZzm = zzfsc.zzm(bArr3);
                                    str8 = "application/x-quicktime-tx3g";
                                } else if (iZze12 == 2004251764) {
                                    str7 = "application/x-mp4-vtt";
                                } else if (iZze12 == 1937010800) {
                                    str8 = "application/ttml+xml";
                                    zzfscVarZzm = null;
                                    j20 = 0;
                                } else {
                                    zzagiVar5.zzd = 1;
                                    str7 = "application/x-mp4-cea-608";
                                }
                                j11 = j20;
                                zzak zzakVar2 = new zzak();
                                zzakVar2.zzG(i60);
                                zzakVar2.zzS(str8);
                                zzakVar2.zzK(str11);
                                zzakVar2.zzW(j11);
                                zzakVar2.zzI(zzfscVarZzm);
                                zzagiVar5.zzb = zzakVar2.zzY();
                                i24 = iZzc3;
                                i25 = iZze11;
                                zzagiVar4 = zzagiVar5;
                                i12 = i25;
                                i13 = i24;
                                i14 = i60;
                                i15 = i65;
                                zzagiVar2 = zzagiVar4;
                            }
                            j11 = Long.MAX_VALUE;
                            str8 = str7;
                            zzfscVarZzm = null;
                            zzak zzakVar3 = new zzak();
                            zzakVar3.zzG(i60);
                            zzakVar3.zzS(str8);
                            zzakVar3.zzK(str11);
                            zzakVar3.zzW(j11);
                            zzakVar3.zzI(zzfscVarZzm);
                            zzagiVar5.zzb = zzakVar3.zzY();
                            i24 = iZzc3;
                            i25 = iZze11;
                            zzagiVar4 = zzagiVar5;
                            i12 = i25;
                            i13 = i24;
                            i14 = i60;
                            i15 = i65;
                            zzagiVar2 = zzagiVar4;
                        } else {
                            if (iZze12 == 1835365492) {
                                zzo(zzfaVar6, 1835365492, iZzc3, i60, zzagiVar5);
                            } else if (iZze12 == 1667329389) {
                                zzak zzakVar4 = new zzak();
                                zzakVar4.zzG(i60);
                                zzakVar4.zzS("application/x-camera-motion");
                                zzagiVar5.zzb = zzakVar4.zzY();
                            }
                            i12 = iZze11;
                            zzagiVar2 = zzagiVar5;
                            str11 = str11;
                            pairZzi = pairZzi;
                            arrayList3 = arrayList3;
                            i55 = i55;
                            zzagcVar3 = zzagcVar3;
                            i59 = i59;
                            i15 = i65;
                            str10 = str10;
                            i13 = iZzc3;
                            i14 = i60;
                            zzaglVar = zzaglVar;
                        }
                        zzfaVar6.zzF(i13 + i12);
                        zzadVar = zzadVar;
                        zzagiVar5 = zzagiVar2;
                        i60 = i14;
                        i61 = i15;
                        str10 = str10;
                        zzaglVar = zzaglVar;
                        iZze10 = i64;
                        str11 = str11;
                        i59 = i59;
                        i55 = i55;
                        arrayList3 = arrayList3;
                        zzagcVar3 = zzagcVar3;
                        pairZzi = pairZzi;
                        i62 = i63 + 1;
                    }
                    zzagi zzagiVar8 = zzagiVar5;
                    Pair pair = pairZzi;
                    arrayList = arrayList3;
                    i11 = i55;
                    int i78 = i59;
                    str = str10;
                    zzagl zzaglVar2 = zzaglVar;
                    iZzn9 = -1;
                    zzagcVar2 = zzagcVar3;
                    zzagc zzagcVarZza5 = zzagcVar2.zza(1701082227);
                    if (zzagcVarZza5 == null || (pairZzh = zzh(zzagcVarZza5)) == null) {
                        jArr = null;
                        jArr2 = null;
                    } else {
                        long[] jArr13 = (long[]) pairZzh.first;
                        jArr2 = (long[]) pairZzh.second;
                        jArr = jArr13;
                    }
                    if (zzagiVar8.zzb != null) {
                        zzahcVar = new zzahc(zzaglVar2.zza, i78, ((Long) pair.first).longValue(), jZzs2, jZzp2, zzagiVar8.zzb, zzagiVar8.zzd, zzagiVar8.zza, zzagiVar8.zzc, jArr, jArr2);
                    }
                    zzahcVar2 = (zzahc) zzfovVar.apply(zzahcVar);
                    if (zzahcVar2 != null) {
                        zzagc zzagcVarZza6 = zzagcVar2.zza(1835297121);
                        Objects.requireNonNull(zzagcVarZza6);
                        zzagc zzagcVarZza7 = zzagcVarZza6.zza(1835626086);
                        Objects.requireNonNull(zzagcVarZza7);
                        zzagcVarZza = zzagcVarZza7.zza(1937007212);
                        Objects.requireNonNull(zzagcVarZza);
                        zzagdVarZzb = zzagcVarZza.zzb(1937011578);
                        if (zzagdVarZzb != null) {
                            zzagkVar = new zzagj(zzagdVarZzb, zzahcVar2.zzf);
                        } else {
                            zzagdVarZzb2 = zzagcVarZza.zzb(1937013298);
                            if (zzagdVarZzb2 != null) {
                                throw zzcd.zza("Track has no sample table size information", null);
                            }
                            zzagkVar = new zzagk(zzagdVarZzb2);
                        }
                        iZzb = zzagkVar.zzb();
                        if (iZzb == 0) {
                            zzahfVar = new zzahf(zzahcVar2, new long[0], new int[0], 0, new long[0], new int[0], 0L);
                        } else {
                            zzagdVarZzb3 = zzagcVarZza.zzb(1937007471);
                            if (zzagdVarZzb3 == null) {
                                zzagdVarZzb3 = zzagcVarZza.zzb(1668232756);
                                Objects.requireNonNull(zzagdVarZzb3);
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            zzfa zzfaVar7 = zzagdVarZzb3.zza;
                            zzagd zzagdVarZzb11 = zzagcVarZza.zzb(1937011555);
                            Objects.requireNonNull(zzagdVarZzb11);
                            zzfa zzfaVar8 = zzagdVarZzb11.zza;
                            zzagd zzagdVarZzb12 = zzagcVarZza.zzb(1937011827);
                            Objects.requireNonNull(zzagdVarZzb12);
                            zzfaVar = zzagdVarZzb12.zza;
                            zzagdVarZzb4 = zzagcVarZza.zzb(1937011571);
                            if (zzagdVarZzb4 != null) {
                                zzfaVar2 = zzagdVarZzb4.zza;
                            } else {
                                zzfaVar2 = null;
                            }
                            zzagdVarZzb5 = zzagcVarZza.zzb(1668576371);
                            if (zzagdVarZzb5 != null) {
                                zzfaVar3 = zzagdVarZzb5.zza;
                            } else {
                                zzfaVar3 = null;
                            }
                            zzagfVar = new zzagf(zzfaVar8, zzfaVar7, z13);
                            zzfaVar.zzF(12);
                            iZzn = zzfaVar.zzn() + iZzn9;
                            iZzn2 = zzfaVar.zzn();
                            iZzn3 = zzfaVar.zzn();
                            if (zzfaVar3 != null) {
                                zzfaVar3.zzF(12);
                                iZzn4 = zzfaVar3.zzn();
                            } else {
                                iZzn4 = 0;
                            }
                            if (zzfaVar2 != null) {
                                zzfaVar2.zzF(12);
                                iZzn5 = zzfaVar2.zzn();
                                if (iZzn5 > 0) {
                                    iZzn9 += zzfaVar2.zzn();
                                } else {
                                    zzfaVar2 = null;
                                }
                            } else {
                                iZzn5 = 0;
                            }
                            iZza = zzagkVar.zza();
                            String str14 = zzahcVar2.zzf.zzm;
                            i26 = iZzn9;
                            if (iZza != -1 || ((!"audio/raw".equals(str14) && !"audio/g711-mlaw".equals(str14) && !"audio/g711-alaw".equals(str14)) || iZzn != 0)) {
                                jArrCopyOf = new long[iZzb];
                                iArrCopyOf = new int[iZzb];
                                jArrCopyOf2 = new long[iZzb];
                                i27 = iZzn5;
                                iArrCopyOf2 = new int[iZzb];
                                i28 = 0;
                                iZzn6 = 0;
                                j12 = 0;
                                j13 = 0;
                                iZze = 0;
                                i29 = 0;
                                iZzn7 = i26;
                                zzahcVar3 = zzahcVar2;
                                i30 = 0;
                                i31 = iZzn4;
                                i32 = iZzn3;
                                i33 = iZzn2;
                                while (true) {
                                    if (i29 < iZzb) {
                                        i33 = i33;
                                        break;
                                    }
                                    zZza = true;
                                    while (true) {
                                        if (i28 != 0) {
                                            i40 = i28;
                                            break;
                                        }
                                        zZza = zzagfVar.zza();
                                        if (zZza) {
                                            i40 = 0;
                                            break;
                                        }
                                        int i79 = i33;
                                        long j21 = zzagfVar.zzd;
                                        i28 = zzagfVar.zzc;
                                        j12 = j21;
                                        i33 = i79;
                                        i32 = i32;
                                        iZzb = iZzb;
                                    }
                                    if (!zZza) {
                                        zzer.zzf(str, "Unexpected end of chunk data");
                                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, i29);
                                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i29);
                                        jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i29);
                                        iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i29);
                                        iZzb = i29;
                                        break;
                                    }
                                    if (zzfaVar3 != null) {
                                        while (iZzn6 == 0) {
                                            if (i31 > 0) {
                                                iZzn6 = 0;
                                                break;
                                            }
                                            i31--;
                                            iZzn6 = zzfaVar3.zzn();
                                            iZze = zzfaVar3.zze();
                                        }
                                        iZzn6--;
                                    }
                                    int i80 = iZze;
                                    jArrCopyOf[i29] = j12;
                                    iZzc = zzagkVar.zzc();
                                    iArrCopyOf[i29] = iZzc;
                                    long[] jArr14 = jArrCopyOf;
                                    if (iZzc > i30) {
                                        i30 = iZzc;
                                    }
                                    zzagh zzaghVar = zzagkVar;
                                    jArrCopyOf2[i29] = j13 + ((long) i80);
                                    if (zzfaVar2 == null) {
                                        i41 = 1;
                                    } else {
                                        i41 = 0;
                                    }
                                    iArrCopyOf2[i29] = i41;
                                    if (i29 == iZzn7) {
                                        iArrCopyOf2[i29] = 1;
                                        i27--;
                                        if (i27 > 0) {
                                            Objects.requireNonNull(zzfaVar2);
                                            iZzn7 = zzfaVar2.zzn() - 1;
                                        }
                                    }
                                    iZze2 = i32;
                                    int[] iArr10 = iArrCopyOf2;
                                    j13 += (long) iZze2;
                                    iZzn8 = i33 - 1;
                                    if (iZzn8 != 0) {
                                        if (iZzn > 0) {
                                            iZzn--;
                                            iZzn8 = zzfaVar.zzn();
                                            iZze2 = zzfaVar.zze();
                                        } else {
                                            iZzn8 = 0;
                                        }
                                    }
                                    int i81 = iZze2;
                                    int i82 = iZzn8;
                                    j12 += (long) iArrCopyOf[i29];
                                    i29++;
                                    iZze = i80;
                                    zzagkVar = zzaghVar;
                                    i33 = i82;
                                    jArrCopyOf = jArr14;
                                    i32 = i81;
                                    iArrCopyOf2 = iArr10;
                                    i28 = i40 - 1;
                                    iZzb = iZzb;
                                }
                                long j22 = j13 + ((long) iZze);
                                if (zzfaVar3 != null) {
                                    z14 = true;
                                    break;
                                }
                                while (true) {
                                    if (i31 > 0) {
                                        z14 = true;
                                        break;
                                    }
                                    if (zzfaVar3.zzn() != 0) {
                                        z14 = false;
                                        break;
                                    }
                                    zzfaVar3.zze();
                                    i31--;
                                }
                                if (i27 != 0) {
                                    z15 = z14;
                                    i34 = i27;
                                    i35 = i28;
                                    i36 = iZzn6;
                                    i37 = i33;
                                    StringBuilder sbA = o.a("Inconsistent stbl box for track ", zzahcVar3.zza, ": remainingSynchronizationSamples ", i34, ", remainingSamplesAtTimestampDelta ");
                                    b.a(sbA, i37, ", remainingSamplesInChunk ", i35, ", remainingTimestampDeltaChanges ");
                                    sbA.append(iZzn);
                                    sbA.append(", remainingSamplesAtTimestampOffset ");
                                    sbA.append(i36);
                                    if (true != z15) {
                                        str9 = ", ctts invalid";
                                    } else {
                                        str9 = "";
                                    }
                                    sbA.append(str9);
                                    zzer.zzf(str, sbA.toString());
                                } else if (i33 == 0) {
                                    if (i28 == 0) {
                                        i39 = 0;
                                        i37 = 0;
                                    } else if (iZzn == 0) {
                                        i39 = 0;
                                        i37 = 0;
                                        i28 = 0;
                                    } else if (iZzn6 == 0) {
                                        i39 = 0;
                                        i37 = 0;
                                        i28 = 0;
                                        iZzn = 0;
                                    } else if (z14) {
                                        zzahcVar3 = zzahcVar3;
                                        iZzb = iZzb;
                                    } else {
                                        i34 = 0;
                                        i37 = 0;
                                        iZzn = 0;
                                        z15 = false;
                                        i35 = 0;
                                        i36 = 0;
                                        StringBuilder sbA2 = o.a("Inconsistent stbl box for track ", zzahcVar3.zza, ": remainingSynchronizationSamples ", i34, ", remainingSamplesAtTimestampDelta ");
                                        b.a(sbA2, i37, ", remainingSamplesInChunk ", i35, ", remainingTimestampDeltaChanges ");
                                        sbA2.append(iZzn);
                                        sbA2.append(", remainingSamplesAtTimestampOffset ");
                                        sbA2.append(i36);
                                        if (true != z15) {
                                            str9 = ", ctts invalid";
                                        } else {
                                            str9 = "";
                                        }
                                        sbA2.append(str9);
                                        zzer.zzf(str, sbA2.toString());
                                    }
                                    i35 = i28;
                                    i36 = iZzn6;
                                    int i83 = i39;
                                    z15 = z14;
                                    i34 = i83;
                                    StringBuilder sbA3 = o.a("Inconsistent stbl box for track ", zzahcVar3.zza, ": remainingSynchronizationSamples ", i34, ", remainingSamplesAtTimestampDelta ");
                                    b.a(sbA3, i37, ", remainingSamplesInChunk ", i35, ", remainingTimestampDeltaChanges ");
                                    sbA3.append(iZzn);
                                    sbA3.append(", remainingSamplesAtTimestampOffset ");
                                    sbA3.append(i36);
                                    if (true != z15) {
                                        str9 = ", ctts invalid";
                                    } else {
                                        str9 = "";
                                    }
                                    sbA3.append(str9);
                                    zzer.zzf(str, sbA3.toString());
                                } else {
                                    i27 = 0;
                                    z15 = z14;
                                    i34 = i27;
                                    i35 = i28;
                                    i36 = iZzn6;
                                    i37 = i33;
                                    StringBuilder sbA4 = o.a("Inconsistent stbl box for track ", zzahcVar3.zza, ": remainingSynchronizationSamples ", i34, ", remainingSamplesAtTimestampDelta ");
                                    b.a(sbA4, i37, ", remainingSamplesInChunk ", i35, ", remainingTimestampDeltaChanges ");
                                    sbA4.append(iZzn);
                                    sbA4.append(", remainingSamplesAtTimestampOffset ");
                                    sbA4.append(i36);
                                    if (true != z15) {
                                        str9 = ", ctts invalid";
                                    } else {
                                        str9 = "";
                                    }
                                    sbA4.append(str9);
                                    zzer.zzf(str, sbA4.toString());
                                }
                                iZzb = iZzb;
                                j14 = j22;
                                jArr3 = jArrCopyOf2;
                                jArr4 = jArrCopyOf;
                                iArr = iArrCopyOf2;
                                iArr2 = iArrCopyOf;
                                i38 = i30;
                            } else if (iZzn4 == 0 && iZzn5 == 0) {
                                int i84 = zzagfVar.zza;
                                long[] jArr15 = new long[i84];
                                int[] iArr11 = new int[i84];
                                while (zzagfVar.zza()) {
                                    int i85 = zzagfVar.zzb;
                                    jArr15[i85] = zzagfVar.zzd;
                                    iArr11[i85] = zzagfVar.zzc;
                                }
                                long j23 = iZzn3;
                                int i86 = 8192 / iZza;
                                int i87 = 0;
                                for (int i88 = 0; i88 < i84; i88++) {
                                    int i89 = iArr11[i88];
                                    int i90 = zzfj.zza;
                                    i87 += ((i89 + i86) - 1) / i86;
                                }
                                long[] jArr16 = new long[i87];
                                int[] iArr12 = new int[i87];
                                long[] jArr17 = new long[i87];
                                iArr = new int[i87];
                                int i91 = 0;
                                int i92 = 0;
                                int iMax = 0;
                                int i93 = 0;
                                while (i91 < i84) {
                                    int i94 = iArr11[i91];
                                    long j24 = jArr15[i91];
                                    int i95 = i84;
                                    int i96 = i94;
                                    while (i96 > 0) {
                                        int iMin = Math.min(i86, i96);
                                        jArr16[i93] = j24;
                                        long[] jArr18 = jArr15;
                                        int i97 = iZza * iMin;
                                        iArr12[i93] = i97;
                                        iMax = Math.max(iMax, i97);
                                        jArr17[i93] = ((long) i92) * j23;
                                        iArr[i93] = 1;
                                        j24 += (long) iArr12[i93];
                                        i92 += iMin;
                                        i96 -= iMin;
                                        i93++;
                                        jArr15 = jArr18;
                                        iArr11 = iArr11;
                                    }
                                    i91++;
                                    i84 = i95;
                                }
                                long j25 = j23 * ((long) i92);
                                jArr4 = jArr16;
                                iArr2 = iArr12;
                                i38 = iMax;
                                zzahcVar3 = zzahcVar2;
                                jArr3 = jArr17;
                                j14 = j25;
                            } else {
                                iZzn = 0;
                                jArrCopyOf = new long[iZzb];
                                iArrCopyOf = new int[iZzb];
                                jArrCopyOf2 = new long[iZzb];
                                i27 = iZzn5;
                                iArrCopyOf2 = new int[iZzb];
                                i28 = 0;
                                iZzn6 = 0;
                                j12 = 0;
                                j13 = 0;
                                iZze = 0;
                                i29 = 0;
                                iZzn7 = i26;
                                zzahcVar3 = zzahcVar2;
                                i30 = 0;
                                i31 = iZzn4;
                                i32 = iZzn3;
                                i33 = iZzn2;
                                while (true) {
                                    if (i29 < iZzb) {
                                        i33 = i33;
                                        break;
                                    }
                                    zZza = true;
                                    while (true) {
                                        if (i28 != 0) {
                                            i40 = i28;
                                            break;
                                        }
                                        zZza = zzagfVar.zza();
                                        if (zZza) {
                                            i40 = 0;
                                            break;
                                        }
                                        int i710 = i33;
                                        long j26 = zzagfVar.zzd;
                                        i28 = zzagfVar.zzc;
                                        j12 = j26;
                                        i33 = i710;
                                        i32 = i32;
                                        iZzb = iZzb;
                                    }
                                    if (!zZza) {
                                        zzer.zzf(str, "Unexpected end of chunk data");
                                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, i29);
                                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i29);
                                        jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i29);
                                        iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i29);
                                        iZzb = i29;
                                        break;
                                    }
                                    if (zzfaVar3 != null) {
                                        while (iZzn6 == 0) {
                                            if (i31 > 0) {
                                                iZzn6 = 0;
                                                break;
                                            }
                                            i31--;
                                            iZzn6 = zzfaVar3.zzn();
                                            iZze = zzfaVar3.zze();
                                        }
                                        iZzn6--;
                                    }
                                    int i810 = iZze;
                                    jArrCopyOf[i29] = j12;
                                    iZzc = zzagkVar.zzc();
                                    iArrCopyOf[i29] = iZzc;
                                    long[] jArr19 = jArrCopyOf;
                                    if (iZzc > i30) {
                                        i30 = iZzc;
                                    }
                                    zzagh zzaghVar2 = zzagkVar;
                                    jArrCopyOf2[i29] = j13 + ((long) i810);
                                    if (zzfaVar2 == null) {
                                        i41 = 1;
                                    } else {
                                        i41 = 0;
                                    }
                                    iArrCopyOf2[i29] = i41;
                                    if (i29 == iZzn7) {
                                        iArrCopyOf2[i29] = 1;
                                        i27--;
                                        if (i27 > 0) {
                                            Objects.requireNonNull(zzfaVar2);
                                            iZzn7 = zzfaVar2.zzn() - 1;
                                        }
                                    }
                                    iZze2 = i32;
                                    int[] iArr13 = iArrCopyOf2;
                                    j13 += (long) iZze2;
                                    iZzn8 = i33 - 1;
                                    if (iZzn8 != 0) {
                                        if (iZzn > 0) {
                                            iZzn--;
                                            iZzn8 = zzfaVar.zzn();
                                            iZze2 = zzfaVar.zze();
                                        } else {
                                            iZzn8 = 0;
                                        }
                                    }
                                    int i811 = iZze2;
                                    int i812 = iZzn8;
                                    j12 += (long) iArrCopyOf[i29];
                                    i29++;
                                    iZze = i810;
                                    zzagkVar = zzaghVar2;
                                    i33 = i812;
                                    jArrCopyOf = jArr19;
                                    i32 = i811;
                                    iArrCopyOf2 = iArr13;
                                    i28 = i40 - 1;
                                    iZzb = iZzb;
                                }
                                long j27 = j13 + ((long) iZze);
                                if (zzfaVar3 != null) {
                                    z14 = true;
                                    break;
                                }
                                while (true) {
                                    if (i31 > 0) {
                                        z14 = true;
                                        break;
                                    }
                                    if (zzfaVar3.zzn() != 0) {
                                        z14 = false;
                                        break;
                                    }
                                    zzfaVar3.zze();
                                    i31--;
                                }
                                if (i27 != 0) {
                                    z15 = z14;
                                    i34 = i27;
                                    i35 = i28;
                                    i36 = iZzn6;
                                    i37 = i33;
                                    StringBuilder sbA5 = o.a("Inconsistent stbl box for track ", zzahcVar3.zza, ": remainingSynchronizationSamples ", i34, ", remainingSamplesAtTimestampDelta ");
                                    b.a(sbA5, i37, ", remainingSamplesInChunk ", i35, ", remainingTimestampDeltaChanges ");
                                    sbA5.append(iZzn);
                                    sbA5.append(", remainingSamplesAtTimestampOffset ");
                                    sbA5.append(i36);
                                    if (true != z15) {
                                        str9 = ", ctts invalid";
                                    } else {
                                        str9 = "";
                                    }
                                    sbA5.append(str9);
                                    zzer.zzf(str, sbA5.toString());
                                } else if (i33 == 0) {
                                    if (i28 == 0) {
                                        i39 = 0;
                                        i37 = 0;
                                    } else if (iZzn == 0) {
                                        i39 = 0;
                                        i37 = 0;
                                        i28 = 0;
                                    } else if (iZzn6 == 0) {
                                        i39 = 0;
                                        i37 = 0;
                                        i28 = 0;
                                        iZzn = 0;
                                    } else if (z14) {
                                        i34 = 0;
                                        i37 = 0;
                                        iZzn = 0;
                                        z15 = false;
                                        i35 = 0;
                                        i36 = 0;
                                        StringBuilder sbA6 = o.a("Inconsistent stbl box for track ", zzahcVar3.zza, ": remainingSynchronizationSamples ", i34, ", remainingSamplesAtTimestampDelta ");
                                        b.a(sbA6, i37, ", remainingSamplesInChunk ", i35, ", remainingTimestampDeltaChanges ");
                                        sbA6.append(iZzn);
                                        sbA6.append(", remainingSamplesAtTimestampOffset ");
                                        sbA6.append(i36);
                                        if (true != z15) {
                                            str9 = ", ctts invalid";
                                        } else {
                                            str9 = "";
                                        }
                                        sbA6.append(str9);
                                        zzer.zzf(str, sbA6.toString());
                                    } else {
                                        zzahcVar3 = zzahcVar3;
                                        iZzb = iZzb;
                                    }
                                    i35 = i28;
                                    i36 = iZzn6;
                                    int i813 = i39;
                                    z15 = z14;
                                    i34 = i813;
                                    StringBuilder sbA7 = o.a("Inconsistent stbl box for track ", zzahcVar3.zza, ": remainingSynchronizationSamples ", i34, ", remainingSamplesAtTimestampDelta ");
                                    b.a(sbA7, i37, ", remainingSamplesInChunk ", i35, ", remainingTimestampDeltaChanges ");
                                    sbA7.append(iZzn);
                                    sbA7.append(", remainingSamplesAtTimestampOffset ");
                                    sbA7.append(i36);
                                    if (true != z15) {
                                        str9 = ", ctts invalid";
                                    } else {
                                        str9 = "";
                                    }
                                    sbA7.append(str9);
                                    zzer.zzf(str, sbA7.toString());
                                } else {
                                    i27 = 0;
                                    z15 = z14;
                                    i34 = i27;
                                    i35 = i28;
                                    i36 = iZzn6;
                                    i37 = i33;
                                    StringBuilder sbA8 = o.a("Inconsistent stbl box for track ", zzahcVar3.zza, ": remainingSynchronizationSamples ", i34, ", remainingSamplesAtTimestampDelta ");
                                    b.a(sbA8, i37, ", remainingSamplesInChunk ", i35, ", remainingTimestampDeltaChanges ");
                                    sbA8.append(iZzn);
                                    sbA8.append(", remainingSamplesAtTimestampOffset ");
                                    sbA8.append(i36);
                                    if (true != z15) {
                                        str9 = ", ctts invalid";
                                    } else {
                                        str9 = "";
                                    }
                                    sbA8.append(str9);
                                    zzer.zzf(str, sbA8.toString());
                                }
                                iZzb = iZzb;
                                j14 = j27;
                                jArr3 = jArrCopyOf2;
                                jArr4 = jArrCopyOf;
                                iArr = iArrCopyOf2;
                                iArr2 = iArrCopyOf;
                                i38 = i30;
                            }
                            jZzp = zzfj.zzp(j14, 1000000L, zzahcVar3.zzc);
                            jArr5 = zzahcVar3.zzh;
                            if (jArr5 == null) {
                                zzfj.zzB(jArr3, 1000000L, zzahcVar3.zzc);
                                zzahfVar2 = new zzahf(zzahcVar3, jArr4, iArr2, i38, jArr3, iArr, jZzp);
                            } else {
                                if (jArr5.length == 1 || zzahcVar3.zzb != 1 || jArr3.length < 2) {
                                    iArr3 = iArr;
                                } else {
                                    long[] jArr20 = zzahcVar3.zzi;
                                    Objects.requireNonNull(jArr20);
                                    long j28 = jArr20[0];
                                    long jZzp3 = j28 + zzfj.zzp(jArr5[0], zzahcVar3.zzc, zzahcVar3.zzd);
                                    iArr3 = iArr;
                                    if (zzp(jArr3, j14, j28, jZzp3)) {
                                        long jZzp4 = zzfj.zzp(j28 - jArr3[0], zzahcVar3.zzf.zzA, zzahcVar3.zzc);
                                        long jZzp5 = zzfj.zzp(j14 - jZzp3, zzahcVar3.zzf.zzA, zzahcVar3.zzc);
                                        if (jZzp4 != 0) {
                                            if (jZzp4 > 2147483647L && jZzp5 <= 2147483647L) {
                                                zzablVar.zza = (int) jZzp4;
                                                zzablVar.zzb = (int) jZzp5;
                                                zzfj.zzB(jArr3, 1000000L, zzahcVar3.zzc);
                                                zzahfVar2 = new zzahf(zzahcVar3, jArr4, iArr2, i38, jArr3, iArr3, zzfj.zzp(zzahcVar3.zzh[0], 1000000L, zzahcVar3.zzd));
                                            }
                                        } else if (jZzp5 != 0) {
                                            jZzp4 = 0;
                                            if (jZzp4 > 2147483647L) {
                                            }
                                        }
                                    }
                                }
                                jArr6 = zzahcVar3.zzh;
                                length = jArr6.length;
                                if (length == 1) {
                                    if (jArr6[0] == 0) {
                                        long[] jArr21 = zzahcVar3.zzi;
                                        Objects.requireNonNull(jArr21);
                                        j18 = jArr21[0];
                                        for (i54 = 0; i54 < jArr3.length; i54++) {
                                            jArr3[i54] = zzfj.zzp(jArr3[i54] - j18, 1000000L, zzahcVar3.zzc);
                                        }
                                        zzahfVar2 = new zzahf(zzahcVar3, jArr4, iArr2, i38, jArr3, iArr3, zzfj.zzp(j14 - j18, 1000000L, zzahcVar3.zzc));
                                    } else {
                                        length = 1;
                                    }
                                }
                                if (zzahcVar3.zzb == 1) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                iArr4 = new int[length];
                                iArr5 = new int[length];
                                jArr7 = zzahcVar3.zzi;
                                Objects.requireNonNull(jArr7);
                                i42 = 0;
                                i43 = 0;
                                z17 = false;
                                i44 = 0;
                                while (true) {
                                    jArr8 = zzahcVar3.zzh;
                                    if (i43 >= jArr8.length) {
                                        break;
                                    }
                                    long[] jArr22 = jArr4;
                                    int i98 = iZzb;
                                    j17 = jArr7[i43];
                                    if (j17 != -1) {
                                        boolean z21 = z17;
                                        int i99 = i44;
                                        long jZzp6 = zzfj.zzp(jArr8[i43], zzahcVar3.zzc, zzahcVar3.zzd);
                                        i51 = 1;
                                        iArr4[i43] = zzfj.zzc(jArr3, j17, true, true);
                                        iArr5[i43] = zzfj.zza(jArr3, j17 + jZzp6, z16, false);
                                        while (true) {
                                            i52 = iArr4[i43];
                                            i53 = iArr5[i43];
                                            iArr9 = iArr3;
                                            if (i52 < i53 || (i51 & iArr9[i52]) != 0) {
                                                break;
                                            }
                                            iArr4[i43] = i52 + 1;
                                            i51 = 1;
                                            iArr3 = iArr9;
                                        }
                                        int i100 = (i53 - i52) + i42;
                                        z17 = z21 | (i99 != i52);
                                        i50 = i53;
                                        i42 = i100;
                                    } else {
                                        i50 = i44;
                                        iArr9 = iArr3;
                                    }
                                    i43++;
                                    iArr3 = iArr9;
                                    i44 = i50;
                                    jArr4 = jArr22;
                                    iZzb = i98;
                                }
                                iArr6 = iArr3;
                                jArr9 = jArr4;
                                boolean z22 = z17;
                                if (i42 != iZzb) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                z19 = z18 | z22;
                                if (z19) {
                                    jArr10 = new long[i42];
                                } else {
                                    jArr10 = jArr9;
                                }
                                if (z19) {
                                    iArr7 = new int[i42];
                                } else {
                                    iArr7 = iArr2;
                                }
                                if (true == z19) {
                                    i38 = 0;
                                }
                                if (z19) {
                                    iArr8 = new int[i42];
                                } else {
                                    iArr8 = iArr6;
                                }
                                jArr11 = new long[i42];
                                j15 = 0;
                                i46 = 0;
                                i47 = i38;
                                for (i45 = 0; i45 < zzahcVar3.zzh.length; i45++) {
                                    j16 = zzahcVar3.zzi[i45];
                                    i48 = iArr4[i45];
                                    int[] iArr14 = iArr4;
                                    i49 = iArr5[i45];
                                    if (z19) {
                                        int i101 = i49 - i48;
                                        jArr12 = jArr9;
                                        System.arraycopy(jArr12, i48, jArr10, i46, i101);
                                        System.arraycopy(iArr2, i48, iArr7, i46, i101);
                                        System.arraycopy(iArr6, i48, iArr8, i46, i101);
                                    } else {
                                        jArr12 = jArr9;
                                    }
                                    int i102 = i47;
                                    while (i48 < i49) {
                                        int[] iArr15 = iArr6;
                                        int[] iArr16 = iArr2;
                                        long[] jArr23 = jArr3;
                                        long j29 = j15;
                                        int i103 = i48;
                                        int i104 = i49;
                                        jArr11[i46] = zzfj.zzp(j15, 1000000L, zzahcVar3.zzd) + zzfj.zzp(Math.max(0L, jArr3[i48] - j16), 1000000L, zzahcVar3.zzc);
                                        if (!z19 && iArr7[i46] > i102) {
                                            i102 = iArr16[i103];
                                        }
                                        i46++;
                                        i48 = i103 + 1;
                                        iArr2 = iArr16;
                                        i49 = i104;
                                        iArr6 = iArr15;
                                        jArr3 = jArr23;
                                        j15 = j29;
                                    }
                                    j15 += zzahcVar3.zzh[i45];
                                    iArr2 = iArr2;
                                    i47 = i102;
                                    iArr6 = iArr6;
                                    iArr4 = iArr14;
                                    iArr5 = iArr5;
                                    jArr9 = jArr12;
                                }
                                zzahfVar = new zzahf(zzahcVar3, jArr10, iArr7, i47, jArr11, iArr8, zzfj.zzp(j15, 1000000L, zzahcVar3.zzd));
                            }
                            zzahfVar = zzahfVar2;
                        }
                        arrayList2 = arrayList;
                        arrayList2.add(zzahfVar);
                    } else {
                        arrayList2 = arrayList;
                    }
                }
                zzahcVar = null;
                zzahcVar2 = (zzahc) zzfovVar.apply(zzahcVar);
                if (zzahcVar2 != null) {
                    zzagc zzagcVarZza8 = zzagcVar2.zza(1835297121);
                    Objects.requireNonNull(zzagcVarZza8);
                    zzagc zzagcVarZza9 = zzagcVarZza8.zza(1835626086);
                    Objects.requireNonNull(zzagcVarZza9);
                    zzagcVarZza = zzagcVarZza9.zza(1937007212);
                    Objects.requireNonNull(zzagcVarZza);
                    zzagdVarZzb = zzagcVarZza.zzb(1937011578);
                    if (zzagdVarZzb != null) {
                        zzagkVar = new zzagj(zzagdVarZzb, zzahcVar2.zzf);
                    } else {
                        zzagdVarZzb2 = zzagcVarZza.zzb(1937013298);
                        if (zzagdVarZzb2 != null) {
                            throw zzcd.zza("Track has no sample table size information", null);
                        }
                        zzagkVar = new zzagk(zzagdVarZzb2);
                    }
                    iZzb = zzagkVar.zzb();
                    if (iZzb == 0) {
                        zzahfVar = new zzahf(zzahcVar2, new long[0], new int[0], 0, new long[0], new int[0], 0L);
                    } else {
                        zzagdVarZzb3 = zzagcVarZza.zzb(1937007471);
                        if (zzagdVarZzb3 == null) {
                            zzagdVarZzb3 = zzagcVarZza.zzb(1668232756);
                            Objects.requireNonNull(zzagdVarZzb3);
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        zzfa zzfaVar9 = zzagdVarZzb3.zza;
                        zzagd zzagdVarZzb13 = zzagcVarZza.zzb(1937011555);
                        Objects.requireNonNull(zzagdVarZzb13);
                        zzfa zzfaVar10 = zzagdVarZzb13.zza;
                        zzagd zzagdVarZzb14 = zzagcVarZza.zzb(1937011827);
                        Objects.requireNonNull(zzagdVarZzb14);
                        zzfaVar = zzagdVarZzb14.zza;
                        zzagdVarZzb4 = zzagcVarZza.zzb(1937011571);
                        if (zzagdVarZzb4 != null) {
                            zzfaVar2 = zzagdVarZzb4.zza;
                        } else {
                            zzfaVar2 = null;
                        }
                        zzagdVarZzb5 = zzagcVarZza.zzb(1668576371);
                        if (zzagdVarZzb5 != null) {
                            zzfaVar3 = zzagdVarZzb5.zza;
                        } else {
                            zzfaVar3 = null;
                        }
                        zzagfVar = new zzagf(zzfaVar10, zzfaVar9, z13);
                        zzfaVar.zzF(12);
                        iZzn = zzfaVar.zzn() + iZzn9;
                        iZzn2 = zzfaVar.zzn();
                        iZzn3 = zzfaVar.zzn();
                        if (zzfaVar3 != null) {
                            zzfaVar3.zzF(12);
                            iZzn4 = zzfaVar3.zzn();
                        } else {
                            iZzn4 = 0;
                        }
                        if (zzfaVar2 != null) {
                            zzfaVar2.zzF(12);
                            iZzn5 = zzfaVar2.zzn();
                            if (iZzn5 > 0) {
                                iZzn9 += zzfaVar2.zzn();
                            } else {
                                zzfaVar2 = null;
                            }
                        } else {
                            iZzn5 = 0;
                        }
                        iZza = zzagkVar.zza();
                        String str15 = zzahcVar2.zzf.zzm;
                        i26 = iZzn9;
                        if (iZza != -1) {
                            jArrCopyOf = new long[iZzb];
                            iArrCopyOf = new int[iZzb];
                            jArrCopyOf2 = new long[iZzb];
                            i27 = iZzn5;
                            iArrCopyOf2 = new int[iZzb];
                            i28 = 0;
                            iZzn6 = 0;
                            j12 = 0;
                            j13 = 0;
                            iZze = 0;
                            i29 = 0;
                            iZzn7 = i26;
                            zzahcVar3 = zzahcVar2;
                            i30 = 0;
                            i31 = iZzn4;
                            i32 = iZzn3;
                            i33 = iZzn2;
                            while (true) {
                                if (i29 < iZzb) {
                                    i33 = i33;
                                    break;
                                }
                                zZza = true;
                                while (true) {
                                    if (i28 != 0) {
                                        i40 = i28;
                                        break;
                                    }
                                    zZza = zzagfVar.zza();
                                    if (zZza) {
                                        i40 = 0;
                                        break;
                                    }
                                    int i711 = i33;
                                    long j210 = zzagfVar.zzd;
                                    i28 = zzagfVar.zzc;
                                    j12 = j210;
                                    i33 = i711;
                                    i32 = i32;
                                    iZzb = iZzb;
                                }
                                if (!zZza) {
                                    zzer.zzf(str, "Unexpected end of chunk data");
                                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i29);
                                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i29);
                                    jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i29);
                                    iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i29);
                                    iZzb = i29;
                                    break;
                                }
                                if (zzfaVar3 != null) {
                                    while (iZzn6 == 0) {
                                        if (i31 > 0) {
                                            iZzn6 = 0;
                                            break;
                                        }
                                        i31--;
                                        iZzn6 = zzfaVar3.zzn();
                                        iZze = zzfaVar3.zze();
                                    }
                                    iZzn6--;
                                }
                                int i814 = iZze;
                                jArrCopyOf[i29] = j12;
                                iZzc = zzagkVar.zzc();
                                iArrCopyOf[i29] = iZzc;
                                long[] jArr110 = jArrCopyOf;
                                if (iZzc > i30) {
                                    i30 = iZzc;
                                }
                                zzagh zzaghVar3 = zzagkVar;
                                jArrCopyOf2[i29] = j13 + ((long) i814);
                                if (zzfaVar2 == null) {
                                    i41 = 1;
                                } else {
                                    i41 = 0;
                                }
                                iArrCopyOf2[i29] = i41;
                                if (i29 == iZzn7) {
                                    iArrCopyOf2[i29] = 1;
                                    i27--;
                                    if (i27 > 0) {
                                        Objects.requireNonNull(zzfaVar2);
                                        iZzn7 = zzfaVar2.zzn() - 1;
                                    }
                                }
                                iZze2 = i32;
                                int[] iArr17 = iArrCopyOf2;
                                j13 += (long) iZze2;
                                iZzn8 = i33 - 1;
                                if (iZzn8 != 0) {
                                    if (iZzn > 0) {
                                        iZzn--;
                                        iZzn8 = zzfaVar.zzn();
                                        iZze2 = zzfaVar.zze();
                                    } else {
                                        iZzn8 = 0;
                                    }
                                }
                                int i815 = iZze2;
                                int i816 = iZzn8;
                                j12 += (long) iArrCopyOf[i29];
                                i29++;
                                iZze = i814;
                                zzagkVar = zzaghVar3;
                                i33 = i816;
                                jArrCopyOf = jArr110;
                                i32 = i815;
                                iArrCopyOf2 = iArr17;
                                i28 = i40 - 1;
                                iZzb = iZzb;
                            }
                            long j211 = j13 + ((long) iZze);
                            if (zzfaVar3 != null) {
                                z14 = true;
                                break;
                            }
                            while (true) {
                                if (i31 > 0) {
                                    z14 = true;
                                    break;
                                }
                                if (zzfaVar3.zzn() != 0) {
                                    z14 = false;
                                    break;
                                }
                                zzfaVar3.zze();
                                i31--;
                            }
                            if (i27 != 0) {
                                z15 = z14;
                                i34 = i27;
                                i35 = i28;
                                i36 = iZzn6;
                                i37 = i33;
                                StringBuilder sbA9 = o.a("Inconsistent stbl box for track ", zzahcVar3.zza, ": remainingSynchronizationSamples ", i34, ", remainingSamplesAtTimestampDelta ");
                                b.a(sbA9, i37, ", remainingSamplesInChunk ", i35, ", remainingTimestampDeltaChanges ");
                                sbA9.append(iZzn);
                                sbA9.append(", remainingSamplesAtTimestampOffset ");
                                sbA9.append(i36);
                                if (true != z15) {
                                    str9 = ", ctts invalid";
                                } else {
                                    str9 = "";
                                }
                                sbA9.append(str9);
                                zzer.zzf(str, sbA9.toString());
                            } else if (i33 == 0) {
                                if (i28 == 0) {
                                    i39 = 0;
                                    i37 = 0;
                                } else if (iZzn == 0) {
                                    i39 = 0;
                                    i37 = 0;
                                    i28 = 0;
                                } else if (iZzn6 == 0) {
                                    i39 = 0;
                                    i37 = 0;
                                    i28 = 0;
                                    iZzn = 0;
                                } else if (z14) {
                                    i34 = 0;
                                    i37 = 0;
                                    iZzn = 0;
                                    z15 = false;
                                    i35 = 0;
                                    i36 = 0;
                                    StringBuilder sbA10 = o.a("Inconsistent stbl box for track ", zzahcVar3.zza, ": remainingSynchronizationSamples ", i34, ", remainingSamplesAtTimestampDelta ");
                                    b.a(sbA10, i37, ", remainingSamplesInChunk ", i35, ", remainingTimestampDeltaChanges ");
                                    sbA10.append(iZzn);
                                    sbA10.append(", remainingSamplesAtTimestampOffset ");
                                    sbA10.append(i36);
                                    if (true != z15) {
                                        str9 = ", ctts invalid";
                                    } else {
                                        str9 = "";
                                    }
                                    sbA10.append(str9);
                                    zzer.zzf(str, sbA10.toString());
                                } else {
                                    zzahcVar3 = zzahcVar3;
                                    iZzb = iZzb;
                                }
                                i35 = i28;
                                i36 = iZzn6;
                                int i817 = i39;
                                z15 = z14;
                                i34 = i817;
                                StringBuilder sbA11 = o.a("Inconsistent stbl box for track ", zzahcVar3.zza, ": remainingSynchronizationSamples ", i34, ", remainingSamplesAtTimestampDelta ");
                                b.a(sbA11, i37, ", remainingSamplesInChunk ", i35, ", remainingTimestampDeltaChanges ");
                                sbA11.append(iZzn);
                                sbA11.append(", remainingSamplesAtTimestampOffset ");
                                sbA11.append(i36);
                                if (true != z15) {
                                    str9 = ", ctts invalid";
                                } else {
                                    str9 = "";
                                }
                                sbA11.append(str9);
                                zzer.zzf(str, sbA11.toString());
                            } else {
                                i27 = 0;
                                z15 = z14;
                                i34 = i27;
                                i35 = i28;
                                i36 = iZzn6;
                                i37 = i33;
                                StringBuilder sbA12 = o.a("Inconsistent stbl box for track ", zzahcVar3.zza, ": remainingSynchronizationSamples ", i34, ", remainingSamplesAtTimestampDelta ");
                                b.a(sbA12, i37, ", remainingSamplesInChunk ", i35, ", remainingTimestampDeltaChanges ");
                                sbA12.append(iZzn);
                                sbA12.append(", remainingSamplesAtTimestampOffset ");
                                sbA12.append(i36);
                                if (true != z15) {
                                    str9 = ", ctts invalid";
                                } else {
                                    str9 = "";
                                }
                                sbA12.append(str9);
                                zzer.zzf(str, sbA12.toString());
                            }
                            iZzb = iZzb;
                            j14 = j211;
                            jArr3 = jArrCopyOf2;
                            jArr4 = jArrCopyOf;
                            iArr = iArrCopyOf2;
                            iArr2 = iArrCopyOf;
                            i38 = i30;
                        } else {
                            jArrCopyOf = new long[iZzb];
                            iArrCopyOf = new int[iZzb];
                            jArrCopyOf2 = new long[iZzb];
                            i27 = iZzn5;
                            iArrCopyOf2 = new int[iZzb];
                            i28 = 0;
                            iZzn6 = 0;
                            j12 = 0;
                            j13 = 0;
                            iZze = 0;
                            i29 = 0;
                            iZzn7 = i26;
                            zzahcVar3 = zzahcVar2;
                            i30 = 0;
                            i31 = iZzn4;
                            i32 = iZzn3;
                            i33 = iZzn2;
                            while (true) {
                                if (i29 < iZzb) {
                                    i33 = i33;
                                    break;
                                }
                                zZza = true;
                                while (true) {
                                    if (i28 != 0) {
                                        i40 = i28;
                                        break;
                                    }
                                    zZza = zzagfVar.zza();
                                    if (zZza) {
                                        i40 = 0;
                                        break;
                                    }
                                    int i712 = i33;
                                    long j212 = zzagfVar.zzd;
                                    i28 = zzagfVar.zzc;
                                    j12 = j212;
                                    i33 = i712;
                                    i32 = i32;
                                    iZzb = iZzb;
                                }
                                if (!zZza) {
                                    zzer.zzf(str, "Unexpected end of chunk data");
                                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i29);
                                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i29);
                                    jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i29);
                                    iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i29);
                                    iZzb = i29;
                                    break;
                                }
                                if (zzfaVar3 != null) {
                                    while (iZzn6 == 0) {
                                        if (i31 > 0) {
                                            iZzn6 = 0;
                                            break;
                                        }
                                        i31--;
                                        iZzn6 = zzfaVar3.zzn();
                                        iZze = zzfaVar3.zze();
                                    }
                                    iZzn6--;
                                }
                                int i818 = iZze;
                                jArrCopyOf[i29] = j12;
                                iZzc = zzagkVar.zzc();
                                iArrCopyOf[i29] = iZzc;
                                long[] jArr111 = jArrCopyOf;
                                if (iZzc > i30) {
                                    i30 = iZzc;
                                }
                                zzagh zzaghVar4 = zzagkVar;
                                jArrCopyOf2[i29] = j13 + ((long) i818);
                                if (zzfaVar2 == null) {
                                    i41 = 1;
                                } else {
                                    i41 = 0;
                                }
                                iArrCopyOf2[i29] = i41;
                                if (i29 == iZzn7) {
                                    iArrCopyOf2[i29] = 1;
                                    i27--;
                                    if (i27 > 0) {
                                        Objects.requireNonNull(zzfaVar2);
                                        iZzn7 = zzfaVar2.zzn() - 1;
                                    }
                                }
                                iZze2 = i32;
                                int[] iArr18 = iArrCopyOf2;
                                j13 += (long) iZze2;
                                iZzn8 = i33 - 1;
                                if (iZzn8 != 0) {
                                    if (iZzn > 0) {
                                        iZzn--;
                                        iZzn8 = zzfaVar.zzn();
                                        iZze2 = zzfaVar.zze();
                                    } else {
                                        iZzn8 = 0;
                                    }
                                }
                                int i819 = iZze2;
                                int i8110 = iZzn8;
                                j12 += (long) iArrCopyOf[i29];
                                i29++;
                                iZze = i818;
                                zzagkVar = zzaghVar4;
                                i33 = i8110;
                                jArrCopyOf = jArr111;
                                i32 = i819;
                                iArrCopyOf2 = iArr18;
                                i28 = i40 - 1;
                                iZzb = iZzb;
                            }
                            long j213 = j13 + ((long) iZze);
                            if (zzfaVar3 != null) {
                                z14 = true;
                                break;
                            }
                            while (true) {
                                if (i31 > 0) {
                                    z14 = true;
                                    break;
                                }
                                if (zzfaVar3.zzn() != 0) {
                                    z14 = false;
                                    break;
                                }
                                zzfaVar3.zze();
                                i31--;
                            }
                            if (i27 != 0) {
                                z15 = z14;
                                i34 = i27;
                                i35 = i28;
                                i36 = iZzn6;
                                i37 = i33;
                                StringBuilder sbA13 = o.a("Inconsistent stbl box for track ", zzahcVar3.zza, ": remainingSynchronizationSamples ", i34, ", remainingSamplesAtTimestampDelta ");
                                b.a(sbA13, i37, ", remainingSamplesInChunk ", i35, ", remainingTimestampDeltaChanges ");
                                sbA13.append(iZzn);
                                sbA13.append(", remainingSamplesAtTimestampOffset ");
                                sbA13.append(i36);
                                if (true != z15) {
                                    str9 = ", ctts invalid";
                                } else {
                                    str9 = "";
                                }
                                sbA13.append(str9);
                                zzer.zzf(str, sbA13.toString());
                            } else if (i33 == 0) {
                                if (i28 == 0) {
                                    i39 = 0;
                                    i37 = 0;
                                } else if (iZzn == 0) {
                                    i39 = 0;
                                    i37 = 0;
                                    i28 = 0;
                                } else if (iZzn6 == 0) {
                                    i39 = 0;
                                    i37 = 0;
                                    i28 = 0;
                                    iZzn = 0;
                                } else if (z14) {
                                    i34 = 0;
                                    i37 = 0;
                                    iZzn = 0;
                                    z15 = false;
                                    i35 = 0;
                                    i36 = 0;
                                    StringBuilder sbA14 = o.a("Inconsistent stbl box for track ", zzahcVar3.zza, ": remainingSynchronizationSamples ", i34, ", remainingSamplesAtTimestampDelta ");
                                    b.a(sbA14, i37, ", remainingSamplesInChunk ", i35, ", remainingTimestampDeltaChanges ");
                                    sbA14.append(iZzn);
                                    sbA14.append(", remainingSamplesAtTimestampOffset ");
                                    sbA14.append(i36);
                                    if (true != z15) {
                                        str9 = ", ctts invalid";
                                    } else {
                                        str9 = "";
                                    }
                                    sbA14.append(str9);
                                    zzer.zzf(str, sbA14.toString());
                                } else {
                                    zzahcVar3 = zzahcVar3;
                                    iZzb = iZzb;
                                }
                                i35 = i28;
                                i36 = iZzn6;
                                int i8111 = i39;
                                z15 = z14;
                                i34 = i8111;
                                StringBuilder sbA15 = o.a("Inconsistent stbl box for track ", zzahcVar3.zza, ": remainingSynchronizationSamples ", i34, ", remainingSamplesAtTimestampDelta ");
                                b.a(sbA15, i37, ", remainingSamplesInChunk ", i35, ", remainingTimestampDeltaChanges ");
                                sbA15.append(iZzn);
                                sbA15.append(", remainingSamplesAtTimestampOffset ");
                                sbA15.append(i36);
                                if (true != z15) {
                                    str9 = ", ctts invalid";
                                } else {
                                    str9 = "";
                                }
                                sbA15.append(str9);
                                zzer.zzf(str, sbA15.toString());
                            } else {
                                i27 = 0;
                                z15 = z14;
                                i34 = i27;
                                i35 = i28;
                                i36 = iZzn6;
                                i37 = i33;
                                StringBuilder sbA16 = o.a("Inconsistent stbl box for track ", zzahcVar3.zza, ": remainingSynchronizationSamples ", i34, ", remainingSamplesAtTimestampDelta ");
                                b.a(sbA16, i37, ", remainingSamplesInChunk ", i35, ", remainingTimestampDeltaChanges ");
                                sbA16.append(iZzn);
                                sbA16.append(", remainingSamplesAtTimestampOffset ");
                                sbA16.append(i36);
                                if (true != z15) {
                                    str9 = ", ctts invalid";
                                } else {
                                    str9 = "";
                                }
                                sbA16.append(str9);
                                zzer.zzf(str, sbA16.toString());
                            }
                            iZzb = iZzb;
                            j14 = j213;
                            jArr3 = jArrCopyOf2;
                            jArr4 = jArrCopyOf;
                            iArr = iArrCopyOf2;
                            iArr2 = iArrCopyOf;
                            i38 = i30;
                        }
                        jZzp = zzfj.zzp(j14, 1000000L, zzahcVar3.zzc);
                        jArr5 = zzahcVar3.zzh;
                        if (jArr5 == null) {
                            zzfj.zzB(jArr3, 1000000L, zzahcVar3.zzc);
                            zzahfVar2 = new zzahf(zzahcVar3, jArr4, iArr2, i38, jArr3, iArr, jZzp);
                        } else if (jArr5.length == 1) {
                            iArr3 = iArr;
                            jArr6 = zzahcVar3.zzh;
                            length = jArr6.length;
                            if (length == 1) {
                                if (jArr6[0] == 0) {
                                    long[] jArr24 = zzahcVar3.zzi;
                                    Objects.requireNonNull(jArr24);
                                    j18 = jArr24[0];
                                    while (i54 < jArr3.length) {
                                        jArr3[i54] = zzfj.zzp(jArr3[i54] - j18, 1000000L, zzahcVar3.zzc);
                                    }
                                    zzahfVar2 = new zzahf(zzahcVar3, jArr4, iArr2, i38, jArr3, iArr3, zzfj.zzp(j14 - j18, 1000000L, zzahcVar3.zzc));
                                } else {
                                    length = 1;
                                }
                            }
                            if (zzahcVar3.zzb == 1) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            iArr4 = new int[length];
                            iArr5 = new int[length];
                            jArr7 = zzahcVar3.zzi;
                            Objects.requireNonNull(jArr7);
                            i42 = 0;
                            i43 = 0;
                            z17 = false;
                            i44 = 0;
                            while (true) {
                                jArr8 = zzahcVar3.zzh;
                                if (i43 >= jArr8.length) {
                                    break;
                                    break;
                                }
                                long[] jArr25 = jArr4;
                                int i910 = iZzb;
                                j17 = jArr7[i43];
                                if (j17 != -1) {
                                    boolean z23 = z17;
                                    int i911 = i44;
                                    long jZzp7 = zzfj.zzp(jArr8[i43], zzahcVar3.zzc, zzahcVar3.zzd);
                                    i51 = 1;
                                    iArr4[i43] = zzfj.zzc(jArr3, j17, true, true);
                                    iArr5[i43] = zzfj.zza(jArr3, j17 + jZzp7, z16, false);
                                    while (true) {
                                        i52 = iArr4[i43];
                                        i53 = iArr5[i43];
                                        iArr9 = iArr3;
                                        if (i52 < i53) {
                                            break;
                                        }
                                        break;
                                        break;
                                        iArr4[i43] = i52 + 1;
                                        i51 = 1;
                                        iArr3 = iArr9;
                                    }
                                    int i105 = (i53 - i52) + i42;
                                    z17 = z23 | (i911 != i52);
                                    i50 = i53;
                                    i42 = i105;
                                } else {
                                    i50 = i44;
                                    iArr9 = iArr3;
                                }
                                i43++;
                                iArr3 = iArr9;
                                i44 = i50;
                                jArr4 = jArr25;
                                iZzb = i910;
                            }
                            iArr6 = iArr3;
                            jArr9 = jArr4;
                            boolean z24 = z17;
                            if (i42 != iZzb) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            z19 = z18 | z24;
                            if (z19) {
                                jArr10 = new long[i42];
                            } else {
                                jArr10 = jArr9;
                            }
                            if (z19) {
                                iArr7 = new int[i42];
                            } else {
                                iArr7 = iArr2;
                            }
                            if (true == z19) {
                                i38 = 0;
                            }
                            if (z19) {
                                iArr8 = new int[i42];
                            } else {
                                iArr8 = iArr6;
                            }
                            jArr11 = new long[i42];
                            j15 = 0;
                            i46 = 0;
                            i47 = i38;
                            while (i45 < zzahcVar3.zzh.length) {
                                j16 = zzahcVar3.zzi[i45];
                                i48 = iArr4[i45];
                                int[] iArr19 = iArr4;
                                i49 = iArr5[i45];
                                if (z19) {
                                    int i106 = i49 - i48;
                                    jArr12 = jArr9;
                                    System.arraycopy(jArr12, i48, jArr10, i46, i106);
                                    System.arraycopy(iArr2, i48, iArr7, i46, i106);
                                    System.arraycopy(iArr6, i48, iArr8, i46, i106);
                                } else {
                                    jArr12 = jArr9;
                                }
                                int i107 = i47;
                                while (i48 < i49) {
                                    int[] iArr110 = iArr6;
                                    int[] iArr111 = iArr2;
                                    long[] jArr26 = jArr3;
                                    long j214 = j15;
                                    int i108 = i48;
                                    int i109 = i49;
                                    jArr11[i46] = zzfj.zzp(j15, 1000000L, zzahcVar3.zzd) + zzfj.zzp(Math.max(0L, jArr3[i48] - j16), 1000000L, zzahcVar3.zzc);
                                    if (!z19) {
                                    }
                                    i46++;
                                    i48 = i108 + 1;
                                    iArr2 = iArr111;
                                    i49 = i109;
                                    iArr6 = iArr110;
                                    jArr3 = jArr26;
                                    j15 = j214;
                                }
                                j15 += zzahcVar3.zzh[i45];
                                iArr2 = iArr2;
                                i47 = i107;
                                iArr6 = iArr6;
                                iArr4 = iArr19;
                                iArr5 = iArr5;
                                jArr9 = jArr12;
                            }
                            zzahfVar = new zzahf(zzahcVar3, jArr10, iArr7, i47, jArr11, iArr8, zzfj.zzp(j15, 1000000L, zzahcVar3.zzd));
                        } else {
                            iArr3 = iArr;
                            jArr6 = zzahcVar3.zzh;
                            length = jArr6.length;
                            if (length == 1) {
                                if (jArr6[0] == 0) {
                                    long[] jArr27 = zzahcVar3.zzi;
                                    Objects.requireNonNull(jArr27);
                                    j18 = jArr27[0];
                                    while (i54 < jArr3.length) {
                                        jArr3[i54] = zzfj.zzp(jArr3[i54] - j18, 1000000L, zzahcVar3.zzc);
                                    }
                                    zzahfVar2 = new zzahf(zzahcVar3, jArr4, iArr2, i38, jArr3, iArr3, zzfj.zzp(j14 - j18, 1000000L, zzahcVar3.zzc));
                                } else {
                                    length = 1;
                                }
                            }
                            if (zzahcVar3.zzb == 1) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            iArr4 = new int[length];
                            iArr5 = new int[length];
                            jArr7 = zzahcVar3.zzi;
                            Objects.requireNonNull(jArr7);
                            i42 = 0;
                            i43 = 0;
                            z17 = false;
                            i44 = 0;
                            while (true) {
                                jArr8 = zzahcVar3.zzh;
                                if (i43 >= jArr8.length) {
                                    break;
                                    break;
                                }
                                long[] jArr28 = jArr4;
                                int i912 = iZzb;
                                j17 = jArr7[i43];
                                if (j17 != -1) {
                                    boolean z25 = z17;
                                    int i913 = i44;
                                    long jZzp8 = zzfj.zzp(jArr8[i43], zzahcVar3.zzc, zzahcVar3.zzd);
                                    i51 = 1;
                                    iArr4[i43] = zzfj.zzc(jArr3, j17, true, true);
                                    iArr5[i43] = zzfj.zza(jArr3, j17 + jZzp8, z16, false);
                                    while (true) {
                                        i52 = iArr4[i43];
                                        i53 = iArr5[i43];
                                        iArr9 = iArr3;
                                        if (i52 < i53) {
                                            break;
                                            break;
                                        }
                                        break;
                                        break;
                                        iArr4[i43] = i52 + 1;
                                        i51 = 1;
                                        iArr3 = iArr9;
                                    }
                                    int i1010 = (i53 - i52) + i42;
                                    z17 = z25 | (i913 != i52);
                                    i50 = i53;
                                    i42 = i1010;
                                } else {
                                    i50 = i44;
                                    iArr9 = iArr3;
                                }
                                i43++;
                                iArr3 = iArr9;
                                i44 = i50;
                                jArr4 = jArr28;
                                iZzb = i912;
                            }
                            iArr6 = iArr3;
                            jArr9 = jArr4;
                            boolean z26 = z17;
                            if (i42 != iZzb) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            z19 = z18 | z26;
                            if (z19) {
                                jArr10 = new long[i42];
                            } else {
                                jArr10 = jArr9;
                            }
                            if (z19) {
                                iArr7 = new int[i42];
                            } else {
                                iArr7 = iArr2;
                            }
                            if (true == z19) {
                                i38 = 0;
                            }
                            if (z19) {
                                iArr8 = new int[i42];
                            } else {
                                iArr8 = iArr6;
                            }
                            jArr11 = new long[i42];
                            j15 = 0;
                            i46 = 0;
                            i47 = i38;
                            while (i45 < zzahcVar3.zzh.length) {
                                j16 = zzahcVar3.zzi[i45];
                                i48 = iArr4[i45];
                                int[] iArr112 = iArr4;
                                i49 = iArr5[i45];
                                if (z19) {
                                    int i1011 = i49 - i48;
                                    jArr12 = jArr9;
                                    System.arraycopy(jArr12, i48, jArr10, i46, i1011);
                                    System.arraycopy(iArr2, i48, iArr7, i46, i1011);
                                    System.arraycopy(iArr6, i48, iArr8, i46, i1011);
                                } else {
                                    jArr12 = jArr9;
                                }
                                int i1012 = i47;
                                while (i48 < i49) {
                                    int[] iArr113 = iArr6;
                                    int[] iArr114 = iArr2;
                                    long[] jArr29 = jArr3;
                                    long j215 = j15;
                                    int i1013 = i48;
                                    int i1014 = i49;
                                    jArr11[i46] = zzfj.zzp(j15, 1000000L, zzahcVar3.zzd) + zzfj.zzp(Math.max(0L, jArr3[i48] - j16), 1000000L, zzahcVar3.zzc);
                                    if (!z19) {
                                    }
                                    i46++;
                                    i48 = i1013 + 1;
                                    iArr2 = iArr114;
                                    i49 = i1014;
                                    iArr6 = iArr113;
                                    jArr3 = jArr29;
                                    j15 = j215;
                                }
                                j15 += zzahcVar3.zzh[i45];
                                iArr2 = iArr2;
                                i47 = i1012;
                                iArr6 = iArr6;
                                iArr4 = iArr112;
                                iArr5 = iArr5;
                                jArr9 = jArr12;
                            }
                            zzahfVar = new zzahf(zzahcVar3, jArr10, iArr7, i47, jArr11, iArr8, zzfj.zzp(j15, 1000000L, zzahcVar3.zzd));
                        }
                        zzahfVar = zzahfVar2;
                    }
                    arrayList2 = arrayList;
                    arrayList2.add(zzahfVar);
                } else {
                    arrayList2 = arrayList;
                }
            }
            i55 = i11 + 1;
            arrayList3 = arrayList2;
        }
        return arrayList3;
    }

    public static void zzd(zzfa zzfaVar) {
        int iZzc = zzfaVar.zzc();
        zzfaVar.zzG(4);
        if (zzfaVar.zze() != 1751411826) {
            iZzc += 4;
        }
        zzfaVar.zzF(iZzc);
    }

    private static int zze(int i10) {
        if (i10 == 1936684398) {
            return 1;
        }
        if (i10 == 1986618469) {
            return 2;
        }
        if (i10 == 1952807028 || i10 == 1935832172 || i10 == 1937072756 || i10 == 1668047728) {
            return 3;
        }
        return i10 == 1835365473 ? 5 : -1;
    }

    private static int zzf(zzfa zzfaVar) {
        int iZzk = zzfaVar.zzk();
        int i10 = iZzk & 127;
        while ((iZzk & 128) == 128) {
            iZzk = zzfaVar.zzk();
            i10 = (i10 << 7) | (iZzk & 127);
        }
        return i10;
    }

    private static int zzg(zzfa zzfaVar) {
        zzfaVar.zzF(16);
        return zzfaVar.zze();
    }

    private static Pair zzh(zzagc zzagcVar) {
        zzagd zzagdVarZzb = zzagcVar.zzb(1701606260);
        if (zzagdVarZzb == null) {
            return null;
        }
        zzfa zzfaVar = zzagdVarZzb.zza;
        zzfaVar.zzF(8);
        int iZze = zzage.zze(zzfaVar.zze());
        int iZzn = zzfaVar.zzn();
        long[] jArr = new long[iZzn];
        long[] jArr2 = new long[iZzn];
        for (int i10 = 0; i10 < iZzn; i10++) {
            jArr[i10] = iZze == 1 ? zzfaVar.zzt() : zzfaVar.zzs();
            jArr2[i10] = iZze == 1 ? zzfaVar.zzr() : zzfaVar.zze();
            if (zzfaVar.zzy() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            zzfaVar.zzG(2);
        }
        return Pair.create(jArr, jArr2);
    }

    private static Pair zzi(zzfa zzfaVar) {
        zzfaVar.zzF(8);
        int iZze = zzage.zze(zzfaVar.zze());
        zzfaVar.zzG(iZze == 0 ? 8 : 16);
        long jZzs = zzfaVar.zzs();
        zzfaVar.zzG(iZze == 0 ? 4 : 8);
        int iZzo = zzfaVar.zzo();
        StringBuilder sb2 = new StringBuilder();
        sb2.append((char) (((iZzo >> 10) & 31) + 96));
        sb2.append((char) (((iZzo >> 5) & 31) + 96));
        sb2.append((char) ((iZzo & 31) + 96));
        return Pair.create(Long.valueOf(jZzs), sb2.toString());
    }

    private static Pair zzj(zzfa zzfaVar, int i10, int i11) throws zzcd {
        zzahd zzahdVar;
        Pair pairCreate;
        int i12;
        int i13;
        byte[] bArr;
        int iZzc = zzfaVar.zzc();
        while (iZzc - i10 < i11) {
            zzfaVar.zzF(iZzc);
            int iZze = zzfaVar.zze();
            zzaba.zzb(iZze > 0, "childAtomSize must be positive");
            if (zzfaVar.zze() == 1936289382) {
                int i14 = iZzc + 8;
                int i15 = 0;
                int i16 = -1;
                String strZzx = null;
                Integer numValueOf = null;
                while (i14 - iZzc < iZze) {
                    zzfaVar.zzF(i14);
                    int iZze2 = zzfaVar.zze();
                    int iZze3 = zzfaVar.zze();
                    if (iZze3 == 1718775137) {
                        numValueOf = Integer.valueOf(zzfaVar.zze());
                    } else if (iZze3 == 1935894637) {
                        zzfaVar.zzG(4);
                        strZzx = zzfaVar.zzx(4, zzfot.zzc);
                    } else if (iZze3 == 1935894633) {
                        i16 = i14;
                        i15 = iZze2;
                    }
                    i14 += iZze2;
                }
                if ("cenc".equals(strZzx) || "cbc1".equals(strZzx) || "cens".equals(strZzx) || "cbcs".equals(strZzx)) {
                    zzaba.zzb(numValueOf != null, "frma atom is mandatory");
                    zzaba.zzb(i16 != -1, "schi atom is mandatory");
                    int i17 = i16 + 8;
                    while (true) {
                        if (i17 - i16 >= i15) {
                            zzahdVar = null;
                            break;
                        }
                        zzfaVar.zzF(i17);
                        int iZze4 = zzfaVar.zze();
                        if (zzfaVar.zze() == 1952804451) {
                            int iZze5 = zzage.zze(zzfaVar.zze());
                            zzfaVar.zzG(1);
                            if (iZze5 == 0) {
                                zzfaVar.zzG(1);
                                i12 = 0;
                                i13 = 0;
                            } else {
                                int iZzk = zzfaVar.zzk();
                                int i18 = iZzk & 240;
                                i12 = iZzk & 15;
                                i13 = i18 >> 4;
                            }
                            boolean z10 = zzfaVar.zzk() == 1;
                            int iZzk2 = zzfaVar.zzk();
                            byte[] bArr2 = new byte[16];
                            zzfaVar.zzB(bArr2, 0, 16);
                            if (z10 && iZzk2 == 0) {
                                int iZzk3 = zzfaVar.zzk();
                                byte[] bArr3 = new byte[iZzk3];
                                zzfaVar.zzB(bArr3, 0, iZzk3);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            zzahdVar = new zzahd(z10, strZzx, iZzk2, bArr2, i13, i12, bArr);
                            break;
                        }
                        i17 += iZze4;
                    }
                    zzaba.zzb(zzahdVar != null, "tenc atom is mandatory");
                    int i19 = zzfj.zza;
                    pairCreate = Pair.create(numValueOf, zzahdVar);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            iZzc += iZze;
        }
        return null;
    }

    private static zzbz zzk(zzfa zzfaVar) {
        short sZzy = zzfaVar.zzy();
        zzfaVar.zzG(2);
        String strZzx = zzfaVar.zzx(sZzy, zzfot.zzc);
        int iMax = Math.max(strZzx.lastIndexOf(43), strZzx.lastIndexOf(45));
        try {
            return new zzbz(-9223372036854775807L, new zzfq(Float.parseFloat(strZzx.substring(0, iMax)), Float.parseFloat(strZzx.substring(iMax, strZzx.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static zzagg zzl(zzfa zzfaVar, int i10) {
        zzfaVar.zzF(i10 + 12);
        zzfaVar.zzG(1);
        zzf(zzfaVar);
        zzfaVar.zzG(2);
        int iZzk = zzfaVar.zzk();
        if ((iZzk & 128) != 0) {
            zzfaVar.zzG(2);
        }
        if ((iZzk & 64) != 0) {
            zzfaVar.zzG(zzfaVar.zzk());
        }
        if ((iZzk & 32) != 0) {
            zzfaVar.zzG(2);
        }
        zzfaVar.zzG(1);
        zzf(zzfaVar);
        String strZzd = zzcc.zzd(zzfaVar.zzk());
        if ("audio/mpeg".equals(strZzd) || "audio/vnd.dts".equals(strZzd) || "audio/vnd.dts.hd".equals(strZzd)) {
            return new zzagg(strZzd, null, -1L, -1L);
        }
        zzfaVar.zzG(4);
        long jZzs = zzfaVar.zzs();
        long jZzs2 = zzfaVar.zzs();
        zzfaVar.zzG(1);
        int iZzf = zzf(zzfaVar);
        byte[] bArr = new byte[iZzf];
        zzfaVar.zzB(bArr, 0, iZzf);
        return new zzagg(strZzd, bArr, jZzs2 <= 0 ? -1L : jZzs2, jZzs > 0 ? jZzs : -1L);
    }

    private static ByteBuffer zzm() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x016b  */
    /* JADX WARN: Code duplicated, block: B:102:0x0174  */
    /* JADX WARN: Code duplicated, block: B:103:0x0176  */
    /* JADX WARN: Code duplicated, block: B:106:0x0185  */
    /* JADX WARN: Code duplicated, block: B:108:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:110:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:132:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:134:0x020b  */
    /* JADX WARN: Code duplicated, block: B:136:0x0210  */
    /* JADX WARN: Code duplicated, block: B:137:0x021e  */
    /* JADX WARN: Code duplicated, block: B:139:0x0223  */
    /* JADX WARN: Code duplicated, block: B:141:0x0249  */
    /* JADX WARN: Code duplicated, block: B:142:0x024d  */
    /* JADX WARN: Code duplicated, block: B:144:0x025e  */
    /* JADX WARN: Code duplicated, block: B:146:0x0263 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:147:0x0265  */
    /* JADX WARN: Code duplicated, block: B:150:0x0280  */
    /* JADX WARN: Code duplicated, block: B:165:0x032d  */
    /* JADX WARN: Code duplicated, block: B:166:0x0355  */
    /* JADX WARN: Code duplicated, block: B:168:0x0362  */
    /* JADX WARN: Code duplicated, block: B:170:0x0370  */
    /* JADX WARN: Code duplicated, block: B:172:0x0378  */
    /* JADX WARN: Code duplicated, block: B:184:0x0269 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x0389 A[SYNTHETIC] */
    private static void zzn(zzfa zzfaVar, int i10, int i11, int i12, int i13, String str, boolean z10, zzad zzadVar, zzagi zzagiVar, int i14) throws zzcd {
        int iZzo;
        int iZzl;
        int iZze;
        int iZzn;
        int i15;
        String str2;
        zzagg zzaggVarZzl;
        String str3;
        List listZzm;
        int iZze2;
        boolean z11;
        int iZze3;
        int i16;
        int i17;
        int i18;
        String str4;
        byte[] bArr;
        int iZzk;
        int i19;
        zzam zzamVarZzY;
        String str5;
        boolean z12;
        int i20 = i11;
        int i21 = i12;
        zzad zzadVarZzb = zzadVar;
        zzfaVar.zzF(i20 + 16);
        if (z10) {
            iZzo = zzfaVar.zzo();
            zzfaVar.zzG(6);
        } else {
            zzfaVar.zzG(8);
            iZzo = 0;
        }
        if (iZzo == 0 || iZzo == 1) {
            int iZzo2 = zzfaVar.zzo();
            zzfaVar.zzG(6);
            iZzl = zzfaVar.zzl();
            zzfaVar.zzF(zzfaVar.zzc() - 4);
            iZze = zzfaVar.zze();
            if (iZzo == 1) {
                zzfaVar.zzG(16);
            }
            iZzn = iZzo2;
        } else {
            if (iZzo != 2) {
                return;
            }
            zzfaVar.zzG(16);
            iZzl = (int) Math.round(Double.longBitsToDouble(zzfaVar.zzr()));
            iZzn = zzfaVar.zzn();
            zzfaVar.zzG(20);
            iZze = 0;
        }
        int iZzc = zzfaVar.zzc();
        int iIntValue = 1701733217;
        int i22 = i10;
        if (i22 == 1701733217) {
            Pair pairZzj = zzj(zzfaVar, i20, i21);
            if (pairZzj != null) {
                iIntValue = ((Integer) pairZzj.first).intValue();
                zzadVarZzb = zzadVarZzb == null ? null : zzadVarZzb.zzb(((zzahd) pairZzj.second).zzb);
                zzagiVar.zza[i14] = (zzahd) pairZzj.second;
            }
            zzfaVar.zzF(iZzc);
            i22 = iIntValue;
        }
        String str6 = "audio/raw";
        if (i22 == 1633889587) {
            str6 = "audio/ac3";
        } else if (i22 == 1700998451) {
            str6 = "audio/eac3";
        } else if (i22 == 1633889588) {
            str6 = "audio/ac4";
        } else if (i22 == 1685353315) {
            str6 = "audio/vnd.dts";
        } else if (i22 == 1685353320 || i22 == 1685353324) {
            str6 = "audio/vnd.dts.hd";
        } else if (i22 == 1685353317) {
            str6 = "audio/vnd.dts.hd;profile=lbr";
        } else if (i22 == 1685353336) {
            str6 = "audio/vnd.dts.uhd;profile=p2";
        } else if (i22 == 1935764850) {
            str6 = "audio/3gpp";
        } else {
            if (i22 != 1935767394) {
                if (i22 == 1819304813 || i22 == 1936684916) {
                    i15 = 2;
                } else if (i22 == 1953984371) {
                    i15 = 268435456;
                } else if (i22 == 778924082 || i22 == 778924083) {
                    str6 = "audio/mpeg";
                } else if (i22 == 1835557169) {
                    str6 = "audio/mha1";
                } else if (i22 == 1835560241) {
                    str6 = "audio/mhm1";
                } else if (i22 == 1634492771) {
                    str6 = "audio/alac";
                } else if (i22 == 1634492791) {
                    str6 = "audio/g711-alaw";
                } else if (i22 == 1970037111) {
                    str6 = "audio/g711-mlaw";
                } else if (i22 == 1332770163) {
                    str6 = "audio/opus";
                } else if (i22 == 1716281667) {
                    str6 = "audio/flac";
                } else if (i22 == 1835823201) {
                    str6 = "audio/true-hd";
                } else {
                    i15 = -1;
                    str6 = null;
                }
                str2 = str6;
                zzaggVarZzl = null;
                str3 = null;
                listZzm = null;
                while (iZzc - i20 < i21) {
                    zzfaVar.zzF(iZzc);
                    iZze2 = zzfaVar.zze();
                    if (iZze2 > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    String str7 = "childAtomSize must be positive";
                    zzaba.zzb(z11, "childAtomSize must be positive");
                    iZze3 = zzfaVar.zze();
                    if (iZze3 == 1835557187) {
                        int i23 = iZze2 - 13;
                        byte[] bArr2 = new byte[i23];
                        zzfaVar.zzF(iZzc + 13);
                        zzfaVar.zzB(bArr2, 0, i23);
                        listZzm = zzfsc.zzm(bArr2);
                        i16 = i15;
                    } else {
                        if (iZze3 != 1702061171) {
                            if (!z10 && iZze3 == 2002876005) {
                                int iZzc2 = zzfaVar.zzc();
                                if (iZzc2 >= iZzc) {
                                    str5 = null;
                                    z12 = true;
                                } else {
                                    str5 = null;
                                    z12 = false;
                                }
                                zzaba.zzb(z12, str5);
                                i17 = iZzc2;
                                while (true) {
                                    if (i17 - iZzc >= iZze2) {
                                        i16 = i15;
                                        i18 = -1;
                                        i17 = -1;
                                        break;
                                    }
                                    zzfaVar.zzF(i17);
                                    int iZze4 = zzfaVar.zze();
                                    i16 = i15;
                                    zzaba.zzb(iZze4 > 0, str7);
                                    String str8 = str7;
                                    if (zzfaVar.zze() == 1702061171) {
                                        i18 = -1;
                                        break;
                                    } else {
                                        i17 += iZze4;
                                        i15 = i16;
                                        str7 = str8;
                                    }
                                }
                            } else {
                                i16 = i15;
                                if (iZze3 == 1684103987) {
                                    zzfaVar.zzF(iZzc + 8);
                                    zzamVarZzY = zzzx.zzc(zzfaVar, Integer.toString(i13), str, zzadVarZzb);
                                } else if (iZze3 == 1684366131) {
                                    zzfaVar.zzF(iZzc + 8);
                                    zzamVarZzY = zzzx.zzd(zzfaVar, Integer.toString(i13), str, zzadVarZzb);
                                } else if (iZze3 == 1684103988) {
                                    zzfaVar.zzF(iZzc + 8);
                                    String string = Integer.toString(i13);
                                    zzfaVar.zzG(1);
                                    iZzk = zzfaVar.zzk() & 32;
                                    zzak zzakVar = new zzak();
                                    zzakVar.zzH(string);
                                    zzakVar.zzS("audio/ac4");
                                    zzakVar.zzw(2);
                                    if (1 != (iZzk >> 5)) {
                                        i19 = 44100;
                                    } else {
                                        i19 = 48000;
                                    }
                                    zzakVar.zzT(i19);
                                    zzakVar.zzB(zzadVarZzb);
                                    zzakVar.zzK(str);
                                    zzamVarZzY = zzakVar.zzY();
                                } else if (iZze3 == 1684892784) {
                                    if (iZze > 0) {
                                        throw zzcd.zza("Invalid sample rate for Dolby TrueHD MLP stream: " + iZze, null);
                                    }
                                    iZzl = iZze;
                                    iZzn = 2;
                                } else if (iZze3 != 1684305011 || iZze3 == 1969517683) {
                                    zzak zzakVar2 = new zzak();
                                    zzakVar2.zzG(i13);
                                    zzakVar2.zzS(str2);
                                    zzakVar2.zzw(iZzn);
                                    zzakVar2.zzT(iZzl);
                                    zzakVar2.zzB(zzadVarZzb);
                                    zzakVar2.zzK(str);
                                    zzagiVar.zzb = zzakVar2.zzY();
                                } else if (iZze3 == 1682927731) {
                                    int i24 = iZze2 - 8;
                                    byte[] bArr3 = zza;
                                    byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + i24);
                                    zzfaVar.zzF(iZzc + 8);
                                    zzfaVar.zzB(bArrCopyOf, bArr3.length, i24);
                                    listZzm = zzabr.zzd(bArrCopyOf);
                                } else if (iZze3 == 1684425825) {
                                    int i25 = iZze2 - 12;
                                    byte[] bArr4 = new byte[i25 + 4];
                                    bArr4[0] = 102;
                                    bArr4[1] = 76;
                                    bArr4[2] = 97;
                                    bArr4[3] = 67;
                                    zzfaVar.zzF(iZzc + 12);
                                    zzfaVar.zzB(bArr4, 4, i25);
                                    listZzm = zzfsc.zzm(bArr4);
                                } else if (iZze3 == 1634492771) {
                                    int i26 = iZze2 - 12;
                                    byte[] bArr5 = new byte[i26];
                                    zzfaVar.zzF(iZzc + 12);
                                    zzfaVar.zzB(bArr5, 0, i26);
                                    zzfa zzfaVar2 = new zzfa(bArr5);
                                    zzfaVar2.zzF(9);
                                    int iZzk2 = zzfaVar2.zzk();
                                    zzfaVar2.zzF(20);
                                    Pair pairCreate = Pair.create(Integer.valueOf(zzfaVar2.zzn()), Integer.valueOf(iZzk2));
                                    iZzl = ((Integer) pairCreate.first).intValue();
                                    int iIntValue2 = ((Integer) pairCreate.second).intValue();
                                    listZzm = zzfsc.zzm(bArr5);
                                    iZzn = iIntValue2;
                                }
                                zzagiVar.zzb = zzamVarZzY;
                            }
                            iZzc += iZze2;
                            i20 = i11;
                            i21 = i12;
                            i15 = i16;
                        } else {
                            i16 = i15;
                            i17 = iZzc;
                            i18 = -1;
                        }
                        if (i17 != i18) {
                            zzaggVarZzl = zzl(zzfaVar, i17);
                            str4 = zzaggVarZzl.zza;
                            bArr = zzaggVarZzl.zzb;
                            if (bArr != null) {
                                if ("audio/mp4a-latm".equals(str4)) {
                                    zzzt zzztVarZza = zzzu.zza(bArr);
                                    iZzl = zzztVarZza.zza;
                                    iZzn = zzztVarZza.zzb;
                                    str3 = zzztVarZza.zzc;
                                }
                                listZzm = zzfsc.zzm(bArr);
                            }
                            str2 = str4;
                        }
                        iZzc += iZze2;
                        i20 = i11;
                        i21 = i12;
                        i15 = i16;
                    }
                    iZzc += iZze2;
                    i20 = i11;
                    i21 = i12;
                    i15 = i16;
                }
                int i27 = i15;
                if (zzagiVar.zzb == null || str2 == null) {
                }
                zzak zzakVar3 = new zzak();
                zzakVar3.zzG(i13);
                zzakVar3.zzS(str2);
                zzakVar3.zzx(str3);
                zzakVar3.zzw(iZzn);
                zzakVar3.zzT(iZzl);
                zzakVar3.zzN(i27);
                zzakVar3.zzI(listZzm);
                zzakVar3.zzB(zzadVarZzb);
                zzakVar3.zzK(str);
                if (zzaggVarZzl != null) {
                    zzakVar3.zzv(zzfuk.zzc(zzaggVarZzl.zzc));
                    zzakVar3.zzO(zzfuk.zzc(zzaggVarZzl.zzd));
                }
                zzagiVar.zzb = zzakVar3.zzY();
                return;
            }
            str6 = "audio/amr-wb";
        }
        i15 = -1;
        str2 = str6;
        zzaggVarZzl = null;
        str3 = null;
        listZzm = null;
        while (iZzc - i20 < i21) {
            zzfaVar.zzF(iZzc);
            iZze2 = zzfaVar.zze();
            if (iZze2 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            String str9 = "childAtomSize must be positive";
            zzaba.zzb(z11, "childAtomSize must be positive");
            iZze3 = zzfaVar.zze();
            if (iZze3 == 1835557187) {
                int i28 = iZze2 - 13;
                byte[] bArr6 = new byte[i28];
                zzfaVar.zzF(iZzc + 13);
                zzfaVar.zzB(bArr6, 0, i28);
                listZzm = zzfsc.zzm(bArr6);
                i16 = i15;
            } else {
                if (iZze3 != 1702061171) {
                    if (!z10) {
                    }
                    i16 = i15;
                    if (iZze3 == 1684103987) {
                        zzfaVar.zzF(iZzc + 8);
                        zzamVarZzY = zzzx.zzc(zzfaVar, Integer.toString(i13), str, zzadVarZzb);
                    } else if (iZze3 == 1684366131) {
                        zzfaVar.zzF(iZzc + 8);
                        zzamVarZzY = zzzx.zzd(zzfaVar, Integer.toString(i13), str, zzadVarZzb);
                    } else {
                        if (iZze3 == 1684103988) {
                            zzfaVar.zzF(iZzc + 8);
                            String string2 = Integer.toString(i13);
                            zzfaVar.zzG(1);
                            iZzk = zzfaVar.zzk() & 32;
                            zzak zzakVar4 = new zzak();
                            zzakVar4.zzH(string2);
                            zzakVar4.zzS("audio/ac4");
                            zzakVar4.zzw(2);
                            if (1 != (iZzk >> 5)) {
                                i19 = 44100;
                            } else {
                                i19 = 48000;
                            }
                            zzakVar4.zzT(i19);
                            zzakVar4.zzB(zzadVarZzb);
                            zzakVar4.zzK(str);
                            zzamVarZzY = zzakVar4.zzY();
                        } else if (iZze3 == 1684892784) {
                            if (iZze > 0) {
                                throw zzcd.zza("Invalid sample rate for Dolby TrueHD MLP stream: " + iZze, null);
                            }
                            iZzl = iZze;
                            iZzn = 2;
                        } else if (iZze3 != 1684305011) {
                            zzak zzakVar5 = new zzak();
                            zzakVar5.zzG(i13);
                            zzakVar5.zzS(str2);
                            zzakVar5.zzw(iZzn);
                            zzakVar5.zzT(iZzl);
                            zzakVar5.zzB(zzadVarZzb);
                            zzakVar5.zzK(str);
                            zzagiVar.zzb = zzakVar5.zzY();
                        } else {
                            zzak zzakVar6 = new zzak();
                            zzakVar6.zzG(i13);
                            zzakVar6.zzS(str2);
                            zzakVar6.zzw(iZzn);
                            zzakVar6.zzT(iZzl);
                            zzakVar6.zzB(zzadVarZzb);
                            zzakVar6.zzK(str);
                            zzagiVar.zzb = zzakVar6.zzY();
                        }
                        iZzc += iZze2;
                        i20 = i11;
                        i21 = i12;
                        i15 = i16;
                    }
                    zzagiVar.zzb = zzamVarZzY;
                } else {
                    i16 = i15;
                    i17 = iZzc;
                    i18 = -1;
                }
                if (i17 != i18) {
                    zzaggVarZzl = zzl(zzfaVar, i17);
                    str4 = zzaggVarZzl.zza;
                    bArr = zzaggVarZzl.zzb;
                    if (bArr != null) {
                        if ("audio/mp4a-latm".equals(str4)) {
                            zzzt zzztVarZza2 = zzzu.zza(bArr);
                            iZzl = zzztVarZza2.zza;
                            iZzn = zzztVarZza2.zzb;
                            str3 = zzztVarZza2.zzc;
                        }
                        listZzm = zzfsc.zzm(bArr);
                    }
                    str2 = str4;
                }
                iZzc += iZze2;
                i20 = i11;
                i21 = i12;
                i15 = i16;
            }
            iZzc += iZze2;
            i20 = i11;
            i21 = i12;
            i15 = i16;
        }
        int i29 = i15;
        if (zzagiVar.zzb == null) {
        }
    }

    private static void zzo(zzfa zzfaVar, int i10, int i11, int i12, zzagi zzagiVar) {
        zzfaVar.zzF(i11 + 16);
        zzfaVar.zzv((char) 0);
        String strZzv = zzfaVar.zzv((char) 0);
        if (strZzv != null) {
            zzak zzakVar = new zzak();
            zzakVar.zzG(i12);
            zzakVar.zzS(strZzv);
            zzagiVar.zzb = zzakVar.zzY();
        }
    }

    private static boolean zzp(long[] jArr, long j10, long j11, long j12) {
        int length = jArr.length;
        int i10 = length - 1;
        return jArr[0] <= j11 && j11 < jArr[Math.max(0, Math.min(4, i10))] && jArr[Math.max(0, Math.min(length + (-4), i10))] < j12 && j12 <= j10;
    }

    private static byte[] zzq(zzfa zzfaVar, int i10, int i11) {
        int i12 = i10 + 8;
        while (i12 - i10 < i11) {
            zzfaVar.zzF(i12);
            int iZze = zzfaVar.zze();
            if (zzfaVar.zze() == 1886547818) {
                return Arrays.copyOfRange(zzfaVar.zzH(), i12, iZze + i12);
            }
            i12 += iZze;
        }
        return null;
    }
}
