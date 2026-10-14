package com.yandex.mobile.ads.exo.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.da1;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class PrivFrame extends Id3Frame {
    public static final Parcelable.Creator<PrivFrame> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f18593c;

    public class a implements Parcelable.Creator<PrivFrame> {
        @Override // android.os.Parcelable.Creator
        public final PrivFrame createFromParcel(Parcel parcel) {
            return new PrivFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PrivFrame[] newArray(int i10) {
            return new PrivFrame[i10];
        }
    }

    public PrivFrame(Parcel parcel) {
        super("PRIV");
        this.f18592b = (String) da1.a(parcel.readString());
        this.f18593c = (byte[]) da1.a(parcel.createByteArray());
    }

    public PrivFrame(String str, byte[] bArr) {
        super("PRIV");
        this.f18592b = str;
        this.f18593c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PrivFrame.class != obj.getClass()) {
            return false;
        }
        PrivFrame privFrame = (PrivFrame) obj;
        return da1.a(this.f18592b, privFrame.f18592b) && Arrays.equals(this.f18593c, privFrame.f18593c);
    }

    public final int hashCode() {
        String str = this.f18592b;
        return Arrays.hashCode(this.f18593c) + (((str != null ? str.hashCode() : 0) + 527) * 31);
    }

    @Override // com.yandex.mobile.ads.exo.metadata.id3.Id3Frame
    public final String toString() {
        return this.f18583a + ": owner=" + this.f18592b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f18592b);
        parcel.writeByteArray(this.f18593c);
    }
}
