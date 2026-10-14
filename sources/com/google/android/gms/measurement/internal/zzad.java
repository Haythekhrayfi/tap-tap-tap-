package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes2.dex */
public final class zzad implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        String strCreateString = null;
        String strCreateString2 = null;
        zzlc zzlcVar = null;
        String strCreateString3 = null;
        zzaw zzawVar = null;
        zzaw zzawVar2 = null;
        zzaw zzawVar3 = null;
        boolean z10 = false;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 2:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 3:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case 4:
                    zzlcVar = (zzlc) SafeParcelReader.createParcelable(parcel, header, zzlc.CREATOR);
                    break;
                case 5:
                    j10 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 6:
                    z10 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 7:
                    strCreateString3 = SafeParcelReader.createString(parcel, header);
                    break;
                case 8:
                    zzawVar = (zzaw) SafeParcelReader.createParcelable(parcel, header, zzaw.CREATOR);
                    break;
                case 9:
                    j11 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 10:
                    zzawVar2 = (zzaw) SafeParcelReader.createParcelable(parcel, header, zzaw.CREATOR);
                    break;
                case 11:
                    j12 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 12:
                    zzawVar3 = (zzaw) SafeParcelReader.createParcelable(parcel, header, zzaw.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzac(strCreateString, strCreateString2, zzlcVar, j10, z10, strCreateString3, zzawVar, j11, zzawVar2, j12, zzawVar3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzac[i10];
    }
}
