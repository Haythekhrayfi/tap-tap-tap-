package com.yandex.mobile.ads.common;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public class AdImpressionData implements ImpressionData, Parcelable {
    public static final Parcelable.Creator<AdImpressionData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f18233a;

    public class a implements Parcelable.Creator<AdImpressionData> {
        @Override // android.os.Parcelable.Creator
        public final AdImpressionData createFromParcel(Parcel parcel) {
            return new AdImpressionData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final AdImpressionData[] newArray(int i10) {
            return new AdImpressionData[i10];
        }
    }

    public AdImpressionData(Parcel parcel) {
        this.f18233a = parcel.readString();
    }

    public AdImpressionData(String str) {
        this.f18233a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f18233a.equals(((AdImpressionData) obj).f18233a);
    }

    @Override // com.yandex.mobile.ads.common.ImpressionData
    public final String getRawData() {
        return this.f18233a;
    }

    public final int hashCode() {
        return this.f18233a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f18233a);
    }
}
