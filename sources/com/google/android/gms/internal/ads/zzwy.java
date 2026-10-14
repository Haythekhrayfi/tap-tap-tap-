package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class zzwy extends zzxd implements zzlj {
    public static final /* synthetic */ int zzb = 0;
    private static final zzftl zzc = zzftl.zzb(new Comparator() { // from class: com.google.android.gms.internal.ads.zzwe
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Integer num = (Integer) obj;
            Integer num2 = (Integer) obj2;
            int i10 = zzwy.zzb;
            if (num.intValue() == -1) {
                return num2.intValue() == -1 ? 0 : -1;
            }
            if (num2.intValue() == -1) {
                return 1;
            }
            return num.intValue() - num2.intValue();
        }
    });
    private static final zzftl zzd = zzftl.zzb(new Comparator() { // from class: com.google.android.gms.internal.ads.zzwf
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int i10 = zzwy.zzb;
            return 0;
        }
    });
    public final Context zza;
    private final Object zze;
    private final boolean zzf;
    private zzwm zzg;
    private zzwr zzh;
    private zzk zzi;
    private final zzvt zzj;

    public zzwy(Context context) {
        zzvt zzvtVar = new zzvt();
        zzwm zzwmVarZzd = zzwm.zzd(context);
        this.zze = new Object();
        this.zza = context != null ? context.getApplicationContext() : null;
        this.zzj = zzvtVar;
        this.zzg = zzwmVarZzd;
        this.zzi = zzk.zza;
        boolean z10 = false;
        if (context != null && zzfj.zzE(context)) {
            z10 = true;
        }
        this.zzf = z10;
        if (!z10 && context != null && zzfj.zza >= 32) {
            this.zzh = zzwr.zza(context);
        }
        if (this.zzg.zzQ && context == null) {
            zzer.zzf("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static int zza(zzam zzamVar, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(zzamVar.zzd)) {
            return 4;
        }
        String strZzg = zzg(str);
        String strZzg2 = zzg(zzamVar.zzd);
        if (strZzg2 == null || strZzg == null) {
            return (z10 && strZzg2 == null) ? 1 : 0;
        }
        if (strZzg2.startsWith(strZzg) || strZzg.startsWith(strZzg2)) {
            return 3;
        }
        int i10 = zzfj.zza;
        return strZzg2.split("-", 2)[0].equals(strZzg.split("-", 2)[0]) ? 2 : 0;
    }

    public static String zzg(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x004c  */
    /* JADX WARN: Code duplicated, block: B:54:0x008b  */
    public static /* synthetic */ boolean zzl(zzwy zzwyVar, zzam zzamVar) {
        boolean z10;
        byte b10;
        zzwr zzwrVar;
        zzwr zzwrVar2;
        synchronized (zzwyVar.zze) {
            z10 = false;
            if (!zzwyVar.zzg.zzQ || zzwyVar.zzf || zzamVar.zzz <= 2) {
                z10 = true;
            } else {
                String str = zzamVar.zzm;
                if (str != null) {
                    switch (str) {
                        case "audio/eac3-joc":
                            b10 = 2;
                            break;
                        case "audio/ac3":
                            b10 = 0;
                            break;
                        case "audio/ac4":
                            b10 = 3;
                            break;
                        case "audio/eac3":
                            b10 = 1;
                            break;
                        default:
                            b10 = -1;
                            break;
                    }
                    if ((b10 == 0 || b10 == 1 || b10 == 2 || b10 == 3) && (zzfj.zza < 32 || (zzwrVar = zzwyVar.zzh) == null || !zzwrVar.zzg())) {
                        z10 = true;
                    }
                }
                if (zzfj.zza >= 32 && (zzwrVar2 = zzwyVar.zzh) != null && zzwrVar2.zzg() && zzwrVar2.zze() && zzwyVar.zzh.zzf() && zzwyVar.zzh.zzd(zzwyVar.zzi, zzamVar)) {
                    z10 = true;
                }
            }
        }
        return z10;
    }

    public static boolean zzn(int i10, boolean z10) {
        int i11 = i10 & 7;
        return i11 == 4 || (z10 && i11 == 3);
    }

    private static void zzt(zzvn zzvnVar, zzdd zzddVar, Map map) {
        for (int i10 = 0; i10 < zzvnVar.zzc; i10++) {
            if (((zzda) zzddVar.zzC.get(zzvnVar.zzb(i10))) != null) {
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzu() {
        boolean z10;
        zzwr zzwrVar;
        synchronized (this.zze) {
            z10 = false;
            if (this.zzg.zzQ && !this.zzf && zzfj.zza >= 32 && (zzwrVar = this.zzh) != null && zzwrVar.zzg()) {
                z10 = true;
            }
        }
        if (z10) {
            zzs();
        }
    }

    private static final Pair zzv(int i10, zzxc zzxcVar, int[][][] iArr, zzwt zzwtVar, Comparator comparator) {
        int i11;
        RandomAccess randomAccessZzm;
        int i12;
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < 2; i13++) {
            if (i10 == zzxcVar.zzc(i13)) {
                zzvn zzvnVarZzd = zzxcVar.zzd(i13);
                for (int i14 = 0; i14 < zzvnVarZzd.zzc; i14++) {
                    zzcy zzcyVarZzb = zzvnVarZzd.zzb(i14);
                    List listZza = zzwtVar.zza(i13, zzcyVarZzb, iArr[i13][i14]);
                    int i15 = zzcyVarZzb.zzb;
                    int i16 = 1;
                    boolean[] zArr = new boolean[1];
                    int i17 = 0;
                    while (i17 <= 0) {
                        zzwu zzwuVar = (zzwu) listZza.get(i17);
                        int iZzb = zzwuVar.zzb();
                        if (zArr[i17] || iZzb == 0) {
                            i11 = i16;
                        } else {
                            if (iZzb == i16) {
                                randomAccessZzm = zzfsc.zzm(zzwuVar);
                                i11 = i16;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(zzwuVar);
                                int i18 = i17 + 1;
                                while (i18 <= 0) {
                                    zzwu zzwuVar2 = (zzwu) listZza.get(i18);
                                    if (zzwuVar2.zzb() == 2 && zzwuVar.zzc(zzwuVar2)) {
                                        arrayList2.add(zzwuVar2);
                                        i12 = 1;
                                        zArr[i18] = true;
                                    } else {
                                        i12 = 1;
                                    }
                                    i18++;
                                    i16 = i12;
                                }
                                i11 = i16;
                                randomAccessZzm = arrayList2;
                            }
                            arrayList.add(randomAccessZzm);
                        }
                        i17++;
                        i16 = i11;
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i19 = 0; i19 < list.size(); i19++) {
            iArr2[i19] = ((zzwu) list.get(i19)).zzc;
        }
        zzwu zzwuVar3 = (zzwu) list.get(0);
        return Pair.create(new zzwz(zzwuVar3.zzb, iArr2, 0), Integer.valueOf(zzwuVar3.zza));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzxd
    public final Pair zzb(zzxc zzxcVar, int[][][] iArr, final int[] iArr2, zzto zztoVar, zzcw zzcwVar) throws zzih {
        final zzwm zzwmVar;
        int i10;
        final boolean z10;
        final String str;
        int[] iArr3;
        int length;
        zzwr zzwrVar;
        int[][][] iArr4 = iArr;
        synchronized (this.zze) {
            zzwmVar = this.zzg;
            if (zzwmVar.zzQ && zzfj.zza >= 32 && (zzwrVar = this.zzh) != null) {
                Looper looperMyLooper = Looper.myLooper();
                zzdy.zzb(looperMyLooper);
                zzwrVar.zzb(this, looperMyLooper);
            }
        }
        int i11 = 2;
        zzwz[] zzwzVarArr = new zzwz[2];
        Pair pairZzv = zzv(2, zzxcVar, iArr4, new zzwt() { // from class: com.google.android.gms.internal.ads.zzwa
            /* JADX WARN: Code duplicated, block: B:22:0x003e  */
            @Override // com.google.android.gms.internal.ads.zzwt
            public final List zza(int i12, zzcy zzcyVar, int[] iArr5) {
                int i13;
                int i14;
                int i15;
                Point point;
                zzwm zzwmVar2 = zzwmVar;
                int[] iArr6 = iArr2;
                int i16 = zzwy.zzb;
                int i17 = iArr6[i12];
                int i18 = zzwmVar2.zzl;
                int i19 = zzwmVar2.zzm;
                boolean z11 = zzwmVar2.zzn;
                int i20 = Integer.MAX_VALUE;
                if (i18 == Integer.MAX_VALUE) {
                    i20 = Integer.MAX_VALUE;
                } else if (i19 != Integer.MAX_VALUE) {
                    int i21 = Integer.MAX_VALUE;
                    int i22 = 0;
                    while (true) {
                        int i23 = zzcyVar.zzb;
                        if (i22 > 0) {
                            break;
                        }
                        zzam zzamVarZzb = zzcyVar.zzb(i22);
                        int i24 = zzamVarZzb.zzr;
                        if (i24 > 0 && (i13 = zzamVarZzb.zzs) > 0) {
                            if (z11) {
                                if ((i24 > i13) != (i18 > i19)) {
                                    i15 = i18;
                                    i14 = i19;
                                } else {
                                    i14 = i18;
                                    i15 = i19;
                                }
                            } else {
                                i14 = i18;
                                i15 = i19;
                            }
                            int i25 = i24 * i15;
                            int i26 = i13 * i14;
                            if (i25 >= i26) {
                                int i27 = zzfj.zza;
                                point = new Point(i14, ((i26 + i24) - 1) / i24);
                            } else {
                                int i28 = zzfj.zza;
                                point = new Point(((i25 + i13) - 1) / i13, i15);
                            }
                            int i29 = zzamVarZzb.zzr;
                            int i30 = zzamVarZzb.zzs;
                            int i31 = i29 * i30;
                            if (i29 >= ((int) (point.x * 0.98f)) && i30 >= ((int) (point.y * 0.98f)) && i31 < i21) {
                                i21 = i31;
                            }
                        }
                        i22++;
                    }
                    i20 = i21;
                }
                zzfrz zzfrzVar = new zzfrz();
                int i32 = 0;
                while (true) {
                    int i33 = zzcyVar.zzb;
                    if (i32 > 0) {
                        return zzfrzVar.zzi();
                    }
                    int iZza = zzcyVar.zzb(i32).zza();
                    zzfrzVar.zzf(new zzwx(i12, zzcyVar, i32, zzwmVar2, iArr5[i32], i17, i20 == Integer.MAX_VALUE || (iZza != -1 && iZza <= i20)));
                    i32++;
                }
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzwb
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                List list = (List) obj;
                List list2 = (List) obj2;
                zzfrr zzfrrVarZzj = zzfrr.zzj();
                zzwv zzwvVar = new Comparator() { // from class: com.google.android.gms.internal.ads.zzwv
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzwx.zzd((zzwx) obj3, (zzwx) obj4);
                    }
                };
                zzfrr zzfrrVarZzb = zzfrrVarZzj.zzc((zzwx) Collections.max(list, zzwvVar), (zzwx) Collections.max(list2, zzwvVar), zzwvVar).zzb(list.size(), list2.size());
                zzww zzwwVar = new Comparator() { // from class: com.google.android.gms.internal.ads.zzww
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzwx.zza((zzwx) obj3, (zzwx) obj4);
                    }
                };
                return zzfrrVarZzb.zzc((zzwx) Collections.max(list, zzwwVar), (zzwx) Collections.max(list2, zzwwVar), zzwwVar).zza();
            }
        });
        if (pairZzv != null) {
            zzwzVarArr[((Integer) pairZzv.second).intValue()] = (zzwz) pairZzv.first;
        }
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i10 = 1;
            if (i13 >= 2) {
                z10 = false;
                break;
            }
            if (zzxcVar.zzc(i13) == 2 && zzxcVar.zzd(i13).zzc > 0) {
                z10 = true;
                break;
            }
            i13++;
        }
        Pair pairZzv2 = zzv(1, zzxcVar, iArr4, new zzwt() { // from class: com.google.android.gms.internal.ads.zzvy
            @Override // com.google.android.gms.internal.ads.zzwt
            public final List zza(int i14, zzcy zzcyVar, int[] iArr5) {
                final zzwy zzwyVar = this.zza;
                zzwm zzwmVar2 = zzwmVar;
                boolean z11 = z10;
                zzfpi zzfpiVar = new zzfpi() { // from class: com.google.android.gms.internal.ads.zzvx
                    @Override // com.google.android.gms.internal.ads.zzfpi
                    public final boolean zza(Object obj) {
                        return zzwy.zzl(zzwyVar, (zzam) obj);
                    }
                };
                zzfrz zzfrzVar = new zzfrz();
                int i15 = 0;
                while (true) {
                    int i16 = zzcyVar.zzb;
                    if (i15 > 0) {
                        return zzfrzVar.zzi();
                    }
                    zzfrzVar.zzf(new zzwg(i14, zzcyVar, i15, zzwmVar2, iArr5[i15], z11, zzfpiVar));
                    i15++;
                }
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzvz
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((zzwg) Collections.max((List) obj)).zza((zzwg) Collections.max((List) obj2));
            }
        });
        if (pairZzv2 != null) {
            zzwzVarArr[((Integer) pairZzv2.second).intValue()] = (zzwz) pairZzv2.first;
        }
        if (pairZzv2 == null) {
            str = null;
        } else {
            Object obj = pairZzv2.first;
            str = ((zzwz) obj).zza.zzb(((zzwz) obj).zzb[0]).zzd;
        }
        int i14 = 3;
        Pair pairZzv3 = zzv(3, zzxcVar, iArr4, new zzwt() { // from class: com.google.android.gms.internal.ads.zzwc
            @Override // com.google.android.gms.internal.ads.zzwt
            public final List zza(int i15, zzcy zzcyVar, int[] iArr5) {
                zzwm zzwmVar2 = zzwmVar;
                String str2 = str;
                int i16 = zzwy.zzb;
                zzfrz zzfrzVar = new zzfrz();
                int i17 = 0;
                while (true) {
                    int i18 = zzcyVar.zzb;
                    if (i17 > 0) {
                        return zzfrzVar.zzi();
                    }
                    zzfrzVar.zzf(new zzws(i15, zzcyVar, i17, zzwmVar2, iArr5[i17], str2));
                    i17++;
                }
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzwd
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return ((zzws) ((List) obj2).get(0)).zza((zzws) ((List) obj3).get(0));
            }
        });
        if (pairZzv3 != null) {
            zzwzVarArr[((Integer) pairZzv3.second).intValue()] = (zzwz) pairZzv3.first;
        }
        int i15 = 0;
        while (i15 < i11) {
            int iZzc = zzxcVar.zzc(i15);
            if (iZzc != i11 && iZzc != i10 && iZzc != i14) {
                zzvn zzvnVarZzd = zzxcVar.zzd(i15);
                int[][] iArr5 = iArr4[i15];
                int i16 = i12;
                int i17 = i16;
                zzcy zzcyVar = null;
                zzwh zzwhVar = null;
                while (i16 < zzvnVarZzd.zzc) {
                    zzcy zzcyVarZzb = zzvnVarZzd.zzb(i16);
                    int[] iArr6 = iArr5[i16];
                    int i18 = i12;
                    zzwh zzwhVar2 = zzwhVar;
                    while (true) {
                        int i19 = zzcyVarZzb.zzb;
                        if (i18 <= 0) {
                            if (zzn(iArr6[i18], zzwmVar.zzR)) {
                                zzwh zzwhVar3 = new zzwh(zzcyVarZzb.zzb(i18), iArr6[i18]);
                                if (zzwhVar2 == null || zzwhVar3.compareTo(zzwhVar2) > 0) {
                                    i17 = i18;
                                    zzwhVar2 = zzwhVar3;
                                    zzcyVar = zzcyVarZzb;
                                }
                            }
                            i18++;
                        }
                    }
                    i16++;
                    zzwhVar = zzwhVar2;
                    i12 = 0;
                }
                zzwzVarArr[i15] = zzcyVar == null ? null : new zzwz(zzcyVar, new int[]{i17}, 0);
            }
            i15++;
            iArr4 = iArr;
            i11 = 2;
            i12 = 0;
            i10 = 1;
            i14 = 3;
        }
        HashMap map = new HashMap();
        int i20 = 2;
        for (int i21 = 0; i21 < 2; i21++) {
            zzt(zzxcVar.zzd(i21), zzwmVar, map);
        }
        zzt(zzxcVar.zze(), zzwmVar, map);
        for (int i22 = 0; i22 < 2; i22++) {
            if (((zzda) map.get(Integer.valueOf(zzxcVar.zzc(i22)))) != null) {
                throw null;
            }
        }
        int i23 = 0;
        while (i23 < i20) {
            zzvn zzvnVarZzd2 = zzxcVar.zzd(i23);
            if (zzwmVar.zzg(i23, zzvnVarZzd2)) {
                if (zzwmVar.zze(i23, zzvnVarZzd2) != null) {
                    throw null;
                }
                zzwzVarArr[i23] = null;
            }
            i23++;
            i20 = 2;
        }
        int i24 = 0;
        for (int i25 = i20; i24 < i25; i25 = 2) {
            int iZzc2 = zzxcVar.zzc(i24);
            if (zzwmVar.zzf(i24) || zzwmVar.zzD.contains(Integer.valueOf(iZzc2))) {
                zzwzVarArr[i24] = null;
            }
            i24++;
        }
        zzvt zzvtVar = this.zzj;
        zzxo zzxoVarZzq = zzq();
        zzfsc zzfscVarZzf = zzvu.zzf(zzwzVarArr);
        int i26 = 2;
        zzxa[] zzxaVarArr = new zzxa[2];
        int i27 = 0;
        while (i27 < i26) {
            zzwz zzwzVar = zzwzVarArr[i27];
            if (zzwzVar != null && (length = (iArr3 = zzwzVar.zzb).length) != 0) {
                zzxaVarArr[i27] = length == 1 ? new zzxb(zzwzVar.zza, iArr3[0], 0, 0, null) : zzvtVar.zza(zzwzVar.zza, iArr3, 0, zzxoVarZzq, (zzfsc) zzfscVarZzf.get(i27));
            }
            i27++;
            i26 = 2;
        }
        zzll[] zzllVarArr = new zzll[i26];
        for (int i28 = 0; i28 < i26; i28++) {
            zzllVarArr[i28] = (zzwmVar.zzf(i28) || zzwmVar.zzD.contains(Integer.valueOf(zzxcVar.zzc(i28))) || (zzxcVar.zzc(i28) != -2 && zzxaVarArr[i28] == null)) ? null : zzll.zza;
        }
        return Pair.create(zzllVarArr, zzxaVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final zzlj zzc() {
        return this;
    }

    public final zzwm zzd() {
        zzwm zzwmVar;
        synchronized (this.zze) {
            zzwmVar = this.zzg;
        }
        return zzwmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zzi() {
        zzwr zzwrVar;
        synchronized (this.zze) {
            if (zzfj.zza >= 32 && (zzwrVar = this.zzh) != null) {
                zzwrVar.zzc();
            }
        }
        super.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zzj(zzk zzkVar) {
        boolean z10;
        synchronized (this.zze) {
            z10 = !this.zzi.equals(zzkVar);
            this.zzi = zzkVar;
        }
        if (z10) {
            zzu();
        }
    }

    public final void zzk(zzwk zzwkVar) {
        boolean z10;
        zzwm zzwmVar = new zzwm(zzwkVar);
        synchronized (this.zze) {
            z10 = !this.zzg.equals(zzwmVar);
            this.zzg = zzwmVar;
        }
        if (z10) {
            if (zzwmVar.zzQ && this.zza == null) {
                zzer.zzf("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            zzs();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final boolean zzm() {
        return true;
    }
}
