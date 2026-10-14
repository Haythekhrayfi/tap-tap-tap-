package com.yandex.mobile.ads.common;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.view.Window;
import android.widget.RelativeLayout;
import com.yandex.mobile.ads.impl.a1;
import com.yandex.mobile.ads.impl.dh1;
import com.yandex.mobile.ads.impl.l0;
import com.yandex.mobile.ads.impl.n0;
import com.yandex.mobile.ads.impl.q0;
import com.yandex.mobile.ads.impl.x60;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class AdActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final dh1 f18229a = new dh1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RelativeLayout f18230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private l0 f18231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private q0 f18232d;

    @Override // android.app.Activity
    public final void onBackPressed() {
        l0 l0Var = this.f18231c;
        if (l0Var == null || l0Var.f()) {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        q0 q0Var = this.f18232d;
        if (q0Var != null) {
            q0Var.a(configuration);
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        ResultReceiver resultReceiver;
        super.onCreate(bundle);
        this.f18230b = new RelativeLayout(this);
        q0 q0Var = new q0(this);
        this.f18232d = q0Var;
        RelativeLayout relativeLayout = this.f18230b;
        Intent intent = getIntent();
        l0 l0VarA = null;
        if (intent != null) {
            Window window = getWindow();
            try {
                resultReceiver = (ResultReceiver) intent.getParcelableExtra("extra_receiver");
            } catch (Exception unused) {
                x60.c("Failed to get Ad result receiver from intent's extras", new Object[0]);
                resultReceiver = null;
            }
            l0VarA = n0.a().a(this, relativeLayout, resultReceiver, new a1(this, resultReceiver), q0Var, intent, window);
        }
        this.f18231c = l0VarA;
        if (l0VarA == null) {
            finish();
            return;
        }
        l0VarA.g();
        this.f18231c.c();
        RelativeLayout relativeLayout2 = this.f18230b;
        Objects.requireNonNull(this.f18229a);
        relativeLayout2.setTag(dh1.a("root_layout"));
        setContentView(this.f18230b);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        l0 l0Var = this.f18231c;
        if (l0Var != null) {
            l0Var.onAdClosed();
            this.f18231c.d();
        }
        RelativeLayout relativeLayout = this.f18230b;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        l0 l0Var = this.f18231c;
        if (l0Var != null) {
            l0Var.b();
        }
        q0 q0Var = this.f18232d;
        if (q0Var != null) {
            q0Var.a();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        l0 l0Var = this.f18231c;
        if (l0Var != null) {
            l0Var.a();
        }
        q0 q0Var = this.f18232d;
        if (q0Var != null) {
            q0Var.b();
        }
    }
}
