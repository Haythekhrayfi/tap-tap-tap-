package com.yandex.mobile.ads.exo.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.v60;

/* JADX INFO: loaded from: classes.dex */
public final class SmtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<SmtaMetadataEntry> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f18611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18612b;

    public class a implements Parcelable.Creator<SmtaMetadataEntry> {
        @Override // android.os.Parcelable.Creator
        public final SmtaMetadataEntry createFromParcel(Parcel parcel) {
            return new SmtaMetadataEntry(parcel, 0);
        }

        @Override // android.os.Parcelable.Creator
        public final SmtaMetadataEntry[] newArray(int i10) {
            return new SmtaMetadataEntry[i10];
        }
    }

    public SmtaMetadataEntry(int i10, float f10) {
        this.f18611a = f10;
        this.f18612b = i10;
    }

    private SmtaMetadataEntry(Parcel parcel) {
        this.f18611a = parcel.readFloat();
        this.f18612b = parcel.readInt();
    }

    public /* synthetic */ SmtaMetadataEntry(Parcel parcel, int i10) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SmtaMetadataEntry.class != obj.getClass()) {
            return false;
        }
        SmtaMetadataEntry smtaMetadataEntry = (SmtaMetadataEntry) obj;
        return this.f18611a == smtaMetadataEntry.f18611a && this.f18612b == smtaMetadataEntry.f18612b;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f18611a).hashCode() + 527) * 31) + this.f18612b;
    }

    public final String toString() {
        StringBuilder sbA = v60.a("smta: captureFrameRate=");
        sbA.append(this.f18611a);
        sbA.append(", svcTemporalLayerCount=");
        sbA.append(this.f18612b);
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f18611a);
        parcel.writeInt(this.f18612b);
    }
}
