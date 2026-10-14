package com.yandex.mobile.ads.nativeads.template.appearance;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes3.dex */
public final class ButtonAppearance implements Parcelable {
    public static final Parcelable.Creator<ButtonAppearance> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextAppearance f27881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f27882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f27883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f27884d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f27885e;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f27886a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f27887b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f27888c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f27889d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private TextAppearance f27890e;

        public ButtonAppearance build() {
            return new ButtonAppearance(this, 0);
        }

        public Builder setBorderColor(int i10) {
            this.f27886a = i10;
            return this;
        }

        public Builder setBorderWidth(float f10) {
            this.f27887b = f10;
            return this;
        }

        public Builder setNormalColor(int i10) {
            this.f27888c = i10;
            return this;
        }

        public Builder setPressedColor(int i10) {
            this.f27889d = i10;
            return this;
        }

        public Builder setTextAppearance(TextAppearance textAppearance) {
            this.f27890e = textAppearance;
            return this;
        }
    }

    public class a implements Parcelable.Creator<ButtonAppearance> {
        @Override // android.os.Parcelable.Creator
        public final ButtonAppearance createFromParcel(Parcel parcel) {
            return new ButtonAppearance(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ButtonAppearance[] newArray(int i10) {
            return new ButtonAppearance[i10];
        }
    }

    public ButtonAppearance(Parcel parcel) {
        this.f27882b = parcel.readInt();
        this.f27883c = parcel.readFloat();
        this.f27884d = parcel.readInt();
        this.f27885e = parcel.readInt();
        this.f27881a = (TextAppearance) parcel.readParcelable(TextAppearance.class.getClassLoader());
    }

    private ButtonAppearance(Builder builder) {
        this.f27882b = builder.f27886a;
        this.f27883c = builder.f27887b;
        this.f27884d = builder.f27888c;
        this.f27885e = builder.f27889d;
        this.f27881a = builder.f27890e;
    }

    public /* synthetic */ ButtonAppearance(Builder builder, int i10) {
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
        if (obj == null || ButtonAppearance.class != obj.getClass()) {
            return false;
        }
        ButtonAppearance buttonAppearance = (ButtonAppearance) obj;
        if (this.f27882b != buttonAppearance.f27882b || Float.compare(buttonAppearance.f27883c, this.f27883c) != 0 || this.f27884d != buttonAppearance.f27884d || this.f27885e != buttonAppearance.f27885e) {
            return false;
        }
        TextAppearance textAppearance = this.f27881a;
        TextAppearance textAppearance2 = buttonAppearance.f27881a;
        if (textAppearance != null) {
            if (textAppearance.equals(textAppearance2)) {
                return true;
            }
        } else if (textAppearance2 == null) {
            return true;
        }
        return false;
    }

    public int getBorderColor() {
        return this.f27882b;
    }

    public float getBorderWidth() {
        return this.f27883c;
    }

    public int getNormalColor() {
        return this.f27884d;
    }

    public int getPressedColor() {
        return this.f27885e;
    }

    public TextAppearance getTextAppearance() {
        return this.f27881a;
    }

    public int hashCode() {
        int i10 = this.f27882b * 31;
        float f10 = this.f27883c;
        int iFloatToIntBits = (((((i10 + (f10 != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD ? Float.floatToIntBits(f10) : 0)) * 31) + this.f27884d) * 31) + this.f27885e) * 31;
        TextAppearance textAppearance = this.f27881a;
        return iFloatToIntBits + (textAppearance != null ? textAppearance.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f27882b);
        parcel.writeFloat(this.f27883c);
        parcel.writeInt(this.f27884d);
        parcel.writeInt(this.f27885e);
        parcel.writeParcelable(this.f27881a, 0);
    }
}
