package com.applovin.exoplayer2.d;

import com.applovin.exoplayer2.l.ai;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class n implements com.applovin.exoplayer2.c.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f5156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UUID f5157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f5158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f5159d;

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    static {
        boolean z10;
        if ("Amazon".equals(ai.f7597c)) {
            String str = ai.f7598d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        f5156a = z10;
    }

    public n(UUID uuid, byte[] bArr, boolean z10) {
        this.f5157b = uuid;
        this.f5158c = bArr;
        this.f5159d = z10;
    }
}
