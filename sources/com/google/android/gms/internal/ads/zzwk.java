package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzwk extends zzdc {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;
    private final SparseArray zzg;
    private final SparseBooleanArray zzh;

    @Deprecated
    public zzwk() {
        this.zzg = new SparseArray();
        this.zzh = new SparseBooleanArray();
        zzv();
    }

    public zzwk(Context context) {
        super.zzd(context);
        Point pointZzr = zzfj.zzr(context);
        zze(pointZzr.x, pointZzr.y, true);
        this.zzg = new SparseArray();
        this.zzh = new SparseBooleanArray();
        zzv();
    }

    public /* synthetic */ zzwk(zzwm zzwmVar, zzwj zzwjVar) {
        super(zzwmVar);
        this.zza = zzwmVar.zzH;
        this.zzb = zzwmVar.zzJ;
        this.zzc = zzwmVar.zzL;
        this.zzd = zzwmVar.zzQ;
        this.zze = zzwmVar.zzR;
        this.zzf = zzwmVar.zzT;
        SparseArray sparseArray = zzwmVar.zzam;
        SparseArray sparseArray2 = new SparseArray();
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            sparseArray2.put(sparseArray.keyAt(i10), new HashMap((Map) sparseArray.valueAt(i10)));
        }
        this.zzg = sparseArray2;
        this.zzh = zzwmVar.zzan.clone();
    }

    private final void zzv() {
        this.zza = true;
        this.zzb = true;
        this.zzc = true;
        this.zzd = true;
        this.zze = true;
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdc
    public final /* synthetic */ zzdc zze(int i10, int i11, boolean z10) {
        super.zze(i10, i11, true);
        return this;
    }

    public final zzwk zzo(int i10, boolean z10) {
        if (this.zzh.get(i10) == z10) {
            return this;
        }
        if (z10) {
            this.zzh.put(i10, true);
        } else {
            this.zzh.delete(i10);
        }
        return this;
    }
}
