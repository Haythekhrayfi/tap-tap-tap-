package com.yandex.mobile.ads.base.model.reward;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public class RewardData implements Parcelable {
    public static final Parcelable.Creator<RewardData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f18220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ClientSideReward f18221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ServerSideReward f18222c;

    public class a implements Parcelable.Creator<RewardData> {
        @Override // android.os.Parcelable.Creator
        public final RewardData createFromParcel(Parcel parcel) {
            return new RewardData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final RewardData[] newArray(int i10) {
            return new RewardData[i10];
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f18223a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ClientSideReward f18224b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ServerSideReward f18225c;

        public final b a(ClientSideReward clientSideReward) {
            this.f18224b = clientSideReward;
            return this;
        }

        public final b a(ServerSideReward serverSideReward) {
            this.f18225c = serverSideReward;
            return this;
        }

        public final b a(boolean z10) {
            this.f18223a = z10;
            return this;
        }

        public final RewardData a() {
            return new RewardData(this, 0);
        }
    }

    public RewardData(Parcel parcel) {
        this.f18220a = parcel.readByte() != 0;
        this.f18221b = (ClientSideReward) parcel.readParcelable(ClientSideReward.class.getClassLoader());
        this.f18222c = (ServerSideReward) parcel.readParcelable(ServerSideReward.class.getClassLoader());
    }

    private RewardData(b bVar) {
        this.f18221b = bVar.f18224b;
        this.f18222c = bVar.f18225c;
        this.f18220a = bVar.f18223a;
    }

    public /* synthetic */ RewardData(b bVar, int i10) {
        this(bVar);
    }

    public final ClientSideReward c() {
        return this.f18221b;
    }

    public final ServerSideReward d() {
        return this.f18222c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.f18220a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByte(this.f18220a ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f18221b, i10);
        parcel.writeParcelable(this.f18222c, i10);
    }
}
