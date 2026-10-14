package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcqp extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    private final Context zza;
    private View zzb;

    private zzcqp(Context context) {
        super(context);
        this.zza = context;
    }

    public static zzcqp zza(Context context, View view, zzezn zzeznVar) {
        Resources resources;
        DisplayMetrics displayMetrics;
        zzcqp zzcqpVar = new zzcqp(context);
        if (!zzeznVar.zzv.isEmpty() && (resources = zzcqpVar.zza.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            zzezo zzezoVar = (zzezo) zzeznVar.zzv.get(0);
            float f10 = zzezoVar.zza;
            float f11 = displayMetrics.density;
            zzcqpVar.setLayoutParams(new FrameLayout.LayoutParams((int) (f10 * f11), (int) (zzezoVar.zzb * f11)));
        }
        zzcqpVar.zzb = view;
        zzcqpVar.addView(view);
        com.google.android.gms.ads.internal.zzt.zzx();
        zzcar.zzb(zzcqpVar, zzcqpVar);
        com.google.android.gms.ads.internal.zzt.zzx();
        zzcar.zza(zzcqpVar, zzcqpVar);
        JSONObject jSONObject = zzeznVar.zzai;
        RelativeLayout relativeLayout = new RelativeLayout(zzcqpVar.zza);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("header");
        if (jSONObjectOptJSONObject != null) {
            zzcqpVar.zzc(jSONObjectOptJSONObject, relativeLayout, 10);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("footer");
        if (jSONObjectOptJSONObject2 != null) {
            zzcqpVar.zzc(jSONObjectOptJSONObject2, relativeLayout, 12);
        }
        zzcqpVar.addView(relativeLayout);
        return zzcqpVar;
    }

    private final int zzb(double d10) {
        com.google.android.gms.ads.internal.client.zzay.zzb();
        return zzbzk.zzx(this.zza, (int) d10);
    }

    private final void zzc(JSONObject jSONObject, RelativeLayout relativeLayout, int i10) {
        TextView textView = new TextView(this.zza);
        textView.setTextColor(-1);
        textView.setBackgroundColor(-16777216);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int iZzb = zzb(jSONObject.optDouble("padding", 0.0d));
        textView.setPadding(0, iZzb, 0, iZzb);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, zzb(jSONObject.optDouble("height", 15.0d)));
        layoutParams.addRule(i10);
        relativeLayout.addView(textView, layoutParams);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.zzb.setY(-iArr[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.zzb.setY(-iArr[1]);
    }
}
