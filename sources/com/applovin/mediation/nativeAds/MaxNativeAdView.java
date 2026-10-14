package com.applovin.mediation.nativeAds;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.applovin.impl.mediation.a.d;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.ads.b;
import com.applovin.impl.sdk.nativeAd.AppLovinStarRatingView;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.R;
import i.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ViewConstructor"})
public class MaxNativeAdView extends FrameLayout {
    public static final String MEDIUM_TEMPLATE_1 = "medium_template_1";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f11514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextView f11515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TextView f11516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TextView f11517d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Button f11518e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ImageView f11519f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final FrameLayout f11520g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ViewGroup f11521h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final FrameLayout f11522i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ViewGroup f11523j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ViewGroup f11524k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final FrameLayout f11525l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private b f11526m;

    public MaxNativeAdView(MaxNativeAd maxNativeAd, Activity activity) {
        this(maxNativeAd, (String) null, activity);
    }

    public MaxNativeAdView(MaxNativeAd maxNativeAd, MaxNativeAdViewBinder maxNativeAdViewBinder, Context context) {
        super(context);
        boolean z10 = maxNativeAdViewBinder.templateType != null;
        MaxAdFormat format = maxNativeAd != null ? maxNativeAd.getFormat() : MaxAdFormat.NATIVE;
        View view = maxNativeAdViewBinder.mainView;
        if (view != null) {
            this.f11514a = view;
        } else {
            this.f11514a = LayoutInflater.from(context).inflate(z10 ? a(maxNativeAdViewBinder.templateType, format) : maxNativeAdViewBinder.layoutResourceId, (ViewGroup) this, false);
        }
        addView(this.f11514a);
        this.f11515b = (TextView) findViewById(maxNativeAdViewBinder.titleTextViewId);
        this.f11516c = (TextView) findViewById(maxNativeAdViewBinder.advertiserTextViewId);
        this.f11517d = (TextView) findViewById(maxNativeAdViewBinder.bodyTextViewId);
        this.f11518e = (Button) findViewById(maxNativeAdViewBinder.callToActionButtonId);
        this.f11519f = (ImageView) findViewById(maxNativeAdViewBinder.iconImageViewId);
        this.f11520g = (FrameLayout) findViewById(maxNativeAdViewBinder.iconContentViewId);
        this.f11521h = (ViewGroup) findViewById(maxNativeAdViewBinder.optionsContentViewGroupId);
        this.f11522i = (FrameLayout) findViewById(maxNativeAdViewBinder.optionsContentFrameLayoutId);
        this.f11523j = (ViewGroup) findViewById(maxNativeAdViewBinder.starRatingContentViewGroupId);
        this.f11524k = (ViewGroup) findViewById(maxNativeAdViewBinder.mediaContentViewGroupId);
        this.f11525l = (FrameLayout) findViewById(maxNativeAdViewBinder.mediaContentFrameLayoutId);
        if (maxNativeAd != null) {
            a(maxNativeAd);
        }
    }

