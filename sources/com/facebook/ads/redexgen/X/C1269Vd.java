package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.PrivateCommand;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.SpliceInsertCommand;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.SpliceNullCommand;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.SpliceScheduleCommand;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.TimeSignalCommand;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1269Vd implements DC {
    public C0926Hr A00;
    public final C0914Hf A02 = new C0914Hf();
    public final C0913He A01 = new C0913He();

    @Override // com.facebook.ads.redexgen.X.DC
    public final Metadata A4w(C0810Cz c0810Cz) throws DD {
        if (this.A00 == null || c0810Cz.A00 != this.A00.A05()) {
            C0926Hr c0926Hr = new C0926Hr(((X0) c0810Cz).A00);
            this.A00 = c0926Hr;
            c0926Hr.A06(((X0) c0810Cz).A00 - c0810Cz.A00);
        }
        ByteBuffer buffer = c0810Cz.A01;
        byte[] bArrArray = buffer.array();
        int iLimit = buffer.limit();
        this.A02.A0b(bArrArray, iLimit);
        this.A01.A0C(bArrArray, iLimit);
        this.A01.A08(39);
        long jA04 = (((long) this.A01.A04(1)) << 32) | ((long) this.A01.A04(32));
        this.A01.A08(20);
        int spliceCommandType = this.A01.A04(12);
        int iA04 = this.A01.A04(8);
        Metadata.Entry spliceNullCommand = null;
        this.A02.A0Z(14);
        switch (iA04) {
            case 0:
                spliceNullCommand = new SpliceNullCommand();
                break;
            case 4:
                spliceNullCommand = SpliceScheduleCommand.A00(this.A02);
                break;
            case 5:
                spliceNullCommand = SpliceInsertCommand.A00(this.A02, jA04, this.A00);
                break;
            case 6:
                spliceNullCommand = TimeSignalCommand.A01(this.A02, jA04, this.A00);
                break;
            case 255:
                spliceNullCommand = PrivateCommand.A00(this.A02, spliceCommandType, jA04);
                break;
        }
        return spliceNullCommand == null ? new Metadata(new Metadata.Entry[0]) : new Metadata(spliceNullCommand);
    }
}
