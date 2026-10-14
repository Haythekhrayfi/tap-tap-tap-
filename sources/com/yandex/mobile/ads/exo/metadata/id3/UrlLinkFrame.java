package com.yandex.mobile.ads.exo.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.da1;
import com.yandex.mobile.ads.impl.z11;

/* JADX INFO: loaded from: classes.dex */
public final class UrlLinkFrame extends Id3Frame {
    public static final Parcelable.Creator<UrlLinkFrame> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18597c;

    public class a implements Parcelable.Creator<UrlLinkFrame> {
        @Override // android.os.Parcelable.Creator
        public final UrlLinkFrame createFromParcel(Parcel parcel) {
            return new UrlLinkFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final UrlLinkFrame[] newArray(int i10) {
            return new UrlLinkFrame[i10];
        }
    }

    public UrlLinkFrame(Parcel parcel) {
        super((String) da1.a(parcel.readString()));
        this.f18596b = parcel.readString();
        this.f18597c = (String) da1.a(parcel.readString());
    }

    public UrlLinkFrame(String str, String str2, String str3) {
        super(str);
        this.f18596b = str2;
        this.f18597c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || UrlLinkFrame.class != obj.getClass()) {
            return false;
        }
        UrlLinkFrame urlLinkFrame = (UrlLinkFrame) obj;
        return this.f18583a.equals(urlLinkFrame.f18583a) && da1.a(this.f18596b, urlLinkFrame.f18596b) && da1.a(this.f18597c, urlLinkFrame.f18597c);
    }

    public final int hashCode() {
        int iA = z11.a(this.f18583a, 527, 31);
        String str = this.f18596b;
        int iHashCode = (iA + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f18597c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.yandex.mobile.ads.exo.metadata.id3.Id3Frame
    public final String toString() {
        return this.f18583a + ": url=" + this.f18597c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f18583a);
        parcel.writeString(this.f18596b);
        parcel.writeString(this.f18597c);
    }
}
