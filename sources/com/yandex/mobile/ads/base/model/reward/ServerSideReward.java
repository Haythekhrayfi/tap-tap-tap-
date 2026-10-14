package com.yandex.mobile.ads.base.model.reward;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public class ServerSideReward implements Parcelable {
    public static final Parcelable.Creator<ServerSideReward> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f18226a;

    public class a implements Parcelable.Creator<ServerSideReward> {
        @Override // android.os.Parcelable.Creator
        public final ServerSideReward createFromParcel(Parcel parcel) {
            return new ServerSideReward(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ServerSideReward[] newArray(int i10) {
            return new ServerSideReward[i10];
        }
    }

    public ServerSideReward(Parcel parcel) {
        this.f18226a = parcel.readString();
    }

    public ServerSideReward(String str) {
        this.f18226a = str;
    }

    public final String c() {
        return this.f18226a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f18226a);
    }
}
