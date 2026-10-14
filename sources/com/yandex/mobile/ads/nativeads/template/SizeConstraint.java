package com.yandex.mobile.ads.nativeads.template;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes3.dex */
public final class SizeConstraint implements Parcelable {
    public static final Parcelable.Creator<SizeConstraint> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SizeConstraintType f27865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f27866b;

    public enum SizeConstraintType {
        FIXED,
        FIXED_RATIO,
        PREFERRED_RATIO;

        SizeConstraintType() {
        }
    }

    public class a implements Parcelable.Creator<SizeConstraint> {
        @Override // android.os.Parcelable.Creator
        public final SizeConstraint createFromParcel(Parcel parcel) {
            return new SizeConstraint(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SizeConstraint[] newArray(int i10) {
            return new SizeConstraint[i10];
        }
    }

    public SizeConstraint(Parcel parcel) {
        this.f27866b = parcel.readFloat();
        int i10 = parcel.readInt();
        this.f27865a = i10 == -1 ? null : SizeConstraintType.values()[i10];
    }

    public SizeConstraint(SizeConstraintType sizeConstraintType, float f10) {
        this.f27865a = sizeConstraintType;
        this.f27866b = f10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SizeConstraint.class != obj.getClass()) {
            return false;
        }
        SizeConstraint sizeConstraint = (SizeConstraint) obj;
        return Float.compare(sizeConstraint.f27866b, this.f27866b) == 0 && this.f27865a == sizeConstraint.f27865a;
    }

    public SizeConstraintType getSizeConstraintType() {
        return this.f27865a;
    }

    public float getValue() {
        return this.f27866b;
    }

    public int hashCode() {
        float f10 = this.f27866b;
        int iFloatToIntBits = (f10 != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD ? Float.floatToIntBits(f10) : 0) * 31;
        SizeConstraintType sizeConstraintType = this.f27865a;
        return iFloatToIntBits + (sizeConstraintType != null ? sizeConstraintType.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f27866b);
        SizeConstraintType sizeConstraintType = this.f27865a;
        parcel.writeInt(sizeConstraintType == null ? -1 : sizeConstraintType.ordinal());
    }
}
