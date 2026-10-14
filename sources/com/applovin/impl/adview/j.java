package com.applovin.impl.adview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class j extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f8550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f8551b;

    public enum a {
        WHITE_ON_BLACK(0),
        WHITE_ON_TRANSPARENT(1),
        INVISIBLE(2),
        TRANSPARENT_SKIP(3);


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f8557e;

        a(int i10) {
            this.f8557e = i10;
        }

        public int a() {
            return this.f8557e;
        }
    }

    public j(Context context) {
        super(context);
        this.f8550a = 1.0f;
        this.f8551b = context;
    }

    public static j a(a aVar, Context context) {
        if (aVar.equals(a.INVISIBLE)) {
            return new r(context);
        }
        if (aVar.equals(a.WHITE_ON_TRANSPARENT)) {
            return new s(context);
        }
        return aVar.equals(a.TRANSPARENT_SKIP) ? new t(context) : new z(context);
    }

    public void a(int i10) {
        setViewScale(i10 / 30.0f);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = (int) getSize();
            layoutParams.height = (int) getSize();
        }
    }

    public float getSize() {
        return this.f8550a * 30.0f;
    }

    public abstract a getStyle();

    public void setViewScale(float f10) {
        this.f8550a = f10;
    }
}
