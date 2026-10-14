package com.applovin.impl.adview;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f8617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f8618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f8619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f8620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f8621e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f8622f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f8623g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f8624h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f8625i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final float f8626j;

    public u(JSONObject jSONObject, com.applovin.impl.sdk.o oVar) {
        oVar.F();
        if (com.applovin.impl.sdk.y.a()) {
            com.applovin.impl.sdk.y yVarF = oVar.F();
            StringBuilder sbA = defpackage.a.a("Updating video button properties with JSON = ");
            sbA.append(JsonUtils.maybeConvertToIndentedString(jSONObject));
            yVarF.c("VideoButtonProperties", sbA.toString());
        }
        this.f8617a = JsonUtils.getInt(jSONObject, "width", 64);
        this.f8618b = JsonUtils.getInt(jSONObject, "height", 7);
        this.f8619c = JsonUtils.getInt(jSONObject, "margin", 20);
        this.f8620d = JsonUtils.getInt(jSONObject, "gravity", 85);
        this.f8621e = JsonUtils.getBoolean(jSONObject, "tap_to_fade", Boolean.FALSE).booleanValue();
        this.f8622f = JsonUtils.getInt(jSONObject, "tap_to_fade_duration_milliseconds", 500);
        this.f8623g = JsonUtils.getInt(jSONObject, "fade_in_duration_milliseconds", 500);
        this.f8624h = JsonUtils.getInt(jSONObject, "fade_out_duration_milliseconds", 500);
        this.f8625i = JsonUtils.getFloat(jSONObject, "fade_in_delay_seconds", 1.0f);
        this.f8626j = JsonUtils.getFloat(jSONObject, "fade_out_delay_seconds", 6.0f);
    }

    public int a() {
        return this.f8617a;
    }

    public int b() {
        return this.f8618b;
    }

    public int c() {
        return this.f8619c;
    }

    public int d() {
        return this.f8620d;
    }

    public boolean e() {
        return this.f8621e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        u uVar = (u) obj;
        return this.f8617a == uVar.f8617a && this.f8618b == uVar.f8618b && this.f8619c == uVar.f8619c && this.f8620d == uVar.f8620d && this.f8621e == uVar.f8621e && this.f8622f == uVar.f8622f && this.f8623g == uVar.f8623g && this.f8624h == uVar.f8624h && Float.compare(uVar.f8625i, this.f8625i) == 0 && Float.compare(uVar.f8626j, this.f8626j) == 0;
    }

    public long f() {
        return this.f8622f;
    }

    public long g() {
        return this.f8623g;
    }

    public long h() {
        return this.f8624h;
    }

    public int hashCode() {
        int i10 = ((((((((((((((this.f8617a * 31) + this.f8618b) * 31) + this.f8619c) * 31) + this.f8620d) * 31) + (this.f8621e ? 1 : 0)) * 31) + this.f8622f) * 31) + this.f8623g) * 31) + this.f8624h) * 31;
        float f10 = this.f8625i;
        int iFloatToIntBits = (i10 + (f10 != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD ? Float.floatToIntBits(f10) : 0)) * 31;
        float f11 = this.f8626j;
        return iFloatToIntBits + (f11 != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD ? Float.floatToIntBits(f11) : 0);
    }

    public float i() {
        return this.f8625i;
    }

    public float j() {
        return this.f8626j;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("VideoButtonProperties{widthPercentOfScreen=");
        sbA.append(this.f8617a);
        sbA.append(", heightPercentOfScreen=");
        sbA.append(this.f8618b);
        sbA.append(", margin=");
        sbA.append(this.f8619c);
        sbA.append(", gravity=");
        sbA.append(this.f8620d);
        sbA.append(", tapToFade=");
        sbA.append(this.f8621e);
        sbA.append(", tapToFadeDurationMillis=");
        sbA.append(this.f8622f);
        sbA.append(", fadeInDurationMillis=");
        sbA.append(this.f8623g);
        sbA.append(", fadeOutDurationMillis=");
        sbA.append(this.f8624h);
        sbA.append(", fadeInDelay=");
        sbA.append(this.f8625i);
        sbA.append(", fadeOutDelay=");
        sbA.append(this.f8626j);
        sbA.append('}');
        return sbA.toString();
    }
}
