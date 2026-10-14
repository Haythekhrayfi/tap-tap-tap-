package com.yandex.mobile.ads.exo.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.mp0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<c> f18632a;

    public class a implements Parcelable.Creator<SpliceScheduleCommand> {
        @Override // android.os.Parcelable.Creator
        public final SpliceScheduleCommand createFromParcel(Parcel parcel) {
            return new SpliceScheduleCommand(parcel, 0);
        }

        @Override // android.os.Parcelable.Creator
        public final SpliceScheduleCommand[] newArray(int i10) {
            return new SpliceScheduleCommand[i10];
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18633a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f18634b;

        private b(int i10, long j10) {
            this.f18633a = i10;
            this.f18634b = j10;
        }

        public /* synthetic */ b(int i10, long j10, int i11) {
            this(i10, j10);
        }

        public static b a(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong());
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f18635a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f18636b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f18637c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f18638d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f18639e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List<b> f18640f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f18641g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f18642h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f18643i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f18644j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f18645k;

        private c(long j10, boolean z10, boolean z11, boolean z12, ArrayList arrayList, long j11, boolean z13, long j12, int i10, int i11, int i12) {
            this.f18635a = j10;
            this.f18636b = z10;
            this.f18637c = z11;
            this.f18638d = z12;
            this.f18640f = Collections.unmodifiableList(arrayList);
            this.f18639e = j11;
            this.f18641g = z13;
            this.f18642h = j12;
            this.f18643i = i10;
            this.f18644j = i11;
            this.f18645k = i12;
        }

        private c(Parcel parcel) {
            this.f18635a = parcel.readLong();
            this.f18636b = parcel.readByte() == 1;
            this.f18637c = parcel.readByte() == 1;
            this.f18638d = parcel.readByte() == 1;
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList.add(b.a(parcel));
            }
            this.f18640f = Collections.unmodifiableList(arrayList);
            this.f18639e = parcel.readLong();
            this.f18641g = parcel.readByte() == 1;
            this.f18642h = parcel.readLong();
            this.f18643i = parcel.readInt();
            this.f18644j = parcel.readInt();
            this.f18645k = parcel.readInt();
        }

        public static c a(Parcel parcel) {
            return new c(parcel);
        }

        public static c a(mp0 mp0Var) {
            ArrayList arrayList;
            boolean z10;
            boolean z11;
            int i10;
            int i11;
            int iT;
            long j10;
            long j11;
            long jV;
            long jV2 = mp0Var.v();
            boolean z12 = false;
            boolean z13 = false;
            boolean z14 = (mp0Var.t() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (z14) {
                arrayList = arrayList2;
                z10 = false;
                z11 = false;
                i10 = 0;
                i11 = 0;
                iT = 0;
                j10 = -9223372036854775807L;
                j11 = -9223372036854775807L;
            } else {
                int iT2 = mp0Var.t();
                boolean z15 = (iT2 & 128) != 0;
                z11 = (iT2 & 64) != 0;
                boolean z16 = (iT2 & 32) != 0;
                long jV3 = z11 ? mp0Var.v() : -9223372036854775807L;
                if (!z11) {
                    int iT3 = mp0Var.t();
                    ArrayList arrayList3 = new ArrayList(iT3);
                    for (int i12 = 0; i12 < iT3; i12++) {
                        arrayList3.add(new b(mp0Var.t(), mp0Var.v(), z12 ? 1 : 0));
                    }
                    arrayList2 = arrayList3;
                }
                if (z16) {
                    long jT = mp0Var.t();
                    boolean z17 = (128 & jT) != 0;
                    jV = ((((jT & 1) << 32) | mp0Var.v()) * 1000) / 90;
                    z13 = z17;
                } else {
                    jV = -9223372036854775807L;
                }
                int iZ = mp0Var.z();
                int iT4 = mp0Var.t();
                j11 = jV;
                iT = mp0Var.t();
                arrayList = arrayList2;
                long j12 = jV3;
                i10 = iZ;
                i11 = iT4;
                j10 = j12;
                boolean z18 = z15;
                z10 = z13;
                z12 = z18;
            }
            return new c(jV2, z14, z12, z11, arrayList, j10, z10, j11, i10, i11, iT);
        }
    }

    private SpliceScheduleCommand(Parcel parcel) {
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(c.a(parcel));
        }
        this.f18632a = Collections.unmodifiableList(arrayList);
    }

    public /* synthetic */ SpliceScheduleCommand(Parcel parcel, int i10) {
        this(parcel);
    }

    private SpliceScheduleCommand(ArrayList arrayList) {
        this.f18632a = Collections.unmodifiableList(arrayList);
    }

    public static SpliceScheduleCommand a(mp0 mp0Var) {
        int iT = mp0Var.t();
        ArrayList arrayList = new ArrayList(iT);
        for (int i10 = 0; i10 < iT; i10++) {
            arrayList.add(c.a(mp0Var));
        }
        return new SpliceScheduleCommand(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int size = this.f18632a.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            c cVar = this.f18632a.get(i11);
            parcel.writeLong(cVar.f18635a);
            parcel.writeByte(cVar.f18636b ? (byte) 1 : (byte) 0);
            parcel.writeByte(cVar.f18637c ? (byte) 1 : (byte) 0);
            parcel.writeByte(cVar.f18638d ? (byte) 1 : (byte) 0);
            int size2 = cVar.f18640f.size();
            parcel.writeInt(size2);
            for (int i12 = 0; i12 < size2; i12++) {
                b bVar = cVar.f18640f.get(i12);
                parcel.writeInt(bVar.f18633a);
                parcel.writeLong(bVar.f18634b);
            }
            parcel.writeLong(cVar.f18639e);
            parcel.writeByte(cVar.f18641g ? (byte) 1 : (byte) 0);
            parcel.writeLong(cVar.f18642h);
            parcel.writeInt(cVar.f18643i);
            parcel.writeInt(cVar.f18644j);
            parcel.writeInt(cVar.f18645k);
        }
    }
}
