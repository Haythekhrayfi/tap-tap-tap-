package com.applovin.exoplayer2.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import ch.qos.logback.classic.Level;
import com.applovin.exoplayer2.ac;
import com.applovin.exoplayer2.ak;
import com.applovin.exoplayer2.an;
import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.common.a.s;
import com.applovin.exoplayer2.h.ad;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.u;
import com.applovin.sdk.R;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class g extends FrameLayout {
    private boolean A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f8104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AspectRatioFrameLayout f8105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final View f8106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final View f8107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f8108e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ImageView f8109f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final SubtitleView f8110g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final View f8111h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final TextView f8112i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final f f8113j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final FrameLayout f8114k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final FrameLayout f8115l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private an f8116m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f8117n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private f.d f8118o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f8119p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Drawable f8120q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f8121r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f8122s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private com.applovin.exoplayer2.l.k<? super ak> f8123t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private CharSequence f8124u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f8125v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f8126w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f8127x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f8128y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f8129z;

    public final class a implements View.OnClickListener, View.OnLayoutChangeListener, an.d, f.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ba.a f8131b = new ba.a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object f8132c;

        public a() {
        }

        @Override // com.applovin.exoplayer2.an.d
        public void a() {
            if (g.this.f8106c != null) {
                g.this.f8106c.setVisibility(4);
            }
        }

        @Override // com.applovin.exoplayer2.ui.f.d
        public void a(int i10) {
            g.this.m();
        }

        @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
        public void a(an.e eVar, an.e eVar2, int i10) {
            if (g.this.g() && g.this.f8127x) {
                g.this.b();
            }
        }

        @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
        public void a(ad adVar, com.applovin.exoplayer2.j.h hVar) {
            an anVar = (an) com.applovin.exoplayer2.l.a.b(g.this.f8116m);
            ba baVarS = anVar.S();
            if (baVarS.d()) {
                this.f8132c = null;
            } else if (anVar.P().a()) {
                Object obj = this.f8132c;
                if (obj != null) {
                    int iC = baVarS.c(obj);
                    if (iC != -1) {
                        if (anVar.G() == baVarS.a(iC, this.f8131b).f4678c) {
                            return;
                        }
                    }
                    this.f8132c = null;
                }
            } else {
                this.f8132c = baVarS.a(anVar.F(), this.f8131b, true).f4677b;
            }
            g.this.c(false);
        }

        @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.m.n
        public void a(com.applovin.exoplayer2.m.o oVar) {
            g.this.h();
        }

        @Override // com.applovin.exoplayer2.an.d
        public void a(List<com.applovin.exoplayer2.i.a> list) {
            if (g.this.f8110g != null) {
                g.this.f8110g.setCues(list);
            }
        }

        @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
        public void b(int i10) {
            g.this.k();
            g.this.l();
            g.this.n();
        }

        @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
        public void b(boolean z10, int i10) {
            g.this.k();
            g.this.n();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            g.this.e();
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            g.b((TextureView) view, g.this.f8129z);
        }
    }

    public g(Context context) {
        this(context, null);
    }

    public g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(Context context, AttributeSet attributeSet, int i10) {
        int i11;
        boolean z10;
        int i12;
        boolean z11;
        int integer;
        boolean z12;
        int i13;
        int i14;
        boolean z13;
        boolean z14;
        int i15;
        boolean z15;
        boolean z16;
        boolean z17;
        int i16;
        boolean z18;
        super(context, attributeSet, i10);
        a aVar = new a();
        this.f8104a = aVar;
        if (isInEditMode()) {
            this.f8105b = null;
            this.f8106c = null;
            this.f8107d = null;
            this.f8108e = false;
            this.f8109f = null;
            this.f8110g = null;
            this.f8111h = null;
            this.f8112i = null;
            this.f8113j = null;
            this.f8114k = null;
            this.f8115l = null;
            ImageView imageView = new ImageView(context);
            if (ai.f7595a >= 23) {
                a(getResources(), imageView);
            } else {
                b(getResources(), imageView);
            }
            addView(imageView);
            return;
        }
        int i17 = R.layout.applovin_exo_player_view;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.AppLovinPlayerView, i10, 0);
            try {
                int i18 = R.styleable.AppLovinPlayerView_al_shutter_background_color;
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i18);
                int color = typedArrayObtainStyledAttributes.getColor(i18, 0);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.AppLovinPlayerView_al_player_layout_id, i17);
                boolean z19 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerView_al_use_artwork, true);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.AppLovinPlayerView_al_default_artwork, 0);
                boolean z20 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerView_al_use_controller, true);
                int i19 = typedArrayObtainStyledAttributes.getInt(R.styleable.AppLovinPlayerView_al_surface_type, 1);
                int i20 = typedArrayObtainStyledAttributes.getInt(R.styleable.AppLovinPlayerView_al_resize_mode, 0);
                int i21 = typedArrayObtainStyledAttributes.getInt(R.styleable.AppLovinPlayerView_al_show_timeout, Level.TRACE_INT);
                boolean z21 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerView_al_hide_on_touch, true);
                boolean z22 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerView_al_auto_show, true);
                integer = typedArrayObtainStyledAttributes.getInteger(R.styleable.AppLovinPlayerView_al_show_buffering, 0);
                this.f8122s = typedArrayObtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerView_al_keep_content_on_player_reset, this.f8122s);
                boolean z23 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerView_al_hide_during_ads, true);
                typedArrayObtainStyledAttributes.recycle();
                z12 = z21;
                z10 = z22;
                i12 = i20;
                z15 = z20;
                i15 = resourceId2;
                z14 = z19;
                z13 = zHasValue;
                i14 = color;
                i13 = i19;
                i17 = resourceId;
                i11 = i21;
                z11 = z23;
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i11 = 5000;
            z10 = true;
            i12 = 0;
            z11 = true;
            integer = 0;
            z12 = true;
            i13 = 1;
            i14 = 0;
            z13 = false;
            z14 = true;
            i15 = 0;
            z15 = true;
        }
        LayoutInflater.from(context).inflate(i17, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R.id.al_exo_content_frame);
        this.f8105b = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            a(aspectRatioFrameLayout, i12);
        }
        View viewFindViewById = findViewById(R.id.al_exo_shutter);
        this.f8106c = viewFindViewById;
        if (viewFindViewById != null && z13) {
            viewFindViewById.setBackgroundColor(i14);
        }
        if (aspectRatioFrameLayout == null || i13 == 0) {
            z16 = true;
            this.f8107d = null;
            z17 = false;
        } else {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i13 != 2) {
                if (i13 != 3) {
                    if (i13 != 4) {
                        this.f8107d = new SurfaceView(context);
                    } else {
                        try {
                            this.f8107d = (View) Class.forName("com.applovin.exoplayer2.m.i").getConstructor(Context.class).newInstance(context);
                        } catch (Exception e10) {
                            throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e10);
                        }
                    }
                    z16 = true;
                } else {
                    try {
                        z16 = true;
                        this.f8107d = (View) Class.forName("com.applovin.exoplayer2.m.a.i").getConstructor(Context.class).newInstance(context);
                        z18 = true;
                    } catch (Exception e11) {
                        throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e11);
                    }
                }
                this.f8107d.setLayoutParams(layoutParams);
                this.f8107d.setOnClickListener(aVar);
                this.f8107d.setClickable(false);
                aspectRatioFrameLayout.addView(this.f8107d, 0);
                z17 = z18;
            } else {
                z16 = true;
                this.f8107d = new TextureView(context);
            }
            z18 = false;
            this.f8107d.setLayoutParams(layoutParams);
            this.f8107d.setOnClickListener(aVar);
            this.f8107d.setClickable(false);
            aspectRatioFrameLayout.addView(this.f8107d, 0);
            z17 = z18;
        }
        this.f8108e = z17;
        this.f8114k = (FrameLayout) findViewById(R.id.al_exo_ad_overlay);
        this.f8115l = (FrameLayout) findViewById(R.id.al_exo_overlay);
        ImageView imageView2 = (ImageView) findViewById(R.id.al_exo_artwork);
        this.f8109f = imageView2;
        this.f8119p = (!z14 || imageView2 == null) ? false : z16;
        if (i15 != 0) {
            Context context2 = getContext();
            Object obj = e0.a.f28964a;
            this.f8120q = e0.a.c.b(context2, i15);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(R.id.al_exo_subtitles);
        this.f8110g = subtitleView;
        if (subtitleView != null) {
            subtitleView.d();
            subtitleView.c();
        }
        View viewFindViewById2 = findViewById(R.id.al_exo_buffering);
        this.f8111h = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.f8121r = integer;
        TextView textView = (TextView) findViewById(R.id.al_exo_error_message);
        this.f8112i = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        int i22 = R.id.al_exo_controller;
        f fVar = (f) findViewById(i22);
        View viewFindViewById3 = findViewById(R.id.al_exo_controller_placeholder);
        if (fVar != null) {
            this.f8113j = fVar;
            i16 = 0;
        } else if (viewFindViewById3 != null) {
            i16 = 0;
            f fVar2 = new f(context, null, 0, attributeSet);
            this.f8113j = fVar2;
            fVar2.setId(i22);
            fVar2.setLayoutParams(viewFindViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(fVar2, iIndexOfChild);
        } else {
            i16 = 0;
            this.f8113j = null;
        }
        f fVar3 = this.f8113j;
        this.f8125v = fVar3 != null ? i11 : i16;
        this.f8128y = z12;
        this.f8126w = z10;
        this.f8127x = z11;
        this.f8117n = (!z15 || fVar3 == null) ? i16 : z16;
        b();
        m();
        f fVar4 = this.f8113j;
        if (fVar4 != null) {
            fVar4.a(aVar);
        }
    }

    private static void a(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(R.drawable.applovin_exo_edit_mode_logo, null));
        imageView.setBackgroundColor(resources.getColor(R.color.al_exo_edit_mode_background_color, null));
    }

    private static void a(AspectRatioFrameLayout aspectRatioFrameLayout, int i10) {
        aspectRatioFrameLayout.setResizeMode(i10);
    }

    private void a(boolean z10) {
        if (!(g() && this.f8127x) && c()) {
            boolean z11 = this.f8113j.c() && this.f8113j.getShowTimeoutMs() <= 0;
            boolean zF = f();
            if (z10 || z11 || zF) {
                b(zF);
            }
        }
    }

    @SuppressLint({"InlinedApi"})
    private boolean a(int i10) {
        return i10 == 19 || i10 == 270 || i10 == 22 || i10 == 271 || i10 == 20 || i10 == 269 || i10 == 21 || i10 == 268 || i10 == 23;
    }

    private boolean a(Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                a(this.f8105b, intrinsicWidth / intrinsicHeight);
                this.f8109f.setImageDrawable(drawable);
                this.f8109f.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    private boolean a(ac acVar) {
        byte[] bArr = acVar.f4123l;
        if (bArr == null) {
            return false;
        }
        return a(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
    }

    private static void b(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(R.drawable.applovin_exo_edit_mode_logo));
        imageView.setBackgroundColor(resources.getColor(R.color.al_exo_edit_mode_background_color));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(TextureView textureView, int i10) {
        Matrix matrix = new Matrix();
        float width = textureView.getWidth();
        float height = textureView.getHeight();
        if (width != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && height != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && i10 != 0) {
            float f10 = width / 2.0f;
            float f11 = height / 2.0f;
            matrix.postRotate(i10, f10, f11);
            RectF rectF = new RectF(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, width, height);
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f10, f11);
        }
        textureView.setTransform(matrix);
    }

    private void b(boolean z10) {
        if (c()) {
            this.f8113j.setShowTimeoutMs(z10 ? 0 : this.f8125v);
            this.f8113j.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z10) {
        an anVar = this.f8116m;
        if (anVar == null || anVar.P().a()) {
            if (this.f8122s) {
                return;
            }
            i();
            j();
            return;
        }
        if (z10 && !this.f8122s) {
            j();
        }
        com.applovin.exoplayer2.j.h hVarQ = anVar.Q();
        for (int i10 = 0; i10 < hVarQ.f7265a; i10++) {
            com.applovin.exoplayer2.j.g gVarA = hVarQ.a(i10);
            if (gVarA != null) {
                for (int i11 = 0; i11 < gVarA.e(); i11++) {
                    if (u.e(gVarA.a(i11).f8198l) == 2) {
                        i();
                        return;
                    }
                }
            }
        }
        j();
        if (d() && (a(anVar.R()) || a(this.f8120q))) {
            return;
        }
        i();
    }

    private boolean c() {
        if (!this.f8117n) {
            return false;
        }
        com.applovin.exoplayer2.l.a.a(this.f8113j);
        return true;
    }

    private boolean d() {
        if (!this.f8119p) {
            return false;
        }
        com.applovin.exoplayer2.l.a.a(this.f8109f);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e() {
        if (!c() || this.f8116m == null) {
            return false;
        }
        if (!this.f8113j.c()) {
            a(true);
        } else if (this.f8128y) {
            this.f8113j.b();
        }
        return true;
    }

    private boolean f() {
        an anVar = this.f8116m;
        if (anVar == null) {
            return true;
        }
        int iT = anVar.t();
        return this.f8126w && (iT == 1 || iT == 4 || !this.f8116m.x());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        an anVar = this.f8116m;
        return anVar != null && anVar.K() && this.f8116m.x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        an anVar = this.f8116m;
        com.applovin.exoplayer2.m.o oVarT = anVar != null ? anVar.T() : com.applovin.exoplayer2.m.o.f7878a;
        int i10 = oVarT.f7880b;
        int i11 = oVarT.f7881c;
        int i12 = oVarT.f7882d;
        float f10 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        float f11 = (i11 == 0 || i10 == 0) ? 0.0f : (i10 * oVarT.f7883e) / i11;
        View view = this.f8107d;
        if (view instanceof TextureView) {
            if (f11 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && (i12 == 90 || i12 == 270)) {
                f11 = 1.0f / f11;
            }
            if (this.f8129z != 0) {
                view.removeOnLayoutChangeListener(this.f8104a);
            }
            this.f8129z = i12;
            if (i12 != 0) {
                this.f8107d.addOnLayoutChangeListener(this.f8104a);
            }
            b((TextureView) this.f8107d, this.f8129z);
        }
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f8105b;
        if (!this.f8108e) {
            f10 = f11;
        }
        a(aspectRatioFrameLayout, f10);
    }

    private void i() {
        ImageView imageView = this.f8109f;
        if (imageView != null) {
            imageView.setImageResource(android.R.color.transparent);
            this.f8109f.setVisibility(4);
        }
    }

    private void j() {
        View view = this.f8106c;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        int i10;
        if (this.f8111h != null) {
            an anVar = this.f8116m;
            boolean z10 = true;
            if (anVar == null || anVar.t() != 2 || ((i10 = this.f8121r) != 2 && (i10 != 1 || !this.f8116m.x()))) {
                z10 = false;
            }
            this.f8111h.setVisibility(z10 ? 0 : 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        com.applovin.exoplayer2.l.k<? super ak> kVar;
        TextView textView = this.f8112i;
        if (textView != null) {
            CharSequence charSequence = this.f8124u;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.f8112i.setVisibility(0);
                return;
            }
            an anVar = this.f8116m;
            ak akVarE = anVar != null ? anVar.e() : null;
            if (akVarE == null || (kVar = this.f8123t) == null) {
                this.f8112i.setVisibility(8);
            } else {
                this.f8112i.setText((CharSequence) kVar.a(akVarE).second);
                this.f8112i.setVisibility(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        f fVar = this.f8113j;
        String string = null;
        if (fVar != null && this.f8117n) {
            if (fVar.getVisibility() != 0) {
                setContentDescription(getResources().getString(R.string.al_exo_controls_show));
                return;
            } else if (this.f8128y) {
                string = getResources().getString(R.string.al_exo_controls_hide);
            }
        }
        setContentDescription(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        if (g() && this.f8127x) {
            b();
        } else {
            a(false);
        }
    }

    public void a() {
        b(f());
    }

    public void a(AspectRatioFrameLayout aspectRatioFrameLayout, float f10) {
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f10);
        }
    }

    public boolean a(KeyEvent keyEvent) {
        return c() && this.f8113j.a(keyEvent);
    }

    public void b() {
        f fVar = this.f8113j;
        if (fVar != null) {
            fVar.b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        an anVar = this.f8116m;
        if (anVar != null && anVar.K()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean zA = a(keyEvent.getKeyCode());
        if ((zA && c() && !this.f8113j.c()) || a(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            a(true);
            return true;
        }
        if (!zA || !c()) {
            return false;
        }
        a(true);
        return false;
    }

    public List<com.applovin.exoplayer2.ui.a> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f8115l;
        if (frameLayout != null) {
            arrayList.add(new com.applovin.exoplayer2.ui.a(frameLayout, 3, "Transparent overlay does not impact viewability"));
        }
        f fVar = this.f8113j;
        if (fVar != null) {
            arrayList.add(new com.applovin.exoplayer2.ui.a(fVar, 0));
        }
        return s.a((Collection) arrayList);
    }

    public ViewGroup getAdViewGroup() {
        return (ViewGroup) com.applovin.exoplayer2.l.a.a(this.f8114k, "exo_ad_overlay must be present for ad playback");
    }

    public boolean getControllerAutoShow() {
        return this.f8126w;
    }

    public boolean getControllerHideOnTouch() {
        return this.f8128y;
    }

    public int getControllerShowTimeoutMs() {
        return this.f8125v;
    }

    public Drawable getDefaultArtwork() {
        return this.f8120q;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.f8115l;
    }

    public an getPlayer() {
        return this.f8116m;
    }

    public int getResizeMode() {
        com.applovin.exoplayer2.l.a.a(this.f8105b);
        return this.f8105b.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.f8110g;
    }

    public boolean getUseArtwork() {
        return this.f8119p;
    }

    public boolean getUseController() {
        return this.f8117n;
    }

    public View getVideoSurfaceView() {
        return this.f8107d;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!c() || this.f8116m == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.A = true;
            return true;
        }
        if (action != 1 || !this.A) {
            return false;
        }
        this.A = false;
        performClick();
        return true;
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!c() || this.f8116m == null) {
            return false;
        }
        a(true);
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        super.performClick();
        return e();
    }

    public void setAspectRatioListener(AspectRatioFrameLayout.a aVar) {
        com.applovin.exoplayer2.l.a.a(this.f8105b);
        this.f8105b.setAspectRatioListener(aVar);
    }

    @Deprecated
    public void setControlDispatcher(com.applovin.exoplayer2.i iVar) {
        com.applovin.exoplayer2.l.a.a(this.f8113j);
        this.f8113j.setControlDispatcher(iVar);
    }

    public void setControllerAutoShow(boolean z10) {
        this.f8126w = z10;
    }

    public void setControllerHideDuringAds(boolean z10) {
        this.f8127x = z10;
    }

    public void setControllerHideOnTouch(boolean z10) {
        com.applovin.exoplayer2.l.a.a(this.f8113j);
        this.f8128y = z10;
        m();
    }

    public void setControllerShowTimeoutMs(int i10) {
        com.applovin.exoplayer2.l.a.a(this.f8113j);
        this.f8125v = i10;
        if (this.f8113j.c()) {
            a();
        }
    }

    public void setControllerVisibilityListener(f.d dVar) {
        com.applovin.exoplayer2.l.a.a(this.f8113j);
        f.d dVar2 = this.f8118o;
        if (dVar2 == dVar) {
            return;
        }
        if (dVar2 != null) {
            this.f8113j.b(dVar2);
        }
        this.f8118o = dVar;
        if (dVar != null) {
            this.f8113j.a(dVar);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        com.applovin.exoplayer2.l.a.b(this.f8112i != null);
        this.f8124u = charSequence;
        l();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.f8120q != drawable) {
            this.f8120q = drawable;
            c(false);
        }
    }

    public void setErrorMessageProvider(com.applovin.exoplayer2.l.k<? super ak> kVar) {
        if (this.f8123t != kVar) {
            this.f8123t = kVar;
            l();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z10) {
        if (this.f8122s != z10) {
            this.f8122s = z10;
            c(false);
        }
    }

    public void setPlayer(an anVar) {
        com.applovin.exoplayer2.l.a.b(Looper.myLooper() == Looper.getMainLooper());
        com.applovin.exoplayer2.l.a.a(anVar == null || anVar.r() == Looper.getMainLooper());
        an anVar2 = this.f8116m;
        if (anVar2 == anVar) {
            return;
        }
        if (anVar2 != null) {
            anVar2.b(this.f8104a);
            if (anVar2.a(26)) {
                View view = this.f8107d;
                if (view instanceof TextureView) {
                    anVar2.b((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    anVar2.b((SurfaceView) view);
                }
            }
        }
        SubtitleView subtitleView = this.f8110g;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.f8116m = anVar;
        if (c()) {
            this.f8113j.setPlayer(anVar);
        }
        k();
        l();
        c(true);
        if (anVar == null) {
            b();
            return;
        }
        if (anVar.a(26)) {
            View view2 = this.f8107d;
            if (view2 instanceof TextureView) {
                anVar.a((TextureView) view2);
            } else if (view2 instanceof SurfaceView) {
                anVar.a((SurfaceView) view2);
            }
            h();
        }
        if (this.f8110g != null && anVar.a(27)) {
            this.f8110g.setCues(anVar.V());
        }
        anVar.a(this.f8104a);
        a(false);
    }

    public void setRepeatToggleModes(int i10) {
        com.applovin.exoplayer2.l.a.a(this.f8113j);
        this.f8113j.setRepeatToggleModes(i10);
    }

    public void setResizeMode(int i10) {
        com.applovin.exoplayer2.l.a.a(this.f8105b);
        this.f8105b.setResizeMode(i10);
    }

    public void setShowBuffering(int i10) {
        if (this.f8121r != i10) {
            this.f8121r = i10;
            k();
        }
    }

    public void setShowFastForwardButton(boolean z10) {
        com.applovin.exoplayer2.l.a.a(this.f8113j);
        this.f8113j.setShowFastForwardButton(z10);
    }

    public void setShowMultiWindowTimeBar(boolean z10) {
        com.applovin.exoplayer2.l.a.a(this.f8113j);
        this.f8113j.setShowMultiWindowTimeBar(z10);
    }

    public void setShowNextButton(boolean z10) {
        com.applovin.exoplayer2.l.a.a(this.f8113j);
        this.f8113j.setShowNextButton(z10);
    }

    public void setShowPreviousButton(boolean z10) {
        com.applovin.exoplayer2.l.a.a(this.f8113j);
        this.f8113j.setShowPreviousButton(z10);
    }

    public void setShowRewindButton(boolean z10) {
        com.applovin.exoplayer2.l.a.a(this.f8113j);
        this.f8113j.setShowRewindButton(z10);
    }

    public void setShowShuffleButton(boolean z10) {
        com.applovin.exoplayer2.l.a.a(this.f8113j);
        this.f8113j.setShowShuffleButton(z10);
    }

    public void setShutterBackgroundColor(int i10) {
        View view = this.f8106c;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    public void setUseArtwork(boolean z10) {
        com.applovin.exoplayer2.l.a.b((z10 && this.f8109f == null) ? false : true);
        if (this.f8119p != z10) {
            this.f8119p = z10;
            c(false);
        }
    }

    public void setUseController(boolean z10) {
        f fVar;
        an anVar;
        com.applovin.exoplayer2.l.a.b((z10 && this.f8113j == null) ? false : true);
        if (this.f8117n == z10) {
            return;
        }
        this.f8117n = z10;
        if (!c()) {
            f fVar2 = this.f8113j;
            if (fVar2 != null) {
                fVar2.b();
                fVar = this.f8113j;
                anVar = null;
            }
            m();
        }
        fVar = this.f8113j;
        anVar = this.f8116m;
        fVar.setPlayer(anVar);
        m();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        View view = this.f8107d;
        if (view instanceof SurfaceView) {
            view.setVisibility(i10);
        }
    }
}
