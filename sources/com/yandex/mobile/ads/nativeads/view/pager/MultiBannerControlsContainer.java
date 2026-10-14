package com.yandex.mobile.ads.nativeads.view.pager;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.i01;
import com.yandex.mobile.ads.impl.nz0;
import com.yandex.mobile.ads.impl.rq;
import com.yandex.mobile.ads.impl.vr;
import com.yandex.mobile.ads.impl.zy0;
import fd.j0;
import java.util.Objects;
import jc.e;
import jc.f;
import vc.l;

/* JADX INFO: loaded from: classes3.dex */
public final class MultiBannerControlsContainer extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rq f27981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zy0 f27982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f27983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final vr f27984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f27985e;

    public static final class a extends l implements uc.a<Boolean> {
        public a() {
            super(0);
        }

        @Override // uc.a
        public final Boolean invoke() {
            nz0 nz0VarA = i01.b().a(MultiBannerControlsContainer.this.getContext());
            return Boolean.valueOf((nz0VarA == null || nz0VarA.Q()) ? false : true);
        }
    }

    public static final class b extends ViewPager2.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewPager2 f27987a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MultiBannerControlsContainer f27988b;

        public b(ViewPager2 viewPager2, MultiBannerControlsContainer multiBannerControlsContainer) {
            this.f27987a = viewPager2;
            this.f27988b = multiBannerControlsContainer;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void onPageSelected(int i10) {
            RecyclerView.g adapter = this.f27987a.getAdapter();
            this.f27988b.a(i10, adapter != null ? adapter.getItemCount() : 0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiBannerControlsContainer(Context context) {
        super(context);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.f27981a = new rq();
        this.f27982b = new zy0();
        this.f27983c = f.b(new a());
        this.f27984d = new vr();
        this.f27985e = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiBannerControlsContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.f27981a = new rq();
        this.f27982b = new zy0();
        this.f27983c = f.b(new a());
        this.f27984d = new vr();
        this.f27985e = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiBannerControlsContainer(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.f27981a = new rq();
        this.f27982b = new zy0();
        this.f27983c = f.b(new a());
        this.f27984d = new vr();
        this.f27985e = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiBannerControlsContainer(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.f27981a = new rq();
        this.f27982b = new zy0();
        this.f27983c = f.b(new a());
        this.f27984d = new vr();
        this.f27985e = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00aa, code lost:
    
        if (r9 == r10) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r9, int r10) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.nativeads.view.pager.MultiBannerControlsContainer.a(int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(MultiBannerControlsContainer multiBannerControlsContainer, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        j0.i(multiBannerControlsContainer, "this$0");
        if (view instanceof ViewPager2) {
            boolean z10 = multiBannerControlsContainer.f27985e;
            boolean zA = multiBannerControlsContainer.f27984d.a(view, i10, i11, i12, i13);
            multiBannerControlsContainer.f27985e = zA;
            if (zA != z10) {
                ViewPager2 viewPager2 = (ViewPager2) view;
                int currentItem = viewPager2.getCurrentItem();
                RecyclerView.g adapter = viewPager2.getAdapter();
                multiBannerControlsContainer.a(currentItem, adapter != null ? adapter.getItemCount() : 0);
            }
        }
    }

    public final void a(ViewPager2 viewPager2) {
        j0.i(viewPager2, "viewPager");
        viewPager2.f3011e.f3049a.add(new b(viewPager2, this));
        viewPager2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.mobile.ads.nativeads.view.pager.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                MultiBannerControlsContainer.a(this.f27989c, view, i10, i11, i12, i13, i14, i15, i16, i17);
            }
        });
    }

    public final void setOnClickLeftButtonListener(View.OnClickListener onClickListener) {
        j0.i(onClickListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        zy0 zy0Var = this.f27982b;
        View viewFindViewById = findViewById(R.id.left_scroll_control_button);
        Objects.requireNonNull(zy0Var);
        ImageView imageView = (ImageView) zy0.a(ImageView.class, viewFindViewById);
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        }
    }

    public final void setOnClickRightButtonListener(View.OnClickListener onClickListener) {
        j0.i(onClickListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        zy0 zy0Var = this.f27982b;
        View viewFindViewById = findViewById(R.id.right_scroll_control_button);
        Objects.requireNonNull(zy0Var);
        ImageView imageView = (ImageView) zy0.a(ImageView.class, viewFindViewById);
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        }
    }
}
