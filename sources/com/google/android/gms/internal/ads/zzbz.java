package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.j;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbz implements Parcelable {
    public static final Parcelable.Creator<zzbz> CREATOR = new zzbx();
    public final long zza;
    private final zzby[] zzb;

    public zzbz(long j10, zzby... zzbyVarArr) {
        this.zza = j10;
        this.zzb = zzbyVarArr;
    }

    public zzbz(Parcel parcel) {
        this.zzb = new zzby[parcel.readInt()];
        int i10 = 0;
        while (true) {
            zzby[] zzbyVarArr = this.zzb;
            if (i10 >= zzbyVarArr.length) {
                this.zza = parcel.readLong();
                return;
            } else {
                zzbyVarArr[i10] = (zzby) parcel.readParcelable(zzby.class.getClassLoader());
                i10++;
            }
        }
    }

    public zzbz(List list) {
        this(-9223372036854775807L, (zzby[]) list.toArray(new zzby[0]));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbz.class == obj.getClass()) {
            zzbz zzbzVar = (zzbz) obj;
            if (Arrays.equals(this.zzb, zzbzVar.zzb) && this.zza == zzbzVar.zza) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.zzb) * 31;
        long j10 = this.zza;
        return iHashCode + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        String string = Arrays.toString(this.zzb);
        long j10 = this.zza;
        return j.a("entries=", string, j10 == -9223372036854775807L ? "" : androidx.viewpager2.adapter.a.a(", presentationTimeUs=", j10));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.zzb.length);
        for (zzby zzbyVar : this.zzb) {
            parcel.writeParcelable(zzbyVar, 0);
        }
        parcel.writeLong(this.zza);
    }

    public final int zza() {
        return this.zzb.length;
    }

    public final zzby zzb(int i10) {
        return this.zzb[i10];
    }

    public final zzbz zzc(zzby... zzbyVarArr) {
        int length = zzbyVarArr.length;
        if (length == 0) {
            return this;
        }
        long j10 = this.zza;
        zzby[] zzbyVarArr2 = this.zzb;
        int i10 = zzfj.zza;
        int length2 = zzbyVarArr2.length;
        Object[] objArrCopyOf = Arrays.copyOf(zzbyVarArr2, length2 + length);
        System.arraycopy(zzbyVarArr, 0, objArrCopyOf, length2, length);
        return new zzbz(j10, (zzby[]) objArrCopyOf);
    }

    public final zzbz zzd(zzbz zzbzVar) {
        return zzbzVar == null ? this : zzc(zzbzVar.zzb);
    }
}
