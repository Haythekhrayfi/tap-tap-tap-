package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
final class zzkh implements Handler.Callback, zztl, zzxf, zzla, zzie, zzld {
    private boolean zzA;
    private boolean zzD;
    private boolean zzE;
    private boolean zzF;
    private int zzG;
    private zzkg zzH;
    private long zzI;
    private int zzJ;
    private boolean zzK;
    private zzih zzL;
    private final zzjc zzN;
    private final zzic zzO;
    private final zzli[] zza;
    private final Set zzb;
    private final zzlk[] zzc;
    private final zzxg zzd;
    private final zzxh zze;
    private final zzkk zzf;
    private final zzxo zzg;
    private final zzei zzh;
    private final HandlerThread zzi;
    private final Looper zzj;
    private final zzcv zzk;
    private final zzct zzl;
    private final long zzm;
    private final zzif zzn;
    private final ArrayList zzo;
    private final zzdz zzp;
    private final zzkp zzq;
    private final zzlb zzr;
    private final long zzs;
    private zzlm zzt;
    private zzlc zzu;
    private zzkf zzv;
    private boolean zzw;
    private boolean zzy;
    private boolean zzz;
    private int zzB = 0;
    private boolean zzC = false;
    private boolean zzx = false;
    private long zzM = -9223372036854775807L;

    public zzkh(zzli[] zzliVarArr, zzxg zzxgVar, zzxh zzxhVar, zzkk zzkkVar, zzxo zzxoVar, int i10, boolean z10, zzls zzlsVar, zzlm zzlmVar, zzic zzicVar, long j10, boolean z11, Looper looper, zzdz zzdzVar, zzjc zzjcVar, zzoc zzocVar, Looper looper2) {
        this.zzN = zzjcVar;
        this.zza = zzliVarArr;
        this.zzd = zzxgVar;
        this.zze = zzxhVar;
        this.zzf = zzkkVar;
        this.zzg = zzxoVar;
        this.zzt = zzlmVar;
        this.zzO = zzicVar;
        this.zzs = j10;
        this.zzp = zzdzVar;
        this.zzm = zzkkVar.zza();
        zzkkVar.zzf();
        zzlc zzlcVarZzi = zzlc.zzi(zzxhVar);
        this.zzu = zzlcVarZzi;
        this.zzv = new zzkf(zzlcVarZzi);
        int length = zzliVarArr.length;
        this.zzc = new zzlk[2];
        zzlj zzljVarZzc = zzxgVar.zzc();
        for (int i11 = 0; i11 < 2; i11++) {
            zzliVarArr[i11].zzr(i11, zzocVar);
            this.zzc[i11] = zzliVarArr[i11].zzj();
            this.zzc[i11].zzF(zzljVarZzc);
        }
        this.zzn = new zzif(this, zzdzVar);
        this.zzo = new ArrayList();
        this.zzb = Collections.newSetFromMap(new IdentityHashMap());
        this.zzk = new zzcv();
        this.zzl = new zzct();
        zzxgVar.zzr(this, zzxoVar);
        this.zzK = true;
        zzei zzeiVarZzb = zzdzVar.zzb(looper, null);
        this.zzq = new zzkp(zzlsVar, zzeiVarZzb);
        this.zzr = new zzlb(this, zzlsVar, zzeiVarZzb, zzocVar);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.zzi = handlerThread;
        handlerThread.start();
        Looper looper3 = handlerThread.getLooper();
        this.zzj = looper3;
        this.zzh = zzdzVar.zzb(looper3, this);
    }

    private final void zzA(zzli zzliVar) throws zzih {
        if (zzae(zzliVar)) {
            this.zzn.zzd(zzliVar);
            zzal(zzliVar);
            zzliVar.zzo();
            this.zzG--;
        }
    }

    private final void zzB() throws zzih {
        int length = this.zza.length;
        zzC(new boolean[2]);
    }

    private final void zzC(boolean[] zArr) throws zzih {
        zzkm zzkmVarZze = this.zzq.zze();
        zzxh zzxhVarZzi = zzkmVarZze.zzi();
        int i10 = 0;
        while (true) {
            int length = this.zza.length;
            if (i10 >= 2) {
                break;
            }
            if (!zzxhVarZzi.zzb(i10) && this.zzb.remove(this.zza[i10])) {
                this.zza[i10].zzC();
            }
            i10++;
        }
        int i11 = 0;
        while (true) {
            int length2 = this.zza.length;
            if (i11 >= 2) {
                zzkmVarZze.zzg = true;
                return;
            }
            if (zzxhVarZzi.zzb(i11)) {
                boolean z10 = zArr[i11];
                zzli zzliVar = this.zza[i11];
                if (!zzae(zzliVar)) {
                    zzkm zzkmVarZze2 = this.zzq.zze();
                    boolean z11 = zzkmVarZze2 == this.zzq.zzd();
                    zzxh zzxhVarZzi2 = zzkmVarZze2.zzi();
                    zzll zzllVar = zzxhVarZzi2.zzb[i11];
                    zzam[] zzamVarArrZzaj = zzaj(zzxhVarZzi2.zzc[i11]);
                    boolean z12 = zzah() && this.zzu.zze == 3;
                    boolean z13 = !z10 && z12;
                    this.zzG++;
                    this.zzb.add(zzliVar);
                    zzliVar.zzp(zzllVar, zzamVarArrZzaj, zzkmVarZze2.zzc[i11], this.zzI, z13, z11, zzkmVarZze2.zzf(), zzkmVarZze2.zze());
                    zzliVar.zzq(11, new zzka(this));
                    this.zzn.zze(zzliVar);
                    if (z12) {
                        zzliVar.zzH();
                    }
                }
            }
            i11++;
        }
    }

    private final void zzD(IOException iOException, int i10) {
        zzih zzihVarZzc = zzih.zzc(iOException, i10);
        zzkm zzkmVarZzd = this.zzq.zzd();
        if (zzkmVarZzd != null) {
            zzihVarZzc = zzihVarZzc.zza(zzkmVarZzd.zzf.zza);
        }
        zzer.zzd("ExoPlayerImplInternal", "Playback error", zzihVarZzc);
        zzW(false, false);
        this.zzu = this.zzu.zzf(zzihVarZzc);
    }

    private final void zzE(boolean z10) {
        zzkm zzkmVarZzc = this.zzq.zzc();
        zzto zztoVar = zzkmVarZzc == null ? this.zzu.zzb : zzkmVarZzc.zzf.zza;
        boolean z11 = !this.zzu.zzk.equals(zztoVar);
        if (z11) {
            this.zzu = this.zzu.zzc(zztoVar);
        }
        zzlc zzlcVar = this.zzu;
        zzlcVar.zzp = zzkmVarZzc == null ? zzlcVar.zzr : zzkmVarZzc.zzc();
        this.zzu.zzq = zzt();
        if ((z11 || z10) && zzkmVarZzc != null && zzkmVarZzc.zzd) {
            zzZ(zzkmVarZzc.zzf.zza, zzkmVarZzc.zzh(), zzkmVarZzc.zzi());
        }
    }

