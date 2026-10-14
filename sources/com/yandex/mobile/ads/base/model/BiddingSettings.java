package com.yandex.mobile.ads.base.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class BiddingSettings implements Parcelable {
    public static final Parcelable.Creator<BiddingSettings> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<AdUnitIdBiddingSettings> f18215a;

    public class a implements Parcelable.Creator<BiddingSettings> {
        @Override // android.os.Parcelable.Creator
        public final BiddingSettings createFromParcel(Parcel parcel) {
            return new BiddingSettings(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final BiddingSettings[] newArray(int i10) {
            return new BiddingSettings[i10];
        }
    }

    public BiddingSettings(Parcel parcel) {
        this.f18215a = parcel.createTypedArrayList(AdUnitIdBiddingSettings.CREATOR);
    }

    public BiddingSettings(ArrayList arrayList) {
        this.f18215a = arrayList;
    }

    public final List<AdUnitIdBiddingSettings> c() {
        return this.f18215a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f18215a.equals(((BiddingSettings) obj).f18215a);
    }

    public final int hashCode() {
        return this.f18215a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeTypedList(this.f18215a);
    }
}
