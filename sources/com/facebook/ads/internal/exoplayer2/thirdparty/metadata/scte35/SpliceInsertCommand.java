package com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.X.C0914Hf;
import com.facebook.ads.redexgen.X.C0926Hr;
import com.facebook.ads.redexgen.X.DV;
import com.facebook.ads.redexgen.X.DW;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class SpliceInsertCommand extends SpliceCommand {
    public static String[] A0D = {"rwcuqOJ6EdQ67q2Mv0J2HHeiL", "WP4j4wUrwc9dHeO22M7i1JH5Vq97obJg", "mJZdPTUXLZu74", "VLU2rxkJGeQdQarAjhhUo7gMPCvQOQS9", "TorhhvAEpNk7fEbKtUMeNjy7yeYkErzW", "2cgHesvtXq3tKj0PCMbQTWS3l1m9KzOv", "jB5ZWs0uqsLPN", "ipEqGNR1nINtqeP5fHPEDulQW"};
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new DV();
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final List<DW> A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 27 out of bounds for length 20
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public SpliceInsertCommand(long j10, boolean z10, boolean z11, boolean z12, boolean z13, long j11, long j12, List<DW> list, boolean z14, long j13, int i10, int i11, int i12) {
        this.A06 = j10;
        this.A0B = z10;
        this.A09 = z11;
        this.A0A = z12;
        this.A0C = z13;
        this.A05 = j11;
        this.A04 = j12;
        this.A07 = Collections.unmodifiableList(list);
        this.A08 = z14;
        this.A03 = j13;
        this.A02 = i10;
        this.A00 = i11;
        this.A01 = i12;
    }

    public SpliceInsertCommand(Parcel parcel) {
        this.A06 = parcel.readLong();
        this.A0B = parcel.readByte() == 1;
        this.A09 = parcel.readByte() == 1;
        this.A0A = parcel.readByte() == 1;
        this.A0C = parcel.readByte() == 1;
        this.A05 = parcel.readLong();
        this.A04 = parcel.readLong();
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(DW.A00(parcel));
        }
        this.A07 = Collections.unmodifiableList(arrayList);
        int componentSpliceListSize = parcel.readByte();
        this.A08 = componentSpliceListSize == 1;
        this.A03 = parcel.readLong();
        int componentSpliceListSize2 = parcel.readInt();
        this.A02 = componentSpliceListSize2;
        int componentSpliceListSize3 = parcel.readInt();
        this.A00 = componentSpliceListSize3;
        int componentSpliceListSize4 = parcel.readInt();
        this.A01 = componentSpliceListSize4;
    }

    public /* synthetic */ SpliceInsertCommand(Parcel parcel, DV dv) {
        this(parcel);
    }

    public static SpliceInsertCommand A00(C0914Hf c0914Hf, long j10, C0926Hr c0926Hr) {
        long jA0M = c0914Hf.A0M();
        boolean z10 = (c0914Hf.A0E() & 128) != 0;
        boolean z11 = false;
        boolean outOfNetworkIndicator = false;
        boolean z12 = false;
        long jA00 = -9223372036854775807L;
        List listEmptyList = Collections.emptyList();
        int iA0I = 0;
        int iA0E = 0;
        int iA0E2 = 0;
        boolean z13 = false;
        long jA0M2 = -9223372036854775807L;
        if (!z10) {
            int iA0E3 = c0914Hf.A0E();
            if (A0D[1].charAt(24) != '7') {
                A0D[4] = "wCIdN9eSc7apWAr1IiSVHk4IDh7dTuFq";
                z11 = (iA0E3 & 128) != 0;
                outOfNetworkIndicator = (iA0E3 & 64) != 0;
                boolean autoReturn = (iA0E3 & 32) != 0;
                z12 = (iA0E3 & 16) != 0;
                if (outOfNetworkIndicator && !z12) {
                    jA00 = TimeSignalCommand.A00(c0914Hf, j10);
                }
                if (!outOfNetworkIndicator) {
                    int componentCount = c0914Hf.A0E();
                    listEmptyList = new ArrayList(componentCount);
                    for (int i10 = 0; i10 < componentCount; i10++) {
                        int componentTag = c0914Hf.A0E();
                        long jA01 = -9223372036854775807L;
                        if (!z12) {
                            jA01 = TimeSignalCommand.A00(c0914Hf, j10);
                        }
                        listEmptyList.add(new DW(componentTag, jA01, c0926Hr.A07(jA01), null));
                    }
                }
                if (autoReturn) {
                    long jA0E = c0914Hf.A0E();
                    z13 = (jA0E & 128) != 0;
                    jA0M2 = (1000 * (((jA0E & 1) << 32) | c0914Hf.A0M())) / 90;
                }
                iA0I = c0914Hf.A0I();
                iA0E = c0914Hf.A0E();
                iA0E2 = c0914Hf.A0E();
            } else {
                throw new RuntimeException();
            }
        }
        return new SpliceInsertCommand(jA0M, z10, z11, outOfNetworkIndicator, z12, jA00, c0926Hr.A07(jA00), listEmptyList, z13, jA0M2, iA0I, iA0E, iA0E2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.A06);
        parcel.writeByte(this.A0B ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A09 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0A ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0C ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.A05);
        parcel.writeLong(this.A04);
        int size = this.A07.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            List<DW> list = this.A07;
            if (A0D[3].length() != 32) {
                throw new RuntimeException();
            }
            String[] strArr = A0D;
            strArr[6] = "cIZczz40pT0Gu";
            strArr[2] = "8BKfMUSS1QcQc";
            list.get(i11).A01(parcel);
        }
        parcel.writeByte(this.A08 ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }
}
