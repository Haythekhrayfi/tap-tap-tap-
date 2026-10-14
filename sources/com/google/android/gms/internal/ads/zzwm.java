package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes2.dex */
public final class zzwm extends zzdd {
    public static final zzwm zzE;

    @Deprecated
    public static final zzwm zzF;
    public static final zzn zzG;
    private static final String zzU;
    private static final String zzV;
    private static final String zzW;
    private static final String zzX;
    private static final String zzY;
    private static final String zzZ;
    private static final String zzaa;
    private static final String zzab;
    private static final String zzac;
    private static final String zzad;
    private static final String zzae;
    private static final String zzaf;
    private static final String zzag;
    private static final String zzah;
    private static final String zzai;
    private static final String zzaj;
    private static final String zzak;
    private static final String zzal;
    public final boolean zzH;
    public final boolean zzI;
    public final boolean zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final boolean zzQ;
    public final boolean zzR;
    public final boolean zzS;
    public final boolean zzT;
    private final SparseArray zzam;
    private final SparseBooleanArray zzan;

    static {
        zzwm zzwmVar = new zzwm(new zzwk());
        zzE = zzwmVar;
        zzF = zzwmVar;
        zzU = Integer.toString(1000, 36);
        zzV = Integer.toString(1001, 36);
        zzW = Integer.toString(1002, 36);
        zzX = Integer.toString(1003, 36);
        zzY = Integer.toString(1004, 36);
        zzZ = Integer.toString(WebSocketProtocol.CLOSE_NO_STATUS_CODE, 36);
        zzaa = Integer.toString(1006, 36);
        zzab = Integer.toString(1007, 36);
        zzac = Integer.toString(1008, 36);
        zzad = Integer.toString(1009, 36);
        zzae = Integer.toString(1010, 36);
        zzaf = Integer.toString(1011, 36);
        zzag = Integer.toString(1012, 36);
        zzah = Integer.toString(1013, 36);
        zzai = Integer.toString(1014, 36);
        zzaj = Integer.toString(1015, 36);
        zzak = Integer.toString(1016, 36);
        zzal = Integer.toString(1017, 36);
        zzG = new zzn() { // from class: com.google.android.gms.internal.ads.zzwi
        };
    }

    private zzwm(zzwk zzwkVar) {
        super(zzwkVar);
        this.zzH = zzwkVar.zza;
        this.zzI = false;
        this.zzJ = zzwkVar.zzb;
        this.zzK = false;
        this.zzL = zzwkVar.zzc;
        this.zzM = false;
        this.zzN = false;
        this.zzO = false;
        this.zzP = false;
        this.zzQ = zzwkVar.zzd;
        this.zzR = zzwkVar.zze;
        this.zzS = false;
        this.zzT = zzwkVar.zzf;
        this.zzam = zzwkVar.zzg;
        this.zzan = zzwkVar.zzh;
    }

    public static zzwm zzd(Context context) {
        return new zzwm(new zzwk(context));
    }

    @Override // com.google.android.gms.internal.ads.zzdd
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzwm.class == obj.getClass()) {
            zzwm zzwmVar = (zzwm) obj;
            if (super.equals(zzwmVar) && this.zzH == zzwmVar.zzH && this.zzJ == zzwmVar.zzJ && this.zzL == zzwmVar.zzL && this.zzQ == zzwmVar.zzQ && this.zzR == zzwmVar.zzR && this.zzT == zzwmVar.zzT) {
                SparseBooleanArray sparseBooleanArray = this.zzan;
                SparseBooleanArray sparseBooleanArray2 = zzwmVar.zzan;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    for (int i10 = 0; i10 < size; i10++) {
                        if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i10)) >= 0) {
                        }
                    }
                    SparseArray sparseArray = this.zzam;
                    SparseArray sparseArray2 = zzwmVar.zzam;
                    int size2 = sparseArray.size();
                    if (sparseArray2.size() == size2) {
                        for (int i11 = 0; i11 < size2; i11++) {
                            int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i11));
                            if (iIndexOfKey >= 0) {
                                Map map = (Map) sparseArray.valueAt(i11);
                                Map map2 = (Map) sparseArray2.valueAt(iIndexOfKey);
                                if (map2.size() == map.size()) {
                                    for (Map.Entry entry : map.entrySet()) {
                                        zzvn zzvnVar = (zzvn) entry.getKey();
                                        if (!map2.containsKey(zzvnVar) || !zzfj.zzC(entry.getValue(), map2.get(zzvnVar))) {
                                        }
                                    }
                                }
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdd
    public final int hashCode() {
        return (((((((((((((super.hashCode() + 31) * 31) + (this.zzH ? 1 : 0)) * 961) + (this.zzJ ? 1 : 0)) * 961) + (this.zzL ? 1 : 0)) * 28629151) + (this.zzQ ? 1 : 0)) * 31) + (this.zzR ? 1 : 0)) * 961) + (this.zzT ? 1 : 0)) * 31;
    }

    public final zzwk zzc() {
        return new zzwk(this, null);
    }

    @Deprecated
    public final zzwo zze(int i10, zzvn zzvnVar) {
        Map map = (Map) this.zzam.get(i10);
        if (map != null) {
            return (zzwo) map.get(zzvnVar);
        }
        return null;
    }

    public final boolean zzf(int i10) {
        return this.zzan.get(i10);
    }

    @Deprecated
    public final boolean zzg(int i10, zzvn zzvnVar) {
        Map map = (Map) this.zzam.get(i10);
        return map != null && map.containsKey(zzvnVar);
    }
}
