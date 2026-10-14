package com.applovin.exoplayer2.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import com.applovin.exoplayer2.an;
import com.applovin.exoplayer2.l.ai;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SubtitleView extends FrameLayout implements an.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<com.applovin.exoplayer2.i.a> f8020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f8021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f8022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f8023d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f8024e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f8025f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f8026g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f8027h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private a f8028i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private View f8029j;

    public interface a {
        void a(List<com.applovin.exoplayer2.i.a> list, c cVar, float f10, int i10, float f11);
    }

    public SubtitleView(Context context) {
        this(context, null);
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8020a = Collections.emptyList();
        this.f8021b = c.f8039a;
        this.f8022c = 0;
        this.f8023d = 0.0533f;
        this.f8024e = 0.08f;
        this.f8025f = true;
        this.f8026g = true;
        b bVar = new b(context);
        this.f8028i = bVar;
        this.f8029j = bVar;
        addView(bVar);
        this.f8027h = 1;
    }

    private com.applovin.exoplayer2.i.a a(com.applovin.exoplayer2.i.a aVar) {
        com.applovin.exoplayer2.i.a.C0095a c0095aA = aVar.a();
        if (!this.f8025f) {
            j.a(c0095aA);
        } else if (!this.f8026g) {
            j.b(c0095aA);
        }
        return c0095aA.e();
    }

    private void a(int i10, float f10) {
        this.f8022c = i10;
        this.f8023d = f10;
        e();
    }

    private void e() {
        this.f8028i.a(getCuesWithStylingPreferencesApplied(), this.f8021b, this.f8023d, this.f8022c, this.f8024e);
    }

    private List<com.applovin.exoplayer2.i.a> getCuesWithStylingPreferencesApplied() {
        if (this.f8025f && this.f8026g) {
            return this.f8020a;
        }
        ArrayList arrayList = new ArrayList(this.f8020a.size());
        for (int i10 = 0; i10 < this.f8020a.size(); i10++) {
            arrayList.add(a(this.f8020a.get(i10)));
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (ai.f7595a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private c getUserCaptionStyle() {
        if (ai.f7595a < 19 || isInEditMode()) {
            return c.f8039a;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        return (captioningManager == null || !captioningManager.isEnabled()) ? c.f8039a : c.a(captioningManager.getUserStyle());
    }

    private <T extends View & a> void setView(T t10) {
        removeView(this.f8029j);
        View view = this.f8029j;
        if (view instanceof l) {
            ((l) view).a();
        }
        this.f8029j = t10;
        this.f8028i = t10;
        addView(t10);
    }

    public void a(float f10, boolean z10) {
        a(z10 ? 1 : 0, f10);
    }

    @Override // com.applovin.exoplayer2.an.d
    public void a(List<com.applovin.exoplayer2.i.a> list) {
        setCues(list);
    }

    public void c() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public void d() {
        setStyle(getUserCaptionStyle());
    }

    public void setApplyEmbeddedFontSizes(boolean z10) {
        this.f8026g = z10;
        e();
    }

    public void setApplyEmbeddedStyles(boolean z10) {
        this.f8025f = z10;
        e();
    }

    public void setBottomPaddingFraction(float f10) {
        this.f8024e = f10;
        e();
    }

    public void setCues(List<com.applovin.exoplayer2.i.a> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.f8020a = list;
        e();
    }

    public void setFractionalTextSize(float f10) {
        a(f10, false);
    }

    public void setStyle(c cVar) {
        this.f8021b = cVar;
        e();
    }

    public void setViewType(int i10) {
        KeyEvent.Callback bVar;
        if (this.f8027h == i10) {
            return;
        }
        if (i10 == 1) {
            bVar = new b(getContext());
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException();
            }
            bVar = new l(getContext());
        }
        setView(bVar);
        this.f8027h = i10;
    }
}
