package com.yandex.mobile.ads.base;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.a21;
import com.yandex.mobile.ads.impl.a6;
import com.yandex.mobile.ads.impl.eh1;
import com.yandex.mobile.ads.impl.y11;
import com.yandex.mobile.ads.impl.z11;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class SizeInfo implements Parcelable {
    public static final Parcelable.Creator<SizeInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f18208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f18209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f18210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f18211d;

    public class a implements Parcelable.Creator<SizeInfo> {
        @Override // android.os.Parcelable.Creator
        public final SizeInfo createFromParcel(Parcel parcel) {
            return new SizeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SizeInfo[] newArray(int i10) {
            return new SizeInfo[i10];
        }
    }

    public SizeInfo(int i10, int i11, int i12) {
        this.f18208a = (i10 >= 0 || -1 == i10) ? i10 : 0;
        this.f18209b = (i11 >= 0 || -2 == i11) ? i11 : 0;
        this.f18211d = i12;
        this.f18210c = String.format(Locale.US, "%dx%d", Integer.valueOf(i10), Integer.valueOf(i11));
    }

    public SizeInfo(Parcel parcel) {
        this.f18208a = parcel.readInt();
        this.f18209b = parcel.readInt();
        this.f18211d = a21._values()[parcel.readInt()];
        this.f18210c = parcel.readString();
    }

    public final int a(Context context) {
        int i10 = this.f18209b;
        return -2 == i10 ? eh1.b(context) : i10;
    }

    public final int b(Context context) {
        int i10 = this.f18209b;
        if (-2 == i10) {
            int i11 = eh1.f20253b;
            return context.getResources().getDisplayMetrics().heightPixels;
        }
        int i12 = eh1.f20253b;
        return y11.a(context, 1, i10);
    }

    public final int c() {
        return this.f18209b;
    }

    public final int c(Context context) {
        int i10 = this.f18208a;
        return -1 == i10 ? eh1.c(context) : i10;
    }

    public final int d() {
        return this.f18211d;
    }

    public final int d(Context context) {
        int i10 = this.f18208a;
        if (-1 == i10) {
            int i11 = eh1.f20253b;
            return context.getResources().getDisplayMetrics().widthPixels;
        }
        int i12 = eh1.f20253b;
        return y11.a(context, 1, i10);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.f18208a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SizeInfo sizeInfo = (SizeInfo) obj;
        return this.f18208a == sizeInfo.f18208a && this.f18209b == sizeInfo.f18209b && this.f18211d == sizeInfo.f18211d;
    }

    public final int hashCode() {
        return a6.a(this.f18211d) + z11.a(this.f18210c, ((this.f18208a * 31) + this.f18209b) * 31, 31);
    }

    public final String toString() {
        return this.f18210c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f18208a);
        parcel.writeInt(this.f18209b);
        parcel.writeInt(a6.a(this.f18211d));
        parcel.writeString(this.f18210c);
    }
}
