package com.applovin.exoplayer2.g.f;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class b implements com.applovin.exoplayer2.g.a.InterfaceC0092a {
    public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator<b>() { // from class: com.applovin.exoplayer2.g.f.b.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i10) {
            return new b[i10];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f6408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f6409d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f6410e;

    public b(long j10, long j11, long j12, long j13, long j14) {
        this.f6406a = j10;
        this.f6407b = j11;
        this.f6408c = j12;
        this.f6409d = j13;
        this.f6410e = j14;
    }

    private b(Parcel parcel) {
        this.f6406a = parcel.readLong();
        this.f6407b = parcel.readLong();
        this.f6408c = parcel.readLong();
        this.f6409d = parcel.readLong();
        this.f6410e = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f6406a == bVar.f6406a && this.f6407b == bVar.f6407b && this.f6408c == bVar.f6408c && this.f6409d == bVar.f6409d && this.f6410e == bVar.f6410e;
    }

    public int hashCode() {
        return com.applovin.exoplayer2.common.b.d.a(this.f6410e) + ((com.applovin.exoplayer2.common.b.d.a(this.f6409d) + ((com.applovin.exoplayer2.common.b.d.a(this.f6408c) + ((com.applovin.exoplayer2.common.b.d.a(this.f6407b) + ((com.applovin.exoplayer2.common.b.d.a(this.f6406a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("Motion photo metadata: photoStartPosition=");
        sbA.append(this.f6406a);
        sbA.append(", photoSize=");
        sbA.append(this.f6407b);
        sbA.append(", photoPresentationTimestampUs=");
        sbA.append(this.f6408c);
        sbA.append(", videoStartPosition=");
        sbA.append(this.f6409d);
        sbA.append(", videoSize=");
        sbA.append(this.f6410e);
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f6406a);
        parcel.writeLong(this.f6407b);
        parcel.writeLong(this.f6408c);
        parcel.writeLong(this.f6409d);
        parcel.writeLong(this.f6410e);
    }
}
