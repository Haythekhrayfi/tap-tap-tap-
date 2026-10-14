package com.yandex.mobile.ads.exo.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.v60;

/* JADX INFO: loaded from: classes.dex */
public final class MotionPhotoMetadata implements Metadata.Entry {
    public static final Parcelable.Creator<MotionPhotoMetadata> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f18604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f18605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f18606e;

    public class a implements Parcelable.Creator<MotionPhotoMetadata> {
        @Override // android.os.Parcelable.Creator
        public final MotionPhotoMetadata createFromParcel(Parcel parcel) {
            return new MotionPhotoMetadata(parcel, 0);
        }

        @Override // android.os.Parcelable.Creator
        public final MotionPhotoMetadata[] newArray(int i10) {
            return new MotionPhotoMetadata[i10];
        }
    }

    public MotionPhotoMetadata(long j10, long j11, long j12, long j13, long j14) {
        this.f18602a = j10;
        this.f18603b = j11;
        this.f18604c = j12;
        this.f18605d = j13;
        this.f18606e = j14;
    }

    private MotionPhotoMetadata(Parcel parcel) {
        this.f18602a = parcel.readLong();
        this.f18603b = parcel.readLong();
        this.f18604c = parcel.readLong();
        this.f18605d = parcel.readLong();
        this.f18606e = parcel.readLong();
    }

    public /* synthetic */ MotionPhotoMetadata(Parcel parcel, int i10) {
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
        if (obj == null || MotionPhotoMetadata.class != obj.getClass()) {
            return false;
        }
        MotionPhotoMetadata motionPhotoMetadata = (MotionPhotoMetadata) obj;
        return this.f18602a == motionPhotoMetadata.f18602a && this.f18603b == motionPhotoMetadata.f18603b && this.f18604c == motionPhotoMetadata.f18604c && this.f18605d == motionPhotoMetadata.f18605d && this.f18606e == motionPhotoMetadata.f18606e;
    }

    public final int hashCode() {
        long j10 = this.f18602a;
        long j11 = this.f18603b;
        int i10 = (((int) (j11 ^ (j11 >>> 32))) + ((((int) (j10 ^ (j10 >>> 32))) + 527) * 31)) * 31;
        long j12 = this.f18604c;
        int i11 = (((int) (j12 ^ (j12 >>> 32))) + i10) * 31;
        long j13 = this.f18605d;
        int i12 = (((int) (j13 ^ (j13 >>> 32))) + i11) * 31;
        long j14 = this.f18606e;
        return ((int) (j14 ^ (j14 >>> 32))) + i12;
    }

    public final String toString() {
        StringBuilder sbA = v60.a("Motion photo metadata: photoStartPosition=");
        sbA.append(this.f18602a);
        sbA.append(", photoSize=");
        sbA.append(this.f18603b);
        sbA.append(", photoPresentationTimestampUs=");
        sbA.append(this.f18604c);
        sbA.append(", videoStartPosition=");
        sbA.append(this.f18605d);
        sbA.append(", videoSize=");
        sbA.append(this.f18606e);
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f18602a);
        parcel.writeLong(this.f18603b);
        parcel.writeLong(this.f18604c);
        parcel.writeLong(this.f18605d);
        parcel.writeLong(this.f18606e);
    }
}
