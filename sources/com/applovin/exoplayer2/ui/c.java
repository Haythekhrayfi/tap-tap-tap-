package com.applovin.exoplayer2.ui;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;
import com.applovin.exoplayer2.l.ai;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f8039a = new c(-1, -16777216, 0, 0, -1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8043e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f8044f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Typeface f8045g;

    public c(int i10, int i11, int i12, int i13, int i14, Typeface typeface) {
        this.f8040b = i10;
        this.f8041c = i11;
        this.f8042d = i12;
        this.f8043e = i13;
        this.f8044f = i14;
        this.f8045g = typeface;
    }

    public static c a(CaptioningManager.CaptionStyle captionStyle) {
        return ai.f7595a >= 21 ? c(captionStyle) : b(captionStyle);
    }

    private static c b(CaptioningManager.CaptionStyle captionStyle) {
        return new c(captionStyle.foregroundColor, captionStyle.backgroundColor, 0, captionStyle.edgeType, captionStyle.edgeColor, captionStyle.getTypeface());
    }

    private static c c(CaptioningManager.CaptionStyle captionStyle) {
        return new c(captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : f8039a.f8040b, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : f8039a.f8041c, captionStyle.hasWindowColor() ? captionStyle.windowColor : f8039a.f8042d, captionStyle.hasEdgeType() ? captionStyle.edgeType : f8039a.f8043e, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : f8039a.f8044f, captionStyle.getTypeface());
    }
}
