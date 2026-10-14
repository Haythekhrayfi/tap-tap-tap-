package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import y.q;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaeg extends zzaen {
    public static final Parcelable.Creator<zzaeg> CREATOR = new zzaef();
    public final String zza;
    public final String zzb;
    public final String zzc;

    public zzaeg(Parcel parcel) {
        super("COMM");
        String string = parcel.readString();
        int i10 = zzfj.zza;
        this.zza = string;
        this.zzb = parcel.readString();
        this.zzc = parcel.readString();
    }

    public zzaeg(String str, String str2, String str3) {
        super("COMM");
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaeg.class == obj.getClass()) {
            zzaeg zzaegVar = (zzaeg) obj;
            if (zzfj.zzC(this.zzb, zzaegVar.zzb) && zzfj.zzC(this.zza, zzaegVar.zza) && zzfj.zzC(this.zzc, zzaegVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.zzb;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i10 = iHashCode + 527;
        String str3 = this.zzc;
        return (((i10 * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzaen
    public final String toString() {
        return q.a(this.zzf, ": language=", this.zza, ", description=", this.zzb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zzf);
        parcel.writeString(this.zza);
        parcel.writeString(this.zzc);
    }
}
