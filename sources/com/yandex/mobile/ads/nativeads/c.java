package com.yandex.mobile.ads.nativeads;

import android.view.View;
import com.yandex.mobile.ads.impl.d11;
import com.yandex.mobile.ads.impl.g2;
import com.yandex.mobile.ads.impl.m80;
import com.yandex.mobile.ads.impl.mi0;
import com.yandex.mobile.ads.impl.ov0;
import com.yandex.mobile.ads.impl.qa;
import com.yandex.mobile.ads.impl.v01;
import com.yandex.mobile.ads.impl.wv;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f27721a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f27722b = new b();

    public class a extends c {
        @Override // com.yandex.mobile.ads.nativeads.c
        public final View.OnClickListener a(wv wvVar, ov0 ov0Var, g2 g2Var, w wVar, qa qaVar, m80 m80Var) {
            return new mi0(wvVar, ov0Var, g2Var, wVar, qaVar, m80Var);
        }
    }

    public class b extends c {
        @Override // com.yandex.mobile.ads.nativeads.c
        public final View.OnClickListener a(wv wvVar, ov0 ov0Var, g2 g2Var, w wVar, qa qaVar, m80 m80Var) {
            return ("call_to_action".equals(qaVar.b()) || "feedback".equals(qaVar.b())) ? new mi0(wvVar, ov0Var, g2Var, wVar, qaVar, m80Var) : new v01(wVar.h().d());
        }
    }

    public static c a(d11 d11Var) {
        return (d11Var == null || !"button_click_only".equals(d11Var.b())) ? f27721a : f27722b;
    }

    public abstract View.OnClickListener a(wv wvVar, ov0 ov0Var, g2 g2Var, w wVar, qa qaVar, m80 m80Var);
}
