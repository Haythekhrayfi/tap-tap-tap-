package com.yandex.mobile.ads.exo.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.ec0;
import com.yandex.mobile.ads.impl.pa;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class IcyInfo implements Metadata.Entry {
    public static final Parcelable.Creator<IcyInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f18557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18559c;

    public class a implements Parcelable.Creator<IcyInfo> {
        @Override // android.os.Parcelable.Creator
        public final IcyInfo createFromParcel(Parcel parcel) {
            return new IcyInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final IcyInfo[] newArray(int i10) {
            return new IcyInfo[i10];
        }
    }

    public IcyInfo(Parcel parcel) {
        this.f18557a = (byte[]) pa.a(parcel.createByteArray());
        this.f18558b = parcel.readString();
        this.f18559c = parcel.readString();
    }

    public IcyInfo(byte[] bArr, String str, String str2) {
        this.f18557a = bArr;
        this.f18558b = str;
        this.f18559c = str2;
    }

    @Override // com.yandex.mobile.ads.exo.metadata.Metadata.Entry
    public final void a(ec0.a aVar) {
        String str = this.f18558b;
        if (str != null) {
            aVar.l(str);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IcyInfo.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f18557a, ((IcyInfo) obj).f18557a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f18557a);
    }

    public final String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.f18558b, this.f18559c, Integer.valueOf(this.f18557a.length));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(this.f18557a);
        parcel.writeString(this.f18558b);
        parcel.writeString(this.f18559c);
    }
}
