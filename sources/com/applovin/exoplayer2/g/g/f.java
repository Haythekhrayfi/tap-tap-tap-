package com.applovin.exoplayer2.g.g;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.l.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f extends com.applovin.exoplayer2.g.g.b {
    public static final Parcelable.Creator<f> CREATOR = new Parcelable.Creator<f>() { // from class: com.applovin.exoplayer2.g.g.f.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f[] newArray(int i10) {
            return new f[i10];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<b> f6440a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6441a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f6442b;

        private a(int i10, long j10) {
            this.f6441a = i10;
            this.f6442b = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static a b(Parcel parcel) {
            return new a(parcel.readInt(), parcel.readLong());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(Parcel parcel) {
            parcel.writeInt(this.f6441a);
            parcel.writeLong(this.f6442b);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f6443a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f6444b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f6445c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f6446d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f6447e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List<a> f6448f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f6449g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f6450h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f6451i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f6452j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f6453k;

        private b(long j10, boolean z10, boolean z11, boolean z12, List<a> list, long j11, boolean z13, long j12, int i10, int i11, int i12) {
            this.f6443a = j10;
            this.f6444b = z10;
            this.f6445c = z11;
            this.f6446d = z12;
            this.f6448f = Collections.unmodifiableList(list);
            this.f6447e = j11;
            this.f6449g = z13;
            this.f6450h = j12;
            this.f6451i = i10;
            this.f6452j = i11;
            this.f6453k = i12;
        }

        private b(Parcel parcel) {
            this.f6443a = parcel.readLong();
            this.f6444b = parcel.readByte() == 1;
            this.f6445c = parcel.readByte() == 1;
            this.f6446d = parcel.readByte() == 1;
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList.add(a.b(parcel));
            }
            this.f6448f = Collections.unmodifiableList(arrayList);
            this.f6447e = parcel.readLong();
            this.f6449g = parcel.readByte() == 1;
            this.f6450h = parcel.readLong();
            this.f6451i = parcel.readInt();
            this.f6452j = parcel.readInt();
            this.f6453k = parcel.readInt();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b b(y yVar) {
            ArrayList arrayList;
            boolean z10;
            long j10;
            boolean z11;
            long j11;
            int i10;
            int i11;
            int iH;
            boolean z12;
            boolean z13;
            long jO;
            long jO2 = yVar.o();
            boolean z14 = (yVar.h() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (z14) {
                arrayList = arrayList2;
                z10 = false;
                j10 = -9223372036854775807L;
                z11 = false;
                j11 = -9223372036854775807L;
                i10 = 0;
                i11 = 0;
                iH = 0;
                z12 = false;
            } else {
                int iH2 = yVar.h();
                boolean z15 = (iH2 & 128) != 0;
                boolean z16 = (iH2 & 64) != 0;
                boolean z17 = (iH2 & 32) != 0;
                long jO3 = z16 ? yVar.o() : -9223372036854775807L;
                if (!z16) {
                    int iH3 = yVar.h();
                    ArrayList arrayList3 = new ArrayList(iH3);
                    for (int i12 = 0; i12 < iH3; i12++) {
                        arrayList3.add(new a(yVar.h(), yVar.o()));
                    }
                    arrayList2 = arrayList3;
                }
                if (z17) {
                    long jH = yVar.h();
                    boolean z18 = (128 & jH) != 0;
                    jO = ((((jH & 1) << 32) | yVar.o()) * 1000) / 90;
                    z13 = z18;
                } else {
                    z13 = false;
                    jO = -9223372036854775807L;
                }
                int i13 = yVar.i();
                int iH4 = yVar.h();
                z12 = z16;
                iH = yVar.h();
                j11 = jO;
                arrayList = arrayList2;
                long j12 = jO3;
                i10 = i13;
                i11 = iH4;
                j10 = j12;
                boolean z19 = z15;
                z11 = z13;
                z10 = z19;
            }
            return new b(jO2, z14, z10, z12, arrayList, j10, z11, j11, i10, i11, iH);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(Parcel parcel) {
            parcel.writeLong(this.f6443a);
            parcel.writeByte(this.f6444b ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f6445c ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f6446d ? (byte) 1 : (byte) 0);
            int size = this.f6448f.size();
            parcel.writeInt(size);
            for (int i10 = 0; i10 < size; i10++) {
                this.f6448f.get(i10).c(parcel);
            }
            parcel.writeLong(this.f6447e);
            parcel.writeByte(this.f6449g ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.f6450h);
            parcel.writeInt(this.f6451i);
            parcel.writeInt(this.f6452j);
            parcel.writeInt(this.f6453k);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b c(Parcel parcel) {
            return new b(parcel);
        }
    }

    private f(Parcel parcel) {
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(b.c(parcel));
        }
        this.f6440a = Collections.unmodifiableList(arrayList);
    }

    private f(List<b> list) {
        this.f6440a = Collections.unmodifiableList(list);
    }

    public static f a(y yVar) {
        int iH = yVar.h();
        ArrayList arrayList = new ArrayList(iH);
        for (int i10 = 0; i10 < iH; i10++) {
            arrayList.add(b.b(yVar));
        }
        return new f(arrayList);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int size = this.f6440a.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.f6440a.get(i11).b(parcel);
        }
    }
}
