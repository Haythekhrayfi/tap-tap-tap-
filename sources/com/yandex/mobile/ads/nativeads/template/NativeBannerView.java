package com.yandex.mobile.ads.nativeads.template;

import android.R;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.yandex.mobile.ads.impl.eh1;
import com.yandex.mobile.ads.impl.hp;
import com.yandex.mobile.ads.impl.lu0;
import com.yandex.mobile.ads.impl.mu;
import com.yandex.mobile.ads.impl.oa;
import com.yandex.mobile.ads.impl.qu;
import com.yandex.mobile.ads.impl.x60;
import com.yandex.mobile.ads.impl.xu;
import com.yandex.mobile.ads.impl.y11;
import com.yandex.mobile.ads.nativeads.MediaView;
import com.yandex.mobile.ads.nativeads.NativeAd;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import com.yandex.mobile.ads.nativeads.NativeAdException;
import com.yandex.mobile.ads.nativeads.NativeAdImage;
import com.yandex.mobile.ads.nativeads.NativeAdImageLoadingListener;
import com.yandex.mobile.ads.nativeads.NativeAdMedia;
import com.yandex.mobile.ads.nativeads.NativeAdType;
import com.yandex.mobile.ads.nativeads.l0;
import com.yandex.mobile.ads.nativeads.n;
import com.yandex.mobile.ads.nativeads.template.appearance.NativeTemplateAppearance;
import com.yandex.mobile.ads.nativeads.u;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class NativeBannerView extends n<l0> {
    private LinearLayout A;
    private MediaView B;
    private LinearLayout C;
    private NativeAdType D;
    private NativeAdAssets E;
    private e F;
    private d G;
    private NativeAd H;
    private com.yandex.mobile.ads.nativeads.template.b I;
    private final NativeAdImageLoadingListener J;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final hp f27838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f27839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f27840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f27841e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private NativeTemplateAppearance f27842f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private TextView f27843g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private TextView f27844h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Button f27845i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private TextView f27846j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ImageView f27847k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ImageView f27848l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private f f27849m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private TextView f27850n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private TextView f27851o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ImageView f27852p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private lu0 f27853q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private TextView f27854r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private ImageView f27855s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ImageView f27856t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private LinearLayout f27857u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private FrameLayout f27858v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private LinearLayout f27859w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private LinearLayout f27860x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private LinearLayout f27861y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private ImageView f27862z;

    public class a implements NativeAdImageLoadingListener {
        public a() {
        }

        @Override // com.yandex.mobile.ads.nativeads.NativeAdImageLoadingListener
        public final void onFinishLoadingImages() {
            if (NativeBannerView.this.H != null) {
                NativeBannerView.this.H.removeImageLoadingListener(this);
            }
            NativeBannerView.this.I.a();
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27864a;

        static {
            int[] iArr = new int[SizeConstraint.SizeConstraintType.values().length];
            f27864a = iArr;
            try {
                iArr[SizeConstraint.SizeConstraintType.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27864a[SizeConstraint.SizeConstraintType.FIXED_RATIO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27864a[SizeConstraint.SizeConstraintType.PREFERRED_RATIO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public NativeBannerView(Context context) {
        super(context);
        this.f27839c = eh1.a(getContext(), 4.0f);
        this.f27840d = eh1.a(getContext(), 8.0f);
        this.f27841e = eh1.a(getContext(), 12.0f);
        this.J = new a();
        this.f27838b = new hp();
        p();
    }

    public NativeBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27839c = eh1.a(getContext(), 4.0f);
        this.f27840d = eh1.a(getContext(), 8.0f);
        this.f27841e = eh1.a(getContext(), 12.0f);
        this.J = new a();
        this.f27838b = new hp();
        p();
    }

    public NativeBannerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f27839c = eh1.a(getContext(), 4.0f);
        this.f27840d = eh1.a(getContext(), 8.0f);
        this.f27841e = eh1.a(getContext(), 12.0f);
        this.J = new a();
        this.f27838b = new hp();
        p();
    }

    private void a() {
        int iA = eh1.a(getContext(), this.f27842f.getBannerAppearance().getBorderWidth());
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setShape(new RectShape());
        Paint paint = shapeDrawable.getPaint();
        paint.setColor(this.f27842f.getBannerAppearance().getBackgroundColor());
        paint.setStyle(Paint.Style.FILL);
        ShapeDrawable shapeDrawable2 = new ShapeDrawable();
        shapeDrawable2.setShape(new RectShape());
        Paint paint2 = shapeDrawable2.getPaint();
        paint2.setColor(this.f27842f.getBannerAppearance().getBorderColor());
        paint2.setStrokeWidth(iA * 2.0f);
        paint2.setStyle(Paint.Style.STROKE);
        setBackground(new LayerDrawable(new Drawable[]{shapeDrawable, shapeDrawable2}));
        setPadding(iA, iA, iA, iA);
        int iA2 = eh1.a(getContext(), this.f27842f.getBannerAppearance().getContentPadding().getLeft());
        int iA3 = eh1.a(getContext(), this.f27842f.getBannerAppearance().getContentPadding().getRight());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(iA2, this.f27840d, iA3, this.f27839c);
        this.f27859w.setLayoutParams(layoutParams);
        this.f27859w.invalidate();
        int iA4 = eh1.a(getContext(), this.f27842f.getBannerAppearance().getContentPadding().getLeft());
        int iA5 = eh1.a(getContext(), this.f27842f.getBannerAppearance().getContentPadding().getRight());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.leftMargin = iA4;
        layoutParams2.rightMargin = iA5;
        layoutParams2.bottomMargin = this.f27839c;
        this.f27860x.setLayoutParams(layoutParams2);
        this.f27860x.invalidate();
        int iA6 = eh1.a(getContext(), this.f27842f.getBannerAppearance().getContentPadding().getLeft());
        int iA7 = eh1.a(getContext(), this.f27842f.getBannerAppearance().getContentPadding().getRight());
        TextView textView = this.f27851o;
        int i10 = this.f27839c;
        textView.setPadding(iA6, i10, iA7, i10);
        this.f27851o.invalidate();
        this.f27845i.setTextColor(this.f27842f.getCallToActionAppearance().getTextAppearance().getTextColor());
        this.f27845i.setTextSize(this.f27842f.getCallToActionAppearance().getTextAppearance().getTextSize());
        this.f27845i.setTypeface(Typeface.create(this.f27842f.getCallToActionAppearance().getTextAppearance().getFontFamilyName(), this.f27842f.getCallToActionAppearance().getTextAppearance().getFontStyle()));
        float[] fArr = new float[8];
        Arrays.fill(fArr, eh1.a(getContext(), 5.0f));
        RoundRectShape roundRectShape = new RoundRectShape(fArr, null, fArr);
        ShapeDrawable shapeDrawable3 = new ShapeDrawable(roundRectShape);
        shapeDrawable3.getPaint().setColor(this.f27842f.getCallToActionAppearance().getPressedColor());
        ShapeDrawable shapeDrawable4 = new ShapeDrawable(roundRectShape);
        shapeDrawable4.getPaint().setColor(this.f27842f.getCallToActionAppearance().getNormalColor());
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_selected}, shapeDrawable3);
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, shapeDrawable3);
        stateListDrawable.addState(new int[0], shapeDrawable4);
        int iA8 = eh1.a(getContext(), this.f27842f.getCallToActionAppearance().getBorderWidth());
        ShapeDrawable shapeDrawable5 = new ShapeDrawable();
        shapeDrawable5.setShape(roundRectShape);
        Paint paint3 = shapeDrawable5.getPaint();
        paint3.setColor(this.f27842f.getCallToActionAppearance().getBorderColor());
        paint3.setStrokeWidth(iA8);
        paint3.setStyle(Paint.Style.STROKE);
        this.f27845i.setBackground(new LayerDrawable(new Drawable[]{stateListDrawable, shapeDrawable5}));
        LayerDrawable layerDrawable = (LayerDrawable) this.f27853q.getProgressDrawable();
        layerDrawable.getDrawable(2).setColorFilter(this.f27842f.getRatingAppearance().getProgressStarColor(), PorterDuff.Mode.SRC_ATOP);
        layerDrawable.getDrawable(1).setColorFilter(this.f27842f.getRatingAppearance().getBackgroundStarColor(), PorterDuff.Mode.SRC_ATOP);
        layerDrawable.getDrawable(0).setColorFilter(this.f27842f.getRatingAppearance().getBackgroundStarColor(), PorterDuff.Mode.SRC_ATOP);
        this.f27843g.setTypeface(Typeface.create(this.f27842f.getAgeAppearance().getFontFamilyName(), this.f27842f.getAgeAppearance().getFontStyle()));
        this.f27843g.setTextColor(this.f27842f.getAgeAppearance().getTextColor());
        this.f27843g.setTextSize(2, this.f27842f.getAgeAppearance().getTextSize());
        this.f27844h.setTypeface(Typeface.create(this.f27842f.getBodyAppearance().getFontFamilyName(), this.f27842f.getBodyAppearance().getFontStyle()));
        this.f27844h.setTextColor(this.f27842f.getBodyAppearance().getTextColor());
        this.f27844h.setTextSize(2, this.f27842f.getBodyAppearance().getTextSize());
        this.f27846j.setTypeface(Typeface.create(this.f27842f.getDomainAppearance().getFontFamilyName(), this.f27842f.getDomainAppearance().getFontStyle()));
        this.f27846j.setTextColor(this.f27842f.getDomainAppearance().getTextColor());
        this.f27846j.setTextSize(2, this.f27842f.getDomainAppearance().getTextSize());
        this.f27854r.setTypeface(Typeface.create(this.f27842f.getReviewCountAppearance().getFontFamilyName(), this.f27842f.getReviewCountAppearance().getFontStyle()));
        this.f27854r.setTextColor(this.f27842f.getReviewCountAppearance().getTextColor());
        this.f27854r.setTextSize(2, this.f27842f.getReviewCountAppearance().getTextSize());
        this.f27849m.setTypeface(Typeface.create(this.f27842f.getSponsoredAppearance().getFontFamilyName(), this.f27842f.getSponsoredAppearance().getFontStyle()));
        this.f27849m.setTextColor(this.f27842f.getSponsoredAppearance().getTextColor());
        this.f27849m.setTextSize(2, this.f27842f.getSponsoredAppearance().getTextSize());
        this.f27850n.setTypeface(Typeface.create(this.f27842f.getTitleAppearance().getFontFamilyName(), this.f27842f.getTitleAppearance().getFontStyle()));
        this.f27850n.setTextColor(this.f27842f.getTitleAppearance().getTextColor());
        this.f27850n.setTextSize(2, this.f27842f.getTitleAppearance().getTextSize());
        this.f27851o.setTypeface(Typeface.create(this.f27842f.getWarningAppearance().getFontFamilyName(), this.f27842f.getWarningAppearance().getFontStyle()));
        this.f27851o.setTextColor(this.f27842f.getWarningAppearance().getTextColor());
        this.f27851o.setTextSize(2, this.f27842f.getWarningAppearance().getTextSize());
        invalidate();
        requestLayout();
    }

    private void p() {
        this.f27842f = new NativeTemplateAppearance.Builder().build();
        ImageView imageView = new ImageView(getContext());
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.f27856t = imageView;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.f27859w = linearLayout2;
        linearLayout2.setOrientation(0);
        this.f27859w.setGravity(17);
        this.f27859w.setWeightSum(4.0f);
        View view = new View(getContext());
        view.setLayoutParams(new LinearLayout.LayoutParams(0, 0, 1.0f));
        LinearLayout linearLayout3 = new LinearLayout(getContext());
        linearLayout3.setGravity(17);
        linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 2.0f));
        f fVar = new f(getContext());
        fVar.setEllipsize(TextUtils.TruncateAt.END);
        fVar.setMaxLines(1);
        fVar.setGravity(17);
        fVar.setPadding(0, 0, 0, eh1.a(getContext(), 4.0f));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        fVar.setLayoutParams(layoutParams);
        this.f27849m = fVar;
        linearLayout3.addView(fVar);
        LinearLayout linearLayout4 = new LinearLayout(getContext());
        linearLayout4.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView textView = new TextView(getContext());
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        textView.setGravity(8388611);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.rightMargin = this.f27839c;
        textView.setLayoutParams(layoutParams2);
        this.f27843g = textView;
        linearLayout4.addView(textView);
        this.f27859w.addView(linearLayout4);
        this.f27859w.addView(linearLayout3);
        this.f27859w.addView(view);
        LinearLayout linearLayout5 = this.f27859w;
        LinearLayout linearLayout6 = new LinearLayout(getContext());
        this.f27860x = linearLayout6;
        linearLayout6.setOrientation(0);
        this.f27860x.setBaselineAligned(false);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.topMargin = this.f27839c;
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(layoutParams3);
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setAdjustViewBounds(true);
        imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.f27852p = imageView2;
        ImageView imageView3 = new ImageView(getContext());
        imageView3.setAdjustViewBounds(true);
        imageView3.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.f27848l = imageView3;
        ImageView imageView4 = new ImageView(getContext());
        imageView4.setAdjustViewBounds(true);
        imageView4.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.f27855s = imageView4;
        frameLayout.addView(this.f27852p);
        frameLayout.addView(this.f27848l);
        frameLayout.addView(this.f27855s);
        LinearLayout linearLayout7 = new LinearLayout(getContext());
        linearLayout7.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout7.setOrientation(1);
        TextView textView2 = new TextView(getContext());
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setMaxLines(2);
        textView2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.f27850n = textView2;
        TextView textView3 = new TextView(getContext());
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setMaxLines(3);
        textView3.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.f27844h = textView3;
        TextView textView4 = new TextView(getContext());
        textView4.setEllipsize(TextUtils.TruncateAt.END);
        textView4.setMaxLines(1);
        textView4.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.f27846j = textView4;
        linearLayout7.addView(this.f27850n);
        linearLayout7.addView(this.f27844h);
        linearLayout7.addView(this.f27846j);
        LinearLayout linearLayout8 = new LinearLayout(getContext());
        this.f27861y = linearLayout8;
        linearLayout8.setOrientation(0);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = this.f27840d;
        this.f27861y.setLayoutParams(layoutParams4);
        LinearLayout linearLayout9 = new LinearLayout(getContext());
        linearLayout9.setOrientation(1);
        linearLayout9.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        lu0 lu0Var = new lu0(getContext(), null, R.attr.ratingBarStyleSmall);
        lu0Var.setNumStars(5);
        lu0Var.setStepSize(0.5f);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.rightMargin = this.f27840d;
        lu0Var.setLayoutParams(layoutParams5);
        this.f27853q = lu0Var;
        TextView textView5 = new TextView(getContext());
        textView5.setEllipsize(TextUtils.TruncateAt.END);
        textView5.setMaxLines(1);
        textView5.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.f27854r = textView5;
        linearLayout9.addView(this.f27853q);
        linearLayout9.addView(this.f27854r);
        LinearLayout linearLayout10 = new LinearLayout(getContext());
        linearLayout10.setOrientation(0);
        linearLayout10.setGravity(5);
        linearLayout10.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        Button button = new Button(getContext(), null, R.attr.borderlessButtonStyle);
        button.setEllipsize(TextUtils.TruncateAt.END);
        button.setMaxLines(1);
        button.setTransformationMethod(null);
        int iA = eh1.a(getContext(), 26.0f);
        button.setMinimumHeight(iA);
        button.setMinHeight(iA);
        button.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.f27845i = button;
        linearLayout10.addView(button);
        this.f27861y.addView(linearLayout9);
        this.f27861y.addView(linearLayout10);
        linearLayout7.addView(this.f27861y);
        this.f27860x.addView(frameLayout);
        this.f27860x.addView(linearLayout7);
        LinearLayout linearLayout11 = this.f27860x;
        LinearLayout linearLayout12 = new LinearLayout(getContext());
        linearLayout12.setOrientation(0);
        linearLayout12.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.A = linearLayout12;
        ImageView imageView5 = new ImageView(getContext());
        imageView5.setAdjustViewBounds(true);
        imageView5.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView5.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.f27862z = imageView5;
        this.A.addView(imageView5);
        LinearLayout linearLayout13 = this.A;
        LinearLayout linearLayout14 = new LinearLayout(getContext());
        linearLayout14.setOrientation(0);
        linearLayout14.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.C = linearLayout14;
        MediaView mediaView = new MediaView(getContext());
        mediaView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.B = mediaView;
        this.C.addView(mediaView);
        LinearLayout linearLayout15 = this.C;
        TextView textView6 = new TextView(getContext());
        textView6.setEllipsize(TextUtils.TruncateAt.END);
        this.f27851o = textView6;
        linearLayout.addView(linearLayout5);
        linearLayout.addView(linearLayout11);
        linearLayout.addView(linearLayout13);
        linearLayout.addView(linearLayout15);
        linearLayout.addView(textView6);
        this.f27857u = linearLayout;
        int iA2 = eh1.a(getContext(), this.f27842f.getBannerAppearance().getContentPadding().getRight()) - this.f27840d;
        xu xuVar = new xu(getContext());
        this.f27858v = new qu(getContext()).a();
        ImageView imageViewA = xuVar.a(iA2, this.f27839c);
        this.f27847k = imageViewA;
        this.f27858v.addView(imageViewA);
        this.f27858v.setVisibility(8);
        addView(this.f27856t, new ViewGroup.LayoutParams(-1, -2));
        addView(this.f27857u, new ViewGroup.LayoutParams(-1, -1));
        addView(this.f27858v);
        this.f27856t.setVisibility(8);
        this.f27857u.setVisibility(8);
        this.I = new com.yandex.mobile.ads.nativeads.template.b(this.f27855s, this.f27852p, this.f27848l, this.f27862z, this.f27856t);
        a();
    }

    public void applyAppearance(NativeTemplateAppearance nativeTemplateAppearance) {
        if (nativeTemplateAppearance == null || nativeTemplateAppearance.equals(this.f27842f)) {
            return;
        }
        this.f27842f = nativeTemplateAppearance;
        a();
    }

    public final TextView b() {
        return this.f27843g;
    }

    public final TextView c() {
        return this.f27844h;
    }

    public final Button d() {
        return this.f27845i;
    }

    public final TextView e() {
        return this.f27846j;
    }

    public final ImageView f() {
        return this.f27855s;
    }

    public final ImageView g() {
        return this.f27847k;
    }

    public final ImageView h() {
        return this.f27852p;
    }

    public final ImageView i() {
        NativeAdImage image;
        ImageView imageView = this.f27848l;
        if (this.G == null || (image = this.E.getImage()) == null) {
            return imageView;
        }
        Objects.requireNonNull(this.G);
        if ("fill".equals(image.a())) {
            return this.f27856t;
        }
        Objects.requireNonNull(this.G);
        return d.a(image) ? this.f27862z : imageView;
    }

    public final MediaView j() {
        return this.B;
    }

    public final lu0 k() {
        return this.f27853q;
    }

    public final TextView l() {
        return this.f27854r;
    }

    public final TextView m() {
        return this.f27849m;
    }

    public final TextView n() {
        return this.f27850n;
    }

    public final TextView o() {
        return this.f27851o;
    }

    @Override // com.yandex.mobile.ads.nativeads.n, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NativeAd nativeAd = this.H;
        if (nativeAd != null) {
            nativeAd.addImageLoadingListener(this.J);
        }
    }

    @Override // com.yandex.mobile.ads.nativeads.n, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        NativeAd nativeAd = this.H;
        if (nativeAd != null) {
            nativeAd.removeImageLoadingListener(this.J);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        LinearLayout.LayoutParams layoutParams;
        int iRound;
        int iRound2;
        com.yandex.mobile.ads.nativeads.template.a c0214a;
        com.yandex.mobile.ads.nativeads.template.a.c cVar;
        com.yandex.mobile.ads.nativeads.template.a c0214a2;
        com.yandex.mobile.ads.nativeads.template.a c0214a3;
        if (this.G != null) {
            int size = View.MeasureSpec.getSize(i10);
            float borderWidth = this.f27842f.getBannerAppearance().getBorderWidth();
            hp hpVar = this.f27838b;
            Context context = getContext();
            Objects.requireNonNull(hpVar);
            int iA = size - (hp.a(context, borderWidth) * 2);
            if (iA < 0) {
                iA = 0;
            }
            d dVar = this.G;
            Context context2 = getContext();
            int iA2 = eh1.a(context2, this.f27842f.getBannerAppearance().getContentPadding().getLeft());
            int iA3 = y11.a(context2, 1, this.f27842f.getBannerAppearance().getContentPadding().getRight());
            if (dVar.b() || dVar.c() || dVar.f()) {
                int iRound3 = Math.round((iA - iA2) - iA3);
                int iRound4 = Math.round(TypedValue.applyDimension(1, iA2, context2.getResources().getDisplayMetrics())) + eh1.a(getContext(), this.f27842f.getBannerAppearance().getImageMargins().getLeft());
                int iA4 = eh1.a(getContext(), this.f27842f.getBannerAppearance().getImageMargins().getRight());
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(0, 0);
                if (dVar.b()) {
                    NativeAdImage favicon = this.E.getFavicon();
                    int width = favicon.getWidth();
                    int height = favicon.getHeight();
                    SizeConstraint widthConstraint = this.f27842f.getFaviconAppearance().getWidthConstraint();
                    int i12 = b.f27864a[widthConstraint.getSizeConstraintType().ordinal()];
                    if (i12 == 1) {
                        c0214a3 = new com.yandex.mobile.ads.nativeads.template.a.C0214a(widthConstraint.getValue());
                    } else if (i12 != 2) {
                        c0214a3 = i12 != 3 ? new com.yandex.mobile.ads.nativeads.template.a.c(widthConstraint.getValue()) : new com.yandex.mobile.ads.nativeads.template.a.c(widthConstraint.getValue());
                    } else {
                        c0214a3 = new com.yandex.mobile.ads.nativeads.template.a.b(widthConstraint.getValue());
                    }
                    com.yandex.mobile.ads.nativeads.template.a.d dVarA = c0214a3.a(getContext(), iRound3, width, height);
                    int iA5 = eh1.a(getContext(), 5.0f);
                    FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(dVarA.b(), dVarA.a());
                    layoutParams3.leftMargin = iRound4;
                    layoutParams3.rightMargin = iA5;
                    layoutParams2 = layoutParams3;
                }
                this.f27855s.setLayoutParams(layoutParams2);
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(0, 0);
                if (dVar.c()) {
                    NativeAdImage icon = this.E.getIcon();
                    int width2 = icon.getWidth();
                    int height2 = icon.getHeight();
                    SizeConstraint widthConstraint2 = this.f27842f.getImageAppearance().getWidthConstraint();
                    int i13 = b.f27864a[widthConstraint2.getSizeConstraintType().ordinal()];
                    if (i13 == 1) {
                        c0214a2 = new com.yandex.mobile.ads.nativeads.template.a.C0214a(widthConstraint2.getValue());
                    } else if (i13 != 2) {
                        c0214a2 = i13 != 3 ? new com.yandex.mobile.ads.nativeads.template.a.c(widthConstraint2.getValue()) : new com.yandex.mobile.ads.nativeads.template.a.c(widthConstraint2.getValue());
                    } else {
                        c0214a2 = new com.yandex.mobile.ads.nativeads.template.a.b(widthConstraint2.getValue());
                    }
                    com.yandex.mobile.ads.nativeads.template.a.d dVarA2 = c0214a2.a(getContext(), iRound3, width2, height2);
                    FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(dVarA2.b(), dVarA2.a());
                    layoutParams5.leftMargin = iRound4;
                    layoutParams5.rightMargin = iA4;
                    layoutParams4 = layoutParams5;
                }
                this.f27852p.setLayoutParams(layoutParams4);
                FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(0, 0);
                if (dVar.f()) {
                    NativeAdImage image = this.E.getImage();
                    int width3 = image.getWidth();
                    int height3 = image.getHeight();
                    SizeConstraint widthConstraint3 = this.f27842f.getImageAppearance().getWidthConstraint();
                    int i14 = b.f27864a[widthConstraint3.getSizeConstraintType().ordinal()];
                    if (i14 == 1) {
                        c0214a = new com.yandex.mobile.ads.nativeads.template.a.C0214a(widthConstraint3.getValue());
                    } else if (i14 == 2) {
                        c0214a = new com.yandex.mobile.ads.nativeads.template.a.b(widthConstraint3.getValue());
                    } else if (i14 != 3) {
                        c0214a = cVar;
                        cVar = new com.yandex.mobile.ads.nativeads.template.a.c(widthConstraint3.getValue());
                    } else {
                        c0214a = cVar;
                        cVar = new com.yandex.mobile.ads.nativeads.template.a.c(widthConstraint3.getValue());
                    }
                    com.yandex.mobile.ads.nativeads.template.a.d dVarA3 = c0214a.a(getContext(), iRound3, width3, height3);
                    layoutParams6 = new FrameLayout.LayoutParams(dVarA3.b(), dVarA3.a());
                    layoutParams6.leftMargin = iRound4;
                    layoutParams6.rightMargin = iA4;
                }
                this.f27848l.setLayoutParams(layoutParams6);
                layoutParams = (LinearLayout.LayoutParams) this.f27860x.getLayoutParams();
                layoutParams.leftMargin = 0;
            } else {
                FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(0, 0);
                this.f27855s.setLayoutParams(layoutParams7);
                this.f27852p.setLayoutParams(layoutParams7);
                this.f27848l.setLayoutParams(layoutParams7);
                layoutParams = (LinearLayout.LayoutParams) this.f27860x.getLayoutParams();
                layoutParams.leftMargin = iA2;
            }
            this.f27860x.setLayoutParams(layoutParams);
            LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(0, 0);
            if (dVar.d()) {
                NativeAdImage image2 = this.E.getImage();
                int width4 = image2.getWidth();
                int height4 = image2.getHeight();
                float width5 = image2.getWidth();
                float height5 = image2.getHeight();
                if (height5 != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && width5 / height5 < 1.0f) {
                    iRound2 = Math.round((iA * 3) / 4);
                    iRound = Math.round((iRound2 / height4) * width4);
                } else {
                    if (width4 != 0) {
                        height4 = Math.round(height4 * (iA / width4));
                    }
                    iRound = iA;
                    iRound2 = height4;
                }
                float width6 = image2.getWidth();
                float height6 = image2.getHeight();
                if (!(height6 != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && width6 / height6 > 1.5f)) {
                    iRound2 = Math.round(iRound2 * 0.8f);
                }
                layoutParams8 = new LinearLayout.LayoutParams(iRound, iRound2);
                layoutParams8.topMargin = (this.F.a() || this.F.d()) ? this.f27839c : 0;
                layoutParams8.gravity = 1;
            }
            this.A.setLayoutParams(layoutParams8);
            d dVar2 = this.G;
            LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(0, 0);
            NativeAdMedia media = this.E.getMedia();
            if (media != null && dVar2.e()) {
                layoutParams9 = new LinearLayout.LayoutParams(iA, new oa(media.getAspectRatio()).a(iA));
            }
            this.C.setLayoutParams(layoutParams9);
            if (this.F.f()) {
                if (this.F.g()) {
                    ((ViewManager) this.f27861y.getParent()).removeView(this.f27861y);
                    LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams10.topMargin = this.F.c() ? this.f27841e : this.f27839c;
                    layoutParams10.bottomMargin = this.f27840d;
                    this.f27861y.setLayoutParams(layoutParams10);
                    this.f27861y.setPadding(eh1.a(getContext(), this.f27842f.getBannerAppearance().getContentPadding().getLeft()), 0, eh1.a(getContext(), this.f27842f.getBannerAppearance().getContentPadding().getRight()), 0);
                    LinearLayout linearLayout = this.f27857u;
                    linearLayout.addView(this.f27861y, linearLayout.getChildCount() - 1);
                } else {
                    ((ViewManager) this.f27861y.getParent()).removeView(this.f27861y);
                    this.f27861y.setPadding(0, 0, 0, 0);
                    LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(-1, -2);
                    int i15 = this.f27840d;
                    layoutParams11.topMargin = i15;
                    layoutParams11.bottomMargin = i15;
                    ((ViewManager) this.f27846j.getParent()).addView(this.f27861y, layoutParams11);
                }
                this.f27845i.setLayoutParams(this.F.b() ? new LinearLayout.LayoutParams(-1, -2) : new LinearLayout.LayoutParams(-2, -2));
            } else {
                this.f27861y.setLayoutParams(new LinearLayout.LayoutParams(0, 0));
            }
            int iRound5 = Math.round(iA * 0.4f);
            this.f27845i.setMinWidth(iRound5);
            this.f27845i.setMinimumWidth(iRound5);
            if (this.F.h()) {
                TextView textView = this.f27851o;
                textView.setBackgroundColor(this.F.i() ? 0 : eh1.a(textView.getCurrentTextColor(), 92.0f));
                this.f27851o.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            }
        }
        super.onMeasure(i10, i11);
    }

    public final void q() {
        NativeAdImage image;
        int i10 = 0;
        if (this.G != null && (image = this.E.getImage()) != null) {
            Objects.requireNonNull(this.G);
            if ("fill".equals(image.a())) {
                this.f27856t.setVisibility(0);
                i10 = 8;
            }
            Objects.requireNonNull(this.G);
            if (d.a(image)) {
                if (!this.F.a()) {
                    this.f27860x.setVisibility(8);
                }
                if (!this.F.d()) {
                    this.f27859w.setVisibility(8);
                }
            }
        }
        this.f27857u.setVisibility(i10);
    }

    public void setAd(NativeAd nativeAd) {
        NativeAd nativeAd2 = this.H;
        if (nativeAd2 != nativeAd) {
            if (nativeAd2 != null) {
                try {
                    nativeAd2.removeImageLoadingListener(this.J);
                } catch (NativeAdException e10) {
                    x60.c(e10.getMessage(), new Object[0]);
                    return;
                }
            }
            nativeAd.addImageLoadingListener(this.J);
            this.D = nativeAd.getAdType();
            NativeAdAssets adAssets = nativeAd.getAdAssets();
            this.E = adAssets;
            this.F = new e(adAssets, this.D);
            this.G = new d(this.E, this.D);
            new mu(getContext(), this.E).a(this.f27847k, this.f27858v, this.f27841e);
            ((u) nativeAd).a(this);
            q();
            this.H = nativeAd;
        }
    }
}
