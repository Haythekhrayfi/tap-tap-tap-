package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzaeu implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String string = parcel.readString();
        Objects.requireNonNull(string);
        String string2 = parcel.readString();
        String[] strArrCreateStringArray = parcel.createStringArray();
        Objects.requireNonNull(strArrCreateStringArray);
        return new zzaev(string, string2, zzfsc.zzk(strArrCreateStringArray));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzaev[i10];
    }
}
