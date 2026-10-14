package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
final class zzjx extends zzm implements zzis {
    public static final /* synthetic */ int zzd = 0;
    private final zzlr zzA;
    private final long zzB;
    private int zzC;
    private int zzD;
    private boolean zzE;
    private int zzF;
    private zzlm zzG;
    private zzcl zzH;
    private zzbv zzI;
    private zzbv zzJ;
    private zzam zzK;
    private zzam zzL;
    private AudioTrack zzM;
    private Object zzN;
    private Surface zzO;
    private int zzP;
    private zzfb zzQ;
    private zzhz zzR;
    private zzhz zzS;
    private int zzT;
    private zzk zzU;
    private float zzV;
    private boolean zzW;
    private zzdx zzX;
    private boolean zzY;
    private boolean zzZ;
    private zzz zzaa;
    private zzdn zzab;
    private zzbv zzac;
    private zzlc zzad;
    private int zzae;
    private long zzaf;
    private final zzjc zzag;
    private zzvi zzah;
    public final zzxh zzb;
    public final zzcl zzc;
    private final zzeb zze;
    private final Context zzf;
    private final zzcp zzg;
    private final zzli[] zzh;
    private final zzxg zzi;
    private final zzei zzj;
    private final zzkh zzk;
    private final zzeo zzl;
    private final CopyOnWriteArraySet zzm;
    private final zzct zzn;
    private final List zzo;
    private final boolean zzp;
    private final zztn zzq;
    private final zzls zzr;
    private final Looper zzs;
    private final zzxo zzt;
    private final zzdz zzu;
    private final zzjt zzv;
    private final zzjv zzw;
    private final zzht zzx;
    private final zzhx zzy;
    private final zzlq zzz;

