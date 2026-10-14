package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.w;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class zzadu implements zzby {
    public static final Parcelable.Creator<zzadu> CREATOR = new zzadt();
    public final String zza;
    public final String zzb;

    public zzadu(Parcel parcel) {
        String string = parcel.readString();
        int i10 = zzfj.zza;
        this.zza = string;
        this.zzb = parcel.readString();
    }

    public zzadu(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzadu zzaduVar = (zzadu) obj;
            if (this.zza.equals(zzaduVar.zza) && this.zzb.equals(zzaduVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zza.hashCode() + 527) * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        return w.a("VC: ", this.zza, "=", this.zzb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x0040  */
    @Override // com.google.android.gms.internal.ads.zzby
    public final void zza(zzbt zzbtVar) {
        byte b10;
        switch (this.zza) {
            case "ALBUM":
                b10 = 2;
                break;
            case "TITLE":
                b10 = 0;
                break;
            case "DESCRIPTION":
                b10 = 4;
                break;
            case "ALBUMARTIST":
                b10 = 3;
                break;
            case "ARTIST":
                b10 = 1;
                break;
            default:
                b10 = -1;
                break;
        }
        if (b10 == 0) {
            zzbtVar.zzq(this.zzb);
            return;
        }
        if (b10 == 1) {
            zzbtVar.zze(this.zzb);
            return;
        }
        if (b10 == 2) {
            zzbtVar.zzd(this.zzb);
        } else if (b10 == 3) {
            zzbtVar.zzc(this.zzb);
        } else {
            if (b10 != 4) {
                return;
            }
            zzbtVar.zzh(this.zzb);
        }
    }
}
