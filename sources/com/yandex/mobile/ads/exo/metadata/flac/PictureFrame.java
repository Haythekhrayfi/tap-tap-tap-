package com.yandex.mobile.ads.exo.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.da1;
import com.yandex.mobile.ads.impl.ec0;
import com.yandex.mobile.ads.impl.v60;
import com.yandex.mobile.ads.impl.z11;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class PictureFrame implements Metadata.Entry {
    public static final Parcelable.Creator<PictureFrame> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18544d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f18545e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f18546f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f18547g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f18548h;

    public class a implements Parcelable.Creator<PictureFrame> {
        @Override // android.os.Parcelable.Creator
        public final PictureFrame createFromParcel(Parcel parcel) {
            return new PictureFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PictureFrame[] newArray(int i10) {
            return new PictureFrame[i10];
        }
    }

    public PictureFrame(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f18541a = i10;
        this.f18542b = str;
        this.f18543c = str2;
        this.f18544d = i11;
        this.f18545e = i12;
        this.f18546f = i13;
        this.f18547g = i14;
        this.f18548h = bArr;
    }

    public PictureFrame(Parcel parcel) {
        this.f18541a = parcel.readInt();
        this.f18542b = (String) da1.a(parcel.readString());
        this.f18543c = (String) da1.a(parcel.readString());
        this.f18544d = parcel.readInt();
        this.f18545e = parcel.readInt();
        this.f18546f = parcel.readInt();
        this.f18547g = parcel.readInt();
        this.f18548h = (byte[]) da1.a(parcel.createByteArray());
    }

    @Override // com.yandex.mobile.ads.exo.metadata.Metadata.Entry
    public final void a(ec0.a aVar) {
        aVar.a(this.f18541a, this.f18548h);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PictureFrame.class != obj.getClass()) {
            return false;
        }
        PictureFrame pictureFrame = (PictureFrame) obj;
        return this.f18541a == pictureFrame.f18541a && this.f18542b.equals(pictureFrame.f18542b) && this.f18543c.equals(pictureFrame.f18543c) && this.f18544d == pictureFrame.f18544d && this.f18545e == pictureFrame.f18545e && this.f18546f == pictureFrame.f18546f && this.f18547g == pictureFrame.f18547g && Arrays.equals(this.f18548h, pictureFrame.f18548h);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f18548h) + ((((((((z11.a(this.f18543c, z11.a(this.f18542b, (this.f18541a + 527) * 31, 31), 31) + this.f18544d) * 31) + this.f18545e) * 31) + this.f18546f) * 31) + this.f18547g) * 31);
    }

    public final String toString() {
        StringBuilder sbA = v60.a("Picture: mimeType=");
        sbA.append(this.f18542b);
        sbA.append(", description=");
        sbA.append(this.f18543c);
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f18541a);
        parcel.writeString(this.f18542b);
        parcel.writeString(this.f18543c);
        parcel.writeInt(this.f18544d);
        parcel.writeInt(this.f18545e);
        parcel.writeInt(this.f18546f);
        parcel.writeInt(this.f18547g);
        parcel.writeByteArray(this.f18548h);
    }
}
