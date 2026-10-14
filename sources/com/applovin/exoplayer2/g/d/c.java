package com.applovin.exoplayer2.g.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.ac;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class c implements com.applovin.exoplayer2.g.a.InterfaceC0092a {
    public static final Parcelable.Creator<c> CREATOR = new Parcelable.Creator<c>() { // from class: com.applovin.exoplayer2.g.d.c.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c[] newArray(int i10) {
            return new c[i10];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f6346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6348c;

    public c(Parcel parcel) {
        this.f6346a = (byte[]) com.applovin.exoplayer2.l.a.b(parcel.createByteArray());
        this.f6347b = parcel.readString();
        this.f6348c = parcel.readString();
    }

    public c(byte[] bArr, String str, String str2) {
        this.f6346a = bArr;
        this.f6347b = str;
        this.f6348c = str2;
    }

    @Override // com.applovin.exoplayer2.g.a.InterfaceC0092a
    public void a(ac.a aVar) {
        String str = this.f6347b;
        if (str != null) {
            aVar.a(str);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f6346a, ((c) obj).f6346a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f6346a);
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.f6347b, this.f6348c, Integer.valueOf(this.f6346a.length));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(this.f6346a);
        parcel.writeString(this.f6347b);
        parcel.writeString(this.f6348c);
    }
}
