package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import q2.a;

/* JADX INFO: loaded from: classes.dex */
@SafeParcelable.Class(creator = "AccountChangeEventCreator")
public class AccountChangeEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEvent> CREATOR = new zza();

    @SafeParcelable.VersionField(id = 1)
    public final int zza;

    @SafeParcelable.Field(id = 2)
    public final long zzb;

    @SafeParcelable.Field(id = 3)
    public final String zzc;

    @SafeParcelable.Field(id = 4)
    public final int zzd;

    @SafeParcelable.Field(id = 5)
    public final int zze;

    @SafeParcelable.Field(id = 6)
    public final String zzf;

    @SafeParcelable.Constructor
    public AccountChangeEvent(@SafeParcelable.Param(id = 1) int i10, @SafeParcelable.Param(id = 2) long j10, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) int i11, @SafeParcelable.Param(id = 5) int i12, @SafeParcelable.Param(id = 6) String str2) {
        this.zza = i10;
        this.zzb = j10;
        this.zzc = (String) Preconditions.checkNotNull(str);
        this.zzd = i11;
        this.zze = i12;
        this.zzf = str2;
    }

    public AccountChangeEvent(long j10, String str, int i10, int i11, String str2) {
        this.zza = 1;
        this.zzb = j10;
        this.zzc = (String) Preconditions.checkNotNull(str);
        this.zzd = i10;
        this.zze = i11;
        this.zzf = str2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AccountChangeEvent)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        AccountChangeEvent accountChangeEvent = (AccountChangeEvent) obj;
        return this.zza == accountChangeEvent.zza && this.zzb == accountChangeEvent.zzb && Objects.equal(this.zzc, accountChangeEvent.zzc) && this.zzd == accountChangeEvent.zzd && this.zze == accountChangeEvent.zze && Objects.equal(this.zzf, accountChangeEvent.zzf);
    }

    public String getAccountName() {
        return this.zzc;
    }

    public String getChangeData() {
        return this.zzf;
    }

    public int getChangeType() {
        return this.zzd;
    }

    public int getEventIndex() {
        return this.zze;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Long.valueOf(this.zzb), this.zzc, Integer.valueOf(this.zzd), Integer.valueOf(this.zze), this.zzf);
    }

    public String toString() {
        String str;
        int i10 = this.zzd;
        if (i10 == 1) {
            str = "ADDED";
        } else if (i10 == 2) {
            str = "REMOVED";
        } else if (i10 != 3) {
            str = i10 != 4 ? "UNKNOWN" : "RENAMED_TO";
        } else {
            str = "RENAMED_FROM";
        }
        String str2 = this.zzc;
        String str3 = this.zzf;
        int i11 = this.zze;
        StringBuilder sbA = a.a("AccountChangeEvent {accountName = ", str2, ", changeType = ", str, ", changeData = ");
        sbA.append(str3);
        sbA.append(", eventIndex = ");
        sbA.append(i11);
        sbA.append("}");
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.writeInt(parcel, 5, this.zze);
        SafeParcelWriter.writeString(parcel, 6, this.zzf, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
