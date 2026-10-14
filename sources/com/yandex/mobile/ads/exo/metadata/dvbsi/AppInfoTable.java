package com.yandex.mobile.ads.exo.metadata.dvbsi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.k;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.v60;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class AppInfoTable implements Metadata.Entry {
    public static final Parcelable.Creator<AppInfoTable> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18532b;

    public class a implements Parcelable.Creator<AppInfoTable> {
        @Override // android.os.Parcelable.Creator
        public final AppInfoTable createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            Objects.requireNonNull(string);
            return new AppInfoTable(parcel.readInt(), string);
        }

        @Override // android.os.Parcelable.Creator
        public final AppInfoTable[] newArray(int i10) {
            return new AppInfoTable[i10];
        }
    }

    public AppInfoTable(int i10, String str) {
        this.f18531a = i10;
        this.f18532b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sbA = v60.a("Ait(controlCode=");
        sbA.append(this.f18531a);
        sbA.append(",url=");
        return k.a(sbA, this.f18532b, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f18532b);
        parcel.writeInt(this.f18531a);
    }
}
