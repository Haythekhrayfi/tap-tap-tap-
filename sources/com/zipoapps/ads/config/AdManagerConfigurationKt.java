package com.zipoapps.ads.config;

import fd.j0;
import jc.w;
import uc.l;

/* JADX INFO: loaded from: classes3.dex */
public final class AdManagerConfigurationKt {
    public static final AdManagerConfiguration adManagerConfig(l<? super AdManagerConfiguration.Builder, w> lVar) {
        j0.i(lVar, "buildConfig");
        AdManagerConfiguration.Builder builder = new AdManagerConfiguration.Builder(null, null, null, null, null, null, null, null, 255, null);
        lVar.invoke(builder);
        return builder.build();
    }
}
