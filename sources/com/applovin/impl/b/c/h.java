package com.applovin.impl.b.c;

import android.app.Activity;
import android.net.Uri;
import android.text.style.URLSpan;
import android.view.View;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.w;

/* JADX INFO: loaded from: classes.dex */
public class h extends URLSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f8831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f8832b;

    public h(String str, Activity activity, o oVar) {
        super(str);
        this.f8831a = activity;
        this.f8832b = oVar;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public void onClick(View view) {
        w.a(Uri.parse(getURL()), this.f8831a, this.f8832b);
    }
}
