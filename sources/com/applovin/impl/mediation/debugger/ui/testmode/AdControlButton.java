package com.applovin.impl.mediation.debugger.ui.testmode;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.applovin.impl.sdk.utils.g;
import com.applovin.mediation.MaxAdFormat;

/* JADX INFO: loaded from: classes.dex */
public class AdControlButton extends RelativeLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final GradientDrawable f9793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Button f9794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.adview.a f9795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f9796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private MaxAdFormat f9797e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f9798f;

    public interface a {
        void onClick(AdControlButton adControlButton);
    }

    public enum b {
        LOAD,
        LOADING,
        SHOW
    }

    public AdControlButton(Context context) {
        this(context, null, 0);
    }

    public AdControlButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AdControlButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f9793a = gradientDrawable;
        Button button = new Button(getContext());
        this.f9794b = button;
        com.applovin.impl.adview.a aVar = new com.applovin.impl.adview.a(getContext(), 20, R.attr.progressBarStyleSmall);
        this.f9795c = aVar;
        b bVar = b.LOAD;
        this.f9796d = bVar;
        setBackgroundColor(0);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1, 17));
        button.setOnClickListener(this);
        frameLayout.addView(button, new FrameLayout.LayoutParams(-1, -1, 17));
        gradientDrawable.setCornerRadius(20.0f);
        button.setBackground(gradientDrawable);
        a();
        aVar.setColor(-1);
        addView(aVar, new FrameLayout.LayoutParams(-1, -1, 17));
        a(bVar);
    }

    private void a() {
        this.f9794b.setTextColor(new ColorStateList(new int[][]{new int[]{R.attr.state_pressed}, new int[0]}, new int[]{g.a(com.applovin.sdk.R.color.applovin_sdk_highlightTextColor, getContext()), -1}));
    }

    private void a(b bVar) {
        if (b.LOADING == bVar) {
            setEnabled(false);
            this.f9795c.a();
        } else {
            setEnabled(true);
            this.f9795c.b();
        }
        this.f9794b.setText(b(bVar));
        this.f9793a.setColor(c(bVar));
    }

    private String b(b bVar) {
        if (b.LOAD == bVar) {
            return "Load";
        }
        return b.LOADING == bVar ? "" : "Show";
    }

    private int c(b bVar) {
        return g.a((b.LOAD == bVar || b.LOADING == bVar) ? com.applovin.sdk.R.color.applovin_sdk_brand_color : com.applovin.sdk.R.color.applovin_sdk_adControlbutton_brightBlueColor, getContext());
    }

    public b getControlState() {
        return this.f9796d;
    }

    public MaxAdFormat getFormat() {
        return this.f9797e;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        a aVar = this.f9798f;
        if (aVar != null) {
            aVar.onClick(this);
        }
    }

    public void setControlState(b bVar) {
        if (this.f9796d != bVar) {
            a(bVar);
        }
        this.f9796d = bVar;
    }

    public void setFormat(MaxAdFormat maxAdFormat) {
        this.f9797e = maxAdFormat;
    }

    public void setOnClickListener(a aVar) {
        this.f9798f = aVar;
    }
}
