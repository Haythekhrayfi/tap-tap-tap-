package com.applovin.exoplayer2.e.h;

import com.applovin.exoplayer2.b.s;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.v;
import java.util.Arrays;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes.dex */
final class g extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f5674a = {79, 112, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f5675b;

    private long a(byte[] bArr) {
        int i10;
        int i11 = bArr[0] & 255;
        int i12 = i11 & 3;
        int i13 = 2;
        if (i12 == 0) {
            i13 = 1;
        } else if (i12 != 1 && i12 != 2) {
            i13 = bArr[1] & 63;
        }
        int i14 = i11 >> 3;
        int i15 = i14 & 3;
        if (i14 >= 16) {
            i10 = 2500 << i15;
        } else if (i14 >= 12) {
            i10 = 10000 << (i15 & 1);
        } else {
            i10 = i15 == 3 ? DateTimeConstants.MILLIS_PER_MINUTE : 10000 << i15;
        }
        return ((long) i13) * ((long) i10);
    }

    public static boolean a(y yVar) {
        int iA = yVar.a();
        byte[] bArr = f5674a;
        if (iA < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        yVar.a(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.applovin.exoplayer2.e.h.h
    public void a(boolean z10) {
        super.a(z10);
        if (z10) {
            this.f5675b = false;
        }
    }

    @Override // com.applovin.exoplayer2.e.h.h
    public boolean a(y yVar, long j10, h.a aVar) {
        if (this.f5675b) {
            com.applovin.exoplayer2.l.a.b(aVar.f5689a);
            boolean z10 = yVar.q() == 1332770163;
            yVar.d(0);
            return z10;
        }
        byte[] bArrCopyOf = Arrays.copyOf(yVar.d(), yVar.b());
        aVar.f5689a = new v.a().f("audio/opus").k(s.a(bArrCopyOf)).l(48000).a(s.b(bArrCopyOf)).a();
        this.f5675b = true;
        return true;
    }

    @Override // com.applovin.exoplayer2.e.h.h
    public long b(y yVar) {
        return b(a(yVar.d()));
    }
}
