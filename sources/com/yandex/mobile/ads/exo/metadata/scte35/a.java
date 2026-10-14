package com.yandex.mobile.ads.exo.metadata.scte35;

import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.a71;
import com.yandex.mobile.ads.impl.ke0;
import com.yandex.mobile.ads.impl.lp0;
import com.yandex.mobile.ads.impl.mp0;
import com.yandex.mobile.ads.impl.r11;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class a extends r11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final mp0 f18648a = new mp0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final lp0 f18649b = new lp0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a71 f18650c;

    @Override // com.yandex.mobile.ads.impl.r11
    public final Metadata a(ke0 ke0Var, ByteBuffer byteBuffer) {
        a71 a71Var = this.f18650c;
        if (a71Var == null || ke0Var.f22396i != a71Var.c()) {
            a71 a71Var2 = new a71(ke0Var.f19006e);
            this.f18650c = a71Var2;
            a71Var2.a(ke0Var.f19006e - ke0Var.f22396i);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        this.f18648a.a(iLimit, bArrArray);
        this.f18649b.a(iLimit, bArrArray);
        this.f18649b.d(39);
        long jB = (((long) this.f18649b.b(1)) << 32) | ((long) this.f18649b.b(32));
        this.f18649b.d(20);
        int iB = this.f18649b.b(12);
        int iB2 = this.f18649b.b(8);
        Metadata.Entry spliceNullCommand = null;
        this.f18648a.f(14);
        if (iB2 == 0) {
            spliceNullCommand = new SpliceNullCommand();
        } else if (iB2 == 255) {
            spliceNullCommand = PrivateCommand.a(this.f18648a, iB, jB);
        } else if (iB2 == 4) {
            spliceNullCommand = SpliceScheduleCommand.a(this.f18648a);
        } else if (iB2 == 5) {
            spliceNullCommand = SpliceInsertCommand.a(this.f18648a, jB, this.f18650c);
        } else if (iB2 == 6) {
            spliceNullCommand = TimeSignalCommand.a(this.f18648a, jB, this.f18650c);
        }
        return spliceNullCommand == null ? new Metadata(new Metadata.Entry[0]) : new Metadata(spliceNullCommand);
    }
}
