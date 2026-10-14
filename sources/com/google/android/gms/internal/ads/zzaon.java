package com.google.android.gms.internal.ads;

import ch.qos.logback.core.util.FileUtil;
import java.util.Objects;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaon extends zzgpm implements zzgqx {
    private static final zzaon zzb;
    private long zzA;
    private long zzB;
    private long zzF;
    private long zzG;
    private long zzH;
    private long zzJ;
    private zzaop zzM;
    private zzaoi zzaC;
    private long zzaI;
    private zzanz zzaL;
    private zzaob zzaM;
    private int zzaP;
    private long zzaQ;
    private boolean zzaT;
    private long zzaV;
    private zzaow zzaW;
    private zzaok zzae;
    private zzaom zzag;
    private int zzar;
    private int zzas;
    private int zzat;
    private zzaoy zzau;
    private int zzd;
    private int zze;
    private int zzf;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private long zzr;
    private long zzt;
    private long zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;
    private String zzg = "";
    private String zzh = "";
    private String zzs = "";
    private String zzC = "";
    private String zzD = "D";
    private String zzE = "";
    private String zzI = "";
    private long zzK = -1;
    private long zzL = -1;
    private long zzN = -1;
    private long zzO = -1;
    private long zzP = -1;
    private long zzQ = -1;
    private long zzR = -1;
    private long zzS = -1;
    private String zzT = "D";
    private String zzU = "D";
    private long zzV = -1;
    private int zzW = 1000;
    private int zzX = 1000;
    private long zzY = -1;
    private long zzZ = -1;
    private long zzaa = -1;
    private long zzab = -1;
    private long zzac = -1;
    private int zzad = 1000;
    private zzgpv zzaf = zzgpm.zzaN();
    private long zzah = -1;
    private long zzai = -1;
    private long zzaj = -1;
    private long zzak = -1;
    private long zzal = -1;
    private long zzam = -1;
    private long zzan = -1;
    private long zzao = -1;
    private String zzap = "D";
    private long zzaq = -1;
    private long zzav = -1;
    private int zzaw = 1000;
    private int zzax = 1000;
    private String zzay = "D";
    private zzgpv zzaz = zzgpm.zzaN();
    private int zzaA = 1000;
    private zzgpv zzaB = zzgpm.zzaN();
    private String zzaD = "";
    private long zzaE = -1;
    private long zzaF = -1;
    private long zzaG = -1;
    private long zzaH = -1;
    private long zzaJ = -1;
    private String zzaK = "";
    private long zzaN = -1;
    private long zzaO = -1;
    private String zzaR = "";
    private int zzaS = 2;
    private String zzaU = "";
    private long zzaX = -1;
    private String zzaY = "";

    static {
        zzaon zzaonVar = new zzaon();
        zzb = zzaonVar;
        zzgpm.zzaU(zzaon.class, zzaonVar);
    }

    private zzaon() {
    }

    public static /* synthetic */ void zzA(zzaon zzaonVar, long j10) {
        zzaonVar.zzd |= 134217728;
        zzaonVar.zzH = j10;
    }

    public static /* synthetic */ void zzB(zzaon zzaonVar, String str) {
        Objects.requireNonNull(str);
        zzaonVar.zzd |= 268435456;
        zzaonVar.zzI = str;
    }

    public static /* synthetic */ void zzC(zzaon zzaonVar, long j10) {
        zzaonVar.zzd |= 536870912;
        zzaonVar.zzJ = j10;
    }

    public static /* synthetic */ void zzD(zzaon zzaonVar, long j10) {
        zzaonVar.zzd |= 1073741824;
        zzaonVar.zzK = j10;
    }

    public static /* synthetic */ void zzE(zzaon zzaonVar, long j10) {
        zzaonVar.zzd |= Integer.MIN_VALUE;
        zzaonVar.zzL = j10;
    }

    public static /* synthetic */ void zzF(zzaon zzaonVar, long j10) {
        zzaonVar.zze |= 2;
        zzaonVar.zzN = j10;
    }

    public static /* synthetic */ void zzG(zzaon zzaonVar, long j10) {
        zzaonVar.zze |= 4;
        zzaonVar.zzO = j10;
    }

    public static /* synthetic */ void zzH(zzaon zzaonVar, long j10) {
        zzaonVar.zze |= 8;
        zzaonVar.zzP = j10;
    }

    public static /* synthetic */ void zzI(zzaon zzaonVar, long j10) {
        zzaonVar.zze |= 16;
        zzaonVar.zzQ = j10;
    }

    public static /* synthetic */ void zzJ(zzaon zzaonVar, long j10) {
        zzaonVar.zze |= 32;
        zzaonVar.zzR = j10;
    }

    public static /* synthetic */ void zzK(zzaon zzaonVar, long j10) {
        zzaonVar.zze |= 64;
        zzaonVar.zzS = j10;
    }

    public static /* synthetic */ void zzL(zzaon zzaonVar, String str) {
        Objects.requireNonNull(str);
        zzaonVar.zze |= 128;
        zzaonVar.zzT = str;
    }

    public static /* synthetic */ void zzM(zzaon zzaonVar, String str) {
        Objects.requireNonNull(str);
        zzaonVar.zze |= 256;
        zzaonVar.zzU = str;
    }

    public static /* synthetic */ void zzN(zzaon zzaonVar, long j10) {
        zzaonVar.zze |= 4096;
        zzaonVar.zzY = j10;
    }

    public static /* synthetic */ void zzO(zzaon zzaonVar, long j10) {
        zzaonVar.zze |= 8192;
        zzaonVar.zzZ = j10;
    }

    public static /* synthetic */ void zzP(zzaon zzaonVar, long j10) {
        zzaonVar.zze |= Http2.INITIAL_MAX_FRAME_SIZE;
        zzaonVar.zzaa = j10;
    }

    public static /* synthetic */ void zzQ(zzaon zzaonVar, zzaok zzaokVar) {
        Objects.requireNonNull(zzaokVar);
        zzaonVar.zzae = zzaokVar;
        zzaonVar.zze |= 262144;
    }

    public static /* synthetic */ void zzR(zzaon zzaonVar, zzaok zzaokVar) {
        Objects.requireNonNull(zzaokVar);
        zzgpv zzgpvVar = zzaonVar.zzaf;
        if (!zzgpvVar.zzc()) {
            zzaonVar.zzaf = zzgpm.zzaO(zzgpvVar);
        }
        zzaonVar.zzaf.add(zzaokVar);
    }

    public static /* synthetic */ void zzT(zzaon zzaonVar, zzaom zzaomVar) {
        Objects.requireNonNull(zzaomVar);
        zzaonVar.zzag = zzaomVar;
        zzaonVar.zze |= 524288;
    }

    public static /* synthetic */ void zzU(zzaon zzaonVar, long j10) {
        zzaonVar.zze |= 2097152;
        zzaonVar.zzai = j10;
    }

    public static /* synthetic */ void zzV(zzaon zzaonVar, long j10) {
        zzaonVar.zze |= 4194304;
        zzaonVar.zzaj = j10;
    }

    public static /* synthetic */ void zzW(zzaon zzaonVar, long j10) {
        zzaonVar.zze |= 8388608;
        zzaonVar.zzak = j10;
    }

    public static /* synthetic */ void zzX(zzaon zzaonVar, long j10) {
        zzaonVar.zze |= 67108864;
        zzaonVar.zzan = j10;
    }

    public static /* synthetic */ void zzY(zzaon zzaonVar, long j10) {
        zzaonVar.zze |= 134217728;
        zzaonVar.zzao = j10;
    }

    public static /* synthetic */ void zzZ(zzaon zzaonVar, String str) {
        Objects.requireNonNull(str);
        zzaonVar.zze |= 268435456;
        zzaonVar.zzap = str;
    }

    public static zzanq zza() {
        return (zzanq) zzb.zzaA();
    }

    public static /* synthetic */ void zzaa(zzaon zzaonVar, long j10) {
        zzaonVar.zzf |= 512;
        zzaonVar.zzaE = j10;
    }

    public static /* synthetic */ void zzab(zzaon zzaonVar, long j10) {
        zzaonVar.zzf |= 1024;
        zzaonVar.zzaF = j10;
    }

    public static /* synthetic */ void zzac(zzaon zzaonVar, long j10) {
        zzaonVar.zzf |= 2048;
        zzaonVar.zzaG = j10;
    }

    public static /* synthetic */ void zzad(zzaon zzaonVar, long j10) {
        zzaonVar.zzf |= 4096;
        zzaonVar.zzaH = j10;
    }

    public static /* synthetic */ void zzae(zzaon zzaonVar, String str) {
        Objects.requireNonNull(str);
        zzaonVar.zzf |= FileUtil.BUF_SIZE;
        zzaonVar.zzaK = str;
    }

    public static /* synthetic */ void zzaf(zzaon zzaonVar, String str) {
        Objects.requireNonNull(str);
        zzaonVar.zzf |= 4194304;
        zzaonVar.zzaR = str;
    }

    public static /* synthetic */ void zzag(zzaon zzaonVar, boolean z10) {
        zzaonVar.zzf |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        zzaonVar.zzaT = z10;
    }

    public static /* synthetic */ void zzah(zzaon zzaonVar, long j10) {
        zzaonVar.zzf |= 67108864;
        zzaonVar.zzaV = j10;
    }

    public static /* synthetic */ void zzam(zzaon zzaonVar, int i10) {
        zzaonVar.zzW = i10 - 1;
        zzaonVar.zze |= 1024;
    }

    public static /* synthetic */ void zzan(zzaon zzaonVar, int i10) {
        zzaonVar.zzX = i10 - 1;
        zzaonVar.zze |= 2048;
    }

    public static /* synthetic */ void zzao(zzaon zzaonVar, int i10) {
        zzaonVar.zzad = i10 - 1;
        zzaonVar.zze |= 131072;
    }

    public static /* synthetic */ void zzap(zzaon zzaonVar, int i10) {
        zzaonVar.zzaw = i10 - 1;
        zzaonVar.zzf |= 8;
    }

    public static /* synthetic */ void zzaq(zzaon zzaonVar, int i10) {
        zzaonVar.zzax = i10 - 1;
        zzaonVar.zzf |= 16;
    }

    public static /* synthetic */ void zzar(zzaon zzaonVar, int i10) {
        zzaonVar.zzaP = i10 - 1;
        zzaonVar.zzf |= 1048576;
    }

    public static /* synthetic */ void zzas(zzaon zzaonVar, int i10) {
        zzaonVar.zzaS = 5;
        zzaonVar.zzf |= 8388608;
    }

    public static zzaon zzd() {
        return zzb;
    }

    public static zzaon zze(byte[] bArr, zzgoy zzgoyVar) throws zzgpy {
        return (zzaon) zzgpm.zzaI(zzb, bArr, zzgoyVar);
    }

    public static /* synthetic */ void zzi(zzaon zzaonVar, String str) {
        Objects.requireNonNull(str);
        zzaonVar.zzd |= 1;
        zzaonVar.zzg = str;
    }

    public static /* synthetic */ void zzj(zzaon zzaonVar, String str) {
        Objects.requireNonNull(str);
        zzaonVar.zzd |= 2;
        zzaonVar.zzh = str;
    }

    public static /* synthetic */ void zzk(zzaon zzaonVar, long j10) {
        zzaonVar.zzd |= 4;
        zzaonVar.zzi = j10;
    }

    public static /* synthetic */ void zzl(zzaon zzaonVar, long j10) {
        zzaonVar.zzd |= 16;
        zzaonVar.zzk = j10;
    }

    public static /* synthetic */ void zzm(zzaon zzaonVar, long j10) {
        zzaonVar.zzd |= 32;
        zzaonVar.zzl = j10;
    }

    public static /* synthetic */ void zzn(zzaon zzaonVar, long j10) {
        zzaonVar.zzd |= 1024;
        zzaonVar.zzq = j10;
    }

    public static /* synthetic */ void zzo(zzaon zzaonVar, long j10) {
        zzaonVar.zzd |= 2048;
        zzaonVar.zzr = j10;
    }

    public static /* synthetic */ void zzp(zzaon zzaonVar, long j10) {
        zzaonVar.zzd |= 8192;
        zzaonVar.zzt = j10;
    }

    public static /* synthetic */ void zzq(zzaon zzaonVar, long j10) {
        zzaonVar.zzd |= Http2.INITIAL_MAX_FRAME_SIZE;
        zzaonVar.zzu = j10;
    }

    public static /* synthetic */ void zzr(zzaon zzaonVar, long j10) {
        zzaonVar.zzd |= FileUtil.BUF_SIZE;
        zzaonVar.zzv = j10;
    }

    public static /* synthetic */ void zzs(zzaon zzaonVar, long j10) {
        zzaonVar.zzd |= 65536;
        zzaonVar.zzw = j10;
    }

    public static /* synthetic */ void zzt(zzaon zzaonVar, long j10) {
        zzaonVar.zzd |= 524288;
        zzaonVar.zzz = j10;
    }

    public static /* synthetic */ void zzu(zzaon zzaonVar, long j10) {
        zzaonVar.zzd |= 1048576;
        zzaonVar.zzA = j10;
    }

    public static /* synthetic */ void zzv(zzaon zzaonVar, long j10) {
        zzaonVar.zzd |= 2097152;
        zzaonVar.zzB = j10;
    }

    public static /* synthetic */ void zzw(zzaon zzaonVar, String str) {
        Objects.requireNonNull(str);
        zzaonVar.zzd |= 4194304;
        zzaonVar.zzC = str;
    }

    public static /* synthetic */ void zzx(zzaon zzaonVar, String str) {
        Objects.requireNonNull(str);
        zzaonVar.zzd |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        zzaonVar.zzE = str;
    }

    public static /* synthetic */ void zzy(zzaon zzaonVar, long j10) {
        zzaonVar.zzd |= 33554432;
        zzaonVar.zzF = j10;
    }

    public static /* synthetic */ void zzz(zzaon zzaonVar, long j10) {
        zzaonVar.zzd |= 67108864;
        zzaonVar.zzG = j10;
    }

    public final boolean zzai() {
        return this.zzaT;
    }

    public final boolean zzaj() {
        return (this.zzd & 4194304) != 0;
    }

    public final boolean zzak() {
        return (this.zzf & 134217728) != 0;
    }

    public final int zzal() {
        int iZza = zzanw.zza(this.zzaS);
        if (iZza == 0) {
            return 3;
        }
        return iZza;
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            zzgpq zzgpqVar = zzaot.zza;
            return zzgpm.zzaR(zzb, "\u0001a\u0000\u0003\u0001Įa\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂU\u0016ဂ\u0014\u0017ဂ\u0015\u0018ဈV\u0019ဂZ\u001a᠌W\u001bဈ\u0016\u001cဇX\u001dဈ\u0018\u001eဈY\u001fဂ\u0019 ဂ\u001a!ဂ\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဂ\u001f&ဉ 'ဂ!(ဂ\")ဂ#*ဂ$+\u001b,ဂ%-ဂ&.ဈ'/ဈ(0᠌*1᠌+2ဉ23ဂ,4ဂ-5ဂ.6ဂ/7ဂ08᠌19ဉ3:ဂ4;ဂ5<ဂ6=ဂ7>ဂ:?ဂ;@ဂ=A᠌>B᠌?Cဈ<D᠌@EဉAFဂBGဂ8Hဂ9I᠌CJဂ)Kဈ\u0017L᠌DMဈEN\u001bO᠌FP\u001bQဉGRဈHSဂITဂJUဂKVဂLWဂMXဂNYဈOZဉP[ဉQ\\ဂR]ဂS^᠌TÉဉ[ĭဂ\\Įဈ]", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzaQ", "zzA", "zzB", "zzaR", "zzaV", "zzaS", zzanv.zza, "zzC", "zzaT", "zzE", "zzaU", "zzF", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzaf", zzaok.class, "zzR", "zzS", "zzT", "zzU", "zzW", zzgpqVar, "zzX", zzgpqVar, "zzae", "zzY", "zzZ", "zzaa", "zzab", "zzac", "zzad", zzgpqVar, "zzag", "zzah", "zzai", "zzaj", "zzak", "zzan", "zzao", "zzaq", "zzar", zzaos.zza, "zzas", zzaou.zza, "zzap", "zzat", zzanr.zza, "zzau", "zzav", "zzal", "zzam", "zzaw", zzgpqVar, "zzV", "zzD", "zzax", zzgpqVar, "zzay", "zzaz", zzaog.class, "zzaA", zzgpqVar, "zzaB", zzant.class, "zzaC", "zzaD", "zzaE", "zzaF", "zzaG", "zzaH", "zzaI", "zzaJ", "zzaK", "zzaL", "zzaM", "zzaN", "zzaO", "zzaP", zzaod.zza, "zzaW", "zzaX", "zzaY"});
        }
        if (i11 == 3) {
            return new zzaon();
        }
        zzanp zzanpVar = null;
        if (i11 == 4) {
            return new zzanq(zzanpVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzaow zzf() {
        zzaow zzaowVar = this.zzaW;
        return zzaowVar == null ? zzaow.zzd() : zzaowVar;
    }

    public final String zzg() {
        return this.zzaR;
    }

    public final String zzh() {
        return this.zzC;
    }
}
