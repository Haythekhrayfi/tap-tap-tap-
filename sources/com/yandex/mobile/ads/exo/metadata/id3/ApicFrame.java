package com.yandex.mobile.ads.exo.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.da1;
import com.yandex.mobile.ads.impl.ec0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ApicFrame extends Id3Frame {
    public static final Parcelable.Creator<ApicFrame> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f18563e;

    public class a implements Parcelable.Creator<ApicFrame> {
        @Override // android.os.Parcelable.Creator
        public final ApicFrame createFromParcel(Parcel parcel) {
            return new ApicFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ApicFrame[] newArray(int i10) {
            return new ApicFrame[i10];
        }
    }

    public ApicFrame(Parcel parcel) {
        super("APIC");
        this.f18560b = (String) da1.a(parcel.readString());
        this.f18561c = parcel.readString();
        this.f18562d = parcel.readInt();
        this.f18563e = (byte[]) da1.a(parcel.createByteArray());
    }

    public ApicFrame(String str, String str2, int i10, byte[] bArr) {
        super("APIC");
        this.f18560b = str;
        this.f18561c = str2;
        this.f18562d = i10;
        this.f18563e = bArr;
    }

    @Override // com.yandex.mobile.ads.exo.metadata.Metadata.Entry
    public final void a(ec0.a aVar) {
        aVar.a(this.f18562d, this.f18563e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ApicFrame.class != obj.getClass()) {
            return false;
        }
        ApicFrame apicFrame = (ApicFrame) obj;
        return this.f18562d == apicFrame.f18562d && da1.a(this.f18560b, apicFrame.f18560b) && da1.a(this.f18561c, apicFrame.f18561c) && Arrays.equals(this.f18563e, apicFrame.f18563e);
    }

    public final int hashCode() {
        int i10 = (this.f18562d + 527) * 31;
        String str = this.f18560b;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f18561c;
        return Arrays.hashCode(this.f18563e) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // com.yandex.mobile.ads.exo.metadata.id3.Id3Frame
    public final String toString() {
        return this.f18583a + ": mimeType=" + this.f18560b + ", description=" + this.f18561c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f18560b);
        parcel.writeString(this.f18561c);
        parcel.writeInt(this.f18562d);
        parcel.writeByteArray(this.f18563e);
    }
}
