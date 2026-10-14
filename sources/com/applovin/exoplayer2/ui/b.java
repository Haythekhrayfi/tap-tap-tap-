package com.applovin.exoplayer2.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class b extends View implements SubtitleView.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<i> f8033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<com.applovin.exoplayer2.i.a> f8034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f8035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f8036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f8037e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f8038f;

    public b(Context context) {
        this(context, null);
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8033a = new ArrayList();
        this.f8034b = Collections.emptyList();
        this.f8035c = 0;
        this.f8036d = 0.0533f;
        this.f8037e = c.f8039a;
        this.f8038f = 0.08f;
    }

    private static com.applovin.exoplayer2.i.a a(com.applovin.exoplayer2.i.a aVar) {
        com.applovin.exoplayer2.i.a.C0095a c0095aA = aVar.a().a(-3.4028235E38f).b(Integer.MIN_VALUE).a((Layout.Alignment) null);
        if (aVar.f6743g == 0) {
            c0095aA.a(1.0f - aVar.f6742f, 0);
        } else {
            c0095aA.a((-aVar.f6742f) - 1.0f, 1);
        }
        int i10 = aVar.f6744h;
        if (i10 == 0) {
            c0095aA.a(2);
        } else if (i10 == 2) {
            c0095aA.a(0);
        }
        return c0095aA.e();
    }

    @Override // com.applovin.exoplayer2.ui.SubtitleView.a
    public void a(List<com.applovin.exoplayer2.i.a> list, c cVar, float f10, int i10, float f11) {
        this.f8034b = list;
        this.f8037e = cVar;
        this.f8036d = f10;
        this.f8035c = i10;
        this.f8038f = f11;
        while (this.f8033a.size() < list.size()) {
            this.f8033a.add(new i(getContext()));
        }
        invalidate();
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        List<com.applovin.exoplayer2.i.a> list = this.f8034b;
        if (list.isEmpty()) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i10 = paddingBottom - paddingTop;
        float fA = j.a(this.f8035c, this.f8036d, height, i10);
        if (fA <= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            return;
        }
        int size = list.size();
        int i11 = 0;
        while (i11 < size) {
            com.applovin.exoplayer2.i.a aVarA = list.get(i11);
            if (aVarA.f6753q != Integer.MIN_VALUE) {
                aVarA = a(aVarA);
            }
            com.applovin.exoplayer2.i.a aVar = aVarA;
            int i12 = paddingBottom;
            this.f8033a.get(i11).a(aVar, this.f8037e, fA, j.a(aVar.f6751o, aVar.f6752p, height, i10), this.f8038f, canvas, paddingLeft, paddingTop, width, i12);
            i11++;
            size = size;
            i10 = i10;
            paddingBottom = i12;
            width = width;
        }
    }
}
