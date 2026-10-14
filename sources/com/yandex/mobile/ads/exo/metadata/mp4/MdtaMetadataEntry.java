package com.yandex.mobile.ads.exo.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.da1;
import com.yandex.mobile.ads.impl.v60;
import com.yandex.mobile.ads.impl.z11;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class MdtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<MdtaMetadataEntry> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f18599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18601d;

    public class a implements Parcelable.Creator<MdtaMetadataEntry> {
        @Override // android.os.Parcelable.Creator
        public final MdtaMetadataEntry createFromParcel(Parcel parcel) {
            return new MdtaMetadataEntry(parcel, 0);
        }

        @Override // android.os.Parcelable.Creator
        public final MdtaMetadataEntry[] newArray(int i10) {
            return new MdtaMetadataEntry[i10];
        }
    }

    public MdtaMetadataEntry(int i10, int i11, String str, byte[] bArr) {
        this.f18598a = str;
        this.f18599b = bArr;
        this.f18600c = i10;
        this.f18601d = i11;
    }

    private MdtaMetadataEntry(Parcel parcel) {
        this.f18598a = (String) da1.a(parcel.readString());
        this.f18599b = (byte[]) da1.a(parcel.createByteArray());
        this.f18600c = parcel.readInt();
        this.f18601d = parcel.readInt();
    }

    public /* synthetic */ MdtaMetadataEntry(Parcel parcel, int i10) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MdtaMetadataEntry.class != obj.getClass()) {
            return false;
        }
        MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) obj;
        return this.f18598a.equals(mdtaMetadataEntry.f18598a) && Arrays.equals(this.f18599b, mdtaMetadataEntry.f18599b) && this.f18600c == mdtaMetadataEntry.f18600c && this.f18601d == mdtaMetadataEntry.f18601d;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f18599b) + z11.a(this.f18598a, 527, 31)) * 31) + this.f18600c) * 31) + this.f18601d;
    }

    public final String toString() {
        StringBuilder sbA = v60.a("mdta: key=");
        sbA.append(this.f18598a);
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f18598a);
        parcel.writeByteArray(this.f18599b);
        parcel.writeInt(this.f18600c);
        parcel.writeInt(this.f18601d);
    }
}
