package com.yandex.mobile.ads.video.parser.vmap.configurator;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class AdBreakParameters implements Parcelable {
    public static final Parcelable.Creator<AdBreakParameters> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f28013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f28014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f28015c;

    public class a implements Parcelable.Creator<AdBreakParameters> {
        @Override // android.os.Parcelable.Creator
        public final AdBreakParameters createFromParcel(Parcel parcel) {
            return new AdBreakParameters(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final AdBreakParameters[] newArray(int i10) {
            return new AdBreakParameters[i10];
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f28016a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f28017b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f28018c;

        public final void a(String str) {
            this.f28017b = str;
        }

        public final void b(String str) {
            this.f28016a = str;
        }

        public final void c(String str) {
            this.f28018c = str;
        }
    }

    public AdBreakParameters(Parcel parcel) {
        this.f28013a = parcel.readString();
        this.f28014b = parcel.readString();
        this.f28015c = parcel.readString();
    }

    private AdBreakParameters(b bVar) {
        this.f28013a = bVar.f28016a;
        this.f28014b = bVar.f28017b;
        this.f28015c = bVar.f28018c;
    }

    public /* synthetic */ AdBreakParameters(b bVar, int i10) {
        this(bVar);
    }

    public final String c() {
        return this.f28014b;
    }

    public final String d() {
        return this.f28013a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f28015c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f28013a);
        parcel.writeString(this.f28014b);
        parcel.writeString(this.f28015c);
    }
}
