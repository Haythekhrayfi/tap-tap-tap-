package com.yandex.mobile.ads.nativeads.template.appearance;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes3.dex */
public final class TextAppearance implements Parcelable {
    public static final Parcelable.Creator<TextAppearance> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f27934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f27935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f27936d;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f27937a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f27938b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f27939c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f27940d;

        public TextAppearance build() {
            return new TextAppearance(this, 0);
        }

        public Builder setFontFamilyName(String str) {
            this.f27937a = str;
            return this;
        }

        public Builder setFontStyle(int i10) {
            this.f27940d = i10;
            return this;
        }

        public Builder setTextColor(int i10) {
            this.f27938b = i10;
            return this;
        }

        public Builder setTextSize(float f10) {
            this.f27939c = f10;
            return this;
        }
    }

    public class a implements Parcelable.Creator<TextAppearance> {
        @Override // android.os.Parcelable.Creator
        public final TextAppearance createFromParcel(Parcel parcel) {
            return new TextAppearance(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final TextAppearance[] newArray(int i10) {
            return new TextAppearance[i10];
        }
    }

    public TextAppearance(Parcel parcel) {
        this.f27934b = parcel.readInt();
        this.f27935c = parcel.readFloat();
        this.f27933a = parcel.readString();
        this.f27936d = parcel.readInt();
    }

    private TextAppearance(Builder builder) {
        this.f27934b = builder.f27938b;
        this.f27935c = builder.f27939c;
        this.f27933a = builder.f27937a;
        this.f27936d = builder.f27940d;
    }

    public /* synthetic */ TextAppearance(Builder builder, int i10) {
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
        if (obj == null || TextAppearance.class != obj.getClass()) {
            return false;
        }
        TextAppearance textAppearance = (TextAppearance) obj;
        if (this.f27934b != textAppearance.f27934b || Float.compare(textAppearance.f27935c, this.f27935c) != 0 || this.f27936d != textAppearance.f27936d) {
            return false;
        }
        String str = this.f27933a;
        String str2 = textAppearance.f27933a;
        if (str != null) {
            if (str.equals(str2)) {
                return true;
            }
        } else if (str2 == null) {
            return true;
        }
        return false;
    }

    public String getFontFamilyName() {
        return this.f27933a;
    }

    public int getFontStyle() {
        return this.f27936d;
    }

    public int getTextColor() {
        return this.f27934b;
    }

    public float getTextSize() {
        return this.f27935c;
    }

    public int hashCode() {
        int i10 = this.f27934b * 31;
        float f10 = this.f27935c;
        int iFloatToIntBits = (i10 + (f10 != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD ? Float.floatToIntBits(f10) : 0)) * 31;
        String str = this.f27933a;
        return ((iFloatToIntBits + (str != null ? str.hashCode() : 0)) * 31) + this.f27936d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f27934b);
        parcel.writeFloat(this.f27935c);
        parcel.writeString(this.f27933a);
        parcel.writeInt(this.f27936d);
    }
}
