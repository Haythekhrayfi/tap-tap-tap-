package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.classic.Level;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes2.dex */
final class zzur implements zztm, zzaaz, zzxu, zzxz, zzvd {
    private static final Map zzb;
    private static final zzam zzc;
    private boolean zzA;
    private boolean zzC;
    private boolean zzD;
    private int zzE;
    private boolean zzF;
    private long zzG;
    private boolean zzI;
    private int zzJ;
    private boolean zzK;
    private boolean zzL;
    private final zzxt zzM;
    private final zzxp zzN;
    private final Uri zzd;
    private final zzge zze;
    private final zzqu zzf;
    private final zztx zzg;
    private final zzqo zzh;
    private final zzun zzi;
    private final long zzj;
    private final zzuh zzl;
    private zztl zzq;
    private zzadw zzr;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private zzuq zzx;
    private zzabv zzy;
    private final zzyc zzk = new zzyc("ProgressiveMediaPeriod");
    private final zzeb zzm = new zzeb(zzdz.zza);
    private final Runnable zzn = new Runnable() { // from class: com.google.android.gms.internal.ads.zzui
        @Override // java.lang.Runnable
        public final void run() {
            this.zza.zzT();
        }
    };
    private final Runnable zzo = new Runnable() { // from class: com.google.android.gms.internal.ads.zzuj
        @Override // java.lang.Runnable
        public final void run() {
            this.zza.zzD();
        }
    };
    private final Handler zzp = zzfj.zzt(null);
    private zzup[] zzt = new zzup[0];
    private zzve[] zzs = new zzve[0];
    private long zzH = -9223372036854775807L;
    private long zzz = -9223372036854775807L;
    private int zzB = 1;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        zzb = Collections.unmodifiableMap(map);
        zzak zzakVar = new zzak();
        zzakVar.zzH("icy");
        zzakVar.zzS("application/x-icy");
        zzc = zzakVar.zzY();
    }

    public zzur(Uri uri, zzge zzgeVar, zzuh zzuhVar, zzqu zzquVar, zzqo zzqoVar, zzxt zzxtVar, zztx zztxVar, zzun zzunVar, zzxp zzxpVar, String str, int i10) {
        this.zzd = uri;
        this.zze = zzgeVar;
        this.zzf = zzquVar;
        this.zzh = zzqoVar;
        this.zzM = zzxtVar;
        this.zzg = zztxVar;
        this.zzi = zzunVar;
        this.zzN = zzxpVar;
        this.zzj = i10;
        this.zzl = zzuhVar;
    }

    public static /* bridge */ /* synthetic */ void zzB(final zzur zzurVar) {
        zzurVar.zzp.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzuk
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzE();
            }
        });
    }

    private final int zzP() {
        int iZzc = 0;
        for (zzve zzveVar : this.zzs) {
            iZzc += zzveVar.zzc();
        }
        return iZzc;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    private final long zzQ(boolean z10) {
        int i10 = 0;
        long jMax = Long.MIN_VALUE;
        while (true) {
            zzve[] zzveVarArr = this.zzs;
            if (i10 >= zzveVarArr.length) {
                return jMax;
            }
            if (z10) {
                jMax = Math.max(jMax, zzveVarArr[i10].zzg());
            } else {
                zzuq zzuqVar = this.zzx;
                Objects.requireNonNull(zzuqVar);
                if (zzuqVar.zzc[i10]) {
                    jMax = Math.max(jMax, zzveVarArr[i10].zzg());
                }
            }
            i10++;
        }
    }

    private final zzabz zzR(zzup zzupVar) {
        int length = this.zzs.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (zzupVar.equals(this.zzt[i10])) {
                return this.zzs[i10];
            }
        }
        zzve zzveVar = new zzve(this.zzN, this.zzf, this.zzh);
        zzveVar.zzu(this);
        int i11 = length + 1;
        zzup[] zzupVarArr = (zzup[]) Arrays.copyOf(this.zzt, i11);
        zzupVarArr[length] = zzupVar;
        int i12 = zzfj.zza;
        this.zzt = zzupVarArr;
        zzve[] zzveVarArr = (zzve[]) Arrays.copyOf(this.zzs, i11);
        zzveVarArr[length] = zzveVar;
        this.zzs = zzveVarArr;
        return zzveVar;
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    private final void zzS() {
        zzdy.zzf(this.zzv);
        Objects.requireNonNull(this.zzx);
        Objects.requireNonNull(this.zzy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzT() {
        int i10;
        if (this.zzL || this.zzv || !this.zzu || this.zzy == null) {
            return;
        }
        for (zzve zzveVar : this.zzs) {
            if (zzveVar.zzh() == null) {
                return;
            }
        }
        this.zzm.zzc();
        int length = this.zzs.length;
        zzcy[] zzcyVarArr = new zzcy[length];
        boolean[] zArr = new boolean[length];
        for (int i11 = 0; i11 < length; i11++) {
            zzam zzamVarZzh = this.zzs[i11].zzh();
            Objects.requireNonNull(zzamVarZzh);
            String str = zzamVarZzh.zzm;
            boolean zZzf = zzcc.zzf(str);
            boolean z10 = zZzf || zzcc.zzg(str);
            zArr[i11] = z10;
            this.zzw = z10 | this.zzw;
            zzadw zzadwVar = this.zzr;
            if (zzadwVar != null) {
                if (zZzf || this.zzt[i11].zzb) {
                    zzbz zzbzVar = zzamVarZzh.zzk;
                    zzbz zzbzVar2 = zzbzVar == null ? new zzbz(-9223372036854775807L, zzadwVar) : zzbzVar.zzc(zzadwVar);
                    zzak zzakVarZzb = zzamVarZzh.zzb();
                    zzakVarZzb.zzM(zzbzVar2);
                    zzamVarZzh = zzakVarZzb.zzY();
                }
                if (zZzf && zzamVarZzh.zzg == -1 && zzamVarZzh.zzh == -1 && (i10 = zzadwVar.zza) != -1) {
                    zzak zzakVarZzb2 = zzamVarZzh.zzb();
                    zzakVarZzb2.zzv(i10);
                    zzamVarZzh = zzakVarZzb2.zzY();
                }
            }
            zzcyVarArr[i11] = new zzcy(Integer.toString(i11), zzamVarZzh.zzc(this.zzf.zza(zzamVarZzh)));
        }
        this.zzx = new zzuq(new zzvn(zzcyVarArr), zArr);
        this.zzv = true;
        zztl zztlVar = this.zzq;
        Objects.requireNonNull(zztlVar);
        zztlVar.zzi(this);
    }

    private final void zzU(int i10) {
        zzS();
        zzuq zzuqVar = this.zzx;
        boolean[] zArr = zzuqVar.zzd;
        if (zArr[i10]) {
            return;
        }
        zzam zzamVarZzb = zzuqVar.zza.zzb(i10).zzb(0);
        this.zzg.zzc(new zztk(1, zzcc.zzb(zzamVarZzb.zzm), zzamVarZzb, 0, null, zzfj.zzq(this.zzG), -9223372036854775807L));
        zArr[i10] = true;
    }

    private final void zzV(int i10) {
        zzS();
        boolean[] zArr = this.zzx.zzb;
        if (this.zzI && zArr[i10] && !this.zzs[i10].zzx(false)) {
            this.zzH = 0L;
            this.zzI = false;
            this.zzD = true;
            this.zzG = 0L;
            this.zzJ = 0;
            for (zzve zzveVar : this.zzs) {
                zzveVar.zzp(false);
            }
            zztl zztlVar = this.zzq;
            Objects.requireNonNull(zztlVar);
            zztlVar.zzg(this);
        }
    }

    private final void zzW() {
        zzum zzumVar = new zzum(this, this.zzd, this.zze, this.zzl, this, this.zzm);
        if (this.zzv) {
            zzdy.zzf(zzX());
            long j10 = this.zzz;
            if (j10 != -9223372036854775807L && this.zzH > j10) {
                this.zzK = true;
                this.zzH = -9223372036854775807L;
                return;
            }
            zzabv zzabvVar = this.zzy;
            Objects.requireNonNull(zzabvVar);
            zzum.zzf(zzumVar, zzabvVar.zzg(this.zzH).zza.zzc, this.zzH);
            for (zzve zzveVar : this.zzs) {
                zzveVar.zzt(this.zzH);
            }
            this.zzH = -9223372036854775807L;
        }
        this.zzJ = zzP();
        long jZza = this.zzk.zza(zzumVar, this, zzxt.zza(this.zzB));
        zzgj zzgjVar = zzumVar.zzl;
        this.zzg.zzg(new zztf(zzumVar.zzb, zzgjVar, zzgjVar.zza, Collections.emptyMap(), jZza, 0L, 0L), new zztk(1, -1, null, 0, null, zzfj.zzq(zzumVar.zzk), zzfj.zzq(this.zzz)));
    }

    private final boolean zzX() {
        return this.zzH != -9223372036854775807L;
    }

    private final boolean zzY() {
        return this.zzD || zzX();
    }

    public static /* bridge */ /* synthetic */ long zzq(zzur zzurVar, boolean z10) {
        return zzurVar.zzQ(true);
    }

    @Override // com.google.android.gms.internal.ads.zzaaz
    public final void zzC() {
        this.zzu = true;
        this.zzp.post(this.zzn);
    }

    public final /* synthetic */ void zzD() {
        if (this.zzL) {
            return;
        }
        zztl zztlVar = this.zzq;
        Objects.requireNonNull(zztlVar);
        zztlVar.zzg(this);
    }

    public final /* synthetic */ void zzE() {
        this.zzF = true;
    }

    public final /* synthetic */ void zzF(zzabv zzabvVar) {
        this.zzy = this.zzr == null ? zzabvVar : new zzabu(-9223372036854775807L, 0L);
        this.zzz = zzabvVar.zze();
        boolean z10 = false;
        if (!this.zzF && zzabvVar.zze() == -9223372036854775807L) {
            z10 = true;
        }
        this.zzA = z10;
        this.zzB = true == z10 ? 7 : 1;
        this.zzi.zza(this.zzz, zzabvVar.zzh(), this.zzA);
        if (this.zzv) {
            return;
        }
        zzT();
    }

    public final void zzG() throws IOException {
        this.zzk.zzi(zzxt.zza(this.zzB));
    }

    public final void zzH(int i10) throws IOException {
        this.zzs[i10].zzm();
        zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzxu
    public final /* bridge */ /* synthetic */ void zzI(zzxy zzxyVar, long j10, long j11, boolean z10) {
        zzum zzumVar = (zzum) zzxyVar;
        zzhf zzhfVar = zzumVar.zzd;
        zztf zztfVar = new zztf(zzumVar.zzb, zzumVar.zzl, zzhfVar.zzh(), zzhfVar.zzi(), j10, j11, zzhfVar.zzg());
        long unused = zzumVar.zzb;
        this.zzg.zzd(zztfVar, new zztk(1, -1, null, 0, null, zzfj.zzq(zzumVar.zzk), zzfj.zzq(this.zzz)));
        if (z10) {
            return;
        }
        for (zzve zzveVar : this.zzs) {
            zzveVar.zzp(false);
        }
        if (this.zzE > 0) {
            zztl zztlVar = this.zzq;
            Objects.requireNonNull(zztlVar);
            zztlVar.zzg(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxu
    public final /* bridge */ /* synthetic */ void zzJ(zzxy zzxyVar, long j10, long j11) {
        zzabv zzabvVar;
        if (this.zzz == -9223372036854775807L && (zzabvVar = this.zzy) != null) {
            boolean zZzh = zzabvVar.zzh();
            long jZzQ = zzQ(true);
            long j12 = jZzQ == Long.MIN_VALUE ? 0L : jZzQ + AbstractComponentTracker.LINGERING_TIMEOUT;
            this.zzz = j12;
            this.zzi.zza(j12, zZzh, this.zzA);
        }
        zzum zzumVar = (zzum) zzxyVar;
        zzhf zzhfVar = zzumVar.zzd;
        zztf zztfVar = new zztf(zzumVar.zzb, zzumVar.zzl, zzhfVar.zzh(), zzhfVar.zzi(), j10, j11, zzhfVar.zzg());
        long unused = zzumVar.zzb;
        this.zzg.zze(zztfVar, new zztk(1, -1, null, 0, null, zzfj.zzq(zzumVar.zzk), zzfj.zzq(this.zzz)));
        this.zzK = true;
        zztl zztlVar = this.zzq;
        Objects.requireNonNull(zztlVar);
        zztlVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final void zzK() {
        for (zzve zzveVar : this.zzs) {
            zzveVar.zzo();
        }
        this.zzl.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzvd
    public final void zzL(zzam zzamVar) {
        this.zzp.post(this.zzn);
    }

    public final void zzM() {
        if (this.zzv) {
            for (zzve zzveVar : this.zzs) {
                zzveVar.zzn();
            }
        }
        this.zzk.zzj(this);
        this.zzp.removeCallbacksAndMessages(null);
        this.zzq = null;
        this.zzL = true;
    }

    @Override // com.google.android.gms.internal.ads.zzaaz
    public final void zzN(final zzabv zzabvVar) {
        this.zzp.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzul
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzF(zzabvVar);
            }
        });
    }

    public final boolean zzO(int i10) {
        return !zzY() && this.zzs[i10].zzx(this.zzK);
    }

    @Override // com.google.android.gms.internal.ads.zztm
    public final long zza(long j10, zzlm zzlmVar) {
        zzS();
        if (!this.zzy.zzh()) {
            return 0L;
        }
        zzabt zzabtVarZzg = this.zzy.zzg(j10);
        long j11 = zzabtVarZzg.zza.zzb;
        long j12 = zzabtVarZzg.zzb.zzb;
        long j13 = zzlmVar.zzf;
        if (j13 == 0) {
            if (zzlmVar.zzg == 0) {
                return j10;
            }
            j13 = 0;
        }
        int i10 = zzfj.zza;
        long j14 = j10 - j13;
        long j15 = zzlmVar.zzg;
        long j16 = j10 + j15;
        long j17 = j10 ^ j16;
        long j18 = j15 ^ j16;
        if (((j13 ^ j10) & (j10 ^ j14)) < 0) {
            j14 = Long.MIN_VALUE;
        }
        if ((j17 & j18) < 0) {
            j16 = RecyclerView.FOREVER_NS;
        }
        boolean z10 = j14 <= j11 && j11 <= j16;
        boolean z11 = j14 <= j12 && j12 <= j16;
        if (z10 && z11) {
            if (Math.abs(j11 - j10) > Math.abs(j12 - j10)) {
                return j12;
            }
        } else if (!z10) {
            return z11 ? j12 : j14;
        }
        return j11;
    }

    @Override // com.google.android.gms.internal.ads.zztm, com.google.android.gms.internal.ads.zzvh
    public final long zzb() {
        long jZzQ;
        zzS();
        if (this.zzK || this.zzE == 0) {
            return Long.MIN_VALUE;
        }
        if (zzX()) {
            return this.zzH;
        }
        if (this.zzw) {
            int length = this.zzs.length;
            jZzQ = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                zzuq zzuqVar = this.zzx;
                if (zzuqVar.zzb[i10] && zzuqVar.zzc[i10] && !this.zzs[i10].zzw()) {
                    jZzQ = Math.min(jZzQ, this.zzs[i10].zzg());
                }
            }
        } else {
            jZzQ = Long.MAX_VALUE;
        }
        if (jZzQ == RecyclerView.FOREVER_NS) {
            jZzQ = zzQ(false);
        }
        return jZzQ == Long.MIN_VALUE ? this.zzG : jZzQ;
    }

    @Override // com.google.android.gms.internal.ads.zztm, com.google.android.gms.internal.ads.zzvh
    public final long zzc() {
        return zzb();
    }

    @Override // com.google.android.gms.internal.ads.zztm
    public final long zzd() {
        if (!this.zzD) {
            return -9223372036854775807L;
        }
        if (!this.zzK && zzP() <= this.zzJ) {
            return -9223372036854775807L;
        }
        this.zzD = false;
        return this.zzG;
    }

    @Override // com.google.android.gms.internal.ads.zztm
    public final long zze(long j10) {
        zzS();
        boolean[] zArr = this.zzx.zzb;
        if (true != this.zzy.zzh()) {
            j10 = 0;
        }
        this.zzD = false;
        this.zzG = j10;
        if (zzX()) {
            this.zzH = j10;
            return j10;
        }
        if (this.zzB != 7) {
            int length = this.zzs.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (this.zzs[i10].zzy(j10, false) || (!zArr[i10] && this.zzw)) {
                }
            }
            return j10;
        }
        this.zzI = false;
        this.zzH = j10;
        this.zzK = false;
        zzyc zzycVar = this.zzk;
        if (zzycVar.zzl()) {
            for (zzve zzveVar : this.zzs) {
                zzveVar.zzj();
            }
            this.zzk.zzg();
        } else {
            zzycVar.zzh();
            for (zzve zzveVar2 : this.zzs) {
                zzveVar2.zzp(false);
            }
        }
        return j10;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0045  */
    @Override // com.google.android.gms.internal.ads.zztm
    public final long zzf(zzxa[] zzxaVarArr, boolean[] zArr, zzvf[] zzvfVarArr, boolean[] zArr2, long j10) {
        boolean z10;
        zzxa zzxaVar;
        zzS();
        zzuq zzuqVar = this.zzx;
        zzvn zzvnVar = zzuqVar.zza;
        boolean[] zArr3 = zzuqVar.zzc;
        int i10 = this.zzE;
        int i11 = 0;
        for (int i12 = 0; i12 < zzxaVarArr.length; i12++) {
            zzvf zzvfVar = zzvfVarArr[i12];
            if (zzvfVar != null && (zzxaVarArr[i12] == null || !zArr[i12])) {
                int i13 = ((zzuo) zzvfVar).zzb;
                zzdy.zzf(zArr3[i13]);
                this.zzE--;
                zArr3[i13] = false;
                zzvfVarArr[i12] = null;
            }
        }
        if (this.zzC) {
            if (i10 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else if (j10 != 0) {
            z10 = true;
        } else {
            z10 = false;
            j10 = 0;
        }
        for (int i14 = 0; i14 < zzxaVarArr.length; i14++) {
            if (zzvfVarArr[i14] == null && (zzxaVar = zzxaVarArr[i14]) != null) {
                zzdy.zzf(zzxaVar.zzc() == 1);
                zzdy.zzf(zzxaVar.zza(0) == 0);
                int iZza = zzvnVar.zza(zzxaVar.zze());
                zzdy.zzf(!zArr3[iZza]);
                this.zzE++;
                zArr3[iZza] = true;
                zzvfVarArr[i14] = new zzuo(this, iZza);
                zArr2[i14] = true;
                if (!z10) {
                    zzve zzveVar = this.zzs[iZza];
                    z10 = (zzveVar.zzy(j10, true) || zzveVar.zza() == 0) ? false : true;
                }
            }
        }
        if (this.zzE == 0) {
            this.zzI = false;
            this.zzD = false;
            if (this.zzk.zzl()) {
                zzve[] zzveVarArr = this.zzs;
                int length = zzveVarArr.length;
                while (i11 < length) {
                    zzveVarArr[i11].zzj();
                    i11++;
                }
                this.zzk.zzg();
            } else {
                for (zzve zzveVar2 : this.zzs) {
                    zzveVar2.zzp(false);
                }
            }
        } else if (z10) {
            j10 = zze(j10);
            while (i11 < zzvfVarArr.length) {
                if (zzvfVarArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.zzC = true;
        return j10;
    }

    public final int zzg(int i10, zzkj zzkjVar, zzhp zzhpVar, int i11) {
        if (zzY()) {
            return -3;
        }
        zzU(i10);
        int iZzd = this.zzs[i10].zzd(zzkjVar, zzhpVar, i11, this.zzK);
        if (iZzd == -3) {
            zzV(i10);
        }
        return iZzd;
    }

    @Override // com.google.android.gms.internal.ads.zztm
    public final zzvn zzh() {
        zzS();
        return this.zzx.zza;
    }

    public final int zzi(int i10, long j10) {
        if (zzY()) {
            return 0;
        }
        zzU(i10);
        zzve zzveVar = this.zzs[i10];
        int iZzb = zzveVar.zzb(j10, this.zzK);
        zzveVar.zzv(iZzb);
        if (iZzb != 0) {
            return iZzb;
        }
        zzV(i10);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zztm
    public final void zzj(long j10, boolean z10) {
        zzS();
        if (zzX()) {
            return;
        }
        boolean[] zArr = this.zzx.zzc;
        int length = this.zzs.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.zzs[i10].zzi(j10, false, zArr[i10]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztm
    public final void zzk() throws IOException {
        zzG();
        if (this.zzK && !this.zzv) {
            throw zzcd.zza("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztm
    public final void zzl(zztl zztlVar, long j10) {
        this.zzq = zztlVar;
        this.zzm.zze();
        zzW();
    }

    @Override // com.google.android.gms.internal.ads.zztm, com.google.android.gms.internal.ads.zzvh
    public final void zzm(long j10) {
    }

    @Override // com.google.android.gms.internal.ads.zztm, com.google.android.gms.internal.ads.zzvh
    public final boolean zzo(long j10) {
        if (this.zzK || this.zzk.zzk() || this.zzI) {
            return false;
        }
        if (this.zzv && this.zzE == 0) {
            return false;
        }
        boolean zZze = this.zzm.zze();
        if (this.zzk.zzl()) {
            return zZze;
        }
        zzW();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zztm, com.google.android.gms.internal.ads.zzvh
    public final boolean zzp() {
        return this.zzk.zzl() && this.zzm.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzxu
    public final /* bridge */ /* synthetic */ zzxw zzt(zzxy zzxyVar, long j10, long j11, IOException iOException, int i10) {
        long jMin;
        zzxw zzxwVarZzb;
        zzabv zzabvVar;
        zzum zzumVar = (zzum) zzxyVar;
        zzhf zzhfVar = zzumVar.zzd;
        zztf zztfVar = new zztf(zzumVar.zzb, zzumVar.zzl, zzhfVar.zzh(), zzhfVar.zzi(), j10, j11, zzhfVar.zzg());
        long unused = zzumVar.zzk;
        int i11 = zzfj.zza;
        if ((iOException instanceof zzcd) || (iOException instanceof FileNotFoundException) || (iOException instanceof zzgw) || (iOException instanceof zzyb)) {
            jMin = -9223372036854775807L;
            break;
        }
        Throwable cause = iOException;
        while (true) {
            if (cause == null) {
                jMin = Math.min((i10 - 1) * 1000, Level.TRACE_INT);
                break;
            }
            if ((cause instanceof zzgf) && ((zzgf) cause).zza == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
            cause = cause.getCause();
        }
        if (jMin == -9223372036854775807L) {
            zzxwVarZzb = zzyc.zzd;
        } else {
            int iZzP = zzP();
            boolean z10 = iZzP > this.zzJ;
            if (this.zzF || !((zzabvVar = this.zzy) == null || zzabvVar.zze() == -9223372036854775807L)) {
                this.zzJ = iZzP;
            } else {
                boolean z11 = this.zzv;
                if (!z11 || zzY()) {
                    this.zzD = z11;
                    this.zzG = 0L;
                    this.zzJ = 0;
                    for (zzve zzveVar : this.zzs) {
                        zzveVar.zzp(false);
                    }
                    zzum.zzf(zzumVar, 0L, 0L);
                } else {
                    this.zzI = true;
                    zzxwVarZzb = zzyc.zzc;
                }
            }
            zzxwVarZzb = zzyc.zzb(z10, jMin);
        }
        boolean z12 = !zzxwVarZzb.zzc();
        this.zzg.zzf(zztfVar, new zztk(1, -1, null, 0, null, zzfj.zzq(zzumVar.zzk), zzfj.zzq(this.zzz)), iOException, z12);
        if (z12) {
            long unused2 = zzumVar.zzb;
        }
        return zzxwVarZzb;
    }

    public final zzabz zzu() {
        return zzR(new zzup(0, true));
    }

    @Override // com.google.android.gms.internal.ads.zzaaz
    public final zzabz zzv(int i10, int i11) {
        return zzR(new zzup(i10, false));
    }
}
