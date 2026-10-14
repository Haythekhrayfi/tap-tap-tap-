package com.yandex.mobile.ads.base.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.ce0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class AdUnitIdBiddingSettings implements Parcelable {
    public static final Parcelable.Creator<AdUnitIdBiddingSettings> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f18212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<ce0> f18213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f18214c;

    public class a implements Parcelable.Creator<AdUnitIdBiddingSettings> {
        @Override // android.os.Parcelable.Creator
        public final AdUnitIdBiddingSettings createFromParcel(Parcel parcel) {
            return new AdUnitIdBiddingSettings(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final AdUnitIdBiddingSettings[] newArray(int i10) {
            return new AdUnitIdBiddingSettings[i10];
        }
    }

    public AdUnitIdBiddingSettings(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        this.f18213b = arrayList;
        parcel.readList(arrayList, ce0.class.getClassLoader());
        this.f18212a = parcel.readString();
        this.f18214c = parcel.readString();
    }

    public AdUnitIdBiddingSettings(String str, String str2, ArrayList arrayList) {
        this.f18212a = str;
        this.f18213b = arrayList;
        this.f18214c = str2;
    }

    public final String c() {
        return this.f18212a;
    }

    public final List<ce0> d() {
        return this.f18213b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f18214c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdUnitIdBiddingSettings adUnitIdBiddingSettings = (AdUnitIdBiddingSettings) obj;
        return this.f18212a.equals(adUnitIdBiddingSettings.f18212a) && this.f18213b.equals(adUnitIdBiddingSettings.f18213b);
    }

    public final int hashCode() {
        return this.f18213b.hashCode() + (this.f18212a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(this.f18213b);
        parcel.writeString(this.f18212a);
        parcel.writeString(this.f18214c);
    }
}
