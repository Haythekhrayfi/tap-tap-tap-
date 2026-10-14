package com.yandex.mobile.ads.impl;

import android.R;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ProgressBar;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class op implements p7.l0 {
    @Override // p7.l0
    public final void bindView(View view, y9.i1 i1Var, i8.k kVar) {
        fd.j0.i(view, "view");
        fd.j0.i(i1Var, "div");
        fd.j0.i(kVar, "divView");
    }

    @Override // p7.l0
    public final View createView(y9.i1 i1Var, i8.k kVar) throws JSONException {
        fd.j0.i(i1Var, "div");
        fd.j0.i(kVar, "divView");
        String string = null;
        ProgressBar progressBar = new ProgressBar(kVar.getContext(), null, R.attr.progressBarStyleHorizontal);
        JSONObject jSONObject = i1Var.f40540h;
        if (jSONObject != null && jSONObject.has("progress_color")) {
            JSONObject jSONObject2 = i1Var.f40540h;
            if (jSONObject2 != null) {
                string = jSONObject2.getString("progress_color");
            }
        } else {
            string = "#000000";
        }
        int iA = pj.a(string);
        Drawable drawable = progressBar.getContext().getDrawable(com.yandex.mobile.ads.R.drawable.yandex_ads_internal_circular_close_progress);
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(iA, PorterDuff.Mode.SRC_IN));
        }
        progressBar.setProgressDrawable(drawable);
        return progressBar;
    }

    @Override // p7.l0
    public final boolean isCustomTypeSupported(String str) {
        fd.j0.i(str, "type");
        return fd.j0.d(str, "close_progress_view");
    }

    @Override // p7.l0
    public /* bridge */ /* synthetic */ p7.y0.d preload(y9.i1 i1Var, p7.y0.a aVar) {
        super.preload(i1Var, aVar);
        return p7.z0.f34622b;
    }

    @Override // p7.l0
    public final void release(View view, y9.i1 i1Var) {
        fd.j0.i(view, "view");
        fd.j0.i(i1Var, "div");
    }
}
