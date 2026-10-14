package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfsg extends zzfrv {

    @CheckForNull
    public Object[] zzd;
    private int zze;

    public zzfsg() {
        super(4);
    }

    public zzfsg(int i10) {
        super(i10);
        this.zzd = new Object[zzfsh.zzh(i10)];
    }

    @Override // com.google.android.gms.internal.ads.zzfrv, com.google.android.gms.internal.ads.zzfrw
    public final /* bridge */ /* synthetic */ zzfrw zzb(Object obj) {
        zzf(obj);
        return this;
    }

    public final zzfsg zzf(Object obj) {
        Objects.requireNonNull(obj);
        if (this.zzd != null) {
            int iZzh = zzfsh.zzh(this.zzb);
            int length = this.zzd.length;
            if (iZzh <= length) {
                int iHashCode = obj.hashCode();
                int iZza = zzfru.zza(iHashCode);
                while (true) {
                    Object[] objArr = this.zzd;
                    int i10 = iZza & (length - 1);
                    Object obj2 = objArr[i10];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            break;
                        }
                        iZza = i10 + 1;
                    } else {
                        objArr[i10] = obj;
                        this.zze += iHashCode;
                        super.zza(obj);
                        break;
                    }
                }
                return this;
            }
        }
        this.zzd = null;
        super.zza(obj);
        return this;
    }

    public final zzfsg zzg(Iterable iterable) {
        if (this.zzd != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                zzf(it.next());
            }
        } else {
            super.zzc(iterable);
        }
        return this;
    }

    public final zzfsh zzh() {
        zzfsh zzfshVarZzs;
        int i10 = this.zzb;
        if (i10 == 0) {
            return zzfts.zza;
        }
        if (i10 == 1) {
            Object obj = this.zza[0];
            Objects.requireNonNull(obj);
            return new zzftz(obj);
        }
        if (this.zzd == null || zzfsh.zzh(i10) != this.zzd.length) {
            zzfshVarZzs = zzfsh.zzs(this.zzb, this.zza);
            this.zzb = zzfshVarZzs.size();
        } else {
            int i11 = this.zzb;
            Object[] objArrCopyOf = this.zza;
            if (zzfsh.zzt(i11, objArrCopyOf.length)) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i11);
            }
            int i12 = this.zze;
            Object[] objArr = this.zzd;
            zzfshVarZzs = new zzfts(objArrCopyOf, i12, objArr, objArr.length - 1, this.zzb);
        }
        this.zzc = true;
        this.zzd = null;
        return zzfshVarZzs;
    }
}
