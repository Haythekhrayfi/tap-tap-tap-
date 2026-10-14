package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.ads.zzbzx;

/* JADX INFO: loaded from: classes.dex */
public final class zzn implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        boolean z10 = false;
        int i10 = 0;
        int i11 = 0;
        zzc zzcVar = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        IBinder iBinder4 = null;
        String strCreateString = null;
        String strCreateString2 = null;
        IBinder iBinder5 = null;
        String strCreateString3 = null;
        zzbzx zzbzxVar = null;
        String strCreateString4 = null;
        com.google.android.gms.ads.internal.zzj zzjVar = null;
        IBinder iBinder6 = null;
        String strCreateString5 = null;
        IBinder iBinder7 = null;
        String strCreateString6 = null;
        String strCreateString7 = null;
        IBinder iBinder8 = null;
        IBinder iBinder9 = null;
        IBinder iBinder10 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 2:
                    zzcVar = (zzc) SafeParcelReader.createParcelable(parcel, header, zzc.CREATOR);
                    break;
                case 3:
                    iBinder = SafeParcelReader.readIBinder(parcel, header);
                    break;
                case 4:
                    iBinder2 = SafeParcelReader.readIBinder(parcel, header);
                    break;
                case 5:
                    iBinder3 = SafeParcelReader.readIBinder(parcel, header);
                    break;
                case 6:
                    iBinder4 = SafeParcelReader.readIBinder(parcel, header);
                    break;
                case 7:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 8:
                    z10 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 9:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case 10:
                    iBinder5 = SafeParcelReader.readIBinder(parcel, header);
                    break;
                case 11:
                    i10 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 12:
                    i11 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 13:
                    strCreateString3 = SafeParcelReader.createString(parcel, header);
                    break;
                case 14:
                    zzbzxVar = (zzbzx) SafeParcelReader.createParcelable(parcel, header, zzbzx.CREATOR);
                    break;
                case 15:
                case 20:
                case 21:
                case 22:
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
                case 16:
                    strCreateString4 = SafeParcelReader.createString(parcel, header);
                    break;
                case 17:
                    zzjVar = (com.google.android.gms.ads.internal.zzj) SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.ads.internal.zzj.CREATOR);
                    break;
                case 18:
                    iBinder6 = SafeParcelReader.readIBinder(parcel, header);
                    break;
                case 19:
                    strCreateString5 = SafeParcelReader.createString(parcel, header);
                    break;
                case 23:
                    iBinder7 = SafeParcelReader.readIBinder(parcel, header);
                    break;
                case 24:
                    strCreateString6 = SafeParcelReader.createString(parcel, header);
                    break;
                case 25:
                    strCreateString7 = SafeParcelReader.createString(parcel, header);
                    break;
                case 26:
                    iBinder8 = SafeParcelReader.readIBinder(parcel, header);
                    break;
                case 27:
                    iBinder9 = SafeParcelReader.readIBinder(parcel, header);
                    break;
                case 28:
                    iBinder10 = SafeParcelReader.readIBinder(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new AdOverlayInfoParcel(zzcVar, iBinder, iBinder2, iBinder3, iBinder4, strCreateString, z10, strCreateString2, iBinder5, i10, i11, strCreateString3, zzbzxVar, strCreateString4, zzjVar, iBinder6, strCreateString5, iBinder7, strCreateString6, strCreateString7, iBinder8, iBinder9, iBinder10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new AdOverlayInfoParcel[i10];
    }
}
