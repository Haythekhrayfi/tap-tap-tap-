package com.applovin.impl.adview;

import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import com.applovin.mediation.AppLovinExtras;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, Object> f8583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f8584b;

    public p(Map<String, Object> map, com.applovin.impl.sdk.o oVar) {
        this.f8583a = map;
        this.f8584b = oVar;
    }

    public Drawable a() {
        Object obj = this.f8583a.get(AppLovinExtras.Keys.KEY_WATERMARK);
        if (!(obj instanceof String)) {
            this.f8584b.F();
            if (com.applovin.impl.sdk.y.a()) {
                this.f8584b.F().e("GoogleWatermarkGenerator", "Unable to render invalid watermark: " + obj);
            }
            return null;
        }
        try {
            byte[] bArrDecode = Base64.decode((String) obj, 0);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(com.applovin.impl.sdk.o.au().getResources(), BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            bitmapDrawable.setTileModeXY(tileMode, tileMode);
            return bitmapDrawable;
        } catch (Throwable th) {
            this.f8584b.F();
            if (com.applovin.impl.sdk.y.a()) {
                this.f8584b.F().b("GoogleWatermarkGenerator", "Failed to render watermark", th);
            }
            return null;
        }
    }

    public String b() {
        return "google watermark";
    }
}
