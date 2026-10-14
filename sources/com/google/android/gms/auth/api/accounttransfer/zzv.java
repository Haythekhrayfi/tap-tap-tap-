package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class zzv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        HashSet hashSet = new HashSet();
        int i10 = 0;
        zzw zzwVar = null;
        String strCreateString = null;
        String strCreateString2 = null;
        String strCreateString3 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            int i11 = 1;
            if (fieldId != 1) {
                i11 = 2;
                if (fieldId != 2) {
                    i11 = 3;
                    if (fieldId != 3) {
                        i11 = 4;
                        if (fieldId != 4) {
                            i11 = 5;
                            if (fieldId != 5) {
                                SafeParcelReader.skipUnknownField(parcel, header);
                            } else {
                                strCreateString3 = SafeParcelReader.createString(parcel, header);
                            }
                        } else {
                            strCreateString2 = SafeParcelReader.createString(parcel, header);
                        }
                    } else {
                        strCreateString = SafeParcelReader.createString(parcel, header);
                    }
                } else {
                    zzwVar = (zzw) SafeParcelReader.createParcelable(parcel, header, zzw.CREATOR);
                }
            } else {
                i10 = SafeParcelReader.readInt(parcel, header);
            }
            hashSet.add(Integer.valueOf(i11));
        }
        if (parcel.dataPosition() == iValidateObjectHeader) {
            return new zzu(hashSet, i10, zzwVar, strCreateString, strCreateString2, strCreateString3);
        }
        throw new SafeParcelReader.ParseException(a.a("Overread allowed size end=", iValidateObjectHeader), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzu[i10];
    }
}