    @Deprecated
    public MaxNativeAdView(MaxNativeAd maxNativeAd, String str, Activity activity) {
        this(maxNativeAd, str, activity.getApplicationContext());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaxNativeAdView(MaxNativeAd maxNativeAd, String str, Context context) {
        MaxNativeAdViewBinder.Builder iconContentViewId = new MaxNativeAdViewBinder.Builder(-1).setTemplateType(str).setTitleTextViewId(R.id.applovin_native_title_text_view).setAdvertiserTextViewId(R.id.applovin_native_advertiser_text_view).setBodyTextViewId(R.id.applovin_native_body_text_view).setCallToActionButtonId(R.id.applovin_native_cta_button).setIconImageViewId(R.id.applovin_native_icon_image_view).setIconContentViewId(R.id.applovin_native_icon_view);
        int i10 = R.id.applovin_native_options_view;
        MaxNativeAdViewBinder.Builder starRatingContentViewGroupId = iconContentViewId.setOptionsContentViewGroupId(i10).setOptionsContentFrameLayoutId(i10).setStarRatingContentViewGroupId(R.id.applovin_native_star_rating_view);
        int i11 = R.id.applovin_native_media_content_view;
        this(maxNativeAd, starRatingContentViewGroupId.setMediaContentViewGroupId(i11).setMediaContentFrameLayoutId(i11).build(), context);
    }

    public MaxNativeAdView(MaxNativeAdViewBinder maxNativeAdViewBinder, Context context) {
        this((MaxNativeAd) null, maxNativeAdViewBinder, context);
    }

    public MaxNativeAdView(String str, Context context) {
        this((MaxNativeAd) null, str, context);
    }

    private int a(String str, MaxAdFormat maxAdFormat) {
        if (maxAdFormat == MaxAdFormat.NATIVE) {
            if ("small_template_1".equalsIgnoreCase(str)) {
                return R.layout.max_native_ad_small_template_1;
            }
            if (MEDIUM_TEMPLATE_1.equalsIgnoreCase(str)) {
                return R.layout.max_native_ad_medium_template_1;
            }
            throw new IllegalArgumentException(f.a("Attempting to render MAX native ad with invalid format: ", str));
        }
        if (maxAdFormat == MaxAdFormat.BANNER) {
            if ("vertical_banner_template".equals(str)) {
                return R.layout.max_native_ad_vertical_banner_view;
            }
            if ("media_banner_template".equals(str) || "no_body_banner_template".equals(str)) {
                return R.layout.max_native_ad_media_banner_view;
            }
            return "vertical_media_banner_template".equals(str) ? R.layout.max_native_ad_vertical_media_banner_view : R.layout.max_native_ad_banner_view;
        }
        if (maxAdFormat == MaxAdFormat.LEADER) {
            return "vertical_leader_template".equals(str) ? R.layout.max_native_ad_vertical_leader_view : R.layout.max_native_ad_leader_view;
        }
        if (maxAdFormat == MaxAdFormat.MREC) {
            return R.layout.max_native_ad_mrec_view;
        }
        throw new IllegalArgumentException("Unsupported ad format: " + maxAdFormat);
    }

    private void a() {
        final ViewGroup viewGroup = (ViewGroup) findViewById(R.id.applovin_native_inner_parent_layout);
        if (viewGroup == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            final WeakReference weakReference = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.applovin.mediation.nativeAds.MaxNativeAdView.3
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    ViewTreeObserver viewTreeObserver2 = (ViewTreeObserver) weakReference.get();
                    if (viewTreeObserver2 == null || !viewTreeObserver2.isAlive()) {
                        o oVarA = AppLovinSdk.getInstance(MaxNativeAdView.this.getContext()).a();
                        oVarA.F();
                        if (y.a()) {
                            oVarA.F().d("MaxNativeAdView", "Failed to remove onPreDrawListener since the view tree observer is not alive.");
                        }
                    } else {
                        viewTreeObserver2.removeOnPreDrawListener(this);
                    }
                    weakReference.clear();
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) viewGroup.getLayoutParams();
                    layoutParams.height = ((View) viewGroup.getParent()).getWidth();
                    viewGroup.setLayoutParams(layoutParams);
                    return true;
                }
            });
        }
    }

    private void a(MaxNativeAd maxNativeAd) {
        if (this.f11515b == null) {
            y.h("MaxNativeAdView", "Rendering template ad view without title text view");
        } else if (StringUtils.isValidString(maxNativeAd.getTitle())) {
            this.f11515b.setText(maxNativeAd.getTitle());
        } else {
            this.f11515b.setVisibility(8);
        }
        if (this.f11516c != null) {
            if (StringUtils.isValidString(maxNativeAd.getAdvertiser())) {
                this.f11516c.setText(maxNativeAd.getAdvertiser());
            } else {
                this.f11516c.setVisibility(8);
            }
        }
        if (this.f11517d != null) {
            if (StringUtils.isValidString(maxNativeAd.getBody())) {
                this.f11517d.setText(maxNativeAd.getBody());
            } else if (maxNativeAd.getFormat() == MaxAdFormat.NATIVE || maxNativeAd.getFormat() == MaxAdFormat.MREC) {
                this.f11517d.setVisibility(8);
            } else {
                this.f11517d.setVisibility(4);
            }
        }
        if (this.f11518e != null) {
            if (StringUtils.isValidString(maxNativeAd.getCallToAction())) {
                this.f11518e.setText(maxNativeAd.getCallToAction());
            } else if (maxNativeAd.getFormat() == MaxAdFormat.NATIVE || maxNativeAd.getFormat() == MaxAdFormat.MREC) {
                this.f11518e.setVisibility(8);
            } else {
                this.f11518e.setVisibility(4);
            }
        }
        MaxNativeAd.MaxNativeAdImage icon = maxNativeAd.getIcon();
        View iconView = maxNativeAd.getIconView();
        FrameLayout frameLayout = this.f11520g;
        if (frameLayout != null) {
            if (icon == null || this.f11519f == null) {
                if (iconView != null) {
                    iconView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    this.f11520g.removeAllViews();
                    this.f11520g.addView(iconView);
                } else {
                    frameLayout.setVisibility(8);
                }
            } else if (icon.getDrawable() != null) {
                this.f11519f.setImageDrawable(icon.getDrawable());
            } else if (icon.getUri() == null || !StringUtils.isValidString(icon.getUri().toString())) {
                this.f11520g.setVisibility(8);
            } else {
                this.f11519f.setImageURI(icon.getUri());
            }
        }
        View optionsView = maxNativeAd.getOptionsView();
        FrameLayout frameLayout2 = this.f11522i;
        if (frameLayout2 != null && optionsView != null) {
            optionsView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.f11522i.addView(optionsView);
            this.f11522i.bringToFront();
        } else if (frameLayout2 != null) {
            frameLayout2.setVisibility(8);
        }
        View mediaView = maxNativeAd.getMediaView();
        if (this.f11525l != null) {
            if (mediaView != null) {
                mediaView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f11525l.addView(mediaView);
            } else if (maxNativeAd.getFormat() == MaxAdFormat.LEADER) {
                this.f11525l.setVisibility(8);
            }
        }
        if (this.f11523j != null) {
            Double starRating = maxNativeAd.getStarRating();
            if (starRating != null) {
                this.f11523j.removeAllViews();
                AppLovinStarRatingView appLovinStarRatingView = new AppLovinStarRatingView(starRating, getContext());
                appLovinStarRatingView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f11523j.addView(appLovinStarRatingView);
            } else {
                this.f11523j.setVisibility(8);
            }
        }
        a();
        postDelayed(new Runnable() { // from class: com.applovin.mediation.nativeAds.MaxNativeAdView.2
            @Override // java.lang.Runnable
            public void run() {
                MaxNativeAdView.this.setSelected(true);
            }
        }, 2000L);
    }

    public b getAdViewTracker() {
        return this.f11526m;
    }

    public TextView getAdvertiserTextView() {
        return this.f11516c;
    }

    public TextView getBodyTextView() {
        return this.f11517d;
    }

    public Button getCallToActionButton() {
        return this.f11518e;
    }

    public List<View> getClickableViews() {
        ArrayList arrayList = new ArrayList(5);
        TextView textView = this.f11515b;
        if (textView != null) {
            arrayList.add(textView);
        }
        TextView textView2 = this.f11516c;
        if (textView2 != null) {
            arrayList.add(textView2);
        }
        TextView textView3 = this.f11517d;
        if (textView3 != null) {
            arrayList.add(textView3);
        }
        Button button = this.f11518e;
        if (button != null) {
            arrayList.add(button);
        }
        ImageView imageView = this.f11519f;
        if (imageView != null) {
            arrayList.add(imageView);
        }
        return arrayList;
    }

    @Deprecated
    public FrameLayout getIconContentView() {
        return this.f11520g;
    }

    public ImageView getIconImageView() {
        return this.f11519f;
    }

    public View getMainView() {
        return this.f11514a;
    }

    @Deprecated
    public FrameLayout getMediaContentView() {
        return this.f11525l;
    }

    public ViewGroup getMediaContentViewGroup() {
        ViewGroup viewGroup = this.f11524k;
        return viewGroup != null ? viewGroup : this.f11525l;
    }

    @Deprecated
    public FrameLayout getOptionsContentView() {
        return this.f11522i;
    }

    public ViewGroup getOptionsContentViewGroup() {
        ViewGroup viewGroup = this.f11521h;
        return viewGroup != null ? viewGroup : this.f11522i;
    }

    public ViewGroup getStarRatingContentViewGroup() {
        return this.f11523j;
    }

    public TextView getTitleTextView() {
        return this.f11515b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b bVar = this.f11526m;
        if (bVar != null) {
            bVar.b();
        }
        if (isHardwareAccelerated()) {
            return;
        }
        y.h("MaxNativeAdView", "Attached to non-hardware accelerated window: some native ad views require hardware accelerated Activities to render properly.");
    }

    public void recycle() {
        setOnClickListener(null);
        b bVar = this.f11526m;
        if (bVar != null) {
            bVar.a();
            this.f11526m = null;
        }
        View view = this.f11514a;
        if (view == null || view.getParent() == this) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) this.f11514a.getParent();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            removeView(viewGroup);
        }
        addView(this.f11514a);
    }

    public void render(d dVar, a.InterfaceC0121a interfaceC0121a, o oVar) {
        recycle();
        if (!dVar.N().get() || !dVar.M().get()) {
            this.f11526m = new b(dVar, this, interfaceC0121a, oVar);
        }
        final MaxNativeAd nativeAd = dVar.getNativeAd();
        if (dVar.K() && nativeAd.isContainerClickable()) {
            oVar.F();
            if (y.a()) {
                oVar.F().b("MaxNativeAdView", "Enabling container click");
            }
            setOnClickListener(new View.OnClickListener() { // from class: com.applovin.mediation.nativeAds.MaxNativeAdView.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    nativeAd.performClick();
                }
            });
        }
        boolean zIsValidString = StringUtils.isValidString(dVar.J());
        oVar.F();
        if (zIsValidString) {
            if (y.a()) {
                oVar.F().b("MaxNativeAdView", "Rendering template ad view");
            }
            a(nativeAd);
        } else {
            if (y.a()) {
                oVar.F().b("MaxNativeAdView", "Rendering custom ad view");
            }
            renderCustomNativeAdView(nativeAd);
        }
    }

    public void renderCustomNativeAdView(MaxNativeAd maxNativeAd) {
        TextView textView = this.f11515b;
        if (textView != null) {
            textView.setText(maxNativeAd.getTitle());
        }
        TextView textView2 = this.f11517d;
        if (textView2 != null) {
            textView2.setText(maxNativeAd.getBody());
        }
        TextView textView3 = this.f11516c;
        if (textView3 != null) {
            textView3.setText(maxNativeAd.getAdvertiser());
        }
        Button button = this.f11518e;
        if (button != null) {
            button.setText(maxNativeAd.getCallToAction());
        }
        MaxNativeAd.MaxNativeAdImage icon = maxNativeAd.getIcon();
        ImageView imageView = this.f11519f;
        if (imageView != null) {
            if (icon == null) {
                imageView.setImageDrawable(null);
            } else if (icon.getDrawable() != null) {
                this.f11519f.setImageDrawable(icon.getDrawable());
            } else if (icon.getUri() != null) {
                this.f11519f.setImageURI(icon.getUri());
            } else {
                this.f11519f.setImageDrawable(null);
            }
        }
        View mediaView = maxNativeAd.getMediaView();
        ViewGroup viewGroup = this.f11524k;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            if (mediaView != null) {
                ViewParent parent = mediaView.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeAllViews();
                }
                mediaView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f11524k.addView(mediaView);
            }
        }
        View optionsView = maxNativeAd.getOptionsView();
        ViewGroup viewGroup2 = this.f11521h;
        if (viewGroup2 != null) {
            viewGroup2.removeAllViews();
            if (optionsView != null) {
                ViewParent parent2 = optionsView.getParent();
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeAllViews();
                }
                optionsView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f11521h.addView(optionsView);
                this.f11521h.bringToFront();
            }
        }
        ViewGroup viewGroup3 = this.f11523j;
        if (viewGroup3 != null) {
            viewGroup3.removeAllViews();
            Double starRating = maxNativeAd.getStarRating();
            if (starRating != null) {
                AppLovinStarRatingView appLovinStarRatingView = new AppLovinStarRatingView(starRating, getContext());
                appLovinStarRatingView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f11523j.addView(appLovinStarRatingView);
            }
        }
    }
}
