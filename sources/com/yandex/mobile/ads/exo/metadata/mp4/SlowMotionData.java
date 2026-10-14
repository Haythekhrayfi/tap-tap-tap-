package com.yandex.mobile.ads.exo.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.da1;
import com.yandex.mobile.ads.impl.pa;
import com.yandex.mobile.ads.impl.tj;
import com.yandex.mobile.ads.impl.v60;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class SlowMotionData implements Metadata.Entry {
    public static final Parcelable.Creator<SlowMotionData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<Segment> f18607a;

    public static final class Segment implements Parcelable {
        public static final Parcelable.Creator<Segment> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f18608a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f18609b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f18610c;

        public class a implements Parcelable.Creator<Segment> {
            @Override // android.os.Parcelable.Creator
            public final Segment createFromParcel(Parcel parcel) {
                return new Segment(parcel.readInt(), parcel.readLong(), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final Segment[] newArray(int i10) {
                return new Segment[i10];
            }
        }

        public Segment(int i10, long j10, long j11) {
            pa.a(j10 < j11);
            this.f18608a = j10;
            this.f18609b = j11;
            this.f18610c = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int a(Segment segment, Segment segment2) {
            return tj.e().a(segment.f18608a, segment2.f18608a).a(segment.f18609b, segment2.f18609b).a(segment.f18610c, segment2.f18610c).d();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Segment.class != obj.getClass()) {
                return false;
            }
            Segment segment = (Segment) obj;
            return this.f18608a == segment.f18608a && this.f18609b == segment.f18609b && this.f18610c == segment.f18610c;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Long.valueOf(this.f18608a), Long.valueOf(this.f18609b), Integer.valueOf(this.f18610c)});
        }

        public final String toString() {
            Object[] objArr = {Long.valueOf(this.f18608a), Long.valueOf(this.f18609b), Integer.valueOf(this.f18610c)};
            int i10 = da1.f19803a;
            return String.format(Locale.US, "Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", objArr);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f18608a);
            parcel.writeLong(this.f18609b);
            parcel.writeInt(this.f18610c);
        }
    }

    public class a implements Parcelable.Creator<SlowMotionData> {
        @Override // android.os.Parcelable.Creator
        public final SlowMotionData createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, Segment.class.getClassLoader());
            return new SlowMotionData(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final SlowMotionData[] newArray(int i10) {
            return new SlowMotionData[i10];
        }
    }

    public SlowMotionData(ArrayList arrayList) {
        this.f18607a = arrayList;
        pa.a(!a(arrayList));
    }

    private static boolean a(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return false;
        }
        long j10 = ((Segment) arrayList.get(0)).f18609b;
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            if (((Segment) arrayList.get(i10)).f18608a < j10) {
                return true;
            }
            j10 = ((Segment) arrayList.get(i10)).f18609b;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SlowMotionData.class != obj.getClass()) {
            return false;
        }
        return this.f18607a.equals(((SlowMotionData) obj).f18607a);
    }

    public final int hashCode() {
        return this.f18607a.hashCode();
    }

    public final String toString() {
        StringBuilder sbA = v60.a("SlowMotion: segments=");
        sbA.append(this.f18607a);
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(this.f18607a);
    }
}
