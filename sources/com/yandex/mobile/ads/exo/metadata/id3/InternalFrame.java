package com.yandex.mobile.ads.exo.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.da1;

/* JADX INFO: loaded from: classes.dex */
public final class InternalFrame extends Id3Frame {
    public static final Parcelable.Creator<InternalFrame> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f18586d;

    public class a implements Parcelable.Creator<InternalFrame> {
        @Override // android.os.Parcelable.Creator
        public final InternalFrame createFromParcel(Parcel parcel) {
            return new InternalFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final InternalFrame[] newArray(int i10) {
            return new InternalFrame[i10];
        }
    }

    public InternalFrame(Parcel parcel) {
        super("----");
        this.f18584b = (String) da1.a(parcel.readString());
        this.f18585c = (String) da1.a(parcel.readString());
        this.f18586d = (String) da1.a(parcel.readString());
    }

    public InternalFrame(String str, String str2, String str3) {
        super("----");
        this.f18584b = str;
        this.f18585c = str2;
        this.f18586d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || InternalFrame.class != obj.getClass()) {
            return false;
        }
        InternalFrame internalFrame = (InternalFrame) obj;
        return da1.a(this.f18585c, internalFrame.f18585c) && da1.a(this.f18584b, internalFrame.f18584b) && da1.a(this.f18586d, internalFrame.f18586d);
    }

    public final int hashCode() {
        String str = this.f18584b;
        int iHashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f18585c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f18586d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.yandex.mobile.ads.exo.metadata.id3.Id3Frame
    public final String toString() {
        return this.f18583a + ": domain=" + this.f18584b + ", description=" + this.f18585c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f18583a);
        parcel.writeString(this.f18584b);
        parcel.writeString(this.f18586d);
    }
}
