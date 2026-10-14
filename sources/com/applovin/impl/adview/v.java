package com.applovin.impl.adview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ViewConstructor"})
public class v extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f8627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f8628b;

    public interface a {
        void a();

        void b();
    }

    public v(p pVar, Context context) {
        super(context);
        this.f8627a = pVar;
        setClickable(false);
        setFocusable(false);
    }

    public void a() {
        a(null);
    }

    public void a(a aVar) {
        if (this.f8628b) {
            if (aVar != null) {
                aVar.a();
                return;
            }
            return;
        }
        Drawable drawableA = this.f8627a.a();
        if (drawableA == null) {
            if (aVar != null) {
                aVar.b();
            }
        } else {
            setBackground(drawableA);
            this.f8628b = true;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    public boolean b() {
        return this.f8628b;
    }

    public String getIdentifier() {
        return this.f8627a.b();
    }
}
