package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public class zzdd {
    private static final String zzE;
    private static final String zzF;
    private static final String zzG;
    private static final String zzH;
    private static final String zzI;
    private static final String zzJ;
    private static final String zzK;
    private static final String zzL;
    private static final String zzM;
    private static final String zzN;
    private static final String zzO;
    private static final String zzP;
    private static final String zzQ;
    private static final String zzR;
    private static final String zzS;
    private static final String zzT;
    private static final String zzU;
    private static final String zzV;
    private static final String zzW;
    private static final String zzX;
    private static final String zzY;
    private static final String zzZ;
    public static final zzdd zza;
    private static final String zzaa;
    private static final String zzab;
    private static final String zzac;
    private static final String zzad;
    private static final String zzae;
    private static final String zzaf;
    private static final String zzag;

    @Deprecated
    public static final zzdd zzb;

    @Deprecated
    public static final zzn zzc;
    public final zzfsf zzC;
    public final zzfsh zzD;
    public final int zzl;
    public final int zzm;
    public final boolean zzn;
    public final zzfsc zzo;
    public final zzfsc zzq;
    public final zzfsc zzu;
    public final zzfsc zzw;
    public final int zzx;
    public final int zzd = Integer.MAX_VALUE;
    public final int zze = Integer.MAX_VALUE;
    public final int zzf = Integer.MAX_VALUE;
    public final int zzg = Integer.MAX_VALUE;
    public final int zzh = 0;
    public final int zzi = 0;
    public final int zzj = 0;
    public final int zzk = 0;
    public final int zzp = 0;
    public final int zzr = 0;
    public final int zzs = Integer.MAX_VALUE;
    public final int zzt = Integer.MAX_VALUE;
    public final int zzv = 0;
    public final int zzy = 0;
    public final boolean zzz = false;
    public final boolean zzA = false;
    public final boolean zzB = false;

    static {
        zzdd zzddVar = new zzdd(new zzdc());
        zza = zzddVar;
        zzb = zzddVar;
        zzE = Integer.toString(1, 36);
        zzF = Integer.toString(2, 36);
        zzG = Integer.toString(3, 36);
        zzH = Integer.toString(4, 36);
        zzI = Integer.toString(5, 36);
        zzJ = Integer.toString(6, 36);
        zzK = Integer.toString(7, 36);
        zzL = Integer.toString(8, 36);
        zzM = Integer.toString(9, 36);
        zzN = Integer.toString(10, 36);
        zzO = Integer.toString(11, 36);
        zzP = Integer.toString(12, 36);
        zzQ = Integer.toString(13, 36);
        zzR = Integer.toString(14, 36);
        zzS = Integer.toString(15, 36);
        zzT = Integer.toString(16, 36);
        zzU = Integer.toString(17, 36);
        zzV = Integer.toString(18, 36);
        zzW = Integer.toString(19, 36);
        zzX = Integer.toString(20, 36);
        zzY = Integer.toString(21, 36);
        zzZ = Integer.toString(22, 36);
        zzaa = Integer.toString(23, 36);
        zzab = Integer.toString(24, 36);
        zzac = Integer.toString(25, 36);
        zzad = Integer.toString(26, 36);
        zzae = Integer.toString(27, 36);
        zzaf = Integer.toString(28, 36);
        zzag = Integer.toString(29, 36);
        zzc = new zzn() { // from class: com.google.android.gms.internal.ads.zzdb
        };
    }

    public zzdd(zzdc zzdcVar) {
        this.zzl = zzdcVar.zze;
        this.zzm = zzdcVar.zzf;
        this.zzn = zzdcVar.zzg;
        this.zzo = zzdcVar.zzh;
        this.zzq = zzdcVar.zzi;
        this.zzu = zzdcVar.zzl;
        this.zzw = zzdcVar.zzm;
        this.zzx = zzdcVar.zzn;
        this.zzC = zzfsf.zzc(zzdcVar.zzo);
        this.zzD = zzfsh.zzl(zzdcVar.zzp);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzdd zzddVar = (zzdd) obj;
            if (this.zzn == zzddVar.zzn && this.zzl == zzddVar.zzl && this.zzm == zzddVar.zzm && this.zzo.equals(zzddVar.zzo) && this.zzq.equals(zzddVar.zzq) && this.zzu.equals(zzddVar.zzu) && this.zzw.equals(zzddVar.zzw) && this.zzx == zzddVar.zzx && this.zzC.equals(zzddVar.zzC) && this.zzD.equals(zzddVar.zzD)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.zzn ? 1 : 0) - 1048002209) * 31) + this.zzl) * 31) + this.zzm) * 31) + this.zzo.hashCode()) * 961) + this.zzq.hashCode()) * 961) + Integer.MAX_VALUE) * 31) + Integer.MAX_VALUE) * 31) + this.zzu.hashCode()) * 923521) + this.zzw.hashCode()) * 31) + this.zzx) * 28629151) + this.zzC.hashCode()) * 31) + this.zzD.hashCode();
    }
}
