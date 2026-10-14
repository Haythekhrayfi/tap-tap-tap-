package com.yandex.mobile.ads.exo.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.da1;
import com.yandex.mobile.ads.impl.z11;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class BinaryFrame extends Id3Frame {
    public static final Parcelable.Creator<BinaryFrame> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f18564b;

    public class a implements Parcelable.Creator<BinaryFrame> {
        @Override // android.os.Parcelable.Creator
        public final BinaryFrame createFromParcel(Parcel parcel) {
            return new BinaryFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final BinaryFrame[] newArray(int i10) {
            return new BinaryFrame[i10];
        }
    }

    public BinaryFrame(Parcel parcel) {
        super((String) da1.a(parcel.readString()));
        this.f18564b = (byte[]) da1.a(parcel.createByteArray());
    }

    public BinaryFrame(String str, byte[] bArr) {
        super(str);
        this.f18564b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BinaryFrame.class != obj.getClass()) {
            return false;
        }
        BinaryFrame binaryFrame = (BinaryFrame) obj;
        return this.f18583a.equals(binaryFrame.f18583a) && Arrays.equals(this.f18564b, binaryFrame.f18564b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f18564b) + z11.a(this.f18583a, 527, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f18583a);
        parcel.writeByteArray(this.f18564b);
    }
}
