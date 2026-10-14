package com.yandex.mobile.ads.nativeads.template.appearance;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class RatingAppearance implements Parcelable {
    public static final Parcelable.Creator<RatingAppearance> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f27929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f27930b;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f27931a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f27932b;

        public RatingAppearance build() {
            return new RatingAppearance(this, 0);
        }

        public Builder setBackgroundStarColor(int i10) {
            this.f27931a = i10;
            return this;
        }

        public Builder setProgressStarColor(int i10) {
            this.f27932b = i10;
            return this;
        }
    }

    public class a implements Parcelable.Creator<RatingAppearance> {
        @Override // android.os.Parcelable.Creator
        public final RatingAppearance createFromParcel(Parcel parcel) {
            return new RatingAppearance(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final RatingAppearance[] newArray(int i10) {
            return new RatingAppearance[i10];
        }
    }

    public RatingAppearance(Parcel parcel) {
        this.f27929a = parcel.readInt();
        this.f27930b = parcel.readInt();
    }

    private RatingAppearance(Builder builder) {
        this.f27929a = builder.f27931a;
        this.f27930b = builder.f27932b;
    }

    public /* synthetic */ RatingAppearance(Builder builder, int i10) {
        this(builder);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RatingAppearance.class != obj.getClass()) {
            return false;
        }
        RatingAppearance ratingAppearance = (RatingAppearance) obj;
        return this.f27929a == ratingAppearance.f27929a && this.f27930b == ratingAppearance.f27930b;
    }

    public int getBackgroundStarColor() {
        return this.f27929a;
    }

    public int getProgressStarColor() {
        return this.f27930b;
    }

    public int hashCode() {
        return (this.f27929a * 31) + this.f27930b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f27929a);
        parcel.writeInt(this.f27930b);
    }
}
