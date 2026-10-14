package com.applovin.exoplayer2.g.g;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.l.ag;
import com.applovin.exoplayer2.l.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d extends b {
    public static final Parcelable.Creator<d> CREATOR = new Parcelable.Creator<d>() { // from class: com.applovin.exoplayer2.g.g.d.1
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
    public final long f6424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f6425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f6427d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f6428e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f6429f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f6430g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<a> f6431h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f6432i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f6433j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f6434k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f6435l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f6436m;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6437a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f6438b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f6439c;

        private a(int i10, long j10, long j11) {
            this.f6437a = i10;
            this.f6438b = j10;
            this.f6439c = j11;
        }

        public static a b(Parcel parcel) {
            return new a(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        public void a(Parcel parcel) {
            parcel.writeInt(this.f6437a);
            parcel.writeLong(this.f6438b);
            parcel.writeLong(this.f6439c);
        }
    }

    private d(long j10, boolean z10, boolean z11, boolean z12, boolean z13, long j11, long j12, List<a> list, boolean z14, long j13, int i10, int i11, int i12) {
        this.f6424a = j10;
        this.f6425b = z10;
        this.f6426c = z11;
        this.f6427d = z12;
        this.f6428e = z13;
        this.f6429f = j11;
        this.f6430g = j12;
        this.f6431h = Collections.unmodifiableList(list);
        this.f6432i = z14;
        this.f6433j = j13;
        this.f6434k = i10;
        this.f6435l = i11;
        this.f6436m = i12;
    }

    private d(Parcel parcel) {
        this.f6424a = parcel.readLong();
        this.f6425b = parcel.readByte() == 1;
        this.f6426c = parcel.readByte() == 1;
        this.f6427d = parcel.readByte() == 1;
        this.f6428e = parcel.readByte() == 1;
        this.f6429f = parcel.readLong();
        this.f6430g = parcel.readLong();
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(a.b(parcel));
        }
        this.f6431h = Collections.unmodifiableList(arrayList);
        this.f6432i = parcel.readByte() == 1;
        this.f6433j = parcel.readLong();
        this.f6434k = parcel.readInt();
        this.f6435l = parcel.readInt();
        this.f6436m = parcel.readInt();
    }

    public static d a(y yVar, long j10, ag agVar) {
        List list;
        boolean z10;
        boolean z11;
        long j11;
        boolean z12;
        long j12;
        int i10;
        int iH;
        int iH2;
        boolean z13;
        boolean z14;
        long jO;
        long jO2 = yVar.o();
        boolean z15 = (yVar.h() & 128) != 0;
        List listEmptyList = Collections.emptyList();
        if (z15) {
            list = listEmptyList;
            z10 = false;
            z11 = false;
            j11 = -9223372036854775807L;
            z12 = false;
            j12 = -9223372036854775807L;
            i10 = 0;
            iH = 0;
            iH2 = 0;
            z13 = false;
        } else {
            int iH3 = yVar.h();
            boolean z16 = (iH3 & 128) != 0;
            boolean z17 = (iH3 & 64) != 0;
            boolean z18 = (iH3 & 32) != 0;
            boolean z19 = (iH3 & 16) != 0;
            long jA = (!z17 || z19) ? -9223372036854775807L : g.a(yVar, j10);
            if (!z17) {
                int iH4 = yVar.h();
                ArrayList arrayList = new ArrayList(iH4);
                for (int i11 = 0; i11 < iH4; i11++) {
                    int iH5 = yVar.h();
                    long jA2 = !z19 ? g.a(yVar, j10) : -9223372036854775807L;
                    arrayList.add(new a(iH5, jA2, agVar.b(jA2)));
                }
                listEmptyList = arrayList;
            }
            if (z18) {
                long jH = yVar.h();
                boolean z20 = (128 & jH) != 0;
                jO = ((((jH & 1) << 32) | yVar.o()) * 1000) / 90;
                z14 = z20;
            } else {
                z14 = false;
                jO = -9223372036854775807L;
            }
            i10 = yVar.i();
            z13 = z17;
            iH = yVar.h();
            iH2 = yVar.h();
            list = listEmptyList;
            long j13 = jA;
            z12 = z14;
            j12 = jO;
            z11 = z19;
            z10 = z16;
            j11 = j13;
        }
        return new d(jO2, z15, z10, z13, z11, j11, agVar.b(j11), list, z12, j12, i10, iH, iH2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f6424a);
        parcel.writeByte(this.f6425b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f6426c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f6427d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f6428e ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f6429f);
        parcel.writeLong(this.f6430g);
        int size = this.f6431h.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.f6431h.get(i11).a(parcel);
        }
        parcel.writeByte(this.f6432i ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f6433j);
        parcel.writeInt(this.f6434k);
        parcel.writeInt(this.f6435l);
        parcel.writeInt(this.f6436m);
    }
}
