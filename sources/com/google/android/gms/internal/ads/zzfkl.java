package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class(creator = "GassResponseParcelCreator")
public final class zzfkl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfkl> CREATOR = new zzfkm();

    @SafeParcelable.VersionField(id = 1)
    public final int zza;

    @SafeParcelable.Field(getter = "getAfmaSignalsAsBytes", id = 2, type = "byte[]")
    private zzaon zzb = null;
    private byte[] zzc;

    @SafeParcelable.Constructor
    public zzfkl(@SafeParcelable.Param(id = 1) int i10, @SafeParcelable.Param(id = 2) byte[] bArr) {
        this.zza = i10;
        this.zzc = bArr;
        zzb();
    }

    private final void zzb() {
        zzaon zzaonVar = this.zzb;
        if (zzaonVar != null || this.zzc == null) {
            if (zzaonVar == null || this.zzc != null) {
                if (zzaonVar != null && this.zzc != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (zzaonVar != null || this.zzc != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        byte[] bArrZzax = this.zzc;
        if (bArrZzax == null) {
            bArrZzax = this.zzb.zzax();
        }
        SafeParcelWriter.writeByteArray(parcel, 2, bArrZzax, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final zzaon zza() {
        if (this.zzb == null) {
            try {
                this.zzb = zzaon.zze(this.zzc, zzgoy.zza());
                this.zzc = null;
            } catch (zzgpy | NullPointerException e10) {
                throw new IllegalStateException(e10);
            }
        }
        zzb();
        return this.zzb;
    }
}
