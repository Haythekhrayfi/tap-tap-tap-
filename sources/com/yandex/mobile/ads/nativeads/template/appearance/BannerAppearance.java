package com.yandex.mobile.ads.nativeads.template.appearance;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.yandex.mobile.ads.nativeads.template.HorizontalOffset;

/* JADX INFO: loaded from: classes3.dex */
public final class BannerAppearance implements Parcelable {
    public static final Parcelable.Creator<BannerAppearance> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HorizontalOffset f27871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HorizontalOffset f27872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f27873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f27874d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f27875e;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f27876a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f27877b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f27878c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private HorizontalOffset f27879d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private HorizontalOffset f27880e;

        public BannerAppearance build() {
            return new BannerAppearance(this, 0);
        }

        public Builder setBackgroundColor(int i10) {
            this.f27876a = i10;
            return this;
        }

        public Builder setBorderColor(int i10) {
            this.f27877b = i10;
            return this;
        }

        public Builder setBorderWidth(float f10) {
            this.f27878c = f10;
            return this;
        }

        public Builder setContentPadding(HorizontalOffset horizontalOffset) {
            this.f27879d = horizontalOffset;
            return this;
        }

        public Builder setImageMargins(HorizontalOffset horizontalOffset) {
            this.f27880e = horizontalOffset;
            return this;
        }
    }

    public class a implements Parcelable.Creator<BannerAppearance> {
        @Override // android.os.Parcelable.Creator
        public final BannerAppearance createFromParcel(Parcel parcel) {
            return new BannerAppearance(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final BannerAppearance[] newArray(int i10) {
            return new BannerAppearance[i10];
        }
    }

    public BannerAppearance(Parcel parcel) {
        this.f27873c = parcel.readInt();
        this.f27874d = parcel.readInt();
        this.f27875e = parcel.readFloat();
        this.f27871a = (HorizontalOffset) parcel.readParcelable(HorizontalOffset.class.getClassLoader());
        this.f27872b = (HorizontalOffset) parcel.readParcelable(HorizontalOffset.class.getClassLoader());
    }

    private BannerAppearance(Builder builder) {
        this.f27873c = builder.f27876a;
        this.f27874d = builder.f27877b;
        this.f27875e = builder.f27878c;
        this.f27871a = builder.f27879d;
        this.f27872b = builder.f27880e;
    }

    public /* synthetic */ BannerAppearance(Builder builder, int i10) {
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
        if (obj == null || BannerAppearance.class != obj.getClass()) {
            return false;
        }
        BannerAppearance bannerAppearance = (BannerAppearance) obj;
        if (this.f27873c != bannerAppearance.f27873c || this.f27874d != bannerAppearance.f27874d || Float.compare(bannerAppearance.f27875e, this.f27875e) != 0) {
            return false;
        }
        HorizontalOffset horizontalOffset = this.f27871a;
        if (horizontalOffset == null ? bannerAppearance.f27871a != null : !horizontalOffset.equals(bannerAppearance.f27871a)) {
            return false;
        }
        HorizontalOffset horizontalOffset2 = this.f27872b;
        HorizontalOffset horizontalOffset3 = bannerAppearance.f27872b;
        return horizontalOffset2 == null ? horizontalOffset3 == null : horizontalOffset2.equals(horizontalOffset3);
    }

    public int getBackgroundColor() {
        return this.f27873c;
    }

    public int getBorderColor() {
        return this.f27874d;
    }

    public float getBorderWidth() {
        return this.f27875e;
    }

    public HorizontalOffset getContentPadding() {
        return this.f27871a;
    }

    public HorizontalOffset getImageMargins() {
        return this.f27872b;
    }

    public int hashCode() {
        int i10 = ((this.f27873c * 31) + this.f27874d) * 31;
        float f10 = this.f27875e;
        int iFloatToIntBits = (i10 + (f10 != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD ? Float.floatToIntBits(f10) : 0)) * 31;
        HorizontalOffset horizontalOffset = this.f27871a;
        int iHashCode = (iFloatToIntBits + (horizontalOffset != null ? horizontalOffset.hashCode() : 0)) * 31;
        HorizontalOffset horizontalOffset2 = this.f27872b;
        return iHashCode + (horizontalOffset2 != null ? horizontalOffset2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f27873c);
        parcel.writeInt(this.f27874d);
        parcel.writeFloat(this.f27875e);
        parcel.writeParcelable(this.f27871a, 0);
        parcel.writeParcelable(this.f27872b, 0);
    }
}
