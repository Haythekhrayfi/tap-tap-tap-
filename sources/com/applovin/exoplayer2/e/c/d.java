package com.applovin.exoplayer2.e.c;

import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.l.y;

/* JADX INFO: loaded from: classes.dex */
abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f5289a;

    public static final class a extends ai {
        public a(String str) {
            super(str, null, false, 1);
        }
    }

    public d(x xVar) {
        this.f5289a = xVar;
    }

    public abstract boolean a(y yVar) throws ai;

    public abstract boolean a(y yVar, long j10) throws ai;

    public final boolean b(y yVar, long j10) throws ai {
        return a(yVar) && a(yVar, j10);
    }
}
