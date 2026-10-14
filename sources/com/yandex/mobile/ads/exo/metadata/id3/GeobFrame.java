package com.yandex.mobile.ads.exo.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.da1;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class GeobFrame extends Id3Frame {
    public static final Parcelable.Creator<GeobFrame> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f18581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f18582e;

    public class a implements Parcelable.Creator<GeobFrame> {
        @Override // android.os.Parcelable.Creator
        public final GeobFrame createFromParcel(Parcel parcel) {
            return new GeobFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final GeobFrame[] newArray(int i10) {
            return new GeobFrame[i10];
        }
    }

    public GeobFrame(Parcel parcel) {
        super("GEOB");
        this.f18579b = (String) da1.a(parcel.readString());
        this.f18580c = (String) da1.a(parcel.readString());
        this.f18581d = (String) da1.a(parcel.readString());
        this.f18582e = (byte[]) da1.a(parcel.createByteArray());
    }

    public GeobFrame(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f18579b = str;
        this.f18580c = str2;
        this.f18581d = str3;
        this.f18582e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || GeobFrame.class != obj.getClass()) {
            return false;
        }
        GeobFrame geobFrame = (GeobFrame) obj;
        return da1.a(this.f18579b, geobFrame.f18579b) && da1.a(this.f18580c, geobFrame.f18580c) && da1.a(this.f18581d, geobFrame.f18581d) && Arrays.equals(this.f18582e, geobFrame.f18582e);
    }

    public final int hashCode() {
        String str = this.f18579b;
        int iHashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f18580c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f18581d;
        return Arrays.hashCode(this.f18582e) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // com.yandex.mobile.ads.exo.metadata.id3.Id3Frame
    public final String toString() {
        return this.f18583a + ": mimeType=" + this.f18579b + ", filename=" + this.f18580c + ", description=" + this.f18581d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f18579b);
        parcel.writeString(this.f18580c);
        parcel.writeString(this.f18581d);
        parcel.writeByteArray(this.f18582e);
    }
}
