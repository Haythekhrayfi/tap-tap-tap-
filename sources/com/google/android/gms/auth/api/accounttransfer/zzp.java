package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class zzp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        HashSet hashSet = new HashSet();
        int i10 = 0;
        ArrayList arrayListCreateTypedList = null;
        zzs zzsVar = null;
        int i11 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            int i12 = 1;
            if (fieldId != 1) {
                i12 = 2;
                if (fieldId != 2) {
                    i12 = 3;
                    if (fieldId != 3) {
                        i12 = 4;
                        if (fieldId != 4) {
                            SafeParcelReader.skipUnknownField(parcel, header);
                        } else {
                            zzsVar = (zzs) SafeParcelReader.createParcelable(parcel, header, zzs.CREATOR);
                        }
                    } else {
                        i11 = SafeParcelReader.readInt(parcel, header);
                    }
                } else {
                    arrayListCreateTypedList = SafeParcelReader.createTypedList(parcel, header, zzu.CREATOR);
                }
            } else {
                i10 = SafeParcelReader.readInt(parcel, header);
            }
            hashSet.add(Integer.valueOf(i12));
        }
        if (parcel.dataPosition() == iValidateObjectHeader) {
            return new zzo(hashSet, i10, arrayListCreateTypedList, i11, zzsVar);
        }
        throw new SafeParcelReader.ParseException(a.a("Overread allowed size end=", iValidateObjectHeader), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzo[i10];
    }
}
