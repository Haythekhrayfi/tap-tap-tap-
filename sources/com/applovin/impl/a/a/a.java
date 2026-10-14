package com.applovin.impl.a.a;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.applovin.creative.MaxCreativeDebuggerActivity;
import com.applovin.impl.a.a.b.a.b;
import com.applovin.impl.mediation.d.c;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.f;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.h;
import com.applovin.impl.sdk.utils.k;
import com.applovin.impl.sdk.utils.p;
import com.applovin.impl.sdk.utils.t;
import com.applovin.impl.sdk.utils.w;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class a implements k.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static WeakReference<MaxCreativeDebuggerActivity> f8247f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final AtomicBoolean f8248l = new AtomicBoolean();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f8249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f8250b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f8253e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private k f8255h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private t f8256i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f8257j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f8258k;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<com.applovin.impl.a.a.a.a> f8251c = new ArrayList(10);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f8252d = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private WeakReference<View> f8254g = new WeakReference<>(null);

    public a(o oVar) {
        this.f8249a = oVar;
        Context contextAu = o.au();
        this.f8250b = contextAu;
        this.f8253e = new b(contextAu);
    }

    private View a(Activity activity) {
        View view;
        int iDpToPx = AppLovinSdkUtils.dpToPx(activity, 40);
        int i10 = iDpToPx / 10;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iDpToPx, iDpToPx, 8388629);
        layoutParams.setMargins(i10, i10, i10, i10);
        try {
            ImageButton imageButton = new ImageButton(activity);
            imageButton.setImageDrawable(activity.getResources().getDrawable(R.drawable.applovin_ic_white_small));
            imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageButton.setPadding(i10, i10, i10, i10 * 2);
            view = imageButton;
        } catch (Throwable unused) {
            Button button = new Button(activity);
            button.setText("ⓘ");
            button.setTextColor(-1);
            button.setAllCaps(false);
            button.setTextSize(2, 20.0f);
            button.setPadding(0, 0, 0, 0);
            view = button;
        }
        view.setLayoutParams(layoutParams);
        view.setBackground(l());
        view.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.a.a.a.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                a.this.c();
            }
        });
        if (h.d()) {
            view.setElevation(AppLovinSdkUtils.dpToPx(activity, 5));
        }
        return view;
    }

    private boolean c(Object obj) {
        MaxAdFormat format;
        if (obj instanceof e) {
            format = ((e) obj).getAdZone().b();
        } else {
            format = obj instanceof com.applovin.impl.mediation.a.a ? ((com.applovin.impl.mediation.a.a) obj).getFormat() : null;
        }
        return format != null && format.isFullscreenAd();
    }

    private Bundle d(Object obj) {
        Bundle bundleA = this.f8249a.aj().a(w.a(obj));
        if (bundleA == null) {
            return null;
        }
        for (String str : bundleA.keySet()) {
            Object obj2 = bundleA.get(str);
            bundleA.remove(str);
            BundleUtils.put(StringUtils.toHumanReadableString(str), obj2, bundleA);
        }
        return bundleA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i() {
        WeakReference<MaxCreativeDebuggerActivity> weakReference = f8247f;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    private void j() {
        this.f8249a.E().a(new com.applovin.impl.sdk.utils.a() { // from class: com.applovin.impl.a.a.a.1
            @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
                if (activity instanceof MaxCreativeDebuggerActivity) {
                    y.f("AppLovinSdk", "Started Creative Debugger");
                    if (!a.this.i() || a.f8247f.get() != activity) {
                        MaxCreativeDebuggerActivity maxCreativeDebuggerActivity = (MaxCreativeDebuggerActivity) activity;
                        WeakReference unused = a.f8247f = new WeakReference(maxCreativeDebuggerActivity);
                        maxCreativeDebuggerActivity.a(a.this.f8253e, a.this.f8249a.E());
                    }
                    a.f8248l.set(false);
                }
            }

            @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
                if (activity instanceof MaxCreativeDebuggerActivity) {
                    y.f("AppLovinSdk", "Creative Debugger destroyed");
                    WeakReference unused = a.f8247f = null;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (d() && this.f8254g.get() == null && !i()) {
            Activity activityA = this.f8249a.E().a();
            if (activityA == null) {
                this.f8249a.F();
                if (y.a()) {
                    this.f8249a.F().e("AppLovinSdk", "Failed to display Creative Debugger button");
                    return;
                }
                return;
            }
            View viewFindViewById = activityA.findViewById(android.R.id.content);
            if (viewFindViewById instanceof FrameLayout) {
                final FrameLayout frameLayout = (FrameLayout) viewFindViewById;
                final View viewA = a(activityA);
                frameLayout.addView(viewA);
                AlphaAnimation alphaAnimation = new AlphaAnimation(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 1.0f);
                alphaAnimation.setDuration(150L);
                viewA.startAnimation(alphaAnimation);
                final ViewTreeObserver viewTreeObserver = viewFindViewById.getViewTreeObserver();
                final ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.applovin.impl.a.a.a.4
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public void onGlobalLayout() {
                        if (viewA.getParent() != null || a.this.f8254g.get() == null) {
                            return;
                        }
                        frameLayout.addView(viewA);
                    }
                };
                viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.a.a.a.5
                    @Override // java.lang.Runnable
                    public void run() {
                        frameLayout.removeView(viewA);
                        a.this.f8254g = new WeakReference(null);
                        if (viewTreeObserver.isAlive()) {
                            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
                        }
                    }
                }, TimeUnit.SECONDS.toMillis(5L));
                this.f8254g = new WeakReference<>(viewA);
            }
        }
    }

    private Drawable l() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.rgb(5, 131, 170));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        gradientDrawable2.setColor(Color.rgb(2, 98, 127));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        return stateListDrawable;
    }

    public String a(com.applovin.impl.a.a.a.a aVar) {
        Object objC = aVar.c();
        p pVar = new p();
        pVar.b("Ad Info:\n");
        if (objC instanceof e) {
            e eVar = (e) objC;
            pVar.a("Network", "APPLOVIN").a(eVar).b(eVar);
        } else if (objC instanceof com.applovin.impl.mediation.a.a) {
            pVar.a((com.applovin.impl.mediation.a.a) objC);
        }
        pVar.a(this.f8249a);
        pVar.a("Epoch Timestamp (ms)", Long.valueOf(aVar.d()));
        pVar.a("\nDebug Info:\n").a("Platform", "fireos".equals(this.f8249a.M() != null ? this.f8249a.L().v() : this.f8249a.K().f()) ? "Fire OS" : "Android").a("AppLovin SDK Version", AppLovinSdk.VERSION).a("Plugin Version", this.f8249a.a(com.applovin.impl.sdk.c.b.eo)).a("App Package Name", this.f8250b.getPackageName()).a("Device", String.format("%s %s (%s)", Build.BRAND, Build.MODEL, Build.DEVICE)).a("OS Version", Build.VERSION.RELEASE).a("AppLovin Random Token", this.f8249a.s()).a("Ad Review Version", f.a()).a(d(objC)).a("User ID", this.f8249a.q() != null ? this.f8249a.q() : "None");
        return pVar.toString();
    }

    public void a() {
        if (d()) {
            if (this.f8255h == null) {
                this.f8255h = new k(this.f8249a, this);
            }
            this.f8255h.a();
        }
    }

    public void a(com.applovin.impl.a.a.a.a aVar, Context context, boolean z10) {
        Object objC = aVar.c();
        String strA = a(aVar);
        p pVar = new p();
        if (z10) {
            pVar.b("Please describe the issue you had with this ad:\n\n\n\n");
        }
        pVar.b(strA);
        String strB = this.f8249a.ac().b(objC);
        if (strB != null) {
            pVar.a("\nBid Response:\n");
            pVar.a(strB);
        }
        String str = "AppLovin Ad Report";
        Intent intentCreateChooser = Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.SUBJECT", objC instanceof e ? "AppLovin Ad Report" : "MAX Ad Report").putExtra("android.intent.extra.TEXT", pVar.toString()).setPackage(null), "Share Ad Report");
        if (z10) {
            try {
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("mailto:"));
                if (!(objC instanceof e)) {
                    str = "MAX Ad Report";
                }
                context.startActivity(intent.putExtra("android.intent.extra.SUBJECT", str).putExtra("android.intent.extra.TEXT", pVar.toString()).setPackage("com.google.android.gm"));
                return;
            } catch (ActivityNotFoundException unused) {
            }
        }
        context.startActivity(intentCreateChooser);
    }

    public void a(Object obj) {
        if (d() && obj != null) {
            if (!c.a(obj) || c(obj)) {
                if (c.b(obj) && c(obj)) {
                    return;
                }
                synchronized (this.f8252d) {
                    this.f8251c.add(0, new com.applovin.impl.a.a.a.a(obj, System.currentTimeMillis()));
                    if (this.f8251c.size() > 10) {
                        List<com.applovin.impl.a.a.a.a> list = this.f8251c;
                        list.remove(list.size() - 1);
                    }
                }
            }
        }
    }

    public String b(Object obj) {
        JSONObject jSONObjectD;
        if (obj instanceof e) {
            return ((e) obj).getOriginalFullResponse().toString();
        }
        if (!(obj instanceof com.applovin.impl.mediation.a.a)) {
            return null;
        }
        String strP = ((com.applovin.impl.mediation.a.a) obj).p();
        return (!c.b(obj) || (jSONObjectD = new com.applovin.impl.sdk.ad.c(strP, this.f8249a).d()) == null) ? strP : jSONObjectD.toString();
    }

    public void b() {
        k kVar = this.f8255h;
        if (kVar != null) {
            kVar.b();
        }
    }

    public void c() {
        ArrayList arrayList;
        if (i() || !f8248l.compareAndSet(false, true)) {
            y.j("AppLovinSdk", "Creative Debugger is already showing");
            return;
        }
        synchronized (this.f8252d) {
            arrayList = new ArrayList(this.f8251c);
        }
        this.f8253e.a(arrayList, this.f8249a);
        if (!this.f8258k) {
            j();
            this.f8258k = true;
        }
        Intent intent = new Intent(this.f8250b, (Class<?>) MaxCreativeDebuggerActivity.class);
        intent.setFlags(268435456);
        y.f("AppLovinSdk", "Starting Creative Debugger...");
        this.f8250b.startActivity(intent);
    }

    public boolean d() {
        return ((Boolean) this.f8249a.a(com.applovin.impl.sdk.c.b.bZ)).booleanValue() && this.f8249a.ay().isCreativeDebuggerEnabled();
    }

    @Override // com.applovin.impl.sdk.utils.k.a
    public void e() {
        if (this.f8257j == 0) {
            this.f8256i = t.a(TimeUnit.SECONDS.toMillis(3L), this.f8249a, new Runnable() { // from class: com.applovin.impl.a.a.a.2
                @Override // java.lang.Runnable
                public void run() {
                    a.this.f8257j = 0;
                }
            });
        }
        int i10 = this.f8257j;
        if (i10 % 2 == 0) {
            this.f8257j = i10 + 1;
        }
    }

    @Override // com.applovin.impl.sdk.utils.k.a
    public void f() {
        int i10 = this.f8257j;
        if (i10 % 2 == 1) {
            this.f8257j = i10 + 1;
        }
        if (this.f8257j / 2 == 2) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.a.a.a.3
                @Override // java.lang.Runnable
                public void run() {
                    a.this.k();
                }
            });
            this.f8257j = 0;
            this.f8256i.d();
        }
    }
}
