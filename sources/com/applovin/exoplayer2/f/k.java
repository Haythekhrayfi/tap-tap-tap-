package com.applovin.exoplayer2.f;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f6284a = new k() { // from class: com.applovin.exoplayer2.f.q
        @Override // com.applovin.exoplayer2.f.k
        public final List getDecoderInfos(String str, boolean z10, boolean z11) {
            return l.b(str, z10, z11);
        }
    };

    List<i> getDecoderInfos(String str, boolean z10, boolean z11) throws l.b;
}
