package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class(creator = "VersionInfoParcelCreator")
@SafeParcelable.Reserved({1})
public final class zzbzx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbzx> CREATOR = new zzbzy();

    @SafeParcelable.Field(id = 2)
    public String zza;

    @SafeParcelable.Field(id = 3)
    public int zzb;

    @SafeParcelable.Field(id = 4)
    public int zzc;

    @SafeParcelable.Field(id = 5)
    public boolean zzd;

    @SafeParcelable.Field(id = 6)
    public boolean zze;

    public zzbzx(int i10, int i11, boolean z10, boolean z11) {
        this(ModuleDescriptor.MODULE_VERSION, i11, true, false, z11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zzbzx(int i10, int i11, boolean z10, boolean z11, boolean z12) {
        String str = z10 ? "0" : "1";
        StringBuilder sbA = o.a("afma-sdk-a-v", i10, ".", i11, ".");
        sbA.append(str);
        this(sbA.toString(), i10, i11, z10, z12);
    }

    @SafeParcelable.Constructor
    public zzbzx(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i10, @SafeParcelable.Param(id = 4) int i11, @SafeParcelable.Param(id = 5) boolean z10, @SafeParcelable.Param(id = 6) boolean z11) {
        this.zza = str;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = z10;
        this.zze = z11;
    }

    public static zzbzx zza() {
        return new zzbzx(12451000, 12451000, true, false, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzb);
        SafeParcelWriter.writeInt(parcel, 4, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzd);
        SafeParcelWriter.writeBoolean(parcel, 6, this.zze);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
