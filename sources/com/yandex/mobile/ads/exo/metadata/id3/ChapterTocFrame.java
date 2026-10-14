package com.yandex.mobile.ads.exo.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.da1;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ChapterTocFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterTocFrame> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f18572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f18573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f18574e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Id3Frame[] f18575f;

    public class a implements Parcelable.Creator<ChapterTocFrame> {
        @Override // android.os.Parcelable.Creator
        public final ChapterTocFrame createFromParcel(Parcel parcel) {
            return new ChapterTocFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ChapterTocFrame[] newArray(int i10) {
            return new ChapterTocFrame[i10];
        }
    }

    public ChapterTocFrame(Parcel parcel) {
        super("CTOC");
        this.f18571b = (String) da1.a(parcel.readString());
        this.f18572c = parcel.readByte() != 0;
        this.f18573d = parcel.readByte() != 0;
        this.f18574e = (String[]) da1.a(parcel.createStringArray());
        int i10 = parcel.readInt();
        this.f18575f = new Id3Frame[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f18575f[i11] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }

    public ChapterTocFrame(String str, boolean z10, boolean z11, String[] strArr, Id3Frame[] id3FrameArr) {
        super("CTOC");
        this.f18571b = str;
        this.f18572c = z10;
        this.f18573d = z11;
        this.f18574e = strArr;
        this.f18575f = id3FrameArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterTocFrame.class != obj.getClass()) {
            return false;
        }
        ChapterTocFrame chapterTocFrame = (ChapterTocFrame) obj;
        return this.f18572c == chapterTocFrame.f18572c && this.f18573d == chapterTocFrame.f18573d && da1.a(this.f18571b, chapterTocFrame.f18571b) && Arrays.equals(this.f18574e, chapterTocFrame.f18574e) && Arrays.equals(this.f18575f, chapterTocFrame.f18575f);
    }

    public final int hashCode() {
        int i10 = ((((this.f18572c ? 1 : 0) + 527) * 31) + (this.f18573d ? 1 : 0)) * 31;
        String str = this.f18571b;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f18571b);
        parcel.writeByte(this.f18572c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f18573d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f18574e);
        parcel.writeInt(this.f18575f.length);
        for (Id3Frame id3Frame : this.f18575f) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }
}
