package com.yandex.mobile.ads.exo.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.a71;
import com.yandex.mobile.ads.impl.mp0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SpliceInsertCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f18617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f18618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f18619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f18620e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f18621f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f18622g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<b> f18623h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f18624i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f18625j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f18626k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f18627l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f18628m;

    public class a implements Parcelable.Creator<SpliceInsertCommand> {
        @Override // android.os.Parcelable.Creator
        public final SpliceInsertCommand createFromParcel(Parcel parcel) {
            return new SpliceInsertCommand(parcel, 0);
        }

        @Override // android.os.Parcelable.Creator
        public final SpliceInsertCommand[] newArray(int i10) {
            return new SpliceInsertCommand[i10];
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18629a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f18630b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f18631c;

        private b(int i10, long j10, long j11) {
            this.f18629a = i10;
            this.f18630b = j10;
            this.f18631c = j11;
        }

        public /* synthetic */ b(int i10, long j10, long j11, int i11) {
            this(i10, j10, j11);
        }

        public static b a(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }
    }

    private SpliceInsertCommand(long j10, boolean z10, boolean z11, boolean z12, boolean z13, long j11, long j12, List<b> list, boolean z14, long j13, int i10, int i11, int i12) {
        this.f18616a = j10;
        this.f18617b = z10;
        this.f18618c = z11;
        this.f18619d = z12;
        this.f18620e = z13;
        this.f18621f = j11;
        this.f18622g = j12;
        this.f18623h = Collections.unmodifiableList(list);
        this.f18624i = z14;
        this.f18625j = j13;
        this.f18626k = i10;
        this.f18627l = i11;
        this.f18628m = i12;
    }

    private SpliceInsertCommand(Parcel parcel) {
        this.f18616a = parcel.readLong();
        this.f18617b = parcel.readByte() == 1;
        this.f18618c = parcel.readByte() == 1;
        this.f18619d = parcel.readByte() == 1;
        this.f18620e = parcel.readByte() == 1;
        this.f18621f = parcel.readLong();
        this.f18622g = parcel.readLong();
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(b.a(parcel));
        }
        this.f18623h = Collections.unmodifiableList(arrayList);
        this.f18624i = parcel.readByte() == 1;
        this.f18625j = parcel.readLong();
        this.f18626k = parcel.readInt();
        this.f18627l = parcel.readInt();
        this.f18628m = parcel.readInt();
    }

    public /* synthetic */ SpliceInsertCommand(Parcel parcel, int i10) {
        this(parcel);
    }

    public static SpliceInsertCommand a(mp0 mp0Var, long j10, a71 a71Var) {
        List list;
        int iZ;
        boolean z10;
        boolean z11;
        long j11;
        boolean z12;
        long j12;
        boolean z13;
        int iT;
        int iT2;
        boolean z14;
        long jV;
        mp0 mp0Var2 = mp0Var;
        long jV2 = mp0Var.v();
        boolean z15 = (mp0Var.t() & 128) != 0;
        List listEmptyList = Collections.emptyList();
        if (z15) {
            list = listEmptyList;
            iZ = 0;
            z10 = false;
            z11 = false;
            j11 = -9223372036854775807L;
            z12 = false;
            j12 = -9223372036854775807L;
            z13 = false;
            iT = 0;
            iT2 = 0;
        } else {
            int iT3 = mp0Var.t();
            boolean z16 = (iT3 & 128) != 0;
            boolean z17 = (iT3 & 64) != 0;
            boolean z18 = (iT3 & 32) != 0;
            boolean z19 = (iT3 & 16) != 0;
            long jA = (!z17 || z19) ? -9223372036854775807L : TimeSignalCommand.a(j10, mp0Var2);
            if (!z17) {
                int iT4 = mp0Var.t();
                ArrayList arrayList = new ArrayList(iT4);
                int i10 = 0;
                while (i10 < iT4) {
                    int iT5 = mp0Var.t();
                    long jA2 = !z19 ? TimeSignalCommand.a(j10, mp0Var2) : -9223372036854775807L;
                    arrayList.add(new b(iT5, jA2, a71Var.b(jA2), 0));
                    i10++;
                    mp0Var2 = mp0Var;
                }
                listEmptyList = arrayList;
            }
            if (z18) {
                long jT = mp0Var.t();
                boolean z20 = (128 & jT) != 0;
                jV = ((((jT & 1) << 32) | mp0Var.v()) * 1000) / 90;
                z14 = z20;
            } else {
                z14 = false;
                jV = -9223372036854775807L;
            }
            iZ = mp0Var.z();
            iT = mp0Var.t();
            iT2 = mp0Var.t();
            list = listEmptyList;
            z13 = z17;
            long j13 = jA;
            z12 = z14;
            j12 = jV;
            z11 = z19;
            z10 = z16;
            j11 = j13;
        }
        return new SpliceInsertCommand(jV2, z15, z10, z13, z11, j11, a71Var.b(j11), list, z12, j12, iZ, iT, iT2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f18616a);
        parcel.writeByte(this.f18617b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f18618c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f18619d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f18620e ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f18621f);
        parcel.writeLong(this.f18622g);
        int size = this.f18623h.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = this.f18623h.get(i11);
            parcel.writeInt(bVar.f18629a);
            parcel.writeLong(bVar.f18630b);
            parcel.writeLong(bVar.f18631c);
        }
        parcel.writeByte(this.f18624i ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f18625j);
        parcel.writeInt(this.f18626k);
        parcel.writeInt(this.f18627l);
        parcel.writeInt(this.f18628m);
    }
}
