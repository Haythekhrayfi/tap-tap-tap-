package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class Da {
    public static String[] A0B = {"WSNeg6N0n7AIShfXSzX5HQmTc8kFkZEc", "6rZRvoV62oNyzf", "F27AMpNiqyccCa5EB6sKY7eKfEMSqhrd", "FVKbL9f5FAHwz7hiZMN0u1v1YdCbdeYK", "vVfLkZocD1NxPHhP9fXAXrt0GsgaX4xN", "cFmUa63iy9OAJJOa0jT7jB1cdvdJ4hQa", "2QFrNOOxadMtahUuhILPt16xKsmCtJsL", "J"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final List<DZ> A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 24 out of bounds for length 23
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static Da A02(C0914Hf c0914Hf) {
        long jA0M = c0914Hf.A0M();
        boolean z10 = (c0914Hf.A0E() & 128) != 0;
        boolean z11 = false;
        boolean z12 = false;
        long jA0M2 = -9223372036854775807L;
        ArrayList arrayList = new ArrayList();
        int iA0I = 0;
        int iA0E = 0;
        int iA0E2 = 0;
        boolean z13 = false;
        long jA0M3 = -9223372036854775807L;
        if (!z10) {
            int iA0E3 = c0914Hf.A0E();
            z11 = (iA0E3 & 128) != 0;
            z12 = (iA0E3 & 64) != 0;
            if (A0B[7].length() != 1) {
                throw new RuntimeException();
            }
            A0B[1] = "02B3CRg7kTq01s";
            boolean z14 = (iA0E3 & 32) != 0;
            jA0M2 = z12 ? c0914Hf.A0M() : -9223372036854775807L;
            if (z12) {
                String[] strArr = A0B;
                if (strArr[0].charAt(5) == strArr[5].charAt(5)) {
                    A0B[1] = "Wfp3iGqyia9VmI";
                }
            } else {
                int iA0E4 = c0914Hf.A0E();
                arrayList = new ArrayList(iA0E4);
                for (int i10 = 0; i10 < iA0E4; i10++) {
                    arrayList.add(new DZ(c0914Hf.A0E(), c0914Hf.A0M(), null));
                }
            }
            if (z14) {
                long jA0E = c0914Hf.A0E();
                z13 = (128 & jA0E) != 0;
                jA0M3 = (1000 * (((1 & jA0E) << 32) | c0914Hf.A0M())) / 90;
            }
            iA0I = c0914Hf.A0I();
            iA0E = c0914Hf.A0E();
            iA0E2 = c0914Hf.A0E();
        }
        return new Da(jA0M, z10, z11, z12, arrayList, jA0M2, z13, jA0M3, iA0I, iA0E, iA0E2);
    }

    public Da(long j10, boolean z10, boolean z11, boolean z12, List<DZ> list, long j11, boolean z13, long j12, int i10, int i11, int i12) {
        this.A04 = j10;
        this.A0A = z10;
        this.A08 = z11;
        this.A09 = z12;
        this.A06 = Collections.unmodifiableList(list);
        this.A05 = j11;
        this.A07 = z13;
        this.A03 = j12;
        this.A02 = i10;
        this.A00 = i11;
        this.A01 = i12;
    }

    public Da(Parcel parcel) {
        this.A04 = parcel.readLong();
        this.A0A = parcel.readByte() == 1;
        this.A08 = parcel.readByte() == 1;
        this.A09 = parcel.readByte() == 1;
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(DZ.A00(parcel));
        }
        this.A06 = Collections.unmodifiableList(arrayList);
        this.A05 = parcel.readLong();
        int componentSpliceListLength = parcel.readByte();
        this.A07 = componentSpliceListLength == 1;
        this.A03 = parcel.readLong();
        int componentSpliceListLength2 = parcel.readInt();
        this.A02 = componentSpliceListLength2;
        int componentSpliceListLength3 = parcel.readInt();
        this.A00 = componentSpliceListLength3;
        int componentSpliceListLength4 = parcel.readInt();
        this.A01 = componentSpliceListLength4;
    }

    public static Da A00(Parcel parcel) {
        return new Da(parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(Parcel parcel) {
        parcel.writeLong(this.A04);
        parcel.writeByte(this.A0A ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A08 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A09 ? (byte) 1 : (byte) 0);
        int size = this.A06.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            this.A06.get(i10).A02(parcel);
        }
        parcel.writeLong(this.A05);
        byte b10 = this.A07 ? (byte) 1 : (byte) 0;
        if (A0B[1].length() != 14) {
            throw new RuntimeException();
        }
        A0B[1] = "FoD8YYsiaA11j5";
        parcel.writeByte(b10);
        parcel.writeLong(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }
}
