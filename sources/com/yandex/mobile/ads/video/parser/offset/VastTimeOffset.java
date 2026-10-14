package com.yandex.mobile.ads.video.parser.offset;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class VastTimeOffset implements Parcelable {
    public static final Parcelable.Creator<VastTimeOffset> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f28003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f28004b;

    public class a implements Parcelable.Creator<VastTimeOffset> {
        @Override // android.os.Parcelable.Creator
        public final VastTimeOffset createFromParcel(Parcel parcel) {
            return new VastTimeOffset(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final VastTimeOffset[] newArray(int i10) {
            return new VastTimeOffset[i10];
        }
    }

    public enum b {
        f28005a,
        f28006b,
        f28007c;

        b() {
        }
    }

    public VastTimeOffset(Parcel parcel) {
        int i10 = parcel.readInt();
        this.f28003a = i10 == -1 ? null : b.values()[i10];
        this.f28004b = parcel.readFloat();
    }

    public VastTimeOffset(b bVar, float f10) {
        this.f28003a = bVar;
        this.f28004b = f10;
    }

    public final b c() {
        return this.f28003a;
    }

    public final float d() {
        return this.f28004b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        b bVar = this.f28003a;
        parcel.writeInt(bVar == null ? -1 : bVar.ordinal());
        parcel.writeFloat(this.f28004b);
    }
}
