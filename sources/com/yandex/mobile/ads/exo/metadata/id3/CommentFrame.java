package com.yandex.mobile.ads.exo.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.da1;

/* JADX INFO: loaded from: classes.dex */
public final class CommentFrame extends Id3Frame {
    public static final Parcelable.Creator<CommentFrame> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f18578d;

    public class a implements Parcelable.Creator<CommentFrame> {
        @Override // android.os.Parcelable.Creator
        public final CommentFrame createFromParcel(Parcel parcel) {
            return new CommentFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final CommentFrame[] newArray(int i10) {
            return new CommentFrame[i10];
        }
    }

    public CommentFrame(Parcel parcel) {
        super("COMM");
        this.f18576b = (String) da1.a(parcel.readString());
        this.f18577c = (String) da1.a(parcel.readString());
        this.f18578d = (String) da1.a(parcel.readString());
    }

    public CommentFrame(String str, String str2, String str3) {
        super("COMM");
        this.f18576b = str;
        this.f18577c = str2;
        this.f18578d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CommentFrame.class != obj.getClass()) {
            return false;
        }
        CommentFrame commentFrame = (CommentFrame) obj;
        return da1.a(this.f18577c, commentFrame.f18577c) && da1.a(this.f18576b, commentFrame.f18576b) && da1.a(this.f18578d, commentFrame.f18578d);
    }

    public final int hashCode() {
        String str = this.f18576b;
        int iHashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f18577c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f18578d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.yandex.mobile.ads.exo.metadata.id3.Id3Frame
    public final String toString() {
        return this.f18583a + ": language=" + this.f18576b + ", description=" + this.f18577c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f18583a);
        parcel.writeString(this.f18576b);
        parcel.writeString(this.f18578d);
    }
}