    static {
        zzbq.zzb("media3.exoplayer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.google.android.gms.internal.ads.zzls, com.google.android.gms.internal.ads.zzxn, java.lang.Object] */
    @SuppressLint({"HandlerLeak"})
    public zzjx(zzir zzirVar, zzcp zzcpVar) {
        Object obj;
        zzeb zzebVar = new zzeb(zzdz.zza);
        this.zze = zzebVar;
        try {
            zzer.zze("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.1.0-beta01] [" + zzfj.zze + "]");
            Context applicationContext = zzirVar.zza.getApplicationContext();
            this.zzf = applicationContext;
            ?? Apply = zzirVar.zzh.apply(zzirVar.zzb);
            this.zzr = Apply;
            this.zzU = zzirVar.zzj;
            this.zzP = zzirVar.zzk;
            this.zzW = false;
            this.zzB = zzirVar.zzo;
            zzjt zzjtVar = new zzjt(this, null);
            this.zzv = zzjtVar;
            zzjv zzjvVar = new zzjv(null);
            this.zzw = zzjvVar;
            Handler handler = new Handler(zzirVar.zzi);
            zzli[] zzliVarArrZza = ((zzil) zzirVar.zzc).zza.zza(handler, zzjtVar, zzjtVar, zzjtVar, zzjtVar);
            this.zzh = zzliVarArrZza;
            int length = zzliVarArrZza.length;
            zzxg zzxgVar = (zzxg) zzirVar.zze.zza();
            this.zzi = zzxgVar;
            this.zzq = zzir.zza(((zzim) zzirVar.zzd).zza);
            zzxs zzxsVarZzg = zzxs.zzg(((zzip) zzirVar.zzg).zza);
            this.zzt = zzxsVarZzg;
            this.zzp = zzirVar.zzl;
            this.zzG = zzirVar.zzm;
            Looper looper = zzirVar.zzi;
            this.zzs = looper;
            zzdz zzdzVar = zzirVar.zzb;
            this.zzu = zzdzVar;
            this.zzg = zzcpVar;
            zzeo zzeoVar = new zzeo(looper, zzdzVar, new zzem() { // from class: com.google.android.gms.internal.ads.zzjb
                @Override // com.google.android.gms.internal.ads.zzem
                public final void zza(Object obj2, zzah zzahVar) {
                }
            });
            this.zzl = zzeoVar;
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.zzm = copyOnWriteArraySet;
            this.zzo = new ArrayList();
            this.zzah = new zzvi(0);
            int length2 = zzliVarArrZza.length;
            zzxh zzxhVar = new zzxh(new zzll[2], new zzxa[2], zzdh.zza, null);
            this.zzb = zzxhVar;
            this.zzn = new zzct();
            zzcj zzcjVar = new zzcj();
            zzcjVar.zzc(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 24, 27, 28, 32);
            zzxgVar.zzm();
            zzcjVar.zzd(29, true);
            zzcjVar.zzd(23, false);
            zzcjVar.zzd(25, false);
            zzcjVar.zzd(33, false);
            zzcjVar.zzd(26, false);
            zzcjVar.zzd(34, false);
            zzcl zzclVarZze = zzcjVar.zze();
            this.zzc = zzclVarZze;
            zzcj zzcjVar2 = new zzcj();
            zzcjVar2.zzb(zzclVarZze);
            zzcjVar2.zza(4);
            zzcjVar2.zza(10);
            this.zzH = zzcjVar2.zze();
            this.zzj = zzdzVar.zzb(looper, null);
            zzjc zzjcVar = new zzjc(this);
            this.zzag = zzjcVar;
            this.zzad = zzlc.zzi(zzxhVar);
            Apply.zzP(zzcpVar, looper);
            int i10 = zzfj.zza;
            this.zzk = new zzkh(zzliVarArrZza, zzxgVar, zzxhVar, (zzkk) zzirVar.zzf.zza(), zzxsVarZzg, 0, false, Apply, this.zzG, zzirVar.zzr, zzirVar.zzn, false, looper, zzdzVar, zzjcVar, i10 < 31 ? new zzoc() : zzjo.zza(applicationContext, this, zzirVar.zzp), null);
            this.zzV = 1.0f;
            zzbv zzbvVar = zzbv.zza;
            this.zzI = zzbvVar;
            this.zzJ = zzbvVar;
            this.zzac = zzbvVar;
            int iGenerateAudioSessionId = -1;
            this.zzae = -1;
            if (i10 >= 21) {
                AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
                if (audioManager != null) {
                    iGenerateAudioSessionId = audioManager.generateAudioSessionId();
                }
                this.zzT = iGenerateAudioSessionId;
                obj = null;
            } else {
                AudioTrack audioTrack = this.zzM;
                if (audioTrack == null || audioTrack.getAudioSessionId() == 0) {
                    obj = null;
                } else {
                    this.zzM.release();
                    obj = null;
                    this.zzM = null;
                }
                if (this.zzM == null) {
                    this.zzM = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.zzT = this.zzM.getAudioSessionId();
            }
            this.zzX = zzdx.zza;
            this.zzY = true;
            Objects.requireNonNull(Apply);
            zzeoVar.zzb(Apply);
            zzxsVarZzg.zze(new Handler(looper), Apply);
            copyOnWriteArraySet.add(zzjtVar);
            this.zzx = new zzht(zzirVar.zza, handler, zzjtVar);
            this.zzy = new zzhx(zzirVar.zza, handler, zzjtVar);
            zzfj.zzC(obj, obj);
            this.zzz = new zzlq(zzirVar.zza);
            this.zzA = new zzlr(zzirVar.zza);
            this.zzaa = new zzx(0).zza();
            this.zzab = zzdn.zza;
            this.zzQ = zzfb.zza;
            zzxgVar.zzj(this.zzU);
            zzah(1, 10, Integer.valueOf(this.zzT));
            zzah(2, 10, Integer.valueOf(this.zzT));
            zzah(1, 3, this.zzU);
            zzah(2, 4, Integer.valueOf(this.zzP));
            zzah(2, 5, 0);
            zzah(1, 9, Boolean.valueOf(this.zzW));
            zzah(2, 7, zzjvVar);
            zzah(6, 8, zzjvVar);
            zzebVar.zze();
        } catch (Throwable th) {
            this.zze.zze();
            throw th;
        }
    }

    public static /* bridge */ /* synthetic */ void zzP(zzjx zzjxVar, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        zzjxVar.zzaj(surface);
        zzjxVar.zzO = surface;
    }

    private final int zzX(zzlc zzlcVar) {
        return zzlcVar.zza.zzo() ? this.zzae : zzlcVar.zza.zzn(zzlcVar.zzb.zza, this.zzn).zzd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzY(boolean z10, int i10) {
        return (!z10 || i10 == 1) ? 1 : 2;
    }

    private final long zzZ(zzlc zzlcVar) {
        if (!zzlcVar.zzb.zzb()) {
            return zzfj.zzq(zzaa(zzlcVar));
        }
        zzlcVar.zza.zzn(zzlcVar.zzb.zza, this.zzn);
        long j10 = zzlcVar.zzc;
        if (j10 == -9223372036854775807L) {
            long j11 = zzlcVar.zza.zze(zzX(zzlcVar), this.zza, 0L).zzm;
            return zzfj.zzq(0L);
        }
        int i10 = zzfj.zza;
        return zzfj.zzq(j10) + zzfj.zzq(0L);
    }

    private final long zzaa(zzlc zzlcVar) {
        if (zzlcVar.zza.zzo()) {
            return zzfj.zzo(this.zzaf);
        }
        long jZza = zzlcVar.zzo ? zzlcVar.zza() : zzlcVar.zzr;
        if (zzlcVar.zzb.zzb()) {
            return jZza;
        }
        zzac(zzlcVar.zza, zzlcVar.zzb, jZza);
        return jZza;
    }

    private static long zzab(zzlc zzlcVar) {
        zzcv zzcvVar = new zzcv();
        zzct zzctVar = new zzct();
        zzlcVar.zza.zzn(zzlcVar.zzb.zza, zzctVar);
        long j10 = zzlcVar.zzc;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        long j11 = zzlcVar.zza.zze(zzctVar.zzd, zzcvVar, 0L).zzm;
        return 0L;
    }

    private final long zzac(zzcw zzcwVar, zzto zztoVar, long j10) {
        zzcwVar.zzn(zztoVar.zza, this.zzn);
        return j10;
    }

    private final Pair zzad(zzcw zzcwVar, int i10, long j10) {
        if (zzcwVar.zzo()) {
            this.zzae = i10;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.zzaf = j10;
            return null;
        }
        if (i10 == -1 || i10 >= zzcwVar.zzc()) {
            i10 = zzcwVar.zzg(false);
            long j11 = zzcwVar.zze(i10, this.zza, 0L).zzm;
            j10 = zzfj.zzq(0L);
        }
        return zzcwVar.zzl(this.zza, this.zzn, i10, zzfj.zzo(j10));
    }

    private final zzlc zzae(zzlc zzlcVar, zzcw zzcwVar, Pair pair) {
        zzdy.zzd(zzcwVar.zzo() || pair != null);
        zzcw zzcwVar2 = zzlcVar.zza;
        long jZzZ = zzZ(zzlcVar);
        zzlc zzlcVarZzh = zzlcVar.zzh(zzcwVar);
        if (zzcwVar.zzo()) {
            zzto zztoVarZzj = zzlc.zzj();
            long jZzo = zzfj.zzo(this.zzaf);
            zzlc zzlcVarZzc = zzlcVarZzh.zzd(zztoVarZzj, jZzo, jZzo, jZzo, 0L, zzvn.zza, this.zzb, zzfsc.zzl()).zzc(zztoVarZzj);
            zzlcVarZzc.zzp = zzlcVarZzc.zzr;
            return zzlcVarZzc;
        }
        Object obj = zzlcVarZzh.zzb.zza;
        int i10 = zzfj.zza;
        boolean z10 = !obj.equals(pair.first);
        zzto zztoVar = z10 ? new zzto(pair.first) : zzlcVarZzh.zzb;
        long jLongValue = ((Long) pair.second).longValue();
        long jZzo2 = zzfj.zzo(jZzZ);
        if (!zzcwVar2.zzo()) {
            zzcwVar2.zzn(obj, this.zzn);
        }
        if (z10 || jLongValue < jZzo2) {
            zzdy.zzf(!zztoVar.zzb());
            zzlc zzlcVarZzc2 = zzlcVarZzh.zzd(zztoVar, jLongValue, jLongValue, jLongValue, 0L, z10 ? zzvn.zza : zzlcVarZzh.zzh, z10 ? this.zzb : zzlcVarZzh.zzi, z10 ? zzfsc.zzl() : zzlcVarZzh.zzj).zzc(zztoVar);
            zzlcVarZzc2.zzp = jLongValue;
            return zzlcVarZzc2;
        }
        if (jLongValue != jZzo2) {
            zzdy.zzf(!zztoVar.zzb());
            long jMax = Math.max(0L, zzlcVarZzh.zzq - (jLongValue - jZzo2));
            long j10 = zzlcVarZzh.zzp;
            if (zzlcVarZzh.zzk.equals(zzlcVarZzh.zzb)) {
                j10 = jLongValue + jMax;
            }
            zzlc zzlcVarZzd = zzlcVarZzh.zzd(zztoVar, jLongValue, jLongValue, jLongValue, jMax, zzlcVarZzh.zzh, zzlcVarZzh.zzi, zzlcVarZzh.zzj);
            zzlcVarZzd.zzp = j10;
            return zzlcVarZzd;
        }
        int iZza = zzcwVar.zza(zzlcVarZzh.zzk.zza);
        if (iZza != -1 && zzcwVar.zzd(iZza, this.zzn, false).zzd == zzcwVar.zzn(zztoVar.zza, this.zzn).zzd) {
            return zzlcVarZzh;
        }
        zzcwVar.zzn(zztoVar.zza, this.zzn);
        long jZzh = zztoVar.zzb() ? this.zzn.zzh(zztoVar.zzb, zztoVar.zzc) : this.zzn.zze;
        zzlc zzlcVarZzc3 = zzlcVarZzh.zzd(zztoVar, zzlcVarZzh.zzr, zzlcVarZzh.zzr, zzlcVarZzh.zzd, jZzh - zzlcVarZzh.zzr, zzlcVarZzh.zzh, zzlcVarZzh.zzi, zzlcVarZzh.zzj).zzc(zztoVar);
        zzlcVarZzc3.zzp = jZzh;
        return zzlcVarZzc3;
    }

    private final zzlf zzaf(zzle zzleVar) {
        int iZzX = zzX(this.zzad);
        zzkh zzkhVar = this.zzk;
        zzcw zzcwVar = this.zzad.zza;
        if (iZzX == -1) {
            iZzX = 0;
        }
        return new zzlf(zzkhVar, zzleVar, zzcwVar, iZzX, this.zzu, zzkhVar.zzb());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzag(final int i10, final int i11) {
        if (i10 == this.zzQ.zzb() && i11 == this.zzQ.zza()) {
            return;
        }
        this.zzQ = new zzfb(i10, i11);
        zzeo zzeoVar = this.zzl;
        zzeoVar.zzd(24, new zzel() { // from class: com.google.android.gms.internal.ads.zzjf
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                int i12 = i10;
                int i13 = i11;
                int i14 = zzjx.zzd;
                ((zzcm) obj).zzo(i12, i13);
            }
        });
        zzeoVar.zzc();
        zzah(2, 14, new zzfb(i10, i11));
    }

    private final void zzah(int i10, int i11, Object obj) {
        zzli[] zzliVarArr = this.zzh;
        int length = zzliVarArr.length;
        for (int i12 = 0; i12 < 2; i12++) {
            zzli zzliVar = zzliVarArr[i12];
            if (zzliVar.zzb() == i10) {
                zzlf zzlfVarZzaf = zzaf(zzliVar);
                zzlfVarZzaf.zzf(i11);
                zzlfVarZzaf.zze(obj);
                zzlfVarZzaf.zzd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzai() {
        zzah(1, 2, Float.valueOf(this.zzV * this.zzy.zza()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaj(Object obj) {
        ArrayList arrayList = new ArrayList();
        zzli[] zzliVarArr = this.zzh;
        int length = zzliVarArr.length;
        boolean z10 = false;
        for (int i10 = 0; i10 < 2; i10++) {
            zzli zzliVar = zzliVarArr[i10];
            if (zzliVar.zzb() == 2) {
                zzlf zzlfVarZzaf = zzaf(zzliVar);
                zzlfVarZzaf.zzf(1);
                zzlfVarZzaf.zze(obj);
                zzlfVarZzaf.zzd();
                arrayList.add(zzlfVarZzaf);
            }
        }
        Object obj2 = this.zzN;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((zzlf) it.next()).zzi(this.zzB);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z10 = true;
            }
            Object obj3 = this.zzN;
            Surface surface = this.zzO;
            if (obj3 == surface) {
                surface.release();
                this.zzO = null;
            }
        }
        this.zzN = obj;
        if (z10) {
            zzak(zzih.zzd(new zzki(3), 1003));
        }
    }

    private final void zzak(zzih zzihVar) {
        zzlc zzlcVar = this.zzad;
        zzlc zzlcVarZzc = zzlcVar.zzc(zzlcVar.zzb);
        zzlcVarZzc.zzp = zzlcVarZzc.zzr;
        zzlcVarZzc.zzq = 0L;
        zzlc zzlcVarZzg = zzlcVarZzc.zzg(1);
        if (zzihVar != null) {
            zzlcVarZzg = zzlcVarZzg.zzf(zzihVar);
        }
        this.zzC++;
        this.zzk.zzo();
        zzam(zzlcVarZzg, 0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzal(boolean z10, int i10, int i11) {
        int i12 = 0;
        boolean z11 = z10 && i10 != -1;
        if (z11 && i10 != 1) {
            i12 = 1;
        }
        zzlc zzlcVarZzb = this.zzad;
        if (zzlcVarZzb.zzl == z11 && zzlcVarZzb.zzm == i12) {
            return;
        }
        this.zzC++;
        if (zzlcVarZzb.zzo) {
            zzlcVarZzb = zzlcVarZzb.zzb();
        }
        zzlc zzlcVarZze = zzlcVarZzb.zze(z11, i12);
        this.zzk.zzn(z11, i12);
        zzam(zzlcVarZze, 0, i11, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX WARN: Code duplicated, block: B:144:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:160:0x043a  */
    /* JADX WARN: Code duplicated, block: B:165:0x0456  */
    /* JADX WARN: Code duplicated, block: B:170:0x0460  */
    /* JADX WARN: Code duplicated, block: B:178:0x0471  */
    /* JADX WARN: Code duplicated, block: B:183:0x047c  */
    /* JADX WARN: Code duplicated, block: B:191:0x048e  */
    /* JADX WARN: Code duplicated, block: B:196:0x049f  */
    /* JADX WARN: Code duplicated, block: B:201:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:204:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:207:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:210:0x04e0 A[LOOP:0: B:208:0x04da->B:210:0x04e0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:211:0x04ec A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r49v0 */
    /* JADX WARN: Type inference failed for: r49v1 */
    /* JADX WARN: Type inference failed for: r49v2 */
    /* JADX WARN: Type inference failed for: r49v3 */
    /* JADX WARN: Type inference failed for: r49v4 */
    /* JADX WARN: Type inference failed for: r49v5 */
    /* JADX WARN: Type inference failed for: r49v6 */
    /* JADX WARN: Type inference failed for: r7v16, types: [com.google.android.gms.internal.ads.zzcw] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [boolean, int] */
    private final void zzam(final zzlc zzlcVar, final int i10, final int i11, boolean z10, final int i12, long j10, int i13, boolean z11) {
        Pair pair;
        int i14;
        final zzbp zzbpVar;
        ?? r10;
        int i15;
        boolean z12;
        ?? r11;
        ?? r49;
        long j11;
        boolean z13;
        ?? r410;
        zzcw zzcwVarZzn;
        boolean z14;
        boolean zZzo;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        zzcl zzclVarZze;
        Iterator it;
        ?? r411;
        int i16;
        Object obj;
        zzbp zzbpVar2;
        Object obj2;
        int iZza;
        long jZzab;
        long jZzab2;
        Object obj3;
        zzbp zzbpVar3;
        Object obj4;
        int iZza2;
        zzlc zzlcVar2 = this.zzad;
        this.zzad = zzlcVar;
        boolean z22 = !zzlcVar2.zza.equals(zzlcVar.zza);
        zzcw zzcwVar = zzlcVar2.zza;
        zzcw zzcwVar2 = zzlcVar.zza;
        int i17 = 0;
        if (zzcwVar2.zzo() && zzcwVar.zzo()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (zzcwVar2.zzo() != zzcwVar.zzo()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (zzcwVar.zze(zzcwVar.zzn(zzlcVar2.zzb.zza, this.zzn).zzd, this.zza, 0L).zzc.equals(zzcwVar2.zze(zzcwVar2.zzn(zzlcVar.zzb.zza, this.zzn).zzd, this.zza, 0L).zzc)) {
            pair = (z10 && i12 == 0 && zzlcVar2.zzb.zzd < zzlcVar.zzb.zzd) ? new Pair(Boolean.TRUE, 0) : new Pair(Boolean.FALSE, -1);
        } else {
            if (z10 && i12 == 0) {
                i14 = 1;
            } else if (z10 && i12 == 1) {
                i14 = 2;
            } else {
                if (!z22) {
                    throw new IllegalStateException();
                }
                i14 = 3;
            }
            pair = new Pair(Boolean.TRUE, Integer.valueOf(i14));
        }
        boolean zBooleanValue = ((Boolean) pair.first).booleanValue();
        final int iIntValue = ((Integer) pair.second).intValue();
        zzbv zzbvVarZzu = this.zzI;
        if (zBooleanValue) {
            if (zzlcVar.zza.zzo()) {
                zzbpVar = null;
            } else {
                zzbpVar = zzlcVar.zza.zze(zzlcVar.zza.zzn(zzlcVar.zzb.zza, this.zzn).zzd, this.zza, 0L).zzd;
            }
            this.zzac = zzbv.zza;
        } else {
            zzbpVar = null;
        }
        if (zBooleanValue || !zzlcVar2.zzj.equals(zzlcVar.zzj)) {
            zzbt zzbtVarZza = this.zzac.zza();
            List list = zzlcVar.zzj;
            int i18 = 0;
            while (i18 < list.size()) {
                zzbz zzbzVar = (zzbz) list.get(i18);
                while (i17 < zzbzVar.zza()) {
                    zzbzVar.zzb(i17).zza(zzbtVarZza);
                    i17++;
                }
                i18++;
                i17 = 0;
            }
            this.zzac = zzbtVarZza.zzu();
            zzcw zzcwVarZzn2 = zzn();
            if (zzcwVarZzn2.zzo()) {
                zzbvVarZzu = this.zzac;
            } else {
                zzbp zzbpVar4 = zzcwVarZzn2.zze(zzd(), this.zza, 0L).zzd;
                zzbt zzbtVarZza2 = this.zzac.zza();
                zzbtVarZza2.zzb(zzbpVar4.zzg);
                zzbvVarZzu = zzbtVarZza2.zzu();
            }
        }
        boolean z23 = !zzbvVarZzu.equals(this.zzI);
        this.zzI = zzbvVarZzu;
        boolean z24 = zzlcVar2.zzl != zzlcVar.zzl;
        boolean z25 = zzlcVar2.zze != zzlcVar.zze;
        if (z25 || z24) {
            zzan();
        }
        boolean z26 = zzlcVar2.zzg != zzlcVar.zzg;
        if (z22) {
            this.zzl.zzd(0, new zzel() { // from class: com.google.android.gms.internal.ads.zzjh
                @Override // com.google.android.gms.internal.ads.zzel
                public final void zza(Object obj5) {
                    zzlc zzlcVar3 = zzlcVar;
                    int i19 = i10;
                    int i20 = zzjx.zzd;
                    ((zzcm) obj5).zzp(zzlcVar3.zza, i19);
                }
            });
        }
        if (z10) {
            zzct zzctVar = new zzct();
            if (zzlcVar2.zza.zzo()) {
                i16 = i13;
                obj = null;
                zzbpVar2 = null;
                obj2 = null;
                iZza = -1;
            } else {
                Object obj5 = zzlcVar2.zzb.zza;
                zzlcVar2.zza.zzn(obj5, zzctVar);
                int i19 = zzctVar.zzd;
                iZza = zzlcVar2.zza.zza(obj5);
                i16 = i19;
                obj = zzlcVar2.zza.zze(i19, this.zza, 0L).zzc;
                zzbpVar2 = this.zza.zzd;
                obj2 = obj5;
            }
            boolean zZzb = zzlcVar2.zzb.zzb();
            if (i12 != 0) {
                jZzab = zzlcVar2.zzr;
                jZzab2 = zZzb ? zzab(zzlcVar2) : jZzab;
            } else if (zZzb) {
                zzto zztoVar = zzlcVar2.zzb;
                jZzab = zzctVar.zzh(zztoVar.zzb, zztoVar.zzc);
            } else {
                jZzab = zzlcVar2.zzb.zze != -1 ? zzab(this.zzad) : zzctVar.zze;
            }
            int i20 = zzfj.zza;
            zzto zztoVar2 = zzlcVar2.zzb;
            final zzco zzcoVar = new zzco(obj, i16, zzbpVar2, obj2, iZza, zzfj.zzq(jZzab), zzfj.zzq(jZzab2), zztoVar2.zzb, zztoVar2.zzc);
            int iZzd = zzd();
            if (this.zzad.zza.zzo()) {
                obj3 = null;
                zzbpVar3 = null;
                obj4 = null;
                iZza2 = -1;
            } else {
                zzlc zzlcVar3 = this.zzad;
                Object obj6 = zzlcVar3.zzb.zza;
                zzlcVar3.zza.zzn(obj6, this.zzn);
                iZza2 = this.zzad.zza.zza(obj6);
                obj3 = this.zzad.zza.zze(iZzd, this.zza, 0L).zzc;
                zzbpVar3 = this.zza.zzd;
                obj4 = obj6;
            }
            long jZzq = zzfj.zzq(j10);
            long jZzq2 = this.zzad.zzb.zzb() ? zzfj.zzq(zzab(this.zzad)) : jZzq;
            zzto zztoVar3 = this.zzad.zzb;
            final zzco zzcoVar2 = new zzco(obj3, iZzd, zzbpVar3, obj4, iZza2, jZzq, jZzq2, zztoVar3.zzb, zztoVar3.zzc);
            this.zzl.zzd(11, new zzel() { // from class: com.google.android.gms.internal.ads.zzjm
                @Override // com.google.android.gms.internal.ads.zzel
                public final void zza(Object obj7) {
                    int i21 = i12;
                    zzco zzcoVar3 = zzcoVar;
                    zzco zzcoVar4 = zzcoVar2;
                    int i22 = zzjx.zzd;
                    ((zzcm) obj7).zzm(zzcoVar3, zzcoVar4, i21);
                }
            });
        } else {
            z24 = z24;
            z26 = z26;
        }
        if (zBooleanValue) {
            this.zzl.zzd(1, new zzel() { // from class: com.google.android.gms.internal.ads.zzjn
                @Override // com.google.android.gms.internal.ads.zzel
                public final void zza(Object obj7) {
                    zzbp zzbpVar5 = zzbpVar;
                    int i21 = iIntValue;
                    int i22 = zzjx.zzd;
                    ((zzcm) obj7).zzd(zzbpVar5, i21);
                }
            });
        }
        if (zzlcVar2.zzf != zzlcVar.zzf) {
            this.zzl.zzd(10, new zzel() { // from class: com.google.android.gms.internal.ads.zzit
                @Override // com.google.android.gms.internal.ads.zzel
                public final void zza(Object obj7) {
                    zzlc zzlcVar4 = zzlcVar;
                    int i21 = zzjx.zzd;
                    ((zzcm) obj7).zzk(zzlcVar4.zzf);
                }
            });
            if (zzlcVar.zzf != null) {
                this.zzl.zzd(10, new zzel() { // from class: com.google.android.gms.internal.ads.zziu
                    @Override // com.google.android.gms.internal.ads.zzel
                    public final void zza(Object obj7) {
                        zzlc zzlcVar4 = zzlcVar;
                        int i21 = zzjx.zzd;
                        ((zzcm) obj7).zzj(zzlcVar4.zzf);
                    }
                });
            }
        }
        zzxh zzxhVar = zzlcVar2.zzi;
        zzxh zzxhVar2 = zzlcVar.zzi;
        if (zzxhVar != zzxhVar2) {
            this.zzi.zzp(zzxhVar2.zze);
            this.zzl.zzd(2, new zzel() { // from class: com.google.android.gms.internal.ads.zziv
                @Override // com.google.android.gms.internal.ads.zzel
                public final void zza(Object obj7) {
                    zzlc zzlcVar4 = zzlcVar;
                    int i21 = zzjx.zzd;
                    ((zzcm) obj7).zzq(zzlcVar4.zzi.zzd);
                }
            });
        }
        if (z23) {
            final zzbv zzbvVar = this.zzI;
            this.zzl.zzd(14, new zzel() { // from class: com.google.android.gms.internal.ads.zziw
                @Override // com.google.android.gms.internal.ads.zzel
                public final void zza(Object obj7) {
                    zzbv zzbvVar2 = zzbvVar;
                    int i21 = zzjx.zzd;
                    ((zzcm) obj7).zze(zzbvVar2);
                }
            });
        }
        if (z26) {
            this.zzl.zzd(3, new zzel() { // from class: com.google.android.gms.internal.ads.zzix
                @Override // com.google.android.gms.internal.ads.zzel
                public final void zza(Object obj7) {
                    zzlc zzlcVar4 = zzlcVar;
                    int i21 = zzjx.zzd;
                    ((zzcm) obj7).zzb(zzlcVar4.zzg);
                }
            });
        }
        if (z25 || z24) {
            this.zzl.zzd(-1, new zzel() { // from class: com.google.android.gms.internal.ads.zziy
                @Override // com.google.android.gms.internal.ads.zzel
                public final void zza(Object obj7) {
                    zzlc zzlcVar4 = zzlcVar;
                    int i21 = zzjx.zzd;
                    ((zzcm) obj7).zzl(zzlcVar4.zzl, zzlcVar4.zze);
                }
            });
        }
        if (z25) {
            this.zzl.zzd(4, new zzel() { // from class: com.google.android.gms.internal.ads.zziz
                @Override // com.google.android.gms.internal.ads.zzel
                public final void zza(Object obj7) {
                    zzlc zzlcVar4 = zzlcVar;
                    int i21 = zzjx.zzd;
                    ((zzcm) obj7).zzh(zzlcVar4.zze);
                }
            });
        }
        if (z24) {
            this.zzl.zzd(5, new zzel() { // from class: com.google.android.gms.internal.ads.zzji
                @Override // com.google.android.gms.internal.ads.zzel
                public final void zza(Object obj7) {
                    zzlc zzlcVar4 = zzlcVar;
                    int i21 = i11;
                    int i22 = zzjx.zzd;
                    ((zzcm) obj7).zzf(zzlcVar4.zzl, i21);
                }
            });
        }
        if (zzlcVar2.zzm != zzlcVar.zzm) {
            this.zzl.zzd(6, new zzel() { // from class: com.google.android.gms.internal.ads.zzjj
                @Override // com.google.android.gms.internal.ads.zzel
                public final void zza(Object obj7) {
                    zzlc zzlcVar4 = zzlcVar;
                    int i21 = zzjx.zzd;
                    ((zzcm) obj7).zzi(zzlcVar4.zzm);
                }
            });
        }
        if (zzlcVar2.zzk() != zzlcVar.zzk()) {
            this.zzl.zzd(7, new zzel() { // from class: com.google.android.gms.internal.ads.zzjk
                @Override // com.google.android.gms.internal.ads.zzel
                public final void zza(Object obj7) {
                    zzlc zzlcVar4 = zzlcVar;
                    int i21 = zzjx.zzd;
                    ((zzcm) obj7).zzc(zzlcVar4.zzk());
                }
            });
        }
        if (!zzlcVar2.zzn.equals(zzlcVar.zzn)) {
            this.zzl.zzd(12, new zzel() { // from class: com.google.android.gms.internal.ads.zzjl
                @Override // com.google.android.gms.internal.ads.zzel
                public final void zza(Object obj7) {
                    zzlc zzlcVar4 = zzlcVar;
                    int i21 = zzjx.zzd;
                    ((zzcm) obj7).zzg(zzlcVar4.zzn);
                }
            });
        }
        zzcl zzclVar = this.zzH;
        zzcp zzcpVar = this.zzg;
        zzcl zzclVar2 = this.zzc;
        int i21 = zzfj.zza;
        boolean zZzx = zzcpVar.zzx();
        zzm zzmVar = (zzm) zzcpVar;
        zzcw zzcwVarZzn3 = zzmVar.zzn();
        boolean z27 = !zzcwVarZzn3.zzo() && zzcwVarZzn3.zze(zzmVar.zzd(), zzmVar.zza, 0L).zzh;
        zzcw zzcwVarZzn4 = zzmVar.zzn();
        if (zzcwVarZzn4.zzo()) {
            i15 = -1;
            r10 = 0;
            z12 = false;
        } else {
            int iZzd2 = zzmVar.zzd();
            zzmVar.zzh();
            zzmVar.zzw();
            r10 = 0;
            r10 = 0;
            int iZzk = zzcwVarZzn4.zzk(iZzd2, 0, false);
            i15 = -1;
            z12 = iZzk != -1;
        }
        ?? Zzn = zzmVar.zzn();
        if (Zzn.zzo()) {
            r11 = r10;
        } else {
            int iZzd3 = zzmVar.zzd();
            zzmVar.zzh();
            zzmVar.zzw();
            if (Zzn.zzj(iZzd3, r10, r10) != i15) {
                r11 = 1;
            } else {
                r11 = r10;
            }
        }
        zzcw zzcwVarZzn5 = zzmVar.zzn();
        if (!zzcwVarZzn5.zzo()) {
            r411 = r11;
            j11 = 0;
            if (zzcwVarZzn5.zze(zzmVar.zzd(), zzmVar.zza, 0L).zzb()) {
                r49 = r411;
                z13 = true;
                r410 = r411;
            }
            zzcwVarZzn = zzmVar.zzn();
            if (zzcwVarZzn.zzo() && zzcwVarZzn.zze(zzmVar.zzd(), zzmVar.zza, j11).zzi) {
                z14 = true;
            } else {
                z14 = false;
            }
            zZzo = zzcpVar.zzn().zzo();
            zzcj zzcjVar = new zzcj();
            zzcjVar.zzb(zzclVar2);
            boolean z28 = !zZzx;
            zzcjVar.zzd(4, z28);
            if (z27 || zZzx) {
                z15 = false;
            } else {
                z15 = true;
            }
            zzcjVar.zzd(5, z15);
            if (z12 || zZzx) {
                z16 = false;
            } else {
                z16 = true;
            }
            zzcjVar.zzd(6, z16);
            if (!zZzo || (!(z12 || !z13 || z27) || zZzx)) {
                z17 = false;
            } else {
                z17 = true;
            }
            zzcjVar.zzd(7, z17);
            if (r410 != 0 || zZzx) {
                z18 = false;
            } else {
                z18 = true;
            }
            zzcjVar.zzd(8, z18);
            if (!zZzo || ((r410 == 0 && !(z13 && z14)) || zZzx)) {
                z19 = false;
            } else {
                z19 = true;
            }
            zzcjVar.zzd(9, z19);
            zzcjVar.zzd(10, z28);
            if (z27 || zZzx) {
                z20 = false;
            } else {
                z20 = true;
            }
            zzcjVar.zzd(11, z20);
            if (z27 || zZzx) {
                z21 = false;
            } else {
                z21 = true;
            }
            zzcjVar.zzd(12, z21);
            zzclVarZze = zzcjVar.zze();
            this.zzH = zzclVarZze;
            if (!zzclVarZze.equals(zzclVar)) {
                this.zzl.zzd(13, new zzel() { // from class: com.google.android.gms.internal.ads.zzja
                    @Override // com.google.android.gms.internal.ads.zzel
                    public final void zza(Object obj7) {
                        this.zza.zzV((zzcm) obj7);
                    }
                });
            }
            this.zzl.zzc();
            if (zzlcVar2.zzo != zzlcVar.zzo) {
                it = this.zzm.iterator();
                while (it.hasNext()) {
                    ((zzii) it.next()).zza(zzlcVar.zzo);
                }
            }
        }
        r49 = r11;
        j11 = 0;
        r49 = r411;
        z13 = false;
        r410 = r49;
        zzcwVarZzn = zzmVar.zzn();
        if (zzcwVarZzn.zzo()) {
            z14 = false;
        } else {
            z14 = false;
        }
        zZzo = zzcpVar.zzn().zzo();
        zzcj zzcjVar2 = new zzcj();
        zzcjVar2.zzb(zzclVar2);
        boolean z29 = !zZzx;
        zzcjVar2.zzd(4, z29);
        if (z27) {
            z15 = false;
        } else {
            z15 = false;
        }
        zzcjVar2.zzd(5, z15);
        if (z12) {
            z16 = false;
        } else {
            z16 = false;
        }
        zzcjVar2.zzd(6, z16);
        if (zZzo) {
            z17 = false;
        } else {
            z17 = false;
        }
        zzcjVar2.zzd(7, z17);
        if (r410 != 0) {
            z18 = false;
        } else {
            z18 = false;
        }
        zzcjVar2.zzd(8, z18);
        if (zZzo) {
            z19 = false;
        } else {
            z19 = false;
        }
        zzcjVar2.zzd(9, z19);
        zzcjVar2.zzd(10, z29);
        if (z27) {
            z20 = false;
        } else {
            z20 = false;
        }
        zzcjVar2.zzd(11, z20);
        if (z27) {
            z21 = false;
        } else {
            z21 = false;
        }
        zzcjVar2.zzd(12, z21);
        zzclVarZze = zzcjVar2.zze();
        this.zzH = zzclVarZze;
        if (!zzclVarZze.equals(zzclVar)) {
            this.zzl.zzd(13, new zzel() { // from class: com.google.android.gms.internal.ads.zzja
                @Override // com.google.android.gms.internal.ads.zzel
                public final void zza(Object obj7) {
                    this.zza.zzV((zzcm) obj7);
                }
            });
        }
        this.zzl.zzc();
        if (zzlcVar2.zzo != zzlcVar.zzo) {
            it = this.zzm.iterator();
            while (it.hasNext()) {
                ((zzii) it.next()).zza(zzlcVar.zzo);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzan() {
        int iZzf = zzf();
        if (iZzf == 2 || iZzf == 3) {
            zzao();
            boolean z10 = this.zzad.zzo;
            zzv();
            zzv();
        }
    }

    private final void zzao() {
        this.zze.zzb();
        if (Thread.currentThread() != this.zzs.getThread()) {
            String str = String.format(Locale.US, "Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.zzs.getThread().getName());
            if (this.zzY) {
                throw new IllegalStateException(str);
            }
            zzer.zzg("ExoPlayerImpl", str, this.zzZ ? null : new IllegalStateException());
            this.zzZ = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzis
    public final void zzA(zzlv zzlvVar) {
        zzao();
        this.zzr.zzO(zzlvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzis
    public final void zzB(zztq zztqVar) {
        zzao();
        List listSingletonList = Collections.singletonList(zztqVar);
        zzao();
        zzao();
        zzX(this.zzad);
        zzk();
        this.zzC++;
        if (!this.zzo.isEmpty()) {
            int size = this.zzo.size();
            for (int i10 = size - 1; i10 >= 0; i10--) {
                this.zzo.remove(i10);
            }
            this.zzah = this.zzah.zzh(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < listSingletonList.size(); i11++) {
            zzkz zzkzVar = new zzkz((zztq) listSingletonList.get(i11), this.zzp);
            arrayList.add(zzkzVar);
            this.zzo.add(i11, new zzjw(zzkzVar.zzb, zzkzVar.zza.zzB()));
        }
        this.zzah = this.zzah.zzg(0, arrayList.size());
        zzlg zzlgVar = new zzlg(this.zzo, this.zzah);
        if (!zzlgVar.zzo() && zzlgVar.zzc() < 0) {
            throw new zzan(zzlgVar, -1, -9223372036854775807L);
        }
        int iZzg = zzlgVar.zzg(false);
        zzlc zzlcVarZzae = zzae(this.zzad, zzlgVar, zzad(zzlgVar, iZzg, -9223372036854775807L));
        int i12 = zzlcVarZzae.zze;
        if (iZzg != -1 && i12 != 1) {
            i12 = (zzlgVar.zzo() || iZzg >= zzlgVar.zzc()) ? 4 : 2;
        }
        zzlc zzlcVarZzg = zzlcVarZzae.zzg(i12);
        this.zzk.zzq(arrayList, iZzg, zzfj.zzo(-9223372036854775807L), this.zzah);
        zzam(zzlcVarZzg, 0, 1, (this.zzad.zzb.zza.equals(zzlcVarZzg.zzb.zza) || this.zzad.zza.zzo()) ? false : true, 4, zzaa(zzlcVarZzg), -1, false);
    }

    public final zzih zzE() {
        zzao();
        return this.zzad.zzf;
    }

    public final /* synthetic */ void zzT(zzkf zzkfVar) {
        long j10;
        boolean z10;
        int i10 = this.zzC - zzkfVar.zzb;
        this.zzC = i10;
        boolean z11 = true;
        if (zzkfVar.zzc) {
            this.zzD = zzkfVar.zzd;
            this.zzE = true;
        }
        if (zzkfVar.zze) {
            this.zzF = zzkfVar.zzf;
        }
        if (i10 == 0) {
            zzcw zzcwVar = zzkfVar.zza.zza;
            if (!this.zzad.zza.zzo() && zzcwVar.zzo()) {
                this.zzae = -1;
                this.zzaf = 0L;
            }
            if (!zzcwVar.zzo()) {
                List listZzw = ((zzlg) zzcwVar).zzw();
                zzdy.zzf(listZzw.size() == this.zzo.size());
                for (int i11 = 0; i11 < listZzw.size(); i11++) {
                    ((zzjw) this.zzo.get(i11)).zzb = (zzcw) listZzw.get(i11);
                }
            }
            if (this.zzE) {
                if (zzkfVar.zza.zzb.equals(this.zzad.zzb) && zzkfVar.zza.zzd == this.zzad.zzr) {
                    z11 = false;
                }
                if (!z11) {
                    j10 = -9223372036854775807L;
                } else if (zzcwVar.zzo() || zzkfVar.zza.zzb.zzb()) {
                    j10 = zzkfVar.zza.zzd;
                } else {
                    zzlc zzlcVar = zzkfVar.zza;
                    zzto zztoVar = zzlcVar.zzb;
                    j10 = zzlcVar.zzd;
                    zzac(zzcwVar, zztoVar, j10);
                }
                z10 = z11;
            } else {
                j10 = -9223372036854775807L;
                z10 = false;
            }
            this.zzE = false;
            zzam(zzkfVar.zza, 1, this.zzF, z10, this.zzD, j10, -1, false);
        }
    }

    public final /* synthetic */ void zzU(final zzkf zzkfVar) {
        this.zzj.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzjd
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzT(zzkfVar);
            }
        });
    }

    public final /* synthetic */ void zzV(zzcm zzcmVar) {
        zzcmVar.zza(this.zzH);
    }

    @Override // com.google.android.gms.internal.ads.zzm
    public final void zza(int i10, long j10, int i11, boolean z10) {
        zzao();
        zzdy.zzd(i10 >= 0);
        this.zzr.zzu();
        zzcw zzcwVar = this.zzad.zza;
        if (zzcwVar.zzo() || i10 < zzcwVar.zzc()) {
            this.zzC++;
            if (zzx()) {
                zzer.zzf("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                zzkf zzkfVar = new zzkf(this.zzad);
                zzkfVar.zza(1);
                this.zzag.zza.zzU(zzkfVar);
                return;
            }
            zzlc zzlcVarZzg = this.zzad;
            int i12 = zzlcVarZzg.zze;
            if (i12 == 3 || (i12 == 4 && !zzcwVar.zzo())) {
                zzlcVarZzg = this.zzad.zzg(2);
            }
            int iZzd = zzd();
            zzlc zzlcVarZzae = zzae(zzlcVarZzg, zzcwVar, zzad(zzcwVar, i10, j10));
            this.zzk.zzl(zzcwVar, i10, zzfj.zzo(j10));
            zzam(zzlcVarZzae, 0, 1, true, 1, zzaa(zzlcVarZzae), iZzd, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final int zzb() {
        zzao();
        if (zzx()) {
            return this.zzad.zzb.zzb;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final int zzc() {
        zzao();
        if (zzx()) {
            return this.zzad.zzb.zzc;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final int zzd() {
        zzao();
        int iZzX = zzX(this.zzad);
        if (iZzX == -1) {
            return 0;
        }
        return iZzX;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final int zze() {
        zzao();
        if (this.zzad.zza.zzo()) {
            return 0;
        }
        zzlc zzlcVar = this.zzad;
        return zzlcVar.zza.zza(zzlcVar.zzb.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final int zzf() {
        zzao();
        return this.zzad.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final int zzg() {
        zzao();
        return this.zzad.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final int zzh() {
        zzao();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final long zzi() {
        zzao();
        if (zzx()) {
            zzlc zzlcVar = this.zzad;
            return zzlcVar.zzk.equals(zzlcVar.zzb) ? zzfj.zzq(this.zzad.zzp) : zzl();
        }
        zzao();
        if (this.zzad.zza.zzo()) {
            return this.zzaf;
        }
        zzlc zzlcVar2 = this.zzad;
        long j10 = 0;
        if (zzlcVar2.zzk.zzd != zzlcVar2.zzb.zzd) {
            return zzfj.zzq(zzlcVar2.zza.zze(zzd(), this.zza, 0L).zzn);
        }
        long j11 = zzlcVar2.zzp;
        if (this.zzad.zzk.zzb()) {
            zzlc zzlcVar3 = this.zzad;
            zzlcVar3.zza.zzn(zzlcVar3.zzk.zza, this.zzn).zzi(this.zzad.zzk.zzb);
        } else {
            j10 = j11;
        }
        zzlc zzlcVar4 = this.zzad;
        zzac(zzlcVar4.zza, zzlcVar4.zzk, j10);
        return zzfj.zzq(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final long zzj() {
        zzao();
        return zzZ(this.zzad);
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final long zzk() {
        zzao();
        return zzfj.zzq(zzaa(this.zzad));
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final long zzl() {
        long jZzh;
        zzao();
        if (zzx()) {
            zzlc zzlcVar = this.zzad;
            zzto zztoVar = zzlcVar.zzb;
            zzlcVar.zza.zzn(zztoVar.zza, this.zzn);
            jZzh = this.zzn.zzh(zztoVar.zzb, zztoVar.zzc);
        } else {
            zzcw zzcwVarZzn = zzn();
            if (zzcwVarZzn.zzo()) {
                return -9223372036854775807L;
            }
            jZzh = zzcwVarZzn.zze(zzd(), this.zza, 0L).zzn;
        }
        return zzfj.zzq(jZzh);
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final long zzm() {
        zzao();
        return zzfj.zzq(this.zzad.zzq);
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final zzcw zzn() {
        zzao();
        return this.zzad.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final zzdh zzo() {
        zzao();
        return this.zzad.zzi.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzp() {
        zzao();
        boolean zZzv = zzv();
        int iZzb = this.zzy.zzb(zZzv, 2);
        zzal(zZzv, iZzb, zzY(zZzv, iZzb));
        zzlc zzlcVar = this.zzad;
        if (zzlcVar.zze != 1) {
            return;
        }
        zzlc zzlcVarZzf = zzlcVar.zzf(null);
        zzlc zzlcVarZzg = zzlcVarZzf.zzg(true == zzlcVarZzf.zza.zzo() ? 4 : 2);
        this.zzC++;
        this.zzk.zzk();
        zzam(zzlcVarZzg, 1, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzq() {
        AudioTrack audioTrack;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = zzfj.zze;
        String strZza = zzbq.zza();
        StringBuilder sbA = q2.a.a("Release ", hexString, " [AndroidXMedia3/1.1.0-beta01] [", str, "] [");
        sbA.append(strZza);
        sbA.append("]");
        zzer.zze("ExoPlayerImpl", sbA.toString());
        zzao();
        if (zzfj.zza < 21 && (audioTrack = this.zzM) != null) {
            audioTrack.release();
            this.zzM = null;
        }
        this.zzy.zzd();
        if (!this.zzk.zzp()) {
            zzeo zzeoVar = this.zzl;
            zzeoVar.zzd(10, new zzel() { // from class: com.google.android.gms.internal.ads.zzje
                @Override // com.google.android.gms.internal.ads.zzel
                public final void zza(Object obj) {
                    ((zzcm) obj).zzj(zzih.zzd(new zzki(1), 1003));
                }
            });
            zzeoVar.zzc();
        }
        this.zzl.zze();
        this.zzj.zze(null);
        this.zzt.zzf(this.zzr);
        zzlc zzlcVar = this.zzad;
        if (zzlcVar.zzo) {
            this.zzad = zzlcVar.zzb();
        }
        zzlc zzlcVarZzg = this.zzad.zzg(1);
        this.zzad = zzlcVarZzg;
        zzlc zzlcVarZzc = zzlcVarZzg.zzc(zzlcVarZzg.zzb);
        this.zzad = zzlcVarZzc;
        zzlcVarZzc.zzp = zzlcVarZzc.zzr;
        this.zzad.zzq = 0L;
        this.zzr.zzN();
        this.zzi.zzi();
        Surface surface = this.zzO;
        if (surface != null) {
            surface.release();
            this.zzO = null;
        }
        this.zzX = zzdx.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzr(boolean z10) {
        zzao();
        int iZzb = this.zzy.zzb(z10, zzf());
        zzal(z10, iZzb, zzY(z10, iZzb));
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzs(Surface surface) {
        zzao();
        zzaj(surface);
        int i10 = surface == null ? 0 : -1;
        zzag(i10, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzt(float f10) {
        zzao();
        final float fMax = Math.max(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, Math.min(f10, 1.0f));
        if (this.zzV == fMax) {
            return;
        }
        this.zzV = fMax;
        zzai();
        zzeo zzeoVar = this.zzl;
        zzeoVar.zzd(22, new zzel() { // from class: com.google.android.gms.internal.ads.zzjg
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                float f11 = fMax;
                int i10 = zzjx.zzd;
                ((zzcm) obj).zzs(f11);
            }
        });
        zzeoVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzu() {
        zzao();
        this.zzy.zzb(zzv(), 1);
        zzak(null);
        this.zzX = new zzdx(zzfsc.zzl(), this.zzad.zzr);
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final boolean zzv() {
        zzao();
        return this.zzad.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final boolean zzw() {
        zzao();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final boolean zzx() {
        zzao();
        return this.zzad.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzis
    public final int zzy() {
        zzao();
        int length = this.zzh.length;
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzis
    public final void zzz(zzlv zzlvVar) {
        this.zzr.zzt(zzlvVar);
    }
}
