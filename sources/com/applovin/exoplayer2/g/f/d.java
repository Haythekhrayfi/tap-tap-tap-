package com.applovin.exoplayer2.g.f;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class d implements com.applovin.exoplayer2.g.a.InterfaceC0092a {
    public static final Parcelable.Creator<d> CREATOR = new Parcelable.Creator<d>() { // from class: com.applovin.exoplayer2.g.f.d.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d[] newArray(int i10) {
            return new d[i10];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f6416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6417b;

    public d(float f10, int i10) {
        this.f6416a = f10;
        this.f6417b = i10;
    }

    private d(Parcel parcel) {
        this.f6416a = parcel.readFloat();
        this.f6417b = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f6416a == dVar.f6416a && this.f6417b == dVar.f6417b;
    }

    public int hashCode() {
        return ((com.applovin.exoplayer2.common.b.b.a(this.f6416a) + 527) * 31) + this.f6417b;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("smta: captureFrameRate=");
        sbA.append(this.f6416a);
        sbA.append(", svcTemporalLayerCount=");
        sbA.append(this.f6417b);
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f6416a);
        parcel.writeInt(this.f6417b);
    }
}
