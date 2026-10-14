package com.yandex.mobile.ads.video.models.ad;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class JavaScriptResource implements Parcelable {
    public static final Parcelable.Creator<JavaScriptResource> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f28000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f28001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f28002c;

    public class a implements Parcelable.Creator<JavaScriptResource> {
        @Override // android.os.Parcelable.Creator
        public final JavaScriptResource createFromParcel(Parcel parcel) {
            return new JavaScriptResource(parcel, 0);
        }

        @Override // android.os.Parcelable.Creator
        public final JavaScriptResource[] newArray(int i10) {
            return new JavaScriptResource[i10];
        }
    }

    private JavaScriptResource(Parcel parcel) {
        this.f28000a = parcel.readString();
        this.f28002c = parcel.readInt() != 0;
        this.f28001b = parcel.readString();
    }

    public /* synthetic */ JavaScriptResource(Parcel parcel, int i10) {
        this(parcel);
    }

    public JavaScriptResource(String str, String str2, boolean z10) {
        this.f28000a = str;
        this.f28001b = str2;
        this.f28002c = z10;
    }

    public final String c() {
        return this.f28000a;
    }

    public final String d() {
        return this.f28001b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || JavaScriptResource.class != obj.getClass()) {
            return false;
        }
        JavaScriptResource javaScriptResource = (JavaScriptResource) obj;
        if (this.f28002c == javaScriptResource.f28002c && this.f28000a.equals(javaScriptResource.f28000a)) {
            return this.f28001b.equals(javaScriptResource.f28001b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f28001b.hashCode() + (((this.f28000a.hashCode() * 31) + (this.f28002c ? 1 : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f28000a);
        parcel.writeInt(this.f28002c ? 1 : 0);
        parcel.writeString(this.f28001b);
    }
}
