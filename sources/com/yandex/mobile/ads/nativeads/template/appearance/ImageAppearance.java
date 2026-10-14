package com.yandex.mobile.ads.nativeads.template.appearance;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.nativeads.template.SizeConstraint;

/* JADX INFO: loaded from: classes3.dex */
public final class ImageAppearance implements Parcelable {
    public static final Parcelable.Creator<ImageAppearance> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SizeConstraint f27891a;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private SizeConstraint f27892a;

        public ImageAppearance build() {
            return new ImageAppearance(this, 0);
        }

        public Builder setWidthConstraint(SizeConstraint sizeConstraint) {
            this.f27892a = sizeConstraint;
            return this;
        }
    }

    public class a implements Parcelable.Creator<ImageAppearance> {
        @Override // android.os.Parcelable.Creator
        public final ImageAppearance createFromParcel(Parcel parcel) {
            return new ImageAppearance(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ImageAppearance[] newArray(int i10) {
            return new ImageAppearance[i10];
        }
    }

    public ImageAppearance(Parcel parcel) {
        this.f27891a = (SizeConstraint) parcel.readParcelable(SizeConstraint.class.getClassLoader());
    }

    private ImageAppearance(Builder builder) {
        this.f27891a = builder.f27892a;
    }

    public /* synthetic */ ImageAppearance(Builder builder, int i10) {
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
        if (obj == null || ImageAppearance.class != obj.getClass()) {
            return false;
        }
        SizeConstraint sizeConstraint = this.f27891a;
        SizeConstraint sizeConstraint2 = ((ImageAppearance) obj).f27891a;
        if (sizeConstraint != null) {
            if (sizeConstraint.equals(sizeConstraint2)) {
                return true;
            }
        } else if (sizeConstraint2 == null) {
            return true;
        }
        return false;
    }

    public SizeConstraint getWidthConstraint() {
        return this.f27891a;
    }

    public int hashCode() {
        SizeConstraint sizeConstraint = this.f27891a;
        if (sizeConstraint != null) {
            return sizeConstraint.hashCode();
        }
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f27891a, i10);
    }
}
