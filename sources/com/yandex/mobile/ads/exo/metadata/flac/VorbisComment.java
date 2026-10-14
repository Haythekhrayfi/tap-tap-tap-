package com.yandex.mobile.ads.exo.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.da1;
import com.yandex.mobile.ads.impl.ec0;
import com.yandex.mobile.ads.impl.v60;
import com.yandex.mobile.ads.impl.z11;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class VorbisComment implements Metadata.Entry {
    public static final Parcelable.Creator<VorbisComment> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18550b;

    public class a implements Parcelable.Creator<VorbisComment> {
        @Override // android.os.Parcelable.Creator
        public final VorbisComment createFromParcel(Parcel parcel) {
            return new VorbisComment(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final VorbisComment[] newArray(int i10) {
            return new VorbisComment[i10];
        }
    }

    public VorbisComment(Parcel parcel) {
        this.f18549a = (String) da1.a(parcel.readString());
        this.f18550b = (String) da1.a(parcel.readString());
    }

    public VorbisComment(String str, String str2) {
        this.f18549a = str;
        this.f18550b = str2;
    }

    @Override // com.yandex.mobile.ads.exo.metadata.Metadata.Entry
    public final void a(ec0.a aVar) {
        String str = this.f18549a;
        Objects.requireNonNull(str);
        switch (str) {
            case "ALBUM":
                aVar.b(this.f18550b);
                break;
            case "TITLE":
                aVar.l(this.f18550b);
                break;
            case "DESCRIPTION":
                aVar.g(this.f18550b);
                break;
            case "ALBUMARTIST":
                aVar.a(this.f18550b);
                break;
            case "ARTIST":
                aVar.c(this.f18550b);
                break;
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
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VorbisComment vorbisComment = (VorbisComment) obj;
        return this.f18549a.equals(vorbisComment.f18549a) && this.f18550b.equals(vorbisComment.f18550b);
    }

    public final int hashCode() {
        return this.f18550b.hashCode() + z11.a(this.f18549a, 527, 31);
    }

    public final String toString() {
        StringBuilder sbA = v60.a("VC: ");
        sbA.append(this.f18549a);
        sbA.append("=");
        sbA.append(this.f18550b);
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f18549a);
        parcel.writeString(this.f18550b);
    }
}
