package com.yandex.mobile.ads.nativeads;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.mobile.ads.impl.ha0;
import com.yandex.mobile.ads.impl.lu0;
import com.yandex.mobile.ads.impl.zy0;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference<View> f27714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LinkedHashMap f27715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final zy0 f27716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final WeakReference<ImageView> f27717d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f27718a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map<String, View> f27719b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ImageView f27720c;

        public a(View view, Map<String, View> map) {
            this.f27718a = view;
            this.f27719b = map;
        }

        public final a a(Button button) {
            this.f27719b.put("call_to_action", button);
            return this;
        }

        public final a a(ImageView imageView) {
            this.f27719b.put("favicon", imageView);
            return this;
        }

        public final a a(TextView textView) {
            this.f27719b.put("age", textView);
            return this;
        }

        public final a a(lu0 lu0Var) {
            this.f27719b.put("rating", lu0Var);
            return this;
        }

        public final a a(MediaView mediaView) {
            this.f27719b.put("media", mediaView);
            return this;
        }

        public final b0 a() {
            return new b0(this, 0);
        }

        public final a b(ImageView imageView) {
            this.f27719b.put("feedback", imageView);
            return this;
        }

        public final a b(TextView textView) {
            this.f27719b.put("body", textView);
            return this;
        }

        public final a c(ImageView imageView) {
            this.f27719b.put("icon", imageView);
            return this;
        }

        public final a c(TextView textView) {
            this.f27719b.put("domain", textView);
            return this;
        }

        public final a d(TextView textView) {
            this.f27719b.put("review_count", textView);
            return this;
        }

        public final a e(TextView textView) {
            this.f27719b.put("sponsored", textView);
            return this;
        }

        public final a f(TextView textView) {
            this.f27719b.put("title", textView);
            return this;
        }

        public final a g(TextView textView) {
            this.f27719b.put("warning", textView);
            return this;
        }
    }

    private b0(a aVar) {
        this.f27714a = new WeakReference<>(aVar.f27718a);
        this.f27717d = new WeakReference<>(aVar.f27720c);
        this.f27715b = ha0.a(aVar.f27719b);
        this.f27716c = new zy0();
    }

    public /* synthetic */ b0(a aVar, int i10) {
        this(aVar);
    }

    public final View a(String str) {
        WeakReference weakReference = (WeakReference) this.f27715b.get(str);
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public final TextView a() {
        zy0 zy0Var = this.f27716c;
        View viewA = a("age");
        Objects.requireNonNull(zy0Var);
        return (TextView) zy0.a(TextView.class, viewA);
    }

    public final LinkedHashMap b() {
        return this.f27715b;
    }

    public final TextView c() {
        zy0 zy0Var = this.f27716c;
        View viewA = a("body");
        Objects.requireNonNull(zy0Var);
        return (TextView) zy0.a(TextView.class, viewA);
    }

    public final TextView d() {
        zy0 zy0Var = this.f27716c;
        View viewA = a("call_to_action");
        Objects.requireNonNull(zy0Var);
        return (TextView) zy0.a(TextView.class, viewA);
    }

    public final TextView e() {
        zy0 zy0Var = this.f27716c;
        View viewA = a("close_button");
        Objects.requireNonNull(zy0Var);
        return (TextView) zy0.a(TextView.class, viewA);
    }

    public final TextView f() {
        zy0 zy0Var = this.f27716c;
        View viewA = a("domain");
        Objects.requireNonNull(zy0Var);
        return (TextView) zy0.a(TextView.class, viewA);
    }

    public final ImageView g() {
        zy0 zy0Var = this.f27716c;
        View viewA = a("favicon");
        Objects.requireNonNull(zy0Var);
        return (ImageView) zy0.a(ImageView.class, viewA);
    }

    public final ImageView h() {
        zy0 zy0Var = this.f27716c;
        View viewA = a("feedback");
        Objects.requireNonNull(zy0Var);
        return (ImageView) zy0.a(ImageView.class, viewA);
    }

    public final ImageView i() {
        zy0 zy0Var = this.f27716c;
        View viewA = a("icon");
        Objects.requireNonNull(zy0Var);
        return (ImageView) zy0.a(ImageView.class, viewA);
    }

    @Deprecated
    public final ImageView j() {
        return this.f27717d.get();
    }

    public final MediaView k() {
        zy0 zy0Var = this.f27716c;
        View viewA = a("media");
        Objects.requireNonNull(zy0Var);
        return (MediaView) zy0.a(MediaView.class, viewA);
    }

    public final View l() {
        return this.f27714a.get();
    }

    public final TextView m() {
        zy0 zy0Var = this.f27716c;
        View viewA = a("price");
        Objects.requireNonNull(zy0Var);
        return (TextView) zy0.a(TextView.class, viewA);
    }

    public final View n() {
        zy0 zy0Var = this.f27716c;
        View viewA = a("rating");
        Objects.requireNonNull(zy0Var);
        return (View) zy0.a(View.class, viewA);
    }

    public final TextView o() {
        zy0 zy0Var = this.f27716c;
        View viewA = a("review_count");
        Objects.requireNonNull(zy0Var);
        return (TextView) zy0.a(TextView.class, viewA);
    }

    public final TextView p() {
        zy0 zy0Var = this.f27716c;
        View viewA = a("sponsored");
        Objects.requireNonNull(zy0Var);
        return (TextView) zy0.a(TextView.class, viewA);
    }

    public final TextView q() {
        zy0 zy0Var = this.f27716c;
        View viewA = a("title");
        Objects.requireNonNull(zy0Var);
        return (TextView) zy0.a(TextView.class, viewA);
    }

    public final TextView r() {
        zy0 zy0Var = this.f27716c;
        View viewA = a("warning");
        Objects.requireNonNull(zy0Var);
        return (TextView) zy0.a(TextView.class, viewA);
    }
}
