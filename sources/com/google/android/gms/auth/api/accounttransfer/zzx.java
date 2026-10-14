package com.google.android.gms.auth.api.accounttransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class zzx implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i10;
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        HashSet hashSet = new HashSet();
        int i11 = 0;
        String strCreateString = null;
        byte[] bArrCreateByteArray = null;
        PendingIntent pendingIntent = null;
        DeviceMetaData deviceMetaData = null;
        int i12 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    i12 = SafeParcelReader.readInt(parcel, header);
                    i10 = 1;
                    break;
                case 2:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    i10 = 2;
                    break;
                case 3:
                    i11 = SafeParcelReader.readInt(parcel, header);
                    i10 = 3;
                    break;
                case 4:
                    bArrCreateByteArray = SafeParcelReader.createByteArray(parcel, header);
                    i10 = 4;
                    break;
                case 5:
                    pendingIntent = (PendingIntent) SafeParcelReader.createParcelable(parcel, header, PendingIntent.CREATOR);
                    i10 = 5;
                    break;
                case 6:
                    deviceMetaData = (DeviceMetaData) SafeParcelReader.createParcelable(parcel, header, DeviceMetaData.CREATOR);
                    i10 = 6;
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    continue;
            }
            hashSet.add(Integer.valueOf(i10));
        }
        if (parcel.dataPosition() == iValidateObjectHeader) {
            return new zzw(hashSet, i12, strCreateString, i11, bArrCreateByteArray, pendingIntent, deviceMetaData);
        }
        throw new SafeParcelReader.ParseException(a.a("Overread allowed size end=", iValidateObjectHeader), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzw[i10];
    }
}