    /* JADX WARN: Code duplicated, block: B:186:0x0340  */
    /* JADX WARN: Code duplicated, block: B:189:0x0354  */
    /* JADX WARN: Code duplicated, block: B:191:0x035c  */
    /* JADX WARN: Code duplicated, block: B:193:0x0366 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:199:0x0379  */
    /* JADX WARN: Code duplicated, block: B:202:0x0386  */
    /* JADX WARN: Code duplicated, block: B:206:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:50:0x013d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0158  */
    /* JADX WARN: Code duplicated, block: B:54:0x0163  */
    /* JADX WARN: Code duplicated, block: B:59:0x016c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0175  */
    /* JADX WARN: Code duplicated, block: B:68:0x0185  */
    /* JADX WARN: Code duplicated, block: B:71:0x018c  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:88:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:91:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d4  */
    private final void zzF(zzcw zzcwVar, boolean z10) throws Throwable {
        zzto zztoVar;
        zzkp zzkpVar;
        int i10;
        int i11;
        boolean z11;
        boolean z12;
        boolean z13;
        int iZzg;
        int iZzg2;
        boolean z14;
        long jLongValue;
        zzto zztoVarZzh;
        int i12;
        boolean z15;
        boolean z16;
        zzct zzctVarZzn;
        long j10;
        long jZzv;
        boolean z17;
        boolean z18;
        zzto zztoVarZzj;
        boolean z19;
        int i13;
        int iZzg3;
        boolean z20;
        boolean z21;
        boolean z22;
        int i14;
        int i15;
        int i16;
        long jMax;
        zzkh zzkhVar = this;
        zzlc zzlcVar = zzkhVar.zzu;
        zzkg zzkgVar = zzkhVar.zzH;
        zzkp zzkpVar2 = zzkhVar.zzq;
        int i17 = zzkhVar.zzB;
        boolean z23 = zzkhVar.zzC;
        zzcv zzcvVar = zzkhVar.zzk;
        zzct zzctVar = zzkhVar.zzl;
        boolean z24 = true;
        if (zzcwVar.zzo()) {
            zztoVarZzj = zzlc.zzj();
            z19 = true;
            j10 = -9223372036854775807L;
            z17 = false;
            z18 = false;
            i10 = -1;
            jZzv = 0;
        } else {
            zzto zztoVar2 = zzlcVar.zzb;
            Object obj = zztoVar2.zza;
            boolean zZzag = zzag(zzlcVar, zzctVar);
            long jLongValue2 = (zzlcVar.zzb.zzb() || zZzag) ? zzlcVar.zzc : zzlcVar.zzr;
            if (zzkgVar != null) {
                zztoVar = zztoVar2;
                zzkpVar = zzkpVar2;
                i10 = -1;
                Pair pairZzy = zzy(zzcwVar, zzkgVar, true, i17, z23, zzcvVar, zzctVar);
                if (pairZzy == null) {
                    iZzg3 = zzcwVar.zzg(z23);
                    jLongValue2 = jLongValue2;
                    z14 = true;
                    z21 = false;
                    z22 = false;
                } else {
                    if (zzkgVar.zzc == -9223372036854775807L) {
                        iZzg3 = zzcwVar.zzn(pairZzy.first, zzctVar).zzd;
                        jLongValue2 = jLongValue2;
                        z20 = false;
                    } else {
                        obj = pairZzy.first;
                        jLongValue2 = ((Long) pairZzy.second).longValue();
                        iZzg3 = -1;
                        z20 = true;
                    }
                    z21 = zzlcVar.zze == 4;
                    z22 = z20;
                    z14 = false;
                }
                z11 = z21;
                i11 = iZzg3;
                z13 = z22;
            } else {
                zztoVar = zztoVar2;
                zzkpVar = zzkpVar2;
                i10 = -1;
                if (zzlcVar.zza.zzo()) {
                    iZzg = zzcwVar.zzg(z23);
                } else {
                    if (zzcwVar.zza(obj) == -1) {
                        Object objZze = zze(zzcvVar, zzctVar, i17, z23, obj, zzlcVar.zza, zzcwVar);
                        if (objZze == null) {
                            iZzg2 = zzcwVar.zzg(z23);
                            z14 = true;
                        } else {
                            iZzg2 = zzcwVar.zzn(objZze, zzctVar).zzd;
                            z14 = false;
                        }
                        i11 = iZzg2;
                        jLongValue2 = jLongValue2;
                        z11 = false;
                        z13 = false;
                    } else if (jLongValue2 == -9223372036854775807L) {
                        iZzg = zzcwVar.zzn(obj, zzctVar).zzd;
                    } else if (zZzag) {
                        zzlcVar.zza.zzn(zztoVar.zza, zzctVar);
                        if (zzlcVar.zza.zze(zzctVar.zzd, zzcvVar, 0L).zzo == zzlcVar.zza.zza(zztoVar.zza)) {
                            Pair pairZzl = zzcwVar.zzl(zzcvVar, zzctVar, zzcwVar.zzn(obj, zzctVar).zzd, jLongValue2);
                            obj = pairZzl.first;
                            jLongValue2 = ((Long) pairZzl.second).longValue();
                        } else {
                            jLongValue2 = jLongValue2;
                        }
                        i11 = -1;
                        obj = obj;
                        z11 = false;
                        z12 = false;
                        z13 = true;
                    } else {
                        i11 = -1;
                        z11 = false;
                        z12 = false;
                        z13 = false;
                    }
                    if (i11 != i10) {
                        Pair pairZzl2 = zzcwVar.zzl(zzcvVar, zzctVar, i11, -9223372036854775807L);
                        obj = pairZzl2.first;
                        jLongValue = ((Long) pairZzl2.second).longValue();
                        jLongValue2 = -9223372036854775807L;
                    } else {
                        jLongValue = jLongValue2;
                    }
                    zztoVarZzh = zzkpVar.zzh(zzcwVar, obj, jLongValue);
                    i12 = zztoVarZzh.zze;
                    if (i12 != i10 || ((i13 = zztoVar.zze) != i10 && i12 >= i13)) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (zztoVar.zza.equals(obj) || zztoVar.zzb() || zztoVarZzh.zzb() || !z15) {
                        z16 = false;
                    } else {
                        z16 = true;
                    }
                    zzctVarZzn = zzcwVar.zzn(obj, zzctVar);
                    if (!zZzag && jLongValue2 == jLongValue2 && zztoVar.zza.equals(zztoVarZzh.zza)) {
                        if (zztoVar.zzb()) {
                            zzctVarZzn.zzn(zztoVar.zzb);
                        }
                        if (zztoVarZzh.zzb()) {
                            zzctVarZzn.zzn(zztoVarZzh.zzb);
                        }
                    }
                    if (true == z16) {
                        zztoVarZzh = zztoVar;
                    }
                    if (zztoVarZzh.zzb()) {
                        if (zztoVarZzh.equals(zztoVar)) {
                            jLongValue = zzlcVar.zzr;
                        } else {
                            zzcwVar.zzn(zztoVarZzh.zza, zzctVar);
                            if (zztoVarZzh.zzc == zzctVar.zze(zztoVarZzh.zzb)) {
                                zzctVar.zzj();
                            }
                            jLongValue = 0;
                        }
                    }
                    zzkhVar = this;
                    j10 = jLongValue2;
                    jZzv = jLongValue;
                    z17 = z11;
                    z18 = z13;
                    zztoVarZzj = zztoVarZzh;
                    boolean z25 = z12;
                    z19 = true;
                    z24 = z25;
                }
                i11 = iZzg;
                z11 = false;
                z12 = false;
                z13 = false;
                if (i11 != i10) {
                    Pair pairZzl3 = zzcwVar.zzl(zzcvVar, zzctVar, i11, -9223372036854775807L);
                    obj = pairZzl3.first;
                    jLongValue = ((Long) pairZzl3.second).longValue();
                    jLongValue2 = -9223372036854775807L;
                } else {
                    jLongValue = jLongValue2;
                }
                zztoVarZzh = zzkpVar.zzh(zzcwVar, obj, jLongValue);
                i12 = zztoVarZzh.zze;
                if (i12 != i10) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                if (zztoVar.zza.equals(obj)) {
                    z16 = false;
                } else {
                    z16 = false;
                }
                zzctVarZzn = zzcwVar.zzn(obj, zzctVar);
                if (!zZzag) {
                    if (zztoVar.zzb()) {
                        zzctVarZzn.zzn(zztoVar.zzb);
                    }
                    if (zztoVarZzh.zzb()) {
                        zzctVarZzn.zzn(zztoVarZzh.zzb);
                    }
                }
                if (true == z16) {
                    zztoVarZzh = zztoVar;
                }
                if (zztoVarZzh.zzb()) {
                    if (zztoVarZzh.equals(zztoVar)) {
                        jLongValue = zzlcVar.zzr;
                    } else {
                        zzcwVar.zzn(zztoVarZzh.zza, zzctVar);
                        if (zztoVarZzh.zzc == zzctVar.zze(zztoVarZzh.zzb)) {
                            zzctVar.zzj();
                        }
                        jLongValue = 0;
                    }
                }
                zzkhVar = this;
                j10 = jLongValue2;
                jZzv = jLongValue;
                z17 = z11;
                z18 = z13;
                zztoVarZzj = zztoVarZzh;
                boolean z26 = z12;
                z19 = true;
                z24 = z26;
            }
            Object obj2 = obj;
            z12 = z14;
            obj = obj2;
            if (i11 != i10) {
                Pair pairZzl4 = zzcwVar.zzl(zzcvVar, zzctVar, i11, -9223372036854775807L);
                obj = pairZzl4.first;
                jLongValue = ((Long) pairZzl4.second).longValue();
                jLongValue2 = -9223372036854775807L;
            } else {
                jLongValue = jLongValue2;
            }
            zztoVarZzh = zzkpVar.zzh(zzcwVar, obj, jLongValue);
            i12 = zztoVarZzh.zze;
            if (i12 != i10) {
                z15 = true;
            } else {
                z15 = true;
            }
            if (zztoVar.zza.equals(obj)) {
                z16 = false;
            } else {
                z16 = false;
            }
            zzctVarZzn = zzcwVar.zzn(obj, zzctVar);
            if (!zZzag) {
                if (zztoVar.zzb()) {
                    zzctVarZzn.zzn(zztoVar.zzb);
                }
                if (zztoVarZzh.zzb()) {
                    zzctVarZzn.zzn(zztoVarZzh.zzb);
                }
            }
            if (true == z16) {
                zztoVarZzh = zztoVar;
            }
            if (zztoVarZzh.zzb()) {
                if (zztoVarZzh.equals(zztoVar)) {
                    jLongValue = zzlcVar.zzr;
                } else {
                    zzcwVar.zzn(zztoVarZzh.zza, zzctVar);
                    if (zztoVarZzh.zzc == zzctVar.zze(zztoVarZzh.zzb)) {
                        zzctVar.zzj();
                    }
                    jLongValue = 0;
                }
            }
            zzkhVar = this;
            j10 = jLongValue2;
            jZzv = jLongValue;
            z17 = z11;
            z18 = z13;
            zztoVarZzj = zztoVarZzh;
            boolean z27 = z12;
            z19 = true;
            z24 = z27;
        }
        boolean z28 = (zzkhVar.zzu.zzb.equals(zztoVarZzj) && jZzv == zzkhVar.zzu.zzr) ? false : z19;
        if (z24) {
            try {
                if (zzkhVar.zzu.zze != z19) {
                    i14 = 4;
                    try {
                        zzkhVar.zzU(4);
                    } catch (Throwable th) {
                        th = th;
                        i10 = 4;
                        zzlc zzlcVar2 = zzkhVar.zzu;
                        zzab(zzcwVar, zztoVarZzj, zzlcVar2.zza, zzlcVar2.zzb, true == z18 ? jZzv : -9223372036854775807L, false);
                        if (z28) {
                            zzlc zzlcVar3 = zzkhVar.zzu;
                            Object obj3 = zzlcVar3.zzb.zza;
                            zzcw zzcwVar2 = zzlcVar3.zza;
                            if (z28) {
                            }
                            zzkhVar.zzu = zzz(zztoVarZzj, jZzv, j10, zzkhVar.zzu.zzd, (z28 || !z10 || zzcwVar2.zzo() || zzcwVar2.zzn(obj3, zzkhVar.zzl).zzg) ? false : true, zzcwVar.zza(obj3) == -1 ? i10 : 3);
                        } else {
                            zzlc zzlcVar4 = zzkhVar.zzu;
                            Object obj4 = zzlcVar4.zzb.zza;
                            zzcw zzcwVar3 = zzlcVar4.zza;
                            if (z28) {
                            }
                            zzkhVar.zzu = zzz(zztoVarZzj, jZzv, j10, zzkhVar.zzu.zzd, (z28 || !z10 || zzcwVar3.zzo() || zzcwVar3.zzn(obj4, zzkhVar.zzl).zzg) ? false : true, zzcwVar.zza(obj4) == -1 ? i10 : 3);
                        }
                        zzN();
                        zzkhVar.zzP(zzcwVar, zzkhVar.zzu.zza);
                        zzkhVar.zzu = zzkhVar.zzu.zzh(zzcwVar);
                        if (!zzcwVar.zzo()) {
                            zzkhVar.zzH = null;
                        }
                        zzkhVar.zzE(false);
                        throw th;
                    }
                } else {
                    i14 = 4;
                }
                i15 = 0;
                try {
                    zzkhVar.zzM(false, false, false, z19);
                } catch (Throwable th2) {
                    th = th2;
                    i10 = i14;
                    zzlc zzlcVar5 = zzkhVar.zzu;
                    zzab(zzcwVar, zztoVarZzj, zzlcVar5.zza, zzlcVar5.zzb, true == z18 ? jZzv : -9223372036854775807L, false);
                    if (z28 || j10 != zzkhVar.zzu.zzc) {
                        zzlc zzlcVar6 = zzkhVar.zzu;
                        Object obj5 = zzlcVar6.zzb.zza;
                        zzcw zzcwVar4 = zzlcVar6.zza;
                        zzkhVar.zzu = zzz(zztoVarZzj, jZzv, j10, zzkhVar.zzu.zzd, (z28 || !z10 || zzcwVar4.zzo() || zzcwVar4.zzn(obj5, zzkhVar.zzl).zzg) ? false : true, zzcwVar.zza(obj5) == -1 ? i10 : 3);
                    }
                    zzN();
                    zzkhVar.zzP(zzcwVar, zzkhVar.zzu.zza);
                    zzkhVar.zzu = zzkhVar.zzu.zzh(zzcwVar);
                    if (!zzcwVar.zzo()) {
                        zzkhVar.zzH = null;
                    }
                    zzkhVar.zzE(false);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                i10 = 4;
            }
        } else {
            i14 = 4;
            i15 = 0;
        }
        try {
            if (z28) {
                i16 = i14;
                if (!zzcwVar.zzo()) {
                    for (zzkm zzkmVarZzd = zzkhVar.zzq.zzd(); zzkmVarZzd != null; zzkmVarZzd = zzkmVarZzd.zzg()) {
                        if (zzkmVarZzd.zzf.zza.equals(zztoVarZzj)) {
                            zzkmVarZzd.zzf = zzkhVar.zzq.zzg(zzcwVar, zzkmVarZzd.zzf);
                            zzkmVarZzd.zzq();
                        }
                    }
                    jZzv = zzkhVar.zzv(zztoVarZzj, jZzv, z17);
                }
            } else {
                zzkp zzkpVar3 = zzkhVar.zzq;
                long j11 = zzkhVar.zzI;
                zzkm zzkmVarZze = zzkpVar3.zze();
                if (zzkmVarZze == null) {
                    jMax = 0;
                } else {
                    long jZze = zzkmVarZze.zze();
                    if (zzkmVarZze.zzd) {
                        int i18 = i15;
                        jMax = jZze;
                        while (true) {
                            zzli[] zzliVarArr = zzkhVar.zza;
                            int length = zzliVarArr.length;
                            if (i18 >= 2) {
                                break;
                            }
                            if (zzae(zzliVarArr[i18]) && zzkhVar.zza[i18].zzm() == zzkmVarZze.zzc[i18]) {
                                long jZzf = zzkhVar.zza[i18].zzf();
                                if (jZzf == Long.MIN_VALUE) {
                                    jMax = Long.MIN_VALUE;
                                    break;
                                }
                                jMax = Math.max(jZzf, jMax);
                            }
                            i18++;
                        }
                    } else {
                        jMax = jZze;
                    }
                }
                i16 = 4;
                if (!zzkpVar3.zzo(zzcwVar, j11, jMax)) {
                    zzkhVar.zzR(false);
                }
            }
            zzlc zzlcVar7 = zzkhVar.zzu;
            zzab(zzcwVar, zztoVarZzj, zzlcVar7.zza, zzlcVar7.zzb, z19 != z18 ? -9223372036854775807L : jZzv, false);
            if (z28 || j10 != zzkhVar.zzu.zzc) {
                zzlc zzlcVar8 = zzkhVar.zzu;
                Object obj6 = zzlcVar8.zzb.zza;
                zzcw zzcwVar5 = zzlcVar8.zza;
                zzkhVar.zzu = zzz(zztoVarZzj, jZzv, j10, zzkhVar.zzu.zzd, z28 && z10 && !zzcwVar5.zzo() && !zzcwVar5.zzn(obj6, zzkhVar.zzl).zzg, zzcwVar.zza(obj6) == -1 ? i16 : 3);
            }
            zzN();
            zzkhVar.zzP(zzcwVar, zzkhVar.zzu.zza);
            zzkhVar.zzu = zzkhVar.zzu.zzh(zzcwVar);
            if (!zzcwVar.zzo()) {
                zzkhVar.zzH = null;
            }
            zzkhVar.zzE(false);
        } catch (Throwable th4) {
            th = th4;
            zzlc zzlcVar9 = zzkhVar.zzu;
            zzab(zzcwVar, zztoVarZzj, zzlcVar9.zza, zzlcVar9.zzb, true == z18 ? jZzv : -9223372036854775807L, false);
            if (z28) {
                zzlc zzlcVar10 = zzkhVar.zzu;
                Object obj7 = zzlcVar10.zzb.zza;
                zzcw zzcwVar6 = zzlcVar10.zza;
                if (z28) {
                }
                zzkhVar.zzu = zzz(zztoVarZzj, jZzv, j10, zzkhVar.zzu.zzd, (z28 || !z10 || zzcwVar6.zzo() || zzcwVar6.zzn(obj7, zzkhVar.zzl).zzg) ? false : true, zzcwVar.zza(obj7) == -1 ? i10 : 3);
            } else {
                zzlc zzlcVar11 = zzkhVar.zzu;
                Object obj8 = zzlcVar11.zzb.zza;
                zzcw zzcwVar7 = zzlcVar11.zza;
                if (z28) {
                }
                zzkhVar.zzu = zzz(zztoVarZzj, jZzv, j10, zzkhVar.zzu.zzd, (z28 || !z10 || zzcwVar7.zzo() || zzcwVar7.zzn(obj8, zzkhVar.zzl).zzg) ? false : true, zzcwVar.zza(obj8) == -1 ? i10 : 3);
            }
            zzN();
            zzkhVar.zzP(zzcwVar, zzkhVar.zzu.zza);
            zzkhVar.zzu = zzkhVar.zzu.zzh(zzcwVar);
            if (!zzcwVar.zzo()) {
                zzkhVar.zzH = null;
            }
            zzkhVar.zzE(false);
            throw th;
        }
    }

    private final void zzG(zzch zzchVar, boolean z10) throws zzih {
        zzH(zzchVar, zzchVar.zzc, true, z10);
    }

    private final void zzH(zzch zzchVar, float f10, boolean z10, boolean z11) throws zzih {
        int i10;
        zzkh zzkhVar = this;
        if (z10) {
            if (z11) {
                zzkhVar.zzv.zza(1);
            }
            zzlc zzlcVar = zzkhVar.zzu;
            zzkhVar = this;
            zzkhVar.zzu = new zzlc(zzlcVar.zza, zzlcVar.zzb, zzlcVar.zzc, zzlcVar.zzd, zzlcVar.zze, zzlcVar.zzf, zzlcVar.zzg, zzlcVar.zzh, zzlcVar.zzi, zzlcVar.zzj, zzlcVar.zzk, zzlcVar.zzl, zzlcVar.zzm, zzchVar, zzlcVar.zzp, zzlcVar.zzq, zzlcVar.zzr, zzlcVar.zzs, zzlcVar.zzo);
        }
        float f11 = zzchVar.zzc;
        zzkm zzkmVarZzd = zzkhVar.zzq.zzd();
        while (true) {
            i10 = 0;
            if (zzkmVarZzd == null) {
                break;
            }
            zzxa[] zzxaVarArr = zzkmVarZzd.zzi().zzc;
            int length = zzxaVarArr.length;
            while (i10 < length) {
                zzxa zzxaVar = zzxaVarArr[i10];
                i10++;
            }
            zzkmVarZzd = zzkmVarZzd.zzg();
        }
        zzli[] zzliVarArr = zzkhVar.zza;
        int length2 = zzliVarArr.length;
        while (i10 < 2) {
            zzli zzliVar = zzliVarArr[i10];
            if (zzliVar != null) {
                zzliVar.zzG(f10, zzchVar.zzc);
            }
            i10++;
        }
    }

    private final void zzI() {
        long jZze;
        long jZze2;
        boolean zZzg = false;
        if (zzad()) {
            zzkm zzkmVarZzc = this.zzq.zzc();
            long jZzu = zzu(zzkmVarZzc.zzd());
            if (zzkmVarZzc == this.zzq.zzd()) {
                jZze = this.zzI;
                jZze2 = zzkmVarZzc.zze();
            } else {
                jZze = this.zzI - zzkmVarZzc.zze();
                jZze2 = zzkmVarZzc.zzf.zzb;
            }
            long j10 = jZze - jZze2;
            boolean zZzg2 = this.zzf.zzg(j10, jZzu, this.zzn.zzc().zzc);
            if (zZzg2 || jZzu >= 500000 || this.zzm <= 0) {
                zZzg = zZzg2;
            } else {
                this.zzq.zzd().zza.zzj(this.zzu.zzr, false);
                zZzg = this.zzf.zzg(j10, jZzu, this.zzn.zzc().zzc);
            }
        }
        this.zzA = zZzg;
        if (zZzg) {
            this.zzq.zzc().zzk(this.zzI);
        }
        zzY();
    }

    private final void zzJ() {
        this.zzv.zzc(this.zzu);
        if (this.zzv.zzg) {
            zzjc zzjcVar = this.zzN;
            zzjcVar.zza.zzU(this.zzv);
            this.zzv = new zzkf(this.zzu);
        }
    }

    private final void zzK() throws zzih {
        int i10;
        float f10 = this.zzn.zzc().zzc;
        zzkm zzkmVarZze = this.zzq.zze();
        boolean z10 = true;
        for (zzkm zzkmVarZzd = this.zzq.zzd(); zzkmVarZzd != null && zzkmVarZzd.zzd; zzkmVarZzd = zzkmVarZzd.zzg()) {
            zzxh zzxhVarZzj = zzkmVarZzd.zzj(f10, this.zzu.zza);
            zzxh zzxhVarZzi = zzkmVarZzd.zzi();
            boolean z11 = false;
            if (zzxhVarZzi != null && zzxhVarZzi.zzc.length == zzxhVarZzj.zzc.length) {
                int i11 = 0;
                while (true) {
                    if (i11 >= zzxhVarZzj.zzc.length) {
                        if (zzkmVarZzd != zzkmVarZze) {
                            z11 = true;
                        }
                        z10 &= z11;
                    } else if (zzxhVarZzj.zza(zzxhVarZzi, i11)) {
                        i11++;
                    }
                }
            }
            if (z10) {
                zzkm zzkmVarZzd2 = this.zzq.zzd();
                boolean zZzm = this.zzq.zzm(zzkmVarZzd2);
                int length = this.zza.length;
                boolean[] zArr = new boolean[2];
                long jZzb = zzkmVarZzd2.zzb(zzxhVarZzj, this.zzu.zzr, zZzm, zArr);
                zzlc zzlcVar = this.zzu;
                boolean z12 = (zzlcVar.zze == 4 || jZzb == zzlcVar.zzr) ? false : true;
                zzlc zzlcVar2 = this.zzu;
                i10 = 2;
                this.zzu = zzz(zzlcVar2.zzb, jZzb, zzlcVar2.zzc, zzlcVar2.zzd, z12, 5);
                if (z12) {
                    zzO(jZzb);
                }
                int length2 = this.zza.length;
                boolean[] zArr2 = new boolean[2];
                int i12 = 0;
                while (true) {
                    zzli[] zzliVarArr = this.zza;
                    int length3 = zzliVarArr.length;
                    if (i12 >= 2) {
                        break;
                    }
                    zzli zzliVar = zzliVarArr[i12];
                    boolean zZzae = zzae(zzliVar);
                    zArr2[i12] = zZzae;
                    zzvf zzvfVar = zzkmVarZzd2.zzc[i12];
                    if (zZzae) {
                        if (zzvfVar != zzliVar.zzm()) {
                            zzA(zzliVar);
                        } else if (zArr[i12]) {
                            zzliVar.zzD(this.zzI);
                        }
                    }
                    i12++;
                }
                zzC(zArr2);
            } else {
                i10 = 2;
                this.zzq.zzm(zzkmVarZzd);
                if (zzkmVarZzd.zzd) {
                    zzkmVarZzd.zza(zzxhVarZzj, Math.max(zzkmVarZzd.zzf.zzb, this.zzI - zzkmVarZzd.zze()), false);
                }
            }
            zzE(true);
            if (this.zzu.zze != 4) {
                zzI();
                zzaa();
                this.zzh.zzi(i10);
                return;
            }
            return;
        }
    }

    private final void zzL() throws zzih {
        zzK();
        zzR(true);
    }

    private final void zzM(boolean z10, boolean z11, boolean z12, boolean z13) {
        zzto zztoVar;
        boolean z14;
        long j10;
        long j11;
        this.zzh.zzf(2);
        this.zzL = null;
        this.zzz = false;
        this.zzn.zzi();
        this.zzI = 1000000000000L;
        zzli[] zzliVarArr = this.zza;
        int length = zzliVarArr.length;
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                zzA(zzliVarArr[i10]);
            } catch (zzih | RuntimeException e10) {
                zzer.zzd("ExoPlayerImplInternal", "Disable failed.", e10);
            }
        }
        if (z10) {
            zzli[] zzliVarArr2 = this.zza;
            int length2 = zzliVarArr2.length;
            for (int i11 = 0; i11 < 2; i11++) {
                zzli zzliVar = zzliVarArr2[i11];
                if (this.zzb.remove(zzliVar)) {
                    try {
                        zzliVar.zzC();
                    } catch (RuntimeException e11) {
                        zzer.zzd("ExoPlayerImplInternal", "Reset failed.", e11);
                    }
                }
            }
        }
        this.zzG = 0;
        zzlc zzlcVar = this.zzu;
        zzto zztoVar2 = zzlcVar.zzb;
        long j12 = zzlcVar.zzr;
        long j13 = (this.zzu.zzb.zzb() || zzag(this.zzu, this.zzl)) ? this.zzu.zzc : this.zzu.zzr;
        if (z11) {
            this.zzH = null;
            Pair pairZzx = zzx(this.zzu.zza);
            zztoVar = (zzto) pairZzx.first;
            long jLongValue = ((Long) pairZzx.second).longValue();
            z14 = !zztoVar.equals(this.zzu.zzb);
            j10 = jLongValue;
            j11 = -9223372036854775807L;
        } else {
            zztoVar = zztoVar2;
            z14 = false;
            j10 = j12;
            j11 = j13;
        }
        this.zzq.zzi();
        this.zzA = false;
        zzlc zzlcVar2 = this.zzu;
        zzcw zzcwVar = zzlcVar2.zza;
        int i12 = zzlcVar2.zze;
        zzih zzihVar = z13 ? null : zzlcVar2.zzf;
        zzvn zzvnVar = z14 ? zzvn.zza : zzlcVar2.zzh;
        zzxh zzxhVar = z14 ? this.zze : zzlcVar2.zzi;
        List listZzl = z14 ? zzfsc.zzl() : zzlcVar2.zzj;
        zzlc zzlcVar3 = this.zzu;
        this.zzu = new zzlc(zzcwVar, zztoVar, j11, j10, i12, zzihVar, false, zzvnVar, zzxhVar, listZzl, zztoVar, zzlcVar3.zzl, zzlcVar3.zzm, zzlcVar3.zzn, j10, 0L, j10, 0L, false);
        if (z12) {
            this.zzr.zzg();
        }
    }

    private final void zzN() {
        zzkm zzkmVarZzd = this.zzq.zzd();
        boolean z10 = false;
        if (zzkmVarZzd != null && zzkmVarZzd.zzf.zzh && this.zzx) {
            z10 = true;
        }
        this.zzy = z10;
    }

    private final void zzO(long j10) throws zzih {
        zzkm zzkmVarZzd = this.zzq.zzd();
        long jZze = j10 + (zzkmVarZzd == null ? 1000000000000L : zzkmVarZzd.zze());
        this.zzI = jZze;
        this.zzn.zzf(jZze);
        zzli[] zzliVarArr = this.zza;
        int length = zzliVarArr.length;
        for (int i10 = 0; i10 < 2; i10++) {
            zzli zzliVar = zzliVarArr[i10];
            if (zzae(zzliVar)) {
                zzliVar.zzD(this.zzI);
            }
        }
        for (zzkm zzkmVarZzd2 = this.zzq.zzd(); zzkmVarZzd2 != null; zzkmVarZzd2 = zzkmVarZzd2.zzg()) {
            for (zzxa zzxaVar : zzkmVarZzd2.zzi().zzc) {
            }
        }
    }

    private final void zzP(zzcw zzcwVar, zzcw zzcwVar2) {
        if (zzcwVar.zzo() && zzcwVar2.zzo()) {
            return;
        }
        int size = this.zzo.size() - 1;
        if (size < 0) {
            Collections.sort(this.zzo);
        } else {
            Object obj = ((zzke) this.zzo.get(size)).zzb;
            int i10 = zzfj.zza;
            throw null;
        }
    }

    private final void zzQ(long j10, long j11) {
        this.zzh.zzj(2, j10 + j11);
    }

    private final void zzR(boolean z10) throws zzih {
        zzto zztoVar = this.zzq.zzd().zzf.zza;
        long jZzw = zzw(zztoVar, this.zzu.zzr, true, false);
        if (jZzw != this.zzu.zzr) {
            zzlc zzlcVar = this.zzu;
            this.zzu = zzz(zztoVar, jZzw, zzlcVar.zzc, zzlcVar.zzd, z10, 5);
        }
    }

    private final void zzS(zzch zzchVar) {
        this.zzh.zzf(16);
        this.zzn.zzg(zzchVar);
    }

    private final void zzT(boolean z10, int i10, boolean z11, int i11) throws zzih {
        this.zzv.zza(z11 ? 1 : 0);
        this.zzv.zzb(i11);
        this.zzu = this.zzu.zze(z10, i10);
        this.zzz = false;
        for (zzkm zzkmVarZzd = this.zzq.zzd(); zzkmVarZzd != null; zzkmVarZzd = zzkmVarZzd.zzg()) {
            for (zzxa zzxaVar : zzkmVarZzd.zzi().zzc) {
            }
        }
        if (!zzah()) {
            zzX();
            zzaa();
            return;
        }
        int i12 = this.zzu.zze;
        if (i12 == 3) {
            zzV();
            this.zzh.zzi(2);
        } else if (i12 == 2) {
            this.zzh.zzi(2);
        }
    }

    private final void zzU(int i10) {
        zzlc zzlcVar = this.zzu;
        if (zzlcVar.zze != i10) {
            if (i10 != 2) {
                this.zzM = -9223372036854775807L;
            }
            this.zzu = zzlcVar.zzg(i10);
        }
    }

    private final void zzV() throws zzih {
        this.zzz = false;
        this.zzn.zzh();
        zzli[] zzliVarArr = this.zza;
        int length = zzliVarArr.length;
        for (int i10 = 0; i10 < 2; i10++) {
            zzli zzliVar = zzliVarArr[i10];
            if (zzae(zzliVar)) {
                zzliVar.zzH();
            }
        }
    }

    private final void zzW(boolean z10, boolean z11) {
        zzM(z10 || !this.zzD, false, true, false);
        this.zzv.zza(z11 ? 1 : 0);
        this.zzf.zzd();
        zzU(1);
    }

    private final void zzX() throws zzih {
        this.zzn.zzi();
        zzli[] zzliVarArr = this.zza;
        int length = zzliVarArr.length;
        for (int i10 = 0; i10 < 2; i10++) {
            zzli zzliVar = zzliVarArr[i10];
            if (zzae(zzliVar)) {
                zzal(zzliVar);
            }
        }
    }

    private final void zzY() {
        zzkm zzkmVarZzc = this.zzq.zzc();
        boolean z10 = this.zzA || (zzkmVarZzc != null && zzkmVarZzc.zza.zzp());
        zzlc zzlcVar = this.zzu;
        if (z10 != zzlcVar.zzg) {
            this.zzu = new zzlc(zzlcVar.zza, zzlcVar.zzb, zzlcVar.zzc, zzlcVar.zzd, zzlcVar.zze, zzlcVar.zzf, z10, zzlcVar.zzh, zzlcVar.zzi, zzlcVar.zzj, zzlcVar.zzk, zzlcVar.zzl, zzlcVar.zzm, zzlcVar.zzn, zzlcVar.zzp, zzlcVar.zzq, zzlcVar.zzr, zzlcVar.zzs, zzlcVar.zzo);
        }
    }

    private final void zzZ(zzto zztoVar, zzvn zzvnVar, zzxh zzxhVar) {
        this.zzf.zze(this.zzu.zza, zztoVar, this.zza, zzvnVar, zzxhVar.zzc);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a1 A[LOOP:0: B:29:0x0091->B:36:0x00a1, LOOP_END] */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0091, code lost:
    
        r7 = (com.google.android.gms.internal.ads.zzke) r11.zzo.get(r5 - 1);
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x009f -> B:37:0x00ac). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzaa() throws com.google.android.gms.internal.ads.zzih {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkh.zzaa():void");
    }

    private final void zzab(zzcw zzcwVar, zzto zztoVar, zzcw zzcwVar2, zzto zztoVar2, long j10, boolean z10) throws zzih {
        if (!zzai(zzcwVar, zztoVar)) {
            zzch zzchVar = zztoVar.zzb() ? zzch.zza : this.zzu.zzn;
            if (this.zzn.zzc().equals(zzchVar)) {
                return;
            }
            zzS(zzchVar);
            zzH(this.zzu.zzn, zzchVar.zzc, false, false);
            return;
        }
        zzcwVar.zze(zzcwVar.zzn(zztoVar.zza, this.zzl).zzd, this.zzk, 0L);
        zzic zzicVar = this.zzO;
        zzbf zzbfVar = this.zzk.zzk;
        int i10 = zzfj.zza;
        zzicVar.zzd(zzbfVar);
        if (j10 != -9223372036854775807L) {
            this.zzO.zze(zzs(zzcwVar, zztoVar.zza, j10));
            return;
        }
        if (!zzfj.zzC(!zzcwVar2.zzo() ? zzcwVar2.zze(zzcwVar2.zzn(zztoVar2.zza, this.zzl).zzd, this.zzk, 0L).zzc : null, this.zzk.zzc) || z10) {
            this.zzO.zze(-9223372036854775807L);
        }
    }

    private final synchronized void zzac(zzfpx zzfpxVar, long j10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j10;
        boolean z10 = false;
        while (!Boolean.valueOf(((zzjy) zzfpxVar).zza.zzw).booleanValue() && j10 > 0) {
            try {
                wait(j10);
            } catch (InterruptedException unused) {
                z10 = true;
            }
            j10 = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    private final boolean zzad() {
        zzkm zzkmVarZzc = this.zzq.zzc();
        return (zzkmVarZzc == null || zzkmVarZzc.zzd() == Long.MIN_VALUE) ? false : true;
    }

    private static boolean zzae(zzli zzliVar) {
        return zzliVar.zzbc() != 0;
    }

    private final boolean zzaf() {
        zzkm zzkmVarZzd = this.zzq.zzd();
        long j10 = zzkmVarZzd.zzf.zze;
        if (!zzkmVarZzd.zzd) {
            return false;
        }
        if (j10 == -9223372036854775807L || this.zzu.zzr < j10) {
            return true;
        }
        return !zzah();
    }

    private static boolean zzag(zzlc zzlcVar, zzct zzctVar) {
        zzto zztoVar = zzlcVar.zzb;
        zzcw zzcwVar = zzlcVar.zza;
        return zzcwVar.zzo() || zzcwVar.zzn(zztoVar.zza, zzctVar).zzg;
    }

    private final boolean zzah() {
        zzlc zzlcVar = this.zzu;
        return zzlcVar.zzl && zzlcVar.zzm == 0;
    }

    private final boolean zzai(zzcw zzcwVar, zzto zztoVar) {
        if (!zztoVar.zzb() && !zzcwVar.zzo()) {
            zzcwVar.zze(zzcwVar.zzn(zztoVar.zza, this.zzl).zzd, this.zzk, 0L);
            if (this.zzk.zzb()) {
                zzcv zzcvVar = this.zzk;
                if (zzcvVar.zzi && zzcvVar.zzf != -9223372036854775807L) {
                    return true;
                }
            }
        }
        return false;
    }

    private static zzam[] zzaj(zzxa zzxaVar) {
        int iZzc = zzxaVar != null ? zzxaVar.zzc() : 0;
        zzam[] zzamVarArr = new zzam[iZzc];
        for (int i10 = 0; i10 < iZzc; i10++) {
            zzamVarArr[i10] = zzxaVar.zzd(i10);
        }
        return zzamVarArr;
    }

    private static final void zzak(zzlf zzlfVar) throws zzih {
        zzlfVar.zzj();
        try {
            zzlfVar.zzc().zzq(zzlfVar.zza(), zzlfVar.zzg());
        } finally {
            zzlfVar.zzh(true);
        }
    }

    private static final void zzal(zzli zzliVar) {
        if (zzliVar.zzbc() == 2) {
            zzliVar.zzI();
        }
    }

    private static final void zzam(zzli zzliVar, long j10) {
        zzliVar.zzE();
        if (zzliVar instanceof zzvr) {
            throw null;
        }
    }

    public static Object zze(zzcv zzcvVar, zzct zzctVar, int i10, boolean z10, Object obj, zzcw zzcwVar, zzcw zzcwVar2) {
        int iZza = zzcwVar.zza(obj);
        int iZzb = zzcwVar.zzb();
        int iZzi = iZza;
        int iZza2 = -1;
        for (int i11 = 0; i11 < iZzb && iZza2 == -1; i11++) {
            iZzi = zzcwVar.zzi(iZzi, zzctVar, zzcvVar, i10, z10);
            if (iZzi == -1) {
                iZza2 = -1;
                break;
            }
            iZza2 = zzcwVar2.zza(zzcwVar.zzf(iZzi));
        }
        if (iZza2 == -1) {
            return null;
        }
        return zzcwVar2.zzf(iZza2);
    }

    public static final /* synthetic */ void zzr(zzlf zzlfVar) {
        try {
            zzak(zzlfVar);
        } catch (zzih e10) {
            zzer.zzd("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
            throw new RuntimeException(e10);
        }
    }

    private final long zzs(zzcw zzcwVar, Object obj, long j10) {
        zzcwVar.zze(zzcwVar.zzn(obj, this.zzl).zzd, this.zzk, 0L);
        zzcv zzcvVar = this.zzk;
        if (zzcvVar.zzf != -9223372036854775807L && zzcvVar.zzb()) {
            zzcv zzcvVar2 = this.zzk;
            if (zzcvVar2.zzi) {
                long j11 = zzcvVar2.zzg;
                return zzfj.zzo((j11 == -9223372036854775807L ? System.currentTimeMillis() : j11 + SystemClock.elapsedRealtime()) - this.zzk.zzf) - j10;
            }
        }
        return -9223372036854775807L;
    }

    private final long zzt() {
        return zzu(this.zzu.zzp);
    }

    private final long zzu(long j10) {
        zzkm zzkmVarZzc = this.zzq.zzc();
        if (zzkmVarZzc == null) {
            return 0L;
        }
        return Math.max(0L, j10 - (this.zzI - zzkmVarZzc.zze()));
    }

    private final long zzv(zzto zztoVar, long j10, boolean z10) throws zzih {
        return zzw(zztoVar, j10, this.zzq.zzd() != this.zzq.zze(), z10);
    }

    private final long zzw(zzto zztoVar, long j10, boolean z10, boolean z11) throws zzih {
        zzX();
        this.zzz = false;
        if (z11 || this.zzu.zze == 3) {
            zzU(2);
        }
        zzkm zzkmVarZzd = this.zzq.zzd();
        zzkm zzkmVarZzg = zzkmVarZzd;
        while (zzkmVarZzg != null && !zztoVar.equals(zzkmVarZzg.zzf.zza)) {
            zzkmVarZzg = zzkmVarZzg.zzg();
        }
        if (z10 || zzkmVarZzd != zzkmVarZzg || (zzkmVarZzg != null && zzkmVarZzg.zze() + j10 < 0)) {
            zzli[] zzliVarArr = this.zza;
            int length = zzliVarArr.length;
            for (int i10 = 0; i10 < 2; i10++) {
                zzA(zzliVarArr[i10]);
            }
            if (zzkmVarZzg != null) {
                while (this.zzq.zzd() != zzkmVarZzg) {
                    this.zzq.zza();
                }
                this.zzq.zzm(zzkmVarZzg);
                zzkmVarZzg.zzp(1000000000000L);
                zzB();
            }
        }
        zzkp zzkpVar = this.zzq;
        if (zzkmVarZzg != null) {
            zzkpVar.zzm(zzkmVarZzg);
            if (!zzkmVarZzg.zzd) {
                zzkmVarZzg.zzf = zzkmVarZzg.zzf.zzb(j10);
            } else if (zzkmVarZzg.zze) {
                j10 = zzkmVarZzg.zza.zze(j10);
                zzkmVarZzg.zza.zzj(j10 - this.zzm, false);
            }
            zzO(j10);
            zzI();
        } else {
            zzkpVar.zzi();
            zzO(j10);
        }
        zzE(false);
        this.zzh.zzi(2);
        return j10;
    }

    private final Pair zzx(zzcw zzcwVar) {
        long j10 = 0;
        if (zzcwVar.zzo()) {
            return Pair.create(zzlc.zzj(), 0L);
        }
        Pair pairZzl = zzcwVar.zzl(this.zzk, this.zzl, zzcwVar.zzg(this.zzC), -9223372036854775807L);
        zzto zztoVarZzh = this.zzq.zzh(zzcwVar, pairZzl.first, 0L);
        long jLongValue = ((Long) pairZzl.second).longValue();
        if (zztoVarZzh.zzb()) {
            zzcwVar.zzn(zztoVarZzh.zza, this.zzl);
            if (zztoVarZzh.zzc == this.zzl.zze(zztoVarZzh.zzb)) {
                this.zzl.zzj();
            }
        } else {
            j10 = jLongValue;
        }
        return Pair.create(zztoVarZzh, Long.valueOf(j10));
    }

    private static Pair zzy(zzcw zzcwVar, zzkg zzkgVar, boolean z10, int i10, boolean z11, zzcv zzcvVar, zzct zzctVar) {
        int i11;
        long j10;
        zzcw zzcwVar2 = zzkgVar.zza;
        if (zzcwVar.zzo()) {
            return null;
        }
        zzcw zzcwVar3 = true == zzcwVar2.zzo() ? zzcwVar : zzcwVar2;
        try {
            Pair pairZzl = zzcwVar3.zzl(zzcvVar, zzctVar, zzkgVar.zzb, zzkgVar.zzc);
            if (zzcwVar.equals(zzcwVar3)) {
                return pairZzl;
            }
            if (zzcwVar.zza(pairZzl.first) == -1) {
                Object objZze = zze(zzcvVar, zzctVar, i10, z11, pairZzl.first, zzcwVar3, zzcwVar);
                if (objZze != null) {
                    i11 = zzcwVar.zzn(objZze, zzctVar).zzd;
                    j10 = -9223372036854775807L;
                }
                return null;
            }
            if (!zzcwVar3.zzn(pairZzl.first, zzctVar).zzg || zzcwVar3.zze(zzctVar.zzd, zzcvVar, 0L).zzo != zzcwVar3.zza(pairZzl.first)) {
                return pairZzl;
            }
            i11 = zzcwVar.zzn(pairZzl.first, zzctVar).zzd;
            j10 = zzkgVar.zzc;
            return zzcwVar.zzl(zzcvVar, zzctVar, i11, j10);
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00bd  */
    private final zzlc zzz(zzto zztoVar, long j10, long j11, long j12, boolean z10, int i10) {
        List listZzl;
        zzvn zzvnVar;
        zzxh zzxhVar;
        this.zzK = (!this.zzK && j10 == this.zzu.zzr && zztoVar.equals(this.zzu.zzb)) ? false : true;
        zzN();
        zzlc zzlcVar = this.zzu;
        zzvn zzvnVarZzh = zzlcVar.zzh;
        zzxh zzxhVarZzi = zzlcVar.zzi;
        List list = zzlcVar.zzj;
        if (!this.zzr.zzi()) {
            if (zztoVar.equals(this.zzu.zzb)) {
                listZzl = list;
            } else {
                zzvnVar = zzvn.zza;
                zzxhVar = this.zze;
                listZzl = zzfsc.zzl();
            }
            if (z10) {
                this.zzv.zzd(i10);
            }
            return this.zzu.zzd(zztoVar, j10, j11, j12, zzt(), zzvnVar, zzxhVar, listZzl);
        }
        zzkm zzkmVarZzd = this.zzq.zzd();
        zzvnVarZzh = zzkmVarZzd == null ? zzvn.zza : zzkmVarZzd.zzh();
        zzxhVarZzi = zzkmVarZzd == null ? this.zze : zzkmVarZzd.zzi();
        zzxa[] zzxaVarArr = zzxhVarZzi.zzc;
        zzfrz zzfrzVar = new zzfrz();
        boolean z11 = false;
        for (zzxa zzxaVar : zzxaVarArr) {
            if (zzxaVar != null) {
                zzbz zzbzVar = zzxaVar.zzd(0).zzk;
                if (zzbzVar == null) {
                    zzfrzVar.zzf(new zzbz(-9223372036854775807L, new zzby[0]));
                } else {
                    zzfrzVar.zzf(zzbzVar);
                    z11 = true;
                }
            }
        }
        zzfsc zzfscVarZzi = z11 ? zzfrzVar.zzi() : zzfsc.zzl();
        if (zzkmVarZzd != null) {
            zzkn zzknVar = zzkmVarZzd.zzf;
            if (zzknVar.zzc != j11) {
                zzkmVarZzd.zzf = zzknVar.zza(j11);
            }
        }
        listZzl = zzfscVarZzi;
        zzvnVar = zzvnVarZzh;
        zzxhVar = zzxhVarZzi;
        if (z10) {
            this.zzv.zzd(i10);
        }
        return this.zzu.zzd(zztoVar, j10, j11, j12, zzt(), zzvnVar, zzxhVar, listZzl);
    }

    /* JADX WARN: Code duplicated, block: B:217:0x047a  */
    /* JADX WARN: Code duplicated, block: B:399:0x0792 A[Catch: RuntimeException -> 0x09d8, IOException -> 0x0a02, zzsq -> 0x0a07, zzgf -> 0x0a0c, zzcd -> 0x0a11, zzqm -> 0x0a28, zzih -> 0x0a32, TryCatch #9 {zzcd -> 0x0a11, zzgf -> 0x0a0c, zzih -> 0x0a32, zzqm -> 0x0a28, zzsq -> 0x0a07, IOException -> 0x0a02, RuntimeException -> 0x09d8, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x001b, B:12:0x0022, B:14:0x0026, B:16:0x002a, B:18:0x0030, B:19:0x0032, B:20:0x0037, B:24:0x003e, B:26:0x0047, B:28:0x0055, B:29:0x0058, B:30:0x005d, B:31:0x0068, B:32:0x0077, B:33:0x007c, B:34:0x0090, B:35:0x00a2, B:37:0x00b1, B:38:0x00b5, B:39:0x00c2, B:41:0x00d1, B:42:0x00ed, B:43:0x00fd, B:44:0x0106, B:46:0x0118, B:47:0x0124, B:48:0x0134, B:50:0x0140, B:53:0x014b, B:54:0x014f, B:55:0x015c, B:59:0x0163, B:61:0x016b, B:63:0x016f, B:65:0x0175, B:67:0x017d, B:69:0x0185, B:70:0x0188, B:72:0x018d, B:79:0x019a, B:80:0x019b, B:84:0x01a2, B:86:0x01b0, B:87:0x01b5, B:89:0x01c5, B:90:0x01ca, B:91:0x01cf, B:93:0x01db, B:94:0x01e2, B:95:0x01e7, B:97:0x01f3, B:99:0x021f, B:100:0x0240, B:101:0x0244, B:103:0x0249, B:104:0x025a, B:106:0x0266, B:107:0x0269, B:114:0x0274, B:115:0x0275, B:117:0x027b, B:118:0x0282, B:119:0x0293, B:121:0x02ba, B:187:0x03d1, B:171:0x039e, B:170:0x039a, B:196:0x03e2, B:197:0x03ef, B:122:0x02dc, B:126:0x02ef, B:128:0x02ff, B:130:0x0316, B:132:0x0320, B:198:0x03f0, B:200:0x0404, B:203:0x040e, B:205:0x041d, B:207:0x0429, B:209:0x0458, B:210:0x045d, B:211:0x0461, B:213:0x0465, B:215:0x0472, B:284:0x05ba, B:286:0x05c2, B:288:0x05ca, B:291:0x05cf, B:292:0x05db, B:294:0x05e1, B:296:0x05e9, B:299:0x05f9, B:301:0x05ff, B:302:0x0619, B:304:0x061f, B:306:0x0624, B:308:0x0629, B:310:0x062d, B:312:0x0633, B:314:0x0637, B:316:0x063f, B:318:0x0645, B:320:0x064f, B:323:0x0655, B:324:0x0658, B:326:0x0661, B:328:0x0673, B:330:0x067c, B:332:0x0684, B:337:0x068e, B:218:0x0481, B:220:0x0487, B:223:0x048d, B:226:0x0498, B:228:0x049d, B:231:0x04ab, B:233:0x04b1, B:234:0x04b9, B:235:0x04bc, B:237:0x04c4, B:239:0x04d2, B:241:0x050e, B:243:0x0518, B:246:0x0523, B:248:0x052b, B:249:0x052e, B:251:0x0532, B:253:0x0538, B:255:0x0544, B:257:0x054e, B:259:0x055f, B:261:0x0565, B:262:0x0570, B:263:0x0575, B:265:0x0580, B:268:0x0585, B:270:0x058b, B:272:0x0593, B:274:0x0599, B:276:0x059f, B:280:0x05ad, B:282:0x05b4, B:283:0x05b7, B:214:0x046f, B:339:0x06b8, B:343:0x06c3, B:345:0x06cd, B:346:0x06d2, B:348:0x06e2, B:349:0x06f7, B:351:0x06fd, B:353:0x0705, B:355:0x070c, B:359:0x0715, B:364:0x0724, B:370:0x0731, B:372:0x0737, B:382:0x074a, B:383:0x074d, B:385:0x0759, B:387:0x075f, B:391:0x076c, B:393:0x0774, B:395:0x0778, B:396:0x0783, B:398:0x0789, B:452:0x0879, B:455:0x0881, B:457:0x0886, B:459:0x088e, B:461:0x089c, B:462:0x08a3, B:463:0x08a7, B:465:0x08ad, B:467:0x08b6, B:469:0x08bc, B:471:0x08c7, B:472:0x08cb, B:479:0x08ea, B:481:0x08f0, B:485:0x08f9, B:487:0x08fd, B:492:0x0906, B:494:0x090c, B:496:0x096c, B:498:0x0971, B:507:0x0982, B:509:0x0986, B:510:0x098e, B:511:0x0995, B:473:0x08ce, B:476:0x08dc, B:477:0x08e3, B:399:0x0792, B:434:0x0834, B:436:0x083a, B:438:0x083e, B:442:0x0847, B:444:0x0855, B:446:0x085d, B:448:0x0867, B:449:0x086c, B:450:0x0871, B:451:0x0876, B:402:0x079c, B:404:0x07a0, B:431:0x0824, B:433:0x0830, B:408:0x07ab, B:410:0x07af, B:412:0x07c3, B:414:0x07d1, B:416:0x07dd, B:420:0x07e6, B:422:0x07f0, B:428:0x07fb, B:384:0x0752, B:512:0x099a, B:516:0x09a1, B:517:0x09a9, B:521:0x09c7), top: B:592:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:401:0x0799  */
    /* JADX WARN: Code duplicated, block: B:402:0x079c A[Catch: RuntimeException -> 0x09d8, IOException -> 0x0a02, zzsq -> 0x0a07, zzgf -> 0x0a0c, zzcd -> 0x0a11, zzqm -> 0x0a28, zzih -> 0x0a32, TryCatch #9 {zzcd -> 0x0a11, zzgf -> 0x0a0c, zzih -> 0x0a32, zzqm -> 0x0a28, zzsq -> 0x0a07, IOException -> 0x0a02, RuntimeException -> 0x09d8, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x001b, B:12:0x0022, B:14:0x0026, B:16:0x002a, B:18:0x0030, B:19:0x0032, B:20:0x0037, B:24:0x003e, B:26:0x0047, B:28:0x0055, B:29:0x0058, B:30:0x005d, B:31:0x0068, B:32:0x0077, B:33:0x007c, B:34:0x0090, B:35:0x00a2, B:37:0x00b1, B:38:0x00b5, B:39:0x00c2, B:41:0x00d1, B:42:0x00ed, B:43:0x00fd, B:44:0x0106, B:46:0x0118, B:47:0x0124, B:48:0x0134, B:50:0x0140, B:53:0x014b, B:54:0x014f, B:55:0x015c, B:59:0x0163, B:61:0x016b, B:63:0x016f, B:65:0x0175, B:67:0x017d, B:69:0x0185, B:70:0x0188, B:72:0x018d, B:79:0x019a, B:80:0x019b, B:84:0x01a2, B:86:0x01b0, B:87:0x01b5, B:89:0x01c5, B:90:0x01ca, B:91:0x01cf, B:93:0x01db, B:94:0x01e2, B:95:0x01e7, B:97:0x01f3, B:99:0x021f, B:100:0x0240, B:101:0x0244, B:103:0x0249, B:104:0x025a, B:106:0x0266, B:107:0x0269, B:114:0x0274, B:115:0x0275, B:117:0x027b, B:118:0x0282, B:119:0x0293, B:121:0x02ba, B:187:0x03d1, B:171:0x039e, B:170:0x039a, B:196:0x03e2, B:197:0x03ef, B:122:0x02dc, B:126:0x02ef, B:128:0x02ff, B:130:0x0316, B:132:0x0320, B:198:0x03f0, B:200:0x0404, B:203:0x040e, B:205:0x041d, B:207:0x0429, B:209:0x0458, B:210:0x045d, B:211:0x0461, B:213:0x0465, B:215:0x0472, B:284:0x05ba, B:286:0x05c2, B:288:0x05ca, B:291:0x05cf, B:292:0x05db, B:294:0x05e1, B:296:0x05e9, B:299:0x05f9, B:301:0x05ff, B:302:0x0619, B:304:0x061f, B:306:0x0624, B:308:0x0629, B:310:0x062d, B:312:0x0633, B:314:0x0637, B:316:0x063f, B:318:0x0645, B:320:0x064f, B:323:0x0655, B:324:0x0658, B:326:0x0661, B:328:0x0673, B:330:0x067c, B:332:0x0684, B:337:0x068e, B:218:0x0481, B:220:0x0487, B:223:0x048d, B:226:0x0498, B:228:0x049d, B:231:0x04ab, B:233:0x04b1, B:234:0x04b9, B:235:0x04bc, B:237:0x04c4, B:239:0x04d2, B:241:0x050e, B:243:0x0518, B:246:0x0523, B:248:0x052b, B:249:0x052e, B:251:0x0532, B:253:0x0538, B:255:0x0544, B:257:0x054e, B:259:0x055f, B:261:0x0565, B:262:0x0570, B:263:0x0575, B:265:0x0580, B:268:0x0585, B:270:0x058b, B:272:0x0593, B:274:0x0599, B:276:0x059f, B:280:0x05ad, B:282:0x05b4, B:283:0x05b7, B:214:0x046f, B:339:0x06b8, B:343:0x06c3, B:345:0x06cd, B:346:0x06d2, B:348:0x06e2, B:349:0x06f7, B:351:0x06fd, B:353:0x0705, B:355:0x070c, B:359:0x0715, B:364:0x0724, B:370:0x0731, B:372:0x0737, B:382:0x074a, B:383:0x074d, B:385:0x0759, B:387:0x075f, B:391:0x076c, B:393:0x0774, B:395:0x0778, B:396:0x0783, B:398:0x0789, B:452:0x0879, B:455:0x0881, B:457:0x0886, B:459:0x088e, B:461:0x089c, B:462:0x08a3, B:463:0x08a7, B:465:0x08ad, B:467:0x08b6, B:469:0x08bc, B:471:0x08c7, B:472:0x08cb, B:479:0x08ea, B:481:0x08f0, B:485:0x08f9, B:487:0x08fd, B:492:0x0906, B:494:0x090c, B:496:0x096c, B:498:0x0971, B:507:0x0982, B:509:0x0986, B:510:0x098e, B:511:0x0995, B:473:0x08ce, B:476:0x08dc, B:477:0x08e3, B:399:0x0792, B:434:0x0834, B:436:0x083a, B:438:0x083e, B:442:0x0847, B:444:0x0855, B:446:0x085d, B:448:0x0867, B:449:0x086c, B:450:0x0871, B:451:0x0876, B:402:0x079c, B:404:0x07a0, B:431:0x0824, B:433:0x0830, B:408:0x07ab, B:410:0x07af, B:412:0x07c3, B:414:0x07d1, B:416:0x07dd, B:420:0x07e6, B:422:0x07f0, B:428:0x07fb, B:384:0x0752, B:512:0x099a, B:516:0x09a1, B:517:0x09a9, B:521:0x09c7), top: B:592:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:404:0x07a0 A[Catch: RuntimeException -> 0x09d8, IOException -> 0x0a02, zzsq -> 0x0a07, zzgf -> 0x0a0c, zzcd -> 0x0a11, zzqm -> 0x0a28, zzih -> 0x0a32, TryCatch #9 {zzcd -> 0x0a11, zzgf -> 0x0a0c, zzih -> 0x0a32, zzqm -> 0x0a28, zzsq -> 0x0a07, IOException -> 0x0a02, RuntimeException -> 0x09d8, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x001b, B:12:0x0022, B:14:0x0026, B:16:0x002a, B:18:0x0030, B:19:0x0032, B:20:0x0037, B:24:0x003e, B:26:0x0047, B:28:0x0055, B:29:0x0058, B:30:0x005d, B:31:0x0068, B:32:0x0077, B:33:0x007c, B:34:0x0090, B:35:0x00a2, B:37:0x00b1, B:38:0x00b5, B:39:0x00c2, B:41:0x00d1, B:42:0x00ed, B:43:0x00fd, B:44:0x0106, B:46:0x0118, B:47:0x0124, B:48:0x0134, B:50:0x0140, B:53:0x014b, B:54:0x014f, B:55:0x015c, B:59:0x0163, B:61:0x016b, B:63:0x016f, B:65:0x0175, B:67:0x017d, B:69:0x0185, B:70:0x0188, B:72:0x018d, B:79:0x019a, B:80:0x019b, B:84:0x01a2, B:86:0x01b0, B:87:0x01b5, B:89:0x01c5, B:90:0x01ca, B:91:0x01cf, B:93:0x01db, B:94:0x01e2, B:95:0x01e7, B:97:0x01f3, B:99:0x021f, B:100:0x0240, B:101:0x0244, B:103:0x0249, B:104:0x025a, B:106:0x0266, B:107:0x0269, B:114:0x0274, B:115:0x0275, B:117:0x027b, B:118:0x0282, B:119:0x0293, B:121:0x02ba, B:187:0x03d1, B:171:0x039e, B:170:0x039a, B:196:0x03e2, B:197:0x03ef, B:122:0x02dc, B:126:0x02ef, B:128:0x02ff, B:130:0x0316, B:132:0x0320, B:198:0x03f0, B:200:0x0404, B:203:0x040e, B:205:0x041d, B:207:0x0429, B:209:0x0458, B:210:0x045d, B:211:0x0461, B:213:0x0465, B:215:0x0472, B:284:0x05ba, B:286:0x05c2, B:288:0x05ca, B:291:0x05cf, B:292:0x05db, B:294:0x05e1, B:296:0x05e9, B:299:0x05f9, B:301:0x05ff, B:302:0x0619, B:304:0x061f, B:306:0x0624, B:308:0x0629, B:310:0x062d, B:312:0x0633, B:314:0x0637, B:316:0x063f, B:318:0x0645, B:320:0x064f, B:323:0x0655, B:324:0x0658, B:326:0x0661, B:328:0x0673, B:330:0x067c, B:332:0x0684, B:337:0x068e, B:218:0x0481, B:220:0x0487, B:223:0x048d, B:226:0x0498, B:228:0x049d, B:231:0x04ab, B:233:0x04b1, B:234:0x04b9, B:235:0x04bc, B:237:0x04c4, B:239:0x04d2, B:241:0x050e, B:243:0x0518, B:246:0x0523, B:248:0x052b, B:249:0x052e, B:251:0x0532, B:253:0x0538, B:255:0x0544, B:257:0x054e, B:259:0x055f, B:261:0x0565, B:262:0x0570, B:263:0x0575, B:265:0x0580, B:268:0x0585, B:270:0x058b, B:272:0x0593, B:274:0x0599, B:276:0x059f, B:280:0x05ad, B:282:0x05b4, B:283:0x05b7, B:214:0x046f, B:339:0x06b8, B:343:0x06c3, B:345:0x06cd, B:346:0x06d2, B:348:0x06e2, B:349:0x06f7, B:351:0x06fd, B:353:0x0705, B:355:0x070c, B:359:0x0715, B:364:0x0724, B:370:0x0731, B:372:0x0737, B:382:0x074a, B:383:0x074d, B:385:0x0759, B:387:0x075f, B:391:0x076c, B:393:0x0774, B:395:0x0778, B:396:0x0783, B:398:0x0789, B:452:0x0879, B:455:0x0881, B:457:0x0886, B:459:0x088e, B:461:0x089c, B:462:0x08a3, B:463:0x08a7, B:465:0x08ad, B:467:0x08b6, B:469:0x08bc, B:471:0x08c7, B:472:0x08cb, B:479:0x08ea, B:481:0x08f0, B:485:0x08f9, B:487:0x08fd, B:492:0x0906, B:494:0x090c, B:496:0x096c, B:498:0x0971, B:507:0x0982, B:509:0x0986, B:510:0x098e, B:511:0x0995, B:473:0x08ce, B:476:0x08dc, B:477:0x08e3, B:399:0x0792, B:434:0x0834, B:436:0x083a, B:438:0x083e, B:442:0x0847, B:444:0x0855, B:446:0x085d, B:448:0x0867, B:449:0x086c, B:450:0x0871, B:451:0x0876, B:402:0x079c, B:404:0x07a0, B:431:0x0824, B:433:0x0830, B:408:0x07ab, B:410:0x07af, B:412:0x07c3, B:414:0x07d1, B:416:0x07dd, B:420:0x07e6, B:422:0x07f0, B:428:0x07fb, B:384:0x0752, B:512:0x099a, B:516:0x09a1, B:517:0x09a9, B:521:0x09c7), top: B:592:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:406:0x07a6  */
    /* JADX WARN: Code duplicated, block: B:407:0x07a9  */
    /* JADX WARN: Code duplicated, block: B:408:0x07ab A[Catch: RuntimeException -> 0x09d8, IOException -> 0x0a02, zzsq -> 0x0a07, zzgf -> 0x0a0c, zzcd -> 0x0a11, zzqm -> 0x0a28, zzih -> 0x0a32, TryCatch #9 {zzcd -> 0x0a11, zzgf -> 0x0a0c, zzih -> 0x0a32, zzqm -> 0x0a28, zzsq -> 0x0a07, IOException -> 0x0a02, RuntimeException -> 0x09d8, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x001b, B:12:0x0022, B:14:0x0026, B:16:0x002a, B:18:0x0030, B:19:0x0032, B:20:0x0037, B:24:0x003e, B:26:0x0047, B:28:0x0055, B:29:0x0058, B:30:0x005d, B:31:0x0068, B:32:0x0077, B:33:0x007c, B:34:0x0090, B:35:0x00a2, B:37:0x00b1, B:38:0x00b5, B:39:0x00c2, B:41:0x00d1, B:42:0x00ed, B:43:0x00fd, B:44:0x0106, B:46:0x0118, B:47:0x0124, B:48:0x0134, B:50:0x0140, B:53:0x014b, B:54:0x014f, B:55:0x015c, B:59:0x0163, B:61:0x016b, B:63:0x016f, B:65:0x0175, B:67:0x017d, B:69:0x0185, B:70:0x0188, B:72:0x018d, B:79:0x019a, B:80:0x019b, B:84:0x01a2, B:86:0x01b0, B:87:0x01b5, B:89:0x01c5, B:90:0x01ca, B:91:0x01cf, B:93:0x01db, B:94:0x01e2, B:95:0x01e7, B:97:0x01f3, B:99:0x021f, B:100:0x0240, B:101:0x0244, B:103:0x0249, B:104:0x025a, B:106:0x0266, B:107:0x0269, B:114:0x0274, B:115:0x0275, B:117:0x027b, B:118:0x0282, B:119:0x0293, B:121:0x02ba, B:187:0x03d1, B:171:0x039e, B:170:0x039a, B:196:0x03e2, B:197:0x03ef, B:122:0x02dc, B:126:0x02ef, B:128:0x02ff, B:130:0x0316, B:132:0x0320, B:198:0x03f0, B:200:0x0404, B:203:0x040e, B:205:0x041d, B:207:0x0429, B:209:0x0458, B:210:0x045d, B:211:0x0461, B:213:0x0465, B:215:0x0472, B:284:0x05ba, B:286:0x05c2, B:288:0x05ca, B:291:0x05cf, B:292:0x05db, B:294:0x05e1, B:296:0x05e9, B:299:0x05f9, B:301:0x05ff, B:302:0x0619, B:304:0x061f, B:306:0x0624, B:308:0x0629, B:310:0x062d, B:312:0x0633, B:314:0x0637, B:316:0x063f, B:318:0x0645, B:320:0x064f, B:323:0x0655, B:324:0x0658, B:326:0x0661, B:328:0x0673, B:330:0x067c, B:332:0x0684, B:337:0x068e, B:218:0x0481, B:220:0x0487, B:223:0x048d, B:226:0x0498, B:228:0x049d, B:231:0x04ab, B:233:0x04b1, B:234:0x04b9, B:235:0x04bc, B:237:0x04c4, B:239:0x04d2, B:241:0x050e, B:243:0x0518, B:246:0x0523, B:248:0x052b, B:249:0x052e, B:251:0x0532, B:253:0x0538, B:255:0x0544, B:257:0x054e, B:259:0x055f, B:261:0x0565, B:262:0x0570, B:263:0x0575, B:265:0x0580, B:268:0x0585, B:270:0x058b, B:272:0x0593, B:274:0x0599, B:276:0x059f, B:280:0x05ad, B:282:0x05b4, B:283:0x05b7, B:214:0x046f, B:339:0x06b8, B:343:0x06c3, B:345:0x06cd, B:346:0x06d2, B:348:0x06e2, B:349:0x06f7, B:351:0x06fd, B:353:0x0705, B:355:0x070c, B:359:0x0715, B:364:0x0724, B:370:0x0731, B:372:0x0737, B:382:0x074a, B:383:0x074d, B:385:0x0759, B:387:0x075f, B:391:0x076c, B:393:0x0774, B:395:0x0778, B:396:0x0783, B:398:0x0789, B:452:0x0879, B:455:0x0881, B:457:0x0886, B:459:0x088e, B:461:0x089c, B:462:0x08a3, B:463:0x08a7, B:465:0x08ad, B:467:0x08b6, B:469:0x08bc, B:471:0x08c7, B:472:0x08cb, B:479:0x08ea, B:481:0x08f0, B:485:0x08f9, B:487:0x08fd, B:492:0x0906, B:494:0x090c, B:496:0x096c, B:498:0x0971, B:507:0x0982, B:509:0x0986, B:510:0x098e, B:511:0x0995, B:473:0x08ce, B:476:0x08dc, B:477:0x08e3, B:399:0x0792, B:434:0x0834, B:436:0x083a, B:438:0x083e, B:442:0x0847, B:444:0x0855, B:446:0x085d, B:448:0x0867, B:449:0x086c, B:450:0x0871, B:451:0x0876, B:402:0x079c, B:404:0x07a0, B:431:0x0824, B:433:0x0830, B:408:0x07ab, B:410:0x07af, B:412:0x07c3, B:414:0x07d1, B:416:0x07dd, B:420:0x07e6, B:422:0x07f0, B:428:0x07fb, B:384:0x0752, B:512:0x099a, B:516:0x09a1, B:517:0x09a9, B:521:0x09c7), top: B:592:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:410:0x07af A[Catch: RuntimeException -> 0x09d8, IOException -> 0x0a02, zzsq -> 0x0a07, zzgf -> 0x0a0c, zzcd -> 0x0a11, zzqm -> 0x0a28, zzih -> 0x0a32, TryCatch #9 {zzcd -> 0x0a11, zzgf -> 0x0a0c, zzih -> 0x0a32, zzqm -> 0x0a28, zzsq -> 0x0a07, IOException -> 0x0a02, RuntimeException -> 0x09d8, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x001b, B:12:0x0022, B:14:0x0026, B:16:0x002a, B:18:0x0030, B:19:0x0032, B:20:0x0037, B:24:0x003e, B:26:0x0047, B:28:0x0055, B:29:0x0058, B:30:0x005d, B:31:0x0068, B:32:0x0077, B:33:0x007c, B:34:0x0090, B:35:0x00a2, B:37:0x00b1, B:38:0x00b5, B:39:0x00c2, B:41:0x00d1, B:42:0x00ed, B:43:0x00fd, B:44:0x0106, B:46:0x0118, B:47:0x0124, B:48:0x0134, B:50:0x0140, B:53:0x014b, B:54:0x014f, B:55:0x015c, B:59:0x0163, B:61:0x016b, B:63:0x016f, B:65:0x0175, B:67:0x017d, B:69:0x0185, B:70:0x0188, B:72:0x018d, B:79:0x019a, B:80:0x019b, B:84:0x01a2, B:86:0x01b0, B:87:0x01b5, B:89:0x01c5, B:90:0x01ca, B:91:0x01cf, B:93:0x01db, B:94:0x01e2, B:95:0x01e7, B:97:0x01f3, B:99:0x021f, B:100:0x0240, B:101:0x0244, B:103:0x0249, B:104:0x025a, B:106:0x0266, B:107:0x0269, B:114:0x0274, B:115:0x0275, B:117:0x027b, B:118:0x0282, B:119:0x0293, B:121:0x02ba, B:187:0x03d1, B:171:0x039e, B:170:0x039a, B:196:0x03e2, B:197:0x03ef, B:122:0x02dc, B:126:0x02ef, B:128:0x02ff, B:130:0x0316, B:132:0x0320, B:198:0x03f0, B:200:0x0404, B:203:0x040e, B:205:0x041d, B:207:0x0429, B:209:0x0458, B:210:0x045d, B:211:0x0461, B:213:0x0465, B:215:0x0472, B:284:0x05ba, B:286:0x05c2, B:288:0x05ca, B:291:0x05cf, B:292:0x05db, B:294:0x05e1, B:296:0x05e9, B:299:0x05f9, B:301:0x05ff, B:302:0x0619, B:304:0x061f, B:306:0x0624, B:308:0x0629, B:310:0x062d, B:312:0x0633, B:314:0x0637, B:316:0x063f, B:318:0x0645, B:320:0x064f, B:323:0x0655, B:324:0x0658, B:326:0x0661, B:328:0x0673, B:330:0x067c, B:332:0x0684, B:337:0x068e, B:218:0x0481, B:220:0x0487, B:223:0x048d, B:226:0x0498, B:228:0x049d, B:231:0x04ab, B:233:0x04b1, B:234:0x04b9, B:235:0x04bc, B:237:0x04c4, B:239:0x04d2, B:241:0x050e, B:243:0x0518, B:246:0x0523, B:248:0x052b, B:249:0x052e, B:251:0x0532, B:253:0x0538, B:255:0x0544, B:257:0x054e, B:259:0x055f, B:261:0x0565, B:262:0x0570, B:263:0x0575, B:265:0x0580, B:268:0x0585, B:270:0x058b, B:272:0x0593, B:274:0x0599, B:276:0x059f, B:280:0x05ad, B:282:0x05b4, B:283:0x05b7, B:214:0x046f, B:339:0x06b8, B:343:0x06c3, B:345:0x06cd, B:346:0x06d2, B:348:0x06e2, B:349:0x06f7, B:351:0x06fd, B:353:0x0705, B:355:0x070c, B:359:0x0715, B:364:0x0724, B:370:0x0731, B:372:0x0737, B:382:0x074a, B:383:0x074d, B:385:0x0759, B:387:0x075f, B:391:0x076c, B:393:0x0774, B:395:0x0778, B:396:0x0783, B:398:0x0789, B:452:0x0879, B:455:0x0881, B:457:0x0886, B:459:0x088e, B:461:0x089c, B:462:0x08a3, B:463:0x08a7, B:465:0x08ad, B:467:0x08b6, B:469:0x08bc, B:471:0x08c7, B:472:0x08cb, B:479:0x08ea, B:481:0x08f0, B:485:0x08f9, B:487:0x08fd, B:492:0x0906, B:494:0x090c, B:496:0x096c, B:498:0x0971, B:507:0x0982, B:509:0x0986, B:510:0x098e, B:511:0x0995, B:473:0x08ce, B:476:0x08dc, B:477:0x08e3, B:399:0x0792, B:434:0x0834, B:436:0x083a, B:438:0x083e, B:442:0x0847, B:444:0x0855, B:446:0x085d, B:448:0x0867, B:449:0x086c, B:450:0x0871, B:451:0x0876, B:402:0x079c, B:404:0x07a0, B:431:0x0824, B:433:0x0830, B:408:0x07ab, B:410:0x07af, B:412:0x07c3, B:414:0x07d1, B:416:0x07dd, B:420:0x07e6, B:422:0x07f0, B:428:0x07fb, B:384:0x0752, B:512:0x099a, B:516:0x09a1, B:517:0x09a9, B:521:0x09c7), top: B:592:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:412:0x07c3 A[Catch: RuntimeException -> 0x09d8, IOException -> 0x0a02, zzsq -> 0x0a07, zzgf -> 0x0a0c, zzcd -> 0x0a11, zzqm -> 0x0a28, zzih -> 0x0a32, TryCatch #9 {zzcd -> 0x0a11, zzgf -> 0x0a0c, zzih -> 0x0a32, zzqm -> 0x0a28, zzsq -> 0x0a07, IOException -> 0x0a02, RuntimeException -> 0x09d8, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x001b, B:12:0x0022, B:14:0x0026, B:16:0x002a, B:18:0x0030, B:19:0x0032, B:20:0x0037, B:24:0x003e, B:26:0x0047, B:28:0x0055, B:29:0x0058, B:30:0x005d, B:31:0x0068, B:32:0x0077, B:33:0x007c, B:34:0x0090, B:35:0x00a2, B:37:0x00b1, B:38:0x00b5, B:39:0x00c2, B:41:0x00d1, B:42:0x00ed, B:43:0x00fd, B:44:0x0106, B:46:0x0118, B:47:0x0124, B:48:0x0134, B:50:0x0140, B:53:0x014b, B:54:0x014f, B:55:0x015c, B:59:0x0163, B:61:0x016b, B:63:0x016f, B:65:0x0175, B:67:0x017d, B:69:0x0185, B:70:0x0188, B:72:0x018d, B:79:0x019a, B:80:0x019b, B:84:0x01a2, B:86:0x01b0, B:87:0x01b5, B:89:0x01c5, B:90:0x01ca, B:91:0x01cf, B:93:0x01db, B:94:0x01e2, B:95:0x01e7, B:97:0x01f3, B:99:0x021f, B:100:0x0240, B:101:0x0244, B:103:0x0249, B:104:0x025a, B:106:0x0266, B:107:0x0269, B:114:0x0274, B:115:0x0275, B:117:0x027b, B:118:0x0282, B:119:0x0293, B:121:0x02ba, B:187:0x03d1, B:171:0x039e, B:170:0x039a, B:196:0x03e2, B:197:0x03ef, B:122:0x02dc, B:126:0x02ef, B:128:0x02ff, B:130:0x0316, B:132:0x0320, B:198:0x03f0, B:200:0x0404, B:203:0x040e, B:205:0x041d, B:207:0x0429, B:209:0x0458, B:210:0x045d, B:211:0x0461, B:213:0x0465, B:215:0x0472, B:284:0x05ba, B:286:0x05c2, B:288:0x05ca, B:291:0x05cf, B:292:0x05db, B:294:0x05e1, B:296:0x05e9, B:299:0x05f9, B:301:0x05ff, B:302:0x0619, B:304:0x061f, B:306:0x0624, B:308:0x0629, B:310:0x062d, B:312:0x0633, B:314:0x0637, B:316:0x063f, B:318:0x0645, B:320:0x064f, B:323:0x0655, B:324:0x0658, B:326:0x0661, B:328:0x0673, B:330:0x067c, B:332:0x0684, B:337:0x068e, B:218:0x0481, B:220:0x0487, B:223:0x048d, B:226:0x0498, B:228:0x049d, B:231:0x04ab, B:233:0x04b1, B:234:0x04b9, B:235:0x04bc, B:237:0x04c4, B:239:0x04d2, B:241:0x050e, B:243:0x0518, B:246:0x0523, B:248:0x052b, B:249:0x052e, B:251:0x0532, B:253:0x0538, B:255:0x0544, B:257:0x054e, B:259:0x055f, B:261:0x0565, B:262:0x0570, B:263:0x0575, B:265:0x0580, B:268:0x0585, B:270:0x058b, B:272:0x0593, B:274:0x0599, B:276:0x059f, B:280:0x05ad, B:282:0x05b4, B:283:0x05b7, B:214:0x046f, B:339:0x06b8, B:343:0x06c3, B:345:0x06cd, B:346:0x06d2, B:348:0x06e2, B:349:0x06f7, B:351:0x06fd, B:353:0x0705, B:355:0x070c, B:359:0x0715, B:364:0x0724, B:370:0x0731, B:372:0x0737, B:382:0x074a, B:383:0x074d, B:385:0x0759, B:387:0x075f, B:391:0x076c, B:393:0x0774, B:395:0x0778, B:396:0x0783, B:398:0x0789, B:452:0x0879, B:455:0x0881, B:457:0x0886, B:459:0x088e, B:461:0x089c, B:462:0x08a3, B:463:0x08a7, B:465:0x08ad, B:467:0x08b6, B:469:0x08bc, B:471:0x08c7, B:472:0x08cb, B:479:0x08ea, B:481:0x08f0, B:485:0x08f9, B:487:0x08fd, B:492:0x0906, B:494:0x090c, B:496:0x096c, B:498:0x0971, B:507:0x0982, B:509:0x0986, B:510:0x098e, B:511:0x0995, B:473:0x08ce, B:476:0x08dc, B:477:0x08e3, B:399:0x0792, B:434:0x0834, B:436:0x083a, B:438:0x083e, B:442:0x0847, B:444:0x0855, B:446:0x085d, B:448:0x0867, B:449:0x086c, B:450:0x0871, B:451:0x0876, B:402:0x079c, B:404:0x07a0, B:431:0x0824, B:433:0x0830, B:408:0x07ab, B:410:0x07af, B:412:0x07c3, B:414:0x07d1, B:416:0x07dd, B:420:0x07e6, B:422:0x07f0, B:428:0x07fb, B:384:0x0752, B:512:0x099a, B:516:0x09a1, B:517:0x09a9, B:521:0x09c7), top: B:592:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:413:0x07cc  */
    /* JADX WARN: Code duplicated, block: B:419:0x07e5  */
    /* JADX WARN: Code duplicated, block: B:425:0x07f6  */
    /* JADX WARN: Code duplicated, block: B:433:0x0830 A[Catch: RuntimeException -> 0x09d8, IOException -> 0x0a02, zzsq -> 0x0a07, zzgf -> 0x0a0c, zzcd -> 0x0a11, zzqm -> 0x0a28, zzih -> 0x0a32, TryCatch #9 {zzcd -> 0x0a11, zzgf -> 0x0a0c, zzih -> 0x0a32, zzqm -> 0x0a28, zzsq -> 0x0a07, IOException -> 0x0a02, RuntimeException -> 0x09d8, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x001b, B:12:0x0022, B:14:0x0026, B:16:0x002a, B:18:0x0030, B:19:0x0032, B:20:0x0037, B:24:0x003e, B:26:0x0047, B:28:0x0055, B:29:0x0058, B:30:0x005d, B:31:0x0068, B:32:0x0077, B:33:0x007c, B:34:0x0090, B:35:0x00a2, B:37:0x00b1, B:38:0x00b5, B:39:0x00c2, B:41:0x00d1, B:42:0x00ed, B:43:0x00fd, B:44:0x0106, B:46:0x0118, B:47:0x0124, B:48:0x0134, B:50:0x0140, B:53:0x014b, B:54:0x014f, B:55:0x015c, B:59:0x0163, B:61:0x016b, B:63:0x016f, B:65:0x0175, B:67:0x017d, B:69:0x0185, B:70:0x0188, B:72:0x018d, B:79:0x019a, B:80:0x019b, B:84:0x01a2, B:86:0x01b0, B:87:0x01b5, B:89:0x01c5, B:90:0x01ca, B:91:0x01cf, B:93:0x01db, B:94:0x01e2, B:95:0x01e7, B:97:0x01f3, B:99:0x021f, B:100:0x0240, B:101:0x0244, B:103:0x0249, B:104:0x025a, B:106:0x0266, B:107:0x0269, B:114:0x0274, B:115:0x0275, B:117:0x027b, B:118:0x0282, B:119:0x0293, B:121:0x02ba, B:187:0x03d1, B:171:0x039e, B:170:0x039a, B:196:0x03e2, B:197:0x03ef, B:122:0x02dc, B:126:0x02ef, B:128:0x02ff, B:130:0x0316, B:132:0x0320, B:198:0x03f0, B:200:0x0404, B:203:0x040e, B:205:0x041d, B:207:0x0429, B:209:0x0458, B:210:0x045d, B:211:0x0461, B:213:0x0465, B:215:0x0472, B:284:0x05ba, B:286:0x05c2, B:288:0x05ca, B:291:0x05cf, B:292:0x05db, B:294:0x05e1, B:296:0x05e9, B:299:0x05f9, B:301:0x05ff, B:302:0x0619, B:304:0x061f, B:306:0x0624, B:308:0x0629, B:310:0x062d, B:312:0x0633, B:314:0x0637, B:316:0x063f, B:318:0x0645, B:320:0x064f, B:323:0x0655, B:324:0x0658, B:326:0x0661, B:328:0x0673, B:330:0x067c, B:332:0x0684, B:337:0x068e, B:218:0x0481, B:220:0x0487, B:223:0x048d, B:226:0x0498, B:228:0x049d, B:231:0x04ab, B:233:0x04b1, B:234:0x04b9, B:235:0x04bc, B:237:0x04c4, B:239:0x04d2, B:241:0x050e, B:243:0x0518, B:246:0x0523, B:248:0x052b, B:249:0x052e, B:251:0x0532, B:253:0x0538, B:255:0x0544, B:257:0x054e, B:259:0x055f, B:261:0x0565, B:262:0x0570, B:263:0x0575, B:265:0x0580, B:268:0x0585, B:270:0x058b, B:272:0x0593, B:274:0x0599, B:276:0x059f, B:280:0x05ad, B:282:0x05b4, B:283:0x05b7, B:214:0x046f, B:339:0x06b8, B:343:0x06c3, B:345:0x06cd, B:346:0x06d2, B:348:0x06e2, B:349:0x06f7, B:351:0x06fd, B:353:0x0705, B:355:0x070c, B:359:0x0715, B:364:0x0724, B:370:0x0731, B:372:0x0737, B:382:0x074a, B:383:0x074d, B:385:0x0759, B:387:0x075f, B:391:0x076c, B:393:0x0774, B:395:0x0778, B:396:0x0783, B:398:0x0789, B:452:0x0879, B:455:0x0881, B:457:0x0886, B:459:0x088e, B:461:0x089c, B:462:0x08a3, B:463:0x08a7, B:465:0x08ad, B:467:0x08b6, B:469:0x08bc, B:471:0x08c7, B:472:0x08cb, B:479:0x08ea, B:481:0x08f0, B:485:0x08f9, B:487:0x08fd, B:492:0x0906, B:494:0x090c, B:496:0x096c, B:498:0x0971, B:507:0x0982, B:509:0x0986, B:510:0x098e, B:511:0x0995, B:473:0x08ce, B:476:0x08dc, B:477:0x08e3, B:399:0x0792, B:434:0x0834, B:436:0x083a, B:438:0x083e, B:442:0x0847, B:444:0x0855, B:446:0x085d, B:448:0x0867, B:449:0x086c, B:450:0x0871, B:451:0x0876, B:402:0x079c, B:404:0x07a0, B:431:0x0824, B:433:0x0830, B:408:0x07ab, B:410:0x07af, B:412:0x07c3, B:414:0x07d1, B:416:0x07dd, B:420:0x07e6, B:422:0x07f0, B:428:0x07fb, B:384:0x0752, B:512:0x099a, B:516:0x09a1, B:517:0x09a9, B:521:0x09c7), top: B:592:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:436:0x083a A[Catch: RuntimeException -> 0x09d8, IOException -> 0x0a02, zzsq -> 0x0a07, zzgf -> 0x0a0c, zzcd -> 0x0a11, zzqm -> 0x0a28, zzih -> 0x0a32, TryCatch #9 {zzcd -> 0x0a11, zzgf -> 0x0a0c, zzih -> 0x0a32, zzqm -> 0x0a28, zzsq -> 0x0a07, IOException -> 0x0a02, RuntimeException -> 0x09d8, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x001b, B:12:0x0022, B:14:0x0026, B:16:0x002a, B:18:0x0030, B:19:0x0032, B:20:0x0037, B:24:0x003e, B:26:0x0047, B:28:0x0055, B:29:0x0058, B:30:0x005d, B:31:0x0068, B:32:0x0077, B:33:0x007c, B:34:0x0090, B:35:0x00a2, B:37:0x00b1, B:38:0x00b5, B:39:0x00c2, B:41:0x00d1, B:42:0x00ed, B:43:0x00fd, B:44:0x0106, B:46:0x0118, B:47:0x0124, B:48:0x0134, B:50:0x0140, B:53:0x014b, B:54:0x014f, B:55:0x015c, B:59:0x0163, B:61:0x016b, B:63:0x016f, B:65:0x0175, B:67:0x017d, B:69:0x0185, B:70:0x0188, B:72:0x018d, B:79:0x019a, B:80:0x019b, B:84:0x01a2, B:86:0x01b0, B:87:0x01b5, B:89:0x01c5, B:90:0x01ca, B:91:0x01cf, B:93:0x01db, B:94:0x01e2, B:95:0x01e7, B:97:0x01f3, B:99:0x021f, B:100:0x0240, B:101:0x0244, B:103:0x0249, B:104:0x025a, B:106:0x0266, B:107:0x0269, B:114:0x0274, B:115:0x0275, B:117:0x027b, B:118:0x0282, B:119:0x0293, B:121:0x02ba, B:187:0x03d1, B:171:0x039e, B:170:0x039a, B:196:0x03e2, B:197:0x03ef, B:122:0x02dc, B:126:0x02ef, B:128:0x02ff, B:130:0x0316, B:132:0x0320, B:198:0x03f0, B:200:0x0404, B:203:0x040e, B:205:0x041d, B:207:0x0429, B:209:0x0458, B:210:0x045d, B:211:0x0461, B:213:0x0465, B:215:0x0472, B:284:0x05ba, B:286:0x05c2, B:288:0x05ca, B:291:0x05cf, B:292:0x05db, B:294:0x05e1, B:296:0x05e9, B:299:0x05f9, B:301:0x05ff, B:302:0x0619, B:304:0x061f, B:306:0x0624, B:308:0x0629, B:310:0x062d, B:312:0x0633, B:314:0x0637, B:316:0x063f, B:318:0x0645, B:320:0x064f, B:323:0x0655, B:324:0x0658, B:326:0x0661, B:328:0x0673, B:330:0x067c, B:332:0x0684, B:337:0x068e, B:218:0x0481, B:220:0x0487, B:223:0x048d, B:226:0x0498, B:228:0x049d, B:231:0x04ab, B:233:0x04b1, B:234:0x04b9, B:235:0x04bc, B:237:0x04c4, B:239:0x04d2, B:241:0x050e, B:243:0x0518, B:246:0x0523, B:248:0x052b, B:249:0x052e, B:251:0x0532, B:253:0x0538, B:255:0x0544, B:257:0x054e, B:259:0x055f, B:261:0x0565, B:262:0x0570, B:263:0x0575, B:265:0x0580, B:268:0x0585, B:270:0x058b, B:272:0x0593, B:274:0x0599, B:276:0x059f, B:280:0x05ad, B:282:0x05b4, B:283:0x05b7, B:214:0x046f, B:339:0x06b8, B:343:0x06c3, B:345:0x06cd, B:346:0x06d2, B:348:0x06e2, B:349:0x06f7, B:351:0x06fd, B:353:0x0705, B:355:0x070c, B:359:0x0715, B:364:0x0724, B:370:0x0731, B:372:0x0737, B:382:0x074a, B:383:0x074d, B:385:0x0759, B:387:0x075f, B:391:0x076c, B:393:0x0774, B:395:0x0778, B:396:0x0783, B:398:0x0789, B:452:0x0879, B:455:0x0881, B:457:0x0886, B:459:0x088e, B:461:0x089c, B:462:0x08a3, B:463:0x08a7, B:465:0x08ad, B:467:0x08b6, B:469:0x08bc, B:471:0x08c7, B:472:0x08cb, B:479:0x08ea, B:481:0x08f0, B:485:0x08f9, B:487:0x08fd, B:492:0x0906, B:494:0x090c, B:496:0x096c, B:498:0x0971, B:507:0x0982, B:509:0x0986, B:510:0x098e, B:511:0x0995, B:473:0x08ce, B:476:0x08dc, B:477:0x08e3, B:399:0x0792, B:434:0x0834, B:436:0x083a, B:438:0x083e, B:442:0x0847, B:444:0x0855, B:446:0x085d, B:448:0x0867, B:449:0x086c, B:450:0x0871, B:451:0x0876, B:402:0x079c, B:404:0x07a0, B:431:0x0824, B:433:0x0830, B:408:0x07ab, B:410:0x07af, B:412:0x07c3, B:414:0x07d1, B:416:0x07dd, B:420:0x07e6, B:422:0x07f0, B:428:0x07fb, B:384:0x0752, B:512:0x099a, B:516:0x09a1, B:517:0x09a9, B:521:0x09c7), top: B:592:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:438:0x083e A[Catch: RuntimeException -> 0x09d8, IOException -> 0x0a02, zzsq -> 0x0a07, zzgf -> 0x0a0c, zzcd -> 0x0a11, zzqm -> 0x0a28, zzih -> 0x0a32, TryCatch #9 {zzcd -> 0x0a11, zzgf -> 0x0a0c, zzih -> 0x0a32, zzqm -> 0x0a28, zzsq -> 0x0a07, IOException -> 0x0a02, RuntimeException -> 0x09d8, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x001b, B:12:0x0022, B:14:0x0026, B:16:0x002a, B:18:0x0030, B:19:0x0032, B:20:0x0037, B:24:0x003e, B:26:0x0047, B:28:0x0055, B:29:0x0058, B:30:0x005d, B:31:0x0068, B:32:0x0077, B:33:0x007c, B:34:0x0090, B:35:0x00a2, B:37:0x00b1, B:38:0x00b5, B:39:0x00c2, B:41:0x00d1, B:42:0x00ed, B:43:0x00fd, B:44:0x0106, B:46:0x0118, B:47:0x0124, B:48:0x0134, B:50:0x0140, B:53:0x014b, B:54:0x014f, B:55:0x015c, B:59:0x0163, B:61:0x016b, B:63:0x016f, B:65:0x0175, B:67:0x017d, B:69:0x0185, B:70:0x0188, B:72:0x018d, B:79:0x019a, B:80:0x019b, B:84:0x01a2, B:86:0x01b0, B:87:0x01b5, B:89:0x01c5, B:90:0x01ca, B:91:0x01cf, B:93:0x01db, B:94:0x01e2, B:95:0x01e7, B:97:0x01f3, B:99:0x021f, B:100:0x0240, B:101:0x0244, B:103:0x0249, B:104:0x025a, B:106:0x0266, B:107:0x0269, B:114:0x0274, B:115:0x0275, B:117:0x027b, B:118:0x0282, B:119:0x0293, B:121:0x02ba, B:187:0x03d1, B:171:0x039e, B:170:0x039a, B:196:0x03e2, B:197:0x03ef, B:122:0x02dc, B:126:0x02ef, B:128:0x02ff, B:130:0x0316, B:132:0x0320, B:198:0x03f0, B:200:0x0404, B:203:0x040e, B:205:0x041d, B:207:0x0429, B:209:0x0458, B:210:0x045d, B:211:0x0461, B:213:0x0465, B:215:0x0472, B:284:0x05ba, B:286:0x05c2, B:288:0x05ca, B:291:0x05cf, B:292:0x05db, B:294:0x05e1, B:296:0x05e9, B:299:0x05f9, B:301:0x05ff, B:302:0x0619, B:304:0x061f, B:306:0x0624, B:308:0x0629, B:310:0x062d, B:312:0x0633, B:314:0x0637, B:316:0x063f, B:318:0x0645, B:320:0x064f, B:323:0x0655, B:324:0x0658, B:326:0x0661, B:328:0x0673, B:330:0x067c, B:332:0x0684, B:337:0x068e, B:218:0x0481, B:220:0x0487, B:223:0x048d, B:226:0x0498, B:228:0x049d, B:231:0x04ab, B:233:0x04b1, B:234:0x04b9, B:235:0x04bc, B:237:0x04c4, B:239:0x04d2, B:241:0x050e, B:243:0x0518, B:246:0x0523, B:248:0x052b, B:249:0x052e, B:251:0x0532, B:253:0x0538, B:255:0x0544, B:257:0x054e, B:259:0x055f, B:261:0x0565, B:262:0x0570, B:263:0x0575, B:265:0x0580, B:268:0x0585, B:270:0x058b, B:272:0x0593, B:274:0x0599, B:276:0x059f, B:280:0x05ad, B:282:0x05b4, B:283:0x05b7, B:214:0x046f, B:339:0x06b8, B:343:0x06c3, B:345:0x06cd, B:346:0x06d2, B:348:0x06e2, B:349:0x06f7, B:351:0x06fd, B:353:0x0705, B:355:0x070c, B:359:0x0715, B:364:0x0724, B:370:0x0731, B:372:0x0737, B:382:0x074a, B:383:0x074d, B:385:0x0759, B:387:0x075f, B:391:0x076c, B:393:0x0774, B:395:0x0778, B:396:0x0783, B:398:0x0789, B:452:0x0879, B:455:0x0881, B:457:0x0886, B:459:0x088e, B:461:0x089c, B:462:0x08a3, B:463:0x08a7, B:465:0x08ad, B:467:0x08b6, B:469:0x08bc, B:471:0x08c7, B:472:0x08cb, B:479:0x08ea, B:481:0x08f0, B:485:0x08f9, B:487:0x08fd, B:492:0x0906, B:494:0x090c, B:496:0x096c, B:498:0x0971, B:507:0x0982, B:509:0x0986, B:510:0x098e, B:511:0x0995, B:473:0x08ce, B:476:0x08dc, B:477:0x08e3, B:399:0x0792, B:434:0x0834, B:436:0x083a, B:438:0x083e, B:442:0x0847, B:444:0x0855, B:446:0x085d, B:448:0x0867, B:449:0x086c, B:450:0x0871, B:451:0x0876, B:402:0x079c, B:404:0x07a0, B:431:0x0824, B:433:0x0830, B:408:0x07ab, B:410:0x07af, B:412:0x07c3, B:414:0x07d1, B:416:0x07dd, B:420:0x07e6, B:422:0x07f0, B:428:0x07fb, B:384:0x0752, B:512:0x099a, B:516:0x09a1, B:517:0x09a9, B:521:0x09c7), top: B:592:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:440:0x0844  */
    /* JADX WARN: Code duplicated, block: B:441:0x0845 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:442:0x0847 A[Catch: RuntimeException -> 0x09d8, IOException -> 0x0a02, zzsq -> 0x0a07, zzgf -> 0x0a0c, zzcd -> 0x0a11, zzqm -> 0x0a28, zzih -> 0x0a32, TryCatch #9 {zzcd -> 0x0a11, zzgf -> 0x0a0c, zzih -> 0x0a32, zzqm -> 0x0a28, zzsq -> 0x0a07, IOException -> 0x0a02, RuntimeException -> 0x09d8, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x001b, B:12:0x0022, B:14:0x0026, B:16:0x002a, B:18:0x0030, B:19:0x0032, B:20:0x0037, B:24:0x003e, B:26:0x0047, B:28:0x0055, B:29:0x0058, B:30:0x005d, B:31:0x0068, B:32:0x0077, B:33:0x007c, B:34:0x0090, B:35:0x00a2, B:37:0x00b1, B:38:0x00b5, B:39:0x00c2, B:41:0x00d1, B:42:0x00ed, B:43:0x00fd, B:44:0x0106, B:46:0x0118, B:47:0x0124, B:48:0x0134, B:50:0x0140, B:53:0x014b, B:54:0x014f, B:55:0x015c, B:59:0x0163, B:61:0x016b, B:63:0x016f, B:65:0x0175, B:67:0x017d, B:69:0x0185, B:70:0x0188, B:72:0x018d, B:79:0x019a, B:80:0x019b, B:84:0x01a2, B:86:0x01b0, B:87:0x01b5, B:89:0x01c5, B:90:0x01ca, B:91:0x01cf, B:93:0x01db, B:94:0x01e2, B:95:0x01e7, B:97:0x01f3, B:99:0x021f, B:100:0x0240, B:101:0x0244, B:103:0x0249, B:104:0x025a, B:106:0x0266, B:107:0x0269, B:114:0x0274, B:115:0x0275, B:117:0x027b, B:118:0x0282, B:119:0x0293, B:121:0x02ba, B:187:0x03d1, B:171:0x039e, B:170:0x039a, B:196:0x03e2, B:197:0x03ef, B:122:0x02dc, B:126:0x02ef, B:128:0x02ff, B:130:0x0316, B:132:0x0320, B:198:0x03f0, B:200:0x0404, B:203:0x040e, B:205:0x041d, B:207:0x0429, B:209:0x0458, B:210:0x045d, B:211:0x0461, B:213:0x0465, B:215:0x0472, B:284:0x05ba, B:286:0x05c2, B:288:0x05ca, B:291:0x05cf, B:292:0x05db, B:294:0x05e1, B:296:0x05e9, B:299:0x05f9, B:301:0x05ff, B:302:0x0619, B:304:0x061f, B:306:0x0624, B:308:0x0629, B:310:0x062d, B:312:0x0633, B:314:0x0637, B:316:0x063f, B:318:0x0645, B:320:0x064f, B:323:0x0655, B:324:0x0658, B:326:0x0661, B:328:0x0673, B:330:0x067c, B:332:0x0684, B:337:0x068e, B:218:0x0481, B:220:0x0487, B:223:0x048d, B:226:0x0498, B:228:0x049d, B:231:0x04ab, B:233:0x04b1, B:234:0x04b9, B:235:0x04bc, B:237:0x04c4, B:239:0x04d2, B:241:0x050e, B:243:0x0518, B:246:0x0523, B:248:0x052b, B:249:0x052e, B:251:0x0532, B:253:0x0538, B:255:0x0544, B:257:0x054e, B:259:0x055f, B:261:0x0565, B:262:0x0570, B:263:0x0575, B:265:0x0580, B:268:0x0585, B:270:0x058b, B:272:0x0593, B:274:0x0599, B:276:0x059f, B:280:0x05ad, B:282:0x05b4, B:283:0x05b7, B:214:0x046f, B:339:0x06b8, B:343:0x06c3, B:345:0x06cd, B:346:0x06d2, B:348:0x06e2, B:349:0x06f7, B:351:0x06fd, B:353:0x0705, B:355:0x070c, B:359:0x0715, B:364:0x0724, B:370:0x0731, B:372:0x0737, B:382:0x074a, B:383:0x074d, B:385:0x0759, B:387:0x075f, B:391:0x076c, B:393:0x0774, B:395:0x0778, B:396:0x0783, B:398:0x0789, B:452:0x0879, B:455:0x0881, B:457:0x0886, B:459:0x088e, B:461:0x089c, B:462:0x08a3, B:463:0x08a7, B:465:0x08ad, B:467:0x08b6, B:469:0x08bc, B:471:0x08c7, B:472:0x08cb, B:479:0x08ea, B:481:0x08f0, B:485:0x08f9, B:487:0x08fd, B:492:0x0906, B:494:0x090c, B:496:0x096c, B:498:0x0971, B:507:0x0982, B:509:0x0986, B:510:0x098e, B:511:0x0995, B:473:0x08ce, B:476:0x08dc, B:477:0x08e3, B:399:0x0792, B:434:0x0834, B:436:0x083a, B:438:0x083e, B:442:0x0847, B:444:0x0855, B:446:0x085d, B:448:0x0867, B:449:0x086c, B:450:0x0871, B:451:0x0876, B:402:0x079c, B:404:0x07a0, B:431:0x0824, B:433:0x0830, B:408:0x07ab, B:410:0x07af, B:412:0x07c3, B:414:0x07d1, B:416:0x07dd, B:420:0x07e6, B:422:0x07f0, B:428:0x07fb, B:384:0x0752, B:512:0x099a, B:516:0x09a1, B:517:0x09a9, B:521:0x09c7), top: B:592:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:444:0x0855 A[Catch: RuntimeException -> 0x09d8, IOException -> 0x0a02, zzsq -> 0x0a07, zzgf -> 0x0a0c, zzcd -> 0x0a11, zzqm -> 0x0a28, zzih -> 0x0a32, TryCatch #9 {zzcd -> 0x0a11, zzgf -> 0x0a0c, zzih -> 0x0a32, zzqm -> 0x0a28, zzsq -> 0x0a07, IOException -> 0x0a02, RuntimeException -> 0x09d8, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x001b, B:12:0x0022, B:14:0x0026, B:16:0x002a, B:18:0x0030, B:19:0x0032, B:20:0x0037, B:24:0x003e, B:26:0x0047, B:28:0x0055, B:29:0x0058, B:30:0x005d, B:31:0x0068, B:32:0x0077, B:33:0x007c, B:34:0x0090, B:35:0x00a2, B:37:0x00b1, B:38:0x00b5, B:39:0x00c2, B:41:0x00d1, B:42:0x00ed, B:43:0x00fd, B:44:0x0106, B:46:0x0118, B:47:0x0124, B:48:0x0134, B:50:0x0140, B:53:0x014b, B:54:0x014f, B:55:0x015c, B:59:0x0163, B:61:0x016b, B:63:0x016f, B:65:0x0175, B:67:0x017d, B:69:0x0185, B:70:0x0188, B:72:0x018d, B:79:0x019a, B:80:0x019b, B:84:0x01a2, B:86:0x01b0, B:87:0x01b5, B:89:0x01c5, B:90:0x01ca, B:91:0x01cf, B:93:0x01db, B:94:0x01e2, B:95:0x01e7, B:97:0x01f3, B:99:0x021f, B:100:0x0240, B:101:0x0244, B:103:0x0249, B:104:0x025a, B:106:0x0266, B:107:0x0269, B:114:0x0274, B:115:0x0275, B:117:0x027b, B:118:0x0282, B:119:0x0293, B:121:0x02ba, B:187:0x03d1, B:171:0x039e, B:170:0x039a, B:196:0x03e2, B:197:0x03ef, B:122:0x02dc, B:126:0x02ef, B:128:0x02ff, B:130:0x0316, B:132:0x0320, B:198:0x03f0, B:200:0x0404, B:203:0x040e, B:205:0x041d, B:207:0x0429, B:209:0x0458, B:210:0x045d, B:211:0x0461, B:213:0x0465, B:215:0x0472, B:284:0x05ba, B:286:0x05c2, B:288:0x05ca, B:291:0x05cf, B:292:0x05db, B:294:0x05e1, B:296:0x05e9, B:299:0x05f9, B:301:0x05ff, B:302:0x0619, B:304:0x061f, B:306:0x0624, B:308:0x0629, B:310:0x062d, B:312:0x0633, B:314:0x0637, B:316:0x063f, B:318:0x0645, B:320:0x064f, B:323:0x0655, B:324:0x0658, B:326:0x0661, B:328:0x0673, B:330:0x067c, B:332:0x0684, B:337:0x068e, B:218:0x0481, B:220:0x0487, B:223:0x048d, B:226:0x0498, B:228:0x049d, B:231:0x04ab, B:233:0x04b1, B:234:0x04b9, B:235:0x04bc, B:237:0x04c4, B:239:0x04d2, B:241:0x050e, B:243:0x0518, B:246:0x0523, B:248:0x052b, B:249:0x052e, B:251:0x0532, B:253:0x0538, B:255:0x0544, B:257:0x054e, B:259:0x055f, B:261:0x0565, B:262:0x0570, B:263:0x0575, B:265:0x0580, B:268:0x0585, B:270:0x058b, B:272:0x0593, B:274:0x0599, B:276:0x059f, B:280:0x05ad, B:282:0x05b4, B:283:0x05b7, B:214:0x046f, B:339:0x06b8, B:343:0x06c3, B:345:0x06cd, B:346:0x06d2, B:348:0x06e2, B:349:0x06f7, B:351:0x06fd, B:353:0x0705, B:355:0x070c, B:359:0x0715, B:364:0x0724, B:370:0x0731, B:372:0x0737, B:382:0x074a, B:383:0x074d, B:385:0x0759, B:387:0x075f, B:391:0x076c, B:393:0x0774, B:395:0x0778, B:396:0x0783, B:398:0x0789, B:452:0x0879, B:455:0x0881, B:457:0x0886, B:459:0x088e, B:461:0x089c, B:462:0x08a3, B:463:0x08a7, B:465:0x08ad, B:467:0x08b6, B:469:0x08bc, B:471:0x08c7, B:472:0x08cb, B:479:0x08ea, B:481:0x08f0, B:485:0x08f9, B:487:0x08fd, B:492:0x0906, B:494:0x090c, B:496:0x096c, B:498:0x0971, B:507:0x0982, B:509:0x0986, B:510:0x098e, B:511:0x0995, B:473:0x08ce, B:476:0x08dc, B:477:0x08e3, B:399:0x0792, B:434:0x0834, B:436:0x083a, B:438:0x083e, B:442:0x0847, B:444:0x0855, B:446:0x085d, B:448:0x0867, B:449:0x086c, B:450:0x0871, B:451:0x0876, B:402:0x079c, B:404:0x07a0, B:431:0x0824, B:433:0x0830, B:408:0x07ab, B:410:0x07af, B:412:0x07c3, B:414:0x07d1, B:416:0x07dd, B:420:0x07e6, B:422:0x07f0, B:428:0x07fb, B:384:0x0752, B:512:0x099a, B:516:0x09a1, B:517:0x09a9, B:521:0x09c7), top: B:592:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:446:0x085d A[Catch: RuntimeException -> 0x09d8, IOException -> 0x0a02, zzsq -> 0x0a07, zzgf -> 0x0a0c, zzcd -> 0x0a11, zzqm -> 0x0a28, zzih -> 0x0a32, TryCatch #9 {zzcd -> 0x0a11, zzgf -> 0x0a0c, zzih -> 0x0a32, zzqm -> 0x0a28, zzsq -> 0x0a07, IOException -> 0x0a02, RuntimeException -> 0x09d8, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x001b, B:12:0x0022, B:14:0x0026, B:16:0x002a, B:18:0x0030, B:19:0x0032, B:20:0x0037, B:24:0x003e, B:26:0x0047, B:28:0x0055, B:29:0x0058, B:30:0x005d, B:31:0x0068, B:32:0x0077, B:33:0x007c, B:34:0x0090, B:35:0x00a2, B:37:0x00b1, B:38:0x00b5, B:39:0x00c2, B:41:0x00d1, B:42:0x00ed, B:43:0x00fd, B:44:0x0106, B:46:0x0118, B:47:0x0124, B:48:0x0134, B:50:0x0140, B:53:0x014b, B:54:0x014f, B:55:0x015c, B:59:0x0163, B:61:0x016b, B:63:0x016f, B:65:0x0175, B:67:0x017d, B:69:0x0185, B:70:0x0188, B:72:0x018d, B:79:0x019a, B:80:0x019b, B:84:0x01a2, B:86:0x01b0, B:87:0x01b5, B:89:0x01c5, B:90:0x01ca, B:91:0x01cf, B:93:0x01db, B:94:0x01e2, B:95:0x01e7, B:97:0x01f3, B:99:0x021f, B:100:0x0240, B:101:0x0244, B:103:0x0249, B:104:0x025a, B:106:0x0266, B:107:0x0269, B:114:0x0274, B:115:0x0275, B:117:0x027b, B:118:0x0282, B:119:0x0293, B:121:0x02ba, B:187:0x03d1, B:171:0x039e, B:170:0x039a, B:196:0x03e2, B:197:0x03ef, B:122:0x02dc, B:126:0x02ef, B:128:0x02ff, B:130:0x0316, B:132:0x0320, B:198:0x03f0, B:200:0x0404, B:203:0x040e, B:205:0x041d, B:207:0x0429, B:209:0x0458, B:210:0x045d, B:211:0x0461, B:213:0x0465, B:215:0x0472, B:284:0x05ba, B:286:0x05c2, B:288:0x05ca, B:291:0x05cf, B:292:0x05db, B:294:0x05e1, B:296:0x05e9, B:299:0x05f9, B:301:0x05ff, B:302:0x0619, B:304:0x061f, B:306:0x0624, B:308:0x0629, B:310:0x062d, B:312:0x0633, B:314:0x0637, B:316:0x063f, B:318:0x0645, B:320:0x064f, B:323:0x0655, B:324:0x0658, B:326:0x0661, B:328:0x0673, B:330:0x067c, B:332:0x0684, B:337:0x068e, B:218:0x0481, B:220:0x0487, B:223:0x048d, B:226:0x0498, B:228:0x049d, B:231:0x04ab, B:233:0x04b1, B:234:0x04b9, B:235:0x04bc, B:237:0x04c4, B:239:0x04d2, B:241:0x050e, B:243:0x0518, B:246:0x0523, B:248:0x052b, B:249:0x052e, B:251:0x0532, B:253:0x0538, B:255:0x0544, B:257:0x054e, B:259:0x055f, B:261:0x0565, B:262:0x0570, B:263:0x0575, B:265:0x0580, B:268:0x0585, B:270:0x058b, B:272:0x0593, B:274:0x0599, B:276:0x059f, B:280:0x05ad, B:282:0x05b4, B:283:0x05b7, B:214:0x046f, B:339:0x06b8, B:343:0x06c3, B:345:0x06cd, B:346:0x06d2, B:348:0x06e2, B:349:0x06f7, B:351:0x06fd, B:353:0x0705, B:355:0x070c, B:359:0x0715, B:364:0x0724, B:370:0x0731, B:372:0x0737, B:382:0x074a, B:383:0x074d, B:385:0x0759, B:387:0x075f, B:391:0x076c, B:393:0x0774, B:395:0x0778, B:396:0x0783, B:398:0x0789, B:452:0x0879, B:455:0x0881, B:457:0x0886, B:459:0x088e, B:461:0x089c, B:462:0x08a3, B:463:0x08a7, B:465:0x08ad, B:467:0x08b6, B:469:0x08bc, B:471:0x08c7, B:472:0x08cb, B:479:0x08ea, B:481:0x08f0, B:485:0x08f9, B:487:0x08fd, B:492:0x0906, B:494:0x090c, B:496:0x096c, B:498:0x0971, B:507:0x0982, B:509:0x0986, B:510:0x098e, B:511:0x0995, B:473:0x08ce, B:476:0x08dc, B:477:0x08e3, B:399:0x0792, B:434:0x0834, B:436:0x083a, B:438:0x083e, B:442:0x0847, B:444:0x0855, B:446:0x085d, B:448:0x0867, B:449:0x086c, B:450:0x0871, B:451:0x0876, B:402:0x079c, B:404:0x07a0, B:431:0x0824, B:433:0x0830, B:408:0x07ab, B:410:0x07af, B:412:0x07c3, B:414:0x07d1, B:416:0x07dd, B:420:0x07e6, B:422:0x07f0, B:428:0x07fb, B:384:0x0752, B:512:0x099a, B:516:0x09a1, B:517:0x09a9, B:521:0x09c7), top: B:592:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:448:0x0867 A[Catch: RuntimeException -> 0x09d8, IOException -> 0x0a02, zzsq -> 0x0a07, zzgf -> 0x0a0c, zzcd -> 0x0a11, zzqm -> 0x0a28, zzih -> 0x0a32, LOOP:11: B:447:0x0865->B:448:0x0867, LOOP_END, TryCatch #9 {zzcd -> 0x0a11, zzgf -> 0x0a0c, zzih -> 0x0a32, zzqm -> 0x0a28, zzsq -> 0x0a07, IOException -> 0x0a02, RuntimeException -> 0x09d8, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x001b, B:12:0x0022, B:14:0x0026, B:16:0x002a, B:18:0x0030, B:19:0x0032, B:20:0x0037, B:24:0x003e, B:26:0x0047, B:28:0x0055, B:29:0x0058, B:30:0x005d, B:31:0x0068, B:32:0x0077, B:33:0x007c, B:34:0x0090, B:35:0x00a2, B:37:0x00b1, B:38:0x00b5, B:39:0x00c2, B:41:0x00d1, B:42:0x00ed, B:43:0x00fd, B:44:0x0106, B:46:0x0118, B:47:0x0124, B:48:0x0134, B:50:0x0140, B:53:0x014b, B:54:0x014f, B:55:0x015c, B:59:0x0163, B:61:0x016b, B:63:0x016f, B:65:0x0175, B:67:0x017d, B:69:0x0185, B:70:0x0188, B:72:0x018d, B:79:0x019a, B:80:0x019b, B:84:0x01a2, B:86:0x01b0, B:87:0x01b5, B:89:0x01c5, B:90:0x01ca, B:91:0x01cf, B:93:0x01db, B:94:0x01e2, B:95:0x01e7, B:97:0x01f3, B:99:0x021f, B:100:0x0240, B:101:0x0244, B:103:0x0249, B:104:0x025a, B:106:0x0266, B:107:0x0269, B:114:0x0274, B:115:0x0275, B:117:0x027b, B:118:0x0282, B:119:0x0293, B:121:0x02ba, B:187:0x03d1, B:171:0x039e, B:170:0x039a, B:196:0x03e2, B:197:0x03ef, B:122:0x02dc, B:126:0x02ef, B:128:0x02ff, B:130:0x0316, B:132:0x0320, B:198:0x03f0, B:200:0x0404, B:203:0x040e, B:205:0x041d, B:207:0x0429, B:209:0x0458, B:210:0x045d, B:211:0x0461, B:213:0x0465, B:215:0x0472, B:284:0x05ba, B:286:0x05c2, B:288:0x05ca, B:291:0x05cf, B:292:0x05db, B:294:0x05e1, B:296:0x05e9, B:299:0x05f9, B:301:0x05ff, B:302:0x0619, B:304:0x061f, B:306:0x0624, B:308:0x0629, B:310:0x062d, B:312:0x0633, B:314:0x0637, B:316:0x063f, B:318:0x0645, B:320:0x064f, B:323:0x0655, B:324:0x0658, B:326:0x0661, B:328:0x0673, B:330:0x067c, B:332:0x0684, B:337:0x068e, B:218:0x0481, B:220:0x0487, B:223:0x048d, B:226:0x0498, B:228:0x049d, B:231:0x04ab, B:233:0x04b1, B:234:0x04b9, B:235:0x04bc, B:237:0x04c4, B:239:0x04d2, B:241:0x050e, B:243:0x0518, B:246:0x0523, B:248:0x052b, B:249:0x052e, B:251:0x0532, B:253:0x0538, B:255:0x0544, B:257:0x054e, B:259:0x055f, B:261:0x0565, B:262:0x0570, B:263:0x0575, B:265:0x0580, B:268:0x0585, B:270:0x058b, B:272:0x0593, B:274:0x0599, B:276:0x059f, B:280:0x05ad, B:282:0x05b4, B:283:0x05b7, B:214:0x046f, B:339:0x06b8, B:343:0x06c3, B:345:0x06cd, B:346:0x06d2, B:348:0x06e2, B:349:0x06f7, B:351:0x06fd, B:353:0x0705, B:355:0x070c, B:359:0x0715, B:364:0x0724, B:370:0x0731, B:372:0x0737, B:382:0x074a, B:383:0x074d, B:385:0x0759, B:387:0x075f, B:391:0x076c, B:393:0x0774, B:395:0x0778, B:396:0x0783, B:398:0x0789, B:452:0x0879, B:455:0x0881, B:457:0x0886, B:459:0x088e, B:461:0x089c, B:462:0x08a3, B:463:0x08a7, B:465:0x08ad, B:467:0x08b6, B:469:0x08bc, B:471:0x08c7, B:472:0x08cb, B:479:0x08ea, B:481:0x08f0, B:485:0x08f9, B:487:0x08fd, B:492:0x0906, B:494:0x090c, B:496:0x096c, B:498:0x0971, B:507:0x0982, B:509:0x0986, B:510:0x098e, B:511:0x0995, B:473:0x08ce, B:476:0x08dc, B:477:0x08e3, B:399:0x0792, B:434:0x0834, B:436:0x083a, B:438:0x083e, B:442:0x0847, B:444:0x0855, B:446:0x085d, B:448:0x0867, B:449:0x086c, B:450:0x0871, B:451:0x0876, B:402:0x079c, B:404:0x07a0, B:431:0x0824, B:433:0x0830, B:408:0x07ab, B:410:0x07af, B:412:0x07c3, B:414:0x07d1, B:416:0x07dd, B:420:0x07e6, B:422:0x07f0, B:428:0x07fb, B:384:0x0752, B:512:0x099a, B:516:0x09a1, B:517:0x09a9, B:521:0x09c7), top: B:592:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:478:0x08e4  */
    /* JADX WARN: Instruction removed from duplicated block: B:446:0x085d, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v35, types: [com.google.android.gms.internal.ads.zzhg, com.google.android.gms.internal.ads.zzxo] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        IOException iOException;
        int i10;
        boolean z10;
        boolean z11;
        zzkm zzkmVarZze;
        boolean z12;
        boolean z13;
        zzlc zzlcVar;
        zzkm zzkmVarZzd;
        long jZzb;
        zzkm zzkmVarZzc;
        boolean z14;
        boolean z15;
        int i11;
        zzkm zzkmVarZzd2;
        int i12;
        long jElapsedRealtime;
        boolean z16;
        int i13;
        zzkm zzkmVarZzd3;
        zzkm zzkmVarZzg;
        byte b10;
        boolean z17;
        zzkn zzknVarZzf;
        long jLongValue;
        long j10;
        boolean z18;
        zzto zztoVar;
        zzto zztoVar2;
        Throwable th;
        Throwable th2;
        long j11;
        long jZza;
        long j12;
        zzlc zzlcVar2;
        int i14;
        zzlc zzlcVarZzz;
        zzei zzeiVar;
        zzcw zzcwVarZzm;
        try {
            switch (message.what) {
                case 0:
                    this.zzv.zza(1);
                    zzM(false, false, false, true);
                    this.zzf.zzb();
                    zzU(true != this.zzu.zza.zzo() ? 2 : 4);
                    this.zzr.zzf(this.zzg);
                    this.zzh.zzi(2);
                    z10 = true;
                    zzJ();
                    return z10;
                case 1:
                    zzT(message.arg1 != 0, message.arg2, true, 1);
                    z10 = true;
                    zzJ();
                    return z10;
                case 2:
                    int i15 = 4;
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    this.zzh.zzf(2);
                    if (!this.zzu.zza.zzo() && this.zzr.zzi()) {
                        this.zzq.zzk(this.zzI);
                        if (this.zzq.zzn() && (zzknVarZzf = this.zzq.zzf(this.zzI, this.zzu)) != null) {
                            zzkm zzkmVarZzr = this.zzq.zzr(this.zzc, this.zzd, this.zzf.zzi(), this.zzr, zzknVarZzf, this.zze);
                            zzkmVarZzr.zza.zzl(this, zzknVarZzf.zzb);
                            if (this.zzq.zzd() == zzkmVarZzr) {
                                zzO(zzknVarZzf.zzb);
                            }
                            zzE(false);
                        }
                        if (this.zzA) {
                            this.zzA = zzad();
                            zzY();
                        } else {
                            zzI();
                        }
                        zzkm zzkmVarZze2 = this.zzq.zze();
                        if (zzkmVarZze2 != null) {
                            if (zzkmVarZze2.zzg() != null && !this.zzy) {
                                zzkm zzkmVarZze3 = this.zzq.zze();
                                if (zzkmVarZze3.zzd) {
                                    int i16 = 0;
                                    while (true) {
                                        zzli[] zzliVarArr = this.zza;
                                        int length = zzliVarArr.length;
                                        if (i16 < 2) {
                                            zzli zzliVar = zzliVarArr[i16];
                                            zzvf zzvfVar = zzkmVarZze3.zzc[i16];
                                            if (zzliVar.zzm() == zzvfVar) {
                                                if (zzvfVar == null || zzliVar.zzJ()) {
                                                    i16++;
                                                } else {
                                                    zzkmVarZze3.zzg();
                                                    boolean z19 = zzkmVarZze3.zzf.zzf;
                                                }
                                            }
                                        } else if (zzkmVarZze2.zzg().zzd || this.zzI >= zzkmVarZze2.zzg().zzf()) {
                                            zzxh zzxhVarZzi = zzkmVarZze2.zzi();
                                            zzkm zzkmVarZzb = this.zzq.zzb();
                                            zzxh zzxhVarZzi2 = zzkmVarZzb.zzi();
                                            zzcw zzcwVar = this.zzu.zza;
                                            zzxh zzxhVar = zzxhVarZzi2;
                                            zzab(zzcwVar, zzkmVarZzb.zzf.zza, zzcwVar, zzkmVarZze2.zzf.zza, -9223372036854775807L, false);
                                            if (!zzkmVarZzb.zzd || zzkmVarZzb.zza.zzd() == -9223372036854775807L) {
                                                int i17 = 0;
                                                while (true) {
                                                    int length2 = this.zza.length;
                                                    if (i17 < 2) {
                                                        boolean zZzb = zzxhVarZzi.zzb(i17);
                                                        zzxh zzxhVar2 = zzxhVar;
                                                        boolean zZzb2 = zzxhVar2.zzb(i17);
                                                        if (zZzb && !this.zza[i17].zzK()) {
                                                            this.zzc[i17].zzb();
                                                            zzll zzllVar = zzxhVarZzi.zzb[i17];
                                                            zzll zzllVar2 = zzxhVar2.zzb[i17];
                                                            if (!zZzb2 || !zzllVar2.equals(zzllVar)) {
                                                                zzam(this.zza[i17], zzkmVarZzb.zzf());
                                                            }
                                                        }
                                                        i17++;
                                                        zzxhVar = zzxhVar2;
                                                    }
                                                }
                                            } else {
                                                long jZzf = zzkmVarZzb.zzf();
                                                zzli[] zzliVarArr2 = this.zza;
                                                int length3 = zzliVarArr2.length;
                                                for (int i18 = 0; i18 < 2; i18++) {
                                                    zzli zzliVar2 = zzliVarArr2[i18];
                                                    if (zzliVar2.zzm() != null) {
                                                        zzam(zzliVar2, jZzf);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (zzkmVarZze2.zzf.zzi || this.zzy) {
                                int i19 = 0;
                                while (true) {
                                    zzli[] zzliVarArr3 = this.zza;
                                    int length4 = zzliVarArr3.length;
                                    if (i19 < 2) {
                                        zzli zzliVar3 = zzliVarArr3[i19];
                                        zzvf zzvfVar2 = zzkmVarZze2.zzc[i19];
                                        if (zzvfVar2 != null && zzliVar3.zzm() == zzvfVar2 && zzliVar3.zzJ()) {
                                            long j13 = zzkmVarZze2.zzf.zze;
                                            zzam(zzliVar3, (j13 == -9223372036854775807L || j13 == Long.MIN_VALUE) ? -9223372036854775807L : zzkmVarZze2.zze() + j13);
                                        }
                                        i19++;
                                    }
                                }
                            }
                        }
                        zzkm zzkmVarZze4 = this.zzq.zze();
                        if (zzkmVarZze4 != null && this.zzq.zzd() != zzkmVarZze4 && !zzkmVarZze4.zzg) {
                            zzkm zzkmVarZze5 = this.zzq.zze();
                            zzxh zzxhVarZzi3 = zzkmVarZze5.zzi();
                            int i20 = 0;
                            boolean z20 = false;
                            while (true) {
                                zzli[] zzliVarArr4 = this.zza;
                                int length5 = zzliVarArr4.length;
                                if (i20 < 2) {
                                    zzli zzliVar4 = zzliVarArr4[i20];
                                    if (zzae(zzliVar4)) {
                                        zzvf zzvfVarZzm = zzliVar4.zzm();
                                        zzvf zzvfVar3 = zzkmVarZze5.zzc[i20];
                                        if (!zzxhVarZzi3.zzb(i20) || zzvfVarZzm != zzvfVar3) {
                                            if (!zzliVar4.zzK()) {
                                                zzliVar4.zzB(zzaj(zzxhVarZzi3.zzc[i20]), zzkmVarZze5.zzc[i20], zzkmVarZze5.zzf(), zzkmVarZze5.zze());
                                            } else if (zzliVar4.zzP()) {
                                                zzA(zzliVar4);
                                            } else {
                                                z20 = true;
                                            }
                                        }
                                    }
                                    i20++;
                                } else if (!z20) {
                                    zzB();
                                }
                            }
                        }
                        boolean z21 = false;
                        while (zzah() && !this.zzy && (zzkmVarZzd3 = this.zzq.zzd()) != null && (zzkmVarZzg = zzkmVarZzd3.zzg()) != null && this.zzI >= zzkmVarZzg.zzf() && zzkmVarZzg.zzg) {
                            if (z21) {
                                zzJ();
                            }
                            zzkm zzkmVarZza = this.zzq.zza();
                            Objects.requireNonNull(zzkmVarZza);
                            if (this.zzu.zzb.zza.equals(zzkmVarZza.zzf.zza.zza)) {
                                zzto zztoVar3 = this.zzu.zzb;
                                b10 = -1;
                                if (zztoVar3.zzb == -1) {
                                    zzto zztoVar4 = zzkmVarZza.zzf.zza;
                                    if (zztoVar4.zzb == -1 && zztoVar3.zze != zztoVar4.zze) {
                                        z17 = true;
                                    }
                                }
                                zzkn zzknVar = zzkmVarZza.zzf;
                                zzto zztoVar5 = zzknVar.zza;
                                long j14 = zzknVar.zzb;
                                this.zzu = zzz(zztoVar5, j14, zzknVar.zzc, j14, !z17, 0);
                                zzN();
                                zzaa();
                                z21 = true;
                            } else {
                                b10 = -1;
                            }
                            z17 = false;
                            zzkn zzknVar2 = zzkmVarZza.zzf;
                            zzto zztoVar6 = zzknVar2.zza;
                            long j15 = zzknVar2.zzb;
                            this.zzu = zzz(zztoVar6, j15, zzknVar2.zzc, j15, !z17, 0);
                            zzN();
                            zzaa();
                            z21 = true;
                        }
                        i15 = 4;
                    }
                    int i21 = this.zzu.zze;
                    z10 = true;
                    if (i21 != 1) {
                        if (i21 != i15) {
                            zzkm zzkmVarZzd4 = this.zzq.zzd();
                            if (zzkmVarZzd4 == null) {
                                zzQ(jUptimeMillis, 10L);
                            } else {
                                int i22 = zzfj.zza;
                                Trace.beginSection("doSomeWork");
                                zzaa();
                                if (zzkmVarZzd4.zzd) {
                                    long jElapsedRealtime2 = SystemClock.elapsedRealtime() * 1000;
                                    zzkmVarZzd4.zza.zzj(this.zzu.zzr - this.zzm, false);
                                    z12 = true;
                                    z13 = true;
                                    int i23 = 0;
                                    while (true) {
                                        zzli[] zzliVarArr5 = this.zza;
                                        int length6 = zzliVarArr5.length;
                                        if (i23 < 2) {
                                            zzli zzliVar5 = zzliVarArr5[i23];
                                            if (zzae(zzliVar5)) {
                                                zzliVar5.zzO(this.zzI, jElapsedRealtime2);
                                                z12 = z12 && zzliVar5.zzP();
                                                boolean z22 = zzkmVarZzd4.zzc[i23] != zzliVar5.zzm();
                                                boolean z23 = z22 || (!z22 && zzliVar5.zzJ()) || zzliVar5.zzQ() || zzliVar5.zzP();
                                                z13 = z13 && z23;
                                                if (!z23) {
                                                    zzliVar5.zzs();
                                                }
                                            }
                                            i23++;
                                        }
                                    }
                                } else {
                                    zzkmVarZzd4.zza.zzk();
                                    z12 = true;
                                    z13 = true;
                                }
                                long j16 = zzkmVarZzd4.zzf.zze;
                                if (z12 && zzkmVarZzd4.zzd && (j16 == -9223372036854775807L || j16 <= this.zzu.zzr)) {
                                    if (this.zzy) {
                                        this.zzy = false;
                                        zzT(false, this.zzu.zzm, false, 5);
                                    }
                                    if (zzkmVarZzd4.zzf.zzi) {
                                        zzU(i15);
                                        zzX();
                                        i11 = 3;
                                    } else {
                                        zzlcVar = this.zzu;
                                        if (zzlcVar.zze == 2) {
                                            i11 = 3;
                                            if (this.zzu.zze == 3) {
                                                if (this.zzG == 0) {
                                                    if (!zzaf()) {
                                                        this.zzz = zzah();
                                                        zzU(2);
                                                        if (this.zzz) {
                                                            for (zzkmVarZzd2 = this.zzq.zzd(); zzkmVarZzd2 != null; zzkmVarZzd2 = zzkmVarZzd2.zzg()) {
                                                                for (zzxa zzxaVar : zzkmVarZzd2.zzi().zzc) {
                                                                }
                                                            }
                                                            this.zzO.zzc();
                                                        }
                                                        zzX();
                                                    }
                                                } else if (!z13) {
                                                    this.zzz = zzah();
                                                    zzU(2);
                                                    if (this.zzz) {
                                                        while (zzkmVarZzd2 != null) {
                                                            while (i12 < r5) {
                                                            }
                                                        }
                                                        this.zzO.zzc();
                                                    }
                                                    zzX();
                                                }
                                            }
                                        } else if (this.zzG == 0) {
                                            if (z13) {
                                                if (zzlcVar.zzg) {
                                                    zzkmVarZzd = this.zzq.zzd();
                                                    if (zzai(this.zzu.zza, zzkmVarZzd.zzf.zza)) {
                                                        jZzb = this.zzO.zzb();
                                                    } else {
                                                        jZzb = -9223372036854775807L;
                                                    }
                                                    zzkmVarZzc = this.zzq.zzc();
                                                    if (zzkmVarZzc.zzr()) {
                                                        z14 = false;
                                                    } else {
                                                        z14 = false;
                                                    }
                                                    if (zzkmVarZzc.zzf.zza.zzb()) {
                                                        z15 = false;
                                                    } else {
                                                        z15 = false;
                                                    }
                                                    if (!z14) {
                                                    }
                                                }
                                                i11 = 3;
                                                zzU(3);
                                                this.zzL = null;
                                                if (zzah()) {
                                                    zzV();
                                                }
                                            }
                                            i11 = 3;
                                            if (this.zzu.zze == 3) {
                                                if (this.zzG == 0) {
                                                    if (!zzaf()) {
                                                        this.zzz = zzah();
                                                        zzU(2);
                                                        if (this.zzz) {
                                                            while (zzkmVarZzd2 != null) {
                                                                while (i12 < r5) {
                                                                }
                                                            }
                                                            this.zzO.zzc();
                                                        }
                                                        zzX();
                                                    }
                                                } else if (!z13) {
                                                    this.zzz = zzah();
                                                    zzU(2);
                                                    if (this.zzz) {
                                                        while (zzkmVarZzd2 != null) {
                                                            while (i12 < r5) {
                                                            }
                                                        }
                                                        this.zzO.zzc();
                                                    }
                                                    zzX();
                                                }
                                            }
                                        } else if (zzaf()) {
                                            i11 = 3;
                                            zzU(3);
                                            this.zzL = null;
                                            if (zzah()) {
                                                zzV();
                                            }
                                        } else {
                                            i11 = 3;
                                            if (this.zzu.zze == 3) {
                                                if (this.zzG == 0) {
                                                    if (!zzaf()) {
                                                        this.zzz = zzah();
                                                        zzU(2);
                                                        if (this.zzz) {
                                                            while (zzkmVarZzd2 != null) {
                                                                while (i12 < r5) {
                                                                }
                                                            }
                                                            this.zzO.zzc();
                                                        }
                                                        zzX();
                                                    }
                                                } else if (!z13) {
                                                    this.zzz = zzah();
                                                    zzU(2);
                                                    if (this.zzz) {
                                                        while (zzkmVarZzd2 != null) {
                                                            while (i12 < r5) {
                                                            }
                                                        }
                                                        this.zzO.zzc();
                                                    }
                                                    zzX();
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    zzlcVar = this.zzu;
                                    if (zzlcVar.zze == 2) {
                                        i11 = 3;
                                        if (this.zzu.zze == 3) {
                                            if (this.zzG == 0) {
                                                if (!zzaf()) {
                                                    this.zzz = zzah();
                                                    zzU(2);
                                                    if (this.zzz) {
                                                        while (zzkmVarZzd2 != null) {
                                                            while (i12 < r5) {
                                                            }
                                                        }
                                                        this.zzO.zzc();
                                                    }
                                                    zzX();
                                                }
                                            } else if (!z13) {
                                                this.zzz = zzah();
                                                zzU(2);
                                                if (this.zzz) {
                                                    while (zzkmVarZzd2 != null) {
                                                        while (i12 < r5) {
                                                        }
                                                    }
                                                    this.zzO.zzc();
                                                }
                                                zzX();
                                            }
                                        }
                                    } else if (this.zzG == 0) {
                                        if (z13) {
                                            if (zzlcVar.zzg) {
                                                zzkmVarZzd = this.zzq.zzd();
                                                if (zzai(this.zzu.zza, zzkmVarZzd.zzf.zza)) {
                                                    jZzb = this.zzO.zzb();
                                                } else {
                                                    jZzb = -9223372036854775807L;
                                                }
                                                zzkmVarZzc = this.zzq.zzc();
                                                if (zzkmVarZzc.zzr() || !zzkmVarZzc.zzf.zzi) {
                                                    z14 = false;
                                                } else {
                                                    z14 = true;
                                                }
                                                if (zzkmVarZzc.zzf.zza.zzb() || zzkmVarZzc.zzd) {
                                                    z15 = false;
                                                } else {
                                                    z15 = true;
                                                }
                                                if (!z14 || z15 || this.zzf.zzh(this.zzu.zza, zzkmVarZzd.zzf.zza, zzt(), this.zzn.zzc().zzc, this.zzz, jZzb)) {
                                                }
                                            }
                                            i11 = 3;
                                            zzU(3);
                                            this.zzL = null;
                                            if (zzah()) {
                                                zzV();
                                            }
                                        }
                                        i11 = 3;
                                        if (this.zzu.zze == 3) {
                                            if (this.zzG == 0) {
                                                if (!zzaf()) {
                                                    this.zzz = zzah();
                                                    zzU(2);
                                                    if (this.zzz) {
                                                        while (zzkmVarZzd2 != null) {
                                                            while (i12 < r5) {
                                                            }
                                                        }
                                                        this.zzO.zzc();
                                                    }
                                                    zzX();
                                                }
                                            } else if (!z13) {
                                                this.zzz = zzah();
                                                zzU(2);
                                                if (this.zzz) {
                                                    while (zzkmVarZzd2 != null) {
                                                        while (i12 < r5) {
                                                        }
                                                    }
                                                    this.zzO.zzc();
                                                }
                                                zzX();
                                            }
                                        }
                                    } else if (zzaf()) {
                                        i11 = 3;
                                        zzU(3);
                                        this.zzL = null;
                                        if (zzah()) {
                                            zzV();
                                        }
                                    } else {
                                        i11 = 3;
                                        if (this.zzu.zze == 3) {
                                            if (this.zzG == 0) {
                                                if (!zzaf()) {
                                                    this.zzz = zzah();
                                                    zzU(2);
                                                    if (this.zzz) {
                                                        while (zzkmVarZzd2 != null) {
                                                            while (i12 < r5) {
                                                            }
                                                        }
                                                        this.zzO.zzc();
                                                    }
                                                    zzX();
                                                }
                                            } else if (!z13) {
                                                this.zzz = zzah();
                                                zzU(2);
                                                if (this.zzz) {
                                                    while (zzkmVarZzd2 != null) {
                                                        while (i12 < r5) {
                                                        }
                                                    }
                                                    this.zzO.zzc();
                                                }
                                                zzX();
                                            }
                                        }
                                    }
                                }
                                int i24 = 2;
                                if (this.zzu.zze == 2) {
                                    int i25 = 0;
                                    while (true) {
                                        zzli[] zzliVarArr6 = this.zza;
                                        int length7 = zzliVarArr6.length;
                                        if (i25 < i24) {
                                            if (zzae(zzliVarArr6[i25]) && this.zza[i25].zzm() == zzkmVarZzd4.zzc[i25]) {
                                                this.zza[i25].zzs();
                                            }
                                            i25++;
                                            i24 = 2;
                                        } else {
                                            zzlc zzlcVar3 = this.zzu;
                                            if (zzlcVar3.zzg || zzlcVar3.zzq >= 500000 || !zzad()) {
                                                jElapsedRealtime = -9223372036854775807L;
                                            } else if (this.zzM == -9223372036854775807L) {
                                                jElapsedRealtime = SystemClock.elapsedRealtime();
                                            } else if (SystemClock.elapsedRealtime() - this.zzM >= 4000) {
                                                throw new IllegalStateException("Playback stuck buffering and not loading");
                                            }
                                            this.zzM = jElapsedRealtime;
                                        }
                                    }
                                } else {
                                    jElapsedRealtime = -9223372036854775807L;
                                    this.zzM = jElapsedRealtime;
                                }
                                boolean z24 = zzah() && this.zzu.zze == i11;
                                boolean z25 = this.zzF && this.zzE && z24;
                                zzlc zzlcVar4 = this.zzu;
                                if (zzlcVar4.zzo != z25) {
                                    z16 = z25;
                                    this.zzu = new zzlc(zzlcVar4.zza, zzlcVar4.zzb, zzlcVar4.zzc, zzlcVar4.zzd, zzlcVar4.zze, zzlcVar4.zzf, zzlcVar4.zzg, zzlcVar4.zzh, zzlcVar4.zzi, zzlcVar4.zzj, zzlcVar4.zzk, zzlcVar4.zzl, zzlcVar4.zzm, zzlcVar4.zzn, zzlcVar4.zzp, zzlcVar4.zzq, zzlcVar4.zzr, zzlcVar4.zzs, z16);
                                } else {
                                    z16 = z25;
                                }
                                this.zzE = false;
                                if (!z16 && (i13 = this.zzu.zze) != 4) {
                                    if (z24 || i13 == 2) {
                                        zzQ(jUptimeMillis, 10L);
                                    } else if (i13 == 3 && this.zzG != 0) {
                                        zzQ(jUptimeMillis, 1000L);
                                    }
                                }
                                Trace.endSection();
                            }
                        }
                        z10 = true;
                    }
                    zzJ();
                    return z10;
                case 3:
                    zzkg zzkgVar = (zzkg) message.obj;
                    this.zzv.zza(1);
                    Pair pairZzy = zzy(this.zzu.zza, zzkgVar, true, this.zzB, this.zzC, this.zzk, this.zzl);
                    if (pairZzy == null) {
                        Pair pairZzx = zzx(this.zzu.zza);
                        zztoVar = (zzto) pairZzx.first;
                        long jLongValue2 = ((Long) pairZzx.second).longValue();
                        j10 = -9223372036854775807L;
                        z18 = !this.zzu.zza.zzo();
                        jLongValue = jLongValue2;
                    } else {
                        Object obj = pairZzy.first;
                        jLongValue = ((Long) pairZzy.second).longValue();
                        j10 = zzkgVar.zzc == -9223372036854775807L ? -9223372036854775807L : jLongValue;
                        zzto zztoVarZzh = this.zzq.zzh(this.zzu.zza, obj, jLongValue);
                        if (zztoVarZzh.zzb()) {
                            this.zzu.zza.zzn(zztoVarZzh.zza, this.zzl);
                            if (this.zzl.zze(zztoVarZzh.zzb) == zztoVarZzh.zzc) {
                                this.zzl.zzj();
                            }
                            zztoVar = zztoVarZzh;
                            z18 = true;
                            jLongValue = 0;
                        } else {
                            z18 = zzkgVar.zzc == -9223372036854775807L;
                            zztoVar = zztoVarZzh;
                        }
                    }
                    try {
                        try {
                            if (!this.zzu.zza.zzo()) {
                                if (pairZzy == null) {
                                    if (this.zzu.zze != 1) {
                                        zzU(4);
                                    }
                                    zzM(false, true, false, true);
                                } else {
                                    if (zztoVar.equals(this.zzu.zzb)) {
                                        zzkm zzkmVarZzd5 = this.zzq.zzd();
                                        jZza = (zzkmVarZzd5 == null || !zzkmVarZzd5.zzd || jLongValue == 0) ? jLongValue : zzkmVarZzd5.zza.zza(jLongValue, this.zzt);
                                        zztoVar2 = zztoVar;
                                        try {
                                            if (zzfj.zzq(jZza) == zzfj.zzq(this.zzu.zzr) && ((i14 = (zzlcVar2 = this.zzu).zze) == 2 || i14 == 3)) {
                                                long j17 = zzlcVar2.zzr;
                                                zzlcVarZzz = zzz(zztoVar2, j17, j10, j17, z18, 2);
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            th = th;
                                            th2 = th;
                                            j11 = jLongValue;
                                            this.zzu = zzz(zztoVar2, j11, j10, j11, z18, 2);
                                            throw th2;
                                        }
                                    } else {
                                        zztoVar2 = zztoVar;
                                        jZza = jLongValue;
                                    }
                                    long jZzv = zzv(zztoVar2, jZza, this.zzu.zze == 4);
                                    z18 |= jLongValue != jZzv;
                                    try {
                                        zzlc zzlcVar5 = this.zzu;
                                        zzcw zzcwVar2 = zzlcVar5.zza;
                                        zzab(zzcwVar2, zztoVar2, zzcwVar2, zzlcVar5.zzb, j10, true);
                                        j12 = jZzv;
                                        zzlcVarZzz = zzz(zztoVar2, j12, j10, j12, z18, 2);
                                    } catch (Throwable th4) {
                                        j11 = jZzv;
                                        th2 = th4;
                                        this.zzu = zzz(zztoVar2, j11, j10, j11, z18, 2);
                                        throw th2;
                                    }
                                }
                                this.zzu = zzlcVarZzz;
                                z10 = true;
                                zzJ();
                                return z10;
                            }
                            this.zzH = zzkgVar;
                            j12 = jLongValue;
                            zztoVar2 = zztoVar;
                            zzlcVarZzz = zzz(zztoVar2, j12, j10, j12, z18, 2);
                            this.zzu = zzlcVarZzz;
                            z10 = true;
                            zzJ();
                            return z10;
                        } catch (Throwable th5) {
                            th = th5;
                            zztoVar2 = zztoVar;
                            th2 = th;
                            j11 = jLongValue;
                            this.zzu = zzz(zztoVar2, j11, j10, j11, z18, 2);
                            throw th2;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        zztoVar2 = zztoVar;
                    }
                    break;
                case 4:
                    zzS((zzch) message.obj);
                    zzG(this.zzn.zzc(), true);
                    z10 = true;
                    zzJ();
                    return z10;
                case 5:
                    this.zzt = (zzlm) message.obj;
                    z10 = true;
                    zzJ();
                    return z10;
                case 6:
                    zzW(false, true);
                    z10 = true;
                    zzJ();
                    return z10;
                case 7:
                    zzM(true, false, true, false);
                    int i26 = 0;
                    while (true) {
                        int length8 = this.zza.length;
                        if (i26 >= 2) {
                            this.zzf.zzc();
                            zzU(1);
                            HandlerThread handlerThread = this.zzi;
                            if (handlerThread != null) {
                                handlerThread.quit();
                            }
                            synchronized (this) {
                                this.zzw = true;
                                notifyAll();
                                break;
                            }
                            return true;
                        }
                        this.zzc[i26].zzn();
                        this.zza[i26].zzA();
                        i26++;
                    }
                    break;
                case 8:
                    if (this.zzq.zzl((zztm) message.obj)) {
                        zzkm zzkmVarZzc2 = this.zzq.zzc();
                        zzkmVarZzc2.zzl(this.zzn.zzc().zzc, this.zzu.zza);
                        zzZ(zzkmVarZzc2.zzf.zza, zzkmVarZzc2.zzh(), zzkmVarZzc2.zzi());
                        if (zzkmVarZzc2 == this.zzq.zzd()) {
                            zzO(zzkmVarZzc2.zzf.zzb);
                            zzB();
                            zzlc zzlcVar6 = this.zzu;
                            zzto zztoVar7 = zzlcVar6.zzb;
                            long j18 = zzkmVarZzc2.zzf.zzb;
                            this.zzu = zzz(zztoVar7, j18, zzlcVar6.zzc, j18, false, 5);
                        }
                        zzI();
                    }
                    z10 = true;
                    zzJ();
                    return z10;
                case 9:
                    if (this.zzq.zzl((zztm) message.obj)) {
                        this.zzq.zzk(this.zzI);
                        zzI();
                    }
                    z10 = true;
                    zzJ();
                    return z10;
                case 10:
                    zzK();
                    z10 = true;
                    zzJ();
                    return z10;
                case 11:
                    int i27 = message.arg1;
                    this.zzB = i27;
                    if (!this.zzq.zzp(this.zzu.zza, i27)) {
                        zzR(true);
                    }
                    zzE(false);
                    z10 = true;
                    zzJ();
                    return z10;
                case 12:
                    boolean z26 = message.arg1 != 0;
                    this.zzC = z26;
                    if (!this.zzq.zzq(this.zzu.zza, z26)) {
                        zzR(true);
                    }
                    zzE(false);
                    z10 = true;
                    zzJ();
                    return z10;
                case 13:
                    boolean z27 = message.arg1 != 0;
                    AtomicBoolean atomicBoolean = (AtomicBoolean) message.obj;
                    if (this.zzD != z27) {
                        this.zzD = z27;
                        if (!z27) {
                            zzli[] zzliVarArr7 = this.zza;
                            int length9 = zzliVarArr7.length;
                            for (int i28 = 0; i28 < 2; i28++) {
                                zzli zzliVar6 = zzliVarArr7[i28];
                                if (!zzae(zzliVar6) && this.zzb.remove(zzliVar6)) {
                                    zzliVar6.zzC();
                                }
                            }
                        }
                    }
                    if (atomicBoolean != null) {
                        synchronized (this) {
                            atomicBoolean.set(true);
                            notifyAll();
                            break;
                        }
                    }
                    z10 = true;
                    zzJ();
                    return z10;
                case 14:
                    zzlf zzlfVar = (zzlf) message.obj;
                    if (zzlfVar.zzb() == this.zzj) {
                        zzak(zzlfVar);
                        int i29 = this.zzu.zze;
                        if (i29 == 3 || i29 == 2) {
                            zzeiVar = this.zzh;
                            zzeiVar.zzi(2);
                        }
                    } else {
                        this.zzh.zzc(15, zzlfVar).zza();
                    }
                    z10 = true;
                    zzJ();
                    return z10;
                case 15:
                    final zzlf zzlfVar2 = (zzlf) message.obj;
                    Looper looperZzb = zzlfVar2.zzb();
                    if (looperZzb.getThread().isAlive()) {
                        this.zzp.zzb(looperZzb, null).zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzjz
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzkh.zzr(zzlfVar2);
                            }
                        });
                    } else {
                        zzer.zzf("TAG", "Trying to send message on a dead thread.");
                        zzlfVar2.zzh(false);
                    }
                    z10 = true;
                    zzJ();
                    return z10;
                case 16:
                    zzG((zzch) message.obj, false);
                    z10 = true;
                    zzJ();
                    return z10;
                case 17:
                    zzkc zzkcVar = (zzkc) message.obj;
                    this.zzv.zza(1);
                    if (zzkcVar.zzb != -1) {
                        this.zzH = new zzkg(new zzlg(zzkcVar.zza, zzkcVar.zzd), zzkcVar.zzb, zzkcVar.zzc);
                    }
                    zzcwVarZzm = this.zzr.zzm(zzkcVar.zza, zzkcVar.zzd);
                    zzF(zzcwVarZzm, false);
                    z10 = true;
                    zzJ();
                    return z10;
                case 18:
                    zzkc zzkcVar2 = (zzkc) message.obj;
                    int iZza = message.arg1;
                    this.zzv.zza(1);
                    zzlb zzlbVar = this.zzr;
                    if (iZza == -1) {
                        iZza = zzlbVar.zza();
                    }
                    zzcwVarZzm = zzlbVar.zzj(iZza, zzkcVar2.zza, zzkcVar2.zzd);
                    zzF(zzcwVarZzm, false);
                    z10 = true;
                    zzJ();
                    return z10;
                case 19:
                    zzkd zzkdVar = (zzkd) message.obj;
                    this.zzv.zza(1);
                    zzlb zzlbVar2 = this.zzr;
                    int i30 = zzkdVar.zza;
                    zzcwVarZzm = zzlbVar2.zzk(0, 0, 0, null);
                    zzF(zzcwVarZzm, false);
                    z10 = true;
                    zzJ();
                    return z10;
                case 20:
                    int i31 = message.arg1;
                    int i32 = message.arg2;
                    zzvi zzviVar = (zzvi) message.obj;
                    this.zzv.zza(1);
                    zzcwVarZzm = this.zzr.zzl(i31, i32, zzviVar);
                    zzF(zzcwVarZzm, false);
                    z10 = true;
                    zzJ();
                    return z10;
                case 21:
                    zzvi zzviVar2 = (zzvi) message.obj;
                    this.zzv.zza(1);
                    zzcwVarZzm = this.zzr.zzn(zzviVar2);
                    zzF(zzcwVarZzm, false);
                    z10 = true;
                    zzJ();
                    return z10;
                case 22:
                    zzF(this.zzr.zzb(), true);
                    z10 = true;
                    zzJ();
                    return z10;
                case 23:
                    this.zzx = message.arg1 != 0;
                    zzN();
                    if (this.zzy && this.zzq.zze() != this.zzq.zzd()) {
                        zzR(true);
                        zzE(false);
                    }
                    z10 = true;
                    zzJ();
                    return z10;
                case 24:
                    boolean z28 = message.arg1 == 1;
                    if (z28 != this.zzF) {
                        this.zzF = z28;
                        if (!z28 && this.zzu.zzo) {
                            zzeiVar = this.zzh;
                            zzeiVar.zzi(2);
                        }
                    }
                    z10 = true;
                    zzJ();
                    return z10;
                case 25:
                case 26:
                    zzL();
                    z10 = true;
                    zzJ();
                    return z10;
                default:
                    return false;
            }
        } catch (zzcd e10) {
            zzD(e10, e10.zzb == 1 ? true != e10.zza ? AuthApiStatusCodes.AUTH_API_SERVER_ERROR : 3001 : 1000);
        } catch (zzgf e11) {
            zzgf zzgfVar = e11;
            i10 = zzgfVar.zza;
            iOException = zzgfVar;
            zzD(iOException, i10);
        } catch (zzih e12) {
            zzih zzihVarZza = e12;
            if (zzihVarZza.zze == 1 && (zzkmVarZze = this.zzq.zze()) != null) {
                zzihVarZza = zzihVarZza.zza(zzkmVarZze.zzf.zza);
            }
            if (zzihVarZza.zzk && this.zzL == null) {
                zzer.zzg("ExoPlayerImplInternal", "Recoverable renderer error", zzihVarZza);
                this.zzL = zzihVarZza;
                zzei zzeiVar2 = this.zzh;
                zzeiVar2.zzk(zzeiVar2.zzc(25, zzihVarZza));
            } else {
                zzih zzihVar = this.zzL;
                if (zzihVar != null) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(zzihVar, zzihVarZza);
                    } catch (Exception unused) {
                    }
                    zzihVarZza = this.zzL;
                }
                zzih zzihVar2 = zzihVarZza;
                zzer.zzd("ExoPlayerImplInternal", "Playback error", zzihVar2);
                z10 = true;
                if (zzihVar2.zze == 1) {
                    if (this.zzq.zzd() != this.zzq.zze()) {
                        while (this.zzq.zzd() != this.zzq.zze()) {
                            this.zzq.zza();
                        }
                        zzkm zzkmVarZzd6 = this.zzq.zzd();
                        Objects.requireNonNull(zzkmVarZzd6);
                        zzkn zzknVar3 = zzkmVarZzd6.zzf;
                        zzto zztoVar8 = zzknVar3.zza;
                        long j19 = zzknVar3.zzb;
                        this.zzu = zzz(zztoVar8, j19, zzknVar3.zzc, j19, true, 0);
                    }
                    z11 = false;
                    z10 = true;
                } else {
                    z11 = false;
                }
                zzW(z10, z11);
                this.zzu = this.zzu.zzf(zzihVar2);
            }
        } catch (zzqm e13) {
            zzqm zzqmVar = e13;
            i10 = zzqmVar.zza;
            iOException = zzqmVar;
            zzD(iOException, i10);
        } catch (zzsq e14) {
            iOException = e14;
            i10 = 1002;
            zzD(iOException, i10);
        } catch (IOException e15) {
            iOException = e15;
            i10 = 2000;
            zzD(iOException, i10);
        } catch (RuntimeException e16) {
            zzih zzihVarZzd = zzih.zzd(e16, ((e16 instanceof IllegalStateException) || (e16 instanceof IllegalArgumentException)) ? 1004 : 1000);
            zzer.zzd("ExoPlayerImplInternal", "Playback error", zzihVarZzd);
            zzW(true, false);
            this.zzu = this.zzu.zzf(zzihVarZzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzie
    public final void zza(zzch zzchVar) {
        this.zzh.zzc(16, zzchVar).zza();
    }

    public final Looper zzb() {
        return this.zzj;
    }

    public final /* synthetic */ Boolean zzd() {
        return Boolean.valueOf(this.zzw);
    }

    @Override // com.google.android.gms.internal.ads.zzvg
    public final /* bridge */ /* synthetic */ void zzg(zzvh zzvhVar) {
        this.zzh.zzc(9, (zztm) zzvhVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzla
    public final void zzh() {
        this.zzh.zzi(22);
    }

    @Override // com.google.android.gms.internal.ads.zztl
    public final void zzi(zztm zztmVar) {
        this.zzh.zzc(8, zztmVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzxf
    public final void zzj() {
        this.zzh.zzi(10);
    }

    public final void zzk() {
        this.zzh.zzb(0).zza();
    }

    public final void zzl(zzcw zzcwVar, int i10, long j10) {
        this.zzh.zzc(3, new zzkg(zzcwVar, i10, j10)).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzld
    public final synchronized void zzm(zzlf zzlfVar) {
        if (!this.zzw && this.zzj.getThread().isAlive()) {
            this.zzh.zzc(14, zzlfVar).zza();
            return;
        }
        zzer.zzf("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        zzlfVar.zzh(false);
    }

    public final void zzn(boolean z10, int i10) {
        this.zzh.zzd(1, z10 ? 1 : 0, i10).zza();
    }

    public final void zzo() {
        this.zzh.zzb(6).zza();
    }

    public final synchronized boolean zzp() {
        if (!this.zzw && this.zzj.getThread().isAlive()) {
            this.zzh.zzi(7);
            zzac(new zzjy(this), this.zzs);
            return this.zzw;
        }
        return true;
    }

    public final void zzq(List list, int i10, long j10, zzvi zzviVar) {
        this.zzh.zzc(17, new zzkc(list, zzviVar, i10, j10, null)).zza();
    }
}
