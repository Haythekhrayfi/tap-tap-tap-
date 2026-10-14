package com.yandex.mobile.ads.exo.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.da1;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ChapterFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterFrame> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f18568e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f18569f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Id3Frame[] f18570g;

    public class a implements Parcelable.Creator<ChapterFrame> {
        @Override // android.os.Parcelable.Creator
        public final ChapterFrame createFromParcel(Parcel parcel) {
            return new ChapterFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ChapterFrame[] newArray(int i10) {
            return new ChapterFrame[i10];
        }
    }

    public ChapterFrame(Parcel parcel) {
        super("CHAP");
        this.f18565b = (String) da1.a(parcel.readString());
        this.f18566c = parcel.readInt();
        this.f18567d = parcel.readInt();
        this.f18568e = parcel.readLong();
        this.f18569f = parcel.readLong();
        int i10 = parcel.readInt();
        this.f18570g = new Id3Frame[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f18570g[i11] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }

    public ChapterFrame(String str, int i10, int i11, long j10, long j11, Id3Frame[] id3FrameArr) {
        super("CHAP");
        this.f18565b = str;
        this.f18566c = i10;
        this.f18567d = i11;
        this.f18568e = j10;
        this.f18569f = j11;
        this.f18570g = id3FrameArr;
    }

    @Override // com.yandex.mobile.ads.exo.metadata.id3.Id3Frame, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterFrame.class != obj.getClass()) {
            return false;
        }
        ChapterFrame chapterFrame = (ChapterFrame) obj;
        return this.f18566c == chapterFrame.f18566c && this.f18567d == chapterFrame.f18567d && this.f18568e == chapterFrame.f18568e && this.f18569f == chapterFrame.f18569f && da1.a(this.f18565b, chapterFrame.f18565b) && Arrays.equals(this.f18570g, chapterFrame.f18570g);
    }

    public final int hashCode() {
        int i10 = (((((((this.f18566c + 527) * 31) + this.f18567d) * 31) + ((int) this.f18568e)) * 31) + ((int) this.f18569f)) * 31;
        String str = this.f18565b;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f18565b);
        parcel.writeInt(this.f18566c);
        parcel.writeInt(this.f18567d);
        parcel.writeLong(this.f18568e);
        parcel.writeLong(this.f18569f);
        parcel.writeInt(this.f18570g.length);
        for (Id3Frame id3Frame : this.f18570g) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }
}
