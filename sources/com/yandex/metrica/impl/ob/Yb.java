package com.yandex.metrica.impl.ob;

import android.annotation.TargetApi;
import android.content.pm.FeatureInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class Yb {

    public static class a extends Yb {
        @Override // com.yandex.metrica.impl.ob.Yb
        @TargetApi(24)
        public Zb b(FeatureInfo featureInfo) {
            return new Zb(featureInfo.name, featureInfo.version, c(featureInfo));
        }
    }

    public static class b extends Yb {
        @Override // com.yandex.metrica.impl.ob.Yb
        public Zb b(FeatureInfo featureInfo) {
            return new Zb(featureInfo.name, -1, c(featureInfo));
        }
    }

    public Zb a(FeatureInfo featureInfo) {
        int i10;
        if (featureInfo.name == null && (i10 = featureInfo.reqGlEsVersion) != 0) {
            return new Zb("openGlFeature", i10, c(featureInfo));
        }
        return b(featureInfo);
    }

    public abstract Zb b(FeatureInfo featureInfo);

    public boolean c(FeatureInfo featureInfo) {
        return (featureInfo.flags & 1) != 0;
    }
}
