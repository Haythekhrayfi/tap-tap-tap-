package com.applovin.exoplayer2.k;

import ch.qos.logback.classic.Level;
import com.applovin.exoplayer2.ai;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class r implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f7489a;

    public r() {
        this(-1);
    }

    public r(int i10) {
        this.f7489a = i10;
    }

    @Override // com.applovin.exoplayer2.k.v
    public int a(int i10) {
        int i11 = this.f7489a;
        if (i11 == -1) {
            return i10 == 7 ? 6 : 3;
        }
        return i11;
    }

    @Override // com.applovin.exoplayer2.k.v
    public long a(v.a aVar) {
        IOException iOException = aVar.f7508c;
        if ((iOException instanceof ai) || (iOException instanceof FileNotFoundException) || (iOException instanceof t.a) || (iOException instanceof w.g) || j.a(iOException)) {
            return -9223372036854775807L;
        }
        return Math.min((aVar.f7509d - 1) * 1000, Level.TRACE_INT);
    }
}
