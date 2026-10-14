package com.yandex.mobile.ads.nativeads.template;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes3.dex */
public final class HorizontalOffset implements Parcelable {
    public static final Parcelable.Creator<HorizontalOffset> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f27836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f27837b;

    public class a implements Parcelable.Creator<HorizontalOffset> {
        @Override // android.os.Parcelable.Creator
        public final HorizontalOffset createFromParcel(Parcel parcel) {
            return new HorizontalOffset(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final HorizontalOffset[] newArray(int i10) {
            return new HorizontalOffset[i10];
        }
    }

    public HorizontalOffset(float f10, float f11) {
        this.f27836a = f10;
        this.f27837b = f11;
    }

    public HorizontalOffset(Parcel parcel) {
        this.f27836a = parcel.readFloat();
        this.f27837b = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || HorizontalOffset.class != obj.getClass()) {
            return false;
        }
        HorizontalOffset horizontalOffset = (HorizontalOffset) obj;
        return Float.compare(horizontalOffset.f27836a, this.f27836a) == 0 && Float.compare(horizontalOffset.f27837b, this.f27837b) == 0;
    }

    public float getLeft() {
        return this.f27836a;
    }

    public float getRight() {
        return this.f27837b;
    }

    public int hashCode() {
        float f10 = this.f27836a;
        int iFloatToIntBits = (f10 != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD ? Float.floatToIntBits(f10) : 0) * 31;
        float f11 = this.f27837b;
        return iFloatToIntBits + (f11 != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD ? Float.floatToIntBits(f11) : 0);
    }

    public String toString() {
        return this.f27836a + ", " + this.f27837b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f27836a);
        parcel.writeFloat(this.f27837b);
    }
}
