package com.applovin.exoplayer2.g.f;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.common.a.n;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.l.ai;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c implements com.applovin.exoplayer2.g.a.InterfaceC0092a {
    public static final Parcelable.Creator<c> CREATOR = new Parcelable.Creator<c>() { // from class: com.applovin.exoplayer2.g.f.c.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, a.class.getClassLoader());
            return new c(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c[] newArray(int i10) {
            return new c[i10];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<a> f6411a;

    public static final class a implements Parcelable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f6413b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f6414c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f6415d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Comparator<a> f6412a = m0.d.f33126e;
        public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: com.applovin.exoplayer2.g.f.c.a.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public a createFromParcel(Parcel parcel) {
                return new a(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public a[] newArray(int i10) {
                return new a[i10];
            }
        };

        public a(long j10, long j11, int i10) {
            com.applovin.exoplayer2.l.a.a(j10 < j11);
            this.f6413b = j10;
            this.f6414c = j11;
            this.f6415d = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int a(a aVar, a aVar2) {
            return n.a().a(aVar.f6413b, aVar2.f6413b).a(aVar.f6414c, aVar2.f6414c).a(aVar.f6415d, aVar2.f6415d).b();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f6413b == aVar.f6413b && this.f6414c == aVar.f6414c && this.f6415d == aVar.f6415d;
        }

        public int hashCode() {
            return Objects.hashCode(Long.valueOf(this.f6413b), Long.valueOf(this.f6414c), Integer.valueOf(this.f6415d));
        }

        public String toString() {
            return ai.a("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f6413b), Long.valueOf(this.f6414c), Integer.valueOf(this.f6415d));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f6413b);
            parcel.writeLong(this.f6414c);
            parcel.writeInt(this.f6415d);
        }
    }

    public c(List<a> list) {
        this.f6411a = list;
        com.applovin.exoplayer2.l.a.a(!a(list));
    }

    private static boolean a(List<a> list) {
        if (list.isEmpty()) {
            return false;
        }
        long j10 = list.get(0).f6414c;
        for (int i10 = 1; i10 < list.size(); i10++) {
            if (list.get(i10).f6413b < j10) {
                return true;
            }
            j10 = list.get(i10).f6414c;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return this.f6411a.equals(((c) obj).f6411a);
    }

    public int hashCode() {
        return this.f6411a.hashCode();
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("SlowMotion: segments=");
        sbA.append(this.f6411a);
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(this.f6411a);
    }
}
