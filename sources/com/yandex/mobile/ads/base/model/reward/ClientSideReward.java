package com.yandex.mobile.ads.base.model.reward;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public class ClientSideReward implements Parcelable {
    public static final Parcelable.Creator<ClientSideReward> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f18218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f18219b;

    public class a implements Parcelable.Creator<ClientSideReward> {
        @Override // android.os.Parcelable.Creator
        public final ClientSideReward createFromParcel(Parcel parcel) {
            return new ClientSideReward(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ClientSideReward[] newArray(int i10) {
            return new ClientSideReward[i10];
        }
    }

    public ClientSideReward(int i10, String str) {
        this.f18218a = i10;
        this.f18219b = str;
    }

    public ClientSideReward(Parcel parcel) {
        this.f18218a = parcel.readInt();
        this.f18219b = parcel.readString();
    }

    public final int c() {
        return this.f18218a;
    }

    public final String d() {
        return this.f18219b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f18218a);
        parcel.writeString(this.f18219b);
    }
}
