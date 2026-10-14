package com.applovin.impl.mediation.debugger.ui.d;

import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f9709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f9710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f9711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImageView f9712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f9713e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f9714f;

    public int a() {
        return this.f9714f;
    }

    public void a(int i10) {
        this.f9714f = i10;
    }

    public void a(c cVar) {
        this.f9713e = cVar;
        this.f9709a.setText(cVar.k());
        this.f9709a.setTextColor(cVar.n());
        if (this.f9710b != null) {
            if (TextUtils.isEmpty(cVar.d())) {
                this.f9710b.setVisibility(8);
            } else {
                this.f9710b.setTypeface(null, 0);
                this.f9710b.setVisibility(0);
                this.f9710b.setText(cVar.d());
                this.f9710b.setTextColor(cVar.e());
                if (cVar.j_()) {
                    this.f9710b.setTypeface(null, 1);
                }
            }
        }
        if (this.f9711c != null) {
            if (cVar.g() > 0) {
                this.f9711c.setImageResource(cVar.g());
                this.f9711c.setColorFilter(cVar.o());
                this.f9711c.setVisibility(0);
            } else {
                this.f9711c.setVisibility(8);
            }
        }
        if (this.f9712d != null) {
            if (cVar.a() <= 0) {
                this.f9712d.setVisibility(8);
                return;
            }
            this.f9712d.setImageResource(cVar.a());
            this.f9712d.setColorFilter(cVar.b());
            this.f9712d.setVisibility(0);
        }
    }

    public c b() {
        return this.f9713e;
    }
}
