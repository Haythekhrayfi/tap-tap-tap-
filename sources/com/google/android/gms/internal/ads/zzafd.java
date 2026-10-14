package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzafd implements zzby {
    public static final Parcelable.Creator<zzafd> CREATOR = new zzafb();
    public final float zza;
    public final int zzb;

    public zzafd(float f10, int i10) {
        this.zza = f10;
        this.zzb = i10;
    }

    public /* synthetic */ zzafd(Parcel parcel, zzafc zzafcVar) {
        this.zza = parcel.readFloat();
        this.zzb = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafd.class == obj.getClass()) {
            zzafd zzafdVar = (zzafd) obj;
            if (this.zza == zzafdVar.zza && this.zzb == zzafdVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.zza).hashCode() + 527) * 31) + this.zzb;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.zza + ", svcTemporalLayerCount=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.zza);
        parcel.writeInt(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzby
    public final /* synthetic */ void zza(zzbt zzbtVar) {
    }
}
