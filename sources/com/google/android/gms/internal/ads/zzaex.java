package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.j;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaex extends zzaen {
    public static final Parcelable.Creator<zzaex> CREATOR = new zzaew();
    public final String zza;
    public final String zzb;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzaex(Parcel parcel) {
        String string = parcel.readString();
        int i10 = zzfj.zza;
        super(string);
        this.zza = parcel.readString();
        this.zzb = parcel.readString();
    }

    public zzaex(String str, String str2, String str3) {
        super(str);
        this.zza = str2;
        this.zzb = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaex.class == obj.getClass()) {
            zzaex zzaexVar = (zzaex) obj;
            if (this.zzf.equals(zzaexVar.zzf) && zzfj.zzC(this.zza, zzaexVar.zza) && zzfj.zzC(this.zzb, zzaexVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzf.hashCode() + 527;
        String str = this.zza;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        int i10 = iHashCode * 31;
        String str2 = this.zzb;
        return ((i10 + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzaen
    public final String toString() {
        return j.a(this.zzf, ": url=", this.zzb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zzf);
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
    }
}
